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

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.core.OAuth2AccessToken;

/**
 * Feign {@link RequestInterceptor} that makes use of the OAuth2 support classes from Spring Security to obtain an access token and add the corresponding
 * authorization header to the feign request.
 */
public class OAuth2FeignRequestInterceptor implements RequestInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(OAuth2FeignRequestInterceptor.class);
    private static final String AUTH_HEADER_FORMAT = "%s %s";

    private final OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager;
    private final OAuth2AuthorizeRequest oAuth2AuthorizeRequest;

    /**
     * Constructor.
     *
     * @param oAuth2AuthorizedClientManager given {@link OAuth2AuthorizedClientManager}
     * @param oAuth2AuthorizeRequest        given {@link OAuth2AuthorizeRequest}
     */
    public OAuth2FeignRequestInterceptor(OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager, OAuth2AuthorizeRequest oAuth2AuthorizeRequest) {
        this.oAuth2AuthorizedClientManager = oAuth2AuthorizedClientManager;
        this.oAuth2AuthorizeRequest = oAuth2AuthorizeRequest;
    }

    @Override
    public void apply(RequestTemplate template) {
        LOGGER.debug("Applying OAuth2 authentication to feign request template {}", template);
        template.header(AUTHORIZATION, getAuthorizationToken());
    }

    private String getAuthorizationToken() {
        final OAuth2AccessToken accessToken = oAuth2AuthorizedClientManager.authorize(oAuth2AuthorizeRequest).getAccessToken();
        return String.format(AUTH_HEADER_FORMAT, accessToken.getTokenType().getValue(), accessToken.getTokenValue());
    }
}
