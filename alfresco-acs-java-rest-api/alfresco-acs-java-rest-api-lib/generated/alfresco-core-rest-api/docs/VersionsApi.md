# VersionsApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVersionRendition**](VersionsApi.md#createVersionRendition) | **POST** /nodes/{nodeId}/versions/{versionId}/renditions | Create rendition for a file version
[**deleteVersion**](VersionsApi.md#deleteVersion) | **DELETE** /nodes/{nodeId}/versions/{versionId} | Delete a version
[**getVersion**](VersionsApi.md#getVersion) | **GET** /nodes/{nodeId}/versions/{versionId} | Get version information
[**getVersionContent**](VersionsApi.md#getVersionContent) | **GET** /nodes/{nodeId}/versions/{versionId}/content | Get version content
[**getVersionRendition**](VersionsApi.md#getVersionRendition) | **GET** /nodes/{nodeId}/versions/{versionId}/renditions/{renditionId} | Get rendition information for a file version
[**getVersionRenditionContent**](VersionsApi.md#getVersionRenditionContent) | **GET** /nodes/{nodeId}/versions/{versionId}/renditions/{renditionId}/content | Get rendition content for a file version
[**listVersionHistory**](VersionsApi.md#listVersionHistory) | **GET** /nodes/{nodeId}/versions | List version history
[**listVersionRenditions**](VersionsApi.md#listVersionRenditions) | **GET** /nodes/{nodeId}/versions/{versionId}/renditions | List renditions for a file version
[**revertVersion**](VersionsApi.md#revertVersion) | **POST** /nodes/{nodeId}/versions/{versionId}/revert | Revert a version


<a name="createVersionRendition"></a>
# **createVersionRendition**
> createVersionRendition(nodeId, versionId, renditionBodyCreate)

Create rendition for a file version

**Note:** this endpoint is available in Alfresco 7.0.0 and newer versions.  An asynchronous request to create a rendition for version of file **nodeId** and **versionId**.  The version rendition is specified by name **id** in the request body: &#x60;&#x60;&#x60;JSON {   \&quot;id\&quot;:\&quot;doclib\&quot; } &#x60;&#x60;&#x60;   Multiple names may be specified as a comma separated list or using a list format: &#x60;&#x60;&#x60;JSON [   {       \&quot;id\&quot;: \&quot;doclib\&quot;   },   {       \&quot;id\&quot;: \&quot;avatar\&quot;   } ] &#x60;&#x60;&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **versionId** | **String**| The identifier of a version, ie. version label, within the version history of a node. |
 **renditionBodyCreate** | [**RenditionBodyCreate**](RenditionBodyCreate.md)| The rendition \&quot;id\&quot;. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVersion"></a>
# **deleteVersion**
> deleteVersion(nodeId, versionId)

Delete a version

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Delete the version identified by **versionId** and **nodeId*.  If the version is successfully deleted then the content and metadata for that versioned node will be deleted and will no longer appear in the version history. This operation cannot be undone.  If the most recent version is deleted the live node will revert to the next most recent version.  We currently do not allow the last version to be deleted. If you wish to clear the history then you can remove the \&quot;cm:versionable\&quot; aspect (via update node) which will also disable versioning. In this case, you can re-enable versioning by adding back the \&quot;cm:versionable\&quot; aspect or using the version params (majorVersion and comment) on a subsequent file content update. 

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

<a name="getVersionRendition"></a>
# **getVersionRendition**
> RenditionEntry getVersionRendition(nodeId, versionId, renditionId)

Get rendition information for a file version

**Note:** this endpoint is available in Alfresco 7.0.0 and newer versions.  Gets the rendition information for **renditionId** of version of file **nodeId** and **versionId**. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **versionId** | **String**| The identifier of a version, ie. version label, within the version history of a node. |
 **renditionId** | **String**| The name of a thumbnail rendition, for example *doclib*, or *pdf*. |

### Return type

[**RenditionEntry**](RenditionEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionRenditionContent"></a>
# **getVersionRenditionContent**
> File getVersionRenditionContent(nodeId, versionId, renditionId, attachment, ifModifiedSince, range, placeholder)

Get rendition content for a file version

**Note:** this endpoint is available in Alfresco 7.0.0 and newer versions.  Gets the rendition content for **renditionId** of version of file **nodeId** and **versionId**. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **versionId** | **String**| The identifier of a version, ie. version label, within the version history of a node. |
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

<a name="listVersionHistory"></a>
# **listVersionHistory**
> VersionPaging listVersionHistory(nodeId, include, fields, skipCount, maxItems)

List version history

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the version history as an ordered list of versions for the specified **nodeId**.  The list is ordered in descending modified order. So the most recent version is first and the original version is last in the list. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the version node. The following optional fields can be requested: * properties * aspectNames  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100]

### Return type

[**VersionPaging**](VersionPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listVersionRenditions"></a>
# **listVersionRenditions**
> RenditionPaging listVersionRenditions(nodeId, versionId, where)

List renditions for a file version

**Note:** this endpoint is available in Alfresco 7.0.0 and newer versions.  Gets a list of the rendition information for each rendition of the version of file **nodeId** and **versionId**, including the rendition id.  Each rendition returned has a **status**: CREATED means it is available to view or download, NOT_CREATED means the rendition can be requested.  You can use the **where** parameter to filter the returned renditions by **status**. For example, the following **where** clause will return just the CREATED renditions:  &#x60;&#x60;&#x60; (status&#x3D;&#39;CREATED&#39;) &#x60;&#x60;&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **versionId** | **String**| The identifier of a version, ie. version label, within the version history of a node. |
 **where** | **String**| A string to restrict the returned objects by using a predicate. | [optional]

### Return type

[**RenditionPaging**](RenditionPaging.md)

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

