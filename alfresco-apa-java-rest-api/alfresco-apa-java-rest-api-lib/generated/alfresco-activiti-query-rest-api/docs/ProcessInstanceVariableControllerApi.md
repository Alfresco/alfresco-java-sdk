# ProcessInstanceVariableControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVariablesUsingGET1**](ProcessInstanceVariableControllerApi.md#getVariablesUsingGET1) | **GET** /v1/process-instances/{processInstanceId}/variables | getVariables

<a name="getVariablesUsingGET1"></a>
# **getVariablesUsingGET1**
> ListResponseContentOfCloudVariableInstance getVariablesUsingGET1(processInstanceId, maxItems, skipCount, sort)

getVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.ProcessInstanceVariableControllerApi;


ProcessInstanceVariableControllerApi apiInstance = new ProcessInstanceVariableControllerApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudVariableInstance result = apiInstance.getVariablesUsingGET1(processInstanceId, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariableControllerApi#getVariablesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**ListResponseContentOfCloudVariableInstance**](ListResponseContentOfCloudVariableInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

