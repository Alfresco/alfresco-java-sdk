# IntegrationDriveApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmAuthorisationUsingGET1**](IntegrationDriveApi.md#confirmAuthorisationUsingGET1) | **GET** /enterprise/integration/google-drive/confirm-auth-request | Drive Authorization
[**getFilesUsingGET1**](IntegrationDriveApi.md#getFilesUsingGET1) | **GET** /enterprise/integration/google-drive/files | List files and folders


<a name="confirmAuthorisationUsingGET1"></a>
# **confirmAuthorisationUsingGET1**
> confirmAuthorisationUsingGET1()

Drive Authorization

Returns Drive OAuth HTML Page

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationDriveApi;








IntegrationDriveApi apiInstance = new IntegrationDriveApi();
try {
    apiInstance.confirmAuthorisationUsingGET1();
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationDriveApi#confirmAuthorisationUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

<a name="getFilesUsingGET1"></a>
# **getFilesUsingGET1**
> ResultListDataRepresentationGoogleDriveContent getFilesUsingGET1(filter, parent, currentFolderOnly)

List files and folders

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationDriveApi;








IntegrationDriveApi apiInstance = new IntegrationDriveApi();
String filter = "filter_example"; // String | filter
String parent = "parent_example"; // String | parent
Boolean currentFolderOnly = true; // Boolean | currentFolderOnly
try {
    ResultListDataRepresentationGoogleDriveContent result = apiInstance.getFilesUsingGET1(filter, parent, currentFolderOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationDriveApi#getFilesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| filter | [optional]
 **parent** | **String**| parent | [optional]
 **currentFolderOnly** | **Boolean**| currentFolderOnly | [optional]

### Return type

[**ResultListDataRepresentationGoogleDriveContent**](ResultListDataRepresentationGoogleDriveContent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

