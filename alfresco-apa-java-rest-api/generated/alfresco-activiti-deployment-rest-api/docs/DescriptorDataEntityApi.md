# DescriptorDataEntityApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**descriptorDataDescriptorUsingDELETE**](DescriptorDataEntityApi.md#descriptorDataDescriptorUsingDELETE) | **DELETE** /deployment-service/descriptorDatas/{id}/descriptor | descriptorDataDescriptor
[**descriptorDataDescriptorUsingGET**](DescriptorDataEntityApi.md#descriptorDataDescriptorUsingGET) | **GET** /deployment-service/descriptorDatas/{id}/descriptor | descriptorDataDescriptor
[**descriptorDataDescriptorUsingPATCH**](DescriptorDataEntityApi.md#descriptorDataDescriptorUsingPATCH) | **PATCH** /deployment-service/descriptorDatas/{id}/descriptor | descriptorDataDescriptor
[**descriptorDataDescriptorUsingPOST**](DescriptorDataEntityApi.md#descriptorDataDescriptorUsingPOST) | **POST** /deployment-service/descriptorDatas/{id}/descriptor | descriptorDataDescriptor
[**descriptorDataDescriptorUsingPUT**](DescriptorDataEntityApi.md#descriptorDataDescriptorUsingPUT) | **PUT** /deployment-service/descriptorDatas/{id}/descriptor | descriptorDataDescriptor

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
> EntryResponseContentDescriptor descriptorDataDescriptorUsingGET(id)

descriptorDataDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorDataEntityApi;


DescriptorDataEntityApi apiInstance = new DescriptorDataEntityApi();
String id = "id_example"; // String | id
try {
    EntryResponseContentDescriptor result = apiInstance.descriptorDataDescriptorUsingGET(id);
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

[**EntryResponseContentDescriptor**](EntryResponseContentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

<a name="descriptorDataDescriptorUsingPATCH"></a>
# **descriptorDataDescriptorUsingPATCH**
> EntryResponseContentDescriptor descriptorDataDescriptorUsingPATCH(body, id)

descriptorDataDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorDataEntityApi;


DescriptorDataEntityApi apiInstance = new DescriptorDataEntityApi();
String body = "body_example"; // String | body
String id = "id_example"; // String | id
try {
    EntryResponseContentDescriptor result = apiInstance.descriptorDataDescriptorUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorDataEntityApi#descriptorDataDescriptorUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| body |
 **id** | **String**| id |

### Return type

[**EntryResponseContentDescriptor**](EntryResponseContentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="descriptorDataDescriptorUsingPOST"></a>
# **descriptorDataDescriptorUsingPOST**
> EntryResponseContentDescriptor descriptorDataDescriptorUsingPOST(body, id)

descriptorDataDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorDataEntityApi;


DescriptorDataEntityApi apiInstance = new DescriptorDataEntityApi();
String body = "body_example"; // String | body
String id = "id_example"; // String | id
try {
    EntryResponseContentDescriptor result = apiInstance.descriptorDataDescriptorUsingPOST(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorDataEntityApi#descriptorDataDescriptorUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| body |
 **id** | **String**| id |

### Return type

[**EntryResponseContentDescriptor**](EntryResponseContentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="descriptorDataDescriptorUsingPUT"></a>
# **descriptorDataDescriptorUsingPUT**
> EntryResponseContentDescriptor descriptorDataDescriptorUsingPUT(body, id)

descriptorDataDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorDataEntityApi;


DescriptorDataEntityApi apiInstance = new DescriptorDataEntityApi();
String body = "body_example"; // String | body
String id = "id_example"; // String | id
try {
    EntryResponseContentDescriptor result = apiInstance.descriptorDataDescriptorUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorDataEntityApi#descriptorDataDescriptorUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| body |
 **id** | **String**| id |

### Return type

[**EntryResponseContentDescriptor**](EntryResponseContentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

