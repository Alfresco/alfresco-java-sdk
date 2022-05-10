# Alfresco APA Java REST API

[![Build Status](https://travis-ci.com/Alfresco/alfresco-java-rest-api.svg?token=aELT1YKccmqjzhwsQQzQ&branch=develop)](https://travis-ci.com/Alfresco/alfresco-java-rest-api)

This API has been generated using [Swagger Codegen](https://swagger.io/tools/swagger-codegen) from the public definitions:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Build

Firstly, you have to set the environment from which to fetch the API definitions via Maven properties in the following way:

```console
MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS} -Denvironment.host=your-installed-environment-host"
MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS} -Denvironment.apa.host=your-installed-apa-environment-host"
MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS} -Denvironment.application.name=your-deployed-APA-application-name"
MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS} -U"
export MAVEN_CLI_OPTS
```

Then run the following command:

```console
mvn clean install
```

### Build the main pom.xml before release the lib
```console
mvn clean install
```

## How to start in Spring

- Add to your main Spring application

    ```java
    @EnableFeignClients(basePackages = {"com.alfresco.core.handler",
                                        "com.alfresco.activiti.handler",
                                        "com.alfresco.search.handler",
                                        "com.alfresco.auth.handler"})

    ```

- Copy the class in the folder config/FeignConfiguration.java in your project

- If you are using keycloak you should include also the following libs:
    ```xml
        <dependency>
          <groupId>org.activiti.cloud</groupId>
          <artifactId>activiti-cloud-services-common-security</artifactId>
        </dependency>
        <dependency>
          <groupId>org.activiti.api</groupId>
          <artifactId>activiti-api-runtime-shared</artifactId>
        </dependency>
    ```

- Application configuration file

    ```yaml
    keycloak:
      auth-server-url: http://example.com/auth}
      principal-attribute: ${ACT_KEYCLOAK_PRINCIPAL_ATTRIBUTE:preferred-username}
      public-client: ${ACT_KEYCLOAK_CLIENT:true}
      realm: ${ACT_KEYCLOAK_REALM:springboot}
      resource: ${ACT_KEYCLOAK_RESOURCE:activiti}
      security-constraints:
      - authRoles:
        - ${ACT_KEYCLOAK_ROLES:user}
        securityCollections:
        - patterns:
          - ${ACT_KEYCLOAK_PATTERNS:/v1/*}
      - authRoles:
        - ${admin-role-name}
        securityCollections:
        - patterns:
          - /admin/*
      ssl-required: ${ACT_KEYCLOAK_SSL_REQUIRED:none}
    
    activiti:
      service:
          query:
            url:  https://gateway.aaedev.envalfresco.com
            path: /example-app/query
          runtime:
            url: https://gateway.aaedev.envalfresco.com
            path: /example-app/rb
          form:
            url: https://gateway.aaedev.envalfresco.com
            path: /example-app/form
          audit:
            url: https://gateway.aaedev.envalfresco.com
            path: /example-app/audit
          deployment:
            url: https://gateway.aaedev.envalfresco.com
            path:  /deployment-service
          modeling:
            url: https://gateway.aaedev.envalfresco.com
            path: /modeling-service
          process-storage:
            url: https://gateway.aaedev.envalfresco.com
            path: /process-storage
    
    authentication:
      service:
        url: ${AUTHENTICATION_RUNTIME_URL:http://example.com}
        path: ${AUTHENTICATION_PATH:/alfresco/api/-default-/public/alfresco/versions/1}
    
    process:
      service:
        url: ${PROCESS_SERVICE_URL:http://example.com}
        path: ${PROCESS_SERVICE_PATH:/alfresco/api/-default-/public/alfresco/versions/1}
    
    ```

## How to start in a non spring application

You can check the documentation here:
<https://github.com/OpenFeign/feign>

## CI/CD

Running on Travis, requires the following environment variables to be set:

| Name | Description |
|------|-------------|
| MAVEN_USERNAME | Internal Maven repository username |
| MAVEN_PASSWORD | Internal Maven repository password |
| TRAVIS_API_TOKEN | token to launch other builds |
