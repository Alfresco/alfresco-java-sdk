# UsersApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeActionUsingPOST**](UsersApi.md#executeActionUsingPOST) | **POST** /activiti-app/api/enterprise/users/{userId} | Execute an action for a specific user
[**getProfilePictureUsingGET1**](UsersApi.md#getProfilePictureUsingGET1) | **GET** /activiti-app/api/enterprise/users/{userId}/picture | Stream user profile picture
[**getUserUsingGET1**](UsersApi.md#getUserUsingGET1) | **GET** /activiti-app/api/enterprise/users/{userId} | Get a user
[**getUsersUsingGET1**](UsersApi.md#getUsersUsingGET1) | **GET** /activiti-app/api/enterprise/users | Query users
[**requestPasswordResetUsingPOST**](UsersApi.md#requestPasswordResetUsingPOST) | **POST** /activiti-app/api/enterprise/idm/passwords | Request a password reset
[**updateUserUsingPUT**](UsersApi.md#updateUserUsingPUT) | **PUT** /activiti-app/api/enterprise/users/{userId} | Update a user

<a name="executeActionUsingPOST"></a>
# **executeActionUsingPOST**
> executeActionUsingPOST(userId, body)

Execute an action for a specific user

Typical action is updating/reset password

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UsersApi;







UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | userId
UserActionRepresentation body = new UserActionRepresentation(); // UserActionRepresentation | 
try {
    apiInstance.executeActionUsingPOST(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#executeActionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **body** | [**UserActionRepresentation**](UserActionRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getProfilePictureUsingGET1"></a>
# **getProfilePictureUsingGET1**
> getProfilePictureUsingGET1(userId)

Stream user profile picture

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UsersApi;







UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | userId
try {
    apiInstance.getProfilePictureUsingGET1(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getProfilePictureUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUserUsingGET1"></a>
# **getUserUsingGET1**
> UserRepresentation getUserUsingGET1(userId)

Get a user

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UsersApi;







UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | userId
try {
    UserRepresentation result = apiInstance.getUserUsingGET1(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |

### Return type

[**UserRepresentation**](UserRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersUsingGET1"></a>
# **getUsersUsingGET1**
> ResultListDataRepresentationLightUserRepresentation getUsersUsingGET1(filter, email, externalId, externalIdCaseInsensitive, excludeTaskId, excludeProcessId, groupId, tenantId)

Query users

A common use case is that a user wants to select another user (eg. when assigning a task) or group.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UsersApi;







UsersApi apiInstance = new UsersApi();
String filter = "filter_example"; // String | filter
String email = "email_example"; // String | email
String externalId = "externalId_example"; // String | externalId
String externalIdCaseInsensitive = "externalIdCaseInsensitive_example"; // String | externalIdCaseInsensitive
String excludeTaskId = "excludeTaskId_example"; // String | excludeTaskId
String excludeProcessId = "excludeProcessId_example"; // String | excludeProcessId
Long groupId = 789L; // Long | groupId
Long tenantId = 789L; // Long | tenantId
try {
    ResultListDataRepresentationLightUserRepresentation result = apiInstance.getUsersUsingGET1(filter, email, externalId, externalIdCaseInsensitive, excludeTaskId, excludeProcessId, groupId, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| filter | [optional]
 **email** | **String**| email | [optional]
 **externalId** | **String**| externalId | [optional]
 **externalIdCaseInsensitive** | **String**| externalIdCaseInsensitive | [optional]
 **excludeTaskId** | **String**| excludeTaskId | [optional]
 **excludeProcessId** | **String**| excludeProcessId | [optional]
 **groupId** | **Long**| groupId | [optional]
 **tenantId** | **Long**| tenantId | [optional]

### Return type

[**ResultListDataRepresentationLightUserRepresentation**](ResultListDataRepresentationLightUserRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestPasswordResetUsingPOST"></a>
# **requestPasswordResetUsingPOST**
> requestPasswordResetUsingPOST(body)

Request a password reset

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UsersApi;







UsersApi apiInstance = new UsersApi();
ResetPasswordRepresentation body = new ResetPasswordRepresentation(); // ResetPasswordRepresentation | 
try {
    apiInstance.requestPasswordResetUsingPOST(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#requestPasswordResetUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResetPasswordRepresentation**](ResetPasswordRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateUserUsingPUT"></a>
# **updateUserUsingPUT**
> UserRepresentation updateUserUsingPUT(userId, body)

Update a user

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UsersApi;







UsersApi apiInstance = new UsersApi();
Long userId = 789L; // Long | userId
UserRepresentation body = new UserRepresentation(); // UserRepresentation | 
try {
    UserRepresentation result = apiInstance.updateUserUsingPUT(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **body** | [**UserRepresentation**](UserRepresentation.md)|  | [optional]

### Return type

[**UserRepresentation**](UserRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

