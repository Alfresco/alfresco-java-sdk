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

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.auth.BasicAuthRequestInterceptor;
import java.util.ArrayList;
import java.util.List;
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
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.OAuth2AccessToken;

@Configuration
@EnableConfigurationProperties({OAuth2ClientProperties.class})
public class ClientConfiguration {

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

  @Configuration
  @ConditionalOnProperty("spring.security.oauth2.client.registration.alfresco-rest-api.provider")
  protected static class OAuth2Configuration {

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
    public OAuth2AuthorizedClientManager authorizedClientManager(final ClientRegistrationRepository clientRegistrationRepository,
          final OAuth2AuthorizedClientService authorizedClientService) {
      return new AuthorizedClientServiceOAuth2AuthorizedClientManager(clientRegistrationRepository, authorizedClientService);
    }

    @Bean
    public OAuth2FeignRequestInterceptor requestInterceptor(OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager) {
      return new OAuth2FeignRequestInterceptor(oAuth2AuthorizedClientManager,
              OAuth2AuthorizeRequest.withClientRegistrationId("alfresco-rest-api")
                      .principal(new AnonymousAuthenticationToken("feignClient", "feignClient", AuthorityUtils.createAuthorityList("ROLE_ANONYMOUS")))
                      .build());
    }

    public class OAuth2FeignRequestInterceptor implements RequestInterceptor {

      private final OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager;
      private final OAuth2AuthorizeRequest oAuth2AuthorizeRequest;

      public OAuth2FeignRequestInterceptor(OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager, OAuth2AuthorizeRequest oAuth2AuthorizeRequest) {
        this.oAuth2AuthorizedClientManager = oAuth2AuthorizedClientManager;
        this.oAuth2AuthorizeRequest = oAuth2AuthorizeRequest;
      }

      @Override
      public void apply(RequestTemplate template) {
        template.header(AUTHORIZATION,getAuthorizationToken());
      }

      private String getAuthorizationToken() {
        final OAuth2AccessToken accessToken = oAuth2AuthorizedClientManager.authorize(oAuth2AuthorizeRequest).getAccessToken();
        return String.format("%s %s", accessToken.getTokenType().getValue(), accessToken.getTokenValue());
      }
    }
  }
}
