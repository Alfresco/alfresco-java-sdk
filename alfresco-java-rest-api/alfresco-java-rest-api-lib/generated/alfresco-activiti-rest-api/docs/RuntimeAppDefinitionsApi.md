# RuntimeAppDefinitionsApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deployAppDefinitionsUsingPOST**](RuntimeAppDefinitionsApi.md#deployAppDefinitionsUsingPOST) | **POST** /enterprise/runtime-app-definitions | Deploy a published app
[**getAppDefinitionUsingGET1**](RuntimeAppDefinitionsApi.md#getAppDefinitionUsingGET1) | **GET** /enterprise/runtime-app-definitions/{appDefinitionId} | Get a runtime app
[**getAppDefinitionsUsingGET**](RuntimeAppDefinitionsApi.md#getAppDefinitionsUsingGET) | **GET** /enterprise/runtime-app-definitions | List runtime apps


<a name="deployAppDefinitionsUsingPOST"></a>
# **deployAppDefinitionsUsingPOST**
> deployAppDefinitionsUsingPOST(saveObject)

Deploy a published app

Deploying an app allows the user to see it on his/her landing page. Apps must be published before they can be deployed.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.RuntimeAppDefinitionsApi;








RuntimeAppDefinitionsApi apiInstance = new RuntimeAppDefinitionsApi();
RuntimeAppDefinitionSaveRepresentation saveObject = new RuntimeAppDefinitionSaveRepresentation(); // RuntimeAppDefinitionSaveRepresentation | saveObject
try {
    apiInstance.deployAppDefinitionsUsingPOST(saveObject);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeAppDefinitionsApi#deployAppDefinitionsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saveObject** | [**RuntimeAppDefinitionSaveRepresentation**](RuntimeAppDefinitionSaveRepresentation.md)| saveObject |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppDefinitionUsingGET1"></a>
# **getAppDefinitionUsingGET1**
> AppDefinitionRepresentation getAppDefinitionUsingGET1(appDefinitionId)

Get a runtime app

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.RuntimeAppDefinitionsApi;








RuntimeAppDefinitionsApi apiInstance = new RuntimeAppDefinitionsApi();
Long appDefinitionId = 789L; // Long | appDefinitionId
try {
    AppDefinitionRepresentation result = apiInstance.getAppDefinitionUsingGET1(appDefinitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeAppDefinitionsApi#getAppDefinitionUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appDefinitionId** | **Long**| appDefinitionId |

### Return type

[**AppDefinitionRepresentation**](AppDefinitionRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppDefinitionsUsingGET"></a>
# **getAppDefinitionsUsingGET**
> ResultListDataRepresentationAppDefinitionRepresentation getAppDefinitionsUsingGET()

List runtime apps

When a user logs in into Alfresco Process Services Suite, a landing page is displayed containing all the apps that the user is allowed to see and use. These are referred to as runtime apps.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.RuntimeAppDefinitionsApi;








RuntimeAppDefinitionsApi apiInstance = new RuntimeAppDefinitionsApi();
try {
    ResultListDataRepresentationAppDefinitionRepresentation result = apiInstance.getAppDefinitionsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeAppDefinitionsApi#getAppDefinitionsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListDataRepresentationAppDefinitionRepresentation**](ResultListDataRepresentationAppDefinitionRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

