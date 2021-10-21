# DecisionTablesApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDecisionTableEditorJsonUsingGET**](DecisionTablesApi.md#getDecisionTableEditorJsonUsingGET) | **GET** /activiti-app/api/enterprise/decisions/decision-tables/{decisionTableId}/editorJson | Get definition for a decision table
[**getDecisionTableUsingGET**](DecisionTablesApi.md#getDecisionTableUsingGET) | **GET** /activiti-app/api/enterprise/decisions/decision-tables/{decisionTableId} | Get a decision table
[**getDecisionTablesUsingGET**](DecisionTablesApi.md#getDecisionTablesUsingGET) | **GET** /activiti-app/api/enterprise/decisions/decision-tables | Query decision tables

<a name="getDecisionTableEditorJsonUsingGET"></a>
# **getDecisionTableEditorJsonUsingGET**
> JsonNode getDecisionTableEditorJsonUsingGET(decisionTableId)

Get definition for a decision table

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.DecisionTablesApi;







DecisionTablesApi apiInstance = new DecisionTablesApi();
Long decisionTableId = 789L; // Long | decisionTableId
try {
    JsonNode result = apiInstance.getDecisionTableEditorJsonUsingGET(decisionTableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTablesApi#getDecisionTableEditorJsonUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTableId** | **Long**| decisionTableId |

### Return type

[**JsonNode**](JsonNode.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDecisionTableUsingGET"></a>
# **getDecisionTableUsingGET**
> RuntimeDecisionTableRepresentation getDecisionTableUsingGET(decisionTableId)

Get a decision table

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.DecisionTablesApi;







DecisionTablesApi apiInstance = new DecisionTablesApi();
Long decisionTableId = 789L; // Long | decisionTableId
try {
    RuntimeDecisionTableRepresentation result = apiInstance.getDecisionTableUsingGET(decisionTableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTablesApi#getDecisionTableUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionTableId** | **Long**| decisionTableId |

### Return type

[**RuntimeDecisionTableRepresentation**](RuntimeDecisionTableRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDecisionTablesUsingGET"></a>
# **getDecisionTablesUsingGET**
> ResultListDataRepresentationRuntimeDecisionTableRepresentation getDecisionTablesUsingGET(nameLike, keyLike, tenantIdLike, deploymentId, sort, order, start, size)

Query decision tables

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.DecisionTablesApi;







DecisionTablesApi apiInstance = new DecisionTablesApi();
String nameLike = "nameLike_example"; // String | nameLike
String keyLike = "keyLike_example"; // String | keyLike
String tenantIdLike = "tenantIdLike_example"; // String | tenantIdLike
Long deploymentId = 789L; // Long | deploymentId
String sort = "sort_example"; // String | sort
String order = "order_example"; // String | order
Integer start = 56; // Integer | start
Integer size = 56; // Integer | size
try {
    ResultListDataRepresentationRuntimeDecisionTableRepresentation result = apiInstance.getDecisionTablesUsingGET(nameLike, keyLike, tenantIdLike, deploymentId, sort, order, start, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionTablesApi#getDecisionTablesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nameLike** | **String**| nameLike | [optional]
 **keyLike** | **String**| keyLike | [optional]
 **tenantIdLike** | **String**| tenantIdLike | [optional]
 **deploymentId** | **Long**| deploymentId | [optional]
 **sort** | **String**| sort | [optional]
 **order** | **String**| order | [optional]
 **start** | **Integer**| start | [optional]
 **size** | **Integer**| size | [optional]

### Return type

[**ResultListDataRepresentationRuntimeDecisionTableRepresentation**](ResultListDataRepresentationRuntimeDecisionTableRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

