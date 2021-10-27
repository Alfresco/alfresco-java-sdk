# TaskVariableAdminControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVariablesUsingGET2**](TaskVariableAdminControllerApi.md#getVariablesUsingGET2) | **GET** /admin/v1/tasks/{taskId}/variables | getVariables

<a name="getVariablesUsingGET2"></a>
# **getVariablesUsingGET2**
> ListResponseContentOfCloudVariableInstance getVariablesUsingGET2(taskId, maxItems, skipCount, sort)

getVariables

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.TaskVariableAdminControllerApi;


TaskVariableAdminControllerApi apiInstance = new TaskVariableAdminControllerApi();
String taskId = "taskId_example"; // String | taskId
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudVariableInstance result = apiInstance.getVariablesUsingGET2(taskId, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariableAdminControllerApi#getVariablesUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
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

