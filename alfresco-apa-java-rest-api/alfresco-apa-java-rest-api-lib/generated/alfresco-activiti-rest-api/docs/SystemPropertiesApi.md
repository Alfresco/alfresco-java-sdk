# SystemPropertiesApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGlobalDateFormatUsingGET**](SystemPropertiesApi.md#getGlobalDateFormatUsingGET) | **GET** /activiti-app/api/enterprise/system/properties/global-date-format/{tenantId} | Get global date format
[**getPasswordValidationConstraintsUsingGET**](SystemPropertiesApi.md#getPasswordValidationConstraintsUsingGET) | **GET** /activiti-app/api/enterprise/system/properties/password-validation-constraints/{tenantId} | Get password validation constraints
[**getPropertiesUsingGET**](SystemPropertiesApi.md#getPropertiesUsingGET) | **GET** /activiti-app/api/enterprise/system/properties | Retrieve system properties
[**involvedUsersCanEditFormsUsingGET**](SystemPropertiesApi.md#involvedUsersCanEditFormsUsingGET) | **GET** /activiti-app/api/enterprise/system/properties/involved-users-can-edit-forms/{tenantId} | Get involved users who can edit forms

<a name="getGlobalDateFormatUsingGET"></a>
# **getGlobalDateFormatUsingGET**
> GlobalDateFormatRepresentation getGlobalDateFormatUsingGET(tenantId)

Get global date format

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.SystemPropertiesApi;







SystemPropertiesApi apiInstance = new SystemPropertiesApi();
Long tenantId = 789L; // Long | tenantId
try {
    GlobalDateFormatRepresentation result = apiInstance.getGlobalDateFormatUsingGET(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemPropertiesApi#getGlobalDateFormatUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId |

### Return type

[**GlobalDateFormatRepresentation**](GlobalDateFormatRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPasswordValidationConstraintsUsingGET"></a>
# **getPasswordValidationConstraintsUsingGET**
> PasswordValidationConstraints getPasswordValidationConstraintsUsingGET(tenantId)

Get password validation constraints

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.SystemPropertiesApi;







SystemPropertiesApi apiInstance = new SystemPropertiesApi();
Long tenantId = 789L; // Long | tenantId
try {
    PasswordValidationConstraints result = apiInstance.getPasswordValidationConstraintsUsingGET(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemPropertiesApi#getPasswordValidationConstraintsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId |

### Return type

[**PasswordValidationConstraints**](PasswordValidationConstraints.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPropertiesUsingGET"></a>
# **getPropertiesUsingGET**
> SystemPropertiesRepresentation getPropertiesUsingGET()

Retrieve system properties

Typical value is AllowInvolveByEmail

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.SystemPropertiesApi;







SystemPropertiesApi apiInstance = new SystemPropertiesApi();
try {
    SystemPropertiesRepresentation result = apiInstance.getPropertiesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemPropertiesApi#getPropertiesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemPropertiesRepresentation**](SystemPropertiesRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="involvedUsersCanEditFormsUsingGET"></a>
# **involvedUsersCanEditFormsUsingGET**
> Boolean involvedUsersCanEditFormsUsingGET(tenantId)

Get involved users who can edit forms

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.SystemPropertiesApi;







SystemPropertiesApi apiInstance = new SystemPropertiesApi();
Long tenantId = 789L; // Long | tenantId
try {
    Boolean result = apiInstance.involvedUsersCanEditFormsUsingGET(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemPropertiesApi#involvedUsersCanEditFormsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId |

### Return type

**Boolean**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

