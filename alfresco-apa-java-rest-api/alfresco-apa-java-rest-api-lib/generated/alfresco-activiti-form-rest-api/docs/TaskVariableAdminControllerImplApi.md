# TaskVariableAdminControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVariableUsingPOST**](TaskVariableAdminControllerImplApi.md#createVariableUsingPOST) | **POST** /admin/v1/tasks/{taskId}/variables | createVariable
[**getVariablesUsingGET1**](TaskVariableAdminControllerImplApi.md#getVariablesUsingGET1) | **GET** /admin/v1/tasks/{taskId}/variables | getVariables
[**updateVariableUsingPUT**](TaskVariableAdminControllerImplApi.md#updateVariableUsingPUT) | **PUT** /admin/v1/tasks/{taskId}/variables/{variableName} | updateVariable

<a name="createVariableUsingPOST"></a>
# **createVariableUsingPOST**
> createVariableUsingPOST(taskId, body)

createVariable

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.TaskVariableAdminControllerImplApi;


TaskVariableAdminControllerImplApi apiInstance = new TaskVariableAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CreateTaskVariablePayload body = new CreateTaskVariablePayload(); // CreateTaskVariablePayload | 
try {
    apiInstance.createVariableUsingPOST(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariableAdminControllerImplApi#createVariableUsingPOST");
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

<a name="getVariablesUsingGET1"></a>
# **getVariablesUsingGET1**
> ListResponseContentOfCloudVariableInstance getVariablesUsingGET1(taskId)

getVariables

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.TaskVariableAdminControllerImplApi;


TaskVariableAdminControllerImplApi apiInstance = new TaskVariableAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    ListResponseContentOfCloudVariableInstance result = apiInstance.getVariablesUsingGET1(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariableAdminControllerImplApi#getVariablesUsingGET1");
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

<a name="updateVariableUsingPUT"></a>
# **updateVariableUsingPUT**
> updateVariableUsingPUT(taskId, variableName, body)

updateVariable

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.TaskVariableAdminControllerImplApi;


TaskVariableAdminControllerImplApi apiInstance = new TaskVariableAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
String variableName = "variableName_example"; // String | variableName
UpdateTaskVariablePayload body = new UpdateTaskVariablePayload(); // UpdateTaskVariablePayload | 
try {
    apiInstance.updateVariableUsingPUT(taskId, variableName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariableAdminControllerImplApi#updateVariableUsingPUT");
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

