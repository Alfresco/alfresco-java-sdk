# ScriptFilesApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getControllersUsingGET**](ScriptFilesApi.md#getControllersUsingGET) | **GET** /activiti-app/api/enterprise/script-files/controllers | getControllers
[**getLibrariesUsingGET**](ScriptFilesApi.md#getLibrariesUsingGET) | **GET** /activiti-app/api/enterprise/script-files/libraries | getLibraries

<a name="getControllersUsingGET"></a>
# **getControllersUsingGET**
> String getControllersUsingGET()

getControllers

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ScriptFilesApi;







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

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="getLibrariesUsingGET"></a>
# **getLibrariesUsingGET**
> String getLibrariesUsingGET()

getLibraries

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ScriptFilesApi;







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

 - **Content-Type**: Not defined
 - **Accept**: text/html

