# ReleaseControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReleaseUsingGET**](ReleaseControllerApi.md#getReleaseUsingGET) | **GET** /v1/releases/{releaseId} | Get release by a release Id

<a name="getReleaseUsingGET"></a>
# **getReleaseUsingGET**
> EntryResponseContentOfRelease getReleaseUsingGET(releaseId)

Get release by a release Id

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ReleaseControllerApi;


ReleaseControllerApi apiInstance = new ReleaseControllerApi();
String releaseId = "releaseId_example"; // String | The id of the release to get releases
try {
    EntryResponseContentOfRelease result = apiInstance.getReleaseUsingGET(releaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleaseControllerApi#getReleaseUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **releaseId** | **String**| The id of the release to get releases |

### Return type

[**EntryResponseContentOfRelease**](EntryResponseContentOfRelease.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

