# SecuredNodesApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSecuringMarks**](SecuredNodesApi.md#getSecuringMarks) | **GET** /secured-nodes/{nodeId}/securing-marks | List all security marks assigned to a node.
[**updateSecuringMarks**](SecuredNodesApi.md#updateSecuringMarks) | **POST** /secured-nodes/{nodeId}/securing-marks | Manage the existing security marks for a node


<a name="getSecuringMarks"></a>
# **getSecuringMarks**
> SecuringMarksPaging getSecuringMarks(nodeId, skipCount, maxItems)

List all security marks assigned to a node.

List all the existing security marks assigned to a node with id **nodeId**.  **Note:** The control of the list size using pagination is currently not supported. 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.SecuredNodesApi;








SecuredNodesApi apiInstance = new SecuredNodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
Integer skipCount = 56; // Integer | The number of entities that exist in the collection before those included in this list.
Integer maxItems = 56; // Integer | The maximum number of items to return in the list.
try {
    SecuringMarksPaging result = apiInstance.getSecuringMarks(nodeId, skipCount, maxItems);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuredNodesApi#getSecuringMarks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. | [optional]
 **maxItems** | **Integer**| The maximum number of items to return in the list. | [optional]

### Return type

[**SecuringMarksPaging**](SecuringMarksPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSecuringMarks"></a>
# **updateSecuringMarks**
> SecuringMarksPaging updateSecuringMarks(nodeId, securityMarksUpdates)

Manage the existing security marks for a node

Manage the list of existing security marks for a node with id **nodeId**.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.SecuredNodesApi;








SecuredNodesApi apiInstance = new SecuredNodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
SecuringMarksUpdateBody securityMarksUpdates = new SecuringMarksUpdateBody(); // SecuringMarksUpdateBody | The list of security marks updates.
try {
    SecuringMarksPaging result = apiInstance.updateSecuringMarks(nodeId, securityMarksUpdates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuredNodesApi#updateSecuringMarks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **securityMarksUpdates** | [**SecuringMarksUpdateBody**](SecuringMarksUpdateBody.md)| The list of security marks updates. |

### Return type

[**SecuringMarksPaging**](SecuringMarksPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

