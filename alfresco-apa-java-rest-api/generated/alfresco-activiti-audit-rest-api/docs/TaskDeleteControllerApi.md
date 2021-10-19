# TaskDeleteControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTasksUsingDELETE**](TaskDeleteControllerApi.md#deleteTasksUsingDELETE) | **DELETE** /admin/v1/tasks | deleteTasks


<a name="deleteTasksUsingDELETE"></a>
# **deleteTasksUsingDELETE**
> ListResponseContentOfQueryCloudTask deleteTasksUsingDELETE()

deleteTasks

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.TaskDeleteControllerApi;


TaskDeleteControllerApi apiInstance = new TaskDeleteControllerApi();
try {
    ListResponseContentOfQueryCloudTask result = apiInstance.deleteTasksUsingDELETE();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskDeleteControllerApi#deleteTasksUsingDELETE");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListResponseContentOfQueryCloudTask**](ListResponseContentOfQueryCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

