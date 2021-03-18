# RatingsApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRating**](RatingsApi.md#createRating) | **POST** /nodes/{nodeId}/ratings | Create a rating
[**deleteRating**](RatingsApi.md#deleteRating) | **DELETE** /nodes/{nodeId}/ratings/{ratingId} | Delete a rating
[**getRating**](RatingsApi.md#getRating) | **GET** /nodes/{nodeId}/ratings/{ratingId} | Get a rating
[**listRatings**](RatingsApi.md#listRatings) | **GET** /nodes/{nodeId}/ratings | List ratings


<a name="createRating"></a>
# **createRating**
> RatingEntry createRating(nodeId, ratingBodyCreate, fields)

Create a rating

Create a rating for the node with identifier **nodeId**

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.RatingsApi;








RatingsApi apiInstance = new RatingsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
RatingBody ratingBodyCreate = new RatingBody(); // RatingBody | For \"myRating\" the type is specific to the rating scheme, boolean for the likes and an integer for the fiveStar.  For example, to \"like\" a file the following body would be used:  ```JSON   {     \"id\": \"likes\",     \"myRating\": true   } ``` 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    RatingEntry result = apiInstance.createRating(nodeId, ratingBodyCreate, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingsApi#createRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **ratingBodyCreate** | [**RatingBody**](RatingBody.md)| For \&quot;myRating\&quot; the type is specific to the rating scheme, boolean for the likes and an integer for the fiveStar.  For example, to \&quot;like\&quot; a file the following body would be used:  &#x60;&#x60;&#x60;JSON   {     \&quot;id\&quot;: \&quot;likes\&quot;,     \&quot;myRating\&quot;: true   } &#x60;&#x60;&#x60;  |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**RatingEntry**](RatingEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRating"></a>
# **deleteRating**
> deleteRating(nodeId, ratingId)

Delete a rating

Deletes rating **ratingId** from node **nodeId**.

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.RatingsApi;








RatingsApi apiInstance = new RatingsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String ratingId = "ratingId_example"; // String | The identifier of a rating.
try {
    apiInstance.deleteRating(nodeId, ratingId);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingsApi#deleteRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **ratingId** | **String**| The identifier of a rating. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRating"></a>
# **getRating**
> RatingEntry getRating(nodeId, ratingId, fields)

Get a rating

Get the specific rating **ratingId** on node **nodeId**.

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.RatingsApi;








RatingsApi apiInstance = new RatingsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String ratingId = "ratingId_example"; // String | The identifier of a rating.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    RatingEntry result = apiInstance.getRating(nodeId, ratingId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingsApi#getRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **ratingId** | **String**| The identifier of a rating. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**RatingEntry**](RatingEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listRatings"></a>
# **listRatings**
> RatingPaging listRatings(nodeId, skipCount, maxItems, fields)

List ratings

Gets a list of ratings for node **nodeId**.

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.RatingsApi;








RatingsApi apiInstance = new RatingsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    RatingPaging result = apiInstance.listRatings(nodeId, skipCount, maxItems, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingsApi#listRatings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**RatingPaging**](RatingPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

