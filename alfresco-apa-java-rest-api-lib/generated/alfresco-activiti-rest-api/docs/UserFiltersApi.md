# UserFiltersApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserProcessInstanceFilterUsingPOST**](UserFiltersApi.md#createUserProcessInstanceFilterUsingPOST) | **POST** /activiti-app/api/enterprise/filters/processes | Create a process instance filter
[**createUserTaskFilterUsingPOST**](UserFiltersApi.md#createUserTaskFilterUsingPOST) | **POST** /activiti-app/api/enterprise/filters/tasks | Create a task filter
[**deleteUserProcessInstanceFilterUsingDELETE**](UserFiltersApi.md#deleteUserProcessInstanceFilterUsingDELETE) | **DELETE** /activiti-app/api/enterprise/filters/processes/{userFilterId} | Delete a process instance filter
[**deleteUserTaskFilterUsingDELETE**](UserFiltersApi.md#deleteUserTaskFilterUsingDELETE) | **DELETE** /activiti-app/api/enterprise/filters/tasks/{userFilterId} | Delete a task filter
[**getUserProcessInstanceFilterUsingGET**](UserFiltersApi.md#getUserProcessInstanceFilterUsingGET) | **GET** /activiti-app/api/enterprise/filters/processes/{userFilterId} | Get a process instance filter
[**getUserProcessInstanceFiltersUsingGET**](UserFiltersApi.md#getUserProcessInstanceFiltersUsingGET) | **GET** /activiti-app/api/enterprise/filters/processes | List process instance filters
[**getUserTaskFilterUsingGET**](UserFiltersApi.md#getUserTaskFilterUsingGET) | **GET** /activiti-app/api/enterprise/filters/tasks/{userFilterId} | Get a task filter
[**getUserTaskFiltersUsingGET**](UserFiltersApi.md#getUserTaskFiltersUsingGET) | **GET** /activiti-app/api/enterprise/filters/tasks | List task filters
[**orderUserProcessInstanceFiltersUsingPUT**](UserFiltersApi.md#orderUserProcessInstanceFiltersUsingPUT) | **PUT** /activiti-app/api/enterprise/filters/processes | Re-order the list of user process instance filters
[**orderUserTaskFiltersUsingPUT**](UserFiltersApi.md#orderUserTaskFiltersUsingPUT) | **PUT** /activiti-app/api/enterprise/filters/tasks | Re-order the list of user task filters
[**updateUserProcessInstanceFilterUsingPUT**](UserFiltersApi.md#updateUserProcessInstanceFilterUsingPUT) | **PUT** /activiti-app/api/enterprise/filters/processes/{userFilterId} | Update a process instance filter
[**updateUserTaskFilterUsingPUT**](UserFiltersApi.md#updateUserTaskFilterUsingPUT) | **PUT** /activiti-app/api/enterprise/filters/tasks/{userFilterId} | Update a task filter

<a name="createUserProcessInstanceFilterUsingPOST"></a>
# **createUserProcessInstanceFilterUsingPOST**
> UserProcessInstanceFilterRepresentation createUserProcessInstanceFilterUsingPOST(body)

Create a process instance filter

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserFiltersApi;







UserFiltersApi apiInstance = new UserFiltersApi();
UserProcessInstanceFilterRepresentation body = new UserProcessInstanceFilterRepresentation(); // UserProcessInstanceFilterRepresentation | 
try {
    UserProcessInstanceFilterRepresentation result = apiInstance.createUserProcessInstanceFilterUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#createUserProcessInstanceFilterUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserProcessInstanceFilterRepresentation**](UserProcessInstanceFilterRepresentation.md)|  | [optional]

### Return type

[**UserProcessInstanceFilterRepresentation**](UserProcessInstanceFilterRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUserTaskFilterUsingPOST"></a>
# **createUserTaskFilterUsingPOST**
> UserTaskFilterRepresentation createUserTaskFilterUsingPOST(body)

Create a task filter

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserFiltersApi;







UserFiltersApi apiInstance = new UserFiltersApi();
UserTaskFilterRepresentation body = new UserTaskFilterRepresentation(); // UserTaskFilterRepresentation | 
try {
    UserTaskFilterRepresentation result = apiInstance.createUserTaskFilterUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#createUserTaskFilterUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserTaskFilterRepresentation**](UserTaskFilterRepresentation.md)|  | [optional]

### Return type

[**UserTaskFilterRepresentation**](UserTaskFilterRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserProcessInstanceFilterUsingDELETE"></a>
# **deleteUserProcessInstanceFilterUsingDELETE**
> deleteUserProcessInstanceFilterUsingDELETE(userFilterId)

Delete a process instance filter

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserFiltersApi;







UserFiltersApi apiInstance = new UserFiltersApi();
Long userFilterId = 789L; // Long | userFilterId
try {
    apiInstance.deleteUserProcessInstanceFilterUsingDELETE(userFilterId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#deleteUserProcessInstanceFilterUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userFilterId** | **Long**| userFilterId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUserTaskFilterUsingDELETE"></a>
# **deleteUserTaskFilterUsingDELETE**
> deleteUserTaskFilterUsingDELETE(userFilterId)

Delete a task filter

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserFiltersApi;







UserFiltersApi apiInstance = new UserFiltersApi();
Long userFilterId = 789L; // Long | userFilterId
try {
    apiInstance.deleteUserTaskFilterUsingDELETE(userFilterId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#deleteUserTaskFilterUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userFilterId** | **Long**| userFilterId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUserProcessInstanceFilterUsingGET"></a>
# **getUserProcessInstanceFilterUsingGET**
> UserProcessInstanceFilterRepresentation getUserProcessInstanceFilterUsingGET(userFilterId)

Get a process instance filter

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserFiltersApi;







UserFiltersApi apiInstance = new UserFiltersApi();
Long userFilterId = 789L; // Long | userFilterId
try {
    UserProcessInstanceFilterRepresentation result = apiInstance.getUserProcessInstanceFilterUsingGET(userFilterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#getUserProcessInstanceFilterUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userFilterId** | **Long**| userFilterId |

### Return type

[**UserProcessInstanceFilterRepresentation**](UserProcessInstanceFilterRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserProcessInstanceFiltersUsingGET"></a>
# **getUserProcessInstanceFiltersUsingGET**
> ResultListDataRepresentationUserProcessInstanceFilterRepresentation getUserProcessInstanceFiltersUsingGET(appId)

List process instance filters

Returns filters for the current user, optionally filtered by *appId*.

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserFiltersApi;







UserFiltersApi apiInstance = new UserFiltersApi();
Long appId = 789L; // Long | appId
try {
    ResultListDataRepresentationUserProcessInstanceFilterRepresentation result = apiInstance.getUserProcessInstanceFiltersUsingGET(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#getUserProcessInstanceFiltersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| appId | [optional]

### Return type

[**ResultListDataRepresentationUserProcessInstanceFilterRepresentation**](ResultListDataRepresentationUserProcessInstanceFilterRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserTaskFilterUsingGET"></a>
# **getUserTaskFilterUsingGET**
> UserTaskFilterRepresentation getUserTaskFilterUsingGET(userFilterId)

Get a task filter

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserFiltersApi;







UserFiltersApi apiInstance = new UserFiltersApi();
Long userFilterId = 789L; // Long | userFilterId
try {
    UserTaskFilterRepresentation result = apiInstance.getUserTaskFilterUsingGET(userFilterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#getUserTaskFilterUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userFilterId** | **Long**| userFilterId |

### Return type

[**UserTaskFilterRepresentation**](UserTaskFilterRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserTaskFiltersUsingGET"></a>
# **getUserTaskFiltersUsingGET**
> ResultListDataRepresentationUserTaskFilterRepresentation getUserTaskFiltersUsingGET(appId)

List task filters

Returns filters for the current user, optionally filtered by *appId*.

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserFiltersApi;







UserFiltersApi apiInstance = new UserFiltersApi();
Long appId = 789L; // Long | appId
try {
    ResultListDataRepresentationUserTaskFilterRepresentation result = apiInstance.getUserTaskFiltersUsingGET(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#getUserTaskFiltersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **Long**| appId | [optional]

### Return type

[**ResultListDataRepresentationUserTaskFilterRepresentation**](ResultListDataRepresentationUserTaskFilterRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderUserProcessInstanceFiltersUsingPUT"></a>
# **orderUserProcessInstanceFiltersUsingPUT**
> orderUserProcessInstanceFiltersUsingPUT(body)

Re-order the list of user process instance filters

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserFiltersApi;







UserFiltersApi apiInstance = new UserFiltersApi();
UserFilterOrderRepresentation body = new UserFilterOrderRepresentation(); // UserFilterOrderRepresentation | 
try {
    apiInstance.orderUserProcessInstanceFiltersUsingPUT(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#orderUserProcessInstanceFiltersUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserFilterOrderRepresentation**](UserFilterOrderRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="orderUserTaskFiltersUsingPUT"></a>
# **orderUserTaskFiltersUsingPUT**
> orderUserTaskFiltersUsingPUT(body)

Re-order the list of user task filters

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserFiltersApi;







UserFiltersApi apiInstance = new UserFiltersApi();
UserFilterOrderRepresentation body = new UserFilterOrderRepresentation(); // UserFilterOrderRepresentation | 
try {
    apiInstance.orderUserTaskFiltersUsingPUT(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#orderUserTaskFiltersUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserFilterOrderRepresentation**](UserFilterOrderRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateUserProcessInstanceFilterUsingPUT"></a>
# **updateUserProcessInstanceFilterUsingPUT**
> UserProcessInstanceFilterRepresentation updateUserProcessInstanceFilterUsingPUT(userFilterId, body)

Update a process instance filter

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserFiltersApi;







UserFiltersApi apiInstance = new UserFiltersApi();
Long userFilterId = 789L; // Long | userFilterId
UserProcessInstanceFilterRepresentation body = new UserProcessInstanceFilterRepresentation(); // UserProcessInstanceFilterRepresentation | 
try {
    UserProcessInstanceFilterRepresentation result = apiInstance.updateUserProcessInstanceFilterUsingPUT(userFilterId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#updateUserProcessInstanceFilterUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userFilterId** | **Long**| userFilterId |
 **body** | [**UserProcessInstanceFilterRepresentation**](UserProcessInstanceFilterRepresentation.md)|  | [optional]

### Return type

[**UserProcessInstanceFilterRepresentation**](UserProcessInstanceFilterRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserTaskFilterUsingPUT"></a>
# **updateUserTaskFilterUsingPUT**
> UserTaskFilterRepresentation updateUserTaskFilterUsingPUT(userFilterId, body)

Update a task filter

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.UserFiltersApi;







UserFiltersApi apiInstance = new UserFiltersApi();
Long userFilterId = 789L; // Long | userFilterId
UserTaskFilterRepresentation body = new UserTaskFilterRepresentation(); // UserTaskFilterRepresentation | 
try {
    UserTaskFilterRepresentation result = apiInstance.updateUserTaskFilterUsingPUT(userFilterId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#updateUserTaskFilterUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userFilterId** | **Long**| userFilterId |
 **body** | [**UserTaskFilterRepresentation**](UserTaskFilterRepresentation.md)|  | [optional]

### Return type

[**UserTaskFilterRepresentation**](UserTaskFilterRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

