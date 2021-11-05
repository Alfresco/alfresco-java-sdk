# alfresco-activiti-dmn-simulation-rest-api

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
    <artifactId>alfresco-activiti-dmn-simulation-rest-api</artifactId>
    <version>5.1.2-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-activiti-dmn-simulation-rest-api:5.1.2-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-activiti-dmn-simulation-rest-api-5.1.2-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
  import org.alfresco.activiti.dmn.simulation.*;
  import org.alfresco.activiti.dmn.simulation.auth.*;
  import org.alfresco.activiti.dmn.simulation.model.*;
  import org.alfresco.activiti.dmn.simulation.handler.ApsModelControllerApi;

  import java.io.File;
  import java.util.*;

  public class ApsModelControllerApiExample {

  public static void main(String[] args) {
  
  ApsModelControllerApi apiInstance = new ApsModelControllerApi();
    String projectId = "projectId_example"; // String | projectId
    Object body = null; // Object | 
  try {
  EntryResponseContentOfImportResult result = apiInstance.importProcessModelUsingPOST(projectId, body);
    System.out.println(result);
  } catch (ApiException e) {
  System.err.println("Exception when calling ApsModelControllerApi#importProcessModelUsingPOST");
  e.printStackTrace();
  }
  }
  }
```

## Documentation for API Endpoints

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApsModelControllerApi* | [**importProcessModelUsingPOST**](docs/ApsModelControllerApi.md#importProcessModelUsingPOST) | **POST** /v1/aps/models/import/{projectId}/process | Import an APS Process Model
*CollaborationApi* | [**addCollaboratorUsingPUT**](docs/CollaborationApi.md#addCollaboratorUsingPUT) | **PUT** /v1/projects/{projectId}/collaborators/{username} | Add a collaborator
*CollaborationApi* | [**getCollaboratorsUsingGET**](docs/CollaborationApi.md#getCollaboratorsUsingGET) | **GET** /v1/projects/{projectId}/collaborators | List collaborators
*CollaborationApi* | [**removeCollaboratorUsingDELETE**](docs/CollaborationApi.md#removeCollaboratorUsingDELETE) | **DELETE** /v1/projects/{projectId}/collaborators/{username} | Remove a collaborator
*DmnTableApi* | [**executeDMNUsingPOST**](docs/DmnTableApi.md#executeDMNUsingPOST) | **POST** /v1/dmn/execute | Execute a DMN
*ModelsApi* | [**createModelUsingPOST**](docs/ModelsApi.md#createModelUsingPOST) | **POST** /v1/projects/{projectId}/models | Create new model belonging to an project
*ModelsApi* | [**createModelWithoutProjectUsingPOST**](docs/ModelsApi.md#createModelWithoutProjectUsingPOST) | **POST** /v1/models | Create new model that does note belong to a project
*ModelsApi* | [**deleteModelUsingDELETE**](docs/ModelsApi.md#deleteModelUsingDELETE) | **DELETE** /v1/models/{modelId} | Delete model
*ModelsApi* | [**deleteProjectModelRelationshipUsingDELETE**](docs/ModelsApi.md#deleteProjectModelRelationshipUsingDELETE) | **DELETE** /v1/projects/{projectId}/models/{modelId} | Delete the relationship between an existing model, and the project
*ModelsApi* | [**exportModelUsingGET**](docs/ModelsApi.md#exportModelUsingGET) | **GET** /v1/models/{modelId}/export | Export a model definition as file
*ModelsApi* | [**getGlobalModelsUsingGET**](docs/ModelsApi.md#getGlobalModelsUsingGET) | **GET** /v1/models | List all the models that are not coupled to a project
*ModelsApi* | [**getModelContentUsingGET**](docs/ModelsApi.md#getModelContentUsingGET) | **GET** /v1/models/{modelId}/content | Get the model content
*ModelsApi* | [**getModelTypesUsingGET**](docs/ModelsApi.md#getModelTypesUsingGET) | **GET** /v1/model-types | List model types
*ModelsApi* | [**getModelUsingGET**](docs/ModelsApi.md#getModelUsingGET) | **GET** /v1/models/{modelId} | Get metadata information for a model
*ModelsApi* | [**getModelsUsingGET**](docs/ModelsApi.md#getModelsUsingGET) | **GET** /v1/projects/{projectId}/models | List models for an project
*ModelsApi* | [**getSchemaUsingGET**](docs/ModelsApi.md#getSchemaUsingGET) | **GET** /v1/schemas/{modelType} | Get validation schema for model type
*ModelsApi* | [**importModelUsingPOST**](docs/ModelsApi.md#importModelUsingPOST) | **POST** /v1/projects/{projectId}/models/import | Import a model from file
*ModelsApi* | [**putProjectModelRelationshipUsingPUT**](docs/ModelsApi.md#putProjectModelRelationshipUsingPUT) | **PUT** /v1/projects/{projectId}/models/{modelId} | Add or update the relationship between an existing model, and the project
*ModelsApi* | [**updateModelContentUsingPUT**](docs/ModelsApi.md#updateModelContentUsingPUT) | **PUT** /v1/models/{modelId}/content | Update model content
*ModelsApi* | [**updateModelUsingPUT**](docs/ModelsApi.md#updateModelUsingPUT) | **PUT** /v1/models/{modelId} | Update model metadata
*ModelsApi* | [**validateModelExtensionsUsingPOST**](docs/ModelsApi.md#validateModelExtensionsUsingPOST) | **POST** /v1/models/{modelId}/validate/extensions | Validate model extensions
*ModelsApi* | [**validateModelUsingPOST**](docs/ModelsApi.md#validateModelUsingPOST) | **POST** /v1/models/{modelId}/validate | Validate a model content
*ProjectsApi* | [**copyProjectUsingPOST**](docs/ProjectsApi.md#copyProjectUsingPOST) | **POST** /v1/projects/{projectId}/copy | Copy an project as a new project with chosen name
*ProjectsApi* | [**createProjectFromExampleUsingPOST**](docs/ProjectsApi.md#createProjectFromExampleUsingPOST) | **POST** /v1/projects/example | Create an project from example
*ProjectsApi* | [**createProjectUsingPOST**](docs/ProjectsApi.md#createProjectUsingPOST) | **POST** /v1/projects | Create new project
*ProjectsApi* | [**deleteProjectUsingDELETE**](docs/ProjectsApi.md#deleteProjectUsingDELETE) | **DELETE** /v1/projects/{projectId} | Delete project
*ProjectsApi* | [**exportProjectUsingGET**](docs/ProjectsApi.md#exportProjectUsingGET) | **GET** /v1/projects/{projectId}/export | Export an project as zip file
*ProjectsApi* | [**getProjectReleaseUsingGET**](docs/ProjectsApi.md#getProjectReleaseUsingGET) | **GET** /v1/projects/{projectId}/releases | Get releases of a project
*ProjectsApi* | [**getProjectUsingGET**](docs/ProjectsApi.md#getProjectUsingGET) | **GET** /v1/projects/{projectId} | Get project
*ProjectsApi* | [**getProjectsUsingGET**](docs/ProjectsApi.md#getProjectsUsingGET) | **GET** /v1/projects | List projects
*ProjectsApi* | [**importProjectUsingPOST**](docs/ProjectsApi.md#importProjectUsingPOST) | **POST** /v1/projects/import | Import an project as zip file
*ProjectsApi* | [**releaseProjectUsingPOST**](docs/ProjectsApi.md#releaseProjectUsingPOST) | **POST** /v1/projects/{projectId}/releases | Create a new release of a project
*ProjectsApi* | [**updateProjectUsingPUT**](docs/ProjectsApi.md#updateProjectUsingPUT) | **PUT** /v1/projects/{projectId} | Update project details
*ProjectsApi* | [**validateProjectUsingGET**](docs/ProjectsApi.md#validateProjectUsingGET) | **GET** /v1/projects/{projectId}/validate | Validate an project by id
*ReleaseControllerApi* | [**getReleaseUsingGET**](docs/ReleaseControllerApi.md#getReleaseUsingGET) | **GET** /v1/releases/{releaseId} | Get release by a release Id
*ScriptControllerApi* | [**runScriptUsingPOST**](docs/ScriptControllerApi.md#runScriptUsingPOST) | **POST** /v1/scripts | runScript

## Documentation for Models

 - [Collaborator](docs/Collaborator.md)
 - [ConversionInfo](docs/ConversionInfo.md)
 - [DMNTable](docs/DMNTable.md)
 - [EntriesResponseContentOfCollaborator](docs/EntriesResponseContentOfCollaborator.md)
 - [EntriesResponseContentOfModel](docs/EntriesResponseContentOfModel.md)
 - [EntriesResponseContentOfModelType](docs/EntriesResponseContentOfModelType.md)
 - [EntriesResponseContentOfProject](docs/EntriesResponseContentOfProject.md)
 - [EntriesResponseContentOfRelease](docs/EntriesResponseContentOfRelease.md)
 - [EntryResponseContentOfCollaborator](docs/EntryResponseContentOfCollaborator.md)
 - [EntryResponseContentOfImportResult](docs/EntryResponseContentOfImportResult.md)
 - [EntryResponseContentOfModel](docs/EntryResponseContentOfModel.md)
 - [EntryResponseContentOfModelType](docs/EntryResponseContentOfModelType.md)
 - [EntryResponseContentOfProject](docs/EntryResponseContentOfProject.md)
 - [EntryResponseContentOfRelease](docs/EntryResponseContentOfRelease.md)
 - [ImportResult](docs/ImportResult.md)
 - [ListResponseContentOfCollaborator](docs/ListResponseContentOfCollaborator.md)
 - [ListResponseContentOfModel](docs/ListResponseContentOfModel.md)
 - [ListResponseContentOfModelType](docs/ListResponseContentOfModelType.md)
 - [ListResponseContentOfProject](docs/ListResponseContentOfProject.md)
 - [ListResponseContentOfRelease](docs/ListResponseContentOfRelease.md)
 - [Model](docs/Model.md)
 - [ModelIdContentBody](docs/ModelIdContentBody.md)
 - [ModelReq](docs/ModelReq.md)
 - [ModelRes](docs/ModelRes.md)
 - [ModelType](docs/ModelType.md)
 - [ModelsImportBody](docs/ModelsImportBody.md)
 - [PaginationMetadata](docs/PaginationMetadata.md)
 - [Project](docs/Project.md)
 - [ProjectsImportBody](docs/ProjectsImportBody.md)
 - [Release](docs/Release.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


