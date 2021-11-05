# ProcessDefinitionAdminControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsingGET4**](ProcessDefinitionAdminControllerApi.md#findAllUsingGET4) | **GET** /admin/v1/process-definitions | findAll

<a name="findAllUsingGET4"></a>
# **findAllUsingGET4**
> ListResponseContentOfCloudProcessDefinition findAllUsingGET4(maxItems, skipCount, sort)

findAll

### Example
```java
// Import classes:
//import org.alfresco.activiti.query.ApiException;
//import org.alfresco.activiti.query.handler.ProcessDefinitionAdminControllerApi;


ProcessDefinitionAdminControllerApi apiInstance = new ProcessDefinitionAdminControllerApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudProcessDefinition result = apiInstance.findAllUsingGET4(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionAdminControllerApi#findAllUsingGET4");
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

[**ListResponseContentOfCloudProcessDefinition**](ListResponseContentOfCloudProcessDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

