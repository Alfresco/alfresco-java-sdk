# ScriptFilesApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getControllersUsingGET**](ScriptFilesApi.md#getControllersUsingGET) | **GET** /enterprise/script-files/controllers | getControllers
[**getLibrariesUsingGET**](ScriptFilesApi.md#getLibrariesUsingGET) | **GET** /enterprise/script-files/libraries | getLibraries


<a name="getControllersUsingGET"></a>
# **getControllersUsingGET**
> String getControllersUsingGET()

getControllers

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ScriptFilesApi;








ScriptFilesApi apiInstance = new ScriptFilesApi();
try {
    String result = apiInstance.getControllersUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptFilesApi#getControllersUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

<a name="getLibrariesUsingGET"></a>
# **getLibrariesUsingGET**
> String getLibrariesUsingGET()

getLibraries

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ScriptFilesApi;








ScriptFilesApi apiInstance = new ScriptFilesApi();
try {
    String result = apiInstance.getLibrariesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptFilesApi#getLibrariesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

