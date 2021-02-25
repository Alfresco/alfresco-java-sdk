package org.alfresco.rest.sdk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {
    "org.alfresco.core.handler",
    "org.alfresco.discovery.handler",
    "org.alfresco.governance.core.handler",
    "org.alfresco.governance.classification.handler",
    "org.alfresco.search.handler",
    "org.alfresco.search.sql.handler"
})
public class AcsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcsTestApplication.class, args);
    }

}


