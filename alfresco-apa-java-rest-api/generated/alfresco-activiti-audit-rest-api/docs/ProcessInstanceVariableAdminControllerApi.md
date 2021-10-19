# ProcessInstanceVariableAdminControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVariablesUsingGET**](ProcessInstanceVariableAdminControllerApi.md#getVariablesUsingGET) | **GET** /admin/v1/process-instances/{processInstanceId}/variables | getVariables


<a name="getVariablesUsingGET"></a>
# **getVariablesUsingGET**
> ListResponseContentOfCloudVariableInstance getVariablesUsingGET(processInstanceId, maxItems, skipCount, sort)

getVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.ProcessInstanceVariableAdminControllerApi;


ProcessInstanceVariableAdminControllerApi apiInstance = new ProcessInstanceVariableAdminControllerApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudVariableInstance result = apiInstance.getVariablesUsingGET(processInstanceId, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariableAdminControllerApi#getVariablesUsingGET");
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

