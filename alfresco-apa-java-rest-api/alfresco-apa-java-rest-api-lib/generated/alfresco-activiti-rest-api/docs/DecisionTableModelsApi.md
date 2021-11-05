# DecisionTableModelsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportDecisionTableUsingGET**](DecisionTableModelsApi.md#exportDecisionTableUsingGET) | **GET** /activiti-app/api/enterprise/editor/decision-table-models/{decisionTableId}/export | Export decision table model.
[**exportHistoricDecisionTableUsingGET**](DecisionTableModelsApi.md#exportHistoricDecisionTableUsingGET) | **GET** /activiti-app/api/enterprise/editor/decision-table-models/history/{historyModelId}/export | Export specific version for decision table model.
[**getDecisionTableUsingGET1**](DecisionTableModelsApi.md#getDecisionTableUsingGET1) | **GET** /activiti-app/api/enterprise/editor/decision-table-models/{decisionTableId} | Get a decision table model by id.
[**getDecisionTablesUsingGET1**](DecisionTableModelsApi.md#getDecisionTablesUsingGET1) | **GET** /activiti-app/api/enterprise/editor/decision-table-models | Get a list of decision table models (without decision table definition).
[**getDecisionTablesUsingGET2**](DecisionTableModelsApi.md#getDecisionTablesUsingGET2) | **GET** /activiti-app/api/enterprise/editor/decision-table-models/values | Get a specific list of decision table models (with decision table definition) by their ids.
[**getHistoricDecisionTableUsingGET**](DecisionTableModelsApi.md#getHistoricDecisionTableUsingGET) | **GET** /activiti-app/api/enterprise/editor/decision-table-models/history/{historyModelId} | Get specific version of a decision table model by id.
[**importDecisionTableTextUsingPOST**](DecisionTableModelsApi.md#importDecisionTableTextUsingPOST) | **POST** /activiti-app/api/enterprise/editor/decision-table-models/import-decision-table-text | Import decision table. This method return the decision table representation response as plain text.
[**importDecisionTableUsingPOST**](DecisionTableModelsApi.md#importDecisionTableUsingPOST) | **POST** /activiti-app/api/enterprise/editor/decision-table-models/import-decision-table | Import decision table model.
[**saveDecisionTableUsingPUT**](DecisionTableModelsApi.md#saveDecisionTableUsingPUT) | **PUT** /activiti-app/api/enterprise/editor/decision-table-models/{decisionTableId} | Update decision table model.
[**validateModelUsingPUT**](DecisionTableModelsApi.md#validateModelUsingPUT) | **PUT** /activiti-app/api/enterprise/editor/decision-table-models/{decisionTableId}/validate | Validate decision table model.

<a name="exportDecisionTableUsingGET"></a>
# **exportDecisionTableUsingGET**
> exportDecisionTableUsingGET(decisionTableId)

Export decision table model.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DecisionTableModelsApi;







DecisionTableModelsApi apiInstance = new DecisionTableModelsApi();
Long decisionTableId = 789L; // Long | Decision table id.
try {
    apiInstance.exportDecisionTableUsingGET(decisionTableId);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#exportDecisionTableUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTableId** | **Long**| Decision table id. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="exportHistoricDecisionTableUsingGET"></a>
# **exportHistoricDecisionTableUsingGET**
> exportHistoricDecisionTableUsingGET(historyModelId)

Export specific version for decision table model.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DecisionTableModelsApi;







DecisionTableModelsApi apiInstance = new DecisionTableModelsApi();
Long historyModelId = 789L; // Long | Id of another version of same decision table model.
try {
    apiInstance.exportHistoricDecisionTableUsingGET(historyModelId);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#exportHistoricDecisionTableUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **historyModelId** | **Long**| Id of another version of same decision table model. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDecisionTableUsingGET1"></a>
# **getDecisionTableUsingGET1**
> DecisionTableRepresentation getDecisionTableUsingGET1(decisionTableId)

Get a decision table model by id.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DecisionTableModelsApi;







DecisionTableModelsApi apiInstance = new DecisionTableModelsApi();
Long decisionTableId = 789L; // Long | Decision table id.
try {
    DecisionTableRepresentation result = apiInstance.getDecisionTableUsingGET1(decisionTableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#getDecisionTableUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTableId** | **Long**| Decision table id. |

### Return type

[**DecisionTableRepresentation**](DecisionTableRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDecisionTablesUsingGET1"></a>
# **getDecisionTablesUsingGET1**
> ResultListDataRepresentationDecisionTableRepresentation getDecisionTablesUsingGET1(referenceId, filter)

Get a list of decision table models (without decision table definition).

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DecisionTableModelsApi;







DecisionTableModelsApi apiInstance = new DecisionTableModelsApi();
Long referenceId = 789L; // Long | A reference to another model (ie. a process) associated with one or more decision table models.
String filter = "filter_example"; // String | Filter (search for a specified pattern) the decision tables associated with another model (i.e. a process) by name or description.
try {
    ResultListDataRepresentationDecisionTableRepresentation result = apiInstance.getDecisionTablesUsingGET1(referenceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#getDecisionTablesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceId** | **Long**| A reference to another model (ie. a process) associated with one or more decision table models. | [optional]
 **filter** | **String**| Filter (search for a specified pattern) the decision tables associated with another model (i.e. a process) by name or description. | [optional]

### Return type

[**ResultListDataRepresentationDecisionTableRepresentation**](ResultListDataRepresentationDecisionTableRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDecisionTablesUsingGET2"></a>
# **getDecisionTablesUsingGET2**
> List&lt;DecisionTableRepresentation&gt; getDecisionTablesUsingGET2(decisionTableId)

Get a specific list of decision table models (with decision table definition) by their ids.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DecisionTableModelsApi;







DecisionTableModelsApi apiInstance = new DecisionTableModelsApi();
String decisionTableId = "decisionTableId_example"; // String | The id of the decision table. This id can be specified multiple times in the request for each decision table model id wanted to be returned.
try {
    List<DecisionTableRepresentation> result = apiInstance.getDecisionTablesUsingGET2(decisionTableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#getDecisionTablesUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTableId** | **String**| The id of the decision table. This id can be specified multiple times in the request for each decision table model id wanted to be returned. |

### Return type

[**List&lt;DecisionTableRepresentation&gt;**](DecisionTableRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHistoricDecisionTableUsingGET"></a>
# **getHistoricDecisionTableUsingGET**
> DecisionTableRepresentation getHistoricDecisionTableUsingGET(historyModelId)

Get specific version of a decision table model by id.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DecisionTableModelsApi;







DecisionTableModelsApi apiInstance = new DecisionTableModelsApi();
Long historyModelId = 789L; // Long | Id of another version of same decision table model.
try {
    DecisionTableRepresentation result = apiInstance.getHistoricDecisionTableUsingGET(historyModelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#getHistoricDecisionTableUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **historyModelId** | **Long**| Id of another version of same decision table model. |

### Return type

[**DecisionTableRepresentation**](DecisionTableRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importDecisionTableTextUsingPOST"></a>
# **importDecisionTableTextUsingPOST**
> String importDecisionTableTextUsingPOST(body)

Import decision table. This method return the decision table representation response as plain text.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DecisionTableModelsApi;







DecisionTableModelsApi apiInstance = new DecisionTableModelsApi();
Object body = null; // Object | 
try {
    String result = apiInstance.importDecisionTableTextUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#importDecisionTableTextUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: application/json

<a name="importDecisionTableUsingPOST"></a>
# **importDecisionTableUsingPOST**
> ModelRepresentation importDecisionTableUsingPOST(body)

Import decision table model.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DecisionTableModelsApi;







DecisionTableModelsApi apiInstance = new DecisionTableModelsApi();
Object body = null; // Object | 
try {
    ModelRepresentation result = apiInstance.importDecisionTableUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#importDecisionTableUsingPOST");
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

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: application/json

<a name="saveDecisionTableUsingPUT"></a>
# **saveDecisionTableUsingPUT**
> DecisionTableRepresentation saveDecisionTableUsingPUT(decisionTableId, body)

Update decision table model.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DecisionTableModelsApi;







DecisionTableModelsApi apiInstance = new DecisionTableModelsApi();
Long decisionTableId = 789L; // Long | Decision table id.
DecisionTableSaveRepresentation body = new DecisionTableSaveRepresentation(); // DecisionTableSaveRepresentation | 
try {
    DecisionTableRepresentation result = apiInstance.saveDecisionTableUsingPUT(decisionTableId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#saveDecisionTableUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTableId** | **Long**| Decision table id. |
 **body** | [**DecisionTableSaveRepresentation**](DecisionTableSaveRepresentation.md)|  | [optional]

### Return type

[**DecisionTableRepresentation**](DecisionTableRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateModelUsingPUT"></a>
# **validateModelUsingPUT**
> List&lt;ValidationErrorRepresentation&gt; validateModelUsingPUT(decisionTableId, body)

Validate decision table model.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DecisionTableModelsApi;







DecisionTableModelsApi apiInstance = new DecisionTableModelsApi();
Long decisionTableId = 789L; // Long | Decision table id.
DecisionTableSaveRepresentation body = new DecisionTableSaveRepresentation(); // DecisionTableSaveRepresentation | 
try {
    List<ValidationErrorRepresentation> result = apiInstance.validateModelUsingPUT(decisionTableId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#validateModelUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTableId** | **Long**| Decision table id. |
 **body** | [**DecisionTableSaveRepresentation**](DecisionTableSaveRepresentation.md)|  | [optional]

### Return type

[**List&lt;ValidationErrorRepresentation&gt;**](ValidationErrorRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

