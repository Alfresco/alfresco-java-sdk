# ProcessDefinitionControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsingGET5**](ProcessDefinitionControllerApi.md#findAllUsingGET5) | **GET** /v1/process-definitions | findAll

<a name="findAllUsingGET5"></a>
# **findAllUsingGET5**
> ListResponseContentOfCloudProcessDefinition findAllUsingGET5(maxItems, skipCount, sort)

findAll

### Example
```java
// Import classes:
//import org.alfresco.activiti.audit.ApiException;
//import org.alfresco.activiti.audit.handler.ProcessDefinitionControllerApi;


ProcessDefinitionControllerApi apiInstance = new ProcessDefinitionControllerApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudProcessDefinition result = apiInstance.findAllUsingGET5(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionControllerApi#findAllUsingGET5");
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

