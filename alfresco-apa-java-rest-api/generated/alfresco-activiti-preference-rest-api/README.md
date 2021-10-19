# alfresco-activiti-preference-rest-api

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
    <groupId>com.alfresco</groupId>
    <artifactId>alfresco-activiti-preference-rest-api</artifactId>
    <version>7.1.0-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.alfresco:alfresco-activiti-preference-rest-api:7.1.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-activiti-preference-rest-api-7.1.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

  import com.alfresco.activiti.preference.*;
  import com.alfresco.activiti.preference.auth.*;
  import com.alfresco.activiti.preference.model.*;
  import com.alfresco.activiti.preference.handler.CandidateGroupAdminControllerImplApi;

  import java.io.File;
  import java.util.*;

  public class CandidateGroupAdminControllerImplApiExample {

  public static void main(String[] args) {
  
  CandidateGroupAdminControllerImplApi apiInstance = new CandidateGroupAdminControllerImplApi();
    CandidateGroupsPayload candidateGroupsPayload = new CandidateGroupsPayload(); // CandidateGroupsPayload | candidateGroupsPayload
    String taskId = "taskId_example"; // String | taskId
  try {
  Void result = apiInstance.addCandidateGroupsUsingPOST(candidateGroupsPayload, taskId);
    System.out.println(result);
  } catch (ApiException e) {
  System.err.println("Exception when calling CandidateGroupAdminControllerImplApi#addCandidateGroupsUsingPOST");
  e.printStackTrace();
  }
  }
  }

