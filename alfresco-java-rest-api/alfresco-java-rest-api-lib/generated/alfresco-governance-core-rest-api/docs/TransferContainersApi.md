# TransferContainersApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransferContainer**](TransferContainersApi.md#getTransferContainer) | **GET** /transfer-containers/{transferContainerId} | Get a transfer container
[**listTransfers**](TransferContainersApi.md#listTransfers) | **GET** /transfer-containers/{transferContainerId}/transfers | List transfer container&#39;s children
[**updateTransferContainer**](TransferContainersApi.md#updateTransferContainer) | **PUT** /transfer-containers/{transferContainerId} | Update transfer container


<a name="getTransferContainer"></a>
# **getTransferContainer**
> TransferContainerEntry getTransferContainer(transferContainerId, include, fields)

Get a transfer container

Gets information for transfer container **transferContainerId**  Mandatory fields and the transfer container&#39;s aspects and properties are returned by default.  You can use the **include** parameter (include&#x3D;allowableOperations) to return additional information. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferContainerId** | **String**| The identifier of a transfer container. You can also use the -transfers- alias. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the transfer container. Any optional field from the response model can be requested. For example: * allowableOperations * path  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**TransferContainerEntry**](TransferContainerEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTransfers"></a>
# **listTransfers**
> TransferContainerAssociationPaging listTransfers(transferContainerId, skipCount, maxItems, include, includeSource, fields)

List transfer container&#39;s children

Returns a list of transfers.  Minimal information for each child is returned by default.  You can use the **include** parameter (include&#x3D;allowableOperations) to return additional information. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferContainerId** | **String**| The identifier of a transfer container. You can also use the -transfers- alias. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. | [optional]
 **maxItems** | **Integer**| The maximum number of items to return in the list. | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the transfer folders. Any optional field from the response model can be requested. For example: * allowableOperations * aspectNames * properties * transferPDFIndicator * transferLocation * transferAccessionIndicator  | [optional]
 **includeSource** | **Boolean**| Also include **source** (in addition to **entries**) with folder information on the specified parent **transferContainerId**. | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**TransferContainerAssociationPaging**](TransferContainerAssociationPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTransferContainer"></a>
# **updateTransferContainer**
> TransferContainerEntry updateTransferContainer(transferContainerId, nodeBodyUpdate, include, fields)

Update transfer container

Updates the transfer container **transferContainerId**. For example, you can rename transfer container: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My new name\&quot; } &#x60;&#x60;&#x60; You can also set or update description and title properties: &#x60;&#x60;&#x60;JSON {   \&quot;properties\&quot;:     {        \&quot;cm:description\&quot;: \&quot;New Description\&quot;,        \&quot;cm:title\&quot;:\&quot;New Title\&quot;     } } &#x60;&#x60;&#x60; **Note:** Currently there is no optimistic locking for updates, so they are applied in \&quot;last one wins\&quot; order. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferContainerId** | **String**| The identifier of a transfer container. You can also use the -transfers- alias. |
 **nodeBodyUpdate** | [**TransferContainerBodyUpdate**](TransferContainerBodyUpdate.md)| The node information to update. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the transfer container. Any optional field from the response model can be requested. For example: * allowableOperations * path  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**TransferContainerEntry**](TransferContainerEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

