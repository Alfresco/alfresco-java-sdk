package io.swagger.configuration;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;

@Configuration
@EnableConfigurationProperties
public class ClientConfiguration {

  @Value("${alfrescoInsightEngineREST_.security.basicAuth.username:}")
  private String basicAuthUsername;

  @Value("${alfrescoInsightEngineREST_.security.basicAuth.password:}")
  private String basicAuthPassword;

  @Bean
  @ConditionalOnProperty(name = "alfrescoInsightEngineREST_.security.basicAuth.username")
  public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
    return new BasicAuthRequestInterceptor(this.basicAuthUsername, this.basicAuthPassword);
  }

}
