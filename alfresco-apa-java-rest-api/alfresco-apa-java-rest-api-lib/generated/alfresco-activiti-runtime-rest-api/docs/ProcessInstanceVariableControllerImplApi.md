# ProcessInstanceVariableControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVariablesUsingGET**](ProcessInstanceVariableControllerImplApi.md#getVariablesUsingGET) | **GET** /v1/process-instances/{processInstanceId}/variables | getVariables
[**setVariablesUsingPOST**](ProcessInstanceVariableControllerImplApi.md#setVariablesUsingPOST) | **POST** /v1/process-instances/{processInstanceId}/variables | setVariables

<a name="getVariablesUsingGET"></a>
# **getVariablesUsingGET**
> ListResponseContentOfCloudVariableInstance getVariablesUsingGET(processInstanceId)

getVariables

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiClient;
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.Configuration;
//import org.alfresco.activiti.runtime.auth.*;
//import org.alfresco.activiti.runtime.handler.ProcessInstanceVariableControllerImplApi;



// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProcessInstanceVariableControllerImplApi apiInstance = new ProcessInstanceVariableControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    ListResponseContentOfCloudVariableInstance result = apiInstance.getVariablesUsingGET(processInstanceId);
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

[**ListResponseContentOfCloudVariableInstance**](ListResponseContentOfCloudVariableInstance.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="setVariablesUsingPOST"></a>
# **setVariablesUsingPOST**
> setVariablesUsingPOST(processInstanceId, body)

setVariables

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiClient;
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.Configuration;
//import org.alfresco.activiti.runtime.auth.*;
//import org.alfresco.activiti.runtime.handler.ProcessInstanceVariableControllerImplApi;



// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProcessInstanceVariableControllerImplApi apiInstance = new ProcessInstanceVariableControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
SetProcessVariablesPayload body = new SetProcessVariablesPayload(); // SetProcessVariablesPayload | 
try {
    apiInstance.setVariablesUsingPOST(processInstanceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariableControllerImplApi#setVariablesUsingPOST");
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

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

