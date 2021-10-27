# alfresco-activiti-deployment-rest-api

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
    <groupId>com.alfresco</groupId>
    <artifactId>alfresco-activiti-deployment-rest-api</artifactId>
    <version>5.1.2-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.alfresco:alfresco-activiti-deployment-rest-api:5.1.2-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-activiti-deployment-rest-api-5.1.2-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
  import com.alfresco.activiti.deployment.*;
  import com.alfresco.activiti.deployment.auth.*;
  import com.alfresco.activiti.deployment.model.*;
  import com.alfresco.activiti.deployment.handler.ApplicationEntityApi;

  import java.io.File;
  import java.util.*;

  public class ApplicationEntityApiExample {

  public static void main(String[] args) {
  
  ApplicationEntityApi apiInstance = new ApplicationEntityApi();
    String id = "id_example"; // String | id
  try {
  Void result = apiInstance.applicationDescriptorUsingDELETE(id);
    System.out.println(result);
  } catch (ApiException e) {
  System.err.println("Exception when calling ApplicationEntityApi#applicationDescriptorUsingDELETE");
  e.printStackTrace();
  }
  }
  }
```

## Documentation for API Endpoints

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationEntityApi* | [**applicationDescriptorUsingDELETE**](docs/ApplicationEntityApi.md#applicationDescriptorUsingDELETE) | **DELETE** /applications/{id}/descriptor | applicationDescriptor
*ApplicationEntityApi* | [**applicationDescriptorUsingGET**](docs/ApplicationEntityApi.md#applicationDescriptorUsingGET) | **GET** /applications/{id}/descriptor | applicationDescriptor
*ApplicationEntityApi* | [**applicationDescriptorUsingPATCH**](docs/ApplicationEntityApi.md#applicationDescriptorUsingPATCH) | **PATCH** /applications/{id}/descriptor | applicationDescriptor
*ApplicationEntityApi* | [**applicationDescriptorUsingPOST**](docs/ApplicationEntityApi.md#applicationDescriptorUsingPOST) | **POST** /applications/{id}/descriptor | applicationDescriptor
*ApplicationEntityApi* | [**applicationDescriptorUsingPUT**](docs/ApplicationEntityApi.md#applicationDescriptorUsingPUT) | **PUT** /applications/{id}/descriptor | applicationDescriptor
*DeploymentControllerApi* | [**createApplicationUsingPOST**](docs/DeploymentControllerApi.md#createApplicationUsingPOST) | **POST** /v1/applications | Add a new application.
*DeploymentControllerApi* | [**deleteApplicationUsingDELETE**](docs/DeploymentControllerApi.md#deleteApplicationUsingDELETE) | **DELETE** /v1/applications/{id} | Delete an existing application by id.
*DeploymentControllerApi* | [**getApplicationRuntimeVersionUsingGET**](docs/DeploymentControllerApi.md#getApplicationRuntimeVersionUsingGET) | **GET** /v1/applications/{id}/runtime-version | Retrieve the application runtime version by id.
*DeploymentControllerApi* | [**getApplicationUsingGET**](docs/DeploymentControllerApi.md#getApplicationUsingGET) | **GET** /v1/applications/{id} | Find application by id.
*DeploymentControllerApi* | [**getApplicationsUsingGET**](docs/DeploymentControllerApi.md#getApplicationsUsingGET) | **GET** /v1/applications | Find applications. It allows filtering. This service will return all applications if the user has ACTIVITI_DEVOPS role otherwise it returns only applications belonging to the user.
*DeploymentControllerApi* | [**getGroupsUsingGET**](docs/DeploymentControllerApi.md#getGroupsUsingGET) | **GET** /v1/applications/{id}/groups | Fetch all groups belonging to an application.
*DeploymentControllerApi* | [**getLatestRuntimeVersionUsingGET**](docs/DeploymentControllerApi.md#getLatestRuntimeVersionUsingGET) | **GET** /v1/applications/runtime-versions/latest | Retrieve the latest runtime version available in the deployment service.
*DeploymentControllerApi* | [**getRuntimeVersionsUsingGET**](docs/DeploymentControllerApi.md#getRuntimeVersionsUsingGET) | **GET** /v1/applications/runtime-versions | Retrieve a list of runtime versions available in the deployment service.
*DeploymentControllerApi* | [**getUsersUsingGET**](docs/DeploymentControllerApi.md#getUsersUsingGET) | **GET** /v1/applications/{id}/users | Fetch all users belonging to an application.
*DeploymentControllerApi* | [**retrieveServiceLogsUsingGET**](docs/DeploymentControllerApi.md#retrieveServiceLogsUsingGET) | **GET** /v1/applications/{id}/logs/{serviceName} | retrieveServiceLogs
*DeploymentControllerApi* | [**updateApplicationRuntimeVersionUsingPOST**](docs/DeploymentControllerApi.md#updateApplicationRuntimeVersionUsingPOST) | **POST** /v1/applications/{id}/update | Updates the application runtime version to the selected one.
*DeploymentControllerApi* | [**upgradeApplicationUsingPUT**](docs/DeploymentControllerApi.md#upgradeApplicationUsingPUT) | **PUT** /v1/applications/{id} | Update an existing application by id.
*DescriptorControllerApi* | [**deleteDescriptorUsingDELETE**](docs/DescriptorControllerApi.md#deleteDescriptorUsingDELETE) | **DELETE** /v1/descriptors/{descriptorId} | Delete an existing descriptor by id.
*DescriptorControllerApi* | [**deployDescriptorUsingPOST**](docs/DescriptorControllerApi.md#deployDescriptorUsingPOST) | **POST** /v1/deploy/{descriptorId} | Deploy an existing descriptor by id.
*DescriptorControllerApi* | [**exportDescriptorUsingGET**](docs/DescriptorControllerApi.md#exportDescriptorUsingGET) | **GET** /v1/descriptors/{descriptorId}/export | Export a descriptor by id.
*DescriptorControllerApi* | [**getDescriptorUsingGET**](docs/DescriptorControllerApi.md#getDescriptorUsingGET) | **GET** /v1/descriptors/{descriptorId} | Find descriptor by id.
*DescriptorControllerApi* | [**getDescriptorsUsingGET**](docs/DescriptorControllerApi.md#getDescriptorsUsingGET) | **GET** /v1/descriptors | Find descriptors. It allows filtering.
*DescriptorControllerApi* | [**getReleasedModelContentsUsingGET**](docs/DescriptorControllerApi.md#getReleasedModelContentsUsingGET) | **GET** /v1/descriptors/{descriptorId}/models | getReleasedModelContents
*DescriptorControllerApi* | [**importDescriptorUsingPOST**](docs/DescriptorControllerApi.md#importDescriptorUsingPOST) | **POST** /v1/descriptors/import | Import descriptor. Format: zip file, containing at root a descriptor.json and the released project
*DescriptorDataEntityApi* | [**descriptorDataDescriptorUsingDELETE**](docs/DescriptorDataEntityApi.md#descriptorDataDescriptorUsingDELETE) | **DELETE** /descriptorDatas/{id}/descriptor | descriptorDataDescriptor
*DescriptorDataEntityApi* | [**descriptorDataDescriptorUsingGET**](docs/DescriptorDataEntityApi.md#descriptorDataDescriptorUsingGET) | **GET** /descriptorDatas/{id}/descriptor | descriptorDataDescriptor
*DescriptorDataEntityApi* | [**descriptorDataDescriptorUsingPATCH**](docs/DescriptorDataEntityApi.md#descriptorDataDescriptorUsingPATCH) | **PATCH** /descriptorDatas/{id}/descriptor | descriptorDataDescriptor
*DescriptorDataEntityApi* | [**descriptorDataDescriptorUsingPOST**](docs/DescriptorDataEntityApi.md#descriptorDataDescriptorUsingPOST) | **POST** /descriptorDatas/{id}/descriptor | descriptorDataDescriptor
*DescriptorDataEntityApi* | [**descriptorDataDescriptorUsingPUT**](docs/DescriptorDataEntityApi.md#descriptorDataDescriptorUsingPUT) | **PUT** /descriptorDatas/{id}/descriptor | descriptorDataDescriptor

## Documentation for Models

 - [ApplicationLog](docs/ApplicationLog.md)
 - [ApplicationPutRequestRepresentation](docs/ApplicationPutRequestRepresentation.md)
 - [ApplicationRepresentation](docs/ApplicationRepresentation.md)
 - [ApplicationResponseRepresentation](docs/ApplicationResponseRepresentation.md)
 - [ConnectorModel](docs/ConnectorModel.md)
 - [ContentVariablesRepresentation](docs/ContentVariablesRepresentation.md)
 - [DeployDescriptorRequestRepresentation](docs/DeployDescriptorRequestRepresentation.md)
 - [DeployDescriptorVariablesRepresentation](docs/DeployDescriptorVariablesRepresentation.md)
 - [Descriptor](docs/Descriptor.md)
 - [DescriptorResponseRepresentation](docs/DescriptorResponseRepresentation.md)
 - [EntriesResponseContentApplicationResponseRepresentation](docs/EntriesResponseContentApplicationResponseRepresentation.md)
 - [EntriesResponseContentDescriptorResponseRepresentation](docs/EntriesResponseContentDescriptorResponseRepresentation.md)
 - [EntryResponseContentApplicationResponseRepresentation](docs/EntryResponseContentApplicationResponseRepresentation.md)
 - [EntryResponseContentDescriptor](docs/EntryResponseContentDescriptor.md)
 - [EntryResponseContentDescriptorResponseRepresentation](docs/EntryResponseContentDescriptorResponseRepresentation.md)
 - [IdentityVariablesRepresentation](docs/IdentityVariablesRepresentation.md)
 - [InfrastructurePutRepresentation](docs/InfrastructurePutRepresentation.md)
 - [InfrastructureRepresentation](docs/InfrastructureRepresentation.md)
 - [ListResponseContentApplicationResponseRepresentation](docs/ListResponseContentApplicationResponseRepresentation.md)
 - [ListResponseContentDescriptorResponseRepresentation](docs/ListResponseContentDescriptorResponseRepresentation.md)
 - [MessagingVariablesRepresentation](docs/MessagingVariablesRepresentation.md)
 - [PaginationMetadata](docs/PaginationMetadata.md)
 - [PostgresqlVariablesRepresentation](docs/PostgresqlVariablesRepresentation.md)
 - [RuntimeVersionRepresentation](docs/RuntimeVersionRepresentation.md)
 - [SecurityRepresentation](docs/SecurityRepresentation.md)
 - [ServiceRepresentation](docs/ServiceRepresentation.md)
 - [UiInfrastructureRepresentation](docs/UiInfrastructureRepresentation.md)
 - [Variable](docs/Variable.md)
 - [VariablesPutRepresentation](docs/VariablesPutRepresentation.md)
 - [VariablesRepresentation](docs/VariablesRepresentation.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


