# TasksApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIdentityLinkUsingPOST2**](TasksApi.md#createIdentityLinkUsingPOST2) | **POST** /enterprise/tasks/{taskId}/identitylinks | List the users and groups involved with a task
[**createNewTaskUsingPOST**](TasksApi.md#createNewTaskUsingPOST) | **POST** /enterprise/tasks | Create a standalone task
[**deleteIdentityLinkUsingDELETE2**](TasksApi.md#deleteIdentityLinkUsingDELETE2) | **DELETE** /enterprise/tasks/{taskId}/identitylinks/{family}/{identityId}/{type} | Remove a user or group involvement from a task
[**deleteTaskUsingDELETE**](TasksApi.md#deleteTaskUsingDELETE) | **DELETE** /enterprise/tasks/{taskId} | Delete a task
[**filterTasksUsingPOST**](TasksApi.md#filterTasksUsingPOST) | **POST** /enterprise/tasks/filter | Filter a list of tasks
[**getIdentityLinkTypeUsingGET2**](TasksApi.md#getIdentityLinkTypeUsingGET2) | **GET** /enterprise/tasks/{taskId}/identitylinks/{family}/{identityId}/{type} | Get a user or group involvement with a task
[**getIdentityLinksForFamilyUsingGET2**](TasksApi.md#getIdentityLinksForFamilyUsingGET2) | **GET** /enterprise/tasks/{taskId}/identitylinks/{family} | List either the users or groups involved with a process instance
[**getIdentityLinksUsingGET2**](TasksApi.md#getIdentityLinksUsingGET2) | **GET** /enterprise/tasks/{taskId}/identitylinks | getIdentityLinks
[**getTaskAuditLogUsingGET1**](TasksApi.md#getTaskAuditLogUsingGET1) | **GET** /enterprise/tasks/{taskId}/audit | Get the audit log for a task
[**getTaskUsingGET**](TasksApi.md#getTaskUsingGET) | **GET** /enterprise/tasks/{taskId} | Get a task
[**listHistoricTasksUsingPOST**](TasksApi.md#listHistoricTasksUsingPOST) | **POST** /enterprise/historic-tasks/query | Query historic tasks
[**listTasksUsingPOST**](TasksApi.md#listTasksUsingPOST) | **POST** /enterprise/tasks/query | List tasks
[**updateTaskUsingPUT**](TasksApi.md#updateTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId} | Update a task


<a name="createIdentityLinkUsingPOST2"></a>
# **createIdentityLinkUsingPOST2**
> IdentityLinkRepresentation createIdentityLinkUsingPOST2(taskId, identityLinkRepresentation)

List the users and groups involved with a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | taskId
IdentityLinkRepresentation identityLinkRepresentation = new IdentityLinkRepresentation(); // IdentityLinkRepresentation | identityLinkRepresentation
try {
    IdentityLinkRepresentation result = apiInstance.createIdentityLinkUsingPOST2(taskId, identityLinkRepresentation);
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
 **identityLinkRepresentation** | [**IdentityLinkRepresentation**](IdentityLinkRepresentation.md)| identityLinkRepresentation |

### Return type

[**IdentityLinkRepresentation**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNewTaskUsingPOST"></a>
# **createNewTaskUsingPOST**
> TaskRepresentation createNewTaskUsingPOST(taskRepresentation)

Create a standalone task

A standalone task is one which is not associated with any process instance.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








TasksApi apiInstance = new TasksApi();
TaskRepresentation taskRepresentation = new TaskRepresentation(); // TaskRepresentation | taskRepresentation
try {
    TaskRepresentation result = apiInstance.createNewTaskUsingPOST(taskRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#createNewTaskUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskRepresentation** | [**TaskRepresentation**](TaskRepresentation.md)| taskRepresentation |

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
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTaskUsingDELETE"></a>
# **deleteTaskUsingDELETE**
> deleteTaskUsingDELETE(taskId)

Delete a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filterTasksUsingPOST"></a>
# **filterTasksUsingPOST**
> ResultListDataRepresentationTaskRepresentation filterTasksUsingPOST(tasksFilter)

Filter a list of tasks

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








TasksApi apiInstance = new TasksApi();
TaskFilterRequestRepresentation tasksFilter = new TaskFilterRequestRepresentation(); // TaskFilterRequestRepresentation | tasksFilter
try {
    ResultListDataRepresentationTaskRepresentation result = apiInstance.filterTasksUsingPOST(tasksFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#filterTasksUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tasksFilter** | [**TaskFilterRequestRepresentation**](TaskFilterRequestRepresentation.md)| tasksFilter |

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
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdentityLinksForFamilyUsingGET2"></a>
# **getIdentityLinksForFamilyUsingGET2**
> List&lt;IdentityLinkRepresentation&gt; getIdentityLinksForFamilyUsingGET2(taskId, family)

List either the users or groups involved with a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdentityLinksUsingGET2"></a>
# **getIdentityLinksUsingGET2**
> List&lt;IdentityLinkRepresentation&gt; getIdentityLinksUsingGET2(taskId)

getIdentityLinks

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskAuditLogUsingGET1"></a>
# **getTaskAuditLogUsingGET1**
> TaskAuditInfoRepresentation getTaskAuditLogUsingGET1(taskId)

Get the audit log for a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskUsingGET"></a>
# **getTaskUsingGET**
> TaskRepresentation getTaskUsingGET(taskId)

Get a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listHistoricTasksUsingPOST"></a>
# **listHistoricTasksUsingPOST**
> ResultListDataRepresentationTaskRepresentation listHistoricTasksUsingPOST(queryRequest)

Query historic tasks

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








TasksApi apiInstance = new TasksApi();
HistoricTaskInstanceQueryRepresentation queryRequest = new HistoricTaskInstanceQueryRepresentation(); // HistoricTaskInstanceQueryRepresentation | queryRequest
try {
    ResultListDataRepresentationTaskRepresentation result = apiInstance.listHistoricTasksUsingPOST(queryRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#listHistoricTasksUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | [**HistoricTaskInstanceQueryRepresentation**](HistoricTaskInstanceQueryRepresentation.md)| queryRequest |

### Return type

[**ResultListDataRepresentationTaskRepresentation**](ResultListDataRepresentationTaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTasksUsingPOST"></a>
# **listTasksUsingPOST**
> ResultListDataRepresentationTaskRepresentation listTasksUsingPOST(tasksQuery)

List tasks

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








TasksApi apiInstance = new TasksApi();
TaskQueryRepresentation tasksQuery = new TaskQueryRepresentation(); // TaskQueryRepresentation | tasksQuery
try {
    ResultListDataRepresentationTaskRepresentation result = apiInstance.listTasksUsingPOST(tasksQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#listTasksUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tasksQuery** | [**TaskQueryRepresentation**](TaskQueryRepresentation.md)| tasksQuery |

### Return type

[**ResultListDataRepresentationTaskRepresentation**](ResultListDataRepresentationTaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaskUsingPUT"></a>
# **updateTaskUsingPUT**
> TaskRepresentation updateTaskUsingPUT(taskId, updated)

Update a task

You can edit only name, description and dueDate (ISO 8601 string).

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TasksApi;








TasksApi apiInstance = new TasksApi();
String taskId = "taskId_example"; // String | taskId
TaskUpdateRepresentation updated = new TaskUpdateRepresentation(); // TaskUpdateRepresentation | updated
try {
    TaskRepresentation result = apiInstance.updateTaskUsingPUT(taskId, updated);
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
 **updated** | [**TaskUpdateRepresentation**](TaskUpdateRepresentation.md)| updated |

### Return type

[**TaskRepresentation**](TaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

