# HomeControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHomeInfoUsingGET**](HomeControllerImplApi.md#getHomeInfoUsingGET) | **GET** /v1 | getHomeInfo

<a name="getHomeInfoUsingGET"></a>
# **getHomeInfoUsingGET**
> EntryResponseContentOfHomeResource getHomeInfoUsingGET()

getHomeInfo

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.handler.HomeControllerImplApi;


HomeControllerImplApi apiInstance = new HomeControllerImplApi();
try {
    EntryResponseContentOfHomeResource result = apiInstance.getHomeInfoUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomeControllerImplApi#getHomeInfoUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EntryResponseContentOfHomeResource**](EntryResponseContentOfHomeResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

