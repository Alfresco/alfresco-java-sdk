# AdminTenantsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTenantUsingPOST**](AdminTenantsApi.md#createTenantUsingPOST) | **POST** /activiti-app/api/enterprise/admin/tenants | Create a tenant
[**deleteTenantUsingDELETE**](AdminTenantsApi.md#deleteTenantUsingDELETE) | **DELETE** /activiti-app/api/enterprise/admin/tenants/{tenantId} | Delete a tenant
[**getTenantEventsUsingGET**](AdminTenantsApi.md#getTenantEventsUsingGET) | **GET** /activiti-app/api/enterprise/admin/tenants/{tenantId}/events | Get tenant events
[**getTenantLogoUsingGET**](AdminTenantsApi.md#getTenantLogoUsingGET) | **GET** /activiti-app/api/enterprise/admin/tenants/{tenantId}/logo | Get a tenant&#x27;s logo
[**getTenantUsingGET**](AdminTenantsApi.md#getTenantUsingGET) | **GET** /activiti-app/api/enterprise/admin/tenants/{tenantId} | Get a tenant
[**getTenantsUsingGET**](AdminTenantsApi.md#getTenantsUsingGET) | **GET** /activiti-app/api/enterprise/admin/tenants | List tenants
[**updateUsingPUT**](AdminTenantsApi.md#updateUsingPUT) | **PUT** /activiti-app/api/enterprise/admin/tenants/{tenantId} | Update a tenant
[**uploadTenantLogoUsingPOST**](AdminTenantsApi.md#uploadTenantLogoUsingPOST) | **POST** /activiti-app/api/enterprise/admin/tenants/{tenantId}/logo | Update a tenant&#x27;s logo

<a name="createTenantUsingPOST"></a>
# **createTenantUsingPOST**
> LightTenantRepresentation createTenantUsingPOST(body)

Create a tenant

Only a tenant manager may access this endpoint

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminTenantsApi;







AdminTenantsApi apiInstance = new AdminTenantsApi();
CreateTenantRepresentation body = new CreateTenantRepresentation(); // CreateTenantRepresentation | 
try {
    LightTenantRepresentation result = apiInstance.createTenantUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminTenantsApi#createTenantUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateTenantRepresentation**](CreateTenantRepresentation.md)|  | [optional]

### Return type

[**LightTenantRepresentation**](LightTenantRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTenantUsingDELETE"></a>
# **deleteTenantUsingDELETE**
> deleteTenantUsingDELETE(tenantId)

Delete a tenant

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminTenantsApi;







AdminTenantsApi apiInstance = new AdminTenantsApi();
Long tenantId = 789L; // Long | tenantId
try {
    apiInstance.deleteTenantUsingDELETE(tenantId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminTenantsApi#deleteTenantUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTenantEventsUsingGET"></a>
# **getTenantEventsUsingGET**
> List&lt;TenantEvent&gt; getTenantEventsUsingGET(tenantId)

Get tenant events

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminTenantsApi;







AdminTenantsApi apiInstance = new AdminTenantsApi();
Long tenantId = 789L; // Long | tenantId
try {
    List<TenantEvent> result = apiInstance.getTenantEventsUsingGET(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminTenantsApi#getTenantEventsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId |

### Return type

[**List&lt;TenantEvent&gt;**](TenantEvent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTenantLogoUsingGET"></a>
# **getTenantLogoUsingGET**
> getTenantLogoUsingGET(tenantId)

Get a tenant&#x27;s logo

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminTenantsApi;







AdminTenantsApi apiInstance = new AdminTenantsApi();
Long tenantId = 789L; // Long | tenantId
try {
    apiInstance.getTenantLogoUsingGET(tenantId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminTenantsApi#getTenantLogoUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTenantUsingGET"></a>
# **getTenantUsingGET**
> TenantRepresentation getTenantUsingGET(tenantId)

Get a tenant

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminTenantsApi;







AdminTenantsApi apiInstance = new AdminTenantsApi();
Long tenantId = 789L; // Long | tenantId
try {
    TenantRepresentation result = apiInstance.getTenantUsingGET(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminTenantsApi#getTenantUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId |

### Return type

[**TenantRepresentation**](TenantRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTenantsUsingGET"></a>
# **getTenantsUsingGET**
> List&lt;LightTenantRepresentation&gt; getTenantsUsingGET()

List tenants

Only a tenant manager may access this endpoint

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminTenantsApi;







AdminTenantsApi apiInstance = new AdminTenantsApi();
try {
    List<LightTenantRepresentation> result = apiInstance.getTenantsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminTenantsApi#getTenantsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LightTenantRepresentation&gt;**](LightTenantRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> TenantRepresentation updateUsingPUT(tenantId, body)

Update a tenant

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminTenantsApi;







AdminTenantsApi apiInstance = new AdminTenantsApi();
Long tenantId = 789L; // Long | tenantId
CreateTenantRepresentation body = new CreateTenantRepresentation(); // CreateTenantRepresentation | 
try {
    TenantRepresentation result = apiInstance.updateUsingPUT(tenantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminTenantsApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId |
 **body** | [**CreateTenantRepresentation**](CreateTenantRepresentation.md)|  | [optional]

### Return type

[**TenantRepresentation**](TenantRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadTenantLogoUsingPOST"></a>
# **uploadTenantLogoUsingPOST**
> ImageUploadRepresentation uploadTenantLogoUsingPOST(tenantId, body)

Update a tenant&#x27;s logo

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminTenantsApi;







AdminTenantsApi apiInstance = new AdminTenantsApi();
Long tenantId = 789L; // Long | tenantId
Object body = null; // Object | 
try {
    ImageUploadRepresentation result = apiInstance.uploadTenantLogoUsingPOST(tenantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminTenantsApi#uploadTenantLogoUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId |
 **body** | **Object**|  | [optional]

### Return type

[**ImageUploadRepresentation**](ImageUploadRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: application/json

