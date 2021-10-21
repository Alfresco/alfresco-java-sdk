# ProcessInstanceControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsingGET7**](ProcessInstanceControllerApi.md#findAllUsingGET7) | **GET** /v1/process-instances | findAll
[**findByIdUsingGET2**](ProcessInstanceControllerApi.md#findByIdUsingGET2) | **GET** /v1/process-instances/{processInstanceId} | findById
[**subprocessesUsingGET**](ProcessInstanceControllerApi.md#subprocessesUsingGET) | **GET** /v1/process-instances/{processInstanceId}/subprocesses | subprocesses

<a name="findAllUsingGET7"></a>
# **findAllUsingGET7**
> ListResponseContentOfCloudProcessInstance findAllUsingGET7(maxItems, skipCount, sort)

findAll

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.ProcessInstanceControllerApi;


ProcessInstanceControllerApi apiInstance = new ProcessInstanceControllerApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudProcessInstance result = apiInstance.findAllUsingGET7(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerApi#findAllUsingGET7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**ListResponseContentOfCloudProcessInstance**](ListResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="findByIdUsingGET2"></a>
# **findByIdUsingGET2**
> EntryResponseContentOfCloudProcessInstance findByIdUsingGET2(processInstanceId)

findById

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.ProcessInstanceControllerApi;


ProcessInstanceControllerApi apiInstance = new ProcessInstanceControllerApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentOfCloudProcessInstance result = apiInstance.findByIdUsingGET2(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerApi#findByIdUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**EntryResponseContentOfCloudProcessInstance**](EntryResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="subprocessesUsingGET"></a>
# **subprocessesUsingGET**
> ListResponseContentOfCloudProcessInstance subprocessesUsingGET(processInstanceId, maxItems, skipCount, sort)

subprocesses

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.ProcessInstanceControllerApi;


ProcessInstanceControllerApi apiInstance = new ProcessInstanceControllerApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudProcessInstance result = apiInstance.subprocessesUsingGET(processInstanceId, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerApi#subprocessesUsingGET");
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

[**ListResponseContentOfCloudProcessInstance**](ListResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

