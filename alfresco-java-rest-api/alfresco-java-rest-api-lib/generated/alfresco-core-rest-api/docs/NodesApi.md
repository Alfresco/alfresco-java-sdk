# NodesApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyNode**](NodesApi.md#copyNode) | **POST** /nodes/{nodeId}/copy | Copy a node
[**createAssociation**](NodesApi.md#createAssociation) | **POST** /nodes/{nodeId}/targets | Create node association
[**createNode**](NodesApi.md#createNode) | **POST** /nodes/{nodeId}/children | Create a node
[**createSecondaryChildAssociation**](NodesApi.md#createSecondaryChildAssociation) | **POST** /nodes/{nodeId}/secondary-children | Create secondary child
[**deleteAssociation**](NodesApi.md#deleteAssociation) | **DELETE** /nodes/{nodeId}/targets/{targetId} | Delete node association(s)
[**deleteNode**](NodesApi.md#deleteNode) | **DELETE** /nodes/{nodeId} | Delete a node
[**deleteSecondaryChildAssociation**](NodesApi.md#deleteSecondaryChildAssociation) | **DELETE** /nodes/{nodeId}/secondary-children/{childId} | Delete secondary child or children
[**getNode**](NodesApi.md#getNode) | **GET** /nodes/{nodeId} | Get a node
[**getNodeContent**](NodesApi.md#getNodeContent) | **GET** /nodes/{nodeId}/content | Get node content
[**listNodeChildren**](NodesApi.md#listNodeChildren) | **GET** /nodes/{nodeId}/children | List node children
[**listParents**](NodesApi.md#listParents) | **GET** /nodes/{nodeId}/parents | List parents
[**listSecondaryChildren**](NodesApi.md#listSecondaryChildren) | **GET** /nodes/{nodeId}/secondary-children | List secondary children
[**listSourceAssociations**](NodesApi.md#listSourceAssociations) | **GET** /nodes/{nodeId}/sources | List source associations
[**listTargetAssociations**](NodesApi.md#listTargetAssociations) | **GET** /nodes/{nodeId}/targets | List target associations
[**lockNode**](NodesApi.md#lockNode) | **POST** /nodes/{nodeId}/lock | Lock a node
[**moveNode**](NodesApi.md#moveNode) | **POST** /nodes/{nodeId}/move | Move a node
[**unlockNode**](NodesApi.md#unlockNode) | **POST** /nodes/{nodeId}/unlock | Unlock a node
[**updateNode**](NodesApi.md#updateNode) | **PUT** /nodes/{nodeId} | Update a node
[**updateNodeContent**](NodesApi.md#updateNodeContent) | **PUT** /nodes/{nodeId}/content | Update node content


<a name="copyNode"></a>
# **copyNode**
> NodeEntry copyNode(nodeId, nodeBodyCopy, include, fields)

Copy a node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Copies the node **nodeId** to the parent folder node **targetParentId**. You specify the **targetParentId** in the request body.  The new node has the same name as the source node unless you specify a new **name** in the request body.  If the source **nodeId** is a folder, then all of its children are also copied.  If the source **nodeId** is a file, it&#39;s properties, aspects and tags are copied, it&#39;s ratings, comments and locks are not. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
NodeBodyCopy nodeBodyCopy = new NodeBodyCopy(); // NodeBodyCopy | The targetParentId and, optionally, a new name which should include the file extension.
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeEntry result = apiInstance.copyNode(nodeId, nodeBodyCopy, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#copyNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **nodeBodyCopy** | [**NodeBodyCopy**](NodeBodyCopy.md)| The targetParentId and, optionally, a new name which should include the file extension. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAssociation"></a>
# **createAssociation**
> AssociationEntry createAssociation(nodeId, associationBodyCreate, fields)

Create node association

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Create an association, with the given association type, between the source **nodeId** and a target node.  **Note:** You can create more than one association by specifying a list of associations in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {      \&quot;targetId\&quot;: \&quot;string\&quot;,      \&quot;assocType\&quot;: \&quot;string\&quot;   },   {     \&quot;targetId\&quot;: \&quot;string\&quot;,     \&quot;assocType\&quot;: \&quot;string\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a source node.
AssociationBody associationBodyCreate = new AssociationBody(); // AssociationBody | The target node id and assoc type.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    AssociationEntry result = apiInstance.createAssociation(nodeId, associationBodyCreate, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#createAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a source node. |
 **associationBodyCreate** | [**AssociationBody**](AssociationBody.md)| The target node id and assoc type. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**AssociationEntry**](AssociationEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNode"></a>
# **createNode**
> NodeEntry createNode(nodeId, nodeBodyCreate, autoRename, include, fields)

Create a node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Create a node and add it as a primary child of node **nodeId**.  This endpoint supports both JSON and multipart/form-data (file upload).  **Using multipart/form-data**  Use the **filedata** field to represent the content to upload, for example, the following curl command will create a node with the contents of test.txt in the test user&#39;s home folder.  &#x60;&#x60;&#x60;curl -utest:test -X POST host:port/alfresco/api/-default-/public/alfresco/versions/1/nodes/-my-/children -F filedata&#x3D;@test.txt&#x60;&#x60;&#x60;  You can use the **name** field to give an alternative name for the new file.  You can use the **nodeType** field to create a specific type. The default is cm:content.  You can use the **renditions** field to create renditions (e.g. doclib) asynchronously upon upload. Also, as requesting rendition is a background process, any rendition failure (e.g. No transformer is currently available) will not fail the whole upload and has the potential to silently fail.  Use **overwrite** to overwrite an existing file, matched by name. If the file is versionable, the existing content is replaced.  When you overwrite existing content, you can set the **majorVersion** boolean field to **true** to indicate a major version should be created. The default for **majorVersion** is **false**. Setting  **majorVersion** enables versioning of the node, if it is not already versioned.  When you overwrite existing content, you can use the **comment** field to add a version comment that appears in the version history. This also enables versioning of this node, if it is not already versioned.  You can set the **autoRename** boolean field to automatically resolve name clashes. If there is a name clash, then the API method tries to create a unique name using an integer suffix.  You can use the **relativePath** field to specify the folder structure to create relative to the node **nodeId**. Folders in the **relativePath** that do not exist are created before the node is created.  Any other field provided will be treated as a property to set on the newly created node.  **Note:** setting properties of type d:content and d:category are not supported.  **Using JSON**  You must specify at least a **name** and **nodeType**. For example, to create a folder: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Folder\&quot;,   \&quot;nodeType\&quot;:\&quot;cm:folder\&quot; } &#x60;&#x60;&#x60;  You can create an empty file like this: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My text file.txt\&quot;,   \&quot;nodeType\&quot;:\&quot;cm:content\&quot; } &#x60;&#x60;&#x60; You can update binary content using the &#x60;&#x60;&#x60;PUT /nodes/{nodeId}&#x60;&#x60;&#x60; API method.  You can create a folder, or other node, inside a folder hierarchy: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Special Folder\&quot;,   \&quot;nodeType\&quot;:\&quot;cm:folder\&quot;,   \&quot;relativePath\&quot;:\&quot;X/Y/Z\&quot; } &#x60;&#x60;&#x60; The **relativePath** specifies the folder structure to create relative to the node **nodeId**. Folders in the **relativePath** that do not exist are created before the node is created.  You can set properties when you create a new node: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Other Folder\&quot;,   \&quot;nodeType\&quot;:\&quot;cm:folder\&quot;,   \&quot;properties\&quot;:   {     \&quot;cm:title\&quot;:\&quot;Folder title\&quot;,     \&quot;cm:description\&quot;:\&quot;This is an important folder\&quot;   } } &#x60;&#x60;&#x60;  You can set multi-value properties when you create a new node which supports properties of type multiple.  &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Other Folder\&quot;,   \&quot;nodeType\&quot;:\&quot;custom:destination\&quot;,   \&quot;properties\&quot;:   {     \&quot;cm:title\&quot;:\&quot;Folder title\&quot;,     \&quot;cm:description\&quot;:\&quot;This is an important folder\&quot;,     \&quot;custom:locations\&quot;: [                          \&quot;location X\&quot;,                          \&quot;location Y\&quot;                         ]   } } &#x60;&#x60;&#x60;  Any missing aspects are applied automatically. For example, **cm:titled** in the JSON shown above. You can set aspects explicitly, if needed, using an **aspectNames** field.  **Note:** setting properties of type d:content and d:category are not supported.  You can also optionally disable (or enable) inherited permissions via *isInheritanceEnabled* flag: &#x60;&#x60;&#x60;JSON {   \&quot;permissions\&quot;:     {       \&quot;isInheritanceEnabled\&quot;: false,       \&quot;locallySet\&quot;:         [           {\&quot;authorityId\&quot;: \&quot;GROUP_special\&quot;, \&quot;name\&quot;: \&quot;Read\&quot;, \&quot;accessStatus\&quot;:\&quot;DENIED\&quot;},           {\&quot;authorityId\&quot;: \&quot;testuser\&quot;, \&quot;name\&quot;: \&quot;Contributor\&quot;, \&quot;accessStatus\&quot;:\&quot;ALLOWED\&quot;}         ]     } } &#x60;&#x60;&#x60;  Typically, for files and folders, the primary children are created within the parent folder using the default \&quot;cm:contains\&quot; assocType.  If the content model allows then it is also possible to create primary children with a different assoc type. For example: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Node\&quot;,   \&quot;nodeType\&quot;:\&quot;my:specialNodeType\&quot;,   \&quot;association\&quot;:   {     \&quot;assocType\&quot;:\&quot;my:specialAssocType\&quot;   } } &#x60;&#x60;&#x60;   Additional associations can be added after creating a node. You can also add associations at the time the node is created. This is  required, for example, if the content model specifies that a node has mandatory associations to one or more existing nodes. You can optionally  specify an array of **secondaryChildren** to create one or more secondary child associations, such that the newly created node acts as a parent node.  You can optionally specify an array of **targets** to create one or more peer associations such that the newly created node acts as a source node.  For example, to associate one or more secondary children at time of creation: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Folder\&quot;,   \&quot;nodeType\&quot;:\&quot;cm:folder\&quot;,   \&quot;secondaryChildren\&quot;:     [ {\&quot;childId\&quot;:\&quot;abcde-01234-...\&quot;, \&quot;assocType\&quot;:\&quot;my:specialChildAssocType\&quot;} ] } &#x60;&#x60;&#x60;  For example, to associate one or more targets at time of creation: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Folder\&quot;,   \&quot;nodeType\&quot;:\&quot;cm:folder\&quot;,   \&quot;targets\&quot;:     [ {\&quot;targetId\&quot;:\&quot;abcde-01234-...\&quot;, \&quot;assocType\&quot;:\&quot;my:specialPeerAssocType\&quot;} ] } &#x60;&#x60;&#x60;  **Note:** You can create more than one child by  specifying a list of nodes in the JSON body. For example, the following JSON body creates two folders inside the specified **nodeId**, if the **nodeId** identifies a folder:  &#x60;&#x60;&#x60;JSON [   {     \&quot;name\&quot;:\&quot;My Folder 1\&quot;,     \&quot;nodeType\&quot;:\&quot;cm:folder\&quot;   },   {     \&quot;name\&quot;:\&quot;My Folder 2\&quot;,     \&quot;nodeType\&quot;:\&quot;cm:folder\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node. You can also use one of these well-known aliases: * -my- * -shared- * -root- 
NodeBodyCreate nodeBodyCreate = new NodeBodyCreate(); // NodeBodyCreate | The node information to create.
Boolean autoRename = true; // Boolean | If true, then  a name clash will cause an attempt to auto rename by finding a unique name using an integer suffix.
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeEntry result = apiInstance.createNode(nodeId, nodeBodyCreate, autoRename, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#createNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. You can also use one of these well-known aliases: * -my- * -shared- * -root-  |
 **nodeBodyCreate** | [**NodeBodyCreate**](NodeBodyCreate.md)| The node information to create. |
 **autoRename** | **Boolean**| If true, then  a name clash will cause an attempt to auto rename by finding a unique name using an integer suffix. | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

<a name="createSecondaryChildAssociation"></a>
# **createSecondaryChildAssociation**
> ChildAssociationEntry createSecondaryChildAssociation(nodeId, secondaryChildAssociationBodyCreate, fields)

Create secondary child

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Create a secondary child association, with the given association type, between the parent **nodeId** and a child node.  **Note:** You can create more than one secondary child association by  specifying a list of associations in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {     \&quot;childId\&quot;: \&quot;string\&quot;,     \&quot;assocType\&quot;: \&quot;string\&quot;   },   {     \&quot;childId\&quot;: \&quot;string\&quot;,     \&quot;assocType\&quot;: \&quot;string\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a parent node.
ChildAssociationBody secondaryChildAssociationBodyCreate = new ChildAssociationBody(); // ChildAssociationBody | The child node id and assoc type.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    ChildAssociationEntry result = apiInstance.createSecondaryChildAssociation(nodeId, secondaryChildAssociationBodyCreate, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#createSecondaryChildAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a parent node. |
 **secondaryChildAssociationBodyCreate** | [**ChildAssociationBody**](ChildAssociationBody.md)| The child node id and assoc type. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**ChildAssociationEntry**](ChildAssociationEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAssociation"></a>
# **deleteAssociation**
> deleteAssociation(nodeId, targetId, assocType)

Delete node association(s)

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Delete an association, or associations, from the source **nodeId* to a target node for the given association type.  If the association type is **not** specified, then all peer associations, of any type, in the direction  from source to target, are deleted.  **Note:** After removal of the peer association, or associations, from source to target, the two nodes may still have peer associations in the other direction. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a source node.
String targetId = "targetId_example"; // String | The identifier of a target node.
String assocType = "assocType_example"; // String | Only delete associations of this type.
try {
    apiInstance.deleteAssociation(nodeId, targetId, assocType);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#deleteAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a source node. |
 **targetId** | **String**| The identifier of a target node. |
 **assocType** | **String**| Only delete associations of this type. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNode"></a>
# **deleteNode**
> deleteNode(nodeId, permanent)

Delete a node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Deletes the node **nodeId**.  If **nodeId** is a folder, then its children are also deleted.  Deleted nodes move to the trashcan unless the **permanent** query parameter is **true** and the current user is the owner of the node or an admin.  Deleting a node deletes it from its primary parent and also from any secondary parents. Peer associations are also deleted, where the deleted  node is either a source or target of an association. This applies recursively to any hierarchy of primary children of the deleted node.   **Note:** If the node is not permanently deleted, and is later successfully restored to its former primary parent, then the primary  child association is restored. This applies recursively for any primary children. No other secondary child associations or  peer associations are restored for any of the nodes in the primary parent-child hierarchy of restored nodes, regardless of whether the original  associations were to nodes inside or outside the restored hierarchy. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
Boolean permanent = false; // Boolean | If **true** then the node is deleted permanently, without moving to the trashcan. Only the owner of the node or an admin can permanently delete the node. 
try {
    apiInstance.deleteNode(nodeId, permanent);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#deleteNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **permanent** | **Boolean**| If **true** then the node is deleted permanently, without moving to the trashcan. Only the owner of the node or an admin can permanently delete the node.  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSecondaryChildAssociation"></a>
# **deleteSecondaryChildAssociation**
> deleteSecondaryChildAssociation(nodeId, childId, assocType)

Delete secondary child or children

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Delete secondary child associations between the parent **nodeId** and child nodes for the given association type.  If the association type is **not** specified, then all secondary child associations, of any type in the direction  from parent to secondary child, will be deleted. The child will still have a primary parent and may still be associated as a secondary child with other secondary parents. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a parent node.
String childId = "childId_example"; // String | The identifier of a child node.
String assocType = "assocType_example"; // String | Only delete associations of this type.
try {
    apiInstance.deleteSecondaryChildAssociation(nodeId, childId, assocType);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#deleteSecondaryChildAssociation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a parent node. |
 **childId** | **String**| The identifier of a child node. |
 **assocType** | **String**| Only delete associations of this type. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNode"></a>
# **getNode**
> NodeEntry getNode(nodeId, include, relativePath, fields)

Get a node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Get information for node **nodeId**.  You can use the **include** parameter to return additional information. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node. You can also use one of these well-known aliases: * -my- * -shared- * -root- 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions 
String relativePath = "relativePath_example"; // String | A path relative to the **nodeId**. If you set this,  information is returned on the node resolved by this path. 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeEntry result = apiInstance.getNode(nodeId, include, relativePath, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#getNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. You can also use one of these well-known aliases: * -my- * -shared- * -root-  |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions  | [optional]
 **relativePath** | **String**| A path relative to the **nodeId**. If you set this,  information is returned on the node resolved by this path.  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeContent"></a>
# **getNodeContent**
> File getNodeContent(nodeId, attachment, ifModifiedSince, range)

Get node content

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the content of the node with identifier **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
Boolean attachment = true; // Boolean | **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response. 
OffsetDateTime ifModifiedSince = OffsetDateTime.now(); // OffsetDateTime | Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, `Wed, 09 Mar 2016 16:56:34 GMT`. 
String range = "range_example"; // String | The Range header indicates the part of a document that the server should return. Single part request supported, for example: bytes=1-10. 
try {
    File result = apiInstance.getNodeContent(nodeId, attachment, ifModifiedSince, range);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#getNodeContent");
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

<a name="listNodeChildren"></a>
# **listNodeChildren**
> NodeChildAssociationPaging listNodeChildren(nodeId, skipCount, maxItems, orderBy, where, include, relativePath, includeSource, fields)

List node children

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of children of the parent node **nodeId**.  Minimal information for each child is returned by default.  You can use the **include** parameter to return additional information.  The list of child nodes includes primary children and secondary children, if there are any.  You can use the **include** parameter (include&#x3D;association) to return child association details  for each child, including the **assocTyp**e and the **isPrimary** flag.  The default sort order for the returned list is for folders to be sorted before files, and by ascending name.  You can override the default using **orderBy** to specify one or more fields to sort by. The default order is always ascending, but you can use an optional **ASC** or **DESC** modifier to specify an ascending or descending sort order.       For example, specifying &#x60;&#x60;&#x60;orderBy&#x3D;name DESC&#x60;&#x60;&#x60; returns a mixed folder/file list in descending **name** order.  You can use any of the following fields to order the results: * isFolder * name * mimeType * nodeType * sizeInBytes * modifiedAt * createdAt * modifiedByUser * createdByUser 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node. You can also use one of these well-known aliases: * -my- * -shared- * -root- 
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list.  If not supplied then the default value is 100. 
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. 
String where = "where_example"; // String | Optionally filter the list. Here are some examples:  *   ```where=(isFolder=true)```  *   ```where=(isFile=true)```  *   ```where=(nodeType='my:specialNodeType')```  *   ```where=(nodeType='my:specialNodeType INCLUDESUBTYPES')```  *   ```where=(isPrimary=true)```  *   ```where=(assocType='my:specialAssocType')```  *   ```where=(isPrimary=false and assocType='my:specialAssocType')``` 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * association * isLink * isFavorite * isLocked * path * properties * permissions 
String relativePath = "relativePath_example"; // String | Return information on children in the folder resolved by this path. The path is relative to **nodeId**.
Boolean includeSource = true; // Boolean | Also include **source** in addition to **entries** with folder information on the parent node – either the specified parent **nodeId**, or as resolved by **relativePath**.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeChildAssociationPaging result = apiInstance.listNodeChildren(nodeId, skipCount, maxItems, orderBy, where, include, relativePath, includeSource, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#listNodeChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. You can also use one of these well-known aliases: * -my- * -shared- * -root-  |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list.  If not supplied then the default value is 100.  | [optional] [default to 100]
 **orderBy** | [**List&lt;String&gt;**](String.md)| A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field.  | [optional]
 **where** | **String**| Optionally filter the list. Here are some examples:  *   &#x60;&#x60;&#x60;where&#x3D;(isFolder&#x3D;true)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(isFile&#x3D;true)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(nodeType&#x3D;&#39;my:specialNodeType&#39;)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(nodeType&#x3D;&#39;my:specialNodeType INCLUDESUBTYPES&#39;)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(isPrimary&#x3D;true)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(assocType&#x3D;&#39;my:specialAssocType&#39;)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(isPrimary&#x3D;false and assocType&#x3D;&#39;my:specialAssocType&#39;)&#x60;&#x60;&#x60;  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * association * isLink * isFavorite * isLocked * path * properties * permissions  | [optional]
 **relativePath** | **String**| Return information on children in the folder resolved by this path. The path is relative to **nodeId**. | [optional]
 **includeSource** | **Boolean**| Also include **source** in addition to **entries** with folder information on the parent node – either the specified parent **nodeId**, or as resolved by **relativePath**. | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeChildAssociationPaging**](NodeChildAssociationPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listParents"></a>
# **listParents**
> NodeAssociationPaging listParents(nodeId, where, include, skipCount, maxItems, includeSource, fields)

List parents

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of parent nodes that are associated with the current child **nodeId**.  The list includes both the primary parent and any secondary parents. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a child node. You can also use one of these well-known aliases: * -my- * -shared- * -root- 
String where = "where_example"; // String | Optionally filter the list by **assocType** and/or **isPrimary**. Here are some example filters:  *   ```where=(assocType='my:specialAssocType')```  *   ```where=(isPrimary=true)```  *   ```where=(isPrimary=false and assocType='my:specialAssocType')``` 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * isLink * isFavorite * isLocked * path * properties 
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list.  If not supplied then the default value is 100. 
Boolean includeSource = true; // Boolean | Also include **source** (in addition to **entries**) with folder information on **nodeId**
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeAssociationPaging result = apiInstance.listParents(nodeId, where, include, skipCount, maxItems, includeSource, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#listParents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a child node. You can also use one of these well-known aliases: * -my- * -shared- * -root-  |
 **where** | **String**| Optionally filter the list by **assocType** and/or **isPrimary**. Here are some example filters:  *   &#x60;&#x60;&#x60;where&#x3D;(assocType&#x3D;&#39;my:specialAssocType&#39;)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(isPrimary&#x3D;true)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(isPrimary&#x3D;false and assocType&#x3D;&#39;my:specialAssocType&#39;)&#x60;&#x60;&#x60;  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * isLink * isFavorite * isLocked * path * properties  | [optional]
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list.  If not supplied then the default value is 100.  | [optional] [default to 100]
 **includeSource** | **Boolean**| Also include **source** (in addition to **entries**) with folder information on **nodeId** | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeAssociationPaging**](NodeAssociationPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSecondaryChildren"></a>
# **listSecondaryChildren**
> NodeChildAssociationPaging listSecondaryChildren(nodeId, where, include, skipCount, maxItems, includeSource, fields)

List secondary children

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of secondary child nodes that are associated with the current parent **nodeId**, via a secondary child association. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a parent node. You can also use one of these well-known aliases: * -my- * -shared- * -root- 
String where = "where_example"; // String | Optionally filter the list by assocType. Here's an example:  *   ```where=(assocType='my:specialAssocType')``` 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * isLink * isFavorite * isLocked * path * properties 
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list.  If not supplied then the default value is 100. 
Boolean includeSource = true; // Boolean | Also include **source** (in addition to **entries**) with folder information on **nodeId**
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeChildAssociationPaging result = apiInstance.listSecondaryChildren(nodeId, where, include, skipCount, maxItems, includeSource, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#listSecondaryChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a parent node. You can also use one of these well-known aliases: * -my- * -shared- * -root-  |
 **where** | **String**| Optionally filter the list by assocType. Here&#39;s an example:  *   &#x60;&#x60;&#x60;where&#x3D;(assocType&#x3D;&#39;my:specialAssocType&#39;)&#x60;&#x60;&#x60;  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * isLink * isFavorite * isLocked * path * properties  | [optional]
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list.  If not supplied then the default value is 100.  | [optional] [default to 100]
 **includeSource** | **Boolean**| Also include **source** (in addition to **entries**) with folder information on **nodeId** | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeChildAssociationPaging**](NodeChildAssociationPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSourceAssociations"></a>
# **listSourceAssociations**
> NodeAssociationPaging listSourceAssociations(nodeId, where, include, fields)

List source associations

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of source nodes that are associated with the current target **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a target node.
String where = "where_example"; // String | Optionally filter the list by **assocType**. Here's an example:  *   ```where=(assocType='my:specialAssocType')``` 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * isLink * isFavorite * isLocked * path * properties 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeAssociationPaging result = apiInstance.listSourceAssociations(nodeId, where, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#listSourceAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a target node. |
 **where** | **String**| Optionally filter the list by **assocType**. Here&#39;s an example:  *   &#x60;&#x60;&#x60;where&#x3D;(assocType&#x3D;&#39;my:specialAssocType&#39;)&#x60;&#x60;&#x60;  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * isLink * isFavorite * isLocked * path * properties  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeAssociationPaging**](NodeAssociationPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTargetAssociations"></a>
# **listTargetAssociations**
> NodeAssociationPaging listTargetAssociations(nodeId, where, include, fields)

List target associations

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of target nodes that are associated with the current source **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a source node.
String where = "where_example"; // String | Optionally filter the list by **assocType**. Here's an example:  *   ```where=(assocType='my:specialAssocType')``` 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * isLink * isFavorite * isLocked * path * properties 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeAssociationPaging result = apiInstance.listTargetAssociations(nodeId, where, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#listTargetAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a source node. |
 **where** | **String**| Optionally filter the list by **assocType**. Here&#39;s an example:  *   &#x60;&#x60;&#x60;where&#x3D;(assocType&#x3D;&#39;my:specialAssocType&#39;)&#x60;&#x60;&#x60;  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * isLink * isFavorite * isLocked * path * properties  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeAssociationPaging**](NodeAssociationPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="lockNode"></a>
# **lockNode**
> NodeEntry lockNode(nodeId, nodeBodyLock, include, fields)

Lock a node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Places a lock on node **nodeId**.  **Note:** you can only lock files. More specifically, a node can only be locked if it is of type &#x60;cm:content&#x60; or a subtype of &#x60;cm:content&#x60;.  The lock is owned by the current user, and prevents other users or processes from making updates to the node until the lock is released.    If the **timeToExpire** is not set or is zero, then the lock never expires.  Otherwise, the **timeToExpire** is the number of seconds before the lock expires.    When a lock expires, the lock is released.  If the node is already locked, and the user is the lock owner, then the lock is renewed with the new **timeToExpire**.          By default, a lock is applied that allows the owner to update or delete the node. You can use **type** to change the lock type to one of the following:  * **ALLOW_OWNER_CHANGES** (default) changes to the node can be made only by the lock owner. This enum is the same value as the deprecated WRITE_LOCK described in &#x60;org.alfresco.service.cmr.lock.LockType&#x60; in the Alfresco Public Java API. This is the default value. * **FULL** no changes by any user are allowed. This enum is the same value as the deprecated READ_ONLY_LOCK described in &#x60;org.alfresco.service.cmr.lock.LockType&#x60; in the Alfresco Public Java API.  By default, a lock is persisted in the database. You can create a volatile in-memory lock by setting the **lifetime** property to EPHEMERAL. You might choose use EPHEMERAL locks, for example, if you are taking frequent short-term locks that you don&#39;t need  to be kept over a restart of the repository. In this case you don&#39;t need the  overhead of writing the locks to the database.  If a lock on the node cannot be taken, then an error is returned.          

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
NodeBodyLock nodeBodyLock = new NodeBodyLock(); // NodeBodyLock | Lock details.
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeEntry result = apiInstance.lockNode(nodeId, nodeBodyLock, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#lockNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **nodeBodyLock** | [**NodeBodyLock**](NodeBodyLock.md)| Lock details. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveNode"></a>
# **moveNode**
> NodeEntry moveNode(nodeId, nodeBodyMove, include, fields)

Move a node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Move the node **nodeId** to the parent folder node **targetParentId**.  The **targetParentId** is specified in the in request body.  The moved node retains its name unless you specify a new **name** in the request body.  If the source **nodeId** is a folder, then its children are also moved.  The move will effectively change the primary parent. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
NodeBodyMove nodeBodyMove = new NodeBodyMove(); // NodeBodyMove | The targetParentId and, optionally, a new name which should include the file extension.
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeEntry result = apiInstance.moveNode(nodeId, nodeBodyMove, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#moveNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **nodeBodyMove** | [**NodeBodyMove**](NodeBodyMove.md)| The targetParentId and, optionally, a new name which should include the file extension. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unlockNode"></a>
# **unlockNode**
> NodeEntry unlockNode(nodeId, include, fields)

Unlock a node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Deletes a lock on node **nodeId**.  The current user must be the owner of the locks or have admin rights, otherwise an error is returned.  If a lock on the node cannot be released, then an error is returned. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeEntry result = apiInstance.unlockNode(nodeId, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#unlockNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNode"></a>
# **updateNode**
> NodeEntry updateNode(nodeId, nodeBodyUpdate, include, fields)

Update a node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Updates the node **nodeId**. For example, you can rename a file or folder: &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My new name\&quot; } &#x60;&#x60;&#x60; You can also set or update one or more properties: &#x60;&#x60;&#x60;JSON {   \&quot;properties\&quot;:   {     \&quot;cm:title\&quot;:\&quot;Folder title\&quot;   } } &#x60;&#x60;&#x60; You can update multi-value properties of a node which supports properties of type multiple.  &#x60;&#x60;&#x60;JSON {   \&quot;name\&quot;:\&quot;My Other Folder\&quot;,   \&quot;nodeType\&quot;:\&quot;custom:destination\&quot;,   \&quot;properties\&quot;:   {     \&quot;cm:title\&quot;:\&quot;Folder title\&quot;,     \&quot;cm:description\&quot;:\&quot;This is an important folder\&quot;,     \&quot;custom:locations\&quot;: [                          \&quot;location NewX\&quot;,                          \&quot;location NewY\&quot;                         ]   } } &#x60;&#x60;&#x60;  **Note:** setting properties of type d:content and d:category are not supported.  **Note:** if you want to add or remove aspects, then you must use **GET /nodes/{nodeId}** first to get the complete set of *aspectNames*.  You can add (or remove) *locallySet* permissions, if any, in addition to any inherited permissions. You can also optionally disable (or re-enable) inherited permissions via *isInheritanceEnabled* flag: &#x60;&#x60;&#x60;JSON {   \&quot;permissions\&quot;:     {       \&quot;isInheritanceEnabled\&quot;: false,       \&quot;locallySet\&quot;:         [           {\&quot;authorityId\&quot;: \&quot;GROUP_special\&quot;, \&quot;name\&quot;: \&quot;Read\&quot;, \&quot;accessStatus\&quot;:\&quot;DENIED\&quot;},           {\&quot;authorityId\&quot;: \&quot;testuser\&quot;, \&quot;name\&quot;: \&quot;Contributor\&quot;, \&quot;accessStatus\&quot;:\&quot;ALLOWED\&quot;}         ]     } } &#x60;&#x60;&#x60; **Note:** if you want to add or remove locally set permissions then you must use **GET /nodes/{nodeId}** first to get the complete set of *locallySet* permissions.  **Note:** Currently there is no optimistic locking for updates, so they are applied in \&quot;last one wins\&quot; order. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
NodeBodyUpdate nodeBodyUpdate = new NodeBodyUpdate(); // NodeBodyUpdate | The node information to update.
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeEntry result = apiInstance.updateNode(nodeId, nodeBodyUpdate, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#updateNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **nodeBodyUpdate** | [**NodeBodyUpdate**](NodeBodyUpdate.md)| The node information to update. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNodeContent"></a>
# **updateNodeContent**
> NodeEntry updateNodeContent(nodeId, contentBodyUpdate, majorVersion, comment, name, include, fields)

Update node content

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Updates the content of the node with identifier **nodeId**.  The request body for this endpoint can be any text or binary stream.  The **majorVersion** and **comment** parameters can be used to control versioning behaviour. If the content is versionable, a new minor version is created by default.  Optionally a new **name** parameter can also be specified that must be unique within the parent folder. If specified and valid then this  will rename the node. If invalid then an error is returned and the content is not updated.  **Note:** This API method accepts any content type, but for testing with this tool text based content can be provided. This is because the OpenAPI Specification does not allow a wildcard to be provided or the ability for tooling to accept an arbitrary file. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NodesApi;








NodesApi apiInstance = new NodesApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
byte[] contentBodyUpdate = BINARY_DATA_HERE; // byte[] | The binary content
Boolean majorVersion = false; // Boolean | If **true**, create a major version. Setting this parameter also enables versioning of this node, if it is not already versioned. 
String comment = "comment_example"; // String | Add a version comment which will appear in version history. Setting this parameter also enables versioning of this node, if it is not already versioned. 
String name = "name_example"; // String | Optional new name. This should include the file extension. The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |.  The character `.` must not be used at the end of the name.  
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeEntry result = apiInstance.updateNodeContent(nodeId, contentBodyUpdate, majorVersion, comment, name, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#updateNodeContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **contentBodyUpdate** | **byte[]**| The binary content |
 **majorVersion** | **Boolean**| If **true**, create a major version. Setting this parameter also enables versioning of this node, if it is not already versioned.  | [optional] [default to false]
 **comment** | **String**| Add a version comment which will appear in version history. Setting this parameter also enables versioning of this node, if it is not already versioned.  | [optional]
 **name** | **String**| Optional new name. This should include the file extension. The name must not contain spaces or the following special characters: * \&quot; &lt; &gt; \\ / ? : and |.  The character &#x60;.&#x60; must not be used at the end of the name.   | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

