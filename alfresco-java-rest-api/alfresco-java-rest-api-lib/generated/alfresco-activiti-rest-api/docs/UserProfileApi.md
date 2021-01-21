# UserProfileApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePasswordUsingPOST**](UserProfileApi.md#changePasswordUsingPOST) | **POST** /enterprise/profile-password | Change user password
[**getProfilePictureUsingGET**](UserProfileApi.md#getProfilePictureUsingGET) | **GET** /enterprise/profile-picture | Retrieve user profile picture
[**getProfileUsingGET**](UserProfileApi.md#getProfileUsingGET) | **GET** /enterprise/profile | Get user profile
[**updateProfile**](UserProfileApi.md#updateProfile) | **POST** /enterprise/profile | Update user profile
[**uploadProfilePictureUsingPOST**](UserProfileApi.md#uploadProfilePictureUsingPOST) | **POST** /enterprise/profile-picture | Change user profile picture


<a name="changePasswordUsingPOST"></a>
# **changePasswordUsingPOST**
> changePasswordUsingPOST(changePasswordRepresentation)

Change user password

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserProfileApi;








UserProfileApi apiInstance = new UserProfileApi();
ChangePasswordRepresentation changePasswordRepresentation = new ChangePasswordRepresentation(); // ChangePasswordRepresentation | changePasswordRepresentation
try {
    apiInstance.changePasswordUsingPOST(changePasswordRepresentation);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#changePasswordUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changePasswordRepresentation** | [**ChangePasswordRepresentation**](ChangePasswordRepresentation.md)| changePasswordRepresentation |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProfilePictureUsingGET"></a>
# **getProfilePictureUsingGET**
> File getProfilePictureUsingGET()

Retrieve user profile picture

Generally returns an image file

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserProfileApi;








UserProfileApi apiInstance = new UserProfileApi();
try {
    File result = apiInstance.getProfilePictureUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#getProfilePictureUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**File**](File.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

<a name="getProfileUsingGET"></a>
# **getProfileUsingGET**
> UserRepresentation getProfileUsingGET()

Get user profile

This operation returns account information for the current user. This is useful to get the name, email, the groups that the user is part of, the user picture, etc.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserProfileApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProfile"></a>
# **updateProfile**
> UserRepresentation updateProfile(userRepresentation)

Update user profile

Only a first name, last name, email and company can be updated

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserProfileApi;








UserProfileApi apiInstance = new UserProfileApi();
UserRepresentation userRepresentation = new UserRepresentation(); // UserRepresentation | userRepresentation
try {
    UserRepresentation result = apiInstance.updateProfile(userRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#updateProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userRepresentation** | [**UserRepresentation**](UserRepresentation.md)| userRepresentation |

### Return type

[**UserRepresentation**](UserRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadProfilePictureUsingPOST"></a>
# **uploadProfilePictureUsingPOST**
> ImageUploadRepresentation uploadProfilePictureUsingPOST(file)

Change user profile picture

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserProfileApi;








UserProfileApi apiInstance = new UserProfileApi();
File file = new File("/path/to/file.txt"); // File | file
try {
    ImageUploadRepresentation result = apiInstance.uploadProfilePictureUsingPOST(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileApi#uploadProfilePictureUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| file |

### Return type

[**ImageUploadRepresentation**](ImageUploadRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

