# IntegrationSsoApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmAuthorisationUsingGET2**](IntegrationSsoApi.md#confirmAuthorisationUsingGET2) | **GET** /activiti-app/api/enterprise/integration/sso/confirm-auth-request | SSO Authorization
[**deleteRepositoryAccountUsingDELETE1**](IntegrationSsoApi.md#deleteRepositoryAccountUsingDELETE1) | **DELETE** /activiti-app/api/enterprise/integration/sso/{repositoryId}/account | Delete account information
[**getRepositoryAccountUsingGET1**](IntegrationSsoApi.md#getRepositoryAccountUsingGET1) | **GET** /activiti-app/api/enterprise/integration/sso/{repositoryId}/account | Get account information

<a name="confirmAuthorisationUsingGET2"></a>
# **confirmAuthorisationUsingGET2**
> confirmAuthorisationUsingGET2(serviceId, sessionState, code)

SSO Authorization

Returns SSO OAuth HTML Page

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationSsoApi;







IntegrationSsoApi apiInstance = new IntegrationSsoApi();
String serviceId = "serviceId_example"; // String | serviceId
String sessionState = "sessionState_example"; // String | session_state
String code = "code_example"; // String | code
try {
    apiInstance.confirmAuthorisationUsingGET2(serviceId, sessionState, code);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationSsoApi#confirmAuthorisationUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| serviceId |
 **sessionState** | **String**| session_state |
 **code** | **String**| code |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteRepositoryAccountUsingDELETE1"></a>
# **deleteRepositoryAccountUsingDELETE1**
> deleteRepositoryAccountUsingDELETE1(repositoryId)

Delete account information

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationSsoApi;







IntegrationSsoApi apiInstance = new IntegrationSsoApi();
Long repositoryId = 789L; // Long | repositoryId
try {
    apiInstance.deleteRepositoryAccountUsingDELETE1(repositoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationSsoApi#deleteRepositoryAccountUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryId** | **Long**| repositoryId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRepositoryAccountUsingGET1"></a>
# **getRepositoryAccountUsingGET1**
> getRepositoryAccountUsingGET1(repositoryId)

Get account information

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationSsoApi;







IntegrationSsoApi apiInstance = new IntegrationSsoApi();
Long repositoryId = 789L; // Long | repositoryId
try {
    apiInstance.getRepositoryAccountUsingGET1(repositoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationSsoApi#getRepositoryAccountUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryId** | **Long**| repositoryId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

