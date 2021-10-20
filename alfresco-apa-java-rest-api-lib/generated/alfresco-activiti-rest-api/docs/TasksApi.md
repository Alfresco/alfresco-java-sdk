# TasksApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIdentityLinkUsingPOST2**](TasksApi.md#createIdentityLinkUsingPOST2) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/identitylinks | List the users and groups involved with a task
[**createNewTaskUsingPOST**](TasksApi.md#createNewTaskUsingPOST) | **POST** /activiti-app/api/enterprise/tasks | Create a standalone task
[**deleteIdentityLinkUsingDELETE2**](TasksApi.md#deleteIdentityLinkUsingDELETE2) | **DELETE** /activiti-app/api/enterprise/tasks/{taskId}/identitylinks/{family}/{identityId}/{type} | Remove a user or group involvement from a task
[**deleteTaskUsingDELETE**](TasksApi.md#deleteTaskUsingDELETE) | **DELETE** /activiti-app/api/enterprise/tasks/{taskId} | Delete a task
[**filterTasksUsingPOST**](TasksApi.md#filterTasksUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/filter | Filter a list of tasks
[**getIdentityLinkTypeUsingGET2**](TasksApi.md#getIdentityLinkTypeUsingGET2) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/identitylinks/{family}/{identityId}/{type} | Get a user or group involvement with a task
[**getIdentityLinksForFamilyUsingGET2**](TasksApi.md#getIdentityLinksForFamilyUsingGET2) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/identitylinks/{family} | List either the users or groups involved with a process instance
[**getIdentityLinksUsingGET2**](TasksApi.md#getIdentityLinksUsingGET2) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/identitylinks | getIdentityLinks
[**getTaskAuditLogUsingGET1**](TasksApi.md#getTaskAuditLogUsingGET1) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/audit | Get the audit log for a task
[**getTaskUsingGET**](TasksApi.md#getTaskUsingGET) | **GET** /activiti-app/api/enterprise/tasks/{taskId} | Get a task
[**listHistoricTasksUsingPOST**](TasksApi.md#listHistoricTasksUsingPOST) | **POST** /activiti-app/api/enterprise/historic-tasks/query | Query historic tasks
[**listTasksUsingPOST**](TasksApi.md#listTasksUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/query | List tasks
[**updateTaskUsingPUT**](TasksApi.md#updateTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId} | Update a task

<a name="createIdentityLinkUsingPOST2"></a>
# **createIdentityLinkUsingPOST2**
> IdentityLinkRepresentation createIdentityLinkUsingPOST2(taskId, body)

List the users and groups involved with a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | taskId
IdentityLinkRepresentation body = new IdentityLinkRepresentation(); // IdentityLinkRepresentation | 
try {
    IdentityLinkRepresentation result = apiInstance.createIdentityLinkUsingPOST2(taskId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#createIdentityLinkUsingPOST2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**IdentityLinkRepresentation**](IdentityLinkRepresentation.md)|  | [optional]

### Return type

[**IdentityLinkRepresentation**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNewTaskUsingPOST"></a>
# **createNewTaskUsingPOST**
> TaskRepresentation createNewTaskUsingPOST(body)

Create a standalone task

A standalone task is one which is not associated with any process instance.

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
TaskRepresentation body = new TaskRepresentation(); // TaskRepresentation | 
try {
    TaskRepresentation result = apiInstance.createNewTaskUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#createNewTaskUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TaskRepresentation**](TaskRepresentation.md)|  | [optional]

### Return type

[**TaskRepresentation**](TaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIdentityLinkUsingDELETE2"></a>
# **deleteIdentityLinkUsingDELETE2**
> deleteIdentityLinkUsingDELETE2(taskId, family, identityId, type)

Remove a user or group involvement from a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | taskId
String family = "family_example"; // String | family
String identityId = "identityId_example"; // String | identityId
String type = "type_example"; // String | type
try {
    apiInstance.deleteIdentityLinkUsingDELETE2(taskId, family, identityId, type);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#deleteIdentityLinkUsingDELETE2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **family** | **String**| family |
 **identityId** | **String**| identityId |
 **type** | **String**| type |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTaskUsingDELETE"></a>
# **deleteTaskUsingDELETE**
> deleteTaskUsingDELETE(taskId)

Delete a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.deleteTaskUsingDELETE(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#deleteTaskUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="filterTasksUsingPOST"></a>
# **filterTasksUsingPOST**
> ResultListDataRepresentationTaskRepresentation filterTasksUsingPOST(body)

Filter a list of tasks

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
TaskFilterRequestRepresentation body = new TaskFilterRequestRepresentation(); // TaskFilterRequestRepresentation | 
try {
    ResultListDataRepresentationTaskRepresentation result = apiInstance.filterTasksUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#filterTasksUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TaskFilterRequestRepresentation**](TaskFilterRequestRepresentation.md)|  | [optional]

### Return type

[**ResultListDataRepresentationTaskRepresentation**](ResultListDataRepresentationTaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdentityLinkTypeUsingGET2"></a>
# **getIdentityLinkTypeUsingGET2**
> IdentityLinkRepresentation getIdentityLinkTypeUsingGET2(taskId, family, identityId, type)

Get a user or group involvement with a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | taskId
String family = "family_example"; // String | family
String identityId = "identityId_example"; // String | identityId
String type = "type_example"; // String | type
try {
    IdentityLinkRepresentation result = apiInstance.getIdentityLinkTypeUsingGET2(taskId, family, identityId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getIdentityLinkTypeUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **family** | **String**| family |
 **identityId** | **String**| identityId |
 **type** | **String**| type |

### Return type

[**IdentityLinkRepresentation**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIdentityLinksForFamilyUsingGET2"></a>
# **getIdentityLinksForFamilyUsingGET2**
> List&lt;IdentityLinkRepresentation&gt; getIdentityLinksForFamilyUsingGET2(taskId, family)

List either the users or groups involved with a process instance

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | taskId
String family = "family_example"; // String | family
try {
    List<IdentityLinkRepresentation> result = apiInstance.getIdentityLinksForFamilyUsingGET2(taskId, family);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getIdentityLinksForFamilyUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **family** | **String**| family |

### Return type

[**List&lt;IdentityLinkRepresentation&gt;**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIdentityLinksUsingGET2"></a>
# **getIdentityLinksUsingGET2**
> List&lt;IdentityLinkRepresentation&gt; getIdentityLinksUsingGET2(taskId)

getIdentityLinks

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | taskId
try {
    List<IdentityLinkRepresentation> result = apiInstance.getIdentityLinksUsingGET2(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getIdentityLinksUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**List&lt;IdentityLinkRepresentation&gt;**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskAuditLogUsingGET1"></a>
# **getTaskAuditLogUsingGET1**
> TaskAuditInfoRepresentation getTaskAuditLogUsingGET1(taskId)

Get the audit log for a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | taskId
try {
    TaskAuditInfoRepresentation result = apiInstance.getTaskAuditLogUsingGET1(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getTaskAuditLogUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**TaskAuditInfoRepresentation**](TaskAuditInfoRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskUsingGET"></a>
# **getTaskUsingGET**
> TaskRepresentation getTaskUsingGET(taskId)

Get a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | taskId
try {
    TaskRepresentation result = apiInstance.getTaskUsingGET(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getTaskUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**TaskRepresentation**](TaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listHistoricTasksUsingPOST"></a>
# **listHistoricTasksUsingPOST**
> ResultListDataRepresentationTaskRepresentation listHistoricTasksUsingPOST(body)

Query historic tasks

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
HistoricTaskInstanceQueryRepresentation body = new HistoricTaskInstanceQueryRepresentation(); // HistoricTaskInstanceQueryRepresentation | 
try {
    ResultListDataRepresentationTaskRepresentation result = apiInstance.listHistoricTasksUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#listHistoricTasksUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HistoricTaskInstanceQueryRepresentation**](HistoricTaskInstanceQueryRepresentation.md)|  | [optional]

### Return type

[**ResultListDataRepresentationTaskRepresentation**](ResultListDataRepresentationTaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTasksUsingPOST"></a>
# **listTasksUsingPOST**
> ResultListDataRepresentationTaskRepresentation listTasksUsingPOST(body)

List tasks

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
TaskQueryRepresentation body = new TaskQueryRepresentation(); // TaskQueryRepresentation | 
try {
    ResultListDataRepresentationTaskRepresentation result = apiInstance.listTasksUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#listTasksUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TaskQueryRepresentation**](TaskQueryRepresentation.md)|  | [optional]

### Return type

[**ResultListDataRepresentationTaskRepresentation**](ResultListDataRepresentationTaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaskUsingPUT"></a>
# **updateTaskUsingPUT**
> TaskRepresentation updateTaskUsingPUT(taskId, body)

Update a task

You can edit only name, description and dueDate (ISO 8601 string).

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TasksApi;







TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | taskId
TaskUpdateRepresentation body = new TaskUpdateRepresentation(); // TaskUpdateRepresentation | 
try {
    TaskRepresentation result = apiInstance.updateTaskUsingPUT(taskId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#updateTaskUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**TaskUpdateRepresentation**](TaskUpdateRepresentation.md)|  | [optional]

### Return type

[**TaskRepresentation**](TaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

