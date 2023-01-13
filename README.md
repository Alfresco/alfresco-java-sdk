# Welcome to the Alfresco Java SDK

<p align="center">
  <img title="alfresco" alt='alfresco' src='docs/images/alfresco.png'  width="229px" height="160px"></img>
</p>

## What is Alfresco Java SDK?

The Alfresco Java SDK includes a set of APIs and samples that allows developers to quickly build Java applications that integrate with Alfresco. <br/>

This SDK provides functionality to connect to both on-premise and Cloud-based servers. Alfresco servers of version 7.x and above are supported.

## How does it work?

Alfresco Java SDK consist of the following groups of libraries:

* [alfresco-acs-java-rest-api](alfresco-acs-java-rest-api): Allows applications to consume ACS public REST APIs.
* [alfresco-apa-java-rest-api](alfresco-apa-java-rest-api): Allows applications to consume APA public REST APIs.
* [alfresco-java-event-api](alfresco-java-event-api): Allows applications to react to events produced by Alfresco Repository.

The [samples](samples) folder includes examples, sample applications and code snippets of the different features supported by the SDK. Each sample application
contains a `docker-compose` file and scripts that allows you to build and run the extension.

### Pre-Requisites

* Java version 11 or higher
* Maven version 3.3 or higher

### Quick start

#### 1. Create a new Spring Boot application

#### 2. Add these dependencies to your project's build file:

Maven:

First, add to the repositories the Alfresco public repository containing the artifacts:

```xml

<repositories>

  <repository>
    <id>alfresco-public</id>
    <url>https://artifacts.alfresco.com/nexus/content/groups/public</url>
  </repository>

</repositories>
```

Then, add the dependency on the desired starter(s)

```xml

<dependencies>

  <!-- ACS Java REST APIs -->
  <dependency>
    <groupId>org.alfresco</groupId>
    <artifactId>alfresco-acs-java-rest-api-spring-boot-starter</artifactId>
    <version>5.2.1</version>
  </dependency>

  <!-- APA Java REST APIs -->
  <dependency>
    <groupId>org.alfresco</groupId>
    <artifactId>alfresco-apa-java-rest-api-spring-boot-starter</artifactId>
    <version>5.2.1</version>
  </dependency>

  <!-- Java Event API -->
  <dependency>
    <groupId>org.alfresco</groupId>
    <artifactId>alfresco-java-event-api-spring-boot-starter</artifactId>
    <version>5.2.1</version>
  </dependency>
</dependencies>
```

Gradle:

First, add to the repositories the Alfresco public repository containing the artifacts:

```groovy
repositories {
  maven {
    url "https://artifacts.alfresco.com/nexus/content/groups/public"
  }
}
```

Then, add the dependency on the desired starter(s)

```groovy
compile "org.alfresco:alfresco-acs-java-rest-api-spring-boot-starter:5.2.1"
compile "org.alfresco:alfresco-apa-java-rest-api-spring-boot-starter:5.2.1"
compile "org.alfresco:alfresco-java-event-api-spring-boot-starter:5.2.1"
```

#### 3. Configure Event API

In your ```application.properties``` file define the properties required to connect to the ActiveMQ broker in order to handle Repository events:

```
spring.activemq.brokerUrl=tcp://activemq-host:61616
```

Alternatively, set `SPRING_ACTIVEMQ_BROKER_URL` environment variable.

Also, this property is required if you want Spring Boot to auto-define the ActiveMQConnectionFactory, otherwise you can define that bean in Spring config

```
spring.jms.cache.enabled=false
```

Similarly, you can alternatively set `SPRING_JMS_CACHE_ENABLED` environment variable.

For additional configuration properties of Event API, check [alfresco-java-event-api](alfresco-java-event-api).

#### 4. Configure REST API

In your ```application.properties``` file provide URL, authentication mechanism and credentials for accessing the REST API:

```
content.service.url=http://repository:8080
content.service.security.basicAuth.username=admin
content.service.security.basicAuth.password=admin
```

If you are using OAuth2, you can use client-credential based authentication:

