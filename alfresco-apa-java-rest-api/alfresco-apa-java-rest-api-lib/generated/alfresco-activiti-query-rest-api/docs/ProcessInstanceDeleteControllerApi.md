# ProcessInstanceDeleteControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

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
//import org.alfresco.activiti.query.ApiException;
//import org.alfresco.activiti.query.handler.ProcessInstanceDeleteControllerApi;


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
 - **Accept**: application/json, application/hal+json

