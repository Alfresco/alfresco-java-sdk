# ProcessInstanceVariableAdminControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**removeVariablesUsingDELETE**](ProcessInstanceVariableAdminControllerImplApi.md#removeVariablesUsingDELETE) | **DELETE** /admin/v1/process-instances/{processInstanceId}/variables | removeVariables
[**updateVariablesUsingPUT**](ProcessInstanceVariableAdminControllerImplApi.md#updateVariablesUsingPUT) | **PUT** /admin/v1/process-instances/{processInstanceId}/variables | updateVariables

<a name="removeVariablesUsingDELETE"></a>
# **removeVariablesUsingDELETE**
> removeVariablesUsingDELETE(body, processInstanceId)

removeVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceVariableAdminControllerImplApi;


ProcessInstanceVariableAdminControllerImplApi apiInstance = new ProcessInstanceVariableAdminControllerImplApi();
RemoveProcessVariablesPayload body = new RemoveProcessVariablesPayload(); // RemoveProcessVariablesPayload | removeProcessVariablesPayload
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    apiInstance.removeVariablesUsingDELETE(body, processInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariableAdminControllerImplApi#removeVariablesUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoveProcessVariablesPayload**](RemoveProcessVariablesPayload.md)| removeProcessVariablesPayload |
 **processInstanceId** | **String**| processInstanceId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="updateVariablesUsingPUT"></a>
# **updateVariablesUsingPUT**
> updateVariablesUsingPUT(body, processInstanceId)

updateVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceVariableAdminControllerImplApi;


ProcessInstanceVariableAdminControllerImplApi apiInstance = new ProcessInstanceVariableAdminControllerImplApi();
SetProcessVariablesPayload body = new SetProcessVariablesPayload(); // SetProcessVariablesPayload | setProcessVariablesPayload
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    apiInstance.updateVariablesUsingPUT(body, processInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariableAdminControllerImplApi#updateVariablesUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetProcessVariablesPayload**](SetProcessVariablesPayload.md)| setProcessVariablesPayload |
 **processInstanceId** | **String**| processInstanceId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

