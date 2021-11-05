# FolderControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApplicationStoreFolderUsingGET**](FolderControllerApi.md#getApplicationStoreFolderUsingGET) | **GET** /v1/folders/ | getApplicationStoreFolder

<a name="getApplicationStoreFolderUsingGET"></a>
# **getApplicationStoreFolderUsingGET**
> Folder getApplicationStoreFolderUsingGET()

getApplicationStoreFolder

### Example
```java
// Import classes:
//import org.alfresco.activiti.process.storage.ApiException;
//import org.alfresco.activiti.process.storage.handler.FolderControllerApi;


FolderControllerApi apiInstance = new FolderControllerApi();
try {
    Folder result = apiInstance.getApplicationStoreFolderUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FolderControllerApi#getApplicationStoreFolderUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Folder**](Folder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

