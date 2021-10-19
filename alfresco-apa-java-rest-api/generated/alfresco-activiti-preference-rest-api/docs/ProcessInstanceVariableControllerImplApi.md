# ProcessInstanceVariableControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVariablesUsingGET**](ProcessInstanceVariableControllerImplApi.md#getVariablesUsingGET) | **GET** /v1/process-instances/{processInstanceId}/variables | getVariables
[**setVariablesUsingPOST**](ProcessInstanceVariableControllerImplApi.md#setVariablesUsingPOST) | **POST** /v1/process-instances/{processInstanceId}/variables | setVariables


<a name="getVariablesUsingGET"></a>
# **getVariablesUsingGET**
> ListResponseContentCloudVariableInstance getVariablesUsingGET(processInstanceId)

getVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceVariableControllerImplApi;


ProcessInstanceVariableControllerImplApi apiInstance = new ProcessInstanceVariableControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    ListResponseContentCloudVariableInstance result = apiInstance.getVariablesUsingGET(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariableControllerImplApi#getVariablesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**ListResponseContentCloudVariableInstance**](ListResponseContentCloudVariableInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="setVariablesUsingPOST"></a>
# **setVariablesUsingPOST**
> setVariablesUsingPOST(processInstanceId, setProcessVariablesPayload)

setVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceVariableControllerImplApi;


ProcessInstanceVariableControllerImplApi apiInstance = new ProcessInstanceVariableControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
SetProcessVariablesPayload setProcessVariablesPayload = new SetProcessVariablesPayload(); // SetProcessVariablesPayload | setProcessVariablesPayload
try {
    apiInstance.setVariablesUsingPOST(processInstanceId, setProcessVariablesPayload);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariableControllerImplApi#setVariablesUsingPOST");
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

