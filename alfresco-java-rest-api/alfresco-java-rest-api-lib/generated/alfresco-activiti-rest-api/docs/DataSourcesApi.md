# DataSourcesApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataSourcesUsingGET**](DataSourcesApi.md#getDataSourcesUsingGET) | **GET** /enterprise/editor/data-sources | Get data sources


<a name="getDataSourcesUsingGET"></a>
# **getDataSourcesUsingGET**
> ResultListDataRepresentationDataSourceRepresentation getDataSourcesUsingGET(tenantId)

Get data sources

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DataSourcesApi;








DataSourcesApi apiInstance = new DataSourcesApi();
Long tenantId = 789L; // Long | tenantId
try {
    ResultListDataRepresentationDataSourceRepresentation result = apiInstance.getDataSourcesUsingGET(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataSourcesApi#getDataSourcesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId | [optional]

### Return type

[**ResultListDataRepresentationDataSourceRepresentation**](ResultListDataRepresentationDataSourceRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

