# TaskActionsApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignTaskUsingPUT**](TaskActionsApi.md#assignTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/assign | Assign a task to a user
[**attachFormUsingPUT**](TaskActionsApi.md#attachFormUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/attach-form | Attach a form to a task
[**claimTaskUsingPUT**](TaskActionsApi.md#claimTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/claim | Claim a task
[**completeTaskUsingPUT**](TaskActionsApi.md#completeTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/complete | Complete a task
[**delegateTaskUsingPUT**](TaskActionsApi.md#delegateTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/delegate | Delegate a task
[**involveGroupUsingPOST**](TaskActionsApi.md#involveGroupUsingPOST) | **POST** /enterprise/tasks/{taskId}/groups/{groupId} | Involve a group with a task
[**involveUserUsingPUT**](TaskActionsApi.md#involveUserUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/involve | Involve a user with a task
[**removeFormUsingDELETE**](TaskActionsApi.md#removeFormUsingDELETE) | **DELETE** /enterprise/tasks/{taskId}/action/remove-form | Remove a form from a task
[**removeInvolvedUserUsingDELETE**](TaskActionsApi.md#removeInvolvedUserUsingDELETE) | **DELETE** /enterprise/tasks/{taskId}/groups/{groupId} | Remove an involved group from a task
[**removeInvolvedUserUsingPUT**](TaskActionsApi.md#removeInvolvedUserUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/remove-involved | Remove an involved user from a task
[**resolveTaskUsingPUT**](TaskActionsApi.md#resolveTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/resolve | Resolve a task
[**unclaimTaskUsingPUT**](TaskActionsApi.md#unclaimTaskUsingPUT) | **PUT** /enterprise/tasks/{taskId}/action/unclaim | Unclaim a task


<a name="assignTaskUsingPUT"></a>
# **assignTaskUsingPUT**
> TaskRepresentation assignTaskUsingPUT(taskId, userIdentifier)

Assign a task to a user

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TaskActionsApi;








TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
AssigneeIdentifierRepresentation userIdentifier = new AssigneeIdentifierRepresentation(); // AssigneeIdentifierRepresentation | userIdentifier
try {
    TaskRepresentation result = apiInstance.assignTaskUsingPUT(taskId, userIdentifier);
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
 **userIdentifier** | [**AssigneeIdentifierRepresentation**](AssigneeIdentifierRepresentation.md)| userIdentifier |

### Return type

[**TaskRepresentation**](TaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachFormUsingPUT"></a>
# **attachFormUsingPUT**
> attachFormUsingPUT(taskId, formIdentifier)

Attach a form to a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TaskActionsApi;








TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
FormIdentifierRepresentation formIdentifier = new FormIdentifierRepresentation(); // FormIdentifierRepresentation | formIdentifier
try {
    apiInstance.attachFormUsingPUT(taskId, formIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#attachFormUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **formIdentifier** | [**FormIdentifierRepresentation**](FormIdentifierRepresentation.md)| formIdentifier |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="claimTaskUsingPUT"></a>
# **claimTaskUsingPUT**
> claimTaskUsingPUT(taskId)

Claim a task

To claim a task (in case the task is assigned to a group)

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TaskActionsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="completeTaskUsingPUT"></a>
# **completeTaskUsingPUT**
> completeTaskUsingPUT(taskId)

Complete a task

Use this endpoint to complete a standalone task or task without a form

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TaskActionsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delegateTaskUsingPUT"></a>
# **delegateTaskUsingPUT**
> delegateTaskUsingPUT(taskId, userIdentifier)

Delegate a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TaskActionsApi;








TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
UserIdentifierRepresentation userIdentifier = new UserIdentifierRepresentation(); // UserIdentifierRepresentation | userIdentifier
try {
    apiInstance.delegateTaskUsingPUT(taskId, userIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#delegateTaskUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **userIdentifier** | [**UserIdentifierRepresentation**](UserIdentifierRepresentation.md)| userIdentifier |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="involveGroupUsingPOST"></a>
# **involveGroupUsingPOST**
> involveGroupUsingPOST(taskId, groupId)

Involve a group with a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TaskActionsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="involveUserUsingPUT"></a>
# **involveUserUsingPUT**
> involveUserUsingPUT(taskId, userIdentifier)

Involve a user with a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TaskActionsApi;








TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
UserIdentifierRepresentation userIdentifier = new UserIdentifierRepresentation(); // UserIdentifierRepresentation | userIdentifier
try {
    apiInstance.involveUserUsingPUT(taskId, userIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#involveUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **userIdentifier** | [**UserIdentifierRepresentation**](UserIdentifierRepresentation.md)| userIdentifier |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeFormUsingDELETE"></a>
# **removeFormUsingDELETE**
> removeFormUsingDELETE(taskId)

Remove a form from a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TaskActionsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeInvolvedUserUsingDELETE"></a>
# **removeInvolvedUserUsingDELETE**
> removeInvolvedUserUsingDELETE(taskId, groupId)

Remove an involved group from a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TaskActionsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeInvolvedUserUsingPUT"></a>
# **removeInvolvedUserUsingPUT**
> removeInvolvedUserUsingPUT(taskId, userIdentifier)

Remove an involved user from a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TaskActionsApi;








TaskActionsApi apiInstance = new TaskActionsApi();
String taskId = "taskId_example"; // String | taskId
UserIdentifierRepresentation userIdentifier = new UserIdentifierRepresentation(); // UserIdentifierRepresentation | userIdentifier
try {
    apiInstance.removeInvolvedUserUsingPUT(taskId, userIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskActionsApi#removeInvolvedUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **userIdentifier** | [**UserIdentifierRepresentation**](UserIdentifierRepresentation.md)| userIdentifier |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resolveTaskUsingPUT"></a>
# **resolveTaskUsingPUT**
> resolveTaskUsingPUT(taskId)

Resolve a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TaskActionsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unclaimTaskUsingPUT"></a>
# **unclaimTaskUsingPUT**
> unclaimTaskUsingPUT(taskId)

Unclaim a task

To unclaim a task (in case the task was assigned to a group)

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.TaskActionsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

