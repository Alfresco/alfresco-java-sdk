# TaskVariableControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVariableUsingPOST1**](TaskVariableControllerImplApi.md#createVariableUsingPOST1) | **POST** /v1/tasks/{taskId}/variables | createVariable
[**getVariablesUsingGET2**](TaskVariableControllerImplApi.md#getVariablesUsingGET2) | **GET** /v1/tasks/{taskId}/variables | getVariables
[**updateVariableUsingPUT1**](TaskVariableControllerImplApi.md#updateVariableUsingPUT1) | **PUT** /v1/tasks/{taskId}/variables/{variableName} | updateVariable


<a name="createVariableUsingPOST1"></a>
# **createVariableUsingPOST1**
> createVariableUsingPOST1(createTaskVariablePayload, taskId)

createVariable

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.TaskVariableControllerImplApi;


TaskVariableControllerImplApi apiInstance = new TaskVariableControllerImplApi();
CreateTaskVariablePayload createTaskVariablePayload = new CreateTaskVariablePayload(); // CreateTaskVariablePayload | createTaskVariablePayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.createVariableUsingPOST1(createTaskVariablePayload, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariableControllerImplApi#createVariableUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTaskVariablePayload** | [**CreateTaskVariablePayload**](CreateTaskVariablePayload.md)| createTaskVariablePayload |
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="getVariablesUsingGET2"></a>
# **getVariablesUsingGET2**
> ListResponseContentCloudVariableInstance getVariablesUsingGET2(taskId)

getVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.TaskVariableControllerImplApi;


TaskVariableControllerImplApi apiInstance = new TaskVariableControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    ListResponseContentCloudVariableInstance result = apiInstance.getVariablesUsingGET2(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariableControllerImplApi#getVariablesUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**ListResponseContentCloudVariableInstance**](ListResponseContentCloudVariableInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="updateVariableUsingPUT1"></a>
# **updateVariableUsingPUT1**
> updateVariableUsingPUT1(taskId, updateTaskVariablePayload, variableName)

updateVariable

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.TaskVariableControllerImplApi;


TaskVariableControllerImplApi apiInstance = new TaskVariableControllerImplApi();
String taskId = "taskId_example"; // String | taskId
UpdateTaskVariablePayload updateTaskVariablePayload = new UpdateTaskVariablePayload(); // UpdateTaskVariablePayload | updateTaskVariablePayload
String variableName = "variableName_example"; // String | variableName
try {
    apiInstance.updateVariableUsingPUT1(taskId, updateTaskVariablePayload, variableName);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariableControllerImplApi#updateVariableUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **updateTaskVariablePayload** | [**UpdateTaskVariablePayload**](UpdateTaskVariablePayload.md)| updateTaskVariablePayload |
 **variableName** | **String**| variableName |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

