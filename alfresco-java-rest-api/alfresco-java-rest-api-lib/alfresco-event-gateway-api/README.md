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
    <version>5.0.3</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-event-gateway-api:5.0.3"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-event-gateway-api-5.0.3.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
  import org.alfresco.gateway.*;
  import org.alfresco.gateway.auth.*;
  import org.alfresco.gateway.model.*;
  import org.alfresco.gateway.handler.DefaultApi;

  import java.io.File;
  import java.util.*;

  public class DefaultApiExample {

  public static void main(String[] args) {
  
  DefaultApi apiInstance = new DefaultApi();
  Subscription body = new Subscription(); // Subscription | The subscription object to be created
    try {
      Subscription result = apiInstance.createSubscription(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createSubscription");
      e.printStackTrace();
    }
  }
  }
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:7070*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**createSubscription**](docs/DefaultApi.md#createSubscription) | **POST** /subscriptions | 
*DefaultApi* | [**getSubscription**](docs/DefaultApi.md#getSubscription) | **GET** /subscriptions/{id} | 
*DefaultApi* | [**partiallyUpdateSubscription**](docs/DefaultApi.md#partiallyUpdateSubscription) | **PATCH** /subscriptions/{id} | 

## Documentation for Models

 - [Filter](docs/Filter.md)
 - [Subscription](docs/Subscription.md)

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.