```
spring.security.oauth2.client.registration.alfresco-rest-api.provider=alfresco-identity-service
spring.security.oauth2.client.registration.alfresco-rest-api.client-id=clientId
spring.security.oauth2.client.registration.alfresco-rest-api.client-secret=clientSecret
spring.security.oauth2.client.registration.alfresco-rest-api.authorization-grant-type=client_credentials
spring.security.oauth2.client.provider.alfresco-identity-service.token-uri=${keycloak.auth-server-url}/auth/realms/${keycloak.realm}/protocol/openid-connect/token
```

Or OAuth2 password based authentication:

```
spring.security.oauth2.client.registration.alfresco-rest-api.provider=alfresco-identity-service
spring.security.oauth2.client.registration.alfresco-rest-api.client-id=clientId
spring.security.oauth2.client.registration.alfresco-rest-api.client-secret=clientSecret
spring.security.oauth2.client.registration.alfresco-rest-api.username=username
spring.security.oauth2.client.registration.alfresco-rest-api.password=pwd
spring.security.oauth2.client.registration.alfresco-rest-api.authorization-grant-type=password
spring.security.oauth2.client.provider.alfresco-identity-service.token-uri=${keycloak.auth-server-url}/auth/realms/${keycloak.realm}/protocol/openid-connect/token
```

Finally, if you want to provide a custom authentication mechanism, you can enable the delegated external authentication:

```
content.service.security.delegated=true
```

And provide a bean that implements the interface ```DelegatedAuthenticationProvider```.

#### 5. Handle events produced by the Repository

Use out-of-the-box Event Handlers to handle specific events, using Event Filters to react to the event, only if it meets certain conditions.

```java
/**
 * Sample event handler to demonstrate reacting to the update of a content in the repository.
 */
@Component
public class ContentUpdatedHandler implements OnNodeUpdatedEventHandler {

  private static final Logger LOGGER = LoggerFactory.getLogger(ContentUpdatedHandler.class);

  @Override
  public void handleEvent(final RepoEvent<DataAttributes<Resource>> repoEvent) {
    LOGGER.info("The content of the node {} has been updated!",
      ((NodeResource) repoEvent.getData().getResource()).getName());
  }

  @Override
  public EventFilter getEventFilter() {
    return ContentChangedFilter.get();
  }
}
```

Use `@Order` annotation to define an execution order of multiple event handlers.

```java
    /**
 * This event handler definition illustrates how you can use Spring's {@link Order} annotation to sort the execution of event handlers.
 */
@Bean
@Order(10)
public OnNodeCreatedEventHandler firstCustomNodeCreatedEventHandler(){
  return repoEvent->LOGGER.info("First Event handler triggered on node created - Event: {}",repoEvent);
  }

/**
 * This event handler definition illustrates how you can use Spring's {@link Order} annotation to sort the execution of event handlers.
 */
@Bean
@Order(20)
public OnNodeCreatedEventHandler secondCustomNodeCreatedEventHandler(){
  return repoEvent->LOGGER.info("Second Event handler triggered on node created - Event: {}",repoEvent);
  }
```

Alternatively, use Spring Integration to consume events:

```java
    @Bean
public IntegrationFlow logTheCreationOfHTMLContent(){
  return IntegrationFlows.from(EventChannels.MAIN)
  .filter(IntegrationEventFilter.of(EventTypeFilter.NODE_CREATED
  .and(MimeTypeFilter.of("text/html"))))
  .handle(t->LOGGER.info("An HTML content has been created! - Event: {}",t.getPayload().toString()))
  .get();
  }
```

You can find more information about how to consume events at [alfresco-java-event-api](alfresco-java-event-api).

#### 6. Consume the REST API

```java
    CommentsApi commentsApi;

public void addComentToNode(final String nodeId){
  CommentBody commentBody=new CommentBody().content("I like this file");
  commentsApi.createComment(nodeId,commentBody);
  }
  }
```

You can find more information about how to consume the REST API at [alfresco-java-rest-api](alfresco-java-rest-api).

#### Integrating Alfresco Event Gateway

