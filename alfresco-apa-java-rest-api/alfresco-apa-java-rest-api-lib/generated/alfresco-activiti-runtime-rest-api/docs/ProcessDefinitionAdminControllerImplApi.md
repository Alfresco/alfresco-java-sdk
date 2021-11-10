# ProcessDefinitionAdminControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllProcessDefinitionsUsingGET**](ProcessDefinitionAdminControllerImplApi.md#getAllProcessDefinitionsUsingGET) | **GET** /admin/v1/process-definitions | getAllProcessDefinitions

<a name="getAllProcessDefinitionsUsingGET"></a>
# **getAllProcessDefinitionsUsingGET**
> ListResponseContentOfCloudProcessDefinition getAllProcessDefinitionsUsingGET(maxItems, skipCount, sort)

getAllProcessDefinitions

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiClient;
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.Configuration;
//import org.alfresco.activiti.runtime.auth.*;
//import org.alfresco.activiti.runtime.handler.ProcessDefinitionAdminControllerImplApi;



// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProcessDefinitionAdminControllerImplApi apiInstance = new ProcessDefinitionAdminControllerImplApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudProcessDefinition result = apiInstance.getAllProcessDefinitionsUsingGET(maxItems, skipCount, sort);
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

[**ListResponseContentOfCloudProcessDefinition**](ListResponseContentOfCloudProcessDefinition.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

