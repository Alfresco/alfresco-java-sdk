# ProcessInstanceDeleteControllerApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProcessInstancesUsingDELETE**](ProcessInstanceDeleteControllerApi.md#deleteProcessInstancesUsingDELETE) | **DELETE** /admin/v1/process-instances | deleteProcessInstances


<a name="deleteProcessInstancesUsingDELETE"></a>
# **deleteProcessInstancesUsingDELETE**
> ListResponseContentOfCloudProcessInstance deleteProcessInstancesUsingDELETE()

deleteProcessInstances

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.ProcessInstanceDeleteControllerApi;


ProcessInstanceDeleteControllerApi apiInstance = new ProcessInstanceDeleteControllerApi();
try {
    ListResponseContentOfCloudProcessInstance result = apiInstance.deleteProcessInstancesUsingDELETE();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceDeleteControllerApi#deleteProcessInstancesUsingDELETE");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListResponseContentOfCloudProcessInstance**](ListResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

