# HighestChildClassificationApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**showHighestChildClassification**](HighestChildClassificationApi.md#showHighestChildClassification) | **GET** /highest-child-classification/{containerNodeId} | Get highest classification item in the category or folder


<a name="showHighestChildClassification"></a>
# **showHighestChildClassification**
> ClassificationLevelEntry showHighestChildClassification(containerNodeId)

Get highest classification item in the category or folder

Gets the classification level of the highest classified child for **containerNodeId**.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.HighestChildClassificationApi;








HighestChildClassificationApi apiInstance = new HighestChildClassificationApi();
String containerNodeId = "containerNodeId_example"; // String | The identifier of a container. You can use the following aliases: **-filePlan-**, **-unfiled-** 
try {
    ClassificationLevelEntry result = apiInstance.showHighestChildClassification(containerNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HighestChildClassificationApi#showHighestChildClassification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerNodeId** | **String**| The identifier of a container. You can use the following aliases: **-filePlan-**, **-unfiled-**  |

### Return type

[**ClassificationLevelEntry**](ClassificationLevelEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

