# AdminUsersApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkUpdateUsersUsingPUT**](AdminUsersApi.md#bulkUpdateUsersUsingPUT) | **PUT** /enterprise/admin/users | Bulk update a list of users
[**createNewUserUsingPOST**](AdminUsersApi.md#createNewUserUsingPOST) | **POST** /enterprise/admin/users | Create a user
[**getUserUsingGET**](AdminUsersApi.md#getUserUsingGET) | **GET** /enterprise/admin/users/{userId} | Get a user
[**getUsersUsingGET**](AdminUsersApi.md#getUsersUsingGET) | **GET** /enterprise/admin/users | Query users
[**updateUserDetailsUsingPUT**](AdminUsersApi.md#updateUserDetailsUsingPUT) | **PUT** /enterprise/admin/users/{userId} | Update a user


<a name="bulkUpdateUsersUsingPUT"></a>
# **bulkUpdateUsersUsingPUT**
> bulkUpdateUsersUsingPUT(update)

Bulk update a list of users

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminUsersApi;








AdminUsersApi apiInstance = new AdminUsersApi();
BulkUserUpdateRepresentation update = new BulkUserUpdateRepresentation(); // BulkUserUpdateRepresentation | update
try {
    apiInstance.bulkUpdateUsersUsingPUT(update);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminUsersApi#bulkUpdateUsersUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update** | [**BulkUserUpdateRepresentation**](BulkUserUpdateRepresentation.md)| update |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNewUserUsingPOST"></a>
# **createNewUserUsingPOST**
> UserRepresentation createNewUserUsingPOST(userRepresentation)

Create a user

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminUsersApi;








AdminUsersApi apiInstance = new AdminUsersApi();
UserRepresentation userRepresentation = new UserRepresentation(); // UserRepresentation | userRepresentation
try {
    UserRepresentation result = apiInstance.createNewUserUsingPOST(userRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminUsersApi#createNewUserUsingPOST");
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

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> AbstractUserRepresentation getUserUsingGET(userId, summary)

Get a user

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminUsersApi;








AdminUsersApi apiInstance = new AdminUsersApi();
Long userId = 789L; // Long | userId
Boolean summary = true; // Boolean | summary
try {
    AbstractUserRepresentation result = apiInstance.getUserUsingGET(userId, summary);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminUsersApi#getUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **summary** | **Boolean**| summary | [optional]

### Return type

[**AbstractUserRepresentation**](AbstractUserRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsersUsingGET"></a>
# **getUsersUsingGET**
> ResultListDataRepresentationAbstractUserRepresentation getUsersUsingGET(filter, status, accountType, sort, company, start, page, size, groupId, tenantId, summary)

Query users

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminUsersApi;








AdminUsersApi apiInstance = new AdminUsersApi();
String filter = "filter_example"; // String | filter
String status = "status_example"; // String | status
String accountType = "accountType_example"; // String | accountType
String sort = "sort_example"; // String | sort
String company = "company_example"; // String | company
Integer start = 56; // Integer | start
Integer page = 56; // Integer | page
Integer size = 56; // Integer | size
Long groupId = 789L; // Long | groupId
Long tenantId = 789L; // Long | tenantId
Boolean summary = true; // Boolean | summary
try {
    ResultListDataRepresentationAbstractUserRepresentation result = apiInstance.getUsersUsingGET(filter, status, accountType, sort, company, start, page, size, groupId, tenantId, summary);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminUsersApi#getUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| filter | [optional]
 **status** | **String**| status | [optional]
 **accountType** | **String**| accountType | [optional]
 **sort** | **String**| sort | [optional]
 **company** | **String**| company | [optional]
 **start** | **Integer**| start | [optional]
 **page** | **Integer**| page | [optional]
 **size** | **Integer**| size | [optional]
 **groupId** | **Long**| groupId | [optional]
 **tenantId** | **Long**| tenantId | [optional]
 **summary** | **Boolean**| summary | [optional]

### Return type

[**ResultListDataRepresentationAbstractUserRepresentation**](ResultListDataRepresentationAbstractUserRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserDetailsUsingPUT"></a>
# **updateUserDetailsUsingPUT**
> updateUserDetailsUsingPUT(userId, userRepresentation)

Update a user

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminUsersApi;








AdminUsersApi apiInstance = new AdminUsersApi();
Long userId = 789L; // Long | userId
UserRepresentation userRepresentation = new UserRepresentation(); // UserRepresentation | userRepresentation
try {
    apiInstance.updateUserDetailsUsingPUT(userId, userRepresentation);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminUsersApi#updateUserDetailsUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **userRepresentation** | [**UserRepresentation**](UserRepresentation.md)| userRepresentation |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

