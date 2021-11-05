# TaskVariableControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVariableUsingPOST1**](TaskVariableControllerImplApi.md#createVariableUsingPOST1) | **POST** /v1/tasks/{taskId}/variables | createVariable
[**getVariablesUsingGET2**](TaskVariableControllerImplApi.md#getVariablesUsingGET2) | **GET** /v1/tasks/{taskId}/variables | getVariables
[**updateVariableUsingPUT1**](TaskVariableControllerImplApi.md#updateVariableUsingPUT1) | **PUT** /v1/tasks/{taskId}/variables/{variableName} | updateVariable

<a name="createVariableUsingPOST1"></a>
# **createVariableUsingPOST1**
> createVariableUsingPOST1(taskId, body)

createVariable

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.TaskVariableControllerImplApi;


TaskVariableControllerImplApi apiInstance = new TaskVariableControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CreateTaskVariablePayload body = new CreateTaskVariablePayload(); // CreateTaskVariablePayload | 
try {
    apiInstance.createVariableUsingPOST1(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariableControllerImplApi#createVariableUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**CreateTaskVariablePayload**](CreateTaskVariablePayload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getVariablesUsingGET2"></a>
# **getVariablesUsingGET2**
> ListResponseContentOfCloudVariableInstance getVariablesUsingGET2(taskId)

getVariables

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.TaskVariableControllerImplApi;


TaskVariableControllerImplApi apiInstance = new TaskVariableControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    ListResponseContentOfCloudVariableInstance result = apiInstance.getVariablesUsingGET2(taskId);
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

[**ListResponseContentOfCloudVariableInstance**](ListResponseContentOfCloudVariableInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="updateVariableUsingPUT1"></a>
# **updateVariableUsingPUT1**
> updateVariableUsingPUT1(taskId, variableName, body)

updateVariable

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.TaskVariableControllerImplApi;


TaskVariableControllerImplApi apiInstance = new TaskVariableControllerImplApi();
String taskId = "taskId_example"; // String | taskId
String variableName = "variableName_example"; // String | variableName
UpdateTaskVariablePayload body = new UpdateTaskVariablePayload(); // UpdateTaskVariablePayload | 
try {
    apiInstance.updateVariableUsingPUT1(taskId, variableName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariableControllerImplApi#updateVariableUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **variableName** | **String**| variableName |
 **body** | [**UpdateTaskVariablePayload**](UpdateTaskVariablePayload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

