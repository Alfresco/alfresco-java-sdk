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

