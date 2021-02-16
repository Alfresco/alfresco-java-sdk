# DecisionTableModelsApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportDecisionTableUsingGET**](DecisionTableModelsApi.md#exportDecisionTableUsingGET) | **GET** /enterprise/editor/decision-table-models/{decisionTableId}/export | Export decision table model.
[**exportHistoricDecisionTableUsingGET**](DecisionTableModelsApi.md#exportHistoricDecisionTableUsingGET) | **GET** /enterprise/editor/decision-table-models/history/{historyModelId}/export | Export specific version for decision table model.
[**getDecisionTableUsingGET1**](DecisionTableModelsApi.md#getDecisionTableUsingGET1) | **GET** /enterprise/editor/decision-table-models/{decisionTableId} | Get a decision table model by id.
[**getDecisionTablesUsingGET1**](DecisionTableModelsApi.md#getDecisionTablesUsingGET1) | **GET** /enterprise/editor/decision-table-models/values | Get a specific list of decision table models (with decision table definition) by their ids.
[**getDecisionTablesUsingGET2**](DecisionTableModelsApi.md#getDecisionTablesUsingGET2) | **GET** /enterprise/editor/decision-table-models | Get a list of decision table models (without decision table definition).
[**getHistoricDecisionTableUsingGET**](DecisionTableModelsApi.md#getHistoricDecisionTableUsingGET) | **GET** /enterprise/editor/decision-table-models/history/{historyModelId} | Get specific version of a decision table model by id.
[**importDecisionTableTextUsingPOST**](DecisionTableModelsApi.md#importDecisionTableTextUsingPOST) | **POST** /enterprise/editor/decision-table-models/import-decision-table-text | Import decision table. This method return the decision table representation response as plain text.
[**importDecisionTableUsingPOST**](DecisionTableModelsApi.md#importDecisionTableUsingPOST) | **POST** /enterprise/editor/decision-table-models/import-decision-table | Import decision table model.
[**saveDecisionTableUsingPUT**](DecisionTableModelsApi.md#saveDecisionTableUsingPUT) | **PUT** /enterprise/editor/decision-table-models/{decisionTableId} | Update decision table model.
[**validateModelUsingPUT**](DecisionTableModelsApi.md#validateModelUsingPUT) | **PUT** /enterprise/editor/decision-table-models/{decisionTableId}/validate | Validate decision table model.


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

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDecisionTablesUsingGET1"></a>
# **getDecisionTablesUsingGET1**
> List&lt;DecisionTableRepresentation&gt; getDecisionTablesUsingGET1(decisionTableId)

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
List<String> decisionTableId = Arrays.asList("decisionTableId_example"); // List<String> | The id of the decision table. This id can be specified multiple times in the request for each decision table model id wanted to be returned.
try {
    List<DecisionTableRepresentation> result = apiInstance.getDecisionTablesUsingGET1(decisionTableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#getDecisionTablesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTableId** | [**List&lt;String&gt;**](String.md)| The id of the decision table. This id can be specified multiple times in the request for each decision table model id wanted to be returned. |

### Return type

[**List&lt;DecisionTableRepresentation&gt;**](DecisionTableRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDecisionTablesUsingGET2"></a>
# **getDecisionTablesUsingGET2**
> ResultListDataRepresentationDecisionTableRepresentation getDecisionTablesUsingGET2(referenceId, filter)

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
    ResultListDataRepresentationDecisionTableRepresentation result = apiInstance.getDecisionTablesUsingGET2(referenceId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#getDecisionTablesUsingGET2");
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

 - **Content-Type**: application/json
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importDecisionTableTextUsingPOST"></a>
# **importDecisionTableTextUsingPOST**
> String importDecisionTableTextUsingPOST(file)

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
File file = new File("/path/to/file.txt"); // File | Decision table definition file.
try {
    String result = apiInstance.importDecisionTableTextUsingPOST(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#importDecisionTableTextUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| Decision table definition file. | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="importDecisionTableUsingPOST"></a>
# **importDecisionTableUsingPOST**
> ModelRepresentation importDecisionTableUsingPOST(file)

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
File file = new File("/path/to/file.txt"); // File | Decision table definition file.
try {
    ModelRepresentation result = apiInstance.importDecisionTableUsingPOST(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTableModelsApi#importDecisionTableUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| Decision table definition file. | [optional]

### Return type

[**ModelRepresentation**](ModelRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="saveDecisionTableUsingPUT"></a>
# **saveDecisionTableUsingPUT**
> DecisionTableRepresentation saveDecisionTableUsingPUT(decisionTableId, file)

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
DecisionTableSaveRepresentation file = new DecisionTableSaveRepresentation(); // DecisionTableSaveRepresentation | Decision table definition.
try {
    DecisionTableRepresentation result = apiInstance.saveDecisionTableUsingPUT(decisionTableId, file);
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
 **file** | [**DecisionTableSaveRepresentation**](DecisionTableSaveRepresentation.md)| Decision table definition. | [optional]

### Return type

[**DecisionTableRepresentation**](DecisionTableRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateModelUsingPUT"></a>
# **validateModelUsingPUT**
> List&lt;ValidationErrorRepresentation&gt; validateModelUsingPUT(decisionTableId, file)

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
DecisionTableSaveRepresentation file = new DecisionTableSaveRepresentation(); // DecisionTableSaveRepresentation | Decision table definition.
try {
    List<ValidationErrorRepresentation> result = apiInstance.validateModelUsingPUT(decisionTableId, file);
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
 **file** | [**DecisionTableSaveRepresentation**](DecisionTableSaveRepresentation.md)| Decision table definition. | [optional]

### Return type

[**List&lt;ValidationErrorRepresentation&gt;**](ValidationErrorRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

