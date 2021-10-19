package com.alfresco.process.configuration;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.activiti.api.runtime.shared.security.SecurityContextTokenProvider;
import org.activiti.cloud.api.process.model.impl.conf.CloudProcessModelAutoConfiguration;
import org.activiti.cloud.api.task.model.impl.conf.CloudTaskModelAutoConfiguration;
import org.activiti.cloud.security.feign.TokenRelayRequestInterceptor;
import org.activiti.cloud.services.common.security.keycloak.KeycloakSecurityContextTokenProvider;
import org.activiti.runtime.conf.CommonModelAutoConfiguration;
import org.conf.activiti.runtime.ProcessModelAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Primary;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.format.DateTimeFormatterBuilder;

import java.io.IOException;

@Configuration
@Import({
        CommonModelAutoConfiguration.class,
        ProcessModelAutoConfiguration.class,
        CloudProcessModelAutoConfiguration.class,
        CloudTaskModelAutoConfiguration.class
})
public class FeignConfiguration {

    @Bean
    feign.Logger.Level feignLoggerLevel() {
        return feign.Logger.Level.HEADERS;
    }

    @Primary
    @Bean
    public ObjectMapper objectMapper() {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(OffsetDateTime.class, new JsonSerializer<OffsetDateTime>() {
            @Override
            public void serialize(OffsetDateTime offsetDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
                jsonGenerator.writeString(offsetDateTime.toString());
            }
        });
        simpleModule.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {

                DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                        .append(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                        .optionalStart().appendOffset("+HH:MM", "+00:00").optionalEnd()
                        .optionalStart().appendOffset("+HHMM", "+0000").optionalEnd()
                        .optionalStart().appendOffset("+HH", "Z").optionalEnd()
                        .toFormatter();

                return OffsetDateTime.parse(jsonParser.getText(), formatter);


            }
        });
        objectMapper.registerModule(simpleModule);

        return objectMapper;
    }

    @Bean
    public SecurityContextTokenProvider keycloakSecurityContextTokenProvider() {
        return new KeycloakSecurityContextTokenProvider();
    }

    @Bean
    public RequestInterceptor tokenRelayRequestInterceptor(SecurityContextTokenProvider securityContextTokenProvider) {
        return new TokenRelayRequestInterceptor(securityContextTokenProvider);
    }
}
