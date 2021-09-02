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
package io.swagger.configuration;

import feign.auth.BasicAuthRequestInterceptor;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.rest.sdk.feign.DelegatedAuthenticationProvider;
import org.alfresco.rest.sdk.feign.DelegatedAuthenticationRequestInterceptor;
import org.alfresco.rest.sdk.feign.oauth2.OAuth2FeignRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientPropertiesRegistrationAdapter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.client.AuthorizedClientServiceOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.InMemoryOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.OAuth2AuthorizationContext;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProvider;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProviderBuilder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;

/**
 * Feign client Spring configuration that provides support for different authentication methods. Currently, supported methods are:
 * <ul>
 *     <li>Basic Authentication</li>
 *     <li>OAuth2 - Client credentials flow</li>
 *     <li>OAuth2 - Password flow</li>
 *     <li>Delegated (external) authentication</li>
 * </ul>
 */
@Configuration
@EnableConfigurationProperties({OAuth2ClientProperties.class})
public class ClientConfiguration {

    /**
     * Configuration for basic authentication. It configures a {@link BasicAuthRequestInterceptor} that uses the credentials configured in the properties
     * <code>content.service.security.basicAuth.username</code> and <code>content.service.security.basicAuth.password</code>.
     */
    @Configuration
    @ConditionalOnProperty("content.service.security.basicAuth.username")
    protected static class BasicAuthConfiguration {

        @Value("${content.service.security.basicAuth.username:#{null}}")
        private String basicAuthUsername;
        @Value("${content.service.security.basicAuth.password:#{null}}")
        private String basicAuthPassword;

        @Bean
        @ConditionalOnProperty("content.service.security.basicAuth.username")
        public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
            return new BasicAuthRequestInterceptor(this.basicAuthUsername, this.basicAuthPassword);
        }
    }

    /**
     * Configuration for OAuth2 authentication flows. It configures a {@link OAuth2FeignRequestInterceptor} that retrieves the access token and generates the
     * authorization header with the bearer. This is based in the OAuth2 support provided by the Spring Security module. So, the configuration must be done
     * using the corresponding properties. The configuration of the client must be done using the properties
     * <code>spring.security.oauth2.client.registration.alfresco-rest-api.xxxx</code>.
     */
    @Configuration
    @ConditionalOnProperty("spring.security.oauth2.client.registration.alfresco-rest-api.provider")
    protected static class OAuth2Configuration {

        private static final String OAUTH2_CLIENT_REGISTRATION_ID = "alfresco-rest-api";

        @Value("${spring.security.oauth2.client.registration.alfresco-rest-api.username:#{null}}")
        private String oAuth2Username;
        @Value("${spring.security.oauth2.client.registration.alfresco-rest-api.password:#{null}}")
        private String oAuth2Password;

        @Bean
        @ConditionalOnMissingBean({ClientRegistrationRepository.class})
        public InMemoryClientRegistrationRepository clientRegistrationRepository(OAuth2ClientProperties properties) {
            List<ClientRegistration> registrations = new ArrayList(OAuth2ClientPropertiesRegistrationAdapter.getClientRegistrations(properties).values());
            return new InMemoryClientRegistrationRepository(registrations);
        }

        @Bean
        @ConditionalOnMissingBean({OAuth2AuthorizedClientService.class})
        public InMemoryOAuth2AuthorizedClientService authorizedClientService(ClientRegistrationRepository clientRegistrationRepository) {
            return new InMemoryOAuth2AuthorizedClientService(clientRegistrationRepository);
        }

        @Bean
        @ConditionalOnMissingBean
        public OAuth2AuthorizedClientProvider oAuth2AuthorizedClientProvider() {
            return OAuth2AuthorizedClientProviderBuilder.builder()
                    .clientCredentials()
                    .password()
                    .build();
        }

        @Bean
        @ConditionalOnMissingBean
        public OAuth2AuthorizedClientManager authorizedClientManager(final ClientRegistrationRepository clientRegistrationRepository,
                final OAuth2AuthorizedClientService authorizedClientService, OAuth2AuthorizedClientProvider oAuth2AuthorizedClientProvider) {
            AuthorizedClientServiceOAuth2AuthorizedClientManager authorizedClientServiceOAuth2AuthorizedClientManager =
                    new AuthorizedClientServiceOAuth2AuthorizedClientManager(clientRegistrationRepository, authorizedClientService);
            authorizedClientServiceOAuth2AuthorizedClientManager.setAuthorizedClientProvider(oAuth2AuthorizedClientProvider);
            authorizedClientServiceOAuth2AuthorizedClientManager.setContextAttributesMapper(OAuth2AuthorizeRequest::getAttributes);
            return authorizedClientServiceOAuth2AuthorizedClientManager;
        }

        @Bean
        public OAuth2AuthorizeRequest oAuth2AuthorizeRequest() {
            return OAuth2AuthorizeRequest.withClientRegistrationId(OAUTH2_CLIENT_REGISTRATION_ID)
                    .principal(new AnonymousAuthenticationToken("feignClient", "feignClient",
                            AuthorityUtils.createAuthorityList("ROLE_ANONYMOUS")))
                    .attribute(OAuth2AuthorizationContext.USERNAME_ATTRIBUTE_NAME, oAuth2Username)
                    .attribute(OAuth2AuthorizationContext.PASSWORD_ATTRIBUTE_NAME, oAuth2Password)
                    .build();
        }

        @Bean
        public OAuth2FeignRequestInterceptor requestInterceptor(OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager,
                OAuth2AuthorizeRequest oAuth2AuthorizeRequest) {
            return new OAuth2FeignRequestInterceptor(oAuth2AuthorizedClientManager, oAuth2AuthorizeRequest);
        }
    }

    /**
     * Configuration for external delegated authentication mechanism. This must be provided by the integrator of the SDK in the form of a bean that implements
     * the interface {@link DelegatedAuthenticationRequestInterceptor}. This authentication method is enabled via the property
     * <code>content.service.security.delegated</code>.
     */
    @Configuration
    @ConditionalOnProperty("content.service.security.delegated")
    protected static class DelegatedAuthenticationConfiguration {

        @Bean
        public DelegatedAuthenticationRequestInterceptor delegatedAuthenticationRequestInterceptor(DelegatedAuthenticationProvider
                delegatedAuthenticationProvider) {
            return new DelegatedAuthenticationRequestInterceptor(delegatedAuthenticationProvider);
        }
    }
}
