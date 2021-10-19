# TaskAdminControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignUsingPOST**](TaskAdminControllerImplApi.md#assignUsingPOST) | **POST** /admin/v1/tasks/{taskId}/assign | assign
[**completeTaskUsingPOST**](TaskAdminControllerImplApi.md#completeTaskUsingPOST) | **POST** /admin/v1/tasks/{taskId}/complete | completeTask
[**deleteTaskUsingDELETE**](TaskAdminControllerImplApi.md#deleteTaskUsingDELETE) | **DELETE** /admin/v1/tasks/{taskId} | deleteTask
[**getTaskByIdUsingGET**](TaskAdminControllerImplApi.md#getTaskByIdUsingGET) | **GET** /admin/v1/tasks/{taskId} | getTaskById
[**getTasksUsingGET1**](TaskAdminControllerImplApi.md#getTasksUsingGET1) | **GET** /admin/v1/tasks | getTasks
[**updateTaskUsingPUT**](TaskAdminControllerImplApi.md#updateTaskUsingPUT) | **PUT** /admin/v1/tasks/{taskId} | updateTask


<a name="assignUsingPOST"></a>
# **assignUsingPOST**
> EntryResponseContentCloudTask assignUsingPOST(assignTaskPayload, taskId)

assign

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.TaskAdminControllerImplApi;


TaskAdminControllerImplApi apiInstance = new TaskAdminControllerImplApi();
AssignTaskPayload assignTaskPayload = new AssignTaskPayload(); // AssignTaskPayload | assignTaskPayload
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentCloudTask result = apiInstance.assignUsingPOST(assignTaskPayload, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAdminControllerImplApi#assignUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignTaskPayload** | [**AssignTaskPayload**](AssignTaskPayload.md)| assignTaskPayload |
 **taskId** | **String**| taskId |

### Return type

[**EntryResponseContentCloudTask**](EntryResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="completeTaskUsingPOST"></a>
# **completeTaskUsingPOST**
> EntryResponseContentCloudTask completeTaskUsingPOST(taskId, completeTaskPayload)

completeTask

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.TaskAdminControllerImplApi;


TaskAdminControllerImplApi apiInstance = new TaskAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CompleteTaskPayload completeTaskPayload = new CompleteTaskPayload(); // CompleteTaskPayload | completeTaskPayload
try {
    EntryResponseContentCloudTask result = apiInstance.completeTaskUsingPOST(taskId, completeTaskPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAdminControllerImplApi#completeTaskUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **completeTaskPayload** | [**CompleteTaskPayload**](CompleteTaskPayload.md)| completeTaskPayload | [optional]

### Return type

[**EntryResponseContentCloudTask**](EntryResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="deleteTaskUsingDELETE"></a>
# **deleteTaskUsingDELETE**
> EntryResponseContentCloudTask deleteTaskUsingDELETE(taskId)

deleteTask

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.TaskAdminControllerImplApi;


TaskAdminControllerImplApi apiInstance = new TaskAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentCloudTask result = apiInstance.deleteTaskUsingDELETE(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAdminControllerImplApi#deleteTaskUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**EntryResponseContentCloudTask**](EntryResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="getTaskByIdUsingGET"></a>
# **getTaskByIdUsingGET**
> EntryResponseContentCloudTask getTaskByIdUsingGET(taskId)

getTaskById

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.TaskAdminControllerImplApi;


TaskAdminControllerImplApi apiInstance = new TaskAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentCloudTask result = apiInstance.getTaskByIdUsingGET(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAdminControllerImplApi#getTaskByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**EntryResponseContentCloudTask**](EntryResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="getTasksUsingGET1"></a>
# **getTasksUsingGET1**
> ListResponseContentCloudTask getTasksUsingGET1(maxItems, skipCount, sort)

getTasks

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.TaskAdminControllerImplApi;


TaskAdminControllerImplApi apiInstance = new TaskAdminControllerImplApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentCloudTask result = apiInstance.getTasksUsingGET1(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAdminControllerImplApi#getTasksUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**ListResponseContentCloudTask**](ListResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="updateTaskUsingPUT"></a>
# **updateTaskUsingPUT**
> EntryResponseContentCloudTask updateTaskUsingPUT(taskId, updateTaskPayload)

updateTask

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.TaskAdminControllerImplApi;


TaskAdminControllerImplApi apiInstance = new TaskAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
UpdateTaskPayload updateTaskPayload = new UpdateTaskPayload(); // UpdateTaskPayload | updateTaskPayload
try {
    EntryResponseContentCloudTask result = apiInstance.updateTaskUsingPUT(taskId, updateTaskPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAdminControllerImplApi#updateTaskUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **updateTaskPayload** | [**UpdateTaskPayload**](UpdateTaskPayload.md)| updateTaskPayload |

### Return type

[**EntryResponseContentCloudTask**](EntryResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