Alfresco Java SDK is now compatible with [Alfresco Event Gateway](https://www.github.com/Alfresco/alfresco-event-gateway).

Using [Alfresco Event Gateway REST API](alfresco-java-rest-api/alfresco-java-rest-api-lib/alfresco-event-gateway-api), extensions can manage the lifecycle of an
event subscription.

For example, an out-of-process extension may create a subscription to receive certain types of events in a specific topic of an ActiveMQ broker.

```java
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.alfresco.gateway.handler.SubscriptionsApi;
import org.alfresco.gateway.model.Filter;
import org.alfresco.gateway.model.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sample {

  private static final Logger LOGGER = LoggerFactory.getLogger(Sample.class);


  public static void create(String[] args) {

    @Inject
    SubscriptionsApi subscriptionsApi;

    Map<String, String> config = new HashMap<>();
    config.put("broker-id", "my-broker"); // Id of the a broker in alfresco-event-gateway configuration
    config.put("destination", "topic:sample-topic"); // Name of the topic to which the gateway shall publish the events

    Filter filter = new Filter();
    filter.setType("event-type");
    // Comma-separated list of event types accepted by the filter
    filter.setConfig(Collections.singletonMap("event-types", "org.alfresco.event.node.Created,org.alfresco.event.node.Updated"));

    Subscription subscriptionRequest = new Subscription();
    subscriptionRequest.setType("jms-activemq");
    subscriptionRequest.setConfig(config);
    subscriptionRequest.setFilters(Collections.singletonList(filter));

    Subscription result = subscriptionsApi.createSubscription(subscriptionRequest);
    LOGGER.info("Created subscription with id: {}", result.getId());
  }
}
```

The ActiveMQ broker can be different from the one used by the Alfresco Repository and is configured in both the out-of-process extension and the Event Gateway.

##### Configuring a specific ActiveMQ broker for an out-of-process extension - (Alfresco Event SDK):

```
spring.activemq.brokerUrl=tcp://my-broker-host:61616
spring.activemq.username=test
spring.activemq.password=my-secret

# This property is required if you want Spring Boot to auto-define the ActiveMQConnectionFactory, otherwise you can define that bean in Spring config
spring.jms.cache.enabled=false

alfresco.events.topicName=topic:sample-topic
```

More Information: [Configuring out-of-process extensions](alfresco-java-event-api)

##### Configuring a specific ActiveMQ broker for an out-of-process extension - (Alfresco Event Gateway):

```
## EVENT GATEWAY BROKER CONFIG
# This is a sample about how to configure a broker config with id "my-broker" (only broker-url is
# mandatory). You can add any number of different broker configurations

alfresco.event.gateway.publication.jms.broker.my-broker.broker-url=tcp://my-broker-host:61616
alfresco.event.gateway.publication.jms.broker.my-broker.username=admin
alfresco.event.gateway.publication.jms.broker.my-broker.password=my-secret
```

More Information: [Configuring Alfresco Event Gateway](https://www.github.com/Alfresco/alfresco-event-gateway)

## How to build the SDK project

### Pre-Requisites

* Java version 11 or higher
* Maven version 3.3 or higher
* An APA environment with a deployed application from which to fetch the API definitions

### Build command

Simply run the next command:

```console
mvn clean install -Denvironment.host=your-installed-environment-host -Denvironment.apa.host=your-installed-apa-environment-host -Denvironment.application.name=your-deployed-APA-application-name
```

The previous command will generate the source code for the (ACS and APA) REST API clients first and then it will compile all the modules and run the
corresponding unit and integration tests.

If you want to skip the generation of the REST API clients code, you can do it sending the maven property `skip.generation`:

```console
mvn clean install -Dskip.generation
```

Remember that you need to build the project at least once without skipping the generation step to be able to compile all the code properly. From that point, you
can skip the generation step if don't need it.

### Integration tests

Running the integration tests requires an ACS environment to work properly. The configuration of the ACS environment to use in the integration test can be done
using the environment variables `CONTENT_SERVICE_URL`, `CONTENT_SERVICE_SECURITY_BASICAUTH_USERNAME` and `CONTENT_SERVICE_SECURITY_BASICAUTH_PASSWORD`.

The default values for the ACS environment used for integration tests are:

- `CONTENT_SERVICE_URL` - `http://localhost:8080`
- `CONTENT_SERVICE_SECURITY_BASICAUTH_USERNAME` - `admin`
- `CONTENT_SERVICE_SECURITY_BASICAUTH_PASSWORD` - `admin`
