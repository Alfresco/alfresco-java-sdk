# ProcessDefinitionMetaControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProcessDefinitionMetadataUsingGET**](ProcessDefinitionMetaControllerImplApi.md#getProcessDefinitionMetadataUsingGET) | **GET** /v1/process-definitions/{id}/meta | getProcessDefinitionMetadata

<a name="getProcessDefinitionMetadataUsingGET"></a>
# **getProcessDefinitionMetadataUsingGET**
> EntryResponseContentOfProcessDefinitionMeta getProcessDefinitionMetadataUsingGET(id)

getProcessDefinitionMetadata

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiClient;
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.Configuration;
//import org.alfresco.activiti.runtime.auth.*;
//import org.alfresco.activiti.runtime.handler.ProcessDefinitionMetaControllerImplApi;



// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProcessDefinitionMetaControllerImplApi apiInstance = new ProcessDefinitionMetaControllerImplApi();
String id = "id_example"; // String | id
try {
    EntryResponseContentOfProcessDefinitionMeta result = apiInstance.getProcessDefinitionMetadataUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionMetaControllerImplApi#getProcessDefinitionMetadataUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**EntryResponseContentOfProcessDefinitionMeta**](EntryResponseContentOfProcessDefinitionMeta.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

