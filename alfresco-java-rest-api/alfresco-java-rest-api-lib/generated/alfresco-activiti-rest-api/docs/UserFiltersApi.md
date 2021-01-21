# UserFiltersApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserProcessInstanceFilterUsingPOST**](UserFiltersApi.md#createUserProcessInstanceFilterUsingPOST) | **POST** /enterprise/filters/processes | Create a process instance filter
[**createUserTaskFilterUsingPOST**](UserFiltersApi.md#createUserTaskFilterUsingPOST) | **POST** /enterprise/filters/tasks | Create a task filter
[**deleteUserProcessInstanceFilterUsingDELETE**](UserFiltersApi.md#deleteUserProcessInstanceFilterUsingDELETE) | **DELETE** /enterprise/filters/processes/{userFilterId} | Delete a process instance filter
[**deleteUserTaskFilterUsingDELETE**](UserFiltersApi.md#deleteUserTaskFilterUsingDELETE) | **DELETE** /enterprise/filters/tasks/{userFilterId} | Delete a task filter
[**getUserProcessInstanceFilterUsingGET**](UserFiltersApi.md#getUserProcessInstanceFilterUsingGET) | **GET** /enterprise/filters/processes/{userFilterId} | Get a process instance filter
[**getUserProcessInstanceFiltersUsingGET**](UserFiltersApi.md#getUserProcessInstanceFiltersUsingGET) | **GET** /enterprise/filters/processes | List process instance filters
[**getUserTaskFilterUsingGET**](UserFiltersApi.md#getUserTaskFilterUsingGET) | **GET** /enterprise/filters/tasks/{userFilterId} | Get a task filter
[**getUserTaskFiltersUsingGET**](UserFiltersApi.md#getUserTaskFiltersUsingGET) | **GET** /enterprise/filters/tasks | List task filters
[**orderUserProcessInstanceFiltersUsingPUT**](UserFiltersApi.md#orderUserProcessInstanceFiltersUsingPUT) | **PUT** /enterprise/filters/processes | Re-order the list of user process instance filters
[**orderUserTaskFiltersUsingPUT**](UserFiltersApi.md#orderUserTaskFiltersUsingPUT) | **PUT** /enterprise/filters/tasks | Re-order the list of user task filters
[**updateUserProcessInstanceFilterUsingPUT**](UserFiltersApi.md#updateUserProcessInstanceFilterUsingPUT) | **PUT** /enterprise/filters/processes/{userFilterId} | Update a process instance filter
[**updateUserTaskFilterUsingPUT**](UserFiltersApi.md#updateUserTaskFilterUsingPUT) | **PUT** /enterprise/filters/tasks/{userFilterId} | Update a task filter


<a name="createUserProcessInstanceFilterUsingPOST"></a>
# **createUserProcessInstanceFilterUsingPOST**
> UserProcessInstanceFilterRepresentation createUserProcessInstanceFilterUsingPOST(userProcessInstanceFilterRepresentation)

Create a process instance filter

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserFiltersApi;








UserFiltersApi apiInstance = new UserFiltersApi();
UserProcessInstanceFilterRepresentation userProcessInstanceFilterRepresentation = new UserProcessInstanceFilterRepresentation(); // UserProcessInstanceFilterRepresentation | userProcessInstanceFilterRepresentation
try {
    UserProcessInstanceFilterRepresentation result = apiInstance.createUserProcessInstanceFilterUsingPOST(userProcessInstanceFilterRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#createUserProcessInstanceFilterUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userProcessInstanceFilterRepresentation** | [**UserProcessInstanceFilterRepresentation**](UserProcessInstanceFilterRepresentation.md)| userProcessInstanceFilterRepresentation |

### Return type

[**UserProcessInstanceFilterRepresentation**](UserProcessInstanceFilterRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUserTaskFilterUsingPOST"></a>
# **createUserTaskFilterUsingPOST**
> UserTaskFilterRepresentation createUserTaskFilterUsingPOST(userTaskFilterRepresentation)

Create a task filter

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserFiltersApi;








UserFiltersApi apiInstance = new UserFiltersApi();
UserTaskFilterRepresentation userTaskFilterRepresentation = new UserTaskFilterRepresentation(); // UserTaskFilterRepresentation | userTaskFilterRepresentation
try {
    UserTaskFilterRepresentation result = apiInstance.createUserTaskFilterUsingPOST(userTaskFilterRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#createUserTaskFilterUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userTaskFilterRepresentation** | [**UserTaskFilterRepresentation**](UserTaskFilterRepresentation.md)| userTaskFilterRepresentation |

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
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserFiltersApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserTaskFilterUsingDELETE"></a>
# **deleteUserTaskFilterUsingDELETE**
> deleteUserTaskFilterUsingDELETE(userFilterId)

Delete a task filter

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserFiltersApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserProcessInstanceFilterUsingGET"></a>
# **getUserProcessInstanceFilterUsingGET**
> UserProcessInstanceFilterRepresentation getUserProcessInstanceFilterUsingGET(userFilterId)

Get a process instance filter

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserFiltersApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserProcessInstanceFiltersUsingGET"></a>
# **getUserProcessInstanceFiltersUsingGET**
> ResultListDataRepresentationUserProcessInstanceFilterRepresentation getUserProcessInstanceFiltersUsingGET(appId)

List process instance filters

Returns filters for the current user, optionally filtered by *appId*.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserFiltersApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserTaskFilterUsingGET"></a>
# **getUserTaskFilterUsingGET**
> UserTaskFilterRepresentation getUserTaskFilterUsingGET(userFilterId)

Get a task filter

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserFiltersApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserTaskFiltersUsingGET"></a>
# **getUserTaskFiltersUsingGET**
> ResultListDataRepresentationUserTaskFilterRepresentation getUserTaskFiltersUsingGET(appId)

List task filters

Returns filters for the current user, optionally filtered by *appId*.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserFiltersApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orderUserProcessInstanceFiltersUsingPUT"></a>
# **orderUserProcessInstanceFiltersUsingPUT**
> orderUserProcessInstanceFiltersUsingPUT(filterOrderRepresentation)

Re-order the list of user process instance filters

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserFiltersApi;








UserFiltersApi apiInstance = new UserFiltersApi();
UserFilterOrderRepresentation filterOrderRepresentation = new UserFilterOrderRepresentation(); // UserFilterOrderRepresentation | filterOrderRepresentation
try {
    apiInstance.orderUserProcessInstanceFiltersUsingPUT(filterOrderRepresentation);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#orderUserProcessInstanceFiltersUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterOrderRepresentation** | [**UserFilterOrderRepresentation**](UserFilterOrderRepresentation.md)| filterOrderRepresentation |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orderUserTaskFiltersUsingPUT"></a>
# **orderUserTaskFiltersUsingPUT**
> orderUserTaskFiltersUsingPUT(filterOrderRepresentation)

Re-order the list of user task filters

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserFiltersApi;








UserFiltersApi apiInstance = new UserFiltersApi();
UserFilterOrderRepresentation filterOrderRepresentation = new UserFilterOrderRepresentation(); // UserFilterOrderRepresentation | filterOrderRepresentation
try {
    apiInstance.orderUserTaskFiltersUsingPUT(filterOrderRepresentation);
} catch (ApiException e) {
    System.err.println("Exception when calling UserFiltersApi#orderUserTaskFiltersUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterOrderRepresentation** | [**UserFilterOrderRepresentation**](UserFilterOrderRepresentation.md)| filterOrderRepresentation |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserProcessInstanceFilterUsingPUT"></a>
# **updateUserProcessInstanceFilterUsingPUT**
> UserProcessInstanceFilterRepresentation updateUserProcessInstanceFilterUsingPUT(userFilterId, userProcessInstanceFilterRepresentation)

Update a process instance filter

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserFiltersApi;








UserFiltersApi apiInstance = new UserFiltersApi();
Long userFilterId = 789L; // Long | userFilterId
UserProcessInstanceFilterRepresentation userProcessInstanceFilterRepresentation = new UserProcessInstanceFilterRepresentation(); // UserProcessInstanceFilterRepresentation | userProcessInstanceFilterRepresentation
try {
    UserProcessInstanceFilterRepresentation result = apiInstance.updateUserProcessInstanceFilterUsingPUT(userFilterId, userProcessInstanceFilterRepresentation);
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
 **userProcessInstanceFilterRepresentation** | [**UserProcessInstanceFilterRepresentation**](UserProcessInstanceFilterRepresentation.md)| userProcessInstanceFilterRepresentation |

### Return type

[**UserProcessInstanceFilterRepresentation**](UserProcessInstanceFilterRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserTaskFilterUsingPUT"></a>
# **updateUserTaskFilterUsingPUT**
> UserTaskFilterRepresentation updateUserTaskFilterUsingPUT(userFilterId, userTaskFilterRepresentation)

Update a task filter

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.UserFiltersApi;








UserFiltersApi apiInstance = new UserFiltersApi();
Long userFilterId = 789L; // Long | userFilterId
UserTaskFilterRepresentation userTaskFilterRepresentation = new UserTaskFilterRepresentation(); // UserTaskFilterRepresentation | userTaskFilterRepresentation
try {
    UserTaskFilterRepresentation result = apiInstance.updateUserTaskFilterUsingPUT(userFilterId, userTaskFilterRepresentation);
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
 **userTaskFilterRepresentation** | [**UserTaskFilterRepresentation**](UserTaskFilterRepresentation.md)| userTaskFilterRepresentation |

### Return type

[**UserTaskFilterRepresentation**](UserTaskFilterRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

