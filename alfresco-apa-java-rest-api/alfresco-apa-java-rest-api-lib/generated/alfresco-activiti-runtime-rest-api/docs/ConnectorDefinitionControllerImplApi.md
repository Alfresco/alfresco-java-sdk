# ConnectorDefinitionControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConnectorDefinitionUsingGET**](ConnectorDefinitionControllerImplApi.md#getConnectorDefinitionUsingGET) | **GET** /v1/connector-definitions/{id} | getConnectorDefinition
[**getConnectorDefinitionsUsingGET**](ConnectorDefinitionControllerImplApi.md#getConnectorDefinitionsUsingGET) | **GET** /v1/connector-definitions | getConnectorDefinitions

<a name="getConnectorDefinitionUsingGET"></a>
# **getConnectorDefinitionUsingGET**
> EntryResponseContentOfConnectorDefinition getConnectorDefinitionUsingGET(id)

getConnectorDefinition

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.ConnectorDefinitionControllerImplApi;


ConnectorDefinitionControllerImplApi apiInstance = new ConnectorDefinitionControllerImplApi();
String id = "id_example"; // String | id
try {
    EntryResponseContentOfConnectorDefinition result = apiInstance.getConnectorDefinitionUsingGET(id);
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

[**EntryResponseContentOfConnectorDefinition**](EntryResponseContentOfConnectorDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getConnectorDefinitionsUsingGET"></a>
# **getConnectorDefinitionsUsingGET**
> ListResponseContentOfConnectorDefinition getConnectorDefinitionsUsingGET()

getConnectorDefinitions

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.ConnectorDefinitionControllerImplApi;


ConnectorDefinitionControllerImplApi apiInstance = new ConnectorDefinitionControllerImplApi();
try {
    ListResponseContentOfConnectorDefinition result = apiInstance.getConnectorDefinitionsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorDefinitionControllerImplApi#getConnectorDefinitionsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListResponseContentOfConnectorDefinition**](ListResponseContentOfConnectorDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

