# FavoritesApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFavorite**](FavoritesApi.md#createFavorite) | **POST** /people/{personId}/favorites | Create a favorite
[**createSiteFavorite**](FavoritesApi.md#createSiteFavorite) | **POST** /people/{personId}/favorite-sites | Create a site favorite
[**deleteFavorite**](FavoritesApi.md#deleteFavorite) | **DELETE** /people/{personId}/favorites/{favoriteId} | Delete a favorite
[**deleteSiteFavorite**](FavoritesApi.md#deleteSiteFavorite) | **DELETE** /people/{personId}/favorite-sites/{siteId} | Delete a site favorite
[**getFavorite**](FavoritesApi.md#getFavorite) | **GET** /people/{personId}/favorites/{favoriteId} | Get a favorite
[**getFavoriteSite**](FavoritesApi.md#getFavoriteSite) | **GET** /people/{personId}/favorite-sites/{siteId} | Get a favorite site
[**listFavoriteSitesForPerson**](FavoritesApi.md#listFavoriteSitesForPerson) | **GET** /people/{personId}/favorite-sites | List favorite sites
[**listFavorites**](FavoritesApi.md#listFavorites) | **GET** /people/{personId}/favorites | List favorites


<a name="createFavorite"></a>
# **createFavorite**
> FavoriteEntry createFavorite(personId, favoriteBodyCreate, include, fields)

Create a favorite

Favorite a **site**, **file**, or **folder** in the repository.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user.  **Note:** You can favorite more than one entity by specifying a list of objects in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {        \&quot;target\&quot;: {           \&quot;file\&quot;: {              \&quot;guid\&quot;: \&quot;abcde-01234-....\&quot;           }        }    },    {        \&quot;target\&quot;: {           \&quot;file\&quot;: {              \&quot;guid\&quot;: \&quot;abcde-09863-....\&quot;           }        }    }, ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **favoriteBodyCreate** | [**FavoriteBodyCreate**](FavoriteBodyCreate.md)| An object identifying the entity to be favorited.  The object consists of a single property which is an object with the name &#x60;site&#x60;, &#x60;file&#x60;, or &#x60;folder&#x60;. The content of that object is the &#x60;guid&#x60; of the target entity.  For example, to favorite a file the following body would be used:  &#x60;&#x60;&#x60;JSON {    \&quot;target\&quot;: {       \&quot;file\&quot;: {          \&quot;guid\&quot;: \&quot;abcde-01234-....\&quot;       }    } } &#x60;&#x60;&#x60;  |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about favorites, the following optional fields can be requested: * path (note, this only applies to files and folders) * properties  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**FavoriteEntry**](FavoriteEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSiteFavorite"></a>
# **createSiteFavorite**
> FavoriteSiteEntry createSiteFavorite(personId, favoriteSiteBodyCreate, fields)

Create a site favorite

**Note:** this endpoint is deprecated as of Alfresco 4.2, and will be removed in the future. Use &#x60;/people/{personId}/favorites&#x60; instead.  Create a site favorite for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user.   **Note:** You can favorite more than one site by specifying a list of sites in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {     \&quot;id\&quot;: \&quot;test-site-1\&quot;   },   {     \&quot;id\&quot;: \&quot;test-site-2\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **favoriteSiteBodyCreate** | [**FavoriteSiteBodyCreate**](FavoriteSiteBodyCreate.md)| The id of the site to favorite. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**FavoriteSiteEntry**](FavoriteSiteEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFavorite"></a>
# **deleteFavorite**
> deleteFavorite(personId, favoriteId)

Delete a favorite

Deletes **favoriteId** as a favorite of person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **favoriteId** | **String**| The identifier of a favorite. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSiteFavorite"></a>
# **deleteSiteFavorite**
> deleteSiteFavorite(personId, siteId)

Delete a site favorite

**Note:** this endpoint is deprecated as of Alfresco 4.2, and will be removed in the future. Use &#x60;/people/{personId}/favorites/{favoriteId}&#x60; instead.  Deletes site **siteId** from the favorite site list of person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **siteId** | **String**| The identifier of a site. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFavorite"></a>
# **getFavorite**
> FavoriteEntry getFavorite(personId, favoriteId, include, fields)

Get a favorite

Gets favorite **favoriteId** for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **favoriteId** | **String**| The identifier of a favorite. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about favorites, the following optional fields can be requested: * path (note, this only applies to files and folders) * properties  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**FavoriteEntry**](FavoriteEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFavoriteSite"></a>
# **getFavoriteSite**
> SiteEntry getFavoriteSite(personId, siteId, fields)

Get a favorite site

**Note:** this endpoint is deprecated as of Alfresco 4.2, and will be removed in the future. Use &#x60;/people/{personId}/favorites/{favoriteId}&#x60; instead.  Gets information on favorite site **siteId** of person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **siteId** | **String**| The identifier of a site. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteEntry**](SiteEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFavoriteSitesForPerson"></a>
# **listFavoriteSitesForPerson**
> SitePaging listFavoriteSitesForPerson(personId, skipCount, maxItems, fields)

List favorite sites

**Note:** this endpoint is deprecated as of Alfresco 4.2, and will be removed in the future. Use &#x60;/people/{personId}/favorites&#x60; instead.  Gets a list of a person&#39;s favorite sites.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SitePaging**](SitePaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFavorites"></a>
# **listFavorites**
> FavoritePaging listFavorites(personId, skipCount, maxItems, orderBy, where, include, fields)

List favorites

Gets a list of favorites for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user.  The default sort order for the returned list of favorites is type ascending, createdAt descending. You can override the default by using the **orderBy** parameter.  You can use any of the following fields to order the results: *   &#x60;type&#x60; *   &#x60;createdAt&#x60; *   &#x60;title&#x60;  You can use the **where** parameter to restrict the list in the response to entries of a specific kind. The **where** parameter takes a value. The value is a single predicate that can include one or more **EXISTS** conditions. The **EXISTS** condition uses a single operand to limit the list to include entries that include that one property. The property values are:  *   &#x60;target/file&#x60; *   &#x60;target/folder&#x60; *   &#x60;target/site&#x60;  For example, the following **where** parameter restricts the returned list to the file favorites for a person:  &#x60;&#x60;&#x60;SQL (EXISTS(target/file)) &#x60;&#x60;&#x60; You can specify more than one condition using **OR**. The predicate must be enclosed in parentheses.   For example, the following **where** parameter restricts the returned list to the file and folder favorites for a person:  &#x60;&#x60;&#x60;SQL (EXISTS(target/file) OR EXISTS(target/folder)) &#x60;&#x60;&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100]
 **orderBy** | [**List&lt;String&gt;**](String.md)| A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field.  | [optional]
 **where** | **String**| A string to restrict the returned objects by using a predicate. | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about favorites, the following optional fields can be requested: * path (note, this only applies to files and folders) * properties  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**FavoritePaging**](FavoritePaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

