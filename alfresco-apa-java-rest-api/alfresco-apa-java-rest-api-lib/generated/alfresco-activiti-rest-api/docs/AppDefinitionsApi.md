# AppDefinitionsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAppDefinitionUsingDELETE**](AppDefinitionsApi.md#deleteAppDefinitionUsingDELETE) | **DELETE** /activiti-app/api/enterprise/app-definitions/{appDefinitionId} | deleteAppDefinition
[**exportAppDefinitionUsingGET**](AppDefinitionsApi.md#exportAppDefinitionUsingGET) | **GET** /activiti-app/api/enterprise/app-definitions/{modelId}/export | Export an app definition
[**getAppDefinitionUsingGET**](AppDefinitionsApi.md#getAppDefinitionUsingGET) | **GET** /activiti-app/api/enterprise/app-definitions/{modelId} | Get an app definition
[**importAndPublishAppUsingPOST**](AppDefinitionsApi.md#importAndPublishAppUsingPOST) | **POST** /activiti-app/api/enterprise/app-definitions/{modelId}/publish-app | importAndPublishApp
[**importAndPublishAppUsingPOST1**](AppDefinitionsApi.md#importAndPublishAppUsingPOST1) | **POST** /activiti-app/api/enterprise/app-definitions/publish-app | importAndPublishApp
[**importAppDefinitionUsingPOST**](AppDefinitionsApi.md#importAppDefinitionUsingPOST) | **POST** /activiti-app/api/enterprise/app-definitions/{modelId}/import | Update the content of an existing app
[**importAppDefinitionUsingPOST1**](AppDefinitionsApi.md#importAppDefinitionUsingPOST1) | **POST** /activiti-app/api/enterprise/app-definitions/import | Import a new app definition
[**publishAppDefinitionUsingPOST**](AppDefinitionsApi.md#publishAppDefinitionUsingPOST) | **POST** /activiti-app/api/enterprise/app-definitions/{modelId}/publish | Publish an app definition
[**updateAppDefinitionUsingPUT**](AppDefinitionsApi.md#updateAppDefinitionUsingPUT) | **PUT** /activiti-app/api/enterprise/app-definitions/{modelId} | Update an app definition

<a name="deleteAppDefinitionUsingDELETE"></a>
# **deleteAppDefinitionUsingDELETE**
> deleteAppDefinitionUsingDELETE(appDefinitionId)

deleteAppDefinition

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AppDefinitionsApi;







AppDefinitionsApi apiInstance = new AppDefinitionsApi();
Long appDefinitionId = 789L; // Long | appDefinitionId
try {
    apiInstance.deleteAppDefinitionUsingDELETE(appDefinitionId);
} catch (ApiException e) {
    System.err.println("Exception when calling AppDefinitionsApi#deleteAppDefinitionUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appDefinitionId** | **Long**| appDefinitionId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="exportAppDefinitionUsingGET"></a>
# **exportAppDefinitionUsingGET**
> exportAppDefinitionUsingGET(modelId)

Export an app definition

This will return a zip file containing the app definition model and all related models (process definitions and forms).

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AppDefinitionsApi;







AppDefinitionsApi apiInstance = new AppDefinitionsApi();
Long modelId = 789L; // Long | modelId from a runtime app or the id of an app definition model
try {
    apiInstance.exportAppDefinitionUsingGET(modelId);
} catch (ApiException e) {
    System.err.println("Exception when calling AppDefinitionsApi#exportAppDefinitionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId from a runtime app or the id of an app definition model |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAppDefinitionUsingGET"></a>
# **getAppDefinitionUsingGET**
> AppDefinitionRepresentation getAppDefinitionUsingGET(modelId)

Get an app definition

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AppDefinitionsApi;







AppDefinitionsApi apiInstance = new AppDefinitionsApi();
Long modelId = 789L; // Long | Application definition ID
try {
    AppDefinitionRepresentation result = apiInstance.getAppDefinitionUsingGET(modelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppDefinitionsApi#getAppDefinitionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| Application definition ID |

### Return type

[**AppDefinitionRepresentation**](AppDefinitionRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importAndPublishAppUsingPOST"></a>
# **importAndPublishAppUsingPOST**
> AppDefinitionUpdateResultRepresentation importAndPublishAppUsingPOST(modelId, body)

importAndPublishApp

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AppDefinitionsApi;







AppDefinitionsApi apiInstance = new AppDefinitionsApi();
Long modelId = 789L; // Long | modelId
Object body = null; // Object | 
try {
    AppDefinitionUpdateResultRepresentation result = apiInstance.importAndPublishAppUsingPOST(modelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppDefinitionsApi#importAndPublishAppUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **body** | **Object**|  | [optional]

### Return type

[**AppDefinitionUpdateResultRepresentation**](AppDefinitionUpdateResultRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: application/json

<a name="importAndPublishAppUsingPOST1"></a>
# **importAndPublishAppUsingPOST1**
> AppDefinitionUpdateResultRepresentation importAndPublishAppUsingPOST1(body)

importAndPublishApp

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AppDefinitionsApi;







AppDefinitionsApi apiInstance = new AppDefinitionsApi();
Object body = null; // Object | 
try {
    AppDefinitionUpdateResultRepresentation result = apiInstance.importAndPublishAppUsingPOST1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppDefinitionsApi#importAndPublishAppUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**|  | [optional]

### Return type

[**AppDefinitionUpdateResultRepresentation**](AppDefinitionUpdateResultRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: application/json

<a name="importAppDefinitionUsingPOST"></a>
# **importAppDefinitionUsingPOST**
> AppDefinitionRepresentation importAppDefinitionUsingPOST(modelId, body)

Update the content of an existing app

Imports an app inside an existing app definition and creates a new version&lt;p&gt;Before using any new or updated processes included in the import the app must be (re-)published and deployed.

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AppDefinitionsApi;







AppDefinitionsApi apiInstance = new AppDefinitionsApi();
Long modelId = 789L; // Long | modelId
Object body = null; // Object | 
try {
    AppDefinitionRepresentation result = apiInstance.importAppDefinitionUsingPOST(modelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppDefinitionsApi#importAppDefinitionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **body** | **Object**|  | [optional]

### Return type

[**AppDefinitionRepresentation**](AppDefinitionRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: application/json

<a name="importAppDefinitionUsingPOST1"></a>
# **importAppDefinitionUsingPOST1**
> AppDefinitionRepresentation importAppDefinitionUsingPOST1(body, renewIdmEntries)

Import a new app definition

Allows a zip file to be uploaded containing an app definition and any number of included models.&lt;p&gt;This is useful to bootstrap an environment (for users or continuous integration).&lt;p&gt;Before using any processes included in the import the app must be published and deployed.

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AppDefinitionsApi;







AppDefinitionsApi apiInstance = new AppDefinitionsApi();
Object body = null; // Object | 
String renewIdmEntries = "renewIdmEntries_example"; // String | Whether to renew user and group identifiers
try {
    AppDefinitionRepresentation result = apiInstance.importAppDefinitionUsingPOST1(body, renewIdmEntries);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppDefinitionsApi#importAppDefinitionUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**|  | [optional]
 **renewIdmEntries** | **String**| Whether to renew user and group identifiers | [optional]

### Return type

[**AppDefinitionRepresentation**](AppDefinitionRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: application/json

<a name="publishAppDefinitionUsingPOST"></a>
# **publishAppDefinitionUsingPOST**
> AppDefinitionUpdateResultRepresentation publishAppDefinitionUsingPOST(modelId, body)

Publish an app definition

Publishing an app definition makes it available for use. The application must not have any validation errors or an error will be returned.&lt;p&gt;Before an app definition can be used by other users, it must also be deployed for their use

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AppDefinitionsApi;







AppDefinitionsApi apiInstance = new AppDefinitionsApi();
Long modelId = 789L; // Long | modelId
AppDefinitionPublishRepresentation body = new AppDefinitionPublishRepresentation(); // AppDefinitionPublishRepresentation | 
try {
    AppDefinitionUpdateResultRepresentation result = apiInstance.publishAppDefinitionUsingPOST(modelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppDefinitionsApi#publishAppDefinitionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **body** | [**AppDefinitionPublishRepresentation**](AppDefinitionPublishRepresentation.md)|  | [optional]

### Return type

[**AppDefinitionUpdateResultRepresentation**](AppDefinitionUpdateResultRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAppDefinitionUsingPUT"></a>
# **updateAppDefinitionUsingPUT**
> AppDefinitionUpdateResultRepresentation updateAppDefinitionUsingPUT(modelId, body)

Update an app definition

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AppDefinitionsApi;







AppDefinitionsApi apiInstance = new AppDefinitionsApi();
Long modelId = 789L; // Long | Application definition ID
AppDefinitionSaveRepresentation body = new AppDefinitionSaveRepresentation(); // AppDefinitionSaveRepresentation | 
try {
    AppDefinitionUpdateResultRepresentation result = apiInstance.updateAppDefinitionUsingPUT(modelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppDefinitionsApi#updateAppDefinitionUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| Application definition ID |
 **body** | [**AppDefinitionSaveRepresentation**](AppDefinitionSaveRepresentation.md)|  | [optional]

### Return type

[**AppDefinitionUpdateResultRepresentation**](AppDefinitionUpdateResultRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

