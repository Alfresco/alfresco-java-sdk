# SecurityMarksApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSecurityMark**](SecurityMarksApi.md#createSecurityMark) | **POST** /security-groups/{securityGroupId}/security-marks | Create a security mark in the security group with id **securityGroupId**.
[**deleteSecurityMark**](SecurityMarksApi.md#deleteSecurityMark) | **DELETE** /security-groups/{securityGroupId}/security-marks/{securityMarkId} | Delete a security mark from a security group
[**getSecurityGroupMark**](SecurityMarksApi.md#getSecurityGroupMark) | **GET** /security-groups/{securityGroupId}/security-marks/{securityMarkId} | Get security mark information
[**getSecurityGroupMarks**](SecurityMarksApi.md#getSecurityGroupMarks) | **GET** /security-groups/{securityGroupId}/security-marks | Gets all the marks in a security group
[**updateSecurityMark**](SecurityMarksApi.md#updateSecurityMark) | **PUT** /security-groups/{securityGroupId}/security-marks/{securityMarkId} | Update a security mark with id **securityMarkId**


<a name="createSecurityMark"></a>
# **createSecurityMark**
> SecurityMarkModel createSecurityMark(securityGroupId, securityMark)

Create a security mark in the security group with id **securityGroupId**.

Creates a new security mark.  **Note:** You can create more than one security mark by specifying a list of marks in the JSON body. For example, the following JSON body creates two security marks: &#x60;&#x60;&#x60;JSON [ {   \&quot;name\&quot;:\&quot;SecurityMark1\&quot; }, {   \&quot;name\&quot;:\&quot;SecurityMark2\&quot; } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example: &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [     {       \&quot;entry\&quot;: {                  ...       }     },     {       \&quot;entry\&quot;: {                  ...       }     }     ]   } } &#x60;&#x60;&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityGroupId** | **String**| The identifier for the security group |
 **securityMark** | [**SecurityMarkModel**](SecurityMarkModel.md)| Security Mark |

### Return type

[**SecurityMarkModel**](SecurityMarkModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSecurityMark"></a>
# **deleteSecurityMark**
> deleteSecurityMark(securityGroupId, securityMarkId)

Delete a security mark from a security group

Deletes the security mark with id **securityMarkId**.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityGroupId** | **String**| The identifier for the security group |
 **securityMarkId** | **String**| The identifier for the security mark |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityGroupMark"></a>
# **getSecurityGroupMark**
> SecurityMarkModel getSecurityGroupMark(securityGroupId, securityMarkId)

Get security mark information

Gets the security mark with id **securityMarkId** from security group with id **securityGroupId**.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityGroupId** | **String**| The identifier for the security group |
 **securityMarkId** | **String**| The identifier for the security mark |

### Return type

[**SecurityMarkModel**](SecurityMarkModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityGroupMarks"></a>
# **getSecurityGroupMarks**
> SecurityMarksPaging getSecurityGroupMarks(securityGroupId)

Gets all the marks in a security group

Gets all the marks in a security group with id **securityGroupId**.  **Note:** The control of the list size using pagination is currently not supported. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityGroupId** | **String**| The identifier for the security group |

### Return type

[**SecurityMarksPaging**](SecurityMarksPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSecurityMark"></a>
# **updateSecurityMark**
> SecurityMarkModel updateSecurityMark(securityGroupId, securityMarkId, securityMark)

Update a security mark with id **securityMarkId**

Updates the security mark with id **securityMarkId**. For example, you can rename a security mark.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityGroupId** | **String**| The identifier for the security group |
 **securityMarkId** | **String**| The identifier for the security mark |
 **securityMark** | [**SecurityMarkModel**](SecurityMarkModel.md)| Security Mark |

### Return type

[**SecurityMarkModel**](SecurityMarkModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

