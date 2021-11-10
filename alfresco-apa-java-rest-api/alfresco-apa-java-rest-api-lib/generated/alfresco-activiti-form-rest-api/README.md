# alfresco-activiti-form-rest-api

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
    <artifactId>alfresco-activiti-form-rest-api</artifactId>
    <version>5.1.2-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-activiti-form-rest-api:5.1.2-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-activiti-form-rest-api-5.1.2-SNAPSHOT.jar
* target/lib/*.jar


## Documentation for API Endpoints

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FormsApi* | [**getFormDefinitionUsingGET**](docs/FormsApi.md#getFormDefinitionUsingGET) | **GET** /v1/forms/{formId}/versions/{version} | Get form definition by version
*FormsApi* | [**getFormDefinitionUsingGET1**](docs/FormsApi.md#getFormDefinitionUsingGET1) | **GET** /v1/forms/{formId} | Get form definition latest version
*FormsApi* | [**getFormDefinitionsUsingGET**](docs/FormsApi.md#getFormDefinitionsUsingGET) | **GET** /v1/forms | Get form definitions summary
*FormsApi* | [**getFormFieldValueUsingPOST**](docs/FormsApi.md#getFormFieldValueUsingPOST) | **POST** /v1/forms/{formId}/values/{formFieldId} | Get form definition by version
*FormsApi* | [**saveFormUsingPOST**](docs/FormsApi.md#saveFormUsingPOST) | **POST** /v1/forms/{formId}/save | Save runtime forms
*FormsApi* | [**submitFormUsingPOST**](docs/FormsApi.md#submitFormUsingPOST) | **POST** /v1/forms/{formId}/submit/versions/{version} | Submit forms specific version
*FormsApi* | [**submitFormUsingPOST1**](docs/FormsApi.md#submitFormUsingPOST1) | **POST** /v1/forms/{formId}/submit | Submit forms latest version
*UserActionsApi* | [**sendNamedEventUsingPOST**](docs/UserActionsApi.md#sendNamedEventUsingPOST) | **POST** /v1/user-action/event/{uiName}/{eventName}/send | Send a named event
*UserActionsApi* | [**submitFormUsingPOST2**](docs/UserActionsApi.md#submitFormUsingPOST2) | **POST** /v1/user-action/form/{formId}/submit | Submit forms latest version

## Documentation for Models

 - [NamedEventBody](docs/NamedEventBody.md)
 - [NamedObject](docs/NamedObject.md)
 - [ResponseEntity](docs/ResponseEntity.md)
 - [ResponseEntityFormSummaryView](docs/ResponseEntityFormSummaryView.md)
 - [SaveFormRepresentation](docs/SaveFormRepresentation.md)
 - [SubmitFormRepresentation](docs/SubmitFormRepresentation.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### oauth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://apadev.envalfresco.com/auth/realms/alfresco/protocol/openid-connect/auth
- **Scopes**: 
  - : 

