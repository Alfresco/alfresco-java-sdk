# ApplicationControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsingGET1**](ApplicationControllerApi.md#findAllUsingGET1) | **GET** /v1/applications | findAll

<a name="findAllUsingGET1"></a>
# **findAllUsingGET1**
> ListResponseContentOfCloudApplication findAllUsingGET1(maxItems, skipCount, sort)

findAll

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.ApplicationControllerApi;


ApplicationControllerApi apiInstance = new ApplicationControllerApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudApplication result = apiInstance.findAllUsingGET1(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationControllerApi#findAllUsingGET1");
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
 - **Accept**: application/json, application/hal+json

