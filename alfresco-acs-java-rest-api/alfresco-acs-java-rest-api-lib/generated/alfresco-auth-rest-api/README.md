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
    <version>5.1.2-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-auth-rest-api:5.1.2-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-auth-rest-api-5.1.2-SNAPSHOT.jar
* target/lib/*.jar

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


## Author



