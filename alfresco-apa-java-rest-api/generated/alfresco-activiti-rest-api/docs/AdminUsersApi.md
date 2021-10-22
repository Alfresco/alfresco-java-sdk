# AdminUsersApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkUpdateUsersUsingPUT**](AdminUsersApi.md#bulkUpdateUsersUsingPUT) | **PUT** /activiti-app/api/enterprise/admin/users | Bulk update a list of users
[**createNewUserUsingPOST**](AdminUsersApi.md#createNewUserUsingPOST) | **POST** /activiti-app/api/enterprise/admin/users | Create a user
[**getUserUsingGET**](AdminUsersApi.md#getUserUsingGET) | **GET** /activiti-app/api/enterprise/admin/users/{userId} | Get a user
[**getUsersUsingGET**](AdminUsersApi.md#getUsersUsingGET) | **GET** /activiti-app/api/enterprise/admin/users | Query users
[**updateUserDetailsUsingPUT**](AdminUsersApi.md#updateUserDetailsUsingPUT) | **PUT** /activiti-app/api/enterprise/admin/users/{userId} | Update a user

<a name="bulkUpdateUsersUsingPUT"></a>
# **bulkUpdateUsersUsingPUT**
> bulkUpdateUsersUsingPUT(body)

Bulk update a list of users

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AdminUsersApi;







AdminUsersApi apiInstance = new AdminUsersApi();
BulkUserUpdateRepresentation body = new BulkUserUpdateRepresentation(); // BulkUserUpdateRepresentation | 
try {
    apiInstance.bulkUpdateUsersUsingPUT(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminUsersApi#bulkUpdateUsersUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulkUserUpdateRepresentation**](BulkUserUpdateRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createNewUserUsingPOST"></a>
# **createNewUserUsingPOST**
> UserRepresentation createNewUserUsingPOST(body)

Create a user

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AdminUsersApi;







AdminUsersApi apiInstance = new AdminUsersApi();
UserRepresentation body = new UserRepresentation(); // UserRepresentation | 
try {
    UserRepresentation result = apiInstance.createNewUserUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminUsersApi#createNewUserUsingPOST");
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

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> AbstractUserRepresentation getUserUsingGET(userId, summary)

Get a user

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AdminUsersApi;







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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersUsingGET"></a>
# **getUsersUsingGET**
> ResultListDataRepresentationAbstractUserRepresentation getUsersUsingGET(filter, status, accountType, sort, company, start, page, size, groupId, tenantId, summary)

Query users

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AdminUsersApi;







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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUserDetailsUsingPUT"></a>
# **updateUserDetailsUsingPUT**
> updateUserDetailsUsingPUT(userId, body)

Update a user

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.AdminUsersApi;







AdminUsersApi apiInstance = new AdminUsersApi();
Long userId = 789L; // Long | userId
UserRepresentation body = new UserRepresentation(); // UserRepresentation | 
try {
    apiInstance.updateUserDetailsUsingPUT(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminUsersApi#updateUserDetailsUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| userId |
 **body** | [**UserRepresentation**](UserRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

