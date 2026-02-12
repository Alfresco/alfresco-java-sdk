# OAuth2 Feign Sample

This sample shows how to use `OAuth2FeignRequestInterceptor` to authorize Feign requests to Alfresco.

## What it does

- Uses Spring Cloud OpenFeign to call the Alfresco Discovery API.
- Injects the OAuth2 access token with `OAuth2FeignRequestInterceptor` from `alfresco-java-rest-api-common`.
- Reads OAuth2 client settings from `application.properties`.

## Configure

Edit `src/main/resources/application.properties` and set:

```properties
alfresco.base-url=<BASE-URL>
keycloak.auth-server-url=<IDP-URL>
keycloak.realm=alfresco
spring.security.oauth2.client.registration.alfresco-rest-api.client-id=<CLIENT-ID>
spring.security.oauth2.client.registration.alfresco-rest-api.client-secret=<CLIENT-SECRET>
```

The OAuth2 configuration bean in `alfresco-java-rest-api-common` is activated when
`spring.security.oauth2.client.registration.alfresco-rest-api.provider` is set.

## Run

From the repository root:

```bash
mvn -pl samples/oauth2-feign-sample spring-boot:run
```

On startup the app calls the Discovery endpoint and logs the response.

