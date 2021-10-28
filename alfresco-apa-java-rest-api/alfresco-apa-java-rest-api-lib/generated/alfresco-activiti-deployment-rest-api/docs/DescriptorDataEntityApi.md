# DescriptorDataEntityApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**descriptorDataDescriptorUsingDELETE**](DescriptorDataEntityApi.md#descriptorDataDescriptorUsingDELETE) | **DELETE** /descriptorDatas/{id}/descriptor | descriptorDataDescriptor
[**descriptorDataDescriptorUsingGET**](DescriptorDataEntityApi.md#descriptorDataDescriptorUsingGET) | **GET** /descriptorDatas/{id}/descriptor | descriptorDataDescriptor
[**descriptorDataDescriptorUsingPATCH**](DescriptorDataEntityApi.md#descriptorDataDescriptorUsingPATCH) | **PATCH** /descriptorDatas/{id}/descriptor | descriptorDataDescriptor
[**descriptorDataDescriptorUsingPOST**](DescriptorDataEntityApi.md#descriptorDataDescriptorUsingPOST) | **POST** /descriptorDatas/{id}/descriptor | descriptorDataDescriptor
[**descriptorDataDescriptorUsingPUT**](DescriptorDataEntityApi.md#descriptorDataDescriptorUsingPUT) | **PUT** /descriptorDatas/{id}/descriptor | descriptorDataDescriptor

<a name="descriptorDataDescriptorUsingDELETE"></a>
# **descriptorDataDescriptorUsingDELETE**
> descriptorDataDescriptorUsingDELETE(id)

descriptorDataDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorDataEntityApi;


DescriptorDataEntityApi apiInstance = new DescriptorDataEntityApi();
String id = "id_example"; // String | id
try {
    apiInstance.descriptorDataDescriptorUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorDataEntityApi#descriptorDataDescriptorUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="descriptorDataDescriptorUsingGET"></a>
# **descriptorDataDescriptorUsingGET**
> EntryResponseContentOfDescriptor descriptorDataDescriptorUsingGET(id)

descriptorDataDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorDataEntityApi;


DescriptorDataEntityApi apiInstance = new DescriptorDataEntityApi();
String id = "id_example"; // String | id
try {
    EntryResponseContentOfDescriptor result = apiInstance.descriptorDataDescriptorUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorDataEntityApi#descriptorDataDescriptorUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**EntryResponseContentOfDescriptor**](EntryResponseContentOfDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

<a name="descriptorDataDescriptorUsingPATCH"></a>
# **descriptorDataDescriptorUsingPATCH**
> EntryResponseContentOfDescriptor descriptorDataDescriptorUsingPATCH(id, body)

descriptorDataDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorDataEntityApi;


DescriptorDataEntityApi apiInstance = new DescriptorDataEntityApi();
String id = "id_example"; // String | id
String body = "body_example"; // String | 
try {
    EntryResponseContentOfDescriptor result = apiInstance.descriptorDataDescriptorUsingPATCH(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorDataEntityApi#descriptorDataDescriptorUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**EntryResponseContentOfDescriptor**](EntryResponseContentOfDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-spring-data-compact+json, text/uri-list
 - **Accept**: */*

<a name="descriptorDataDescriptorUsingPOST"></a>
# **descriptorDataDescriptorUsingPOST**
> EntryResponseContentOfDescriptor descriptorDataDescriptorUsingPOST(id, body)

descriptorDataDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorDataEntityApi;


DescriptorDataEntityApi apiInstance = new DescriptorDataEntityApi();
String id = "id_example"; // String | id
String body = "body_example"; // String | 
try {
    EntryResponseContentOfDescriptor result = apiInstance.descriptorDataDescriptorUsingPOST(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorDataEntityApi#descriptorDataDescriptorUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**EntryResponseContentOfDescriptor**](EntryResponseContentOfDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-spring-data-compact+json, text/uri-list
 - **Accept**: */*

<a name="descriptorDataDescriptorUsingPUT"></a>
# **descriptorDataDescriptorUsingPUT**
> EntryResponseContentOfDescriptor descriptorDataDescriptorUsingPUT(id, body)

descriptorDataDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorDataEntityApi;


DescriptorDataEntityApi apiInstance = new DescriptorDataEntityApi();
String id = "id_example"; // String | id
String body = "body_example"; // String | 
try {
    EntryResponseContentOfDescriptor result = apiInstance.descriptorDataDescriptorUsingPUT(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorDataEntityApi#descriptorDataDescriptorUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**EntryResponseContentOfDescriptor**](EntryResponseContentOfDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-spring-data-compact+json, text/uri-list
 - **Accept**: */*

