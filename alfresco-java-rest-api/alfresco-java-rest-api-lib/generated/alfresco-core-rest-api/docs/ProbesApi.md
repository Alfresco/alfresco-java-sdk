# ProbesApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProbe**](ProbesApi.md#getProbe) | **GET** /probes/{probeId} | Check readiness and liveness of the repository


<a name="getProbe"></a>
# **getProbe**
> ProbeEntry getProbe(probeId)

Check readiness and liveness of the repository

**Note:** this endpoint is available in Alfresco 6.0 and newer versions.  Returns a status of 200 to indicate success and 503 for failure.  The readiness probe is normally only used to check repository startup.  The liveness probe should then be used to check the repository is still responding to requests.  **Note:** No authentication is required to call this endpoint. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.ProbesApi;








ProbesApi apiInstance = new ProbesApi();
String probeId = "probeId_example"; // String | The name of the probe: * -ready- * -live- 
try {
    ProbeEntry result = apiInstance.getProbe(probeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProbesApi#getProbe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **probeId** | **String**| The name of the probe: * -ready- * -live-  |

### Return type

[**ProbeEntry**](ProbeEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

