# ProcessInstanceAdminControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsingGET6**](ProcessInstanceAdminControllerApi.md#findAllUsingGET6) | **GET** /admin/v1/process-instances | findAll
[**findByIdUsingGET1**](ProcessInstanceAdminControllerApi.md#findByIdUsingGET1) | **GET** /admin/v1/process-instances/{processInstanceId} | findById

<a name="findAllUsingGET6"></a>
# **findAllUsingGET6**
> ListResponseContentOfCloudProcessInstance findAllUsingGET6(maxItems, skipCount, sort)

findAll

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.ProcessInstanceAdminControllerApi;


ProcessInstanceAdminControllerApi apiInstance = new ProcessInstanceAdminControllerApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudProcessInstance result = apiInstance.findAllUsingGET6(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerApi#findAllUsingGET6");
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
 - **Accept**: application/json, application/hal+json

<a name="findByIdUsingGET1"></a>
# **findByIdUsingGET1**
> EntryResponseContentOfCloudProcessInstance findByIdUsingGET1(processInstanceId)

findById

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.ProcessInstanceAdminControllerApi;


ProcessInstanceAdminControllerApi apiInstance = new ProcessInstanceAdminControllerApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentOfCloudProcessInstance result = apiInstance.findByIdUsingGET1(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerApi#findByIdUsingGET1");
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
 - **Accept**: application/json, application/hal+json

