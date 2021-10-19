# TaskVariableAdminControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVariableUsingPOST**](TaskVariableAdminControllerImplApi.md#createVariableUsingPOST) | **POST** /admin/v1/tasks/{taskId}/variables | createVariable
[**getVariablesUsingGET1**](TaskVariableAdminControllerImplApi.md#getVariablesUsingGET1) | **GET** /admin/v1/tasks/{taskId}/variables | getVariables
[**updateVariableUsingPUT**](TaskVariableAdminControllerImplApi.md#updateVariableUsingPUT) | **PUT** /admin/v1/tasks/{taskId}/variables/{variableName} | updateVariable


<a name="createVariableUsingPOST"></a>
# **createVariableUsingPOST**
> createVariableUsingPOST(createTaskVariablePayload, taskId)

createVariable

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskVariableAdminControllerImplApi;


TaskVariableAdminControllerImplApi apiInstance = new TaskVariableAdminControllerImplApi();
CreateTaskVariablePayload createTaskVariablePayload = new CreateTaskVariablePayload(); // CreateTaskVariablePayload | createTaskVariablePayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.createVariableUsingPOST(createTaskVariablePayload, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariableAdminControllerImplApi#createVariableUsingPOST");
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

<a name="getVariablesUsingGET1"></a>
# **getVariablesUsingGET1**
> ListResponseContentCloudVariableInstance getVariablesUsingGET1(taskId)

getVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskVariableAdminControllerImplApi;


TaskVariableAdminControllerImplApi apiInstance = new TaskVariableAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    ListResponseContentCloudVariableInstance result = apiInstance.getVariablesUsingGET1(taskId);
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

[**ListResponseContentCloudVariableInstance**](ListResponseContentCloudVariableInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="updateVariableUsingPUT"></a>
# **updateVariableUsingPUT**
> updateVariableUsingPUT(taskId, updateTaskVariablePayload, variableName)

updateVariable

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.TaskVariableAdminControllerImplApi;


TaskVariableAdminControllerImplApi apiInstance = new TaskVariableAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
UpdateTaskVariablePayload updateTaskVariablePayload = new UpdateTaskVariablePayload(); // UpdateTaskVariablePayload | updateTaskVariablePayload
String variableName = "variableName_example"; // String | variableName
try {
    apiInstance.updateVariableUsingPUT(taskId, updateTaskVariablePayload, variableName);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariableAdminControllerImplApi#updateVariableUsingPUT");
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

