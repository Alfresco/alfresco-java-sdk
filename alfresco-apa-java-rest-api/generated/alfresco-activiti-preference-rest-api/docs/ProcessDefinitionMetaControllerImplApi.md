# ProcessDefinitionMetaControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProcessDefinitionMetadataUsingGET**](ProcessDefinitionMetaControllerImplApi.md#getProcessDefinitionMetadataUsingGET) | **GET** /v1/process-definitions/{id}/meta | getProcessDefinitionMetadata


<a name="getProcessDefinitionMetadataUsingGET"></a>
# **getProcessDefinitionMetadataUsingGET**
> EntryResponseContentProcessDefinitionMeta getProcessDefinitionMetadataUsingGET(id)

getProcessDefinitionMetadata

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessDefinitionMetaControllerImplApi;


ProcessDefinitionMetaControllerImplApi apiInstance = new ProcessDefinitionMetaControllerImplApi();
String id = "id_example"; // String | id
try {
    EntryResponseContentProcessDefinitionMeta result = apiInstance.getProcessDefinitionMetadataUsingGET(id);
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

[**EntryResponseContentProcessDefinitionMeta**](EntryResponseContentProcessDefinitionMeta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

