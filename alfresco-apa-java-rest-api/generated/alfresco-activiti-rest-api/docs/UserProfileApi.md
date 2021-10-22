# UserProfileApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePasswordUsingPOST**](UserProfileApi.md#changePasswordUsingPOST) | **POST** /activiti-app/api/enterprise/profile-password | Change user password
[**getProfilePictureUsingGET**](UserProfileApi.md#getProfilePictureUsingGET) | **GET** /activiti-app/api/enterprise/profile-picture | Retrieve user profile picture
[**getProfileUsingGET**](UserProfileApi.md#getProfileUsingGET) | **GET** /activiti-app/api/enterprise/profile | Get user profile
[**updateUserUsingPOST**](UserProfileApi.md#updateUserUsingPOST) | **POST** /activiti-app/api/enterprise/profile | Update user profile
[**uploadProfilePictureUsingPOST**](UserProfileApi.md#uploadProfilePictureUsingPOST) | **POST** /activiti-app/api/enterprise/profile-picture | Change user profile picture

<a name="changePasswordUsingPOST"></a>
# **changePasswordUsingPOST**
> changePasswordUsingPOST(body)

Change user password

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserProfileApi;







UserProfileApi apiInstance = new UserProfileApi();
ChangePasswordRepresentation body = new ChangePasswordRepresentation(); // ChangePasswordRepresentation | 
try {
    apiInstance.changePasswordUsingPOST(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#changePasswordUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChangePasswordRepresentation**](ChangePasswordRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getProfilePictureUsingGET"></a>
# **getProfilePictureUsingGET**
> getProfilePictureUsingGET()

Retrieve user profile picture

Generally returns an image file

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserProfileApi;







UserProfileApi apiInstance = new UserProfileApi();
try {
    apiInstance.getProfilePictureUsingGET();
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#getProfilePictureUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getProfileUsingGET"></a>
# **getProfileUsingGET**
> UserRepresentation getProfileUsingGET()

Get user profile

This operation returns account information for the current user. This is useful to get the name, email, the groups that the user is part of, the user picture, etc.

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserProfileApi;







UserProfileApi apiInstance = new UserProfileApi();
try {
    UserRepresentation result = apiInstance.getProfileUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#getProfileUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserRepresentation**](UserRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUserUsingPOST"></a>
# **updateUserUsingPOST**
> UserRepresentation updateUserUsingPOST(body)

Update user profile

Only a first name, last name, email and company can be updated

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserProfileApi;







UserProfileApi apiInstance = new UserProfileApi();
UserRepresentation body = new UserRepresentation(); // UserRepresentation | 
try {
    UserRepresentation result = apiInstance.updateUserUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#updateUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserRepresentation**](UserRepresentation.md)|  | [optional]

### Return type

[**UserRepresentation**](UserRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadProfilePictureUsingPOST"></a>
# **uploadProfilePictureUsingPOST**
> ImageUploadRepresentation uploadProfilePictureUsingPOST(body)

Change user profile picture

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserProfileApi;







UserProfileApi apiInstance = new UserProfileApi();
Object body = null; // Object | 
try {
    ImageUploadRepresentation result = apiInstance.uploadProfilePictureUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#uploadProfilePictureUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**|  | [optional]

### Return type

[**ImageUploadRepresentation**](ImageUploadRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: application/json

