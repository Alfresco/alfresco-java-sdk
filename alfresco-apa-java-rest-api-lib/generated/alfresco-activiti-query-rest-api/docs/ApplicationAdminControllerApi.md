# ApplicationAdminControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsingGET**](ApplicationAdminControllerApi.md#findAllUsingGET) | **GET** /admin/v1/applications | findAll

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> ListResponseContentOfCloudApplication findAllUsingGET(maxItems, skipCount, sort)

findAll

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.ApplicationAdminControllerApi;


ApplicationAdminControllerApi apiInstance = new ApplicationAdminControllerApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudApplication result = apiInstance.findAllUsingGET(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationAdminControllerApi#findAllUsingGET");
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

[**ListResponseContentOfCloudApplication**](ListResponseContentOfCloudApplication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

