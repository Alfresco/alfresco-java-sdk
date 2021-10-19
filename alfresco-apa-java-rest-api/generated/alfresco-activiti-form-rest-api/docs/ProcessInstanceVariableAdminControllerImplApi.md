# ProcessInstanceVariableAdminControllerImplApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**removeVariablesUsingDELETE**](ProcessInstanceVariableAdminControllerImplApi.md#removeVariablesUsingDELETE) | **DELETE** /admin/v1/process-instances/{processInstanceId}/variables | removeVariables
[**updateVariablesUsingPUT**](ProcessInstanceVariableAdminControllerImplApi.md#updateVariablesUsingPUT) | **PUT** /admin/v1/process-instances/{processInstanceId}/variables | updateVariables


<a name="removeVariablesUsingDELETE"></a>
# **removeVariablesUsingDELETE**
> removeVariablesUsingDELETE(processInstanceId, removeProcessVariablesPayload)

removeVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceVariableAdminControllerImplApi;


ProcessInstanceVariableAdminControllerImplApi apiInstance = new ProcessInstanceVariableAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
RemoveProcessVariablesPayload removeProcessVariablesPayload = new RemoveProcessVariablesPayload(); // RemoveProcessVariablesPayload | removeProcessVariablesPayload
try {
    apiInstance.removeVariablesUsingDELETE(processInstanceId, removeProcessVariablesPayload);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariableAdminControllerImplApi#removeVariablesUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **removeProcessVariablesPayload** | [**RemoveProcessVariablesPayload**](RemoveProcessVariablesPayload.md)| removeProcessVariablesPayload |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="updateVariablesUsingPUT"></a>
# **updateVariablesUsingPUT**
> updateVariablesUsingPUT(processInstanceId, setProcessVariablesPayload)

updateVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceVariableAdminControllerImplApi;


ProcessInstanceVariableAdminControllerImplApi apiInstance = new ProcessInstanceVariableAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
SetProcessVariablesPayload setProcessVariablesPayload = new SetProcessVariablesPayload(); // SetProcessVariablesPayload | setProcessVariablesPayload
try {
    apiInstance.updateVariablesUsingPUT(processInstanceId, setProcessVariablesPayload);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariableAdminControllerImplApi#updateVariablesUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **setProcessVariablesPayload** | [**SetProcessVariablesPayload**](SetProcessVariablesPayload.md)| setProcessVariablesPayload |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

