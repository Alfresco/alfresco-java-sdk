# alfresco-auth-rest-api

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
    <artifactId>alfresco-auth-rest-api</artifactId>
    <version>5.0.3</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-auth-rest-api:5.0.3"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-auth-rest-api-5.0.3.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

  import org.alfresco.*;
  import org.alfresco.auth.*;
  import org.alfresco.auth.model.*;
  import org.alfresco.auth.handler.AuthenticationApi;

  import java.io.File;
  import java.util.*;

  public class AuthenticationApiExample {

  public static void main(String[] args) {

  





  AuthenticationApi apiInstance = new AuthenticationApi();
    TicketBody ticketBodyCreate = new TicketBody(); // TicketBody | The user credential.
  try {
  TicketEntry result = apiInstance.createTicket(ticketBodyCreate);
    System.out.println(result);
  } catch (ApiException e) {
  System.err.println("Exception when calling AuthenticationApi#createTicket");
  e.printStackTrace();
  }
  }
  }

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/alfresco/api/-default-/public/authentication/versions/1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**createTicket**](docs/AuthenticationApi.md#createTicket) | **POST** /tickets | Create ticket (login)
*AuthenticationApi* | [**deleteTicket**](docs/AuthenticationApi.md#deleteTicket) | **DELETE** /tickets/-me- | Delete ticket (logout)
*AuthenticationApi* | [**validateTicket**](docs/AuthenticationApi.md#validateTicket) | **GET** /tickets/-me- | Validate ticket


## Documentation for Models

 - [Error](docs/Error.md)
 - [ErrorError](docs/ErrorError.md)
 - [Ticket](docs/Ticket.md)
 - [TicketBody](docs/TicketBody.md)
 - [TicketEntry](docs/TicketEntry.md)
 - [ValidTicket](docs/ValidTicket.md)
 - [ValidTicketEntry](docs/ValidTicketEntry.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



