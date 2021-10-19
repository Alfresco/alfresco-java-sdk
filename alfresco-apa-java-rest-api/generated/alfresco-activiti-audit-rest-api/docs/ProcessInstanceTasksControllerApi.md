# ProcessInstanceTasksControllerApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTasksUsingGET1**](ProcessInstanceTasksControllerApi.md#getTasksUsingGET1) | **GET** /v1/process-instances/{processInstanceId}/tasks | getTasks


<a name="getTasksUsingGET1"></a>
# **getTasksUsingGET1**
> ListResponseContentOfQueryCloudTask getTasksUsingGET1(processInstanceId, maxItems, skipCount, sort)

getTasks

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.ProcessInstanceTasksControllerApi;


ProcessInstanceTasksControllerApi apiInstance = new ProcessInstanceTasksControllerApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfQueryCloudTask result = apiInstance.getTasksUsingGET1(processInstanceId, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceTasksControllerApi#getTasksUsingGET1");
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

[**ListResponseContentOfQueryCloudTask**](ListResponseContentOfQueryCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

