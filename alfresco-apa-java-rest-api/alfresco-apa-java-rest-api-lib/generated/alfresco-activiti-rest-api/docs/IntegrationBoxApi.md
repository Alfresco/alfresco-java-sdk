# IntegrationBoxApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmAuthorisationUsingGET**](IntegrationBoxApi.md#confirmAuthorisationUsingGET) | **GET** /activiti-app/api/enterprise/integration/box/confirm-auth-request | Box Authorization
[**createRepositoryAccountUsingPOST**](IntegrationBoxApi.md#createRepositoryAccountUsingPOST) | **POST** /activiti-app/api/enterprise/integration/box/{userId}/account | Add Box account
[**deleteRepositoryAccountUsingDELETE**](IntegrationBoxApi.md#deleteRepositoryAccountUsingDELETE) | **DELETE** /activiti-app/api/enterprise/integration/box/{userId}/account | Delete account information
[**getBoxPluginStatusUsingGET**](IntegrationBoxApi.md#getBoxPluginStatusUsingGET) | **GET** /activiti-app/api/enterprise/integration/box/status | Get status information
[**getFilesUsingGET**](IntegrationBoxApi.md#getFilesUsingGET) | **GET** /activiti-app/api/enterprise/integration/box/files | List file and folders
[**getRepositoryAccountUsingGET**](IntegrationBoxApi.md#getRepositoryAccountUsingGET) | **GET** /activiti-app/api/enterprise/integration/box/{userId}/account | Get account information
[**updateRepositoryAccountUsingPUT**](IntegrationBoxApi.md#updateRepositoryAccountUsingPUT) | **PUT** /activiti-app/api/enterprise/integration/box/{userId}/account | Update account information

<a name="confirmAuthorisationUsingGET"></a>
# **confirmAuthorisationUsingGET**
> confirmAuthorisationUsingGET()

Box Authorization

Returns Box OAuth HTML Page

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.IntegrationBoxApi;







IntegrationBoxApi apiInstance = new IntegrationBoxApi();
try {
    apiInstance.confirmAuthorisationUsingGET();
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#confirmAuthorisationUsingGET");
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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createRepositoryAccountUsingPOST"></a>
# **createRepositoryAccountUsingPOST**
> createRepositoryAccountUsingPOST(userId, body)

Add Box account

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.IntegrationBoxApi;







IntegrationBoxApi apiInstance = new IntegrationBoxApi();
Long userId = 789L; // Long | userId
UserAccountCredentialsRepresentation body = new UserAccountCredentialsRepresentation(); // UserAccountCredentialsRepresentation | 
try {
    apiInstance.createRepositoryAccountUsingPOST(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#createRepositoryAccountUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **body** | [**UserAccountCredentialsRepresentation**](UserAccountCredentialsRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteRepositoryAccountUsingDELETE"></a>
# **deleteRepositoryAccountUsingDELETE**
> deleteRepositoryAccountUsingDELETE(userId)

Delete account information

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.IntegrationBoxApi;







IntegrationBoxApi apiInstance = new IntegrationBoxApi();
Long userId = 789L; // Long | userId
try {
    apiInstance.deleteRepositoryAccountUsingDELETE(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#deleteRepositoryAccountUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBoxPluginStatusUsingGET"></a>
# **getBoxPluginStatusUsingGET**
> Boolean getBoxPluginStatusUsingGET()

Get status information

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.IntegrationBoxApi;







IntegrationBoxApi apiInstance = new IntegrationBoxApi();
try {
    Boolean result = apiInstance.getBoxPluginStatusUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#getBoxPluginStatusUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Boolean**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFilesUsingGET"></a>
# **getFilesUsingGET**
> ResultListDataRepresentationBoxContent getFilesUsingGET(filter, parent)

List file and folders

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.IntegrationBoxApi;







IntegrationBoxApi apiInstance = new IntegrationBoxApi();
String filter = "filter_example"; // String | filter
String parent = "parent_example"; // String | parent
try {
    ResultListDataRepresentationBoxContent result = apiInstance.getFilesUsingGET(filter, parent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#getFilesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| filter | [optional]
 **parent** | **String**| parent | [optional]

### Return type

[**ResultListDataRepresentationBoxContent**](ResultListDataRepresentationBoxContent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRepositoryAccountUsingGET"></a>
# **getRepositoryAccountUsingGET**
> getRepositoryAccountUsingGET(userId)

Get account information

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.IntegrationBoxApi;







IntegrationBoxApi apiInstance = new IntegrationBoxApi();
Long userId = 789L; // Long | userId
try {
    apiInstance.getRepositoryAccountUsingGET(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#getRepositoryAccountUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateRepositoryAccountUsingPUT"></a>
# **updateRepositoryAccountUsingPUT**
> updateRepositoryAccountUsingPUT(userId, body)

Update account information

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.IntegrationBoxApi;







IntegrationBoxApi apiInstance = new IntegrationBoxApi();
Long userId = 789L; // Long | userId
UserAccountCredentialsRepresentation body = new UserAccountCredentialsRepresentation(); // UserAccountCredentialsRepresentation | 
try {
    apiInstance.updateRepositoryAccountUsingPUT(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationBoxApi#updateRepositoryAccountUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **body** | [**UserAccountCredentialsRepresentation**](UserAccountCredentialsRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

