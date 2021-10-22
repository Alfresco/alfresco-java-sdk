# DataSourcesApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataSourcesUsingGET**](DataSourcesApi.md#getDataSourcesUsingGET) | **GET** /activiti-app/api/enterprise/editor/data-sources | Get data sources

<a name="getDataSourcesUsingGET"></a>
# **getDataSourcesUsingGET**
> ResultListDataRepresentationBasicDataSourceRepresentation getDataSourcesUsingGET()

Get data sources

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.DataSourcesApi;







DataSourcesApi apiInstance = new DataSourcesApi();
try {
    ResultListDataRepresentationBasicDataSourceRepresentation result = apiInstance.getDataSourcesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataSourcesApi#getDataSourcesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListDataRepresentationBasicDataSourceRepresentation**](ResultListDataRepresentationBasicDataSourceRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

