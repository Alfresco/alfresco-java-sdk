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
> EntryResponseContentOfCloudTask assignUsingPOST(taskId, body)

assign

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.TaskAdminControllerImplApi;


TaskAdminControllerImplApi apiInstance = new TaskAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
AssignTaskPayload body = new AssignTaskPayload(); // AssignTaskPayload | 
try {
    EntryResponseContentOfCloudTask result = apiInstance.assignUsingPOST(taskId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAdminControllerImplApi#assignUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**AssignTaskPayload**](AssignTaskPayload.md)|  | [optional]

### Return type

[**EntryResponseContentOfCloudTask**](EntryResponseContentOfCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

<a name="completeTaskUsingPOST"></a>
# **completeTaskUsingPOST**
> EntryResponseContentOfCloudTask completeTaskUsingPOST(taskId, body)

completeTask

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.TaskAdminControllerImplApi;


TaskAdminControllerImplApi apiInstance = new TaskAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CompleteTaskPayload body = new CompleteTaskPayload(); // CompleteTaskPayload | 
try {
    EntryResponseContentOfCloudTask result = apiInstance.completeTaskUsingPOST(taskId, body);
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
 **body** | [**CompleteTaskPayload**](CompleteTaskPayload.md)|  | [optional]

### Return type

[**EntryResponseContentOfCloudTask**](EntryResponseContentOfCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

<a name="deleteTaskUsingDELETE"></a>
# **deleteTaskUsingDELETE**
> EntryResponseContentOfCloudTask deleteTaskUsingDELETE(taskId)

deleteTask

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.TaskAdminControllerImplApi;


TaskAdminControllerImplApi apiInstance = new TaskAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentOfCloudTask result = apiInstance.deleteTaskUsingDELETE(taskId);
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

[**EntryResponseContentOfCloudTask**](EntryResponseContentOfCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getTaskByIdUsingGET"></a>
# **getTaskByIdUsingGET**
> EntryResponseContentOfCloudTask getTaskByIdUsingGET(taskId)

getTaskById

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.TaskAdminControllerImplApi;


TaskAdminControllerImplApi apiInstance = new TaskAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentOfCloudTask result = apiInstance.getTaskByIdUsingGET(taskId);
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

[**EntryResponseContentOfCloudTask**](EntryResponseContentOfCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getTasksUsingGET1"></a>
# **getTasksUsingGET1**
> ListResponseContentOfCloudTask getTasksUsingGET1(maxItems, skipCount, sort)

getTasks

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.TaskAdminControllerImplApi;


TaskAdminControllerImplApi apiInstance = new TaskAdminControllerImplApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudTask result = apiInstance.getTasksUsingGET1(maxItems, skipCount, sort);
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

[**ListResponseContentOfCloudTask**](ListResponseContentOfCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="updateTaskUsingPUT"></a>
# **updateTaskUsingPUT**
> EntryResponseContentOfCloudTask updateTaskUsingPUT(taskId, body)

updateTask

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.TaskAdminControllerImplApi;


TaskAdminControllerImplApi apiInstance = new TaskAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
UpdateTaskPayload body = new UpdateTaskPayload(); // UpdateTaskPayload | 
try {
    EntryResponseContentOfCloudTask result = apiInstance.updateTaskUsingPUT(taskId, body);
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
 **body** | [**UpdateTaskPayload**](UpdateTaskPayload.md)|  | [optional]

### Return type

[**EntryResponseContentOfCloudTask**](EntryResponseContentOfCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

