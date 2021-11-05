# ApplicationEntityApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**applicationDescriptorUsingDELETE**](ApplicationEntityApi.md#applicationDescriptorUsingDELETE) | **DELETE** /applications/{id}/descriptor | applicationDescriptor
[**applicationDescriptorUsingGET**](ApplicationEntityApi.md#applicationDescriptorUsingGET) | **GET** /applications/{id}/descriptor | applicationDescriptor
[**applicationDescriptorUsingPATCH**](ApplicationEntityApi.md#applicationDescriptorUsingPATCH) | **PATCH** /applications/{id}/descriptor | applicationDescriptor
[**applicationDescriptorUsingPOST**](ApplicationEntityApi.md#applicationDescriptorUsingPOST) | **POST** /applications/{id}/descriptor | applicationDescriptor
[**applicationDescriptorUsingPUT**](ApplicationEntityApi.md#applicationDescriptorUsingPUT) | **PUT** /applications/{id}/descriptor | applicationDescriptor

<a name="applicationDescriptorUsingDELETE"></a>
# **applicationDescriptorUsingDELETE**
> applicationDescriptorUsingDELETE(id)

applicationDescriptor

### Example
```java
// Import classes:
//import org.alfresco.activiti.deployment.ApiException;
//import org.alfresco.activiti.deployment.handler.ApplicationEntityApi;


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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="applicationDescriptorUsingGET"></a>
# **applicationDescriptorUsingGET**
> EntryResponseContentOfDescriptor applicationDescriptorUsingGET(id)

applicationDescriptor

### Example
```java
// Import classes:
//import org.alfresco.activiti.deployment.ApiException;
//import org.alfresco.activiti.deployment.handler.ApplicationEntityApi;


ApplicationEntityApi apiInstance = new ApplicationEntityApi();
String id = "id_example"; // String | id
try {
    EntryResponseContentOfDescriptor result = apiInstance.applicationDescriptorUsingGET(id);
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

[**EntryResponseContentOfDescriptor**](EntryResponseContentOfDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

<a name="applicationDescriptorUsingPATCH"></a>
# **applicationDescriptorUsingPATCH**
> EntryResponseContentOfDescriptor applicationDescriptorUsingPATCH(id, body)

applicationDescriptor

### Example
```java
// Import classes:
//import org.alfresco.activiti.deployment.ApiException;
//import org.alfresco.activiti.deployment.handler.ApplicationEntityApi;


ApplicationEntityApi apiInstance = new ApplicationEntityApi();
String id = "id_example"; // String | id
String body = "body_example"; // String | 
try {
    EntryResponseContentOfDescriptor result = apiInstance.applicationDescriptorUsingPATCH(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationEntityApi#applicationDescriptorUsingPATCH");
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

<a name="applicationDescriptorUsingPOST"></a>
# **applicationDescriptorUsingPOST**
> EntryResponseContentOfDescriptor applicationDescriptorUsingPOST(id, body)

applicationDescriptor

### Example
```java
// Import classes:
//import org.alfresco.activiti.deployment.ApiException;
//import org.alfresco.activiti.deployment.handler.ApplicationEntityApi;


ApplicationEntityApi apiInstance = new ApplicationEntityApi();
String id = "id_example"; // String | id
String body = "body_example"; // String | 
try {
    EntryResponseContentOfDescriptor result = apiInstance.applicationDescriptorUsingPOST(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationEntityApi#applicationDescriptorUsingPOST");
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

<a name="applicationDescriptorUsingPUT"></a>
# **applicationDescriptorUsingPUT**
> EntryResponseContentOfDescriptor applicationDescriptorUsingPUT(id, body)

applicationDescriptor

### Example
```java
// Import classes:
//import org.alfresco.activiti.deployment.ApiException;
//import org.alfresco.activiti.deployment.handler.ApplicationEntityApi;


ApplicationEntityApi apiInstance = new ApplicationEntityApi();
String id = "id_example"; // String | id
String body = "body_example"; // String | 
try {
    EntryResponseContentOfDescriptor result = apiInstance.applicationDescriptorUsingPUT(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationEntityApi#applicationDescriptorUsingPUT");
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

