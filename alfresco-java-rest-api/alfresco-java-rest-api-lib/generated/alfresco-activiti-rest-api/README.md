# alfresco-activiti-rest-api

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
    <artifactId>alfresco-activiti-rest-api</artifactId>
    <version>5.0.0-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-activiti-rest-api:5.0.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-activiti-rest-api-5.0.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

  import org.alfresco.activiti.*;
  import org.alfresco.activiti.auth.*;
  import org.alfresco.activiti.model.*;
  import org.alfresco.activiti.handler.AboutApi;

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

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AboutApi* | [**getAppVersionUsingGET**](docs/AboutApi.md#getAppVersionUsingGET) | **GET** /enterprise/app-version | Get server type and version
*AccountIntegrationApi* | [**getAccountsUsingGET**](docs/AccountIntegrationApi.md#getAccountsUsingGET) | **GET** /enterprise/account/integration | Retrieve external account information
*AdminEndpointsApi* | [**createBasicAuthConfigurationUsingPOST**](docs/AdminEndpointsApi.md#createBasicAuthConfigurationUsingPOST) | **POST** /enterprise/admin/basic-auths | Add an endpoint authorization
*AdminEndpointsApi* | [**createEndpointConfigurationUsingPOST**](docs/AdminEndpointsApi.md#createEndpointConfigurationUsingPOST) | **POST** /enterprise/admin/endpoints | Create an endpoint
*AdminEndpointsApi* | [**getBasicAuthConfigurationUsingGET**](docs/AdminEndpointsApi.md#getBasicAuthConfigurationUsingGET) | **GET** /enterprise/admin/basic-auths/{basicAuthId} | Get an endpoint authorization
*AdminEndpointsApi* | [**getBasicAuthConfigurationsUsingGET**](docs/AdminEndpointsApi.md#getBasicAuthConfigurationsUsingGET) | **GET** /enterprise/admin/basic-auths | List endpoint authorizations
*AdminEndpointsApi* | [**getEndpointConfigurationUsingGET1**](docs/AdminEndpointsApi.md#getEndpointConfigurationUsingGET1) | **GET** /enterprise/admin/endpoints/{endpointConfigurationId} | Get an endpoint
*AdminEndpointsApi* | [**getEndpointConfigurationsUsingGET1**](docs/AdminEndpointsApi.md#getEndpointConfigurationsUsingGET1) | **GET** /enterprise/admin/endpoints | List endpoints
*AdminEndpointsApi* | [**removeBasicAuthonfigurationUsingDELETE**](docs/AdminEndpointsApi.md#removeBasicAuthonfigurationUsingDELETE) | **DELETE** /enterprise/admin/basic-auths/{basicAuthId} | Delete an endpoint authorization
*AdminEndpointsApi* | [**removeEndpointConfigurationUsingDELETE**](docs/AdminEndpointsApi.md#removeEndpointConfigurationUsingDELETE) | **DELETE** /enterprise/admin/endpoints/{endpointConfigurationId} | Delete an endpoint
*AdminEndpointsApi* | [**updateBasicAuthConfigurationUsingPUT**](docs/AdminEndpointsApi.md#updateBasicAuthConfigurationUsingPUT) | **PUT** /enterprise/admin/basic-auths/{basicAuthId} | Update an endpoint authorization
*AdminEndpointsApi* | [**updateEndpointConfigurationUsingPUT**](docs/AdminEndpointsApi.md#updateEndpointConfigurationUsingPUT) | **PUT** /enterprise/admin/endpoints/{endpointConfigurationId} | Update an endpoint
*AdminGroupsApi* | [**activateUsingPOST**](docs/AdminGroupsApi.md#activateUsingPOST) | **POST** /enterprise/admin/groups/{groupId}/action/activate | Activate a group
*AdminGroupsApi* | [**addAllUsersToGroupUsingPOST**](docs/AdminGroupsApi.md#addAllUsersToGroupUsingPOST) | **POST** /enterprise/admin/groups/{groupId}/add-all-users | Add users to a group
*AdminGroupsApi* | [**addGroupCapabilitiesUsingPOST**](docs/AdminGroupsApi.md#addGroupCapabilitiesUsingPOST) | **POST** /enterprise/admin/groups/{groupId}/capabilities | Add capabilities to a group
*AdminGroupsApi* | [**addGroupMemberUsingPOST**](docs/AdminGroupsApi.md#addGroupMemberUsingPOST) | **POST** /enterprise/admin/groups/{groupId}/members/{userId} | Add a user to a group
*AdminGroupsApi* | [**addRelatedGroupUsingPOST**](docs/AdminGroupsApi.md#addRelatedGroupUsingPOST) | **POST** /enterprise/admin/groups/{groupId}/related-groups/{relatedGroupId} | Get a related group
*AdminGroupsApi* | [**createNewGroupUsingPOST**](docs/AdminGroupsApi.md#createNewGroupUsingPOST) | **POST** /enterprise/admin/groups | Create a group
*AdminGroupsApi* | [**deleteGroupCapabilityUsingDELETE**](docs/AdminGroupsApi.md#deleteGroupCapabilityUsingDELETE) | **DELETE** /enterprise/admin/groups/{groupId}/capabilities/{groupCapabilityId} | Remove a capability from a group
*AdminGroupsApi* | [**deleteGroupMemberUsingDELETE**](docs/AdminGroupsApi.md#deleteGroupMemberUsingDELETE) | **DELETE** /enterprise/admin/groups/{groupId}/members/{userId} | Delete a member from a group
*AdminGroupsApi* | [**deleteGroupUsingDELETE**](docs/AdminGroupsApi.md#deleteGroupUsingDELETE) | **DELETE** /enterprise/admin/groups/{groupId} | Delete a group
*AdminGroupsApi* | [**deleteRelatedGroupUsingDELETE**](docs/AdminGroupsApi.md#deleteRelatedGroupUsingDELETE) | **DELETE** /enterprise/admin/groups/{groupId}/related-groups/{relatedGroupId} | Delete a related group
*AdminGroupsApi* | [**getCapabilitiesUsingGET**](docs/AdminGroupsApi.md#getCapabilitiesUsingGET) | **GET** /enterprise/admin/groups/{groupId}/potential-capabilities | List group capabilities
*AdminGroupsApi* | [**getGroupUsersUsingGET**](docs/AdminGroupsApi.md#getGroupUsersUsingGET) | **GET** /enterprise/admin/groups/{groupId}/users | Get group members
*AdminGroupsApi* | [**getGroupUsingGET**](docs/AdminGroupsApi.md#getGroupUsingGET) | **GET** /enterprise/admin/groups/{groupId} | Get a group
*AdminGroupsApi* | [**getGroupsUsingGET1**](docs/AdminGroupsApi.md#getGroupsUsingGET1) | **GET** /enterprise/admin/groups | Query groups
*AdminGroupsApi* | [**getRelatedGroupsUsingGET**](docs/AdminGroupsApi.md#getRelatedGroupsUsingGET) | **GET** /enterprise/admin/groups/{groupId}/related-groups | Get related groups
*AdminGroupsApi* | [**updateGroupUsingPUT**](docs/AdminGroupsApi.md#updateGroupUsingPUT) | **PUT** /enterprise/admin/groups/{groupId} | Update a group
*AdminTenantsApi* | [**createTenantUsingPOST**](docs/AdminTenantsApi.md#createTenantUsingPOST) | **POST** /enterprise/admin/tenants | Create a tenant
*AdminTenantsApi* | [**deleteTenantUsingDELETE**](docs/AdminTenantsApi.md#deleteTenantUsingDELETE) | **DELETE** /enterprise/admin/tenants/{tenantId} | Delete a tenant
*AdminTenantsApi* | [**getTenantEventsUsingGET**](docs/AdminTenantsApi.md#getTenantEventsUsingGET) | **GET** /enterprise/admin/tenants/{tenantId}/events | Get tenant events
*AdminTenantsApi* | [**getTenantLogoUsingGET**](docs/AdminTenantsApi.md#getTenantLogoUsingGET) | **GET** /enterprise/admin/tenants/{tenantId}/logo | Get a tenant&#39;s logo
*AdminTenantsApi* | [**getTenantUsingGET**](docs/AdminTenantsApi.md#getTenantUsingGET) | **GET** /enterprise/admin/tenants/{tenantId} | Get a tenant
*AdminTenantsApi* | [**getTenantsUsingGET**](docs/AdminTenantsApi.md#getTenantsUsingGET) | **GET** /enterprise/admin/tenants | List tenants
*AdminTenantsApi* | [**updateUsingPUT**](docs/AdminTenantsApi.md#updateUsingPUT) | **PUT** /enterprise/admin/tenants/{tenantId} | Update a tenant
*AdminTenantsApi* | [**uploadTenantLogoUsingPOST**](docs/AdminTenantsApi.md#uploadTenantLogoUsingPOST) | **POST** /enterprise/admin/tenants/{tenantId}/logo | Update a tenant&#39;s logo
*AdminUsersApi* | [**bulkUpdateUsersUsingPUT**](docs/AdminUsersApi.md#bulkUpdateUsersUsingPUT) | **PUT** /enterprise/admin/users | Bulk update a list of users
*AdminUsersApi* | [**createNewUserUsingPOST**](docs/AdminUsersApi.md#createNewUserUsingPOST) | **POST** /enterprise/admin/users | Create a user
*AdminUsersApi* | [**getUserUsingGET**](docs/AdminUsersApi.md#getUserUsingGET) | **GET** /enterprise/admin/users/{userId} | Get a user
*AdminUsersApi* | [**getUsersUsingGET**](docs/AdminUsersApi.md#getUsersUsingGET) | **GET** /enterprise/admin/users | Query users
*AdminUsersApi* | [**updateUserDetailsUsingPUT**](docs/AdminUsersApi.md#updateUserDetailsUsingPUT) | **PUT** /enterprise/admin/users/{userId} | Update a user
*AppDefinitionsApi* | [**deleteAppDefinitionUsingDELETE**](docs/AppDefinitionsApi.md#deleteAppDefinitionUsingDELETE) | **DELETE** /enterprise/app-definitions/{appDefinitionId} | deleteAppDefinition
*AppDefinitionsApi* | [**exportAppDefinitionUsingGET**](docs/AppDefinitionsApi.md#exportAppDefinitionUsingGET) | **GET** /enterprise/app-definitions/{modelId}/export | Export an app definition
*AppDefinitionsApi* | [**getAppDefinitionUsingGET**](docs/AppDefinitionsApi.md#getAppDefinitionUsingGET) | **GET** /enterprise/app-definitions/{modelId} | Get an app definition
*AppDefinitionsApi* | [**importAndPublishAppUsingPOST**](docs/AppDefinitionsApi.md#importAndPublishAppUsingPOST) | **POST** /enterprise/app-definitions/publish-app | importAndPublishApp
*AppDefinitionsApi* | [**importAndPublishAppUsingPOST1**](docs/AppDefinitionsApi.md#importAndPublishAppUsingPOST1) | **POST** /enterprise/app-definitions/{modelId}/publish-app | importAndPublishApp
*AppDefinitionsApi* | [**importAppDefinitionUsingPOST**](docs/AppDefinitionsApi.md#importAppDefinitionUsingPOST) | **POST** /enterprise/app-definitions/import | Import a new app definition
*AppDefinitionsApi* | [**importAppDefinitionUsingPOST1**](docs/AppDefinitionsApi.md#importAppDefinitionUsingPOST1) | **POST** /enterprise/app-definitions/{modelId}/import | Update the content of an existing app
*AppDefinitionsApi* | [**publishAppDefinitionUsingPOST**](docs/AppDefinitionsApi.md#publishAppDefinitionUsingPOST) | **POST** /enterprise/app-definitions/{modelId}/publish | Publish an app definition
*AppDefinitionsApi* | [**updateAppDefinitionUsingPUT**](docs/AppDefinitionsApi.md#updateAppDefinitionUsingPUT) | **PUT** /enterprise/app-definitions/{modelId} | Update an app definition
*ChecklistsApi* | [**addSubtaskUsingPOST**](docs/ChecklistsApi.md#addSubtaskUsingPOST) | **POST** /enterprise/tasks/{taskId}/checklist | Create a task checklist
*ChecklistsApi* | [**getChecklistUsingGET**](docs/ChecklistsApi.md#getChecklistUsingGET) | **GET** /enterprise/tasks/{taskId}/checklist | Get checklist for a task
*ChecklistsApi* | [**orderChecklistUsingPUT**](docs/ChecklistsApi.md#orderChecklistUsingPUT) | **PUT** /enterprise/tasks/{taskId}/checklist | Change the order of items on a checklist
*CommentsApi* | [**addProcessInstanceCommentUsingPOST**](docs/CommentsApi.md#addProcessInstanceCommentUsingPOST) | **POST** /enterprise/process-instances/{processInstanceId}/comments | Add a comment to a process instance
*CommentsApi* | [**addTaskCommentUsingPOST**](docs/CommentsApi.md#addTaskCommentUsingPOST) | **POST** /enterprise/tasks/{taskId}/comments | Add a comment to a task
*CommentsApi* | [**getProcessInstanceCommentsUsingGET**](docs/CommentsApi.md#getProcessInstanceCommentsUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/comments | Get comments for a process
*CommentsApi* | [**getTaskCommentsUsingGET**](docs/CommentsApi.md#getTaskCommentsUsingGET) | **GET** /enterprise/tasks/{taskId}/comments | Get comments for a task
*ContentApi* | [**createRelatedContentOnProcessInstanceUsingPOST**](docs/ContentApi.md#createRelatedContentOnProcessInstanceUsingPOST) | **POST** /enterprise/process-instances/{processInstanceId}/content | Attach existing content to a process instance
*ContentApi* | [**createRelatedContentOnProcessInstanceUsingPOST1**](docs/ContentApi.md#createRelatedContentOnProcessInstanceUsingPOST1) | **POST** /enterprise/process-instances/{processInstanceId}/raw-content | Upload content and attach to a process instance
*ContentApi* | [**createRelatedContentOnTaskUsingPOST**](docs/ContentApi.md#createRelatedContentOnTaskUsingPOST) | **POST** /enterprise/tasks/{taskId}/content | Attach existing content to a task
*ContentApi* | [**createRelatedContentOnTaskUsingPOST1**](docs/ContentApi.md#createRelatedContentOnTaskUsingPOST1) | **POST** /enterprise/tasks/{taskId}/raw-content | Upload content and attach to a task
*ContentApi* | [**createTemporaryRawRelatedContentUsingPOST**](docs/ContentApi.md#createTemporaryRawRelatedContentUsingPOST) | **POST** /enterprise/content/raw | Upload content and create a local representation
*ContentApi* | [**createTemporaryRelatedContentUsingPOST**](docs/ContentApi.md#createTemporaryRelatedContentUsingPOST) | **POST** /enterprise/content | Create a local representation of content from a remote repository
*ContentApi* | [**deleteContentUsingDELETE**](docs/ContentApi.md#deleteContentUsingDELETE) | **DELETE** /enterprise/content/{contentId} | Remove a local content representation
*ContentApi* | [**getContentUsingGET**](docs/ContentApi.md#getContentUsingGET) | **GET** /enterprise/content/{contentId} | Get a local content representation
*ContentApi* | [**getRawContentUsingGET**](docs/ContentApi.md#getRawContentUsingGET) | **GET** /enterprise/content/{contentId}/rendition/{renditionType} | Stream content rendition
*ContentApi* | [**getRawContentUsingGET1**](docs/ContentApi.md#getRawContentUsingGET1) | **GET** /enterprise/content/{contentId}/raw | Stream content from a local content representation
*ContentApi* | [**getRelatedContentForProcessInstanceUsingGET**](docs/ContentApi.md#getRelatedContentForProcessInstanceUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/content | List content attached to a process instance
*ContentApi* | [**getRelatedContentForTaskUsingGET**](docs/ContentApi.md#getRelatedContentForTaskUsingGET) | **GET** /enterprise/tasks/{taskId}/content | List content attached to a task
*DataSourcesApi* | [**getDataSourcesUsingGET**](docs/DataSourcesApi.md#getDataSourcesUsingGET) | **GET** /enterprise/editor/data-sources | Get data sources
*DecisionAuditsApi* | [**getAuditTrailUsingGET**](docs/DecisionAuditsApi.md#getAuditTrailUsingGET) | **GET** /enterprise/decisions/audits/{auditTrailId} | Get an audit trail
*DecisionAuditsApi* | [**getAuditTrailsUsingGET**](docs/DecisionAuditsApi.md#getAuditTrailsUsingGET) | **GET** /enterprise/decisions/audits | Query decision table audit trails
*DecisionTableModelsApi* | [**exportDecisionTableUsingGET**](docs/DecisionTableModelsApi.md#exportDecisionTableUsingGET) | **GET** /enterprise/editor/decision-table-models/{decisionTableId}/export | Export decision table model.
*DecisionTableModelsApi* | [**exportHistoricDecisionTableUsingGET**](docs/DecisionTableModelsApi.md#exportHistoricDecisionTableUsingGET) | **GET** /enterprise/editor/decision-table-models/history/{historyModelId}/export | Export specific version for decision table model.
*DecisionTableModelsApi* | [**getDecisionTableUsingGET1**](docs/DecisionTableModelsApi.md#getDecisionTableUsingGET1) | **GET** /enterprise/editor/decision-table-models/{decisionTableId} | Get a decision table model by id.
*DecisionTableModelsApi* | [**getDecisionTablesUsingGET1**](docs/DecisionTableModelsApi.md#getDecisionTablesUsingGET1) | **GET** /enterprise/editor/decision-table-models/values | Get a specific list of decision table models (with decision table definition) by their ids.
*DecisionTableModelsApi* | [**getDecisionTablesUsingGET2**](docs/DecisionTableModelsApi.md#getDecisionTablesUsingGET2) | **GET** /enterprise/editor/decision-table-models | Get a list of decision table models (without decision table definition).
*DecisionTableModelsApi* | [**getHistoricDecisionTableUsingGET**](docs/DecisionTableModelsApi.md#getHistoricDecisionTableUsingGET) | **GET** /enterprise/editor/decision-table-models/history/{historyModelId} | Get specific version of a decision table model by id.
*DecisionTableModelsApi* | [**importDecisionTableTextUsingPOST**](docs/DecisionTableModelsApi.md#importDecisionTableTextUsingPOST) | **POST** /enterprise/editor/decision-table-models/import-decision-table-text | Import decision table. This method return the decision table representation response as plain text.
*DecisionTableModelsApi* | [**importDecisionTableUsingPOST**](docs/DecisionTableModelsApi.md#importDecisionTableUsingPOST) | **POST** /enterprise/editor/decision-table-models/import-decision-table | Import decision table model.
*DecisionTableModelsApi* | [**saveDecisionTableUsingPUT**](docs/DecisionTableModelsApi.md#saveDecisionTableUsingPUT) | **PUT** /enterprise/editor/decision-table-models/{decisionTableId} | Update decision table model.
*DecisionTableModelsApi* | [**validateModelUsingPUT**](docs/DecisionTableModelsApi.md#validateModelUsingPUT) | **PUT** /enterprise/editor/decision-table-models/{decisionTableId}/validate | Validate decision table model.
*DecisionTablesApi* | [**getDecisionTableEditorJsonUsingGET**](docs/DecisionTablesApi.md#getDecisionTableEditorJsonUsingGET) | **GET** /enterprise/decisions/decision-tables/{decisionTableId}/editorJson | Get definition for a decision table
*DecisionTablesApi* | [**getDecisionTableUsingGET**](docs/DecisionTablesApi.md#getDecisionTableUsingGET) | **GET** /enterprise/decisions/decision-tables/{decisionTableId} | Get a decision table
*DecisionTablesApi* | [**getDecisionTablesUsingGET**](docs/DecisionTablesApi.md#getDecisionTablesUsingGET) | **GET** /enterprise/decisions/decision-tables | Query decision tables
*EndpointsApi* | [**getEndpointConfigurationUsingGET**](docs/EndpointsApi.md#getEndpointConfigurationUsingGET) | **GET** /enterprise/editor/endpoints/{endpointConfigurationId} | Get an endpoint configuration
*EndpointsApi* | [**getEndpointConfigurationsUsingGET**](docs/EndpointsApi.md#getEndpointConfigurationsUsingGET) | **GET** /enterprise/editor/endpoints | List endpoint configurations
*FormModelsApi* | [**getFormEditorJsonUsingGET**](docs/FormModelsApi.md#getFormEditorJsonUsingGET) | **GET** /enterprise/forms/{formId}/editorJson | Get form content
*FormModelsApi* | [**getFormHistoryUsingGET**](docs/FormModelsApi.md#getFormHistoryUsingGET) | **GET** /enterprise/editor/form-models/{formId}/history/{formHistoryId} | Get form history
*FormModelsApi* | [**getFormUsingGET**](docs/FormModelsApi.md#getFormUsingGET) | **GET** /enterprise/editor/form-models/{formId} | Get a form model
*FormModelsApi* | [**getFormUsingGET1**](docs/FormModelsApi.md#getFormUsingGET1) | **GET** /enterprise/forms/{formId} | Get a form
*FormModelsApi* | [**getFormsUsingGET**](docs/FormModelsApi.md#getFormsUsingGET) | **GET** /enterprise/editor/form-models/values | Get forms
*FormModelsApi* | [**getFormsUsingGET1**](docs/FormModelsApi.md#getFormsUsingGET1) | **GET** /enterprise/editor/form-models | List form models
*FormModelsApi* | [**getFormsUsingGET2**](docs/FormModelsApi.md#getFormsUsingGET2) | **GET** /enterprise/forms | Query forms
*FormModelsApi* | [**saveFormUsingPUT**](docs/FormModelsApi.md#saveFormUsingPUT) | **PUT** /enterprise/editor/form-models/{formId} | Update form model content
*FormModelsApi* | [**validateModelUsingPUT1**](docs/FormModelsApi.md#validateModelUsingPUT1) | **PUT** /enterprise/editor/form-models/{formId}/validate | Validate form model content
*GroupsApi* | [**getGroupsUsingGET**](docs/GroupsApi.md#getGroupsUsingGET) | **GET** /enterprise/groups | Query groups
*GroupsApi* | [**getUsersForGroupUsingGET**](docs/GroupsApi.md#getUsersForGroupUsingGET) | **GET** /enterprise/groups/{groupId}/users | List members of a group
*IdmSyncApi* | [**getLogFileUsingGET**](docs/IdmSyncApi.md#getLogFileUsingGET) | **GET** /enterprise/idm-sync-log-entries/{syncLogEntryId}/logfile | Get log file for a sync log entry
*IdmSyncApi* | [**getSyncLogEntriesUsingGET**](docs/IdmSyncApi.md#getSyncLogEntriesUsingGET) | **GET** /enterprise/idm-sync-log-entries | List sync log entries
*IntegrationAlfrescoOnpremiseApi* | [**getAllSitesUsingGET**](docs/IntegrationAlfrescoOnpremiseApi.md#getAllSitesUsingGET) | **GET** /enterprise/integration/alfresco/{repositoryId}/sites | List Alfresco sites
*IntegrationAlfrescoOnpremiseApi* | [**getContentInFolderPathUsingGET**](docs/IntegrationAlfrescoOnpremiseApi.md#getContentInFolderPathUsingGET) | **GET** /enterprise/rest/integration/alfresco/{repositoryId}/sites/{siteId}/folderpath/{folderPath}/content | List files and folders inside a specific folder identified by folder path
*IntegrationAlfrescoOnpremiseApi* | [**getContentInFolderUsingGET**](docs/IntegrationAlfrescoOnpremiseApi.md#getContentInFolderUsingGET) | **GET** /enterprise/integration/alfresco/{repositoryId}/folders/{folderId}/content | List files and folders inside a specific folder
*IntegrationAlfrescoOnpremiseApi* | [**getContentInSiteUsingGET**](docs/IntegrationAlfrescoOnpremiseApi.md#getContentInSiteUsingGET) | **GET** /enterprise/integration/alfresco/{repositoryId}/sites/{siteId}/content | List files and folders inside a specific site
*IntegrationAlfrescoOnpremiseApi* | [**getRepositoriesUsingGET**](docs/IntegrationAlfrescoOnpremiseApi.md#getRepositoriesUsingGET) | **GET** /enterprise/profile/accounts/alfresco | List Alfresco repositories
*IntegrationBoxApi* | [**confirmAuthorisationUsingGET**](docs/IntegrationBoxApi.md#confirmAuthorisationUsingGET) | **GET** /enterprise/integration/box/confirm-auth-request | Box Authorization
*IntegrationBoxApi* | [**createRepositoryAccountUsingPOST**](docs/IntegrationBoxApi.md#createRepositoryAccountUsingPOST) | **POST** /enterprise/integration/box/{userId}/account | Add Box account
*IntegrationBoxApi* | [**deleteRepositoryAccountUsingDELETE**](docs/IntegrationBoxApi.md#deleteRepositoryAccountUsingDELETE) | **DELETE** /enterprise/integration/box/{userId}/account | Delete account information
*IntegrationBoxApi* | [**getBoxPluginStatusUsingGET**](docs/IntegrationBoxApi.md#getBoxPluginStatusUsingGET) | **GET** /enterprise/integration/box/status | Get status information
*IntegrationBoxApi* | [**getFilesUsingGET**](docs/IntegrationBoxApi.md#getFilesUsingGET) | **GET** /enterprise/integration/box/files | List file and folders
*IntegrationBoxApi* | [**getRepositoryAccountUsingGET**](docs/IntegrationBoxApi.md#getRepositoryAccountUsingGET) | **GET** /enterprise/integration/box/{userId}/account | Get account information
*IntegrationBoxApi* | [**updateRepositoryAccountUsingPUT**](docs/IntegrationBoxApi.md#updateRepositoryAccountUsingPUT) | **PUT** /enterprise/integration/box/{userId}/account | Update account information
*IntegrationDriveApi* | [**confirmAuthorisationUsingGET1**](docs/IntegrationDriveApi.md#confirmAuthorisationUsingGET1) | **GET** /enterprise/integration/google-drive/confirm-auth-request | Drive Authorization
*IntegrationDriveApi* | [**getFilesUsingGET1**](docs/IntegrationDriveApi.md#getFilesUsingGET1) | **GET** /enterprise/integration/google-drive/files | List files and folders
*IntegrationSsoApi* | [**confirmAuthorisationUsingGET2**](docs/IntegrationSsoApi.md#confirmAuthorisationUsingGET2) | **GET** /enterprise/integration/sso/confirm-auth-request | SSO Authorization
*IntegrationSsoApi* | [**deleteRepositoryAccountUsingDELETE1**](docs/IntegrationSsoApi.md#deleteRepositoryAccountUsingDELETE1) | **DELETE** /enterprise/integration/sso/{repositoryId}/account | Delete account information
*IntegrationSsoApi* | [**getRepositoryAccountUsingGET1**](docs/IntegrationSsoApi.md#getRepositoryAccountUsingGET1) | **GET** /enterprise/integration/sso/{repositoryId}/account | Get account information
*ModelsApi* | [**createModelUsingPOST**](docs/ModelsApi.md#createModelUsingPOST) | **POST** /enterprise/models | Create a new model
*ModelsApi* | [**deleteModelUsingDELETE**](docs/ModelsApi.md#deleteModelUsingDELETE) | **DELETE** /enterprise/models/{modelId} | Delete a model
*ModelsApi* | [**duplicateModelUsingPOST**](docs/ModelsApi.md#duplicateModelUsingPOST) | **POST** /enterprise/models/{modelId}/clone | Duplicate an existing model
*ModelsApi* | [**getModelJSONUsingGET**](docs/ModelsApi.md#getModelJSONUsingGET) | **GET** /enterprise/models/{modelId}/editor/json | Get model content
*ModelsApi* | [**getModelThumbnailUsingGET**](docs/ModelsApi.md#getModelThumbnailUsingGET) | **GET** /enterprise/models/{modelId}/thumbnail | Get a model&#39;s thumbnail image
*ModelsApi* | [**getModelUsingGET**](docs/ModelsApi.md#getModelUsingGET) | **GET** /enterprise/models/{modelId} | Get a model
*ModelsApi* | [**getModelsToIncludeInAppDefinitionUsingGET**](docs/ModelsApi.md#getModelsToIncludeInAppDefinitionUsingGET) | **GET** /enterprise/models-for-app-definition | List process definition models shared with the current user
*ModelsApi* | [**getModelsUsingGET**](docs/ModelsApi.md#getModelsUsingGET) | **GET** /enterprise/models | List models (process, form, decision rule or app)
*ModelsApi* | [**importNewVersionUsingPOST**](docs/ModelsApi.md#importNewVersionUsingPOST) | **POST** /enterprise/models/{modelId}/newversion | Create a new version of a model
*ModelsApi* | [**importProcessModelUsingPOST**](docs/ModelsApi.md#importProcessModelUsingPOST) | **POST** /enterprise/process-models/import | Import a BPMN 2.0 XML file
*ModelsApi* | [**saveModelUsingPOST**](docs/ModelsApi.md#saveModelUsingPOST) | **POST** /enterprise/models/{modelId}/editor/json | Update model content
*ModelsApi* | [**updateModelUsingPUT**](docs/ModelsApi.md#updateModelUsingPUT) | **PUT** /enterprise/models/{modelId} | Update a model
*ModelsApi* | [**validateModelUsingPOST**](docs/ModelsApi.md#validateModelUsingPOST) | **POST** /enterprise/models/{modelId}/editor/validate | Validate model content
*ModelsBpmnApi* | [**getHistoricProcessModelBpmn20XmlUsingGET**](docs/ModelsBpmnApi.md#getHistoricProcessModelBpmn20XmlUsingGET) | **GET** /enterprise/models/{processModelId}/history/{processModelHistoryId}/bpmn20 | Export a historic version of a process definition as BPMN 2.0 XML
*ModelsBpmnApi* | [**getProcessModelBpmn20XmlUsingGET**](docs/ModelsBpmnApi.md#getProcessModelBpmn20XmlUsingGET) | **GET** /enterprise/models/{processModelId}/bpmn20 | Export a process definition as BPMN 2.0 XML
*ModelsHistoryApi* | [**getModelHistoryCollectionUsingGET**](docs/ModelsHistoryApi.md#getModelHistoryCollectionUsingGET) | **GET** /enterprise/models/{modelId}/history | List a model&#39;s historic versions
*ModelsHistoryApi* | [**getProcessModelHistoryUsingGET**](docs/ModelsHistoryApi.md#getProcessModelHistoryUsingGET) | **GET** /enterprise/models/{modelId}/history/{modelHistoryId} | Get a historic version of a model
*ProcessDefinitionsApi* | [**createIdentityLinkUsingPOST**](docs/ProcessDefinitionsApi.md#createIdentityLinkUsingPOST) | **POST** /enterprise/process-definitions/{processDefinitionId}/identitylinks | Add a user or group involvement to a process definition
*ProcessDefinitionsApi* | [**deleteIdentityLinkUsingDELETE**](docs/ProcessDefinitionsApi.md#deleteIdentityLinkUsingDELETE) | **DELETE** /enterprise/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId} | Remove a user or group involvement from a process definition
*ProcessDefinitionsApi* | [**getIdentityLinkTypeUsingGET**](docs/ProcessDefinitionsApi.md#getIdentityLinkTypeUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId} | Get a user or group involvement with a process definition
*ProcessDefinitionsApi* | [**getIdentityLinksForFamilyUsingGET**](docs/ProcessDefinitionsApi.md#getIdentityLinksForFamilyUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/identitylinks/{family} | List either the users or groups involved with a process definition
*ProcessDefinitionsApi* | [**getIdentityLinksUsingGET**](docs/ProcessDefinitionsApi.md#getIdentityLinksUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/identitylinks | List the users and groups involved with a process definition
*ProcessDefinitionsApi* | [**getProcessDefinitionDecisionTablesUsingGET**](docs/ProcessDefinitionsApi.md#getProcessDefinitionDecisionTablesUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/decision-tables | List the decision tables associated with a process definition
*ProcessDefinitionsApi* | [**getProcessDefinitionFormsUsingGET**](docs/ProcessDefinitionsApi.md#getProcessDefinitionFormsUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/forms | List the forms associated with a process definition
*ProcessDefinitionsApi* | [**getProcessDefinitionStartFormUsingGET**](docs/ProcessDefinitionsApi.md#getProcessDefinitionStartFormUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/start-form | Retrieve the start form for a process definition
*ProcessDefinitionsApi* | [**getProcessDefinitionsUsingGET**](docs/ProcessDefinitionsApi.md#getProcessDefinitionsUsingGET) | **GET** /enterprise/process-definitions | Retrieve a list of process definitions
*ProcessDefinitionsApi* | [**getRestFieldValuesUsingGET**](docs/ProcessDefinitionsApi.md#getRestFieldValuesUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/start-form-values/{field} | Retrieve field values (eg. the typeahead field)
*ProcessDefinitionsApi* | [**getRestTableFieldValuesUsingGET**](docs/ProcessDefinitionsApi.md#getRestTableFieldValuesUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/start-form-values/{field}/{column} | Retrieve field values (eg. the table field)
*ProcessInstanceVariablesApi* | [**createOrUpdateProcessInstanceVariablesUsingPUT**](docs/ProcessInstanceVariablesApi.md#createOrUpdateProcessInstanceVariablesUsingPUT) | **PUT** /enterprise/process-instances/{processInstanceId}/variables | Create or update variables
*ProcessInstanceVariablesApi* | [**createProcessInstanceVariablesUsingPOST**](docs/ProcessInstanceVariablesApi.md#createProcessInstanceVariablesUsingPOST) | **POST** /enterprise/process-instances/{processInstanceId}/variables | Create variables
*ProcessInstanceVariablesApi* | [**deleteProcessInstanceVariableUsingDELETE**](docs/ProcessInstanceVariablesApi.md#deleteProcessInstanceVariableUsingDELETE) | **DELETE** /enterprise/process-instances/{processInstanceId}/variables/{variableName} | Delete a variable
*ProcessInstanceVariablesApi* | [**getProcessInstanceVariableUsingGET**](docs/ProcessInstanceVariablesApi.md#getProcessInstanceVariableUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/variables/{variableName} | Get a variable
*ProcessInstanceVariablesApi* | [**getProcessInstanceVariablesUsingGET**](docs/ProcessInstanceVariablesApi.md#getProcessInstanceVariablesUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/variables | List variables
*ProcessInstanceVariablesApi* | [**updateProcessInstanceVariableUsingPUT**](docs/ProcessInstanceVariablesApi.md#updateProcessInstanceVariableUsingPUT) | **PUT** /enterprise/process-instances/{processInstanceId}/variables/{variableName} | Update a variable
*ProcessInstancesApi* | [**activateProcessInstanceUsingPUT**](docs/ProcessInstancesApi.md#activateProcessInstanceUsingPUT) | **PUT** /enterprise/process-instances/{processInstanceId}/activate | Activate a process instance
*ProcessInstancesApi* | [**createIdentityLinkUsingPOST1**](docs/ProcessInstancesApi.md#createIdentityLinkUsingPOST1) | **POST** /enterprise/process-instances/{processInstanceId}/identitylinks | Add a user or group involvement to a process instance
*ProcessInstancesApi* | [**deleteIdentityLinkUsingDELETE1**](docs/ProcessInstancesApi.md#deleteIdentityLinkUsingDELETE1) | **DELETE** /enterprise/process-instances/{processInstanceId}/identitylinks/{family}/{identityId}/{type} | Remove a user or group involvement from a process instance
*ProcessInstancesApi* | [**deleteProcessInstanceUsingDELETE**](docs/ProcessInstancesApi.md#deleteProcessInstanceUsingDELETE) | **DELETE** /enterprise/process-instances/{processInstanceId} | Cancel or remove a process instance
*ProcessInstancesApi* | [**filterProcessInstancesUsingPOST**](docs/ProcessInstancesApi.md#filterProcessInstancesUsingPOST) | **POST** /enterprise/process-instances/filter | List process instances using a filter
*ProcessInstancesApi* | [**getHistoricProcessInstanceDecisionTasksUsingGET**](docs/ProcessInstancesApi.md#getHistoricProcessInstanceDecisionTasksUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/decision-tasks | Get decision tasks in a process instance
*ProcessInstancesApi* | [**getHistoricProcessInstanceVariablesUsingGET**](docs/ProcessInstancesApi.md#getHistoricProcessInstanceVariablesUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/historic-variables | Get historic variables for a process instance
*ProcessInstancesApi* | [**getHistoricProcessInstancesUsingPOST**](docs/ProcessInstancesApi.md#getHistoricProcessInstancesUsingPOST) | **POST** /enterprise/historic-process-instances/query | Query historic process instances
*ProcessInstancesApi* | [**getIdentityLinkTypeUsingGET1**](docs/ProcessInstancesApi.md#getIdentityLinkTypeUsingGET1) | **GET** /enterprise/process-instances/{processInstanceId}/identitylinks/{family}/{identityId}/{type} | Get a user or group involvement with a process instance
*ProcessInstancesApi* | [**getIdentityLinksForFamilyUsingGET1**](docs/ProcessInstancesApi.md#getIdentityLinksForFamilyUsingGET1) | **GET** /enterprise/process-instances/{processInstanceId}/identitylinks/{family} | List either the users or groups involved with a process instance
*ProcessInstancesApi* | [**getIdentityLinksUsingGET1**](docs/ProcessInstancesApi.md#getIdentityLinksUsingGET1) | **GET** /enterprise/process-instances/{processInstanceId}/identitylinks | List the users and groups involved with a process instance
*ProcessInstancesApi* | [**getProcessInstanceContentUsingGET**](docs/ProcessInstancesApi.md#getProcessInstanceContentUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/field-content | List content attached to process instance fields
*ProcessInstancesApi* | [**getProcessInstanceDiagramUsingGET**](docs/ProcessInstancesApi.md#getProcessInstanceDiagramUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/diagram | Get the process diagram for the process instance
*ProcessInstancesApi* | [**getProcessInstanceStartFormUsingGET**](docs/ProcessInstancesApi.md#getProcessInstanceStartFormUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/start-form | Get a process instance start form
*ProcessInstancesApi* | [**getProcessInstanceUsingGET**](docs/ProcessInstancesApi.md#getProcessInstanceUsingGET) | **GET** /enterprise/process-instances/{processInstanceId} | Get a process instance
*ProcessInstancesApi* | [**getProcessInstancesUsingPOST**](docs/ProcessInstancesApi.md#getProcessInstancesUsingPOST) | **POST** /enterprise/process-instances/query | Query process instances
*ProcessInstancesApi* | [**getTaskAuditLogUsingGET**](docs/ProcessInstancesApi.md#getTaskAuditLogUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/audit-log | Get the audit log for a process instance
*ProcessInstancesApi* | [**startNewProcessInstanceUsingPOST**](docs/ProcessInstancesApi.md#startNewProcessInstanceUsingPOST) | **POST** /enterprise/process-instances | Start a process instance
*ProcessInstancesApi* | [**suspendProcessInstanceUsingPUT**](docs/ProcessInstancesApi.md#suspendProcessInstanceUsingPUT) | **PUT** /enterprise/process-instances/{processInstanceId}/suspend | Suspend a process instance
*ProcessScopesApi* | [**getRuntimeProcessScopesUsingPOST**](docs/ProcessScopesApi.md#getRuntimeProcessScopesUsingPOST) | **POST** /enterprise/process-scopes | List runtime process scopes
*RuntimeAppDefinitionsApi* | [**deployAppDefinitionsUsingPOST**](docs/RuntimeAppDefinitionsApi.md#deployAppDefinitionsUsingPOST) | **POST** /enterprise/runtime-app-definitions | Deploy a published app
*RuntimeAppDefinitionsApi* | [**getAppDefinitionUsingGET1**](docs/RuntimeAppDefinitionsApi.md#getAppDefinitionUsingGET1) | **GET** /enterprise/runtime-app-definitions/{appDefinitionId} | Get a runtime app
*RuntimeAppDefinitionsApi* | [**getAppDefinitionsUsingGET**](docs/RuntimeAppDefinitionsApi.md#getAppDefinitionsUsingGET) | **GET** /enterprise/runtime-app-definitions | List runtime apps
*RuntimeAppDeploymentsApi* | [**deleteAppDeploymentUsingDELETE**](docs/RuntimeAppDeploymentsApi.md#deleteAppDeploymentUsingDELETE) | **DELETE** /enterprise/runtime-app-deployments/{appDeploymentId} | Remove an app deployment
*RuntimeAppDeploymentsApi* | [**exportAppDefinitionUsingGET1**](docs/RuntimeAppDeploymentsApi.md#exportAppDefinitionUsingGET1) | **GET** /enterprise/export-app-deployment/{deploymentId} | Export the app archive for a deployment
*RuntimeAppDeploymentsApi* | [**getAppDefinitionsUsingGET1**](docs/RuntimeAppDeploymentsApi.md#getAppDefinitionsUsingGET1) | **GET** /enterprise/runtime-app-deployments | Query app deployments
*RuntimeAppDeploymentsApi* | [**getAppDeploymentUsingGET**](docs/RuntimeAppDeploymentsApi.md#getAppDeploymentUsingGET) | **GET** /enterprise/runtime-app-deployments/{appDeploymentId} | Get an app deployment
*RuntimeAppDeploymentsApi* | [**getRuntimeAppDeploymentByDeploymentUsingGET**](docs/RuntimeAppDeploymentsApi.md#getRuntimeAppDeploymentByDeploymentUsingGET) | **GET** /enterprise/runtime-app-deployment | Get an app by deployment ID or DMN deployment ID
*ScriptFilesApi* | [**getControllersUsingGET**](docs/ScriptFilesApi.md#getControllersUsingGET) | **GET** /enterprise/script-files/controllers | getControllers
*ScriptFilesApi* | [**getLibrariesUsingGET**](docs/ScriptFilesApi.md#getLibrariesUsingGET) | **GET** /enterprise/script-files/libraries | getLibraries
*SubmittedFormsApi* | [**getFormSubmittedFromsUsingGET**](docs/SubmittedFormsApi.md#getFormSubmittedFromsUsingGET) | **GET** /enterprise/form-submitted-forms/{formId} | List submissions for a form
*SubmittedFormsApi* | [**getProcessSubmittedFromsUsingGET**](docs/SubmittedFormsApi.md#getProcessSubmittedFromsUsingGET) | **GET** /enterprise/process-submitted-forms/{processId} | List submissions for a process instance
*SubmittedFormsApi* | [**getSubmittedFromUsingGET**](docs/SubmittedFormsApi.md#getSubmittedFromUsingGET) | **GET** /enterprise/submitted-forms/{submittedFormId} | Get a form submission
*SubmittedFormsApi* | [**getTaskSubmittedFromsUsingGET**](docs/SubmittedFormsApi.md#getTaskSubmittedFromsUsingGET) | **GET** /enterprise/task-submitted-form/{taskId} | Get the submitted form for a task
*SystemPropertiesApi* | [**getGlobalDateFormatUsingGET**](docs/SystemPropertiesApi.md#getGlobalDateFormatUsingGET) | **GET** /enterprise/system/properties/global-date-format/{tenantId} | Get global date format
*SystemPropertiesApi* | [**getPasswordValidationConstraintsUsingGET**](docs/SystemPropertiesApi.md#getPasswordValidationConstraintsUsingGET) | **GET** /enterprise/system/properties/password-validation-constraints/{tenantId} | Get password validation constraints
*SystemPropertiesApi* | [**getPropertiesUsingGET**](docs/SystemPropertiesApi.md#getPropertiesUsingGET) | **GET** /enterprise/system/properties | Retrieve system properties
*SystemPropertiesApi* | [**involvedUsersCanEditFormsUsingGET**](docs/SystemPropertiesApi.md#involvedUsersCanEditFormsUsingGET) | **GET** /enterprise/system/properties/involved-users-can-edit-forms/{tenantId} | Get involved users who can edit forms
*TaskActionsApi* | [**assignTaskUsingPUT**](docs/TaskActionsApi.md#assignTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/assign | Assign a task to a user
*TaskActionsApi* | [**attachFormUsingPUT**](docs/TaskActionsApi.md#attachFormUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/attach-form | Attach a form to a task
*TaskActionsApi* | [**claimTaskUsingPUT**](docs/TaskActionsApi.md#claimTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/claim | Claim a task
*TaskActionsApi* | [**completeTaskUsingPUT**](docs/TaskActionsApi.md#completeTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/complete | Complete a task
*TaskActionsApi* | [**delegateTaskUsingPUT**](docs/TaskActionsApi.md#delegateTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/delegate | Delegate a task
*TaskActionsApi* | [**involveGroupUsingPOST**](docs/TaskActionsApi.md#involveGroupUsingPOST) | **POST** /enterprise/tasks/{taskId}/groups/{groupId} | Involve a group with a task
*TaskActionsApi* | [**involveUserUsingPUT**](docs/TaskActionsApi.md#involveUserUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/involve | Involve a user with a task
*TaskActionsApi* | [**removeFormUsingDELETE**](docs/TaskActionsApi.md#removeFormUsingDELETE) | **DELETE** /enterprise/tasks/{taskId}/action/remove-form | Remove a form from a task
*TaskActionsApi* | [**removeInvolvedUserUsingDELETE**](docs/TaskActionsApi.md#removeInvolvedUserUsingDELETE) | **DELETE** /enterprise/tasks/{taskId}/groups/{groupId} | Remove an involved group from a task
*TaskActionsApi* | [**removeInvolvedUserUsingPUT**](docs/TaskActionsApi.md#removeInvolvedUserUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/remove-involved | Remove an involved user from a task
*TaskActionsApi* | [**resolveTaskUsingPUT**](docs/TaskActionsApi.md#resolveTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/resolve | Resolve a task
*TaskActionsApi* | [**unclaimTaskUsingPUT**](docs/TaskActionsApi.md#unclaimTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/unclaim | Unclaim a task
*TaskFormsApi* | [**completeTaskFormUsingPOST**](docs/TaskFormsApi.md#completeTaskFormUsingPOST) | **POST** /enterprise/task-forms/{taskId} | Complete a task form
*TaskFormsApi* | [**getProcessInstanceVariablesUsingGET1**](docs/TaskFormsApi.md#getProcessInstanceVariablesUsingGET1) | **GET** /enterprise/task-forms/{taskId}/variables | Get task variables
*TaskFormsApi* | [**getRestFieldValuesUsingGET1**](docs/TaskFormsApi.md#getRestFieldValuesUsingGET1) | **GET** /enterprise/task-forms/{taskId}/form-values/{field}/{column} | Retrieve column field values
*TaskFormsApi* | [**getRestFieldValuesUsingGET2**](docs/TaskFormsApi.md#getRestFieldValuesUsingGET2) | **GET** /enterprise/task-forms/{taskId}/form-values/{field} | Retrieve populated field values
*TaskFormsApi* | [**getTaskFormUsingGET**](docs/TaskFormsApi.md#getTaskFormUsingGET) | **GET** /enterprise/task-forms/{taskId} | Get a task form
*TaskFormsApi* | [**saveTaskFormUsingPOST**](docs/TaskFormsApi.md#saveTaskFormUsingPOST) | **POST** /enterprise/task-forms/{taskId}/save-form | Save a task form
*TaskVariablesApi* | [**createTaskVariableUsingPOST**](docs/TaskVariablesApi.md#createTaskVariableUsingPOST) | **POST** /enterprise/tasks/{taskId}/variables | Create variables
*TaskVariablesApi* | [**deleteAllLocalTaskVariablesUsingDELETE**](docs/TaskVariablesApi.md#deleteAllLocalTaskVariablesUsingDELETE) | **DELETE** /enterprise/tasks/{taskId}/variables | Create or update variables
*TaskVariablesApi* | [**deleteVariableUsingDELETE**](docs/TaskVariablesApi.md#deleteVariableUsingDELETE) | **DELETE** /enterprise/tasks/{taskId}/variables/{variableName} | Delete a variable
*TaskVariablesApi* | [**getVariableUsingGET**](docs/TaskVariablesApi.md#getVariableUsingGET) | **GET** /enterprise/tasks/{taskId}/variables/{variableName} | Get a variable
*TaskVariablesApi* | [**getVariablesUsingGET**](docs/TaskVariablesApi.md#getVariablesUsingGET) | **GET** /enterprise/tasks/{taskId}/variables | List variables
*TaskVariablesApi* | [**updateVariableUsingPUT**](docs/TaskVariablesApi.md#updateVariableUsingPUT) | **PUT** /enterprise/tasks/{taskId}/variables/{variableName} | Update a variable
*TasksApi* | [**createIdentityLinkUsingPOST2**](docs/TasksApi.md#createIdentityLinkUsingPOST2) | **POST** /enterprise/tasks/{taskId}/identitylinks | List the users and groups involved with a task
*TasksApi* | [**createNewTaskUsingPOST**](docs/TasksApi.md#createNewTaskUsingPOST) | **POST** /enterprise/tasks | Create a standalone task
*TasksApi* | [**deleteIdentityLinkUsingDELETE2**](docs/TasksApi.md#deleteIdentityLinkUsingDELETE2) | **DELETE** /enterprise/tasks/{taskId}/identitylinks/{family}/{identityId}/{type} | Remove a user or group involvement from a task
*TasksApi* | [**deleteTaskUsingDELETE**](docs/TasksApi.md#deleteTaskUsingDELETE) | **DELETE** /enterprise/tasks/{taskId} | Delete a task
*TasksApi* | [**filterTasksUsingPOST**](docs/TasksApi.md#filterTasksUsingPOST) | **POST** /enterprise/tasks/filter | Filter a list of tasks
*TasksApi* | [**getIdentityLinkTypeUsingGET2**](docs/TasksApi.md#getIdentityLinkTypeUsingGET2) | **GET** /enterprise/tasks/{taskId}/identitylinks/{family}/{identityId}/{type} | Get a user or group involvement with a task
*TasksApi* | [**getIdentityLinksForFamilyUsingGET2**](docs/TasksApi.md#getIdentityLinksForFamilyUsingGET2) | **GET** /enterprise/tasks/{taskId}/identitylinks/{family} | List either the users or groups involved with a process instance
*TasksApi* | [**getIdentityLinksUsingGET2**](docs/TasksApi.md#getIdentityLinksUsingGET2) | **GET** /enterprise/tasks/{taskId}/identitylinks | getIdentityLinks
*TasksApi* | [**getTaskAuditLogUsingGET1**](docs/TasksApi.md#getTaskAuditLogUsingGET1) | **GET** /enterprise/tasks/{taskId}/audit | Get the audit log for a task
*TasksApi* | [**getTaskUsingGET**](docs/TasksApi.md#getTaskUsingGET) | **GET** /enterprise/tasks/{taskId} | Get a task
*TasksApi* | [**listHistoricTasksUsingPOST**](docs/TasksApi.md#listHistoricTasksUsingPOST) | **POST** /enterprise/historic-tasks/query | Query historic tasks
*TasksApi* | [**listTasksUsingPOST**](docs/TasksApi.md#listTasksUsingPOST) | **POST** /enterprise/tasks/query | List tasks
*TasksApi* | [**updateTaskUsingPUT**](docs/TasksApi.md#updateTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId} | Update a task
*UserFiltersApi* | [**createUserProcessInstanceFilterUsingPOST**](docs/UserFiltersApi.md#createUserProcessInstanceFilterUsingPOST) | **POST** /enterprise/filters/processes | Create a process instance filter
*UserFiltersApi* | [**createUserTaskFilterUsingPOST**](docs/UserFiltersApi.md#createUserTaskFilterUsingPOST) | **POST** /enterprise/filters/tasks | Create a task filter
*UserFiltersApi* | [**deleteUserProcessInstanceFilterUsingDELETE**](docs/UserFiltersApi.md#deleteUserProcessInstanceFilterUsingDELETE) | **DELETE** /enterprise/filters/processes/{userFilterId} | Delete a process instance filter
*UserFiltersApi* | [**deleteUserTaskFilterUsingDELETE**](docs/UserFiltersApi.md#deleteUserTaskFilterUsingDELETE) | **DELETE** /enterprise/filters/tasks/{userFilterId} | Delete a task filter
*UserFiltersApi* | [**getUserProcessInstanceFilterUsingGET**](docs/UserFiltersApi.md#getUserProcessInstanceFilterUsingGET) | **GET** /enterprise/filters/processes/{userFilterId} | Get a process instance filter
*UserFiltersApi* | [**getUserProcessInstanceFiltersUsingGET**](docs/UserFiltersApi.md#getUserProcessInstanceFiltersUsingGET) | **GET** /enterprise/filters/processes | List process instance filters
*UserFiltersApi* | [**getUserTaskFilterUsingGET**](docs/UserFiltersApi.md#getUserTaskFilterUsingGET) | **GET** /enterprise/filters/tasks/{userFilterId} | Get a task filter
*UserFiltersApi* | [**getUserTaskFiltersUsingGET**](docs/UserFiltersApi.md#getUserTaskFiltersUsingGET) | **GET** /enterprise/filters/tasks | List task filters
*UserFiltersApi* | [**orderUserProcessInstanceFiltersUsingPUT**](docs/UserFiltersApi.md#orderUserProcessInstanceFiltersUsingPUT) | **PUT** /enterprise/filters/processes | Re-order the list of user process instance filters
*UserFiltersApi* | [**orderUserTaskFiltersUsingPUT**](docs/UserFiltersApi.md#orderUserTaskFiltersUsingPUT) | **PUT** /enterprise/filters/tasks | Re-order the list of user task filters
*UserFiltersApi* | [**updateUserProcessInstanceFilterUsingPUT**](docs/UserFiltersApi.md#updateUserProcessInstanceFilterUsingPUT) | **PUT** /enterprise/filters/processes/{userFilterId} | Update a process instance filter
*UserFiltersApi* | [**updateUserTaskFilterUsingPUT**](docs/UserFiltersApi.md#updateUserTaskFilterUsingPUT) | **PUT** /enterprise/filters/tasks/{userFilterId} | Update a task filter
*UserProfileApi* | [**changePasswordUsingPOST**](docs/UserProfileApi.md#changePasswordUsingPOST) | **POST** /enterprise/profile-password | Change user password
*UserProfileApi* | [**getProfilePictureUsingGET**](docs/UserProfileApi.md#getProfilePictureUsingGET) | **GET** /enterprise/profile-picture | Retrieve user profile picture
*UserProfileApi* | [**getProfileUsingGET**](docs/UserProfileApi.md#getProfileUsingGET) | **GET** /enterprise/profile | Get user profile
*UserProfileApi* | [**updateProfile**](docs/UserProfileApi.md#updateProfile) | **POST** /enterprise/profile | Update user profile
*UserProfileApi* | [**uploadProfilePictureUsingPOST**](docs/UserProfileApi.md#uploadProfilePictureUsingPOST) | **POST** /enterprise/profile-picture | Change user profile picture
*UsersApi* | [**executeActionUsingPOST**](docs/UsersApi.md#executeActionUsingPOST) | **POST** /enterprise/users/{userId} | Execute an action for a specific user
*UsersApi* | [**getProfilePictureUsingGET1**](docs/UsersApi.md#getProfilePictureUsingGET1) | **GET** /enterprise/users/{userId}/picture | Stream user profile picture
*UsersApi* | [**getUserUsingGET1**](docs/UsersApi.md#getUserUsingGET1) | **GET** /enterprise/users/{userId} | Get a user
*UsersApi* | [**getUsersUsingGET1**](docs/UsersApi.md#getUsersUsingGET1) | **GET** /enterprise/users | Query users
*UsersApi* | [**requestPasswordResetUsingPOST**](docs/UsersApi.md#requestPasswordResetUsingPOST) | **POST** /enterprise/idm/passwords | Request a password reset
*UsersApi* | [**updateUserUsingPUT**](docs/UsersApi.md#updateUserUsingPUT) | **PUT** /enterprise/users/{userId} | Update a user


## Documentation for Models

 - [AbstractGroupRepresentation](docs/AbstractGroupRepresentation.md)
 - [AbstractUserRepresentation](docs/AbstractUserRepresentation.md)
 - [AccountRepresentation](docs/AccountRepresentation.md)
 - [AddGroupCapabilitiesRepresentation](docs/AddGroupCapabilitiesRepresentation.md)
 - [AlfrescoContentRepresentation](docs/AlfrescoContentRepresentation.md)
 - [AlfrescoEndpointRepresentation](docs/AlfrescoEndpointRepresentation.md)
 - [AlfrescoSiteRepresenation](docs/AlfrescoSiteRepresenation.md)
 - [AppDefinition](docs/AppDefinition.md)
 - [AppDefinitionPublishRepresentation](docs/AppDefinitionPublishRepresentation.md)
 - [AppDefinitionRepresentation](docs/AppDefinitionRepresentation.md)
 - [AppDefinitionSaveRepresentation](docs/AppDefinitionSaveRepresentation.md)
 - [AppDefinitionUpdateResultRepresentation](docs/AppDefinitionUpdateResultRepresentation.md)
 - [AppDeploymentRepresentation](docs/AppDeploymentRepresentation.md)
 - [AppModelDefinition](docs/AppModelDefinition.md)
 - [AssigneeIdentifierRepresentation](docs/AssigneeIdentifierRepresentation.md)
 - [AuditCalculatedValueRepresentation](docs/AuditCalculatedValueRepresentation.md)
 - [AuditDecisionExpressionInfoRepresentation](docs/AuditDecisionExpressionInfoRepresentation.md)
 - [AuditDecisionInfoRepresentation](docs/AuditDecisionInfoRepresentation.md)
 - [AuditDecisionRuleInfoRepresentation](docs/AuditDecisionRuleInfoRepresentation.md)
 - [AuditLogEntryRepresentation](docs/AuditLogEntryRepresentation.md)
 - [AuditLogFormDataRepresentation](docs/AuditLogFormDataRepresentation.md)
 - [AuthConfigurationRepresentation](docs/AuthConfigurationRepresentation.md)
 - [BoxContent](docs/BoxContent.md)
 - [BoxUserAccountCredentialsRepresentation](docs/BoxUserAccountCredentialsRepresentation.md)
 - [BulkUserUpdateRepresentation](docs/BulkUserUpdateRepresentation.md)
 - [ChangePasswordRepresentation](docs/ChangePasswordRepresentation.md)
 - [ChecklistOrderRepresentation](docs/ChecklistOrderRepresentation.md)
 - [CommentAuditInfo](docs/CommentAuditInfo.md)
 - [CommentRepresentation](docs/CommentRepresentation.md)
 - [CompleteFormRepresentation](docs/CompleteFormRepresentation.md)
 - [ConditionRepresentation](docs/ConditionRepresentation.md)
 - [CreateEndpointBasicAuthRepresentation](docs/CreateEndpointBasicAuthRepresentation.md)
 - [CreateProcessInstanceRepresentation](docs/CreateProcessInstanceRepresentation.md)
 - [CreateTenantRepresentation](docs/CreateTenantRepresentation.md)
 - [DataSourceConfigRepresentation](docs/DataSourceConfigRepresentation.md)
 - [DataSourceRepresentation](docs/DataSourceRepresentation.md)
 - [DecisionAuditRepresentation](docs/DecisionAuditRepresentation.md)
 - [DecisionTableDefinitionRepresentation](docs/DecisionTableDefinitionRepresentation.md)
 - [DecisionTableExpressionRepresentation](docs/DecisionTableExpressionRepresentation.md)
 - [DecisionTableRepresentation](docs/DecisionTableRepresentation.md)
 - [DecisionTableSaveRepresentation](docs/DecisionTableSaveRepresentation.md)
 - [DecisionTaskRepresentation](docs/DecisionTaskRepresentation.md)
 - [EndpointBasicAuthRepresentation](docs/EndpointBasicAuthRepresentation.md)
 - [EndpointConfigurationRepresentation](docs/EndpointConfigurationRepresentation.md)
 - [EndpointRequestHeaderRepresentation](docs/EndpointRequestHeaderRepresentation.md)
 - [EntityAttributeScopeRepresentation](docs/EntityAttributeScopeRepresentation.md)
 - [EntityVariableScopeRepresentation](docs/EntityVariableScopeRepresentation.md)
 - [FieldValueInfo](docs/FieldValueInfo.md)
 - [FormDefinitionRepresentation](docs/FormDefinitionRepresentation.md)
 - [FormFieldRepresentation](docs/FormFieldRepresentation.md)
 - [FormIdentifierRepresentation](docs/FormIdentifierRepresentation.md)
 - [FormJavascriptEventRepresentation](docs/FormJavascriptEventRepresentation.md)
 - [FormOutcomeRepresentation](docs/FormOutcomeRepresentation.md)
 - [FormRepresentation](docs/FormRepresentation.md)
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
 - [IdentityLinkRepresentation](docs/IdentityLinkRepresentation.md)
 - [ImageUploadRepresentation](docs/ImageUploadRepresentation.md)
 - [JsonNode](docs/JsonNode.md)
 - [LayoutRepresentation](docs/LayoutRepresentation.md)
 - [LightAppRepresentation](docs/LightAppRepresentation.md)
 - [LightGroupRepresentation](docs/LightGroupRepresentation.md)
 - [LightTenantRepresentation](docs/LightTenantRepresentation.md)
 - [LightUserRepresentation](docs/LightUserRepresentation.md)
 - [Mapstringobject](docs/Mapstringobject.md)
 - [Mapstringstring](docs/Mapstringstring.md)
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
 - [ResetPasswordRepresentation](docs/ResetPasswordRepresentation.md)
 - [RestVariable](docs/RestVariable.md)
 - [ResultListDataRepresentationAbstractUserRepresentation](docs/ResultListDataRepresentationAbstractUserRepresentation.md)
 - [ResultListDataRepresentationAccountRepresentation](docs/ResultListDataRepresentationAccountRepresentation.md)
 - [ResultListDataRepresentationAlfrescoContentRepresentation](docs/ResultListDataRepresentationAlfrescoContentRepresentation.md)
 - [ResultListDataRepresentationAlfrescoEndpointRepresentation](docs/ResultListDataRepresentationAlfrescoEndpointRepresentation.md)
 - [ResultListDataRepresentationAlfrescoSiteRepresenation](docs/ResultListDataRepresentationAlfrescoSiteRepresenation.md)
 - [ResultListDataRepresentationAppDefinitionRepresentation](docs/ResultListDataRepresentationAppDefinitionRepresentation.md)
 - [ResultListDataRepresentationAppDeploymentRepresentation](docs/ResultListDataRepresentationAppDeploymentRepresentation.md)
 - [ResultListDataRepresentationBoxContent](docs/ResultListDataRepresentationBoxContent.md)
 - [ResultListDataRepresentationCommentRepresentation](docs/ResultListDataRepresentationCommentRepresentation.md)
 - [ResultListDataRepresentationDataSourceRepresentation](docs/ResultListDataRepresentationDataSourceRepresentation.md)
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



