package org.alfresco.rest.sdk.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AlfrescoRestApiProperties.class)
public class AlfrescoRestApiAutoConfiguration {

}
