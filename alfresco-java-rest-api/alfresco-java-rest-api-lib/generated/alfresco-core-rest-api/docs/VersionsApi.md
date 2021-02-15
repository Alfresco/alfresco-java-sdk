# VersionsApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteVersion**](VersionsApi.md#deleteVersion) | **DELETE** /nodes/{nodeId}/versions/{versionId} | Delete a version
[**getVersion**](VersionsApi.md#getVersion) | **GET** /nodes/{nodeId}/versions/{versionId} | Get version information
[**getVersionContent**](VersionsApi.md#getVersionContent) | **GET** /nodes/{nodeId}/versions/{versionId}/content | Get version content
[**listVersionHistory**](VersionsApi.md#listVersionHistory) | **GET** /nodes/{nodeId}/versions | List version history
[**revertVersion**](VersionsApi.md#revertVersion) | **POST** /nodes/{nodeId}/versions/{versionId}/revert | Revert a version


<a name="deleteVersion"></a>
# **deleteVersion**
> deleteVersion(nodeId, versionId)

Delete a version

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Delete the version identified by **versionId** and **nodeId*.  If the version is successfully deleted then the content and metadata for that versioned node will be deleted and will no longer appear in the version history. This operation cannot be undone.  If the most recent version is deleted the live node will revert to the next most recent version.  We currently do not allow the last version to be deleted. If you wish to clear the history then you can remove the \&quot;cm:versionable\&quot; aspect (via update node) which will also disable versioning. In this case, you can re-enable versioning by adding back the \&quot;cm:versionable\&quot; aspect or using the version  params (majorVersion and comment) on a subsequent file content update. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.VersionsApi;








VersionsApi apiInstance = new VersionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String versionId = "versionId_example"; // String | The identifier of a version, ie. version label, within the version history of a node.
try {
    apiInstance.deleteVersion(nodeId, versionId);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#deleteVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **versionId** | **String**| The identifier of a version, ie. version label, within the version history of a node. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersion"></a>
# **getVersion**
> VersionEntry getVersion(nodeId, versionId)

Get version information

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the version information for **versionId** of file node **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.VersionsApi;








VersionsApi apiInstance = new VersionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String versionId = "versionId_example"; // String | The identifier of a version, ie. version label, within the version history of a node.
try {
    VersionEntry result = apiInstance.getVersion(nodeId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#getVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **versionId** | **String**| The identifier of a version, ie. version label, within the version history of a node. |

### Return type

[**VersionEntry**](VersionEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionContent"></a>
# **getVersionContent**
> File getVersionContent(nodeId, versionId, attachment, ifModifiedSince, range)

Get version content

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the version content for **versionId** of file node **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.VersionsApi;








VersionsApi apiInstance = new VersionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String versionId = "versionId_example"; // String | The identifier of a version, ie. version label, within the version history of a node.
Boolean attachment = true; // Boolean | **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response. 
OffsetDateTime ifModifiedSince = OffsetDateTime.now(); // OffsetDateTime | Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, `Wed, 09 Mar 2016 16:56:34 GMT`. 
String range = "range_example"; // String | The Range header indicates the part of a document that the server should return. Single part request supported, for example: bytes=1-10. 
try {
    File result = apiInstance.getVersionContent(nodeId, versionId, attachment, ifModifiedSince, range);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#getVersionContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **versionId** | **String**| The identifier of a version, ie. version label, within the version history of a node. |
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

<a name="listVersionHistory"></a>
# **listVersionHistory**
> VersionPaging listVersionHistory(nodeId, include, fields, skipCount, maxItems)

List version history

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the version history as an ordered list of versions for the specified **nodeId**.  The list is ordered in descending modified order. So the most recent version is first and  the original version is last in the list.  

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.VersionsApi;








VersionsApi apiInstance = new VersionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the version node. The following optional fields can be requested: * properties * aspectNames 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list.  If not supplied then the default value is 100. 
try {
    VersionPaging result = apiInstance.listVersionHistory(nodeId, include, fields, skipCount, maxItems);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#listVersionHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the version node. The following optional fields can be requested: * properties * aspectNames  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list.  If not supplied then the default value is 100.  | [optional] [default to 100]

### Return type

[**VersionPaging**](VersionPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="revertVersion"></a>
# **revertVersion**
> VersionEntry revertVersion(nodeId, versionId, revertBody, fields)

Revert a version

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Attempts to revert the version identified by **versionId** and **nodeId** to the live node.  If the node is successfully reverted then the content and metadata for that versioned node will be promoted to the live node and a new version will appear in the version history. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.VersionsApi;








VersionsApi apiInstance = new VersionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String versionId = "versionId_example"; // String | The identifier of a version, ie. version label, within the version history of a node.
RevertBody revertBody = new RevertBody(); // RevertBody | Optionally, specify a version comment and whether this should be a major version, or not.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    VersionEntry result = apiInstance.revertVersion(nodeId, versionId, revertBody, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VersionsApi#revertVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **versionId** | **String**| The identifier of a version, ie. version label, within the version history of a node. |
 **revertBody** | [**RevertBody**](RevertBody.md)| Optionally, specify a version comment and whether this should be a major version, or not. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**VersionEntry**](VersionEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

