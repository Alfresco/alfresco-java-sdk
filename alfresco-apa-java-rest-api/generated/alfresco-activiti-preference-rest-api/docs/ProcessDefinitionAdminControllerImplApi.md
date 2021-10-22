# ProcessDefinitionAdminControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllProcessDefinitionsUsingGET**](ProcessDefinitionAdminControllerImplApi.md#getAllProcessDefinitionsUsingGET) | **GET** /admin/v1/process-definitions | getAllProcessDefinitions

<a name="getAllProcessDefinitionsUsingGET"></a>
# **getAllProcessDefinitionsUsingGET**
> ListResponseContentCloudProcessDefinition getAllProcessDefinitionsUsingGET(maxItems, skipCount, sort)

getAllProcessDefinitions

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessDefinitionAdminControllerImplApi;


ProcessDefinitionAdminControllerImplApi apiInstance = new ProcessDefinitionAdminControllerImplApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentCloudProcessDefinition result = apiInstance.getAllProcessDefinitionsUsingGET(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionAdminControllerImplApi#getAllProcessDefinitionsUsingGET");
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

[**ListResponseContentCloudProcessDefinition**](ListResponseContentCloudProcessDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

