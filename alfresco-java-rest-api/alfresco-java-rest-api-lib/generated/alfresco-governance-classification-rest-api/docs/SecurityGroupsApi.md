# SecurityGroupsApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSecurityGroup**](SecurityGroupsApi.md#createSecurityGroup) | **POST** /security-groups | Create a security group
[**deleteSecurityGroup**](SecurityGroupsApi.md#deleteSecurityGroup) | **DELETE** /security-groups/{securityGroupId} | Delete a security group
[**getSecurityGroup**](SecurityGroupsApi.md#getSecurityGroup) | **GET** /security-groups/{securityGroupId} | Get security group information
[**listSecurityGroups**](SecurityGroupsApi.md#listSecurityGroups) | **GET** /security-groups | List all security groups
[**updateSecurityGroup**](SecurityGroupsApi.md#updateSecurityGroup) | **PUT** /security-groups/{securityGroupId} | Update a security group


<a name="createSecurityGroup"></a>
# **createSecurityGroup**
> SecurityGroupModel createSecurityGroup(securityGroup)

Create a security group

Creates a new security group.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityGroup** | [**SecurityGroupModel**](SecurityGroupModel.md)| Security Group |

### Return type

[**SecurityGroupModel**](SecurityGroupModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSecurityGroup"></a>
# **deleteSecurityGroup**
> deleteSecurityGroup(securityGroupId)

Delete a security group

Deletes the security group with id **securityGroupId**, including any marks.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityGroupId** | **String**| The identifier for the security group |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityGroup"></a>
# **getSecurityGroup**
> SecurityGroupModel getSecurityGroup(securityGroupId, include)

Get security group information

Gets the security group with id **securityGroupId**.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityGroupId** | **String**| The identifier for the security group |
 **include** | **String**| The extra fields that should be added in the response. | [optional]

### Return type

[**SecurityGroupModel**](SecurityGroupModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSecurityGroups"></a>
# **listSecurityGroups**
> SecurityGroupPaging listSecurityGroups(include)

List all security groups

Gets all security groups.  **Note:** The control of the list size using pagination is currently not supported. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | **String**| The extra fields that should be added in the response. | [optional]

### Return type

[**SecurityGroupPaging**](SecurityGroupPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSecurityGroup"></a>
# **updateSecurityGroup**
> SecurityGroupModel updateSecurityGroup(securityGroupId, securityGroup)

Update a security group

Updates the security group with id **securityGroupId**. For example, you can rename a security group.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityGroupId** | **String**| The identifier for the security group |
 **securityGroup** | [**SecurityGroupModel**](SecurityGroupModel.md)| Security Group |

### Return type

[**SecurityGroupModel**](SecurityGroupModel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

