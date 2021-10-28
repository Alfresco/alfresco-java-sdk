# ProcessDefinitionControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBpmnModelUsingGET**](ProcessDefinitionControllerImplApi.md#getBpmnModelUsingGET) | **GET** /v1/process-definitions/{id}/model | getProcessModel
[**getProcessDefinitionUsingGET**](ProcessDefinitionControllerImplApi.md#getProcessDefinitionUsingGET) | **GET** /v1/process-definitions/{id} | getProcessDefinition
[**getProcessDefinitionsUsingGET**](ProcessDefinitionControllerImplApi.md#getProcessDefinitionsUsingGET) | **GET** /v1/process-definitions | getProcessDefinitions

<a name="getBpmnModelUsingGET"></a>
# **getBpmnModelUsingGET**
> String getBpmnModelUsingGET(id)

getProcessModel

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessDefinitionControllerImplApi;


ProcessDefinitionControllerImplApi apiInstance = new ProcessDefinitionControllerImplApi();
String id = "id_example"; // String | id
try {
    String result = apiInstance.getBpmnModelUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionControllerImplApi#getBpmnModelUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json, image/svg+xml

<a name="getProcessDefinitionUsingGET"></a>
# **getProcessDefinitionUsingGET**
> EntryResponseContentOfCloudProcessDefinition getProcessDefinitionUsingGET(id)

getProcessDefinition

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessDefinitionControllerImplApi;


ProcessDefinitionControllerImplApi apiInstance = new ProcessDefinitionControllerImplApi();
String id = "id_example"; // String | id
try {
    EntryResponseContentOfCloudProcessDefinition result = apiInstance.getProcessDefinitionUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionControllerImplApi#getProcessDefinitionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**EntryResponseContentOfCloudProcessDefinition**](EntryResponseContentOfCloudProcessDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getProcessDefinitionsUsingGET"></a>
# **getProcessDefinitionsUsingGET**
> ListResponseContentOfCloudProcessDefinition getProcessDefinitionsUsingGET(maxItems, skipCount, sort)

getProcessDefinitions

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessDefinitionControllerImplApi;


ProcessDefinitionControllerImplApi apiInstance = new ProcessDefinitionControllerImplApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudProcessDefinition result = apiInstance.getProcessDefinitionsUsingGET(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionControllerImplApi#getProcessDefinitionsUsingGET");
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

