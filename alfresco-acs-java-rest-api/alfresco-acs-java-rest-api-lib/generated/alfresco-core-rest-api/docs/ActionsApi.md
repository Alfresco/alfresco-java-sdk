# ActionsApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionDetails**](ActionsApi.md#actionDetails) | **GET** /action-definitions/{actionDefinitionId} | Retrieve the details of an action definition
[**actionExec**](ActionsApi.md#actionExec) | **POST** /action-executions | Execute an action
[**listActions**](ActionsApi.md#listActions) | **GET** /action-definitions | Retrieve list of available actions
[**nodeActions**](ActionsApi.md#nodeActions) | **GET** /nodes/{nodeId}/action-definitions | Retrieve actions for a node


<a name="actionDetails"></a>
# **actionDetails**
> ActionDefinitionEntry actionDetails(actionDefinitionId)

Retrieve the details of an action definition

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Retrieve the details of the action denoted by **actionDefinitionId**. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionDefinitionId** | **String**| The identifier of an action definition. |

### Return type

[**ActionDefinitionEntry**](ActionDefinitionEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="actionExec"></a>
# **actionExec**
> ActionExecResultEntry actionExec(actionBodyExec)

Execute an action

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Executes an action  An action may be executed against a node specified by **targetId**. For example:  &#x60;&#x60;&#x60; {   \&quot;actionDefinitionId\&quot;: \&quot;copy\&quot;,   \&quot;targetId\&quot;: \&quot;4c4b3c43-f18b-43ff-af84-751f16f1ddfd\&quot;,   \&quot;params\&quot;: {    \&quot;destination-folder\&quot;: \&quot;34219f79-66fa-4ebf-b371-118598af898c\&quot;   } } &#x60;&#x60;&#x60;  Performing a POST with the request body shown above will result in the node identified by &#x60;&#x60;&#x60;targetId&#x60;&#x60;&#x60; being copied to the destination folder specified in the &#x60;&#x60;&#x60;params&#x60;&#x60;&#x60; object by the key &#x60;&#x60;&#x60;destination-folder&#x60;&#x60;&#x60;.  **targetId** is optional, however, currently **targetId** must be a valid node ID. In the future, actions may be executed against different entity types or executed without the need for the context of an entity.   Parameters supplied to the action within the &#x60;&#x60;&#x60;params&#x60;&#x60;&#x60; object will be converted to the expected type, where possible using the DefaultTypeConverter class. In addition:  * Node IDs may be supplied in their short form (implicit workspace://SpacesStore prefix) * Aspect names may be supplied using their short form, e.g. cm:versionable or cm:auditable  In this example, we add the aspect &#x60;&#x60;&#x60;cm:versionable&#x60;&#x60;&#x60; to a node using the QName resolution mentioned above:  &#x60;&#x60;&#x60; {   \&quot;actionDefinitionId\&quot;: \&quot;add-features\&quot;,   \&quot;targetId\&quot;: \&quot;16349e3f-2977-44d1-93f2-73c12b8083b5\&quot;,   \&quot;params\&quot;: {    \&quot;aspect-name\&quot;: \&quot;cm:versionable\&quot;   } } &#x60;&#x60;&#x60;  The &#x60;&#x60;&#x60;actionDefinitionId&#x60;&#x60;&#x60; is the &#x60;&#x60;&#x60;id&#x60;&#x60;&#x60; of an action definition as returned by the _list actions_ operations (e.g. GET /action-definitions).  The action will be executed **asynchronously** with a &#x60;202&#x60; HTTP response signifying that the request has been accepted successfully. The response body contains the unique ID of the action pending execution. The ID may be used, for example to correlate an execution with output in the server logs. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionBodyExec** | [**ActionBodyExec**](ActionBodyExec.md)| Action execution details |

### Return type

[**ActionExecResultEntry**](ActionExecResultEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listActions"></a>
# **listActions**
> ActionDefinitionList listActions(skipCount, maxItems, orderBy, fields)

Retrieve list of available actions

**Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Gets a list of all available actions  The default sort order for the returned list is for actions to be sorted by ascending name. You can override the default by using the **orderBy** parameter.  You can use any of the following fields to order the results: * name * title 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100]
 **orderBy** | [**List&lt;String&gt;**](String.md)| A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field.  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**ActionDefinitionList**](ActionDefinitionList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodeActions"></a>
# **nodeActions**
> ActionDefinitionList nodeActions(nodeId, skipCount, maxItems, orderBy, fields)

Retrieve actions for a node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Retrieve the list of actions that may be executed against the given **nodeId**.  The default sort order for the returned list is for actions to be sorted by ascending name. You can override the default by using the **orderBy** parameter.  You can use any of the following fields to order the results: * name * title 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100]
 **orderBy** | [**List&lt;String&gt;**](String.md)| A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field.  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**ActionDefinitionList**](ActionDefinitionList.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

