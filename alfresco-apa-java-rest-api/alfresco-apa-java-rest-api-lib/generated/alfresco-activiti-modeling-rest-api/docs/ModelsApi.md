# ModelsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModelUsingPOST**](ModelsApi.md#createModelUsingPOST) | **POST** /v1/projects/{projectId}/models | Create new model belonging to an project
[**createModelWithoutProjectUsingPOST**](ModelsApi.md#createModelWithoutProjectUsingPOST) | **POST** /v1/models | Create new model that does note belong to a project
[**deleteModelUsingDELETE**](ModelsApi.md#deleteModelUsingDELETE) | **DELETE** /v1/models/{modelId} | Delete model
[**deleteProjectModelRelationshipUsingDELETE**](ModelsApi.md#deleteProjectModelRelationshipUsingDELETE) | **DELETE** /v1/projects/{projectId}/models/{modelId} | Delete the relationship between an existing model, and the project
[**exportModelUsingGET**](ModelsApi.md#exportModelUsingGET) | **GET** /v1/models/{modelId}/export | Export a model definition as file
[**getGlobalModelsUsingGET**](ModelsApi.md#getGlobalModelsUsingGET) | **GET** /v1/models | List all the models that are not coupled to a project
[**getModelContentUsingGET**](ModelsApi.md#getModelContentUsingGET) | **GET** /v1/models/{modelId}/content | Get the model content
[**getModelTypesUsingGET**](ModelsApi.md#getModelTypesUsingGET) | **GET** /v1/model-types | List model types
[**getModelUsingGET**](ModelsApi.md#getModelUsingGET) | **GET** /v1/models/{modelId} | Get metadata information for a model
[**getModelsUsingGET**](ModelsApi.md#getModelsUsingGET) | **GET** /v1/projects/{projectId}/models | List models for an project
[**getSchemaUsingGET**](ModelsApi.md#getSchemaUsingGET) | **GET** /v1/schemas/{modelType} | Get validation schema for model type
[**importModelUsingPOST**](ModelsApi.md#importModelUsingPOST) | **POST** /v1/projects/{projectId}/models/import | Import a model from file
[**putProjectModelRelationshipUsingPUT**](ModelsApi.md#putProjectModelRelationshipUsingPUT) | **PUT** /v1/projects/{projectId}/models/{modelId} | Add or update the relationship between an existing model, and the project
[**updateModelContentUsingPUT**](ModelsApi.md#updateModelContentUsingPUT) | **PUT** /v1/models/{modelId}/content | Update model content
[**updateModelUsingPUT**](ModelsApi.md#updateModelUsingPUT) | **PUT** /v1/models/{modelId} | Update model metadata
[**validateModelExtensionsUsingPOST**](ModelsApi.md#validateModelExtensionsUsingPOST) | **POST** /v1/models/{modelId}/validate/extensions | Validate model extensions
[**validateModelUsingPOST**](ModelsApi.md#validateModelUsingPOST) | **POST** /v1/models/{modelId}/validate | Validate a model content

<a name="createModelUsingPOST"></a>
# **createModelUsingPOST**
> EntryResponseContentOfModel createModelUsingPOST(projectId, body)

Create new model belonging to an project

Create a new model related to an existing project

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String projectId = "projectId_example"; // String | The id of the project to associate the new model with
ModelReq body = new ModelReq(); // ModelReq | 
try {
    EntryResponseContentOfModel result = apiInstance.createModelUsingPOST(projectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#createModelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project to associate the new model with |
 **body** | [**ModelReq**](ModelReq.md)|  | [optional]

### Return type

[**EntryResponseContentOfModel**](EntryResponseContentOfModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

<a name="createModelWithoutProjectUsingPOST"></a>
# **createModelWithoutProjectUsingPOST**
> EntryResponseContentOfModel createModelWithoutProjectUsingPOST(body)

Create new model that does note belong to a project

Create a new model with no relationship to other projects

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
ModelReq body = new ModelReq(); // ModelReq | 
try {
    EntryResponseContentOfModel result = apiInstance.createModelWithoutProjectUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#createModelWithoutProjectUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelReq**](ModelReq.md)|  | [optional]

### Return type

[**EntryResponseContentOfModel**](EntryResponseContentOfModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

<a name="deleteModelUsingDELETE"></a>
# **deleteModelUsingDELETE**
> deleteModelUsingDELETE(modelId)

Delete model

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String modelId = "modelId_example"; // String | The id of the model to delete
try {
    apiInstance.deleteModelUsingDELETE(modelId);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#deleteModelUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| The id of the model to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteProjectModelRelationshipUsingDELETE"></a>
# **deleteProjectModelRelationshipUsingDELETE**
> EntryResponseContentOfModel deleteProjectModelRelationshipUsingDELETE(projectId, modelId)

Delete the relationship between an existing model, and the project

Get the model associated with the project updated. Minimal information for the model is returned.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String projectId = "projectId_example"; // String | The id of the project of the relationship to delete
String modelId = "modelId_example"; // String | The id of the model of the relationship to delete
try {
    EntryResponseContentOfModel result = apiInstance.deleteProjectModelRelationshipUsingDELETE(projectId, modelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#deleteProjectModelRelationshipUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project of the relationship to delete |
 **modelId** | **String**| The id of the model of the relationship to delete |

### Return type

[**EntryResponseContentOfModel**](EntryResponseContentOfModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="exportModelUsingGET"></a>
# **exportModelUsingGET**
> exportModelUsingGET(modelId, attachment)

Export a model definition as file

Allows to download a file containing a model metadata along with the model content.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String modelId = "modelId_example"; // String | The id of the model to export
Boolean attachment = true; // Boolean | <b>true</b> value enables a web browser to download the file as an attachment.<br> <b>false</b> means that a web browser may preview the file in a new tab or window, but not download the file.
try {
    apiInstance.exportModelUsingGET(modelId, attachment);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#exportModelUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| The id of the model to export |
 **attachment** | **Boolean**| &lt;b&gt;true&lt;/b&gt; value enables a web browser to download the file as an attachment.&lt;br&gt; &lt;b&gt;false&lt;/b&gt; means that a web browser may preview the file in a new tab or window, but not download the file. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getGlobalModelsUsingGET"></a>
# **getGlobalModelsUsingGET**
> ListResponseContentOfModel getGlobalModelsUsingGET(type, maxItems, skipCount, sort, includeOrphans)

List all the models that are not coupled to a project

Get the models that has GLOBAL as scope. Minimal information for each model is returned.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String type = "type_example"; // String | The type of the model to filter
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
Boolean includeOrphans = true; // Boolean | If true, then models with no relationship to any project are retrieved regardless of their scope
try {
    ListResponseContentOfModel result = apiInstance.getGlobalModelsUsingGET(type, maxItems, skipCount, sort, includeOrphans);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#getGlobalModelsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type of the model to filter |
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]
 **includeOrphans** | **Boolean**| If true, then models with no relationship to any project are retrieved regardless of their scope | [optional]

### Return type

[**ListResponseContentOfModel**](ListResponseContentOfModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getModelContentUsingGET"></a>
# **getModelContentUsingGET**
> getModelContentUsingGET(modelId)

Get the model content

Retrieve the content of the model for the identifier &lt;b&gt;modelId&lt;/b&gt; with the content type corresponding to the model type (xml for process models and json for the others).&lt;br&gt;For &lt;b&gt;Accept: image/svg+xml&lt;/b&gt; request header, the svg image corresponding to the model content will be retrieved.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String modelId = "modelId_example"; // String | The id of the model to get the content
try {
    apiInstance.getModelContentUsingGET(modelId);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#getModelContentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| The id of the model to get the content |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getModelTypesUsingGET"></a>
# **getModelTypesUsingGET**
> ListResponseContentOfModelType getModelTypesUsingGET(maxItems, skipCount, sort)

List model types

Get the list of available model types.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfModelType result = apiInstance.getModelTypesUsingGET(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#getModelTypesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**ListResponseContentOfModelType**](ListResponseContentOfModelType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getModelUsingGET"></a>
# **getModelUsingGET**
> EntryResponseContentOfModel getModelUsingGET(modelId)

Get metadata information for a model

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String modelId = "modelId_example"; // String | The id of the model to retrieve
try {
    EntryResponseContentOfModel result = apiInstance.getModelUsingGET(modelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#getModelUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| The id of the model to retrieve |

### Return type

[**EntryResponseContentOfModel**](EntryResponseContentOfModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getModelsUsingGET"></a>
# **getModelsUsingGET**
> ListResponseContentOfModel getModelsUsingGET(projectId, type, maxItems, skipCount, sort)

List models for an project

Get the models associated with an project. Minimal information for each model is returned.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String projectId = "projectId_example"; // String | The id of the project to get the models for
String type = "type_example"; // String | The type of the model to filter
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfModel result = apiInstance.getModelsUsingGET(projectId, type, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#getModelsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project to get the models for |
 **type** | **String**| The type of the model to filter |
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**ListResponseContentOfModel**](ListResponseContentOfModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getSchemaUsingGET"></a>
# **getSchemaUsingGET**
> String getSchemaUsingGET(modelType)

Get validation schema for model type

Get the content of the schema used to validate the given model type.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String modelType = "modelType_example"; // String | modelType
try {
    String result = apiInstance.getSchemaUsingGET(modelType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#getSchemaUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelType** | **String**| modelType |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importModelUsingPOST"></a>
# **importModelUsingPOST**
> EntryResponseContentOfModel importModelUsingPOST(projectId, file, type)

Import a model from file

Allows a file to be uploaded containing a model definition.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String projectId = "projectId_example"; // String | The id of the project to associate the new model with
File file = new File("file_example"); // File | 
String type = "type_example"; // String | 
try {
    EntryResponseContentOfModel result = apiInstance.importModelUsingPOST(projectId, file, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#importModelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project to associate the new model with |
 **file** | **File**|  | [optional]
 **type** | **String**|  | [optional]

### Return type

[**EntryResponseContentOfModel**](EntryResponseContentOfModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/hal+json

<a name="putProjectModelRelationshipUsingPUT"></a>
# **putProjectModelRelationshipUsingPUT**
> EntryResponseContentOfModel putProjectModelRelationshipUsingPUT(projectId, modelId, scope, force)

Add or update the relationship between an existing model, and the project

Get the model associated with the project updated. Minimal information for the model is returned.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String projectId = "projectId_example"; // String | The id of the project to associate the model with
String modelId = "modelId_example"; // String | The id of the model to associate the project with
String scope = "scope_example"; // String | Scope to update the model if needed (optional)
Boolean force = true; // Boolean | If the scope of the model has restrictions on the number of projects that a model can belong to, remove the other relationships of the model with other projects
try {
    EntryResponseContentOfModel result = apiInstance.putProjectModelRelationshipUsingPUT(projectId, modelId, scope, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#putProjectModelRelationshipUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project to associate the model with |
 **modelId** | **String**| The id of the model to associate the project with |
 **scope** | **String**| Scope to update the model if needed (optional) | [optional]
 **force** | **Boolean**| If the scope of the model has restrictions on the number of projects that a model can belong to, remove the other relationships of the model with other projects | [optional]

### Return type

[**EntryResponseContentOfModel**](EntryResponseContentOfModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="updateModelContentUsingPUT"></a>
# **updateModelContentUsingPUT**
> updateModelContentUsingPUT(modelId, file)

Update model content

Update the content of the model from file.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String modelId = "modelId_example"; // String | The id of the model to update
File file = new File("file_example"); // File | 
try {
    apiInstance.updateModelContentUsingPUT(modelId, file);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#updateModelContentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| The id of the model to update |
 **file** | **File**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="updateModelUsingPUT"></a>
# **updateModelUsingPUT**
> EntryResponseContentOfModel updateModelUsingPUT(modelId, body)

Update model metadata

Update the details of a model.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String modelId = "modelId_example"; // String | The id of the model to update
ModelReq body = new ModelReq(); // ModelReq | 
try {
    EntryResponseContentOfModel result = apiInstance.updateModelUsingPUT(modelId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#updateModelUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| The id of the model to update |
 **body** | [**ModelReq**](ModelReq.md)|  | [optional]

### Return type

[**EntryResponseContentOfModel**](EntryResponseContentOfModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

<a name="validateModelExtensionsUsingPOST"></a>
# **validateModelExtensionsUsingPOST**
> validateModelExtensionsUsingPOST(modelId, body, projectId)

Validate model extensions

Allows to validate the model extensions without save them.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String modelId = "modelId_example"; // String | The id of the model to validate the content for
Object body = null; // Object | 
String projectId = "projectId_example"; // String | The id of the project in whose context the model is going to be validated
try {
    apiInstance.validateModelExtensionsUsingPOST(modelId, body, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#validateModelExtensionsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| The id of the model to validate the content for |
 **body** | **Object**|  | [optional]
 **projectId** | **String**| The id of the project in whose context the model is going to be validated | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: Not defined

<a name="validateModelUsingPOST"></a>
# **validateModelUsingPOST**
> validateModelUsingPOST(modelId, body, projectId, validateUsage)

Validate a model content

Allows to validate the model content without save it.

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ModelsApi;


ModelsApi apiInstance = new ModelsApi();
String modelId = "modelId_example"; // String | The id of the model to validate the content for
Object body = null; // Object | 
String projectId = "projectId_example"; // String | The id of the project in whose context the model is going to be validated
Boolean validateUsage = true; // Boolean | The model is going to be validated and checked used in other model
try {
    apiInstance.validateModelUsingPOST(modelId, body, projectId, validateUsage);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsApi#validateModelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| The id of the model to validate the content for |
 **body** | **Object**|  | [optional]
 **projectId** | **String**| The id of the project in whose context the model is going to be validated | [optional]
 **validateUsage** | **Boolean**| The model is going to be validated and checked used in other model | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: Not defined

