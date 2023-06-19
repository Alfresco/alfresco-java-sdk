# alfresco-event-gateway-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.alfresco</groupId>
    <artifactId>alfresco-event-gateway-api-client</artifactId>
    <version>6.0.0-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-event-gateway-api:5.1.1"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-event-gateway-api-5.1.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import java.util.HashMap;
import java.util.Map;

import org.alfresco.gateway.handler.SubscriptionsApi;
import org.alfresco.gateway.model.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sample {

  private static final Logger LOGGER = LoggerFactory.getLogger(Sample.class);

  public static void main(String[] args) {

    @Inject
    SubscriptionsApi subscriptionsApi;

    Map<String, String> config = new HashMap<>();
    config.put("broker-id", "sample-broker"); // Id of the a broker in alfresco-event-gateway configuration
    config.put("destination", "topic:sample-topic"); // Name of the topic to which the gateway shall publish the events

    Subscription subscriptionRequest = new Subscription();

    subscriptionRequest.setType("jms-activemq");
    subscriptionRequest.setConfig(config);

    Subscription result = subscriptionsApi.createSubscription(subscriptionRequest);
    LOGGER.info("Created subscription with id: {}", result.getId());
  }
}
```

## Documentation for API Endpoints

All URIs are relative to */v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SubscriptionsApi* | [**createSubscription**](docs/SubscriptionsApi.md#createSubscription) | **POST** /subscriptions |
*SubscriptionsApi* | [**getSubscription**](docs/SubscriptionsApi.md#getSubscription) | **GET** /subscriptions/{id} |
*SubscriptionsApi* | [**partiallyUpdateSubscription**](docs/SubscriptionsApi.md#partiallyUpdateSubscription) | **PATCH** /subscriptions/{id} |

## Documentation for Models

- [Filter](docs/Filter.md)
- [Subscription](docs/Subscription.md)

