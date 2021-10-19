# ConnectorDefinitionControllerImplApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConnectorDefinitionUsingGET**](ConnectorDefinitionControllerImplApi.md#getConnectorDefinitionUsingGET) | **GET** /v1/connector-definitions/{id} | getConnectorDefinition
[**getConnectorDefinitionsUsingGET**](ConnectorDefinitionControllerImplApi.md#getConnectorDefinitionsUsingGET) | **GET** /v1/connector-definitions | getConnectorDefinitions


<a name="getConnectorDefinitionUsingGET"></a>
# **getConnectorDefinitionUsingGET**
> EntryResponseContentConnectorDefinition getConnectorDefinitionUsingGET(id)

getConnectorDefinition

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ConnectorDefinitionControllerImplApi;


ConnectorDefinitionControllerImplApi apiInstance = new ConnectorDefinitionControllerImplApi();
String id = "id_example"; // String | id
try {
    EntryResponseContentConnectorDefinition result = apiInstance.getConnectorDefinitionUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorDefinitionControllerImplApi#getConnectorDefinitionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**EntryResponseContentConnectorDefinition**](EntryResponseContentConnectorDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="getConnectorDefinitionsUsingGET"></a>
# **getConnectorDefinitionsUsingGET**
> ListResponseContentConnectorDefinition getConnectorDefinitionsUsingGET()

getConnectorDefinitions

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ConnectorDefinitionControllerImplApi;


ConnectorDefinitionControllerImplApi apiInstance = new ConnectorDefinitionControllerImplApi();
try {
    ListResponseContentConnectorDefinition result = apiInstance.getConnectorDefinitionsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorDefinitionControllerImplApi#getConnectorDefinitionsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListResponseContentConnectorDefinition**](ListResponseContentConnectorDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

