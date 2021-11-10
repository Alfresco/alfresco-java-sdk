# alfresco-activiti-preference-rest-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

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
    <artifactId>alfresco-activiti-preference-rest-api</artifactId>
    <version>5.1.2-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-activiti-preference-rest-api:5.1.2-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-activiti-preference-rest-api-5.1.2-SNAPSHOT.jar
* target/lib/*.jar


## Documentation for API Endpoints

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PreferenceApi* | [**deletePreferenceUsingDELETE**](docs/PreferenceApi.md#deletePreferenceUsingDELETE) | **DELETE** /v1/preferences/{preferenceKey} | Delete preference
*PreferenceApi* | [**getAllUsingGET**](docs/PreferenceApi.md#getAllUsingGET) | **GET** /v1/preferences | Return all preferences
*PreferenceApi* | [**getPreferenceUsingGET**](docs/PreferenceApi.md#getPreferenceUsingGET) | **GET** /v1/preferences/{preferenceKey} | Get preference
*PreferenceApi* | [**savePreferenceUsingPUT**](docs/PreferenceApi.md#savePreferenceUsingPUT) | **PUT** /v1/preferences/{preferenceKey} | Create/Save preference

## Documentation for Models

 - [EntriesResponseContentOfPreference](docs/EntriesResponseContentOfPreference.md)
 - [EntryResponseContentOfPreference](docs/EntryResponseContentOfPreference.md)
 - [ListResponseContentOfPreference](docs/ListResponseContentOfPreference.md)
 - [PaginationMetadata](docs/PaginationMetadata.md)
 - [Preference](docs/Preference.md)
 - [ResponseEntity](docs/ResponseEntity.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### oauth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://apadev.envalfresco.com/auth/realms/alfresco/protocol/openid-connect/auth
- **Scopes**: 
  - : 

