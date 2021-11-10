# ProcessInstanceTasksControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTasksUsingGET**](ProcessInstanceTasksControllerImplApi.md#getTasksUsingGET) | **GET** /v1/process-instances/{processInstanceId}/tasks | getTasks

<a name="getTasksUsingGET"></a>
# **getTasksUsingGET**
> ListResponseContentOfCloudTask getTasksUsingGET(processInstanceId, maxItems, skipCount, sort)

getTasks

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiClient;
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.Configuration;
//import org.alfresco.activiti.runtime.auth.*;
//import org.alfresco.activiti.runtime.handler.ProcessInstanceTasksControllerImplApi;



// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProcessInstanceTasksControllerImplApi apiInstance = new ProcessInstanceTasksControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudTask result = apiInstance.getTasksUsingGET(processInstanceId, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceTasksControllerImplApi#getTasksUsingGET");
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

[**ListResponseContentOfCloudTask**](ListResponseContentOfCloudTask.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

