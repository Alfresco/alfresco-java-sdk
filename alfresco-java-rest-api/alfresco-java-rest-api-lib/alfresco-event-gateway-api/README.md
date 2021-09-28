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
    <artifactId>alfresco-event-gateway-api</artifactId>
    <version>5.0.5-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-event-gateway-api:5.0.5-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-event-gateway-api-5.0.5-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
  import org.alfresco.core.*;
  import org.alfresco.core.auth.*;
  import org.alfresco.core.model.*;
  import org.alfresco.core.handler.SubscriptionsApi;

  import java.io.File;
  import java.util.*;

  public class SubscriptionsApiExample {

  public static void main(String[] args) {

    // Configure HTTP basic authorization: basic-auth
    HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
    basic-auth.setUsername("YOUR USERNAME");
    basic-auth.setPassword("YOUR PASSWORD");


  SubscriptionsApi apiInstance = new SubscriptionsApi();
    Subscription body = new Subscription(); // Subscription | The subscription object to be created
  try {
  Subscription result = apiInstance.createSubscription(body);
    System.out.println(result);
  } catch (ApiException e) {
  System.err.println("Exception when calling SubscriptionsApi#createSubscription");
  e.printStackTrace();
  }
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

## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication

### bearerKey



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


