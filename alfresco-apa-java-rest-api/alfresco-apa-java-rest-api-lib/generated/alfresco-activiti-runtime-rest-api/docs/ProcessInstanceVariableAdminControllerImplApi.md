# ProcessInstanceVariableAdminControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**removeVariablesUsingDELETE**](ProcessInstanceVariableAdminControllerImplApi.md#removeVariablesUsingDELETE) | **DELETE** /admin/v1/process-instances/{processInstanceId}/variables | removeVariables
[**updateVariablesUsingPUT**](ProcessInstanceVariableAdminControllerImplApi.md#updateVariablesUsingPUT) | **PUT** /admin/v1/process-instances/{processInstanceId}/variables | updateVariables

<a name="removeVariablesUsingDELETE"></a>
# **removeVariablesUsingDELETE**
> removeVariablesUsingDELETE(processInstanceId, body)

removeVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.ProcessInstanceVariableAdminControllerImplApi;


ProcessInstanceVariableAdminControllerImplApi apiInstance = new ProcessInstanceVariableAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
RemoveProcessVariablesPayload body = new RemoveProcessVariablesPayload(); // RemoveProcessVariablesPayload | 
try {
    apiInstance.removeVariablesUsingDELETE(processInstanceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariableAdminControllerImplApi#removeVariablesUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **body** | [**RemoveProcessVariablesPayload**](RemoveProcessVariablesPayload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateVariablesUsingPUT"></a>
# **updateVariablesUsingPUT**
> updateVariablesUsingPUT(processInstanceId, body)

updateVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.ProcessInstanceVariableAdminControllerImplApi;


ProcessInstanceVariableAdminControllerImplApi apiInstance = new ProcessInstanceVariableAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
SetProcessVariablesPayload body = new SetProcessVariablesPayload(); // SetProcessVariablesPayload | 
try {
    apiInstance.updateVariablesUsingPUT(processInstanceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariableAdminControllerImplApi#updateVariablesUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **body** | [**SetProcessVariablesPayload**](SetProcessVariablesPayload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

