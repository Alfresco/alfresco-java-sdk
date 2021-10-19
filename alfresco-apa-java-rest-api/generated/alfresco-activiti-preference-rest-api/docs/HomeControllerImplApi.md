# HomeControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHomeInfoUsingGET**](HomeControllerImplApi.md#getHomeInfoUsingGET) | **GET** /v1 | getHomeInfo


<a name="getHomeInfoUsingGET"></a>
# **getHomeInfoUsingGET**
> EntryResponseContentHomeResource getHomeInfoUsingGET()

getHomeInfo

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.HomeControllerImplApi;


HomeControllerImplApi apiInstance = new HomeControllerImplApi();
try {
    EntryResponseContentHomeResource result = apiInstance.getHomeInfoUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomeControllerImplApi#getHomeInfoUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EntryResponseContentHomeResource**](EntryResponseContentHomeResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

