# ApplicationEntityApi

All URIs are relative to *https://apadev.envalfresco.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applicationDescriptorUsingDELETE**](ApplicationEntityApi.md#applicationDescriptorUsingDELETE) | **DELETE** /deployment-service/applications/{id}/descriptor | applicationDescriptor
[**applicationDescriptorUsingGET**](ApplicationEntityApi.md#applicationDescriptorUsingGET) | **GET** /deployment-service/applications/{id}/descriptor | applicationDescriptor
[**applicationDescriptorUsingPATCH**](ApplicationEntityApi.md#applicationDescriptorUsingPATCH) | **PATCH** /deployment-service/applications/{id}/descriptor | applicationDescriptor
[**applicationDescriptorUsingPOST**](ApplicationEntityApi.md#applicationDescriptorUsingPOST) | **POST** /deployment-service/applications/{id}/descriptor | applicationDescriptor
[**applicationDescriptorUsingPUT**](ApplicationEntityApi.md#applicationDescriptorUsingPUT) | **PUT** /deployment-service/applications/{id}/descriptor | applicationDescriptor


<a name="applicationDescriptorUsingDELETE"></a>
# **applicationDescriptorUsingDELETE**
> applicationDescriptorUsingDELETE(id)

applicationDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.ApplicationEntityApi;


ApplicationEntityApi apiInstance = new ApplicationEntityApi();
String id = "id_example"; // String | id
try {
    apiInstance.applicationDescriptorUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationEntityApi#applicationDescriptorUsingDELETE");
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

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="applicationDescriptorUsingGET"></a>
# **applicationDescriptorUsingGET**
> EntryResponseContentDescriptor applicationDescriptorUsingGET(id)

applicationDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.ApplicationEntityApi;


ApplicationEntityApi apiInstance = new ApplicationEntityApi();
String id = "id_example"; // String | id
try {
    EntryResponseContentDescriptor result = apiInstance.applicationDescriptorUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationEntityApi#applicationDescriptorUsingGET");
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

<a name="applicationDescriptorUsingPATCH"></a>
# **applicationDescriptorUsingPATCH**
> EntryResponseContentDescriptor applicationDescriptorUsingPATCH(body, id)

applicationDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.ApplicationEntityApi;


ApplicationEntityApi apiInstance = new ApplicationEntityApi();
String body = "body_example"; // String | body
String id = "id_example"; // String | id
try {
    EntryResponseContentDescriptor result = apiInstance.applicationDescriptorUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationEntityApi#applicationDescriptorUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **String**| id |

### Return type

[**EntryResponseContentDescriptor**](EntryResponseContentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="applicationDescriptorUsingPOST"></a>
# **applicationDescriptorUsingPOST**
> EntryResponseContentDescriptor applicationDescriptorUsingPOST(body, id)

applicationDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.ApplicationEntityApi;


ApplicationEntityApi apiInstance = new ApplicationEntityApi();
String body = "body_example"; // String | body
String id = "id_example"; // String | id
try {
    EntryResponseContentDescriptor result = apiInstance.applicationDescriptorUsingPOST(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationEntityApi#applicationDescriptorUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **String**| id |

### Return type

[**EntryResponseContentDescriptor**](EntryResponseContentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="applicationDescriptorUsingPUT"></a>
# **applicationDescriptorUsingPUT**
> EntryResponseContentDescriptor applicationDescriptorUsingPUT(body, id)

applicationDescriptor

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.ApplicationEntityApi;


ApplicationEntityApi apiInstance = new ApplicationEntityApi();
String body = "body_example"; // String | body
String id = "id_example"; // String | id
try {
    EntryResponseContentDescriptor result = apiInstance.applicationDescriptorUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationEntityApi#applicationDescriptorUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **String**| id |

### Return type

[**EntryResponseContentDescriptor**](EntryResponseContentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

