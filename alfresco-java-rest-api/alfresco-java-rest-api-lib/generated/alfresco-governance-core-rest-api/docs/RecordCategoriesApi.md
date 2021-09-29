# RecordCategoriesApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRecordCategoryChild**](RecordCategoriesApi.md#createRecordCategoryChild) | **POST** /record-categories/{recordCategoryId}/children | Create a record category or a record folder
[**deleteRecordCategory**](RecordCategoriesApi.md#deleteRecordCategory) | **DELETE** /record-categories/{recordCategoryId} | Delete a record category
[**getRecordCategory**](RecordCategoriesApi.md#getRecordCategory) | **GET** /record-categories/{recordCategoryId} | Get a record category
[**listRecordCategoryChildren**](RecordCategoriesApi.md#listRecordCategoryChildren) | **GET** /record-categories/{recordCategoryId}/children | List record category&#39;s children
[**updateRecordCategory**](RecordCategoriesApi.md#updateRecordCategory) | **PUT** /record-categories/{recordCategoryId} | Update a record category


<a name="createRecordCategoryChild"></a>
# **createRecordCategoryChild**
> RecordCategoryChildEntry createRecordCategoryChild(recordCategoryId, nodeBodyCreate, autoRename, include, fields)

Create a record category or a record folder

Create a record category or a record folder as a primary child of **recordCategoryId**.  You can set the **autoRename** boolean field to automatically resolve name clashes. If there is a name clash, then the API method tries to create a unique name using an integer suffix.  This API method also supports record category or record folder creation using application/json.  You must specify at least a **name** and **nodeType**.  You can create a category like this: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Record Category\&quot;,   \&quot;nodeType\&quot;:\&quot;rma:recordCategory\&quot; } &#x60;&#x60;&#x60;  You can create a record folder like this: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Record Folder\&quot;,   \&quot;nodeType\&quot;:\&quot;rma:recordFolder\&quot; } &#x60;&#x60;&#x60;  You can create a record folder inside a container hierarchy (applies to record categories as well): &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Fileplan Component\&quot;,   \&quot;nodeType\&quot;:\&quot;rma:recordFolder\&quot;,   \&quot;relativePath\&quot;:\&quot;X/Y/Z\&quot; } &#x60;&#x60;&#x60; The **relativePath** specifies the container structure to create relative to the node (record category or record folder). Containers in the **relativePath** that do not exist are created before the node is created. The container type is decided considering the type of the parent container and the type of the node to be created.  You can set properties when creating a record category (applies to record folders as well): &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Record Category\&quot;,   \&quot;nodeType\&quot;:\&quot;rma:recordCategory\&quot;,   \&quot;properties\&quot;:   {     \&quot;rma:vitalRecordIndicator\&quot;:\&quot;true\&quot;,     \&quot;rma:reviewPeriod\&quot;:\&quot;month|1\&quot;   } } &#x60;&#x60;&#x60;  Any missing aspects are applied automatically. You can set aspects explicitly, if needed, using an **aspectNames** field.  **Note:** You can create more than one child by specifying a list of nodes in the JSON body. For example, the following JSON body creates a record category and a record folder inside the specified **categoryId**: &#x60;&#x60;&#x60;JSON [   {     \&quot;name\&quot;:\&quot;My Record Category\&quot;,     \&quot;nodeType\&quot;:\&quot;rma:recordCategory\&quot;   },   {     \&quot;name\&quot;:\&quot;My Record Folder\&quot;,     \&quot;nodeType\&quot;:\&quot;rma:recordFolder\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordCategoryId** | **String**| The identifier of a record category. |
 **nodeBodyCreate** | [**RMNodeBodyCreateWithRelativePath**](RMNodeBodyCreateWithRelativePath.md)| The node information to create.  |
 **autoRename** | **Boolean**| If true, then  a name clash will cause an attempt to auto rename by finding a unique name using an integer suffix.  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the record category. Any optional field from the response model can be requested. For example: * allowableOperations * hasRetentionSchedule * path  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**RecordCategoryChildEntry**](RecordCategoryChildEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

<a name="deleteRecordCategory"></a>
# **deleteRecordCategory**
> deleteRecordCategory(recordCategoryId)

Delete a record category

Deletes record category **recordCategoryId**. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordCategoryId** | **String**| The identifier of a record category. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecordCategory"></a>
# **getRecordCategory**
> RecordCategoryEntry getRecordCategory(recordCategoryId, include, relativePath, fields)

Get a record category

Gets information for record category **recordCategoryId**  Mandatory fields and the record category&#39;s aspects and properties are returned by default.  You can use the **include** parameter (include&#x3D;allowableOperations) to return additional information. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordCategoryId** | **String**| The identifier of a record category. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the record category. Any optional field from the response model can be requested. For example: * allowableOperations * hasRetentionSchedule * path  | [optional]
 **relativePath** | **String**| Return information on children in the record category resolved by this path. The path is relative to **recordCategoryId**.  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**RecordCategoryEntry**](RecordCategoryEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listRecordCategoryChildren"></a>
# **listRecordCategoryChildren**
> RecordCategoryChildPaging listRecordCategoryChildren(recordCategoryId, skipCount, maxItems, where, include, relativePath, includeSource, fields)

List record category&#39;s children

Returns a list of record categories and/or record folders.  Minimal information for each child is returned by default.  You can use the **include** parameter (include&#x3D;allowableOperations) to return additional information.  The list of child nodes includes primary children and secondary children, if there are any. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordCategoryId** | **String**| The identifier of a record category. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. | [optional]
 **maxItems** | **Integer**| The maximum number of items to return in the list. | [optional]
 **where** | **String**| Optionally filter the list. Here are some examples:  *   &#x60;&#x60;&#x60;where&#x3D;(nodeType&#x3D;&#39;rma:recordFolder&#39;)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(nodeType&#x3D;&#39;rma:recordCategory&#39;)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(isRecordFolder&#x3D;true AND isClosed&#x3D;false)&#x60;&#x60;&#x60;  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the record category child. Any optional field from the response model can be requested. For example: * allowableOperations * aspectNames * hasRetentionSchedule * isClosed * isRecordCategory * isRecordFolder * path * properties  | [optional]
 **relativePath** | **String**| Return information on children in the record category resolved by this path. The path is relative to **recordCategoryId**.  | [optional]
 **includeSource** | **Boolean**| Also include **source** (in addition to **entries**) with folder information on the parent node – either the specified parent **recordCategoryId**, or as resolved by **relativePath**. | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**RecordCategoryChildPaging**](RecordCategoryChildPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRecordCategory"></a>
# **updateRecordCategory**
> RecordCategoryEntry updateRecordCategory(recordCategoryId, recordCategoryBodyUpdate, include, fields)

Update a record category

Updates record category **recordCategoryId**. For example, you can rename a record category: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My new name\&quot; } &#x60;&#x60;&#x60; You can also set or update one or more properties: &#x60;&#x60;&#x60;JSON {   \&quot;properties\&quot;:     {        \&quot;rma:vitalRecordIndicator\&quot;: true,        \&quot;rma:reviewPeriod\&quot;:\&quot;month|6\&quot;     } } &#x60;&#x60;&#x60; **Note:** If you want to add or remove aspects, then you must use **GET /record-categories/{recordCategoryId}** first to get the complete set of *aspectNames*.  **Note:** Currently there is no optimistic locking for updates, so they are applied in \&quot;last one wins\&quot; order. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordCategoryId** | **String**| The identifier of a record category. |
 **recordCategoryBodyUpdate** | [**FilePlanComponentBodyUpdate**](FilePlanComponentBodyUpdate.md)| The record category information to update. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the record category. Any optional field from the response model can be requested. For example: * allowableOperations * hasRetentionSchedule * path  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**RecordCategoryEntry**](RecordCategoryEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

