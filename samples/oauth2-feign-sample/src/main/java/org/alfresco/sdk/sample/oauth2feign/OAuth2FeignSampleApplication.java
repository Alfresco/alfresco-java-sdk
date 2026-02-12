package org.alfresco.sdk.sample.oauth2feign;

import java.util.Map;

import org.alfresco.rest.sdk.feign.config.OAuth2Configuration;
import org.alfresco.sdk.sample.oauth2feign.feign.AlfrescoDiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableFeignClients
@Import(OAuth2Configuration.class)
public class OAuth2FeignSampleApplication
{
    private static final Logger LOGGER = LoggerFactory.getLogger(OAuth2FeignSampleApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(OAuth2FeignSampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner discoveryRunner(AlfrescoDiscoveryClient discoveryClient)
    {
        return args -> {
            try
            {
                Map<String, Object> discovery = discoveryClient.getDiscovery();
                LOGGER.info("Alfresco discovery response: {}", discovery);
            }
            catch (Exception ex)
            {
                LOGGER.error("Failed to call Alfresco discovery endpoint.", ex);
            }
        };
    }
}
