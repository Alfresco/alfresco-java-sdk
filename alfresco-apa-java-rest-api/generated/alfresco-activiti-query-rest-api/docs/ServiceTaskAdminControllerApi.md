# ServiceTaskAdminControllerApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsingGET8**](ServiceTaskAdminControllerApi.md#findAllUsingGET8) | **GET** /admin/v1/service-tasks | findAll
[**findByIdUsingGET3**](ServiceTaskAdminControllerApi.md#findByIdUsingGET3) | **GET** /admin/v1/service-tasks/{serviceTaskId} | findById


<a name="findAllUsingGET8"></a>
# **findAllUsingGET8**
> ListResponseContentOfCloudServiceTask findAllUsingGET8(maxItems, skipCount, sort)

findAll

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.ServiceTaskAdminControllerApi;


ServiceTaskAdminControllerApi apiInstance = new ServiceTaskAdminControllerApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudServiceTask result = apiInstance.findAllUsingGET8(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTaskAdminControllerApi#findAllUsingGET8");
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

[**ListResponseContentOfCloudServiceTask**](ListResponseContentOfCloudServiceTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="findByIdUsingGET3"></a>
# **findByIdUsingGET3**
> EntryResponseContentOfCloudServiceTask findByIdUsingGET3(serviceTaskId)

findById

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.ServiceTaskAdminControllerApi;


ServiceTaskAdminControllerApi apiInstance = new ServiceTaskAdminControllerApi();
String serviceTaskId = "serviceTaskId_example"; // String | serviceTaskId
try {
    EntryResponseContentOfCloudServiceTask result = apiInstance.findByIdUsingGET3(serviceTaskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTaskAdminControllerApi#findByIdUsingGET3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceTaskId** | **String**| serviceTaskId |

### Return type

[**EntryResponseContentOfCloudServiceTask**](EntryResponseContentOfCloudServiceTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

