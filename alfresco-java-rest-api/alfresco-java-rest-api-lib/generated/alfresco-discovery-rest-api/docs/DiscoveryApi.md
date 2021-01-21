# DiscoveryApi

All URIs are relative to *https://localhost/alfresco/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRepositoryInformation**](DiscoveryApi.md#getRepositoryInformation) | **GET** /discovery | Get repository information


<a name="getRepositoryInformation"></a>
# **getRepositoryInformation**
> DiscoveryEntry getRepositoryInformation()

Get repository information

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Retrieves the capabilities and detailed version information from the repository. 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.discovery.handler.DiscoveryApi;








DiscoveryApi apiInstance = new DiscoveryApi();
try {
    DiscoveryEntry result = apiInstance.getRepositoryInformation();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#getRepositoryInformation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DiscoveryEntry**](DiscoveryEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

