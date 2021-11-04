# PeopleApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPerson**](PeopleApi.md#createPerson) | **POST** /people | Create person
[**deleteAvatarImage**](PeopleApi.md#deleteAvatarImage) | **DELETE** /people/{personId}/avatar | Delete avatar image
[**getAvatarImage**](PeopleApi.md#getAvatarImage) | **GET** /people/{personId}/avatar | Get avatar image
[**getPerson**](PeopleApi.md#getPerson) | **GET** /people/{personId} | Get a person
[**listPeople**](PeopleApi.md#listPeople) | **GET** /people | List people
[**requestPasswordReset**](PeopleApi.md#requestPasswordReset) | **POST** /people/{personId}/request-password-reset | Request password reset
[**resetPassword**](PeopleApi.md#resetPassword) | **POST** /people/{personId}/reset-password | Reset password
[**updateAvatarImage**](PeopleApi.md#updateAvatarImage) | **PUT** /people/{personId}/avatar | Update avatar image
[**updatePerson**](PeopleApi.md#updatePerson) | **PUT** /people/{personId} | Update person


<a name="createPerson"></a>
# **createPerson**
> PersonEntry createPerson(personBodyCreate, fields)

Create person

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Create a person.  If applicable, the given person&#39;s login access can also be optionally disabled.  You must have admin rights to create a person.  You can set custom properties when you create a person: &#x60;&#x60;&#x60;JSON {   \&quot;id\&quot;: \&quot;abeecher\&quot;,   \&quot;firstName\&quot;: \&quot;Alice\&quot;,   \&quot;lastName\&quot;: \&quot;Beecher\&quot;,   \&quot;displayName\&quot;: \&quot;Alice Beecher\&quot;,   \&quot;email\&quot;: \&quot;abeecher@example.com\&quot;,   \&quot;password\&quot;: \&quot;secret\&quot;,   \&quot;properties\&quot;:   {     \&quot;my:property\&quot;: \&quot;The value\&quot;   } } &#x60;&#x60;&#x60; **Note:** setting properties of type d:content and d:category are not supported. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personBodyCreate** | [**PersonBodyCreate**](PersonBodyCreate.md)| The person details. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**PersonEntry**](PersonEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAvatarImage"></a>
# **deleteAvatarImage**
> deleteAvatarImage(personId)

Delete avatar image

**Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Deletes the avatar image related to person **personId**.  You must be the person or have admin rights to update a person&#39;s avatar.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAvatarImage"></a>
# **getAvatarImage**
> File getAvatarImage(personId, attachment, ifModifiedSince, placeholder)

Get avatar image

**Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Gets the avatar image related to the person **personId**. If the person has no related avatar then the **placeholder** query parameter can be optionally used to request a placeholder image to be returned.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **attachment** | **Boolean**| **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response.  | [optional] [default to true]
 **ifModifiedSince** | **OffsetDateTime**| Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, &#x60;Wed, 09 Mar 2016 16:56:34 GMT&#x60;.  | [optional]
 **placeholder** | **Boolean**| If **true** and there is no avatar for this **personId** then the placeholder image is returned, rather than a 404 response.  | [optional] [default to true]

### Return type

[**File**](File.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="getPerson"></a>
# **getPerson**
> PersonEntry getPerson(personId, fields)

Get a person

Gets information for the person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**PersonEntry**](PersonEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPeople"></a>
# **listPeople**
> PersonPaging listPeople(skipCount, maxItems, orderBy, include, fields)

List people

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  List people.  You can use the **include** parameter to return any additional information.  The default sort order for the returned list is for people to be sorted by ascending id. You can override the default by using the **orderBy** parameter.  You can use any of the following fields to order the results: * id * firstName * lastName 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100]
 **orderBy** | [**List&lt;String&gt;**](String.md)| A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field.  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the person. The following optional fields can be requested: * properties * aspectNames * capabilities  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**PersonPaging**](PersonPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestPasswordReset"></a>
# **requestPasswordReset**
> requestPasswordReset(personId, clientBody)

Request password reset

**Note:** this endpoint is deprecated as of Alfresco 7.1, and will be removed in the future.  Initiates the reset password workflow to send an email with reset password instruction to the user&#39;s registered email.  The client is mandatory in the request body. For example: &#x60;&#x60;&#x60;JSON {   \&quot;client\&quot;: \&quot;myClient\&quot; } &#x60;&#x60;&#x60; **Note:** The client must be registered before this API can send an email. See [server documentation]. However, out-of-the-box share is registered as a default client, so you could pass **share** as the client name: &#x60;&#x60;&#x60;JSON {   \&quot;client\&quot;: \&quot;share\&quot; } &#x60;&#x60;&#x60; **Note:** No authentication is required to call this endpoint. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **clientBody** | [**ClientBody**](ClientBody.md)| The client name to send email with app-specific url. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetPassword"></a>
# **resetPassword**
> resetPassword(personId, passwordResetBody)

Reset password

**Note:** this endpoint is deprecated as of Alfresco 7.1, and will be removed in the future. Resets user&#39;s password  The password, id and key properties are mandatory in the request body. For example: &#x60;&#x60;&#x60;JSON {   \&quot;password\&quot;:\&quot;newPassword\&quot;,   \&quot;id\&quot;:\&quot;activiti$10\&quot;,   \&quot;key\&quot;:\&quot;4dad6d00-0daf-413a-b200-f64af4e12345\&quot; } &#x60;&#x60;&#x60; **Note:** No authentication is required to call this endpoint. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **passwordResetBody** | [**PasswordResetBody**](PasswordResetBody.md)| The reset password details |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAvatarImage"></a>
# **updateAvatarImage**
> updateAvatarImage(personId, contentBodyUpdate)

Update avatar image

**Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Updates the avatar image related to the person **personId**.  The request body should be the binary stream for the avatar image. The content type of the file should be an image file. This will be used to generate an \&quot;avatar\&quot; thumbnail rendition.  You must be the person or have admin rights to update a person&#39;s avatar.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **contentBodyUpdate** | **byte[]**| The binary content |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="updatePerson"></a>
# **updatePerson**
> PersonEntry updatePerson(personId, personBodyUpdate, fields)

Update person

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Update the given person&#39;s details.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user.  If applicable, the given person&#39;s login access can also be optionally disabled or re-enabled.  You must have admin rights to update a person — unless updating your own details.  If you are changing your password, as a non-admin user, then the existing password must also be supplied (using the oldPassword field in addition to the new password value).  Admin users cannot be disabled by setting enabled to false.  Non-admin users may not disable themselves.  You can set custom properties when you update a person: &#x60;&#x60;&#x60;JSON {   \&quot;firstName\&quot;: \&quot;Alice\&quot;,   \&quot;properties\&quot;:   {     \&quot;my:property\&quot;: \&quot;The value\&quot;   } } &#x60;&#x60;&#x60; **Note:** setting properties of type d:content and d:category are not supported. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **personBodyUpdate** | [**PersonBodyUpdate**](PersonBodyUpdate.md)| The person details. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**PersonEntry**](PersonEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

