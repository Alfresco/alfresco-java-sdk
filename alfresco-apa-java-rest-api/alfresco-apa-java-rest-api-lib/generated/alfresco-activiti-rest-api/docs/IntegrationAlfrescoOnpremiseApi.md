# IntegrationAlfrescoOnpremiseApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRepositoryUsingPOST**](IntegrationAlfrescoOnpremiseApi.md#createRepositoryUsingPOST) | **POST** /activiti-app/api/enterprise/integration/alfresco | Create Alfresco repository
[**deleteRepositoryUsingDELETE**](IntegrationAlfrescoOnpremiseApi.md#deleteRepositoryUsingDELETE) | **DELETE** /activiti-app/api/enterprise/integration/alfresco/{repositoryId} | Delete Alfresco repository
[**getAllSitesUsingGET**](IntegrationAlfrescoOnpremiseApi.md#getAllSitesUsingGET) | **GET** /activiti-app/api/enterprise/integration/alfresco/{repositoryId}/sites | List Alfresco sites
[**getContentInFolderPathUsingGET**](IntegrationAlfrescoOnpremiseApi.md#getContentInFolderPathUsingGET) | **GET** /activiti-app/api/enterprise/rest/integration/alfresco/{repositoryId}/sites/{siteId}/folderpath/{folderPath}/content | List files and folders inside a specific folder identified by folder path
[**getContentInFolderUsingGET**](IntegrationAlfrescoOnpremiseApi.md#getContentInFolderUsingGET) | **GET** /activiti-app/api/enterprise/integration/alfresco/{repositoryId}/folders/{folderId}/content | List files and folders inside a specific folder
[**getContentInSiteUsingGET**](IntegrationAlfrescoOnpremiseApi.md#getContentInSiteUsingGET) | **GET** /activiti-app/api/enterprise/integration/alfresco/{repositoryId}/sites/{siteId}/content | List files and folders inside a specific site
[**getRepositoriesUsingGET**](IntegrationAlfrescoOnpremiseApi.md#getRepositoriesUsingGET) | **GET** /activiti-app/api/enterprise/profile/accounts/alfresco | List Alfresco repositories
[**updateRepositoryUsingPUT**](IntegrationAlfrescoOnpremiseApi.md#updateRepositoryUsingPUT) | **PUT** /activiti-app/api/enterprise/integration/alfresco/{repositoryId} | Update Alfresco repository

<a name="createRepositoryUsingPOST"></a>
# **createRepositoryUsingPOST**
> AlfrescoEndpointRepresentation createRepositoryUsingPOST(body)

Create Alfresco repository

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationAlfrescoOnpremiseApi;







IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
AlfrescoEndpointRepresentation body = new AlfrescoEndpointRepresentation(); // AlfrescoEndpointRepresentation | 
try {
    AlfrescoEndpointRepresentation result = apiInstance.createRepositoryUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#createRepositoryUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlfrescoEndpointRepresentation**](AlfrescoEndpointRepresentation.md)|  | [optional]

### Return type

[**AlfrescoEndpointRepresentation**](AlfrescoEndpointRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRepositoryUsingDELETE"></a>
# **deleteRepositoryUsingDELETE**
> deleteRepositoryUsingDELETE(repositoryId)

Delete Alfresco repository

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationAlfrescoOnpremiseApi;







IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
Long repositoryId = 789L; // Long | repositoryId
try {
    apiInstance.deleteRepositoryUsingDELETE(repositoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#deleteRepositoryUsingDELETE");
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

<a name="getAllSitesUsingGET"></a>
# **getAllSitesUsingGET**
> ResultListDataRepresentationAlfrescoSiteRepresenation getAllSitesUsingGET(repositoryId)

List Alfresco sites

Returns ALL Sites

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationAlfrescoOnpremiseApi;







IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
String repositoryId = "repositoryId_example"; // String | repositoryId
try {
    ResultListDataRepresentationAlfrescoSiteRepresenation result = apiInstance.getAllSitesUsingGET(repositoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#getAllSitesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryId** | **String**| repositoryId |

### Return type

[**ResultListDataRepresentationAlfrescoSiteRepresenation**](ResultListDataRepresentationAlfrescoSiteRepresenation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContentInFolderPathUsingGET"></a>
# **getContentInFolderPathUsingGET**
> ResultListDataRepresentationAlfrescoContentRepresentation getContentInFolderPathUsingGET(repositoryId, siteId, folderPath)

List files and folders inside a specific folder identified by folder path

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationAlfrescoOnpremiseApi;







IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
String repositoryId = "repositoryId_example"; // String | repositoryId
String siteId = "siteId_example"; // String | siteId
String folderPath = "folderPath_example"; // String | folderPath
try {
    ResultListDataRepresentationAlfrescoContentRepresentation result = apiInstance.getContentInFolderPathUsingGET(repositoryId, siteId, folderPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#getContentInFolderPathUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryId** | **String**| repositoryId |
 **siteId** | **String**| siteId |
 **folderPath** | **String**| folderPath |

### Return type

[**ResultListDataRepresentationAlfrescoContentRepresentation**](ResultListDataRepresentationAlfrescoContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContentInFolderUsingGET"></a>
# **getContentInFolderUsingGET**
> ResultListDataRepresentationAlfrescoContentRepresentation getContentInFolderUsingGET(repositoryId, folderId)

List files and folders inside a specific folder

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationAlfrescoOnpremiseApi;







IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
String repositoryId = "repositoryId_example"; // String | repositoryId
String folderId = "folderId_example"; // String | folderId
try {
    ResultListDataRepresentationAlfrescoContentRepresentation result = apiInstance.getContentInFolderUsingGET(repositoryId, folderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#getContentInFolderUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryId** | **String**| repositoryId |
 **folderId** | **String**| folderId |

### Return type

[**ResultListDataRepresentationAlfrescoContentRepresentation**](ResultListDataRepresentationAlfrescoContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContentInSiteUsingGET"></a>
# **getContentInSiteUsingGET**
> ResultListDataRepresentationAlfrescoContentRepresentation getContentInSiteUsingGET(repositoryId, siteId)

List files and folders inside a specific site

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationAlfrescoOnpremiseApi;







IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
String repositoryId = "repositoryId_example"; // String | repositoryId
String siteId = "siteId_example"; // String | siteId
try {
    ResultListDataRepresentationAlfrescoContentRepresentation result = apiInstance.getContentInSiteUsingGET(repositoryId, siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#getContentInSiteUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryId** | **String**| repositoryId |
 **siteId** | **String**| siteId |

### Return type

[**ResultListDataRepresentationAlfrescoContentRepresentation**](ResultListDataRepresentationAlfrescoContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRepositoriesUsingGET"></a>
# **getRepositoriesUsingGET**
> ResultListDataRepresentationAlfrescoEndpointRepresentation getRepositoriesUsingGET(tenantId, includeAccounts)

List Alfresco repositories

A tenant administrator can configure one or more Alfresco repositories to use when working with content.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationAlfrescoOnpremiseApi;







IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
Long tenantId = 789L; // Long | tenantId
Boolean includeAccounts = true; // Boolean | includeAccounts
try {
    ResultListDataRepresentationAlfrescoEndpointRepresentation result = apiInstance.getRepositoriesUsingGET(tenantId, includeAccounts);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#getRepositoriesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId | [optional]
 **includeAccounts** | **Boolean**| includeAccounts | [optional]

### Return type

[**ResultListDataRepresentationAlfrescoEndpointRepresentation**](ResultListDataRepresentationAlfrescoEndpointRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRepositoryUsingPUT"></a>
# **updateRepositoryUsingPUT**
> AlfrescoEndpointRepresentation updateRepositoryUsingPUT(repositoryId, body)

Update Alfresco repository

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IntegrationAlfrescoOnpremiseApi;







IntegrationAlfrescoOnpremiseApi apiInstance = new IntegrationAlfrescoOnpremiseApi();
Long repositoryId = 789L; // Long | repositoryId
AlfrescoEndpointRepresentation body = new AlfrescoEndpointRepresentation(); // AlfrescoEndpointRepresentation | 
try {
    AlfrescoEndpointRepresentation result = apiInstance.updateRepositoryUsingPUT(repositoryId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationAlfrescoOnpremiseApi#updateRepositoryUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryId** | **Long**| repositoryId |
 **body** | [**AlfrescoEndpointRepresentation**](AlfrescoEndpointRepresentation.md)|  | [optional]

### Return type

[**AlfrescoEndpointRepresentation**](AlfrescoEndpointRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

