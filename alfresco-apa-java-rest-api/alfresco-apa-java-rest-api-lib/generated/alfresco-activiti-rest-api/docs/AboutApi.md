# AboutApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppVersionUsingGET**](AboutApi.md#getAppVersionUsingGET) | **GET** /activiti-app/api/enterprise/app-version | Get server type and version

<a name="getAppVersionUsingGET"></a>
# **getAppVersionUsingGET**
> Map&lt;String, String&gt; getAppVersionUsingGET()

Get server type and version

Provides information about the running Alfresco Process Services Suite. The response payload object has the properties &#x60;type&#x60;, &#x60;majorVersion&#x60;, &#x60;minorVersion&#x60;, &#x60;revisionVersion&#x60; and &#x60;edition&#x60;.

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AboutApi;







AboutApi apiInstance = new AboutApi();
try {
    Map<String, String> result = apiInstance.getAppVersionUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AboutApi#getAppVersionUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, String&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

