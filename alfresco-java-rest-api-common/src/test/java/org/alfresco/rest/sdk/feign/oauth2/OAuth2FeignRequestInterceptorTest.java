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

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;

import feign.RequestTemplate;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken.TokenType;

/**
 * Unit tests for {@link OAuth2FeignRequestInterceptor}.
 */
public class OAuth2FeignRequestInterceptorTest {

    private static final String TEST_TOKEN_VALUE = "test";

    @Mock
    private OAuth2AuthorizedClientManager mockOAuth2AuthorizedClientManager;
    @Mock
    private OAuth2AuthorizedClient mockOAuth2AuthorizedClient;

    private OAuth2AuthorizeRequest oAuth2AuthorizeRequest;

    private OAuth2FeignRequestInterceptor oAuth2FeignRequestInterceptor;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
        oAuth2AuthorizeRequest = OAuth2AuthorizeRequest.withClientRegistrationId("test")
            .principal(new AnonymousAuthenticationToken("feignClient", "feignClient", AuthorityUtils
                .createAuthorityList(new String[]{"ROLE_ANONYMOUS"}))).build();
        oAuth2FeignRequestInterceptor = new OAuth2FeignRequestInterceptor(mockOAuth2AuthorizedClientManager, oAuth2AuthorizeRequest);
    }

    @Test
    public void should_addOAuthAuthorizationHeader_when_interceptorIsApplied() {
        given(mockOAuth2AuthorizedClientManager.authorize(oAuth2AuthorizeRequest)).willReturn(mockOAuth2AuthorizedClient);
        OAuth2AccessToken oAuth2AccessToken = new OAuth2AccessToken(TokenType.BEARER, TEST_TOKEN_VALUE, null, null);
        given(mockOAuth2AuthorizedClient.getAccessToken()).willReturn(oAuth2AccessToken);
        RequestTemplate requestTemplate = new RequestTemplate();

        oAuth2FeignRequestInterceptor.apply(requestTemplate);

        Collection<String> authCollection = requestTemplate.headers().get(AUTHORIZATION);
        assertThat(authCollection).hasSize(1);
        assertThat(authCollection).containsOnly("Bearer test");
    }
}
