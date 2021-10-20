# ModelsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModelUsingPOST**](ModelsApi.md#createModelUsingPOST) | **POST** /activiti-app/api/enterprise/models | Create a new model
[**deleteModelUsingDELETE**](ModelsApi.md#deleteModelUsingDELETE) | **DELETE** /activiti-app/api/enterprise/models/{modelId} | Delete a model
[**duplicateModelUsingPOST**](ModelsApi.md#duplicateModelUsingPOST) | **POST** /activiti-app/api/enterprise/models/{modelId}/clone | Duplicate an existing model
[**getModelJSONUsingGET**](ModelsApi.md#getModelJSONUsingGET) | **GET** /activiti-app/api/enterprise/models/{modelId}/editor/json | Get model content
[**getModelThumbnailUsingGET**](ModelsApi.md#getModelThumbnailUsingGET) | **GET** /activiti-app/api/enterprise/models/{modelId}/thumbnail | Get a model&#x27;s thumbnail image
[**getModelUsingGET**](ModelsApi.md#getModelUsingGET) | **GET** /activiti-app/api/enterprise/models/{modelId} | Get a model
[**getModelsToIncludeInAppDefinitionUsingGET**](ModelsApi.md#getModelsToIncludeInAppDefinitionUsingGET) | **GET** /activiti-app/api/enterprise/models-for-app-definition | List process definition models shared with the current user
[**getModelsUsingGET**](ModelsApi.md#getModelsUsingGET) | **GET** /activiti-app/api/enterprise/models | List models (process, form, decision rule or app)
[**importNewVersionUsingPOST**](ModelsApi.md#importNewVersionUsingPOST) | **POST** /activiti-app/api/enterprise/models/{modelId}/newversion | Create a new version of a model
[**importProcessModelUsingPOST**](ModelsApi.md#importProcessModelUsingPOST) | **POST** /activiti-app/api/enterprise/process-models/import | Import a BPMN 2.0 XML file
[**saveModelUsingPOST**](ModelsApi.md#saveModelUsingPOST) | **POST** /activiti-app/api/enterprise/models/{modelId}/editor/json | Update model content
[**updateModelUsingPUT**](ModelsApi.md#updateModelUsingPUT) | **PUT** /activiti-app/api/enterprise/models/{modelId} | Update a model
[**validateModelUsingPOST**](ModelsApi.md#validateModelUsingPOST) | **POST** /activiti-app/api/enterprise/models/{modelId}/editor/validate | Validate model content

<a name="createModelUsingPOST"></a>
# **createModelUsingPOST**
> ModelRepresentation createModelUsingPOST(body)

Create a new model

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
ModelRepresentation body = new ModelRepresentation(); // ModelRepresentation | 
try {
    ModelRepresentation result = apiInstance.createModelUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#createModelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelRepresentation**](ModelRepresentation.md)|  | [optional]

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteModelUsingDELETE"></a>
# **deleteModelUsingDELETE**
> deleteModelUsingDELETE(modelId, cascade, deleteRuntimeApp)

Delete a model

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
Boolean cascade = true; // Boolean | cascade
Boolean deleteRuntimeApp = true; // Boolean | deleteRuntimeApp
try {
    apiInstance.deleteModelUsingDELETE(modelId, cascade, deleteRuntimeApp);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#deleteModelUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **cascade** | **Boolean**| cascade | [optional]
 **deleteRuntimeApp** | **Boolean**| deleteRuntimeApp | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="duplicateModelUsingPOST"></a>
# **duplicateModelUsingPOST**
> ModelRepresentation duplicateModelUsingPOST(modelId, body)

Duplicate an existing model

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
ModelRepresentation body = new ModelRepresentation(); // ModelRepresentation | 
try {
    ModelRepresentation result = apiInstance.duplicateModelUsingPOST(modelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#duplicateModelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **body** | [**ModelRepresentation**](ModelRepresentation.md)|  | [optional]

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelJSONUsingGET"></a>
# **getModelJSONUsingGET**
> ObjectNode getModelJSONUsingGET(modelId)

Get model content

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
try {
    ObjectNode result = apiInstance.getModelJSONUsingGET(modelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#getModelJSONUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |

### Return type

[**ObjectNode**](ObjectNode.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModelThumbnailUsingGET"></a>
# **getModelThumbnailUsingGET**
> byte[] getModelThumbnailUsingGET(modelId)

Get a model&#x27;s thumbnail image

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
try {
    byte[] result = apiInstance.getModelThumbnailUsingGET(modelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#getModelThumbnailUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |

### Return type

**byte[]**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png

<a name="getModelUsingGET"></a>
# **getModelUsingGET**
> ModelRepresentation getModelUsingGET(modelId, includePermissions)

Get a model

Models act as containers for process, form, decision table and app definitions

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
Boolean includePermissions = true; // Boolean | includePermissions
try {
    ModelRepresentation result = apiInstance.getModelUsingGET(modelId, includePermissions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#getModelUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **includePermissions** | **Boolean**| includePermissions | [optional]

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModelsToIncludeInAppDefinitionUsingGET"></a>
# **getModelsToIncludeInAppDefinitionUsingGET**
> ResultListDataRepresentationModelRepresentation getModelsToIncludeInAppDefinitionUsingGET()

List process definition models shared with the current user

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
try {
    ResultListDataRepresentationModelRepresentation result = apiInstance.getModelsToIncludeInAppDefinitionUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#getModelsToIncludeInAppDefinitionUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListDataRepresentationModelRepresentation**](ResultListDataRepresentationModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getModelsUsingGET"></a>
# **getModelsUsingGET**
> ResultListDataRepresentationModelRepresentation getModelsUsingGET(filter, sort, modelType, referenceId)

List models (process, form, decision rule or app)

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
String filter = "filter_example"; // String | filter
String sort = "sort_example"; // String | sort
Integer modelType = 56; // Integer | modelType
Long referenceId = 789L; // Long | referenceId
try {
    ResultListDataRepresentationModelRepresentation result = apiInstance.getModelsUsingGET(filter, sort, modelType, referenceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#getModelsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| filter | [optional]
 **sort** | **String**| sort | [optional]
 **modelType** | **Integer**| modelType | [optional]
 **referenceId** | **Long**| referenceId | [optional]

### Return type

[**ResultListDataRepresentationModelRepresentation**](ResultListDataRepresentationModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importNewVersionUsingPOST"></a>
# **importNewVersionUsingPOST**
> ModelRepresentation importNewVersionUsingPOST(modelId, body)

Create a new version of a model

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
Object body = null; // Object | 
try {
    ModelRepresentation result = apiInstance.importNewVersionUsingPOST(modelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#importNewVersionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **body** | **Object**|  | [optional]

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: application/json

<a name="importProcessModelUsingPOST"></a>
# **importProcessModelUsingPOST**
> ModelRepresentation importProcessModelUsingPOST(body)

Import a BPMN 2.0 XML file

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
Object body = null; // Object | 
try {
    ModelRepresentation result = apiInstance.importProcessModelUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#importProcessModelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**|  | [optional]

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, multipart/form-data
 - **Accept**: application/json

<a name="saveModelUsingPOST"></a>
# **saveModelUsingPOST**
> ModelRepresentation saveModelUsingPOST(modelId, body)

Update model content

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
Map<String, List<String>> body = new Map(); // Map<String, List<String>> | 
try {
    ModelRepresentation result = apiInstance.saveModelUsingPOST(modelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#saveModelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **body** | [**Map&lt;String, List&lt;String&gt;&gt;**](Map.md)|  | [optional]

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateModelUsingPUT"></a>
# **updateModelUsingPUT**
> ModelRepresentation updateModelUsingPUT(modelId, body)

Update a model

This method allows you to update the metadata of a model. In order to update the content of the model you will need to call the specific endpoint for that model type.

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
ModelRepresentation body = new ModelRepresentation(); // ModelRepresentation | 
try {
    ModelRepresentation result = apiInstance.updateModelUsingPUT(modelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#updateModelUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **body** | [**ModelRepresentation**](ModelRepresentation.md)|  | [optional]

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateModelUsingPOST"></a>
# **validateModelUsingPOST**
> List&lt;ValidationErrorRepresentation&gt; validateModelUsingPOST(modelId, body)

Validate model content

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ModelsApi;







ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
Map<String, List<String>> body = new Map(); // Map<String, List<String>> | 
try {
    List<ValidationErrorRepresentation> result = apiInstance.validateModelUsingPOST(modelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#validateModelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **Long**| modelId |
 **body** | [**Map&lt;String, List&lt;String&gt;&gt;**](Map.md)|  | [optional]

### Return type

[**List&lt;ValidationErrorRepresentation&gt;**](ValidationErrorRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

