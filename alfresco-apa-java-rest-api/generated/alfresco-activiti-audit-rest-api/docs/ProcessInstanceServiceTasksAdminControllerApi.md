# ProcessInstanceServiceTasksAdminControllerApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTasksUsingGET**](ProcessInstanceServiceTasksAdminControllerApi.md#getTasksUsingGET) | **GET** /admin/v1/process-instances/{processInstanceId}/service-tasks | getTasks


<a name="getTasksUsingGET"></a>
# **getTasksUsingGET**
> ListResponseContentOfCloudServiceTask getTasksUsingGET(processInstanceId, maxItems, skipCount, sort)

getTasks

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.ProcessInstanceServiceTasksAdminControllerApi;


ProcessInstanceServiceTasksAdminControllerApi apiInstance = new ProcessInstanceServiceTasksAdminControllerApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudServiceTask result = apiInstance.getTasksUsingGET(processInstanceId, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceServiceTasksAdminControllerApi#getTasksUsingGET");
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

[**ListResponseContentOfCloudServiceTask**](ListResponseContentOfCloudServiceTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

