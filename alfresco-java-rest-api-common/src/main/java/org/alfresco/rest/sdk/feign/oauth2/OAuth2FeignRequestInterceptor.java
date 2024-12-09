/*
 * Copyright 2021-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.alfresco.rest.sdk.feign.oauth2;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.OAuth2RefreshToken;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * Feign {@link RequestInterceptor} that makes use of the OAuth2 support classes from Spring Security to obtain an access token and add the corresponding
 * authorization header to the feign request.
 */
public class OAuth2FeignRequestInterceptor implements RequestInterceptor
{
    private static final Logger LOGGER = LoggerFactory.getLogger(OAuth2FeignRequestInterceptor.class);
    private static final String AUTH_HEADER_FORMAT = "%s %s";
    private static final String REFRESH_TOKEN_ATTRIBUTE_NAME = "refresh_token";

    private final OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager;
    private final OAuth2AuthorizeRequest oAuth2AuthorizeRequest;
    private final OAuth2AuthorizedClientService authorizedClientService;

    /**
     * Constructor.
     *
     * @param oAuth2AuthorizedClientManager given {@link OAuth2AuthorizedClientManager}
     * @param oAuth2AuthorizeRequest        given {@link OAuth2AuthorizeRequest}
     * @param authorizedClientService       given {@link OAuth2AuthorizedClientService}
     */
    public OAuth2FeignRequestInterceptor(OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager,
                                         OAuth2AuthorizeRequest oAuth2AuthorizeRequest,
                                         OAuth2AuthorizedClientService authorizedClientService)
    {
        this.oAuth2AuthorizedClientManager = oAuth2AuthorizedClientManager;
        this.oAuth2AuthorizeRequest = oAuth2AuthorizeRequest;
        this.authorizedClientService = authorizedClientService;
    }

    @Override
    public void apply(RequestTemplate template)
    {
        LOGGER.debug("Applying OAuth2 authentication to feign request template {}", template);
        template.header(AUTHORIZATION, getAuthorizationToken());
    }

    /**
     * Retrieves the authorization token. Checks if the access token is valid and refreshes it if expired.
     * If no token exists, it will trigger the first-time authorization flow.
     *
     * @return the formatted authorization token string
     */
    private String getAuthorizationToken()
    {
        OAuth2AuthorizedClient client = getAuthorizedClient();
        OAuth2AccessToken accessToken;
        if (client != null && client.getAccessToken() != null)
        {
            accessToken = client.getAccessToken();

            // Check if the access token has expired
            if (isAccessTokenExpired(accessToken))
            {
                LOGGER.info("Access token expired. Attempting to refresh...");
                // Try to refresh the access token using the refresh token
                client = refreshAccessToken(client);
                accessToken = client.getAccessToken();
            }
        }
        else
        {
            // If no token is found, we need to initiate the first-time authorization flow
            LOGGER.info("Authorized Client not found. Initiating OAuth2 authorization flow...");
            client = startAuthorizationFlow();
            accessToken = client.getAccessToken();
        }
        return String.format(AUTH_HEADER_FORMAT, accessToken.getTokenType()
                    .getValue(), accessToken.getTokenValue());
    }

    /**
     * Starts the OAuth2 authorization flow (this might involve redirecting the user).
     * This method can trigger the OAuth2 flow to get a new access and refresh token.
     */
    private OAuth2AuthorizedClient startAuthorizationFlow()
    {
        OAuth2AuthorizedClient client = null;
        try
        {
            // Triggering the authorization flow
            client = oAuth2AuthorizedClientManager.authorize(oAuth2AuthorizeRequest);
        }
        catch (Exception e)
        {
            LOGGER.error("Error initiating OAuth2 authorization flow.", e);
        }
        return client;
    }

    /**
     * Retrieves the authorized client using the client registration ID and principal.
     *
     * @return the OAuth2AuthorizedClient if found, otherwise null
     */
    private OAuth2AuthorizedClient getAuthorizedClient()
    {
        try
        {
            return authorizedClientService.loadAuthorizedClient(oAuth2AuthorizeRequest.getClientRegistrationId(),
                                                                oAuth2AuthorizeRequest.getPrincipal()
                                                                            .getName());
        }
        catch (Exception e)
        {
            LOGGER.error("Error loading OAuth2AuthorizedClient.", e);
            return null;
        }
    }

    /**
     * Check if the access token is expired.
     *
     * @param accessToken the access token to check
     * @return true if the access token is expired, false otherwise
     */
    private boolean isAccessTokenExpired(OAuth2AccessToken accessToken)
    {
        // Token is considered expired if no expiry date is set
        return accessToken.getExpiresAt() == null || accessToken.getExpiresAt()
                    .isBefore(Instant.now());
    }

    /**
     * Refresh the OAuth2 access token using the refresh token.
     *
     * @param client the OAuth2AuthorizedClient to refresh
     * @return the refreshed OAuth2AuthorizedClient
     */
    private OAuth2AuthorizedClient refreshAccessToken(OAuth2AuthorizedClient client)
    {
        try
        {
            OAuth2RefreshToken refreshToken = client.getRefreshToken();
            if (refreshToken == null)
            {
                LOGGER.error("No refresh token available.");
            }

            // Create a new authorize request for refreshing the token
            OAuth2AuthorizeRequest refreshRequest = OAuth2AuthorizeRequest.withClientRegistrationId(
                                    client.getClientRegistration()
                                                .getRegistrationId())
                        .principal(oAuth2AuthorizeRequest.getPrincipal())
                        .attribute(REFRESH_TOKEN_ATTRIBUTE_NAME, refreshToken)
                        .build();

            // Refresh the token using the OAuth2AuthorizedClientManager
            OAuth2AuthorizedClient refreshedClient = oAuth2AuthorizedClientManager.authorize(refreshRequest);

            if (refreshedClient != null && refreshedClient.getAccessToken() != null)
            {
                LOGGER.info("Access token successfully refreshed.");
                return refreshedClient;
            }
            else
            {
                LOGGER.error("Failed to refresh access token.");
                return client; // Return the original client if refresh fails
            }

        }
        catch (Exception e)
        {
            LOGGER.error("Error refreshing access token." + e.getLocalizedMessage());
            // Triggering the authorization flow for new access token
            return startAuthorizationFlow();
        }
    }
}
