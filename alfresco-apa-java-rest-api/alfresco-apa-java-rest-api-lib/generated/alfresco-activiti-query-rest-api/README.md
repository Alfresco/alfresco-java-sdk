# alfresco-activiti-query-rest-api

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
    <artifactId>alfresco-activiti-query-rest-api</artifactId>
    <version>5.1.2-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-activiti-query-rest-api:5.1.2-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-activiti-query-rest-api-5.1.2-SNAPSHOT.jar
* target/lib/*.jar


## Documentation for API Endpoints

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationAdminControllerApi* | [**findAllUsingGET**](docs/ApplicationAdminControllerApi.md#findAllUsingGET) | **GET** /admin/v1/applications | findAll
*ApplicationControllerApi* | [**findAllUsingGET1**](docs/ApplicationControllerApi.md#findAllUsingGET1) | **GET** /v1/applications | findAll
*AuditEventsAdminControllerImplApi* | [**findAllUsingGET2**](docs/AuditEventsAdminControllerImplApi.md#findAllUsingGET2) | **GET** /admin/v1/events | findAll
*AuditEventsControllerImplApi* | [**findAllUsingGET3**](docs/AuditEventsControllerImplApi.md#findAllUsingGET3) | **GET** /v1/events | findAll
*AuditEventsControllerImplApi* | [**findByIdUsingGET**](docs/AuditEventsControllerImplApi.md#findByIdUsingGET) | **GET** /v1/events/{eventId} | findById
*AuditEventsDeleteControllerApi* | [**deleteEventsUsingDELETE**](docs/AuditEventsDeleteControllerApi.md#deleteEventsUsingDELETE) | **DELETE** /admin/v1/events | deleteEvents
*CleanupQueryProcessInstancesJobExecutionControllerApi* | [**launchUsingPOST**](docs/CleanupQueryProcessInstancesJobExecutionControllerApi.md#launchUsingPOST) | **POST** /admin/v1/batch/jobs/executions/cleanup-query-process-instance-history-job | launch
*JobControllerApi* | [**allUsingGET**](docs/JobControllerApi.md#allUsingGET) | **GET** /admin/v1/batch/jobs | all
*JobControllerApi* | [**getUsingGET**](docs/JobControllerApi.md#getUsingGET) | **GET** /admin/v1/batch/jobs/{jobName} | get
*JobExecutionControllerApi* | [**allUsingGET1**](docs/JobExecutionControllerApi.md#allUsingGET1) | **GET** /admin/v1/batch/jobs/executions | all
*JobExecutionControllerApi* | [**getUsingGET1**](docs/JobExecutionControllerApi.md#getUsingGET1) | **GET** /admin/v1/batch/jobs/executions/{id} | get
*JobExecutionControllerApi* | [**logUsingGET**](docs/JobExecutionControllerApi.md#logUsingGET) | **GET** /admin/v1/batch/jobs/executions/{executionId}/log | log
*JobExecutionControllerApi* | [**postUsingPOST**](docs/JobExecutionControllerApi.md#postUsingPOST) | **POST** /admin/v1/batch/jobs/executions | post
*ProcessDefinitionAdminControllerApi* | [**findAllUsingGET4**](docs/ProcessDefinitionAdminControllerApi.md#findAllUsingGET4) | **GET** /admin/v1/process-definitions | findAll
*ProcessDefinitionControllerApi* | [**findAllUsingGET5**](docs/ProcessDefinitionControllerApi.md#findAllUsingGET5) | **GET** /v1/process-definitions | findAll
*ProcessInstanceAdminControllerApi* | [**findAllUsingGET6**](docs/ProcessInstanceAdminControllerApi.md#findAllUsingGET6) | **GET** /admin/v1/process-instances | findAll
*ProcessInstanceAdminControllerApi* | [**findByIdUsingGET1**](docs/ProcessInstanceAdminControllerApi.md#findByIdUsingGET1) | **GET** /admin/v1/process-instances/{processInstanceId} | findById
*ProcessInstanceControllerApi* | [**findAllUsingGET7**](docs/ProcessInstanceControllerApi.md#findAllUsingGET7) | **GET** /v1/process-instances | findAll
*ProcessInstanceControllerApi* | [**findByIdUsingGET2**](docs/ProcessInstanceControllerApi.md#findByIdUsingGET2) | **GET** /v1/process-instances/{processInstanceId} | findById
*ProcessInstanceControllerApi* | [**subprocessesUsingGET**](docs/ProcessInstanceControllerApi.md#subprocessesUsingGET) | **GET** /v1/process-instances/{processInstanceId}/subprocesses | subprocesses
*ProcessInstanceDeleteControllerApi* | [**deleteProcessInstancesUsingDELETE**](docs/ProcessInstanceDeleteControllerApi.md#deleteProcessInstancesUsingDELETE) | **DELETE** /admin/v1/process-instances | deleteProcessInstances
*ProcessInstanceDiagramAdminControllerApi* | [**getProcessDiagramUsingGET**](docs/ProcessInstanceDiagramAdminControllerApi.md#getProcessDiagramUsingGET) | **GET** /admin/v1/process-instances/{processInstanceId}/diagram | getProcessDiagram
*ProcessInstanceDiagramControllerApi* | [**getProcessDiagramUsingGET1**](docs/ProcessInstanceDiagramControllerApi.md#getProcessDiagramUsingGET1) | **GET** /v1/process-instances/{processInstanceId}/diagram | getProcessDiagram
*ProcessInstanceServiceTasksAdminControllerApi* | [**getTasksUsingGET**](docs/ProcessInstanceServiceTasksAdminControllerApi.md#getTasksUsingGET) | **GET** /admin/v1/process-instances/{processInstanceId}/service-tasks | getTasks
*ProcessInstanceTasksControllerApi* | [**getTasksUsingGET1**](docs/ProcessInstanceTasksControllerApi.md#getTasksUsingGET1) | **GET** /v1/process-instances/{processInstanceId}/tasks | getTasks
*ProcessInstanceVariableAdminControllerApi* | [**getVariablesUsingGET**](docs/ProcessInstanceVariableAdminControllerApi.md#getVariablesUsingGET) | **GET** /admin/v1/process-instances/{processInstanceId}/variables | getVariables
*ProcessInstanceVariableControllerApi* | [**getVariablesUsingGET1**](docs/ProcessInstanceVariableControllerApi.md#getVariablesUsingGET1) | **GET** /v1/process-instances/{processInstanceId}/variables | getVariables
*ProcessModelAdminControllerApi* | [**getProcessModelUsingGET**](docs/ProcessModelAdminControllerApi.md#getProcessModelUsingGET) | **GET** /admin/v1/process-definitions/{processDefinitionId}/model | getProcessModel
*ProcessModelControllerApi* | [**getProcessModelUsingGET1**](docs/ProcessModelControllerApi.md#getProcessModelUsingGET1) | **GET** /v1/process-definitions/{processDefinitionId}/model | getProcessModel
*ServiceTaskAdminControllerApi* | [**findAllUsingGET8**](docs/ServiceTaskAdminControllerApi.md#findAllUsingGET8) | **GET** /admin/v1/service-tasks | findAll
*ServiceTaskAdminControllerApi* | [**findByIdUsingGET3**](docs/ServiceTaskAdminControllerApi.md#findByIdUsingGET3) | **GET** /admin/v1/service-tasks/{serviceTaskId} | findById
*ServiceTaskIntegrationContextAdminControllerApi* | [**findByIdUsingGET4**](docs/ServiceTaskIntegrationContextAdminControllerApi.md#findByIdUsingGET4) | **GET** /admin/v1/service-tasks/{serviceTaskId}/integration-context | findById
*TaskAdminControllerApi* | [**findAllUsingGET9**](docs/TaskAdminControllerApi.md#findAllUsingGET9) | **GET** /admin/v1/tasks | findAll
*TaskAdminControllerApi* | [**findByIdUsingGET5**](docs/TaskAdminControllerApi.md#findByIdUsingGET5) | **GET** /admin/v1/tasks/{taskId} | findById
*TaskAdminControllerApi* | [**getTaskCandidateGroupsUsingGET**](docs/TaskAdminControllerApi.md#getTaskCandidateGroupsUsingGET) | **GET** /admin/v1/tasks/{taskId}/candidate-groups | getTaskCandidateGroups
*TaskAdminControllerApi* | [**getTaskCandidateUsersUsingGET**](docs/TaskAdminControllerApi.md#getTaskCandidateUsersUsingGET) | **GET** /admin/v1/tasks/{taskId}/candidate-users | getTaskCandidateUsers
*TaskControllerApi* | [**findAllUsingGET10**](docs/TaskControllerApi.md#findAllUsingGET10) | **GET** /v1/tasks | findAll
*TaskControllerApi* | [**findByIdUsingGET6**](docs/TaskControllerApi.md#findByIdUsingGET6) | **GET** /v1/tasks/{taskId} | findById
*TaskControllerApi* | [**getTaskCandidateGroupsUsingGET1**](docs/TaskControllerApi.md#getTaskCandidateGroupsUsingGET1) | **GET** /v1/tasks/{taskId}/candidate-groups | getTaskCandidateGroups
*TaskControllerApi* | [**getTaskCandidateUsersUsingGET1**](docs/TaskControllerApi.md#getTaskCandidateUsersUsingGET1) | **GET** /v1/tasks/{taskId}/candidate-users | getTaskCandidateUsers
*TaskDeleteControllerApi* | [**deleteTasksUsingDELETE**](docs/TaskDeleteControllerApi.md#deleteTasksUsingDELETE) | **DELETE** /admin/v1/tasks | deleteTasks
*TaskVariableAdminControllerApi* | [**getVariablesUsingGET2**](docs/TaskVariableAdminControllerApi.md#getVariablesUsingGET2) | **GET** /admin/v1/tasks/{taskId}/variables | getVariables
*TaskVariableControllerApi* | [**getVariablesUsingGET3**](docs/TaskVariableControllerApi.md#getVariablesUsingGET3) | **GET** /v1/tasks/{taskId}/variables | getVariables

## Documentation for Models

 - [CleanupQueryProcessInstancesJobRequest](docs/CleanupQueryProcessInstancesJobRequest.md)
 - [CloudApplication](docs/CloudApplication.md)
 - [CloudIntegrationContext](docs/CloudIntegrationContext.md)
 - [CloudProcessDefinition](docs/CloudProcessDefinition.md)
 - [CloudProcessInstance](docs/CloudProcessInstance.md)
 - [CloudRuntimeEventModel](docs/CloudRuntimeEventModel.md)
 - [CloudServiceTask](docs/CloudServiceTask.md)
 - [CloudVariableInstance](docs/CloudVariableInstance.md)
 - [EntriesResponseContentOfCloudApplication](docs/EntriesResponseContentOfCloudApplication.md)
 - [EntriesResponseContentOfCloudProcessDefinition](docs/EntriesResponseContentOfCloudProcessDefinition.md)
 - [EntriesResponseContentOfCloudProcessInstance](docs/EntriesResponseContentOfCloudProcessInstance.md)
 - [EntriesResponseContentOfCloudRuntimeEventOfobjectAndstring](docs/EntriesResponseContentOfCloudRuntimeEventOfobjectAndstring.md)
 - [EntriesResponseContentOfCloudServiceTask](docs/EntriesResponseContentOfCloudServiceTask.md)
 - [EntriesResponseContentOfCloudVariableInstance](docs/EntriesResponseContentOfCloudVariableInstance.md)
 - [EntriesResponseContentOfJob](docs/EntriesResponseContentOfJob.md)
 - [EntriesResponseContentOfJobExecution](docs/EntriesResponseContentOfJobExecution.md)
 - [EntriesResponseContentOfQueryCloudTask](docs/EntriesResponseContentOfQueryCloudTask.md)
 - [EntryResponseContentOfCloudApplication](docs/EntryResponseContentOfCloudApplication.md)
 - [EntryResponseContentOfCloudIntegrationContext](docs/EntryResponseContentOfCloudIntegrationContext.md)
 - [EntryResponseContentOfCloudProcessDefinition](docs/EntryResponseContentOfCloudProcessDefinition.md)
 - [EntryResponseContentOfCloudProcessInstance](docs/EntryResponseContentOfCloudProcessInstance.md)
 - [EntryResponseContentOfCloudRuntimeEventOfobjectAndstring](docs/EntryResponseContentOfCloudRuntimeEventOfobjectAndstring.md)
 - [EntryResponseContentOfCloudServiceTask](docs/EntryResponseContentOfCloudServiceTask.md)
 - [EntryResponseContentOfCloudVariableInstance](docs/EntryResponseContentOfCloudVariableInstance.md)
 - [EntryResponseContentOfJob](docs/EntryResponseContentOfJob.md)
 - [EntryResponseContentOfJobExecution](docs/EntryResponseContentOfJobExecution.md)
 - [EntryResponseContentOfQueryCloudTask](docs/EntryResponseContentOfQueryCloudTask.md)
 - [InputStream](docs/InputStream.md)
 - [InputStreamResource](docs/InputStreamResource.md)
 - [Job](docs/Job.md)
 - [JobConfig](docs/JobConfig.md)
 - [JobExecution](docs/JobExecution.md)
 - [Links](docs/Links.md)
 - [ListResponseContentOfCloudApplication](docs/ListResponseContentOfCloudApplication.md)
 - [ListResponseContentOfCloudProcessDefinition](docs/ListResponseContentOfCloudProcessDefinition.md)
 - [ListResponseContentOfCloudProcessInstance](docs/ListResponseContentOfCloudProcessInstance.md)
 - [ListResponseContentOfCloudRuntimeEventOfobjectAndstring](docs/ListResponseContentOfCloudRuntimeEventOfobjectAndstring.md)
 - [ListResponseContentOfCloudServiceTask](docs/ListResponseContentOfCloudServiceTask.md)
 - [ListResponseContentOfCloudVariableInstance](docs/ListResponseContentOfCloudVariableInstance.md)
 - [ListResponseContentOfJob](docs/ListResponseContentOfJob.md)
 - [ListResponseContentOfJobExecution](docs/ListResponseContentOfJobExecution.md)
 - [ListResponseContentOfQueryCloudTask](docs/ListResponseContentOfQueryCloudTask.md)
 - [PaginationMetadata](docs/PaginationMetadata.md)
 - [QueryCloudTask](docs/QueryCloudTask.md)
 - [StackTraceElement](docs/StackTraceElement.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:
