# AuditEventsAdminControllerImplApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsingGET2**](AuditEventsAdminControllerImplApi.md#findAllUsingGET2) | **GET** /admin/v1/events | findAll


<a name="findAllUsingGET2"></a>
# **findAllUsingGET2**
> ListResponseContentOfCloudRuntimeEventOfobjectAndstring findAllUsingGET2(maxItems, skipCount, sort)

findAll

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.AuditEventsAdminControllerImplApi;


AuditEventsAdminControllerImplApi apiInstance = new AuditEventsAdminControllerImplApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudRuntimeEventOfobjectAndstring result = apiInstance.findAllUsingGET2(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditEventsAdminControllerImplApi#findAllUsingGET2");
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

[**ListResponseContentOfCloudRuntimeEventOfobjectAndstring**](ListResponseContentOfCloudRuntimeEventOfobjectAndstring.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

