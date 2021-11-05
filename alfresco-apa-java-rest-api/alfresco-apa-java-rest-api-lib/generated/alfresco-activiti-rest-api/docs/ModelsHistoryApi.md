# ModelsHistoryApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getModelHistoryCollectionUsingGET**](ModelsHistoryApi.md#getModelHistoryCollectionUsingGET) | **GET** /activiti-app/api/enterprise/models/{modelId}/history | List a model&#x27;s historic versions
[**getProcessModelHistoryUsingGET**](ModelsHistoryApi.md#getProcessModelHistoryUsingGET) | **GET** /activiti-app/api/enterprise/models/{modelId}/history/{modelHistoryId} | Get a historic version of a model

<a name="getModelHistoryCollectionUsingGET"></a>
# **getModelHistoryCollectionUsingGET**
> ResultListDataRepresentationModelRepresentation getModelHistoryCollectionUsingGET(modelId, includeLatestVersion)

List a model&#x27;s historic versions

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsHistoryApi;







ModelsHistoryApi apiInstance = new ModelsHistoryApi();
Long modelId = 789L; // Long | modelId
Boolean includeLatestVersion = true; // Boolean | includeLatestVersion
try {
    ResultListDataRepresentationModelRepresentation result = apiInstance.getModelHistoryCollectionUsingGET(modelId, includeLatestVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsHistoryApi#getModelHistoryCollectionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **includeLatestVersion** | **Boolean**| includeLatestVersion | [optional]

### Return type

[**ResultListDataRepresentationModelRepresentation**](ResultListDataRepresentationModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessModelHistoryUsingGET"></a>
# **getProcessModelHistoryUsingGET**
> ModelRepresentation getProcessModelHistoryUsingGET(modelId, modelHistoryId)

Get a historic version of a model

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsHistoryApi;







ModelsHistoryApi apiInstance = new ModelsHistoryApi();
Long modelId = 789L; // Long | modelId
Long modelHistoryId = 789L; // Long | modelHistoryId
try {
    ModelRepresentation result = apiInstance.getProcessModelHistoryUsingGET(modelId, modelHistoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsHistoryApi#getProcessModelHistoryUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **modelHistoryId** | **Long**| modelHistoryId |

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

