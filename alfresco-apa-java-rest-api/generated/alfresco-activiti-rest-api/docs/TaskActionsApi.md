# TaskActionsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignTaskUsingPUT**](TaskActionsApi.md#assignTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/assign | Assign a task to a user
[**attachFormUsingPUT**](TaskActionsApi.md#attachFormUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/attach-form | Attach a form to a task
[**claimTaskUsingPUT**](TaskActionsApi.md#claimTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/claim | Claim a task
[**completeTaskUsingPUT**](TaskActionsApi.md#completeTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/complete | Complete a task
[**delegateTaskUsingPUT**](TaskActionsApi.md#delegateTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/delegate | Delegate a task
[**involveGroupUsingPOST**](TaskActionsApi.md#involveGroupUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/groups/{groupId} | Involve a group with a task
[**involveUserUsingPUT**](TaskActionsApi.md#involveUserUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/involve | Involve a user with a task
[**removeFormUsingDELETE**](TaskActionsApi.md#removeFormUsingDELETE) | **DELETE** /activiti-app/api/enterprise/tasks/{taskId}/action/remove-form | Remove a form from a task
[**removeInvolvedUserUsingDELETE**](TaskActionsApi.md#removeInvolvedUserUsingDELETE) | **DELETE** /activiti-app/api/enterprise/tasks/{taskId}/groups/{groupId} | Remove an involved group from a task
[**removeInvolvedUserUsingPUT**](TaskActionsApi.md#removeInvolvedUserUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/remove-involved | Remove an involved user from a task
[**resolveTaskUsingPUT**](TaskActionsApi.md#resolveTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/resolve | Resolve a task
[**unclaimTaskUsingPUT**](TaskActionsApi.md#unclaimTaskUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/action/unclaim | Unclaim a task

<a name="assignTaskUsingPUT"></a>
# **assignTaskUsingPUT**
> TaskRepresentation assignTaskUsingPUT(taskId, body)

Assign a task to a user

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskActionsApi;







TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
AssigneeIdentifierRepresentation body = new AssigneeIdentifierRepresentation(); // AssigneeIdentifierRepresentation | 
try {
    TaskRepresentation result = apiInstance.assignTaskUsingPUT(taskId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#assignTaskUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**AssigneeIdentifierRepresentation**](AssigneeIdentifierRepresentation.md)|  | [optional]

### Return type

[**TaskRepresentation**](TaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachFormUsingPUT"></a>
# **attachFormUsingPUT**
> attachFormUsingPUT(taskId, body)

Attach a form to a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskActionsApi;







TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
FormIdentifierRepresentation body = new FormIdentifierRepresentation(); // FormIdentifierRepresentation | 
try {
    apiInstance.attachFormUsingPUT(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#attachFormUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**FormIdentifierRepresentation**](FormIdentifierRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="claimTaskUsingPUT"></a>
# **claimTaskUsingPUT**
> claimTaskUsingPUT(taskId)

Claim a task

To claim a task (in case the task is assigned to a group)

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskActionsApi;







TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.claimTaskUsingPUT(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#claimTaskUsingPUT");
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

<a name="completeTaskUsingPUT"></a>
# **completeTaskUsingPUT**
> completeTaskUsingPUT(taskId)

Complete a task

Use this endpoint to complete a standalone task or task without a form

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskActionsApi;







TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.completeTaskUsingPUT(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#completeTaskUsingPUT");
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

<a name="delegateTaskUsingPUT"></a>
# **delegateTaskUsingPUT**
> delegateTaskUsingPUT(taskId, body)

Delegate a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskActionsApi;







TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
UserIdentifierRepresentation body = new UserIdentifierRepresentation(); // UserIdentifierRepresentation | 
try {
    apiInstance.delegateTaskUsingPUT(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#delegateTaskUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**UserIdentifierRepresentation**](UserIdentifierRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="involveGroupUsingPOST"></a>
# **involveGroupUsingPOST**
> involveGroupUsingPOST(taskId, groupId)

Involve a group with a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskActionsApi;







TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
String groupId = "groupId_example"; // String | groupId
try {
    apiInstance.involveGroupUsingPOST(taskId, groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#involveGroupUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **groupId** | **String**| groupId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="involveUserUsingPUT"></a>
# **involveUserUsingPUT**
> involveUserUsingPUT(taskId, body)

Involve a user with a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskActionsApi;







TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
UserIdentifierRepresentation body = new UserIdentifierRepresentation(); // UserIdentifierRepresentation | 
try {
    apiInstance.involveUserUsingPUT(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#involveUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**UserIdentifierRepresentation**](UserIdentifierRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="removeFormUsingDELETE"></a>
# **removeFormUsingDELETE**
> removeFormUsingDELETE(taskId)

Remove a form from a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskActionsApi;







TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.removeFormUsingDELETE(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#removeFormUsingDELETE");
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

<a name="removeInvolvedUserUsingDELETE"></a>
# **removeInvolvedUserUsingDELETE**
> removeInvolvedUserUsingDELETE(taskId, groupId)

Remove an involved group from a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskActionsApi;







TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
String groupId = "groupId_example"; // String | groupId
try {
    apiInstance.removeInvolvedUserUsingDELETE(taskId, groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#removeInvolvedUserUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **groupId** | **String**| groupId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeInvolvedUserUsingPUT"></a>
# **removeInvolvedUserUsingPUT**
> removeInvolvedUserUsingPUT(taskId, body)

Remove an involved user from a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskActionsApi;







TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
UserIdentifierRepresentation body = new UserIdentifierRepresentation(); // UserIdentifierRepresentation | 
try {
    apiInstance.removeInvolvedUserUsingPUT(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#removeInvolvedUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**UserIdentifierRepresentation**](UserIdentifierRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="resolveTaskUsingPUT"></a>
# **resolveTaskUsingPUT**
> resolveTaskUsingPUT(taskId)

Resolve a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskActionsApi;







TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.resolveTaskUsingPUT(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#resolveTaskUsingPUT");
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

<a name="unclaimTaskUsingPUT"></a>
# **unclaimTaskUsingPUT**
> unclaimTaskUsingPUT(taskId)

Unclaim a task

To unclaim a task (in case the task was assigned to a group)

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskActionsApi;







TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.unclaimTaskUsingPUT(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#unclaimTaskUsingPUT");
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

