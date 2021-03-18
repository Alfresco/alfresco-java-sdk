# TrashcanApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDeletedNode**](TrashcanApi.md#deleteDeletedNode) | **DELETE** /deleted-nodes/{nodeId} | Permanently delete a deleted node
[**getArchivedNodeRendition**](TrashcanApi.md#getArchivedNodeRendition) | **GET** /deleted-nodes/{nodeId}/renditions/{renditionId} | Get rendition information for a deleted node
[**getArchivedNodeRenditionContent**](TrashcanApi.md#getArchivedNodeRenditionContent) | **GET** /deleted-nodes/{nodeId}/renditions/{renditionId}/content | Get rendition content of a deleted node
[**getDeletedNode**](TrashcanApi.md#getDeletedNode) | **GET** /deleted-nodes/{nodeId} | Get a deleted node
[**getDeletedNodeContent**](TrashcanApi.md#getDeletedNodeContent) | **GET** /deleted-nodes/{nodeId}/content | Get deleted node content
[**listDeletedNodeRenditions**](TrashcanApi.md#listDeletedNodeRenditions) | **GET** /deleted-nodes/{nodeId}/renditions | List renditions for a deleted node
[**listDeletedNodes**](TrashcanApi.md#listDeletedNodes) | **GET** /deleted-nodes | List deleted nodes
[**restoreDeletedNode**](TrashcanApi.md#restoreDeletedNode) | **POST** /deleted-nodes/{nodeId}/restore | Restore a deleted node


<a name="deleteDeletedNode"></a>
# **deleteDeletedNode**
> deleteDeletedNode(nodeId)

Permanently delete a deleted node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Permanently deletes the deleted node **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.TrashcanApi;








TrashcanApi apiInstance = new TrashcanApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
try {
    apiInstance.deleteDeletedNode(nodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashcanApi#deleteDeletedNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getArchivedNodeRendition"></a>
# **getArchivedNodeRendition**
> RenditionEntry getArchivedNodeRendition(nodeId, renditionId)

Get rendition information for a deleted node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the rendition information for **renditionId** of file **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.TrashcanApi;








TrashcanApi apiInstance = new TrashcanApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String renditionId = "renditionId_example"; // String | The name of a thumbnail rendition, for example *doclib*, or *pdf*.
try {
    RenditionEntry result = apiInstance.getArchivedNodeRendition(nodeId, renditionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashcanApi#getArchivedNodeRendition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **renditionId** | **String**| The name of a thumbnail rendition, for example *doclib*, or *pdf*. |

### Return type

[**RenditionEntry**](RenditionEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getArchivedNodeRenditionContent"></a>
# **getArchivedNodeRenditionContent**
> File getArchivedNodeRenditionContent(nodeId, renditionId, attachment, ifModifiedSince, range, placeholder)

Get rendition content of a deleted node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the rendition content for **renditionId** of file **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.TrashcanApi;








TrashcanApi apiInstance = new TrashcanApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String renditionId = "renditionId_example"; // String | The name of a thumbnail rendition, for example *doclib*, or *pdf*.
Boolean attachment = true; // Boolean | **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response. 
OffsetDateTime ifModifiedSince = OffsetDateTime.now(); // OffsetDateTime | Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, `Wed, 09 Mar 2016 16:56:34 GMT`. 
String range = "range_example"; // String | The Range header indicates the part of a document that the server should return. Single part request supported, for example: bytes=1-10. 
Boolean placeholder = false; // Boolean | If **true** and there is no rendition for this **nodeId** and **renditionId**, then the placeholder image for the mime type of this rendition is returned, rather than a 404 response. 
try {
    File result = apiInstance.getArchivedNodeRenditionContent(nodeId, renditionId, attachment, ifModifiedSince, range, placeholder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashcanApi#getArchivedNodeRenditionContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **renditionId** | **String**| The name of a thumbnail rendition, for example *doclib*, or *pdf*. |
 **attachment** | **Boolean**| **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response.  | [optional] [default to true]
 **ifModifiedSince** | **OffsetDateTime**| Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, &#x60;Wed, 09 Mar 2016 16:56:34 GMT&#x60;.  | [optional]
 **range** | **String**| The Range header indicates the part of a document that the server should return. Single part request supported, for example: bytes&#x3D;1-10.  | [optional]
 **placeholder** | **Boolean**| If **true** and there is no rendition for this **nodeId** and **renditionId**, then the placeholder image for the mime type of this rendition is returned, rather than a 404 response.  | [optional] [default to false]

### Return type

[**File**](File.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="getDeletedNode"></a>
# **getDeletedNode**
> DeletedNodeEntry getDeletedNode(nodeId, include)

Get a deleted node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the specific deleted node **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.TrashcanApi;








TrashcanApi apiInstance = new TrashcanApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions * definition 
try {
    DeletedNodeEntry result = apiInstance.getDeletedNode(nodeId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashcanApi#getDeletedNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions * definition  | [optional]

### Return type

[**DeletedNodeEntry**](DeletedNodeEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeletedNodeContent"></a>
# **getDeletedNodeContent**
> File getDeletedNodeContent(nodeId, attachment, ifModifiedSince, range)

Get deleted node content

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the content of the deleted node with identifier **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.TrashcanApi;








TrashcanApi apiInstance = new TrashcanApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
Boolean attachment = true; // Boolean | **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response. 
OffsetDateTime ifModifiedSince = OffsetDateTime.now(); // OffsetDateTime | Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, `Wed, 09 Mar 2016 16:56:34 GMT`. 
String range = "range_example"; // String | The Range header indicates the part of a document that the server should return. Single part request supported, for example: bytes=1-10. 
try {
    File result = apiInstance.getDeletedNodeContent(nodeId, attachment, ifModifiedSince, range);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashcanApi#getDeletedNodeContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **attachment** | **Boolean**| **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response.  | [optional] [default to true]
 **ifModifiedSince** | **OffsetDateTime**| Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, &#x60;Wed, 09 Mar 2016 16:56:34 GMT&#x60;.  | [optional]
 **range** | **String**| The Range header indicates the part of a document that the server should return. Single part request supported, for example: bytes&#x3D;1-10.  | [optional]

### Return type

[**File**](File.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="listDeletedNodeRenditions"></a>
# **listDeletedNodeRenditions**
> RenditionPaging listDeletedNodeRenditions(nodeId, where)

List renditions for a deleted node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of the rendition information for each rendition of the file **nodeId**, including the rendition id.  Each rendition returned has a **status**: CREATED means it is available to view or download, NOT_CREATED means the rendition can be requested.  You can use the **where** parameter to filter the returned renditions by **status**. For example, the following **where** clause will return just the CREATED renditions:  &#x60;&#x60;&#x60; (status&#x3D;&#39;CREATED&#39;) &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.TrashcanApi;








TrashcanApi apiInstance = new TrashcanApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String where = "where_example"; // String | A string to restrict the returned objects by using a predicate.
try {
    RenditionPaging result = apiInstance.listDeletedNodeRenditions(nodeId, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashcanApi#listDeletedNodeRenditions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **where** | **String**| A string to restrict the returned objects by using a predicate. | [optional]

### Return type

[**RenditionPaging**](RenditionPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listDeletedNodes"></a>
# **listDeletedNodes**
> DeletedNodesPaging listDeletedNodes(skipCount, maxItems, include)

List deleted nodes

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of deleted nodes for the current user.  If the current user is an administrator deleted nodes for all users will be returned.  The list of deleted nodes will be ordered with the most recently deleted node at the top of the list. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.TrashcanApi;








TrashcanApi apiInstance = new TrashcanApi();
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * association * isLink * isFavorite * isLocked * path * properties * permissions 
try {
    DeletedNodesPaging result = apiInstance.listDeletedNodes(skipCount, maxItems, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashcanApi#listDeletedNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * association * isLink * isFavorite * isLocked * path * properties * permissions  | [optional]

### Return type

[**DeletedNodesPaging**](DeletedNodesPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="restoreDeletedNode"></a>
# **restoreDeletedNode**
> NodeEntry restoreDeletedNode(nodeId, fields, deletedNodeBodyRestore)

Restore a deleted node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Attempts to restore the deleted node **nodeId** to its original location or to a new location.  If the node is successfully restored to its former primary parent, then only the primary child association will be restored, including recursively for any primary children. It should be noted that no other secondary child associations or peer associations will be restored, for any of the nodes within the primary parent-child hierarchy of restored nodes, irrespective of whether these associations were to nodes within or outside of the restored hierarchy.  Also, any previously shared link will not be restored since it is deleted at the time of delete of each node. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.TrashcanApi;








TrashcanApi apiInstance = new TrashcanApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
DeletedNodeBodyRestore deletedNodeBodyRestore = new DeletedNodeBodyRestore(); // DeletedNodeBodyRestore | The targetParentId if the node is restored to a new location.
try {
    NodeEntry result = apiInstance.restoreDeletedNode(nodeId, fields, deletedNodeBodyRestore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashcanApi#restoreDeletedNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]
 **deletedNodeBodyRestore** | [**DeletedNodeBodyRestore**](DeletedNodeBodyRestore.md)| The targetParentId if the node is restored to a new location. | [optional]

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

