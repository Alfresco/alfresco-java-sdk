# ModelsApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModelUsingPOST**](ModelsApi.md#createModelUsingPOST) | **POST** /enterprise/models | Create a new model
[**deleteModelUsingDELETE**](ModelsApi.md#deleteModelUsingDELETE) | **DELETE** /enterprise/models/{modelId} | Delete a model
[**duplicateModelUsingPOST**](ModelsApi.md#duplicateModelUsingPOST) | **POST** /enterprise/models/{modelId}/clone | Duplicate an existing model
[**getModelJSONUsingGET**](ModelsApi.md#getModelJSONUsingGET) | **GET** /enterprise/models/{modelId}/editor/json | Get model content
[**getModelThumbnailUsingGET**](ModelsApi.md#getModelThumbnailUsingGET) | **GET** /enterprise/models/{modelId}/thumbnail | Get a model&#39;s thumbnail image
[**getModelUsingGET**](ModelsApi.md#getModelUsingGET) | **GET** /enterprise/models/{modelId} | Get a model
[**getModelsToIncludeInAppDefinitionUsingGET**](ModelsApi.md#getModelsToIncludeInAppDefinitionUsingGET) | **GET** /enterprise/models-for-app-definition | List process definition models shared with the current user
[**getModelsUsingGET**](ModelsApi.md#getModelsUsingGET) | **GET** /enterprise/models | List models (process, form, decision rule or app)
[**importNewVersionUsingPOST**](ModelsApi.md#importNewVersionUsingPOST) | **POST** /enterprise/models/{modelId}/newversion | Create a new version of a model
[**importProcessModelUsingPOST**](ModelsApi.md#importProcessModelUsingPOST) | **POST** /enterprise/process-models/import | Import a BPMN 2.0 XML file
[**saveModelUsingPOST**](ModelsApi.md#saveModelUsingPOST) | **POST** /enterprise/models/{modelId}/editor/json | Update model content
[**updateModelUsingPUT**](ModelsApi.md#updateModelUsingPUT) | **PUT** /enterprise/models/{modelId} | Update a model
[**validateModelUsingPOST**](ModelsApi.md#validateModelUsingPOST) | **POST** /enterprise/models/{modelId}/editor/validate | Validate model content


<a name="createModelUsingPOST"></a>
# **createModelUsingPOST**
> ModelRepresentation createModelUsingPOST(modelRepresentation)

Create a new model

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








ModelsApi apiInstance = new ModelsApi();
ModelRepresentation modelRepresentation = new ModelRepresentation(); // ModelRepresentation | modelRepresentation
try {
    ModelRepresentation result = apiInstance.createModelUsingPOST(modelRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#createModelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelRepresentation** | [**ModelRepresentation**](ModelRepresentation.md)| modelRepresentation |

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
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="duplicateModelUsingPOST"></a>
# **duplicateModelUsingPOST**
> ModelRepresentation duplicateModelUsingPOST(modelId, modelRepresentation)

Duplicate an existing model

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
ModelRepresentation modelRepresentation = new ModelRepresentation(); // ModelRepresentation | modelRepresentation
try {
    ModelRepresentation result = apiInstance.duplicateModelUsingPOST(modelId, modelRepresentation);
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
 **modelRepresentation** | [**ModelRepresentation**](ModelRepresentation.md)| modelRepresentation |

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
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelThumbnailUsingGET"></a>
# **getModelThumbnailUsingGET**
> List&lt;byte[]&gt; getModelThumbnailUsingGET(modelId)

Get a model&#39;s thumbnail image

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
try {
    List<byte[]> result = apiInstance.getModelThumbnailUsingGET(modelId);
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

**List&lt;byte[]&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelUsingGET"></a>
# **getModelUsingGET**
> ModelRepresentation getModelUsingGET(modelId, includePermissions)

Get a model

Models act as containers for process, form, decision table and app definitions

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelsToIncludeInAppDefinitionUsingGET"></a>
# **getModelsToIncludeInAppDefinitionUsingGET**
> ResultListDataRepresentationModelRepresentation getModelsToIncludeInAppDefinitionUsingGET()

List process definition models shared with the current user

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getModelsUsingGET"></a>
# **getModelsUsingGET**
> ResultListDataRepresentationModelRepresentation getModelsUsingGET(filter, sort, modelType, referenceId)

List models (process, form, decision rule or app)

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importNewVersionUsingPOST"></a>
# **importNewVersionUsingPOST**
> ModelRepresentation importNewVersionUsingPOST(modelId, file)

Create a new version of a model

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
File file = new File("/path/to/file.txt"); // File | file
try {
    ModelRepresentation result = apiInstance.importNewVersionUsingPOST(modelId, file);
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
 **file** | **File**| file |

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="importProcessModelUsingPOST"></a>
# **importProcessModelUsingPOST**
> ModelRepresentation importProcessModelUsingPOST(file)

Import a BPMN 2.0 XML file

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








ModelsApi apiInstance = new ModelsApi();
File file = new File("/path/to/file.txt"); // File | file
try {
    ModelRepresentation result = apiInstance.importProcessModelUsingPOST(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#importProcessModelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| file |

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="saveModelUsingPOST"></a>
# **saveModelUsingPOST**
> ModelRepresentation saveModelUsingPOST(modelId, values)

Update model content

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
Object values = null; // Object | values
try {
    ModelRepresentation result = apiInstance.saveModelUsingPOST(modelId, values);
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
 **values** | **Object**| values |

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateModelUsingPUT"></a>
# **updateModelUsingPUT**
> ModelRepresentation updateModelUsingPUT(modelId, updatedModel)

Update a model

This method allows you to update the metadata of a model. In order to update the content of the model you will need to call the specific endpoint for that model type.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
ModelRepresentation updatedModel = new ModelRepresentation(); // ModelRepresentation | updatedModel
try {
    ModelRepresentation result = apiInstance.updateModelUsingPUT(modelId, updatedModel);
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
 **updatedModel** | [**ModelRepresentation**](ModelRepresentation.md)| updatedModel |

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateModelUsingPOST"></a>
# **validateModelUsingPOST**
> List&lt;ValidationErrorRepresentation&gt; validateModelUsingPOST(modelId, values)

Validate model content

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsApi;








ModelsApi apiInstance = new ModelsApi();
Long modelId = 789L; // Long | modelId
Object values = null; // Object | values
try {
    List<ValidationErrorRepresentation> result = apiInstance.validateModelUsingPOST(modelId, values);
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
 **values** | **Object**| values | [optional]

### Return type

[**List&lt;ValidationErrorRepresentation&gt;**](ValidationErrorRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