```

## Documentation for API Endpoints

All URIs are relative to *https://apadev.envalfresco.comtrue*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CandidateGroupAdminControllerImplApi* | [**addCandidateGroupsUsingPOST**](docs/CandidateGroupAdminControllerImplApi.md#addCandidateGroupsUsingPOST) | **POST** /admin/v1/tasks/{taskId}/candidate-groups | addCandidateGroups
*CandidateGroupAdminControllerImplApi* | [**deleteCandidateGroupsUsingDELETE**](docs/CandidateGroupAdminControllerImplApi.md#deleteCandidateGroupsUsingDELETE) | **DELETE** /admin/v1/tasks/{taskId}/candidate-groups | deleteCandidateGroups
*CandidateGroupAdminControllerImplApi* | [**getGroupCandidatesUsingGET**](docs/CandidateGroupAdminControllerImplApi.md#getGroupCandidatesUsingGET) | **GET** /admin/v1/tasks/{taskId}/candidate-groups | getGroupCandidates
*CandidateGroupControllerImplApi* | [**addCandidateGroupsUsingPOST1**](docs/CandidateGroupControllerImplApi.md#addCandidateGroupsUsingPOST1) | **POST** /v1/tasks/{taskId}/candidate-groups | addCandidateGroups
*CandidateGroupControllerImplApi* | [**deleteCandidateGroupsUsingDELETE1**](docs/CandidateGroupControllerImplApi.md#deleteCandidateGroupsUsingDELETE1) | **DELETE** /v1/tasks/{taskId}/candidate-groups | deleteCandidateGroups
*CandidateGroupControllerImplApi* | [**getGroupCandidatesUsingGET1**](docs/CandidateGroupControllerImplApi.md#getGroupCandidatesUsingGET1) | **GET** /v1/tasks/{taskId}/candidate-groups | getGroupCandidates
*CandidateUserAdminControllerImplApi* | [**addCandidateUsersUsingPOST**](docs/CandidateUserAdminControllerImplApi.md#addCandidateUsersUsingPOST) | **POST** /admin/v1/tasks/{taskId}/candidate-users | addCandidateUsers
*CandidateUserAdminControllerImplApi* | [**deleteCandidateUsersUsingDELETE**](docs/CandidateUserAdminControllerImplApi.md#deleteCandidateUsersUsingDELETE) | **DELETE** /admin/v1/tasks/{taskId}/candidate-users | deleteCandidateUsers
*CandidateUserAdminControllerImplApi* | [**getUserCandidatesUsingGET**](docs/CandidateUserAdminControllerImplApi.md#getUserCandidatesUsingGET) | **GET** /admin/v1/tasks/{taskId}/candidate-users | getUserCandidates
*CandidateUserControllerImplApi* | [**addCandidateUsersUsingPOST1**](docs/CandidateUserControllerImplApi.md#addCandidateUsersUsingPOST1) | **POST** /v1/tasks/{taskId}/candidate-users | addCandidateUsers
*CandidateUserControllerImplApi* | [**deleteCandidateUsersUsingDELETE1**](docs/CandidateUserControllerImplApi.md#deleteCandidateUsersUsingDELETE1) | **DELETE** /v1/tasks/{taskId}/candidate-users | deleteCandidateUsers
*CandidateUserControllerImplApi* | [**getUserCandidatesUsingGET1**](docs/CandidateUserControllerImplApi.md#getUserCandidatesUsingGET1) | **GET** /v1/tasks/{taskId}/candidate-users | getUserCandidates
*ConnectorDefinitionControllerImplApi* | [**getConnectorDefinitionUsingGET**](docs/ConnectorDefinitionControllerImplApi.md#getConnectorDefinitionUsingGET) | **GET** /v1/connector-definitions/{id} | getConnectorDefinition
*ConnectorDefinitionControllerImplApi* | [**getConnectorDefinitionsUsingGET**](docs/ConnectorDefinitionControllerImplApi.md#getConnectorDefinitionsUsingGET) | **GET** /v1/connector-definitions | getConnectorDefinitions
*FormsApi* | [**getFormDefinitionUsingGET**](docs/FormsApi.md#getFormDefinitionUsingGET) | **GET** /v1/forms/{formId}/versions/{version} | Get form definition by version
*FormsApi* | [**getFormDefinitionUsingGET1**](docs/FormsApi.md#getFormDefinitionUsingGET1) | **GET** /v1/forms/{formId} | Get form definition latest version
*FormsApi* | [**getFormDefinitionsUsingGET**](docs/FormsApi.md#getFormDefinitionsUsingGET) | **GET** /v1/forms | Get form definitions summary
*FormsApi* | [**saveFormUsingPOST**](docs/FormsApi.md#saveFormUsingPOST) | **POST** /v1/forms/{formId}/save | Save runtime forms
*FormsApi* | [**submitFormUsingPOST**](docs/FormsApi.md#submitFormUsingPOST) | **POST** /v1/forms/{formId}/submit/versions/{version} | Submit forms specific version
*FormsApi* | [**submitFormUsingPOST1**](docs/FormsApi.md#submitFormUsingPOST1) | **POST** /v1/forms/{formId}/submit | Submit forms latest version
*HomeControllerImplApi* | [**getHomeInfoUsingGET**](docs/HomeControllerImplApi.md#getHomeInfoUsingGET) | **GET** /v1 | getHomeInfo
*PreferenceApi* | [**deletePreferenceUsingDELETE**](docs/PreferenceApi.md#deletePreferenceUsingDELETE) | **DELETE** /v1/preferences/{preferenceKey} | Delete preference
*PreferenceApi* | [**getAllUsingGET**](docs/PreferenceApi.md#getAllUsingGET) | **GET** /v1/preferences | Return all preferences
*PreferenceApi* | [**getPreferenceUsingGET**](docs/PreferenceApi.md#getPreferenceUsingGET) | **GET** /v1/preferences/{preferenceKey} | Get preference
*PreferenceApi* | [**savePreferenceUsingPUT**](docs/PreferenceApi.md#savePreferenceUsingPUT) | **PUT** /v1/preferences/{preferenceKey} | Create/Save preference
*ProcessDefinitionAdminControllerImplApi* | [**getAllProcessDefinitionsUsingGET**](docs/ProcessDefinitionAdminControllerImplApi.md#getAllProcessDefinitionsUsingGET) | **GET** /admin/v1/process-definitions | getAllProcessDefinitions
*ProcessDefinitionControllerImplApi* | [**getBpmnModelUsingGET**](docs/ProcessDefinitionControllerImplApi.md#getBpmnModelUsingGET) | **GET** /v1/process-definitions/{id}/model | getProcessModel
*ProcessDefinitionControllerImplApi* | [**getProcessDefinitionUsingGET**](docs/ProcessDefinitionControllerImplApi.md#getProcessDefinitionUsingGET) | **GET** /v1/process-definitions/{id} | getProcessDefinition
*ProcessDefinitionControllerImplApi* | [**getProcessDefinitionsUsingGET**](docs/ProcessDefinitionControllerImplApi.md#getProcessDefinitionsUsingGET) | **GET** /v1/process-definitions | getProcessDefinitions
*ProcessDefinitionMetaControllerImplApi* | [**getProcessDefinitionMetadataUsingGET**](docs/ProcessDefinitionMetaControllerImplApi.md#getProcessDefinitionMetadataUsingGET) | **GET** /v1/process-definitions/{id}/meta | getProcessDefinitionMetadata
*ProcessInstanceAdminControllerImplApi* | [**deleteProcessInstanceUsingDELETE**](docs/ProcessInstanceAdminControllerImplApi.md#deleteProcessInstanceUsingDELETE) | **DELETE** /admin/v1/process-instances/{processInstanceId} | deleteProcessInstance
*ProcessInstanceAdminControllerImplApi* | [**getProcessInstanceByIdUsingGET**](docs/ProcessInstanceAdminControllerImplApi.md#getProcessInstanceByIdUsingGET) | **GET** /admin/v1/process-instances/{processInstanceId} | getProcessInstanceById
*ProcessInstanceAdminControllerImplApi* | [**getProcessInstancesUsingGET**](docs/ProcessInstanceAdminControllerImplApi.md#getProcessInstancesUsingGET) | **GET** /admin/v1/process-instances | getProcessInstances
*ProcessInstanceAdminControllerImplApi* | [**receiveUsingPUT**](docs/ProcessInstanceAdminControllerImplApi.md#receiveUsingPUT) | **PUT** /admin/v1/process-instances/message | receive
*ProcessInstanceAdminControllerImplApi* | [**resumeUsingPOST**](docs/ProcessInstanceAdminControllerImplApi.md#resumeUsingPOST) | **POST** /admin/v1/process-instances/{processInstanceId}/resume | resume
*ProcessInstanceAdminControllerImplApi* | [**startProcessUsingPOST**](docs/ProcessInstanceAdminControllerImplApi.md#startProcessUsingPOST) | **POST** /admin/v1/process-instances | startProcess
*ProcessInstanceAdminControllerImplApi* | [**startUsingPOST**](docs/ProcessInstanceAdminControllerImplApi.md#startUsingPOST) | **POST** /admin/v1/process-instances/message | start
*ProcessInstanceAdminControllerImplApi* | [**subprocessesUsingGET**](docs/ProcessInstanceAdminControllerImplApi.md#subprocessesUsingGET) | **GET** /admin/v1/process-instances/{processInstanceId}/subprocesses | subprocesses
*ProcessInstanceAdminControllerImplApi* | [**suspendUsingPOST**](docs/ProcessInstanceAdminControllerImplApi.md#suspendUsingPOST) | **POST** /admin/v1/process-instances/{processInstanceId}/suspend | suspend
*ProcessInstanceAdminControllerImplApi* | [**updateProcessUsingPUT**](docs/ProcessInstanceAdminControllerImplApi.md#updateProcessUsingPUT) | **PUT** /admin/v1/process-instances/{processInstanceId} | updateProcess
*ProcessInstanceControllerImplApi* | [**createProcessInstanceUsingPOST**](docs/ProcessInstanceControllerImplApi.md#createProcessInstanceUsingPOST) | **POST** /v1/process-instances/create | createProcessInstance
*ProcessInstanceControllerImplApi* | [**deleteProcessInstanceUsingDELETE1**](docs/ProcessInstanceControllerImplApi.md#deleteProcessInstanceUsingDELETE1) | **DELETE** /v1/process-instances/{processInstanceId} | deleteProcessInstance
*ProcessInstanceControllerImplApi* | [**getProcessDiagramUsingGET**](docs/ProcessInstanceControllerImplApi.md#getProcessDiagramUsingGET) | **GET** /v1/process-instances/{processInstanceId}/model | getProcessDiagram
*ProcessInstanceControllerImplApi* | [**getProcessInstanceByIdUsingGET1**](docs/ProcessInstanceControllerImplApi.md#getProcessInstanceByIdUsingGET1) | **GET** /v1/process-instances/{processInstanceId} | getProcessInstanceById
*ProcessInstanceControllerImplApi* | [**getProcessInstancesUsingGET1**](docs/ProcessInstanceControllerImplApi.md#getProcessInstancesUsingGET1) | **GET** /v1/process-instances | getProcessInstances
*ProcessInstanceControllerImplApi* | [**receiveUsingPUT1**](docs/ProcessInstanceControllerImplApi.md#receiveUsingPUT1) | **PUT** /v1/process-instances/message | receive
*ProcessInstanceControllerImplApi* | [**resumeUsingPOST1**](docs/ProcessInstanceControllerImplApi.md#resumeUsingPOST1) | **POST** /v1/process-instances/{processInstanceId}/resume | resume
*ProcessInstanceControllerImplApi* | [**sendSignalUsingPOST**](docs/ProcessInstanceControllerImplApi.md#sendSignalUsingPOST) | **POST** /v1/process-instances/signal | sendSignal
*ProcessInstanceControllerImplApi* | [**sendStartMessageUsingPOST**](docs/ProcessInstanceControllerImplApi.md#sendStartMessageUsingPOST) | **POST** /v1/process-instances/message | sendStartMessage
*ProcessInstanceControllerImplApi* | [**startCreatedProcessUsingPOST**](docs/ProcessInstanceControllerImplApi.md#startCreatedProcessUsingPOST) | **POST** /v1/process-instances/{processInstanceId}/start | startCreatedProcess
*ProcessInstanceControllerImplApi* | [**startProcessUsingPOST1**](docs/ProcessInstanceControllerImplApi.md#startProcessUsingPOST1) | **POST** /v1/process-instances | startProcess
*ProcessInstanceControllerImplApi* | [**subprocessesUsingGET1**](docs/ProcessInstanceControllerImplApi.md#subprocessesUsingGET1) | **GET** /v1/process-instances/{processInstanceId}/subprocesses | subprocesses
*ProcessInstanceControllerImplApi* | [**suspendUsingPOST1**](docs/ProcessInstanceControllerImplApi.md#suspendUsingPOST1) | **POST** /v1/process-instances/{processInstanceId}/suspend | suspend
*ProcessInstanceControllerImplApi* | [**updateProcessUsingPUT1**](docs/ProcessInstanceControllerImplApi.md#updateProcessUsingPUT1) | **PUT** /v1/process-instances/{processInstanceId} | updateProcess
*ProcessInstanceTasksControllerImplApi* | [**getTasksUsingGET**](docs/ProcessInstanceTasksControllerImplApi.md#getTasksUsingGET) | **GET** /v1/process-instances/{processInstanceId}/tasks | getTasks
*ProcessInstanceVariableAdminControllerImplApi* | [**removeVariablesUsingDELETE**](docs/ProcessInstanceVariableAdminControllerImplApi.md#removeVariablesUsingDELETE) | **DELETE** /admin/v1/process-instances/{processInstanceId}/variables | removeVariables
*ProcessInstanceVariableAdminControllerImplApi* | [**updateVariablesUsingPUT**](docs/ProcessInstanceVariableAdminControllerImplApi.md#updateVariablesUsingPUT) | **PUT** /admin/v1/process-instances/{processInstanceId}/variables | updateVariables
*ProcessInstanceVariableControllerImplApi* | [**getVariablesUsingGET**](docs/ProcessInstanceVariableControllerImplApi.md#getVariablesUsingGET) | **GET** /v1/process-instances/{processInstanceId}/variables | getVariables
*ProcessInstanceVariableControllerImplApi* | [**setVariablesUsingPOST**](docs/ProcessInstanceVariableControllerImplApi.md#setVariablesUsingPOST) | **POST** /v1/process-instances/{processInstanceId}/variables | setVariables
*TaskAdminControllerImplApi* | [**assignUsingPOST**](docs/TaskAdminControllerImplApi.md#assignUsingPOST) | **POST** /admin/v1/tasks/{taskId}/assign | assign
*TaskAdminControllerImplApi* | [**completeTaskUsingPOST**](docs/TaskAdminControllerImplApi.md#completeTaskUsingPOST) | **POST** /admin/v1/tasks/{taskId}/complete | completeTask
*TaskAdminControllerImplApi* | [**deleteTaskUsingDELETE**](docs/TaskAdminControllerImplApi.md#deleteTaskUsingDELETE) | **DELETE** /admin/v1/tasks/{taskId} | deleteTask
*TaskAdminControllerImplApi* | [**getTaskByIdUsingGET**](docs/TaskAdminControllerImplApi.md#getTaskByIdUsingGET) | **GET** /admin/v1/tasks/{taskId} | getTaskById
*TaskAdminControllerImplApi* | [**getTasksUsingGET1**](docs/TaskAdminControllerImplApi.md#getTasksUsingGET1) | **GET** /admin/v1/tasks | getTasks
*TaskAdminControllerImplApi* | [**updateTaskUsingPUT**](docs/TaskAdminControllerImplApi.md#updateTaskUsingPUT) | **PUT** /admin/v1/tasks/{taskId} | updateTask
*TaskControllerImplApi* | [**assignUsingPOST1**](docs/TaskControllerImplApi.md#assignUsingPOST1) | **POST** /v1/tasks/{taskId}/assign | assign
*TaskControllerImplApi* | [**claimTaskUsingPOST**](docs/TaskControllerImplApi.md#claimTaskUsingPOST) | **POST** /v1/tasks/{taskId}/claim | claimTask
*TaskControllerImplApi* | [**completeTaskUsingPOST1**](docs/TaskControllerImplApi.md#completeTaskUsingPOST1) | **POST** /v1/tasks/{taskId}/complete | completeTask
*TaskControllerImplApi* | [**createNewTaskUsingPOST**](docs/TaskControllerImplApi.md#createNewTaskUsingPOST) | **POST** /v1/tasks | createNewTask
*TaskControllerImplApi* | [**deleteTaskUsingDELETE1**](docs/TaskControllerImplApi.md#deleteTaskUsingDELETE1) | **DELETE** /v1/tasks/{taskId} | deleteTask
*TaskControllerImplApi* | [**getSubtasksUsingGET**](docs/TaskControllerImplApi.md#getSubtasksUsingGET) | **GET** /v1/tasks/{taskId}/subtasks | getSubtasks
*TaskControllerImplApi* | [**getTaskByIdUsingGET1**](docs/TaskControllerImplApi.md#getTaskByIdUsingGET1) | **GET** /v1/tasks/{taskId} | getTaskById
*TaskControllerImplApi* | [**getTasksUsingGET2**](docs/TaskControllerImplApi.md#getTasksUsingGET2) | **GET** /v1/tasks | getTasks
*TaskControllerImplApi* | [**releaseTaskUsingPOST**](docs/TaskControllerImplApi.md#releaseTaskUsingPOST) | **POST** /v1/tasks/{taskId}/release | releaseTask
*TaskControllerImplApi* | [**saveTaskUsingPOST**](docs/TaskControllerImplApi.md#saveTaskUsingPOST) | **POST** /v1/tasks/{taskId}/save | saveTask
*TaskControllerImplApi* | [**updateTaskUsingPUT1**](docs/TaskControllerImplApi.md#updateTaskUsingPUT1) | **PUT** /v1/tasks/{taskId} | updateTask
*TaskVariableAdminControllerImplApi* | [**createVariableUsingPOST**](docs/TaskVariableAdminControllerImplApi.md#createVariableUsingPOST) | **POST** /admin/v1/tasks/{taskId}/variables | createVariable
*TaskVariableAdminControllerImplApi* | [**getVariablesUsingGET1**](docs/TaskVariableAdminControllerImplApi.md#getVariablesUsingGET1) | **GET** /admin/v1/tasks/{taskId}/variables | getVariables
*TaskVariableAdminControllerImplApi* | [**updateVariableUsingPUT**](docs/TaskVariableAdminControllerImplApi.md#updateVariableUsingPUT) | **PUT** /admin/v1/tasks/{taskId}/variables/{variableName} | updateVariable
*TaskVariableControllerImplApi* | [**createVariableUsingPOST1**](docs/TaskVariableControllerImplApi.md#createVariableUsingPOST1) | **POST** /v1/tasks/{taskId}/variables | createVariable
*TaskVariableControllerImplApi* | [**getVariablesUsingGET2**](docs/TaskVariableControllerImplApi.md#getVariablesUsingGET2) | **GET** /v1/tasks/{taskId}/variables | getVariables
*TaskVariableControllerImplApi* | [**updateVariableUsingPUT1**](docs/TaskVariableControllerImplApi.md#updateVariableUsingPUT1) | **PUT** /v1/tasks/{taskId}/variables/{variableName} | updateVariable
*UserActionsApi* | [**sendNamedEventUsingPOST**](docs/UserActionsApi.md#sendNamedEventUsingPOST) | **POST** /v1/user-action/event/{uiName}/{eventName}/send | Send a named event
*UserActionsApi* | [**submitFormUsingPOST2**](docs/UserActionsApi.md#submitFormUsingPOST2) | **POST** /v1/user-action/form/{formId}/submit | Submit forms latest version


## Documentation for Models

 - [ActionDefinition](docs/ActionDefinition.md)
 - [AnnotatedElement](docs/AnnotatedElement.md)
 - [AnnotatedMember](docs/AnnotatedMember.md)
 - [Annotation](docs/Annotation.md)
 - [AnnotationMap](docs/AnnotationMap.md)
 - [AssignTaskPayload](docs/AssignTaskPayload.md)
 - [CandidateGroup](docs/CandidateGroup.md)
 - [CandidateGroupsPayload](docs/CandidateGroupsPayload.md)
 - [CandidateUser](docs/CandidateUser.md)
 - [CandidateUsersPayload](docs/CandidateUsersPayload.md)
 - [CloudProcessDefinition](docs/CloudProcessDefinition.md)
 - [CloudProcessInstance](docs/CloudProcessInstance.md)
 - [CloudTask](docs/CloudTask.md)
 - [CloudVariableInstance](docs/CloudVariableInstance.md)
 - [CompleteTaskPayload](docs/CompleteTaskPayload.md)
 - [ConnectorDefinition](docs/ConnectorDefinition.md)
 - [CreateProcessInstancePayload](docs/CreateProcessInstancePayload.md)
 - [CreateTaskPayload](docs/CreateTaskPayload.md)
 - [CreateTaskVariablePayload](docs/CreateTaskVariablePayload.md)
 - [EntriesResponseContentCandidateGroup](docs/EntriesResponseContentCandidateGroup.md)
 - [EntriesResponseContentCandidateUser](docs/EntriesResponseContentCandidateUser.md)
 - [EntriesResponseContentCloudProcessDefinition](docs/EntriesResponseContentCloudProcessDefinition.md)
 - [EntriesResponseContentCloudProcessInstance](docs/EntriesResponseContentCloudProcessInstance.md)
 - [EntriesResponseContentCloudTask](docs/EntriesResponseContentCloudTask.md)
 - [EntriesResponseContentCloudVariableInstance](docs/EntriesResponseContentCloudVariableInstance.md)
 - [EntriesResponseContentConnectorDefinition](docs/EntriesResponseContentConnectorDefinition.md)
 - [EntriesResponseContentPreference](docs/EntriesResponseContentPreference.md)
 - [EntryResponseContentCandidateGroup](docs/EntryResponseContentCandidateGroup.md)
 - [EntryResponseContentCandidateUser](docs/EntryResponseContentCandidateUser.md)
 - [EntryResponseContentCloudProcessDefinition](docs/EntryResponseContentCloudProcessDefinition.md)
 - [EntryResponseContentCloudProcessInstance](docs/EntryResponseContentCloudProcessInstance.md)
 - [EntryResponseContentCloudTask](docs/EntryResponseContentCloudTask.md)
 - [EntryResponseContentCloudVariableInstance](docs/EntryResponseContentCloudVariableInstance.md)
 - [EntryResponseContentConnectorDefinition](docs/EntryResponseContentConnectorDefinition.md)
 - [EntryResponseContentHomeResource](docs/EntryResponseContentHomeResource.md)
 - [EntryResponseContentPreference](docs/EntryResponseContentPreference.md)
 - [EntryResponseContentProcessDefinitionMeta](docs/EntryResponseContentProcessDefinitionMeta.md)
 - [HomeResource](docs/HomeResource.md)
 - [JavaType](docs/JavaType.md)
 - [JsonDeserializerobject](docs/JsonDeserializerobject.md)
 - [ListResponseContentCandidateGroup](docs/ListResponseContentCandidateGroup.md)
 - [ListResponseContentCandidateUser](docs/ListResponseContentCandidateUser.md)
 - [ListResponseContentCloudProcessDefinition](docs/ListResponseContentCloudProcessDefinition.md)
 - [ListResponseContentCloudProcessInstance](docs/ListResponseContentCloudProcessInstance.md)
 - [ListResponseContentCloudTask](docs/ListResponseContentCloudTask.md)
 - [ListResponseContentCloudVariableInstance](docs/ListResponseContentCloudVariableInstance.md)
 - [ListResponseContentConnectorDefinition](docs/ListResponseContentConnectorDefinition.md)
 - [ListResponseContentPreference](docs/ListResponseContentPreference.md)
 - [Member](docs/Member.md)
 - [MergeInfo](docs/MergeInfo.md)
 - [NamedEventBody](docs/NamedEventBody.md)
 - [NullValueProvider](docs/NullValueProvider.md)
 - [ObjectIdGeneratorobject](docs/ObjectIdGeneratorobject.md)
 - [ObjectIdInfo](docs/ObjectIdInfo.md)
 - [ObjectIdReader](docs/ObjectIdReader.md)
 - [ObjectIdResolver](docs/ObjectIdResolver.md)
 - [PaginationMetadata](docs/PaginationMetadata.md)
 - [Preference](docs/Preference.md)
 - [ProcessDefinitionMeta](docs/ProcessDefinitionMeta.md)
 - [ProcessDefinitionServiceTask](docs/ProcessDefinitionServiceTask.md)
 - [ProcessDefinitionUserTask](docs/ProcessDefinitionUserTask.md)
 - [ProcessDefinitionVariable](docs/ProcessDefinitionVariable.md)
 - [PropertyMetadata](docs/PropertyMetadata.md)
 - [PropertyName](docs/PropertyName.md)
 - [ReceiveMessagePayload](docs/ReceiveMessagePayload.md)
 - [RemoveProcessVariablesPayload](docs/RemoveProcessVariablesPayload.md)
 - [ResponseEntity](docs/ResponseEntity.md)
 - [ResponseEntityFormSummaryView](docs/ResponseEntityFormSummaryView.md)
 - [SaveFormRepresentation](docs/SaveFormRepresentation.md)
 - [SaveTaskPayload](docs/SaveTaskPayload.md)
 - [SetProcessVariablesPayload](docs/SetProcessVariablesPayload.md)
 - [SettableBeanProperty](docs/SettableBeanProperty.md)
 - [SignalPayload](docs/SignalPayload.md)
 - [StartMessagePayload](docs/StartMessagePayload.md)
 - [StartProcessPayload](docs/StartProcessPayload.md)
 - [SubmitFormRepresentation](docs/SubmitFormRepresentation.md)
 - [TypeBindings](docs/TypeBindings.md)
 - [TypeDeserializer](docs/TypeDeserializer.md)
 - [TypeIdResolver](docs/TypeIdResolver.md)
 - [TypeResolutionContext](docs/TypeResolutionContext.md)
 - [UpdateProcessPayload](docs/UpdateProcessPayload.md)
 - [UpdateTaskPayload](docs/UpdateTaskPayload.md)
 - [UpdateTaskVariablePayload](docs/UpdateTaskVariablePayload.md)
 - [VariableDefinition](docs/VariableDefinition.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



