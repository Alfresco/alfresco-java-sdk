# RbApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFileUsingGET**](RbApi.md#getFileUsingGET) | **GET** /v1/files/{filename} | Expose public files

<a name="getFileUsingGET"></a>
# **getFileUsingGET**
> byte[] getFileUsingGET(filename)

Expose public files

Expose public files using HTTP

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiClient;
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.Configuration;
//import org.alfresco.activiti.runtime.auth.*;
//import org.alfresco.activiti.runtime.handler.RbApi;



// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

RbApi apiInstance = new RbApi();
String filename = "filename_example"; // String | filename
try {
    byte[] result = apiInstance.getFileUsingGET(filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbApi#getFileUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| filename |

### Return type

**byte[]**

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

