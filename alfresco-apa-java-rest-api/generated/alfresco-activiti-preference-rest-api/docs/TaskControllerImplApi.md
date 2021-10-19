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
> EntryResponseContentCloudTask assignUsingPOST1(assignTaskPayload, taskId)

assign

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
AssignTaskPayload assignTaskPayload = new AssignTaskPayload(); // AssignTaskPayload | assignTaskPayload
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentCloudTask result = apiInstance.assignUsingPOST1(assignTaskPayload, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#assignUsingPOST1");
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

<a name="claimTaskUsingPOST"></a>
# **claimTaskUsingPOST**
> EntryResponseContentCloudTask claimTaskUsingPOST(taskId)

claimTask

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentCloudTask result = apiInstance.claimTaskUsingPOST(taskId);
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

[**EntryResponseContentCloudTask**](EntryResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="completeTaskUsingPOST1"></a>
# **completeTaskUsingPOST1**
> EntryResponseContentCloudTask completeTaskUsingPOST1(taskId, completeTaskPayload)

completeTask

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CompleteTaskPayload completeTaskPayload = new CompleteTaskPayload(); // CompleteTaskPayload | completeTaskPayload
try {
    EntryResponseContentCloudTask result = apiInstance.completeTaskUsingPOST1(taskId, completeTaskPayload);
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
 **completeTaskPayload** | [**CompleteTaskPayload**](CompleteTaskPayload.md)| completeTaskPayload | [optional]

### Return type

[**EntryResponseContentCloudTask**](EntryResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="createNewTaskUsingPOST"></a>
# **createNewTaskUsingPOST**
> EntryResponseContentCloudTask createNewTaskUsingPOST(createTaskPayload)

createNewTask

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
CreateTaskPayload createTaskPayload = new CreateTaskPayload(); // CreateTaskPayload | createTaskPayload
try {
    EntryResponseContentCloudTask result = apiInstance.createNewTaskUsingPOST(createTaskPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#createNewTaskUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTaskPayload** | [**CreateTaskPayload**](CreateTaskPayload.md)| createTaskPayload |

### Return type

[**EntryResponseContentCloudTask**](EntryResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="deleteTaskUsingDELETE1"></a>
# **deleteTaskUsingDELETE1**
> EntryResponseContentCloudTask deleteTaskUsingDELETE1(taskId)

deleteTask

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentCloudTask result = apiInstance.deleteTaskUsingDELETE1(taskId);
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

[**EntryResponseContentCloudTask**](EntryResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="getSubtasksUsingGET"></a>
# **getSubtasksUsingGET**
> ListResponseContentCloudTask getSubtasksUsingGET(taskId, maxItems, skipCount, sort)

getSubtasks

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentCloudTask result = apiInstance.getSubtasksUsingGET(taskId, maxItems, skipCount, sort);
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

[**ListResponseContentCloudTask**](ListResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="getTaskByIdUsingGET1"></a>
# **getTaskByIdUsingGET1**
> EntryResponseContentCloudTask getTaskByIdUsingGET1(taskId)

getTaskById

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentCloudTask result = apiInstance.getTaskByIdUsingGET1(taskId);
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

[**EntryResponseContentCloudTask**](EntryResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="getTasksUsingGET2"></a>
# **getTasksUsingGET2**
> ListResponseContentCloudTask getTasksUsingGET2(maxItems, skipCount, sort)

getTasks

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentCloudTask result = apiInstance.getTasksUsingGET2(maxItems, skipCount, sort);
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

[**ListResponseContentCloudTask**](ListResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="releaseTaskUsingPOST"></a>
# **releaseTaskUsingPOST**
> EntryResponseContentCloudTask releaseTaskUsingPOST(taskId)

releaseTask

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentCloudTask result = apiInstance.releaseTaskUsingPOST(taskId);
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

[**EntryResponseContentCloudTask**](EntryResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="saveTaskUsingPOST"></a>
# **saveTaskUsingPOST**
> saveTaskUsingPOST(saveTaskPayload, taskId)

saveTask

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
SaveTaskPayload saveTaskPayload = new SaveTaskPayload(); // SaveTaskPayload | saveTaskPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.saveTaskUsingPOST(saveTaskPayload, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerImplApi#saveTaskUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saveTaskPayload** | [**SaveTaskPayload**](SaveTaskPayload.md)| saveTaskPayload |
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="updateTaskUsingPUT1"></a>
# **updateTaskUsingPUT1**
> EntryResponseContentCloudTask updateTaskUsingPUT1(taskId, updateTaskPayload)

updateTask

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskControllerImplApi;


TaskControllerImplApi apiInstance = new TaskControllerImplApi();
String taskId = "taskId_example"; // String | taskId
UpdateTaskPayload updateTaskPayload = new UpdateTaskPayload(); // UpdateTaskPayload | updateTaskPayload
try {
    EntryResponseContentCloudTask result = apiInstance.updateTaskUsingPUT1(taskId, updateTaskPayload);
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
 **updateTaskPayload** | [**UpdateTaskPayload**](UpdateTaskPayload.md)| updateTaskPayload |

### Return type

[**EntryResponseContentCloudTask**](EntryResponseContentCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

