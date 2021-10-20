# alfresco-activiti-rest-api

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
    <artifactId>alfresco-activiti-rest-api</artifactId>
    <version>7.1.0-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.alfresco:alfresco-activiti-rest-api:7.1.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-activiti-rest-api-7.1.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
  import com.alfresco.activiti.*;
  import com.alfresco.activiti.auth.*;
  import com.alfresco.activiti.model.*;
  import com.alfresco.activiti.handler.AboutApi;

  import java.io.File;
  import java.util.*;

  public class AboutApiExample {

  public static void main(String[] args) {






  AboutApi apiInstance = new AboutApi();
  try {
  String result = apiInstance.getAppVersionUsingGET();
    System.out.println(result);
  } catch (ApiException e) {
  System.err.println("Exception when calling AboutApi#getAppVersionUsingGET");
  e.printStackTrace();
  }
  }
  }
```

## Documentation for API Endpoints

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AboutApi* | [**getAppVersionUsingGET**](docs/AboutApi.md#getAppVersionUsingGET) | **GET** /activiti-app/api/enterprise/app-version | Get server type and version
*AccountIntegrationApi* | [**getAccountsUsingGET**](docs/AccountIntegrationApi.md#getAccountsUsingGET) | **GET** /activiti-app/api/enterprise/account/integration | Retrieve external account information
*AdminEndpointsApi* | [**createBasicAuthConfigurationUsingPOST**](docs/AdminEndpointsApi.md#createBasicAuthConfigurationUsingPOST) | **POST** /activiti-app/api/enterprise/admin/basic-auths | Add an endpoint authorization
*AdminEndpointsApi* | [**createEndpointConfigurationUsingPOST**](docs/AdminEndpointsApi.md#createEndpointConfigurationUsingPOST) | **POST** /activiti-app/api/enterprise/admin/endpoints | Create an endpoint
*AdminEndpointsApi* | [**getBasicAuthConfigurationUsingGET**](docs/AdminEndpointsApi.md#getBasicAuthConfigurationUsingGET) | **GET** /activiti-app/api/enterprise/admin/basic-auths/{basicAuthId} | Get an endpoint authorization
*AdminEndpointsApi* | [**getBasicAuthConfigurationsUsingGET**](docs/AdminEndpointsApi.md#getBasicAuthConfigurationsUsingGET) | **GET** /activiti-app/api/enterprise/admin/basic-auths | List endpoint authorizations
*AdminEndpointsApi* | [**getEndpointConfigurationUsingGET1**](docs/AdminEndpointsApi.md#getEndpointConfigurationUsingGET1) | **GET** /activiti-app/api/enterprise/admin/endpoints/{endpointConfigurationId} | Get an endpoint
*AdminEndpointsApi* | [**getEndpointConfigurationsUsingGET1**](docs/AdminEndpointsApi.md#getEndpointConfigurationsUsingGET1) | **GET** /activiti-app/api/enterprise/admin/endpoints | List endpoints
*AdminEndpointsApi* | [**removeBasicAuthonfigurationUsingDELETE**](docs/AdminEndpointsApi.md#removeBasicAuthonfigurationUsingDELETE) | **DELETE** /activiti-app/api/enterprise/admin/basic-auths/{basicAuthId} | Delete an endpoint authorization
*AdminEndpointsApi* | [**removeEndpointConfigurationUsingDELETE**](docs/AdminEndpointsApi.md#removeEndpointConfigurationUsingDELETE) | **DELETE** /activiti-app/api/enterprise/admin/endpoints/{endpointConfigurationId} | Delete an endpoint
*AdminEndpointsApi* | [**updateBasicAuthConfigurationUsingPUT**](docs/AdminEndpointsApi.md#updateBasicAuthConfigurationUsingPUT) | **PUT** /activiti-app/api/enterprise/admin/basic-auths/{basicAuthId} | Update an endpoint authorization
*AdminEndpointsApi* | [**updateEndpointConfigurationUsingPUT**](docs/AdminEndpointsApi.md#updateEndpointConfigurationUsingPUT) | **PUT** /activiti-app/api/enterprise/admin/endpoints/{endpointConfigurationId} | Update an endpoint
*AdminGroupsApi* | [**activateUsingPOST**](docs/AdminGroupsApi.md#activateUsingPOST) | **POST** /activiti-app/api/enterprise/admin/groups/{groupId}/action/activate | Activate a group
*AdminGroupsApi* | [**addAllUsersToGroupUsingPOST**](docs/AdminGroupsApi.md#addAllUsersToGroupUsingPOST) | **POST** /activiti-app/api/enterprise/admin/groups/{groupId}/add-all-users | Add users to a group
*AdminGroupsApi* | [**addGroupCapabilitiesUsingPOST**](docs/AdminGroupsApi.md#addGroupCapabilitiesUsingPOST) | **POST** /activiti-app/api/enterprise/admin/groups/{groupId}/capabilities | Add capabilities to a group
*AdminGroupsApi* | [**addGroupMemberUsingPOST**](docs/AdminGroupsApi.md#addGroupMemberUsingPOST) | **POST** /activiti-app/api/enterprise/admin/groups/{groupId}/members/{userId} | Add a user to a group
*AdminGroupsApi* | [**addRelatedGroupUsingPOST**](docs/AdminGroupsApi.md#addRelatedGroupUsingPOST) | **POST** /activiti-app/api/enterprise/admin/groups/{groupId}/related-groups/{relatedGroupId} | Get a related group
*AdminGroupsApi* | [**createNewGroupUsingPOST**](docs/AdminGroupsApi.md#createNewGroupUsingPOST) | **POST** /activiti-app/api/enterprise/admin/groups | Create a group
*AdminGroupsApi* | [**deleteGroupCapabilityUsingDELETE**](docs/AdminGroupsApi.md#deleteGroupCapabilityUsingDELETE) | **DELETE** /activiti-app/api/enterprise/admin/groups/{groupId}/capabilities/{groupCapabilityId} | Remove a capability from a group
*AdminGroupsApi* | [**deleteGroupMemberUsingDELETE**](docs/AdminGroupsApi.md#deleteGroupMemberUsingDELETE) | **DELETE** /activiti-app/api/enterprise/admin/groups/{groupId}/members/{userId} | Delete a member from a group
*AdminGroupsApi* | [**deleteGroupUsingDELETE**](docs/AdminGroupsApi.md#deleteGroupUsingDELETE) | **DELETE** /activiti-app/api/enterprise/admin/groups/{groupId} | Delete a group
*AdminGroupsApi* | [**deleteRelatedGroupUsingDELETE**](docs/AdminGroupsApi.md#deleteRelatedGroupUsingDELETE) | **DELETE** /activiti-app/api/enterprise/admin/groups/{groupId}/related-groups/{relatedGroupId} | Delete a related group
*AdminGroupsApi* | [**getCapabilitiesUsingGET**](docs/AdminGroupsApi.md#getCapabilitiesUsingGET) | **GET** /activiti-app/api/enterprise/admin/groups/{groupId}/potential-capabilities | List group capabilities
*AdminGroupsApi* | [**getGroupUsersUsingGET**](docs/AdminGroupsApi.md#getGroupUsersUsingGET) | **GET** /activiti-app/api/enterprise/admin/groups/{groupId}/users | Get group members
*AdminGroupsApi* | [**getGroupUsingGET**](docs/AdminGroupsApi.md#getGroupUsingGET) | **GET** /activiti-app/api/enterprise/admin/groups/{groupId} | Get a group
*AdminGroupsApi* | [**getGroupsUsingGET1**](docs/AdminGroupsApi.md#getGroupsUsingGET1) | **GET** /activiti-app/api/enterprise/admin/groups | Query groups
*AdminGroupsApi* | [**getRelatedGroupsUsingGET**](docs/AdminGroupsApi.md#getRelatedGroupsUsingGET) | **GET** /activiti-app/api/enterprise/admin/groups/{groupId}/related-groups | Get related groups
*AdminGroupsApi* | [**updateGroupUsingPUT**](docs/AdminGroupsApi.md#updateGroupUsingPUT) | **PUT** /activiti-app/api/enterprise/admin/groups/{groupId} | Update a group
*AdminTenantsApi* | [**createTenantUsingPOST**](docs/AdminTenantsApi.md#createTenantUsingPOST) | **POST** /activiti-app/api/enterprise/admin/tenants | Create a tenant
*AdminTenantsApi* | [**deleteTenantUsingDELETE**](docs/AdminTenantsApi.md#deleteTenantUsingDELETE) | **DELETE** /activiti-app/api/enterprise/admin/tenants/{tenantId} | Delete a tenant
*AdminTenantsApi* | [**getTenantEventsUsingGET**](docs/AdminTenantsApi.md#getTenantEventsUsingGET) | **GET** /activiti-app/api/enterprise/admin/tenants/{tenantId}/events | Get tenant events
*AdminTenantsApi* | [**getTenantLogoUsingGET**](docs/AdminTenantsApi.md#getTenantLogoUsingGET) | **GET** /activiti-app/api/enterprise/admin/tenants/{tenantId}/logo | Get a tenant&#x27;s logo
*AdminTenantsApi* | [**getTenantUsingGET**](docs/AdminTenantsApi.md#getTenantUsingGET) | **GET** /activiti-app/api/enterprise/admin/tenants/{tenantId} | Get a tenant
*AdminTenantsApi* | [**getTenantsUsingGET**](docs/AdminTenantsApi.md#getTenantsUsingGET) | **GET** /activiti-app/api/enterprise/admin/tenants | List tenants
*AdminTenantsApi* | [**updateUsingPUT**](docs/AdminTenantsApi.md#updateUsingPUT) | **PUT** /activiti-app/api/enterprise/admin/tenants/{tenantId} | Update a tenant
*AdminTenantsApi* | [**uploadTenantLogoUsingPOST**](docs/AdminTenantsApi.md#uploadTenantLogoUsingPOST) | **POST** /activiti-app/api/enterprise/admin/tenants/{tenantId}/logo | Update a tenant&#x27;s logo
*AdminUsersApi* | [**bulkUpdateUsersUsingPUT**](docs/AdminUsersApi.md#bulkUpdateUsersUsingPUT) | **PUT** /activiti-app/api/enterprise/admin/users | Bulk update a list of users
*AdminUsersApi* | [**createNewUserUsingPOST**](docs/AdminUsersApi.md#createNewUserUsingPOST) | **POST** /activiti-app/api/enterprise/admin/users | Create a user
*AdminUsersApi* | [**getUserUsingGET**](docs/AdminUsersApi.md#getUserUsingGET) | **GET** /activiti-app/api/enterprise/admin/users/{userId} | Get a user
*AdminUsersApi* | [**getUsersUsingGET**](docs/AdminUsersApi.md#getUsersUsingGET) | **GET** /activiti-app/api/enterprise/admin/users | Query users
*AdminUsersApi* | [**updateUserDetailsUsingPUT**](docs/AdminUsersApi.md#updateUserDetailsUsingPUT) | **PUT** /activiti-app/api/enterprise/admin/users/{userId} | Update a user
*AppDefinitionsApi* | [**deleteAppDefinitionUsingDELETE**](docs/AppDefinitionsApi.md#deleteAppDefinitionUsingDELETE) | **DELETE** /activiti-app/api/enterprise/app-definitions/{appDefinitionId} | deleteAppDefinition
*AppDefinitionsApi* | [**exportAppDefinitionUsingGET**](docs/AppDefinitionsApi.md#exportAppDefinitionUsingGET) | **GET** /activiti-app/api/enterprise/app-definitions/{modelId}/export | Export an app definition
*AppDefinitionsApi* | [**getAppDefinitionUsingGET**](docs/AppDefinitionsApi.md#getAppDefinitionUsingGET) | **GET** /activiti-app/api/enterprise/app-definitions/{modelId} | Get an app definition
*AppDefinitionsApi* | [**importAndPublishAppUsingPOST**](docs/AppDefinitionsApi.md#importAndPublishAppUsingPOST) | **POST** /activiti-app/api/enterprise/app-definitions/{modelId}/publish-app | importAndPublishApp
*AppDefinitionsApi* | [**importAndPublishAppUsingPOST1**](docs/AppDefinitionsApi.md#importAndPublishAppUsingPOST1) | **POST** /activiti-app/api/enterprise/app-definitions/publish-app | importAndPublishApp
*AppDefinitionsApi* | [**importAppDefinitionUsingPOST**](docs/AppDefinitionsApi.md#importAppDefinitionUsingPOST) | **POST** /activiti-app/api/enterprise/app-definitions/{modelId}/import | Update the content of an existing app
*AppDefinitionsApi* | [**importAppDefinitionUsingPOST1**](docs/AppDefinitionsApi.md#importAppDefinitionUsingPOST1) | **POST** /activiti-app/api/enterprise/app-definitions/import | Import a new app definition
*AppDefinitionsApi* | [**publishAppDefinitionUsingPOST**](docs/AppDefinitionsApi.md#publishAppDefinitionUsingPOST) | **POST** /activiti-app/api/enterprise/app-definitions/{modelId}/publish | Publish an app definition
*AppDefinitionsApi* | [**updateAppDefinitionUsingPUT**](docs/AppDefinitionsApi.md#updateAppDefinitionUsingPUT) | **PUT** /activiti-app/api/enterprise/app-definitions/{modelId} | Update an app definition
*ChecklistsApi* | [**addSubtaskUsingPOST**](docs/ChecklistsApi.md#addSubtaskUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/checklist | Create a task checklist
*ChecklistsApi* | [**getChecklistUsingGET**](docs/ChecklistsApi.md#getChecklistUsingGET) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/checklist | Get checklist for a task
*ChecklistsApi* | [**orderChecklistUsingPUT**](docs/ChecklistsApi.md#orderChecklistUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/checklist | Change the order of items on a checklist
*CommentsApi* | [**addProcessInstanceCommentUsingPOST**](docs/CommentsApi.md#addProcessInstanceCommentUsingPOST) | **POST** /activiti-app/api/enterprise/process-instances/{processInstanceId}/comments | Add a comment to a process instance
*CommentsApi* | [**addTaskCommentUsingPOST**](docs/CommentsApi.md#addTaskCommentUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/comments | Add a comment to a task
*CommentsApi* | [**getProcessInstanceCommentsUsingGET**](docs/CommentsApi.md#getProcessInstanceCommentsUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/comments | Get comments for a process
*CommentsApi* | [**getTaskCommentsUsingGET**](docs/CommentsApi.md#getTaskCommentsUsingGET) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/comments | Get comments for a task
*ContentApi* | [**createRelatedContentOnProcessInstanceUsingPOST**](docs/ContentApi.md#createRelatedContentOnProcessInstanceUsingPOST) | **POST** /activiti-app/api/enterprise/process-instances/{processInstanceId}/content | Attach existing content to a process instance
*ContentApi* | [**createRelatedContentOnProcessInstanceUsingPOST1**](docs/ContentApi.md#createRelatedContentOnProcessInstanceUsingPOST1) | **POST** /activiti-app/api/enterprise/process-instances/{processInstanceId}/raw-content | Upload content and attach to a process instance
*ContentApi* | [**createRelatedContentOnTaskUsingPOST**](docs/ContentApi.md#createRelatedContentOnTaskUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/content | Attach existing content to a task
*ContentApi* | [**createRelatedContentOnTaskUsingPOST1**](docs/ContentApi.md#createRelatedContentOnTaskUsingPOST1) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/raw-content | Upload content and attach to a task
*ContentApi* | [**createTemporaryRawRelatedContentUsingPOST**](docs/ContentApi.md#createTemporaryRawRelatedContentUsingPOST) | **POST** /activiti-app/api/enterprise/content/raw | Upload content and create a local representation
*ContentApi* | [**createTemporaryRelatedContentUsingPOST**](docs/ContentApi.md#createTemporaryRelatedContentUsingPOST) | **POST** /activiti-app/api/enterprise/content | Create a local representation of content from a remote repository
*ContentApi* | [**deleteContentUsingDELETE**](docs/ContentApi.md#deleteContentUsingDELETE) | **DELETE** /activiti-app/api/enterprise/content/{contentId} | Remove a local content representation
*ContentApi* | [**getContentUsingGET**](docs/ContentApi.md#getContentUsingGET) | **GET** /activiti-app/api/enterprise/content/{contentId} | Get a local content representation
*ContentApi* | [**getRawContentUsingGET**](docs/ContentApi.md#getRawContentUsingGET) | **GET** /activiti-app/api/enterprise/content/{contentId}/rendition/{renditionType} | Stream content rendition
*ContentApi* | [**getRawContentUsingGET1**](docs/ContentApi.md#getRawContentUsingGET1) | **GET** /activiti-app/api/enterprise/content/{contentId}/raw | Stream content from a local content representation
*ContentApi* | [**getRelatedContentForProcessInstanceUsingGET**](docs/ContentApi.md#getRelatedContentForProcessInstanceUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/content | List content attached to a process instance
*ContentApi* | [**getRelatedContentForTaskUsingGET**](docs/ContentApi.md#getRelatedContentForTaskUsingGET) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/content | List content attached to a task
*DataSourcesApi* | [**getDataSourcesUsingGET**](docs/DataSourcesApi.md#getDataSourcesUsingGET) | **GET** /activiti-app/api/enterprise/editor/data-sources | Get data sources
*DecisionAuditsApi* | [**getAuditTrailUsingGET**](docs/DecisionAuditsApi.md#getAuditTrailUsingGET) | **GET** /activiti-app/api/enterprise/decisions/audits/{auditTrailId} | Get an audit trail
*DecisionAuditsApi* | [**getAuditTrailsUsingGET**](docs/DecisionAuditsApi.md#getAuditTrailsUsingGET) | **GET** /activiti-app/api/enterprise/decisions/audits | Query decision table audit trails
*DecisionTableModelsApi* | [**exportDecisionTableUsingGET**](docs/DecisionTableModelsApi.md#exportDecisionTableUsingGET) | **GET** /activiti-app/api/enterprise/editor/decision-table-models/{decisionTableId}/export | Export decision table model.
*DecisionTableModelsApi* | [**exportHistoricDecisionTableUsingGET**](docs/DecisionTableModelsApi.md#exportHistoricDecisionTableUsingGET) | **GET** /activiti-app/api/enterprise/editor/decision-table-models/history/{historyModelId}/export | Export specific version for decision table model.
*DecisionTableModelsApi* | [**getDecisionTableUsingGET1**](docs/DecisionTableModelsApi.md#getDecisionTableUsingGET1) | **GET** /activiti-app/api/enterprise/editor/decision-table-models/{decisionTableId} | Get a decision table model by id.
*DecisionTableModelsApi* | [**getDecisionTablesUsingGET1**](docs/DecisionTableModelsApi.md#getDecisionTablesUsingGET1) | **GET** /activiti-app/api/enterprise/editor/decision-table-models | Get a list of decision table models (without decision table definition).
*DecisionTableModelsApi* | [**getDecisionTablesUsingGET2**](docs/DecisionTableModelsApi.md#getDecisionTablesUsingGET2) | **GET** /activiti-app/api/enterprise/editor/decision-table-models/values | Get a specific list of decision table models (with decision table definition) by their ids.
*DecisionTableModelsApi* | [**getHistoricDecisionTableUsingGET**](docs/DecisionTableModelsApi.md#getHistoricDecisionTableUsingGET) | **GET** /activiti-app/api/enterprise/editor/decision-table-models/history/{historyModelId} | Get specific version of a decision table model by id.
*DecisionTableModelsApi* | [**importDecisionTableTextUsingPOST**](docs/DecisionTableModelsApi.md#importDecisionTableTextUsingPOST) | **POST** /activiti-app/api/enterprise/editor/decision-table-models/import-decision-table-text | Import decision table. This method return the decision table representation response as plain text.
*DecisionTableModelsApi* | [**importDecisionTableUsingPOST**](docs/DecisionTableModelsApi.md#importDecisionTableUsingPOST) | **POST** /activiti-app/api/enterprise/editor/decision-table-models/import-decision-table | Import decision table model.
*DecisionTableModelsApi* | [**saveDecisionTableUsingPUT**](docs/DecisionTableModelsApi.md#saveDecisionTableUsingPUT) | **PUT** /activiti-app/api/enterprise/editor/decision-table-models/{decisionTableId} | Update decision table model.
*DecisionTableModelsApi* | [**validateModelUsingPUT**](docs/DecisionTableModelsApi.md#validateModelUsingPUT) | **PUT** /activiti-app/api/enterprise/editor/decision-table-models/{decisionTableId}/validate | Validate decision table model.
*DecisionTablesApi* | [**getDecisionTableEditorJsonUsingGET**](docs/DecisionTablesApi.md#getDecisionTableEditorJsonUsingGET) | **GET** /activiti-app/api/enterprise/decisions/decision-tables/{decisionTableId}/editorJson | Get definition for a decision table
*DecisionTablesApi* | [**getDecisionTableUsingGET**](docs/DecisionTablesApi.md#getDecisionTableUsingGET) | **GET** /activiti-app/api/enterprise/decisions/decision-tables/{decisionTableId} | Get a decision table
*DecisionTablesApi* | [**getDecisionTablesUsingGET**](docs/DecisionTablesApi.md#getDecisionTablesUsingGET) | **GET** /activiti-app/api/enterprise/decisions/decision-tables | Query decision tables
*EndpointsApi* | [**getEndpointConfigurationUsingGET**](docs/EndpointsApi.md#getEndpointConfigurationUsingGET) | **GET** /activiti-app/api/enterprise/editor/endpoints/{endpointConfigurationId} | Get an endpoint configuration
*EndpointsApi* | [**getEndpointConfigurationsUsingGET**](docs/EndpointsApi.md#getEndpointConfigurationsUsingGET) | **GET** /activiti-app/api/enterprise/editor/endpoints | List endpoint configurations
*FormModelsApi* | [**getFormEditorJsonUsingGET**](docs/FormModelsApi.md#getFormEditorJsonUsingGET) | **GET** /activiti-app/api/enterprise/forms/{formId}/editorJson | Get form content
*FormModelsApi* | [**getFormHistoryUsingGET**](docs/FormModelsApi.md#getFormHistoryUsingGET) | **GET** /activiti-app/api/enterprise/editor/form-models/{formId}/history/{formHistoryId} | Get form history
*FormModelsApi* | [**getFormUsingGET**](docs/FormModelsApi.md#getFormUsingGET) | **GET** /activiti-app/api/enterprise/editor/form-models/{formId} | Get a form model
*FormModelsApi* | [**getFormUsingGET1**](docs/FormModelsApi.md#getFormUsingGET1) | **GET** /activiti-app/api/enterprise/forms/{formId} | Get a form
*FormModelsApi* | [**getFormsUsingGET**](docs/FormModelsApi.md#getFormsUsingGET) | **GET** /activiti-app/api/enterprise/editor/form-models/values | Get forms
*FormModelsApi* | [**getFormsUsingGET1**](docs/FormModelsApi.md#getFormsUsingGET1) | **GET** /activiti-app/api/enterprise/editor/form-models | List form models
*FormModelsApi* | [**getFormsUsingGET2**](docs/FormModelsApi.md#getFormsUsingGET2) | **GET** /activiti-app/api/enterprise/forms | Query forms
*FormModelsApi* | [**saveFormUsingPUT**](docs/FormModelsApi.md#saveFormUsingPUT) | **PUT** /activiti-app/api/enterprise/editor/form-models/{formId} | Update form model content
*FormModelsApi* | [**validateModelUsingPUT1**](docs/FormModelsApi.md#validateModelUsingPUT1) | **PUT** /activiti-app/api/enterprise/editor/form-models/{formId}/validate | Validate form model content
*GroupsApi* | [**getGroupsUsingGET**](docs/GroupsApi.md#getGroupsUsingGET) | **GET** /activiti-app/api/enterprise/groups | Query groups
*GroupsApi* | [**getUsersForGroupUsingGET**](docs/GroupsApi.md#getUsersForGroupUsingGET) | **GET** /activiti-app/api/enterprise/groups/{groupId}/users | List members of a group
*IdmSyncApi* | [**getLogFileUsingGET**](docs/IdmSyncApi.md#getLogFileUsingGET) | **GET** /activiti-app/api/enterprise/idm-sync-log-entries/{syncLogEntryId}/logfile | Get log file for a sync log entry
*IdmSyncApi* | [**getSyncLogEntriesUsingGET**](docs/IdmSyncApi.md#getSyncLogEntriesUsingGET) | **GET** /activiti-app/api/enterprise/idm-sync-log-entries | List sync log entries
*IntegrationAlfrescoOnpremiseApi* | [**createRepositoryUsingPOST**](docs/IntegrationAlfrescoOnpremiseApi.md#createRepositoryUsingPOST) | **POST** /activiti-app/api/enterprise/integration/alfresco | Create Alfresco repository
*IntegrationAlfrescoOnpremiseApi* | [**deleteRepositoryUsingDELETE**](docs/IntegrationAlfrescoOnpremiseApi.md#deleteRepositoryUsingDELETE) | **DELETE** /activiti-app/api/enterprise/integration/alfresco/{repositoryId} | Delete Alfresco repository
*IntegrationAlfrescoOnpremiseApi* | [**getAllSitesUsingGET**](docs/IntegrationAlfrescoOnpremiseApi.md#getAllSitesUsingGET) | **GET** /activiti-app/api/enterprise/integration/alfresco/{repositoryId}/sites | List Alfresco sites
*IntegrationAlfrescoOnpremiseApi* | [**getContentInFolderPathUsingGET**](docs/IntegrationAlfrescoOnpremiseApi.md#getContentInFolderPathUsingGET) | **GET** /activiti-app/api/enterprise/rest/integration/alfresco/{repositoryId}/sites/{siteId}/folderpath/{folderPath}/content | List files and folders inside a specific folder identified by folder path
*IntegrationAlfrescoOnpremiseApi* | [**getContentInFolderUsingGET**](docs/IntegrationAlfrescoOnpremiseApi.md#getContentInFolderUsingGET) | **GET** /activiti-app/api/enterprise/integration/alfresco/{repositoryId}/folders/{folderId}/content | List files and folders inside a specific folder
*IntegrationAlfrescoOnpremiseApi* | [**getContentInSiteUsingGET**](docs/IntegrationAlfrescoOnpremiseApi.md#getContentInSiteUsingGET) | **GET** /activiti-app/api/enterprise/integration/alfresco/{repositoryId}/sites/{siteId}/content | List files and folders inside a specific site
*IntegrationAlfrescoOnpremiseApi* | [**getRepositoriesUsingGET**](docs/IntegrationAlfrescoOnpremiseApi.md#getRepositoriesUsingGET) | **GET** /activiti-app/api/enterprise/profile/accounts/alfresco | List Alfresco repositories
*IntegrationAlfrescoOnpremiseApi* | [**updateRepositoryUsingPUT**](docs/IntegrationAlfrescoOnpremiseApi.md#updateRepositoryUsingPUT) | **PUT** /activiti-app/api/enterprise/integration/alfresco/{repositoryId} | Update Alfresco repository
*IntegrationBoxApi* | [**confirmAuthorisationUsingGET**](docs/IntegrationBoxApi.md#confirmAuthorisationUsingGET) | **GET** /activiti-app/api/enterprise/integration/box/confirm-auth-request | Box Authorization
*IntegrationBoxApi* | [**createRepositoryAccountUsingPOST**](docs/IntegrationBoxApi.md#createRepositoryAccountUsingPOST) | **POST** /activiti-app/api/enterprise/integration/box/{userId}/account | Add Box account
*IntegrationBoxApi* | [**deleteRepositoryAccountUsingDELETE**](docs/IntegrationBoxApi.md#deleteRepositoryAccountUsingDELETE) | **DELETE** /activiti-app/api/enterprise/integration/box/{userId}/account | Delete account information
*IntegrationBoxApi* | [**getBoxPluginStatusUsingGET**](docs/IntegrationBoxApi.md#getBoxPluginStatusUsingGET) | **GET** /activiti-app/api/enterprise/integration/box/status | Get status information
*IntegrationBoxApi* | [**getFilesUsingGET**](docs/IntegrationBoxApi.md#getFilesUsingGET) | **GET** /activiti-app/api/enterprise/integration/box/files | List file and folders
*IntegrationBoxApi* | [**getRepositoryAccountUsingGET**](docs/IntegrationBoxApi.md#getRepositoryAccountUsingGET) | **GET** /activiti-app/api/enterprise/integration/box/{userId}/account | Get account information
*IntegrationBoxApi* | [**updateRepositoryAccountUsingPUT**](docs/IntegrationBoxApi.md#updateRepositoryAccountUsingPUT) | **PUT** /activiti-app/api/enterprise/integration/box/{userId}/account | Update account information
*IntegrationDriveApi* | [**confirmAuthorisationUsingGET1**](docs/IntegrationDriveApi.md#confirmAuthorisationUsingGET1) | **GET** /activiti-app/api/enterprise/integration/google-drive/confirm-auth-request | Drive Authorization
*IntegrationDriveApi* | [**getFilesUsingGET1**](docs/IntegrationDriveApi.md#getFilesUsingGET1) | **GET** /activiti-app/api/enterprise/integration/google-drive/files | List files and folders
*IntegrationSsoApi* | [**confirmAuthorisationUsingGET2**](docs/IntegrationSsoApi.md#confirmAuthorisationUsingGET2) | **GET** /activiti-app/api/enterprise/integration/sso/confirm-auth-request | SSO Authorization
*IntegrationSsoApi* | [**deleteRepositoryAccountUsingDELETE1**](docs/IntegrationSsoApi.md#deleteRepositoryAccountUsingDELETE1) | **DELETE** /activiti-app/api/enterprise/integration/sso/{repositoryId}/account | Delete account information
*IntegrationSsoApi* | [**getRepositoryAccountUsingGET1**](docs/IntegrationSsoApi.md#getRepositoryAccountUsingGET1) | **GET** /activiti-app/api/enterprise/integration/sso/{repositoryId}/account | Get account information
*ModelsApi* | [**createModelUsingPOST**](docs/ModelsApi.md#createModelUsingPOST) | **POST** /activiti-app/api/enterprise/models | Create a new model
*ModelsApi* | [**deleteModelUsingDELETE**](docs/ModelsApi.md#deleteModelUsingDELETE) | **DELETE** /activiti-app/api/enterprise/models/{modelId} | Delete a model
*ModelsApi* | [**duplicateModelUsingPOST**](docs/ModelsApi.md#duplicateModelUsingPOST) | **POST** /activiti-app/api/enterprise/models/{modelId}/clone | Duplicate an existing model
*ModelsApi* | [**getModelJSONUsingGET**](docs/ModelsApi.md#getModelJSONUsingGET) | **GET** /activiti-app/api/enterprise/models/{modelId}/editor/json | Get model content
*ModelsApi* | [**getModelThumbnailUsingGET**](docs/ModelsApi.md#getModelThumbnailUsingGET) | **GET** /activiti-app/api/enterprise/models/{modelId}/thumbnail | Get a model&#x27;s thumbnail image
*ModelsApi* | [**getModelUsingGET**](docs/ModelsApi.md#getModelUsingGET) | **GET** /activiti-app/api/enterprise/models/{modelId} | Get a model
*ModelsApi* | [**getModelsToIncludeInAppDefinitionUsingGET**](docs/ModelsApi.md#getModelsToIncludeInAppDefinitionUsingGET) | **GET** /activiti-app/api/enterprise/models-for-app-definition | List process definition models shared with the current user
*ModelsApi* | [**getModelsUsingGET**](docs/ModelsApi.md#getModelsUsingGET) | **GET** /activiti-app/api/enterprise/models | List models (process, form, decision rule or app)
*ModelsApi* | [**importNewVersionUsingPOST**](docs/ModelsApi.md#importNewVersionUsingPOST) | **POST** /activiti-app/api/enterprise/models/{modelId}/newversion | Create a new version of a model
*ModelsApi* | [**importProcessModelUsingPOST**](docs/ModelsApi.md#importProcessModelUsingPOST) | **POST** /activiti-app/api/enterprise/process-models/import | Import a BPMN 2.0 XML file
*ModelsApi* | [**saveModelUsingPOST**](docs/ModelsApi.md#saveModelUsingPOST) | **POST** /activiti-app/api/enterprise/models/{modelId}/editor/json | Update model content
*ModelsApi* | [**updateModelUsingPUT**](docs/ModelsApi.md#updateModelUsingPUT) | **PUT** /activiti-app/api/enterprise/models/{modelId} | Update a model
*ModelsApi* | [**validateModelUsingPOST**](docs/ModelsApi.md#validateModelUsingPOST) | **POST** /activiti-app/api/enterprise/models/{modelId}/editor/validate | Validate model content
*ModelsBpmnApi* | [**getHistoricProcessModelBpmn20XmlUsingGET**](docs/ModelsBpmnApi.md#getHistoricProcessModelBpmn20XmlUsingGET) | **GET** /activiti-app/api/enterprise/models/{processModelId}/history/{processModelHistoryId}/bpmn20 | Export a historic version of a process definition as BPMN 2.0 XML
*ModelsBpmnApi* | [**getProcessModelBpmn20XmlUsingGET**](docs/ModelsBpmnApi.md#getProcessModelBpmn20XmlUsingGET) | **GET** /activiti-app/api/enterprise/models/{processModelId}/bpmn20 | Export a process definition as BPMN 2.0 XML
*ModelsHistoryApi* | [**getModelHistoryCollectionUsingGET**](docs/ModelsHistoryApi.md#getModelHistoryCollectionUsingGET) | **GET** /activiti-app/api/enterprise/models/{modelId}/history | List a model&#x27;s historic versions
*ModelsHistoryApi* | [**getProcessModelHistoryUsingGET**](docs/ModelsHistoryApi.md#getProcessModelHistoryUsingGET) | **GET** /activiti-app/api/enterprise/models/{modelId}/history/{modelHistoryId} | Get a historic version of a model
*ProcessDefinitionsApi* | [**createIdentityLinkUsingPOST**](docs/ProcessDefinitionsApi.md#createIdentityLinkUsingPOST) | **POST** /activiti-app/api/enterprise/process-definitions/{processDefinitionId}/identitylinks | Add a user or group involvement to a process definition
*ProcessDefinitionsApi* | [**deleteIdentityLinkUsingDELETE**](docs/ProcessDefinitionsApi.md#deleteIdentityLinkUsingDELETE) | **DELETE** /activiti-app/api/enterprise/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId} | Remove a user or group involvement from a process definition
*ProcessDefinitionsApi* | [**getIdentityLinkTypeUsingGET**](docs/ProcessDefinitionsApi.md#getIdentityLinkTypeUsingGET) | **GET** /activiti-app/api/enterprise/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId} | Get a user or group involvement with a process definition
*ProcessDefinitionsApi* | [**getIdentityLinksForFamilyUsingGET**](docs/ProcessDefinitionsApi.md#getIdentityLinksForFamilyUsingGET) | **GET** /activiti-app/api/enterprise/process-definitions/{processDefinitionId}/identitylinks/{family} | List either the users or groups involved with a process definition
*ProcessDefinitionsApi* | [**getIdentityLinksUsingGET**](docs/ProcessDefinitionsApi.md#getIdentityLinksUsingGET) | **GET** /activiti-app/api/enterprise/process-definitions/{processDefinitionId}/identitylinks | List the users and groups involved with a process definition
*ProcessDefinitionsApi* | [**getProcessDefinitionDecisionTablesUsingGET**](docs/ProcessDefinitionsApi.md#getProcessDefinitionDecisionTablesUsingGET) | **GET** /activiti-app/api/enterprise/process-definitions/{processDefinitionId}/decision-tables | List the decision tables associated with a process definition
*ProcessDefinitionsApi* | [**getProcessDefinitionFormsUsingGET**](docs/ProcessDefinitionsApi.md#getProcessDefinitionFormsUsingGET) | **GET** /activiti-app/api/enterprise/process-definitions/{processDefinitionId}/forms | List the forms associated with a process definition
*ProcessDefinitionsApi* | [**getProcessDefinitionStartFormUsingGET**](docs/ProcessDefinitionsApi.md#getProcessDefinitionStartFormUsingGET) | **GET** /activiti-app/api/enterprise/process-definitions/{processDefinitionId}/start-form | Retrieve the start form for a process definition
*ProcessDefinitionsApi* | [**getProcessDefinitionsUsingGET**](docs/ProcessDefinitionsApi.md#getProcessDefinitionsUsingGET) | **GET** /activiti-app/api/enterprise/process-definitions | Retrieve a list of process definitions
*ProcessDefinitionsApi* | [**getRestFieldValuesUsingGET**](docs/ProcessDefinitionsApi.md#getRestFieldValuesUsingGET) | **GET** /activiti-app/api/enterprise/process-definitions/{processDefinitionId}/start-form-values/{field} | Retrieve field values (eg. the typeahead field)
*ProcessDefinitionsApi* | [**getRestTableFieldValuesUsingGET**](docs/ProcessDefinitionsApi.md#getRestTableFieldValuesUsingGET) | **GET** /activiti-app/api/enterprise/process-definitions/{processDefinitionId}/start-form-values/{field}/{column} | Retrieve field values (eg. the table field)
*ProcessInstanceVariablesApi* | [**createOrUpdateProcessInstanceVariablesUsingPUT**](docs/ProcessInstanceVariablesApi.md#createOrUpdateProcessInstanceVariablesUsingPUT) | **PUT** /activiti-app/api/enterprise/process-instances/{processInstanceId}/variables | Create or update variables
*ProcessInstanceVariablesApi* | [**createProcessInstanceVariablesUsingPOST**](docs/ProcessInstanceVariablesApi.md#createProcessInstanceVariablesUsingPOST) | **POST** /activiti-app/api/enterprise/process-instances/{processInstanceId}/variables | Create variables
*ProcessInstanceVariablesApi* | [**deleteProcessInstanceVariableUsingDELETE**](docs/ProcessInstanceVariablesApi.md#deleteProcessInstanceVariableUsingDELETE) | **DELETE** /activiti-app/api/enterprise/process-instances/{processInstanceId}/variables/{variableName} | Delete a variable
*ProcessInstanceVariablesApi* | [**getProcessInstanceVariableUsingGET**](docs/ProcessInstanceVariablesApi.md#getProcessInstanceVariableUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/variables/{variableName} | Get a variable
*ProcessInstanceVariablesApi* | [**getProcessInstanceVariablesUsingGET**](docs/ProcessInstanceVariablesApi.md#getProcessInstanceVariablesUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/variables | List variables
*ProcessInstanceVariablesApi* | [**updateProcessInstanceVariableUsingPUT**](docs/ProcessInstanceVariablesApi.md#updateProcessInstanceVariableUsingPUT) | **PUT** /activiti-app/api/enterprise/process-instances/{processInstanceId}/variables/{variableName} | Update a variable
*ProcessInstancesApi* | [**activateProcessInstanceUsingPUT**](docs/ProcessInstancesApi.md#activateProcessInstanceUsingPUT) | **PUT** /activiti-app/api/enterprise/process-instances/{processInstanceId}/activate | Activate a process instance
*ProcessInstancesApi* | [**createIdentityLinkUsingPOST1**](docs/ProcessInstancesApi.md#createIdentityLinkUsingPOST1) | **POST** /activiti-app/api/enterprise/process-instances/{processInstanceId}/identitylinks | Add a user or group involvement to a process instance
*ProcessInstancesApi* | [**deleteIdentityLinkUsingDELETE1**](docs/ProcessInstancesApi.md#deleteIdentityLinkUsingDELETE1) | **DELETE** /activiti-app/api/enterprise/process-instances/{processInstanceId}/identitylinks/{family}/{identityId}/{type} | Remove a user or group involvement from a process instance
*ProcessInstancesApi* | [**deleteProcessInstanceUsingDELETE**](docs/ProcessInstancesApi.md#deleteProcessInstanceUsingDELETE) | **DELETE** /activiti-app/api/enterprise/process-instances/{processInstanceId} | Cancel or remove a process instance
*ProcessInstancesApi* | [**filterProcessInstancesUsingPOST**](docs/ProcessInstancesApi.md#filterProcessInstancesUsingPOST) | **POST** /activiti-app/api/enterprise/process-instances/filter | List process instances using a filter
*ProcessInstancesApi* | [**getHistoricProcessInstanceDecisionTasksUsingGET**](docs/ProcessInstancesApi.md#getHistoricProcessInstanceDecisionTasksUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/decision-tasks | Get decision tasks in a process instance
*ProcessInstancesApi* | [**getHistoricProcessInstanceVariablesUsingGET**](docs/ProcessInstancesApi.md#getHistoricProcessInstanceVariablesUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/historic-variables | Get historic variables for a process instance
*ProcessInstancesApi* | [**getHistoricProcessInstancesUsingPOST**](docs/ProcessInstancesApi.md#getHistoricProcessInstancesUsingPOST) | **POST** /activiti-app/api/enterprise/historic-process-instances/query | Query historic process instances
*ProcessInstancesApi* | [**getIdentityLinkTypeUsingGET1**](docs/ProcessInstancesApi.md#getIdentityLinkTypeUsingGET1) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/identitylinks/{family}/{identityId}/{type} | Get a user or group involvement with a process instance
*ProcessInstancesApi* | [**getIdentityLinksForFamilyUsingGET1**](docs/ProcessInstancesApi.md#getIdentityLinksForFamilyUsingGET1) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/identitylinks/{family} | List either the users or groups involved with a process instance
*ProcessInstancesApi* | [**getIdentityLinksUsingGET1**](docs/ProcessInstancesApi.md#getIdentityLinksUsingGET1) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/identitylinks | List the users and groups involved with a process instance
*ProcessInstancesApi* | [**getProcessInstanceContentUsingGET**](docs/ProcessInstancesApi.md#getProcessInstanceContentUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/field-content | List content attached to process instance fields
*ProcessInstancesApi* | [**getProcessInstanceDiagramUsingGET**](docs/ProcessInstancesApi.md#getProcessInstanceDiagramUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/diagram | Get the process diagram for the process instance
*ProcessInstancesApi* | [**getProcessInstanceStartFormUsingGET**](docs/ProcessInstancesApi.md#getProcessInstanceStartFormUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/start-form | Get a process instance start form
*ProcessInstancesApi* | [**getProcessInstanceUsingGET**](docs/ProcessInstancesApi.md#getProcessInstanceUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId} | Get a process instance
*ProcessInstancesApi* | [**getProcessInstancesUsingPOST**](docs/ProcessInstancesApi.md#getProcessInstancesUsingPOST) | **POST** /activiti-app/api/enterprise/process-instances/query | Query process instances
*ProcessInstancesApi* | [**getTaskAuditLogUsingGET**](docs/ProcessInstancesApi.md#getTaskAuditLogUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/audit-log | Get the audit log for a process instance
*ProcessInstancesApi* | [**startNewProcessInstanceUsingPOST**](docs/ProcessInstancesApi.md#startNewProcessInstanceUsingPOST) | **POST** /activiti-app/api/enterprise/process-instances | Start a process instance
*ProcessInstancesApi* | [**suspendProcessInstanceUsingPUT**](docs/ProcessInstancesApi.md#suspendProcessInstanceUsingPUT) | **PUT** /activiti-app/api/enterprise/process-instances/{processInstanceId}/suspend | Suspend a process instance
*ProcessScopesApi* | [**getRuntimeProcessScopesUsingPOST**](docs/ProcessScopesApi.md#getRuntimeProcessScopesUsingPOST) | **POST** /activiti-app/api/enterprise/process-scopes | List runtime process scopes
*RuntimeAppDefinitionsApi* | [**deployAppDefinitionsUsingPOST**](docs/RuntimeAppDefinitionsApi.md#deployAppDefinitionsUsingPOST) | **POST** /activiti-app/api/enterprise/runtime-app-definitions | Deploy a published app
*RuntimeAppDefinitionsApi* | [**getAppDefinitionUsingGET1**](docs/RuntimeAppDefinitionsApi.md#getAppDefinitionUsingGET1) | **GET** /activiti-app/api/enterprise/runtime-app-definitions/{appDefinitionId} | Get a runtime app
*RuntimeAppDefinitionsApi* | [**getAppDefinitionsUsingGET**](docs/RuntimeAppDefinitionsApi.md#getAppDefinitionsUsingGET) | **GET** /activiti-app/api/enterprise/runtime-app-definitions | List runtime apps
*RuntimeAppDeploymentsApi* | [**deleteAppDeploymentUsingDELETE**](docs/RuntimeAppDeploymentsApi.md#deleteAppDeploymentUsingDELETE) | **DELETE** /activiti-app/api/enterprise/runtime-app-deployments/{appDeploymentId} | Remove an app deployment
*RuntimeAppDeploymentsApi* | [**exportAppDefinitionUsingGET1**](docs/RuntimeAppDeploymentsApi.md#exportAppDefinitionUsingGET1) | **GET** /activiti-app/api/enterprise/export-app-deployment/{deploymentId} | Export the app archive for a deployment
*RuntimeAppDeploymentsApi* | [**getAppDefinitionsUsingGET1**](docs/RuntimeAppDeploymentsApi.md#getAppDefinitionsUsingGET1) | **GET** /activiti-app/api/enterprise/runtime-app-deployments | Query app deployments
*RuntimeAppDeploymentsApi* | [**getAppDeploymentUsingGET**](docs/RuntimeAppDeploymentsApi.md#getAppDeploymentUsingGET) | **GET** /activiti-app/api/enterprise/runtime-app-deployments/{appDeploymentId} | Get an app deployment
*RuntimeAppDeploymentsApi* | [**getRuntimeAppDeploymentByDeploymentUsingGET**](docs/RuntimeAppDeploymentsApi.md#getRuntimeAppDeploymentByDeploymentUsingGET) | **GET** /activiti-app/api/enterprise/runtime-app-deployment | Get an app by deployment ID or DMN deployment ID
*ScriptFilesApi* | [**getControllersUsingGET**](docs/ScriptFilesApi.md#getControllersUsingGET) | **GET** /activiti-app/api/enterprise/script-files/controllers | getControllers
*ScriptFilesApi* | [**getLibrariesUsingGET**](docs/ScriptFilesApi.md#getLibrariesUsingGET) | **GET** /activiti-app/api/enterprise/script-files/libraries | getLibraries
*SubmittedFormsApi* | [**getFormSubmittedFromsUsingGET**](docs/SubmittedFormsApi.md#getFormSubmittedFromsUsingGET) | **GET** /activiti-app/api/enterprise/form-submitted-forms/{formId} | List submissions for a form
*SubmittedFormsApi* | [**getProcessSubmittedFromsUsingGET**](docs/SubmittedFormsApi.md#getProcessSubmittedFromsUsingGET) | **GET** /activiti-app/api/enterprise/process-submitted-forms/{processId} | List submissions for a process instance
*SubmittedFormsApi* | [**getSubmittedFromUsingGET**](docs/SubmittedFormsApi.md#getSubmittedFromUsingGET) | **GET** /activiti-app/api/enterprise/submitted-forms/{submittedFormId} | Get a form submission
*SubmittedFormsApi* | [**getTaskSubmittedFromsUsingGET**](docs/SubmittedFormsApi.md#getTaskSubmittedFromsUsingGET) | **GET** /activiti-app/api/enterprise/task-submitted-form/{taskId} | Get the submitted form for a task
*SystemPropertiesApi* | [**getGlobalDateFormatUsingGET**](docs/SystemPropertiesApi.md#getGlobalDateFormatUsingGET) | **GET** /activiti-app/api/enterprise/system/properties/global-date-format/{tenantId} | Get global date format
*SystemPropertiesApi* | [**getPasswordValidationConstraintsUsingGET**](docs/SystemPropertiesApi.md#getPasswordValidationConstraintsUsingGET) | **GET** /activiti-app/api/enterprise/system/properties/password-validation-constraints/{tenantId} | Get password validation constraints
*SystemPropertiesApi* | [**getPropertiesUsingGET**](docs/SystemPropertiesApi.md#getPropertiesUsingGET) | **GET** /activiti-app/api/enterprise/system/properties | Retrieve system properties
*SystemPropertiesApi* | [**involvedUsersCanEditFormsUsingGET**](docs/SystemPropertiesApi.md#involvedUsersCanEditFormsUsingGET) | **GET** /activiti-app/api/enterprise/system/properties/involved-users-can-edit-forms/{tenantId} | Get involved users who can edit forms
*TaskActionsApi* | [**assignTaskUsingPUT**](docs/TaskActionsApi.md#assignTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/assign | Assign a task to a user
*TaskActionsApi* | [**attachFormUsingPUT**](docs/TaskActionsApi.md#attachFormUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/attach-form | Attach a form to a task
*TaskActionsApi* | [**claimTaskUsingPUT**](docs/TaskActionsApi.md#claimTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/claim | Claim a task
*TaskActionsApi* | [**completeTaskUsingPUT**](docs/TaskActionsApi.md#completeTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/complete | Complete a task
*TaskActionsApi* | [**delegateTaskUsingPUT**](docs/TaskActionsApi.md#delegateTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/delegate | Delegate a task
*TaskActionsApi* | [**involveGroupUsingPOST**](docs/TaskActionsApi.md#involveGroupUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/groups/{groupId} | Involve a group with a task
*TaskActionsApi* | [**involveUserUsingPUT**](docs/TaskActionsApi.md#involveUserUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/involve | Involve a user with a task
*TaskActionsApi* | [**removeFormUsingDELETE**](docs/TaskActionsApi.md#removeFormUsingDELETE) | **DELETE** /activiti-app/api/enterprise/tasks/{taskId}/action/remove-form | Remove a form from a task
*TaskActionsApi* | [**removeInvolvedUserUsingDELETE**](docs/TaskActionsApi.md#removeInvolvedUserUsingDELETE) | **DELETE** /activiti-app/api/enterprise/tasks/{taskId}/groups/{groupId} | Remove an involved group from a task
*TaskActionsApi* | [**removeInvolvedUserUsingPUT**](docs/TaskActionsApi.md#removeInvolvedUserUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/remove-involved | Remove an involved user from a task
*TaskActionsApi* | [**resolveTaskUsingPUT**](docs/TaskActionsApi.md#resolveTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/resolve | Resolve a task
*TaskActionsApi* | [**unclaimTaskUsingPUT**](docs/TaskActionsApi.md#unclaimTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/unclaim | Unclaim a task
*TaskFormsApi* | [**completeTaskFormUsingPOST**](docs/TaskFormsApi.md#completeTaskFormUsingPOST) | **POST** /activiti-app/api/enterprise/task-forms/{taskId} | Complete a task form
*TaskFormsApi* | [**getProcessInstanceVariablesUsingGET1**](docs/TaskFormsApi.md#getProcessInstanceVariablesUsingGET1) | **GET** /activiti-app/api/enterprise/task-forms/{taskId}/variables | Get task variables
*TaskFormsApi* | [**getRestFieldValuesUsingGET1**](docs/TaskFormsApi.md#getRestFieldValuesUsingGET1) | **GET** /activiti-app/api/enterprise/task-forms/{taskId}/form-values/{field}/{column} | Retrieve column field values
*TaskFormsApi* | [**getRestFieldValuesUsingGET2**](docs/TaskFormsApi.md#getRestFieldValuesUsingGET2) | **GET** /activiti-app/api/enterprise/task-forms/{taskId}/form-values/{field} | Retrieve populated field values
*TaskFormsApi* | [**getTaskFormUsingGET**](docs/TaskFormsApi.md#getTaskFormUsingGET) | **GET** /activiti-app/api/enterprise/task-forms/{taskId} | Get a task form
*TaskFormsApi* | [**saveTaskFormUsingPOST**](docs/TaskFormsApi.md#saveTaskFormUsingPOST) | **POST** /activiti-app/api/enterprise/task-forms/{taskId}/save-form | Save a task form
*TaskVariablesApi* | [**createTaskVariableUsingPOST**](docs/TaskVariablesApi.md#createTaskVariableUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/variables | Create variables
*TaskVariablesApi* | [**deleteAllLocalTaskVariablesUsingDELETE**](docs/TaskVariablesApi.md#deleteAllLocalTaskVariablesUsingDELETE) | **DELETE** /activiti-app/api/enterprise/tasks/{taskId}/variables | Create or update variables
*TaskVariablesApi* | [**deleteVariableUsingDELETE**](docs/TaskVariablesApi.md#deleteVariableUsingDELETE) | **DELETE** /activiti-app/api/enterprise/tasks/{taskId}/variables/{variableName} | Delete a variable
*TaskVariablesApi* | [**getVariableUsingGET**](docs/TaskVariablesApi.md#getVariableUsingGET) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/variables/{variableName} | Get a variable
*TaskVariablesApi* | [**getVariablesUsingGET**](docs/TaskVariablesApi.md#getVariablesUsingGET) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/variables | List variables
*TaskVariablesApi* | [**updateVariableUsingPUT**](docs/TaskVariablesApi.md#updateVariableUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/variables/{variableName} | Update a variable
*TasksApi* | [**createIdentityLinkUsingPOST2**](docs/TasksApi.md#createIdentityLinkUsingPOST2) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/identitylinks | List the users and groups involved with a task
*TasksApi* | [**createNewTaskUsingPOST**](docs/TasksApi.md#createNewTaskUsingPOST) | **POST** /activiti-app/api/enterprise/tasks | Create a standalone task
*TasksApi* | [**deleteIdentityLinkUsingDELETE2**](docs/TasksApi.md#deleteIdentityLinkUsingDELETE2) | **DELETE** /activiti-app/api/enterprise/tasks/{taskId}/identitylinks/{family}/{identityId}/{type} | Remove a user or group involvement from a task
*TasksApi* | [**deleteTaskUsingDELETE**](docs/TasksApi.md#deleteTaskUsingDELETE) | **DELETE** /activiti-app/api/enterprise/tasks/{taskId} | Delete a task
*TasksApi* | [**filterTasksUsingPOST**](docs/TasksApi.md#filterTasksUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/filter | Filter a list of tasks
*TasksApi* | [**getIdentityLinkTypeUsingGET2**](docs/TasksApi.md#getIdentityLinkTypeUsingGET2) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/identitylinks/{family}/{identityId}/{type} | Get a user or group involvement with a task
*TasksApi* | [**getIdentityLinksForFamilyUsingGET2**](docs/TasksApi.md#getIdentityLinksForFamilyUsingGET2) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/identitylinks/{family} | List either the users or groups involved with a process instance
*TasksApi* | [**getIdentityLinksUsingGET2**](docs/TasksApi.md#getIdentityLinksUsingGET2) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/identitylinks | getIdentityLinks
*TasksApi* | [**getTaskAuditLogUsingGET1**](docs/TasksApi.md#getTaskAuditLogUsingGET1) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/audit | Get the audit log for a task
*TasksApi* | [**getTaskUsingGET**](docs/TasksApi.md#getTaskUsingGET) | **GET** /activiti-app/api/enterprise/tasks/{taskId} | Get a task
*TasksApi* | [**listHistoricTasksUsingPOST**](docs/TasksApi.md#listHistoricTasksUsingPOST) | **POST** /activiti-app/api/enterprise/historic-tasks/query | Query historic tasks
*TasksApi* | [**listTasksUsingPOST**](docs/TasksApi.md#listTasksUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/query | List tasks
*TasksApi* | [**updateTaskUsingPUT**](docs/TasksApi.md#updateTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId} | Update a task
*UserFiltersApi* | [**createUserProcessInstanceFilterUsingPOST**](docs/UserFiltersApi.md#createUserProcessInstanceFilterUsingPOST) | **POST** /activiti-app/api/enterprise/filters/processes | Create a process instance filter
*UserFiltersApi* | [**createUserTaskFilterUsingPOST**](docs/UserFiltersApi.md#createUserTaskFilterUsingPOST) | **POST** /activiti-app/api/enterprise/filters/tasks | Create a task filter
*UserFiltersApi* | [**deleteUserProcessInstanceFilterUsingDELETE**](docs/UserFiltersApi.md#deleteUserProcessInstanceFilterUsingDELETE) | **DELETE** /activiti-app/api/enterprise/filters/processes/{userFilterId} | Delete a process instance filter
*UserFiltersApi* | [**deleteUserTaskFilterUsingDELETE**](docs/UserFiltersApi.md#deleteUserTaskFilterUsingDELETE) | **DELETE** /activiti-app/api/enterprise/filters/tasks/{userFilterId} | Delete a task filter
*UserFiltersApi* | [**getUserProcessInstanceFilterUsingGET**](docs/UserFiltersApi.md#getUserProcessInstanceFilterUsingGET) | **GET** /activiti-app/api/enterprise/filters/processes/{userFilterId} | Get a process instance filter
*UserFiltersApi* | [**getUserProcessInstanceFiltersUsingGET**](docs/UserFiltersApi.md#getUserProcessInstanceFiltersUsingGET) | **GET** /activiti-app/api/enterprise/filters/processes | List process instance filters
*UserFiltersApi* | [**getUserTaskFilterUsingGET**](docs/UserFiltersApi.md#getUserTaskFilterUsingGET) | **GET** /activiti-app/api/enterprise/filters/tasks/{userFilterId} | Get a task filter
*UserFiltersApi* | [**getUserTaskFiltersUsingGET**](docs/UserFiltersApi.md#getUserTaskFiltersUsingGET) | **GET** /activiti-app/api/enterprise/filters/tasks | List task filters
*UserFiltersApi* | [**orderUserProcessInstanceFiltersUsingPUT**](docs/UserFiltersApi.md#orderUserProcessInstanceFiltersUsingPUT) | **PUT** /activiti-app/api/enterprise/filters/processes | Re-order the list of user process instance filters
*UserFiltersApi* | [**orderUserTaskFiltersUsingPUT**](docs/UserFiltersApi.md#orderUserTaskFiltersUsingPUT) | **PUT** /activiti-app/api/enterprise/filters/tasks | Re-order the list of user task filters
*UserFiltersApi* | [**updateUserProcessInstanceFilterUsingPUT**](docs/UserFiltersApi.md#updateUserProcessInstanceFilterUsingPUT) | **PUT** /activiti-app/api/enterprise/filters/processes/{userFilterId} | Update a process instance filter
*UserFiltersApi* | [**updateUserTaskFilterUsingPUT**](docs/UserFiltersApi.md#updateUserTaskFilterUsingPUT) | **PUT** /activiti-app/api/enterprise/filters/tasks/{userFilterId} | Update a task filter
*UserProfileApi* | [**changePasswordUsingPOST**](docs/UserProfileApi.md#changePasswordUsingPOST) | **POST** /activiti-app/api/enterprise/profile-password | Change user password
*UserProfileApi* | [**getProfilePictureUsingGET**](docs/UserProfileApi.md#getProfilePictureUsingGET) | **GET** /activiti-app/api/enterprise/profile-picture | Retrieve user profile picture
*UserProfileApi* | [**getProfileUsingGET**](docs/UserProfileApi.md#getProfileUsingGET) | **GET** /activiti-app/api/enterprise/profile | Get user profile
*UserProfileApi* | [**updateUserUsingPOST**](docs/UserProfileApi.md#updateUserUsingPOST) | **POST** /activiti-app/api/enterprise/profile | Update user profile
*UserProfileApi* | [**uploadProfilePictureUsingPOST**](docs/UserProfileApi.md#uploadProfilePictureUsingPOST) | **POST** /activiti-app/api/enterprise/profile-picture | Change user profile picture
*UsersApi* | [**executeActionUsingPOST**](docs/UsersApi.md#executeActionUsingPOST) | **POST** /activiti-app/api/enterprise/users/{userId} | Execute an action for a specific user
*UsersApi* | [**getProfilePictureUsingGET1**](docs/UsersApi.md#getProfilePictureUsingGET1) | **GET** /activiti-app/api/enterprise/users/{userId}/picture | Stream user profile picture
*UsersApi* | [**getUserUsingGET1**](docs/UsersApi.md#getUserUsingGET1) | **GET** /activiti-app/api/enterprise/users/{userId} | Get a user
*UsersApi* | [**getUsersUsingGET1**](docs/UsersApi.md#getUsersUsingGET1) | **GET** /activiti-app/api/enterprise/users | Query users
*UsersApi* | [**requestPasswordResetUsingPOST**](docs/UsersApi.md#requestPasswordResetUsingPOST) | **POST** /activiti-app/api/enterprise/idm/passwords | Request a password reset
*UsersApi* | [**updateUserUsingPUT**](docs/UsersApi.md#updateUserUsingPUT) | **PUT** /activiti-app/api/enterprise/users/{userId} | Update a user

## Documentation for Models

 - [AbstractGroupRepresentation](docs/AbstractGroupRepresentation.md)
 - [AbstractUserRepresentation](docs/AbstractUserRepresentation.md)
 - [AccountRepresentation](docs/AccountRepresentation.md)
 - [AddGroupCapabilitiesRepresentation](docs/AddGroupCapabilitiesRepresentation.md)
 - [AlfrescoContentRepresentation](docs/AlfrescoContentRepresentation.md)
 - [AlfrescoEndpointRepresentation](docs/AlfrescoEndpointRepresentation.md)
 - [AlfrescoSiteRepresenation](docs/AlfrescoSiteRepresenation.md)
 - [AmountFieldRepresentation](docs/AmountFieldRepresentation.md)
 - [AppDefinition](docs/AppDefinition.md)
 - [AppDefinitionPublishRepresentation](docs/AppDefinitionPublishRepresentation.md)
 - [AppDefinitionRepresentation](docs/AppDefinitionRepresentation.md)
 - [AppDefinitionSaveRepresentation](docs/AppDefinitionSaveRepresentation.md)
 - [AppDefinitionUpdateResultRepresentation](docs/AppDefinitionUpdateResultRepresentation.md)
 - [AppDeploymentRepresentation](docs/AppDeploymentRepresentation.md)
 - [AppModelDefinition](docs/AppModelDefinition.md)
 - [AssigneeIdentifierRepresentation](docs/AssigneeIdentifierRepresentation.md)
 - [AttachFileFieldRepresentation](docs/AttachFileFieldRepresentation.md)
 - [AuditCalculatedValueRepresentation](docs/AuditCalculatedValueRepresentation.md)
 - [AuditDecisionExpressionInfoRepresentation](docs/AuditDecisionExpressionInfoRepresentation.md)
 - [AuditDecisionInfoRepresentation](docs/AuditDecisionInfoRepresentation.md)
 - [AuditDecisionRuleInfoRepresentation](docs/AuditDecisionRuleInfoRepresentation.md)
 - [AuditLogEntryRepresentation](docs/AuditLogEntryRepresentation.md)
 - [AuditLogFormDataRepresentation](docs/AuditLogFormDataRepresentation.md)
 - [AuthConfigurationRepresentation](docs/AuthConfigurationRepresentation.md)
 - [BasicDataSourceRepresentation](docs/BasicDataSourceRepresentation.md)
 - [BoxContent](docs/BoxContent.md)
 - [BoxUserAccountCredentialsRepresentation](docs/BoxUserAccountCredentialsRepresentation.md)
 - [BulkUserUpdateRepresentation](docs/BulkUserUpdateRepresentation.md)
 - [ChangePasswordRepresentation](docs/ChangePasswordRepresentation.md)
 - [ChecklistOrderRepresentation](docs/ChecklistOrderRepresentation.md)
 - [ColumnDefinitionRepresentation](docs/ColumnDefinitionRepresentation.md)
 - [CommentAuditInfo](docs/CommentAuditInfo.md)
 - [CommentRepresentation](docs/CommentRepresentation.md)
 - [CompleteFormRepresentation](docs/CompleteFormRepresentation.md)
 - [ConditionRepresentation](docs/ConditionRepresentation.md)
 - [ContainerRepresentation](docs/ContainerRepresentation.md)
 - [CreateEndpointBasicAuthRepresentation](docs/CreateEndpointBasicAuthRepresentation.md)
 - [CreateProcessInstanceRepresentation](docs/CreateProcessInstanceRepresentation.md)
 - [CreateTenantRepresentation](docs/CreateTenantRepresentation.md)
 - [DecisionAuditRepresentation](docs/DecisionAuditRepresentation.md)
 - [DecisionTableDefinitionRepresentation](docs/DecisionTableDefinitionRepresentation.md)
 - [DecisionTableExpressionRepresentation](docs/DecisionTableExpressionRepresentation.md)
 - [DecisionTableRepresentation](docs/DecisionTableRepresentation.md)
 - [DecisionTableSaveRepresentation](docs/DecisionTableSaveRepresentation.md)
 - [DecisionTaskRepresentation](docs/DecisionTaskRepresentation.md)
 - [DynamicTableRepresentation](docs/DynamicTableRepresentation.md)
 - [EndpointBasicAuthRepresentation](docs/EndpointBasicAuthRepresentation.md)
 - [EndpointConfigurationRepresentation](docs/EndpointConfigurationRepresentation.md)
 - [EndpointRequestHeaderRepresentation](docs/EndpointRequestHeaderRepresentation.md)
 - [EntityAttributeScopeRepresentation](docs/EntityAttributeScopeRepresentation.md)
 - [EntityVariableScopeRepresentation](docs/EntityVariableScopeRepresentation.md)
 - [FieldValueInfo](docs/FieldValueInfo.md)
 - [FormDefinitionRepresentation](docs/FormDefinitionRepresentation.md)
 - [FormDefinitionRepresentationReq](docs/FormDefinitionRepresentationReq.md)
 - [FormDefinitionRepresentationRes](docs/FormDefinitionRepresentationRes.md)
 - [FormFieldRepresentation](docs/FormFieldRepresentation.md)
 - [FormIdentifierRepresentation](docs/FormIdentifierRepresentation.md)
 - [FormJavascriptEventRepresentation](docs/FormJavascriptEventRepresentation.md)
 - [FormOutcomeRepresentation](docs/FormOutcomeRepresentation.md)
 - [FormRepresentation](docs/FormRepresentation.md)
 - [FormRepresentationReq](docs/FormRepresentationReq.md)
 - [FormRepresentationRes](docs/FormRepresentationRes.md)
 - [FormSaveRepresentation](docs/FormSaveRepresentation.md)
 - [FormScopeRepresentation](docs/FormScopeRepresentation.md)
 - [FormTabRepresentation](docs/FormTabRepresentation.md)
 - [FormValueRepresentation](docs/FormValueRepresentation.md)
 - [FormVariableRepresentation](docs/FormVariableRepresentation.md)
 - [GlobalDateFormatRepresentation](docs/GlobalDateFormatRepresentation.md)
 - [GoogleDriveContent](docs/GoogleDriveContent.md)
 - [GroupCapabilityRepresentation](docs/GroupCapabilityRepresentation.md)
 - [GroupRepresentation](docs/GroupRepresentation.md)
 - [HistoricProcessInstanceQueryRepresentation](docs/HistoricProcessInstanceQueryRepresentation.md)
 - [HistoricTaskInstanceQueryRepresentation](docs/HistoricTaskInstanceQueryRepresentation.md)
 - [HyperlinkRepresentation](docs/HyperlinkRepresentation.md)
 - [IdentityLinkRepresentation](docs/IdentityLinkRepresentation.md)
 - [ImageUploadRepresentation](docs/ImageUploadRepresentation.md)
 - [JsonNode](docs/JsonNode.md)
 - [LayoutRepresentation](docs/LayoutRepresentation.md)
 - [LightAppRepresentation](docs/LightAppRepresentation.md)
 - [LightGroupRepresentation](docs/LightGroupRepresentation.md)
 - [LightTenantRepresentation](docs/LightTenantRepresentation.md)
 - [LightUserRepresentation](docs/LightUserRepresentation.md)
 - [MetaPropertyRepresentation](docs/MetaPropertyRepresentation.md)
 - [ModelRepresentation](docs/ModelRepresentation.md)
 - [NamedObject](docs/NamedObject.md)
 - [ObjectNode](docs/ObjectNode.md)
 - [OptionRepresentation](docs/OptionRepresentation.md)
 - [PasswordValidationConstraints](docs/PasswordValidationConstraints.md)
 - [ProcessContentRepresentation](docs/ProcessContentRepresentation.md)
 - [ProcessDefinitionMetaDataRepresentation](docs/ProcessDefinitionMetaDataRepresentation.md)
 - [ProcessDefinitionRepresentation](docs/ProcessDefinitionRepresentation.md)
 - [ProcessInstanceAuditInfoRepresentation](docs/ProcessInstanceAuditInfoRepresentation.md)
 - [ProcessInstanceFilterRepresentation](docs/ProcessInstanceFilterRepresentation.md)
 - [ProcessInstanceFilterRequestRepresentation](docs/ProcessInstanceFilterRequestRepresentation.md)
 - [ProcessInstanceQueryRepresentation](docs/ProcessInstanceQueryRepresentation.md)
 - [ProcessInstanceRepresentation](docs/ProcessInstanceRepresentation.md)
 - [ProcessInstanceVariableRepresentation](docs/ProcessInstanceVariableRepresentation.md)
 - [ProcessScopeIdentifierRepresentation](docs/ProcessScopeIdentifierRepresentation.md)
 - [ProcessScopeRepresentation](docs/ProcessScopeRepresentation.md)
 - [ProcessScopesRequestRepresentation](docs/ProcessScopesRequestRepresentation.md)
 - [PublishIdentityInfoRepresentation](docs/PublishIdentityInfoRepresentation.md)
 - [QueryVariable](docs/QueryVariable.md)
 - [RelatedContentRepresentation](docs/RelatedContentRepresentation.md)
 - [RequestHeaderRepresentation](docs/RequestHeaderRepresentation.md)
 - [ResetPasswordRepresentation](docs/ResetPasswordRepresentation.md)
 - [RestFieldRepresentation](docs/RestFieldRepresentation.md)
 - [RestVariable](docs/RestVariable.md)
 - [ResultListDataRepresentationAbstractUserRepresentation](docs/ResultListDataRepresentationAbstractUserRepresentation.md)
 - [ResultListDataRepresentationAccountRepresentation](docs/ResultListDataRepresentationAccountRepresentation.md)
 - [ResultListDataRepresentationAlfrescoContentRepresentation](docs/ResultListDataRepresentationAlfrescoContentRepresentation.md)
 - [ResultListDataRepresentationAlfrescoEndpointRepresentation](docs/ResultListDataRepresentationAlfrescoEndpointRepresentation.md)
 - [ResultListDataRepresentationAlfrescoSiteRepresenation](docs/ResultListDataRepresentationAlfrescoSiteRepresenation.md)
 - [ResultListDataRepresentationAppDefinitionRepresentation](docs/ResultListDataRepresentationAppDefinitionRepresentation.md)
 - [ResultListDataRepresentationAppDeploymentRepresentation](docs/ResultListDataRepresentationAppDeploymentRepresentation.md)
 - [ResultListDataRepresentationBasicDataSourceRepresentation](docs/ResultListDataRepresentationBasicDataSourceRepresentation.md)
 - [ResultListDataRepresentationBoxContent](docs/ResultListDataRepresentationBoxContent.md)
 - [ResultListDataRepresentationCommentRepresentation](docs/ResultListDataRepresentationCommentRepresentation.md)
 - [ResultListDataRepresentationDecisionAuditRepresentation](docs/ResultListDataRepresentationDecisionAuditRepresentation.md)
 - [ResultListDataRepresentationDecisionTableRepresentation](docs/ResultListDataRepresentationDecisionTableRepresentation.md)
 - [ResultListDataRepresentationDecisionTaskRepresentation](docs/ResultListDataRepresentationDecisionTaskRepresentation.md)
 - [ResultListDataRepresentationFormRepresentation](docs/ResultListDataRepresentationFormRepresentation.md)
 - [ResultListDataRepresentationGoogleDriveContent](docs/ResultListDataRepresentationGoogleDriveContent.md)
 - [ResultListDataRepresentationLightGroupRepresentation](docs/ResultListDataRepresentationLightGroupRepresentation.md)
 - [ResultListDataRepresentationLightUserRepresentation](docs/ResultListDataRepresentationLightUserRepresentation.md)
 - [ResultListDataRepresentationModelRepresentation](docs/ResultListDataRepresentationModelRepresentation.md)
 - [ResultListDataRepresentationProcessContentRepresentation](docs/ResultListDataRepresentationProcessContentRepresentation.md)
 - [ResultListDataRepresentationProcessDefinitionRepresentation](docs/ResultListDataRepresentationProcessDefinitionRepresentation.md)
 - [ResultListDataRepresentationProcessInstanceRepresentation](docs/ResultListDataRepresentationProcessInstanceRepresentation.md)
 - [ResultListDataRepresentationRelatedContentRepresentation](docs/ResultListDataRepresentationRelatedContentRepresentation.md)
 - [ResultListDataRepresentationRuntimeDecisionTableRepresentation](docs/ResultListDataRepresentationRuntimeDecisionTableRepresentation.md)
 - [ResultListDataRepresentationRuntimeFormRepresentation](docs/ResultListDataRepresentationRuntimeFormRepresentation.md)
 - [ResultListDataRepresentationSubmittedFormRepresentation](docs/ResultListDataRepresentationSubmittedFormRepresentation.md)
 - [ResultListDataRepresentationTaskRepresentation](docs/ResultListDataRepresentationTaskRepresentation.md)
 - [ResultListDataRepresentationUserProcessInstanceFilterRepresentation](docs/ResultListDataRepresentationUserProcessInstanceFilterRepresentation.md)
 - [ResultListDataRepresentationUserTaskFilterRepresentation](docs/ResultListDataRepresentationUserTaskFilterRepresentation.md)
 - [RuntimeAppDefinitionSaveRepresentation](docs/RuntimeAppDefinitionSaveRepresentation.md)
 - [RuntimeDecisionTableRepresentation](docs/RuntimeDecisionTableRepresentation.md)
 - [RuntimeFormRepresentation](docs/RuntimeFormRepresentation.md)
 - [SSOUserAccountCredentialsRepresentation](docs/SSOUserAccountCredentialsRepresentation.md)
 - [SaveFormRepresentation](docs/SaveFormRepresentation.md)
 - [SubmittedFormRepresentation](docs/SubmittedFormRepresentation.md)
 - [SyncLogEntryRepresentation](docs/SyncLogEntryRepresentation.md)
 - [SystemPropertiesRepresentation](docs/SystemPropertiesRepresentation.md)
 - [TaskAuditInfoRepresentation](docs/TaskAuditInfoRepresentation.md)
 - [TaskFilterRepresentation](docs/TaskFilterRepresentation.md)
 - [TaskFilterRequestRepresentation](docs/TaskFilterRequestRepresentation.md)
 - [TaskQueryRepresentation](docs/TaskQueryRepresentation.md)
 - [TaskRepresentation](docs/TaskRepresentation.md)
 - [TaskUpdateRepresentation](docs/TaskUpdateRepresentation.md)
 - [TenantEvent](docs/TenantEvent.md)
 - [TenantRepresentation](docs/TenantRepresentation.md)
 - [UpdateGroupRepresentation](docs/UpdateGroupRepresentation.md)
 - [UserAccountCredentialsRepresentation](docs/UserAccountCredentialsRepresentation.md)
 - [UserActionRepresentation](docs/UserActionRepresentation.md)
 - [UserFilterOrderRepresentation](docs/UserFilterOrderRepresentation.md)
 - [UserIdentifierRepresentation](docs/UserIdentifierRepresentation.md)
 - [UserProcessInstanceFilterRepresentation](docs/UserProcessInstanceFilterRepresentation.md)
 - [UserRepresentation](docs/UserRepresentation.md)
 - [UserTaskFilterRepresentation](docs/UserTaskFilterRepresentation.md)
 - [ValidationErrorRepresentation](docs/ValidationErrorRepresentation.md)
 - [VariableMappingRepresentation](docs/VariableMappingRepresentation.md)
 - [VariableScopeRepresentation](docs/VariableScopeRepresentation.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


