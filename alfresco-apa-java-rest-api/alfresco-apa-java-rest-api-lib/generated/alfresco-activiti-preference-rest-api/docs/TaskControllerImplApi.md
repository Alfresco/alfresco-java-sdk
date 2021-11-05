# TaskControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignUsingPOST1**](TaskControllerImplApi.md#assignUsingPOST1) | **POST** /v1/tasks/{taskId}/assign | assign
[**claimTaskUsingPOST**](TaskControllerImplApi.md#claimTaskUsingPOST) | **POST** /v1/tasks/{taskId}/claim | claimTask
[**completeTaskUsingPOST1**](TaskControllerImplApi.md#completeTaskUsingPOST1) | **POST** /v1/tasks/{taskId}/complete | completeTask
[**createNewTaskUsingPOST**](TaskControllerImplApi.md#createNewTaskUsingPOST) | **POST** /v1/tasks | createNewTask
[**deleteTaskUsingDELETE1**](TaskControllerImplApi.md#deleteTaskUsingDELETE1) | **DELETE** /v1/tasks/{taskId} | deleteTask
[**getSubtasksUsingGET**](TaskControllerImplApi.md#getSubtasksUsingGET) | **GET** /v1/tasks/{taskId}/subtasks | getSubtasks
[**getTaskByIdUsingGET1**](TaskControllerImplApi.md#getTaskByIdUsingGET1) | **GET** /v1/tasks/{taskId} | getTaskById
[**getTasksUsingGET2**](TaskControllerImplApi.md#getTasksUsingGET2) | **GET** /v1/tasks | getTasks
[**releaseTaskUsingPOST**](TaskControllerImplApi.md#releaseTaskUsingPOST) | **POST** /v1/tasks/{taskId}/release | releaseTask
[**saveTaskUsingPOST**](TaskControllerImplApi.md#saveTaskUsingPOST) | **POST** /v1/tasks/{taskId}/save | saveTask
[**updateTaskUsingPUT1**](TaskControllerImplApi.md#updateTaskUsingPUT1) | **PUT** /v1/tasks/{taskId} | updateTask

<a name="assignUsingPOST1"></a>
# **assignUsingPOST1**
> EntryResponseContentOfCloudTask assignUsingPOST1(taskId, body)

assign

### Example
```java
// Import classes:
//import org.alfresco.activiti.preference.ApiException;
//import org.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
AssignTaskPayload body = new AssignTaskPayload(); // AssignTaskPayload | 
try {
    EntryResponseContentOfCloudTask result = apiInstance.assignUsingPOST1(taskId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#assignUsingPOST1");
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

<a name="claimTaskUsingPOST"></a>
# **claimTaskUsingPOST**
> EntryResponseContentOfCloudTask claimTaskUsingPOST(taskId)

claimTask

### Example
```java
// Import classes:
//import org.alfresco.activiti.preference.ApiException;
//import org.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentOfCloudTask result = apiInstance.claimTaskUsingPOST(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#claimTaskUsingPOST");
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

<a name="completeTaskUsingPOST1"></a>
# **completeTaskUsingPOST1**
> EntryResponseContentOfCloudTask completeTaskUsingPOST1(taskId, body)

completeTask

### Example
```java
// Import classes:
//import org.alfresco.activiti.preference.ApiException;
//import org.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CompleteTaskPayload body = new CompleteTaskPayload(); // CompleteTaskPayload | 
try {
    EntryResponseContentOfCloudTask result = apiInstance.completeTaskUsingPOST1(taskId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#completeTaskUsingPOST1");
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

<a name="createNewTaskUsingPOST"></a>
# **createNewTaskUsingPOST**
> EntryResponseContentOfCloudTask createNewTaskUsingPOST(body)

createNewTask

### Example
```java
// Import classes:
//import org.alfresco.activiti.preference.ApiException;
//import org.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
CreateTaskPayload body = new CreateTaskPayload(); // CreateTaskPayload | 
try {
    EntryResponseContentOfCloudTask result = apiInstance.createNewTaskUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#createNewTaskUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateTaskPayload**](CreateTaskPayload.md)|  | [optional]

### Return type

[**EntryResponseContentOfCloudTask**](EntryResponseContentOfCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

<a name="deleteTaskUsingDELETE1"></a>
# **deleteTaskUsingDELETE1**
> EntryResponseContentOfCloudTask deleteTaskUsingDELETE1(taskId)

deleteTask

### Example
```java
// Import classes:
//import org.alfresco.activiti.preference.ApiException;
//import org.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentOfCloudTask result = apiInstance.deleteTaskUsingDELETE1(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#deleteTaskUsingDELETE1");
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

<a name="getSubtasksUsingGET"></a>
# **getSubtasksUsingGET**
> ListResponseContentOfCloudTask getSubtasksUsingGET(taskId, maxItems, skipCount, sort)

getSubtasks

### Example
```java
// Import classes:
//import org.alfresco.activiti.preference.ApiException;
//import org.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudTask result = apiInstance.getSubtasksUsingGET(taskId, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#getSubtasksUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
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

<a name="getTaskByIdUsingGET1"></a>
# **getTaskByIdUsingGET1**
> EntryResponseContentOfCloudTask getTaskByIdUsingGET1(taskId)

getTaskById

### Example
```java
// Import classes:
//import org.alfresco.activiti.preference.ApiException;
//import org.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentOfCloudTask result = apiInstance.getTaskByIdUsingGET1(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#getTaskByIdUsingGET1");
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

<a name="getTasksUsingGET2"></a>
# **getTasksUsingGET2**
> ListResponseContentOfCloudTask getTasksUsingGET2(maxItems, skipCount, sort)

getTasks

### Example
```java
// Import classes:
//import org.alfresco.activiti.preference.ApiException;
//import org.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudTask result = apiInstance.getTasksUsingGET2(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#getTasksUsingGET2");
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

<a name="releaseTaskUsingPOST"></a>
# **releaseTaskUsingPOST**
> EntryResponseContentOfCloudTask releaseTaskUsingPOST(taskId)

releaseTask

### Example
```java
// Import classes:
//import org.alfresco.activiti.preference.ApiException;
//import org.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentOfCloudTask result = apiInstance.releaseTaskUsingPOST(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#releaseTaskUsingPOST");
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

<a name="saveTaskUsingPOST"></a>
# **saveTaskUsingPOST**
> saveTaskUsingPOST(taskId, body)

saveTask

### Example
```java
// Import classes:
//import org.alfresco.activiti.preference.ApiException;
//import org.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
SaveTaskPayload body = new SaveTaskPayload(); // SaveTaskPayload | 
try {
    apiInstance.saveTaskUsingPOST(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#saveTaskUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**SaveTaskPayload**](SaveTaskPayload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateTaskUsingPUT1"></a>
# **updateTaskUsingPUT1**
> EntryResponseContentOfCloudTask updateTaskUsingPUT1(taskId, body)

updateTask

### Example
```java
// Import classes:
//import org.alfresco.activiti.preference.ApiException;
//import org.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
UpdateTaskPayload body = new UpdateTaskPayload(); // UpdateTaskPayload | 
try {
    EntryResponseContentOfCloudTask result = apiInstance.updateTaskUsingPUT1(taskId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#updateTaskUsingPUT1");
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

