# AdminTenantsApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTenantUsingPOST**](AdminTenantsApi.md#createTenantUsingPOST) | **POST** /enterprise/admin/tenants | Create a tenant
[**deleteTenantUsingDELETE**](AdminTenantsApi.md#deleteTenantUsingDELETE) | **DELETE** /enterprise/admin/tenants/{tenantId} | Delete a tenant
[**getTenantEventsUsingGET**](AdminTenantsApi.md#getTenantEventsUsingGET) | **GET** /enterprise/admin/tenants/{tenantId}/events | Get tenant events
[**getTenantLogoUsingGET**](AdminTenantsApi.md#getTenantLogoUsingGET) | **GET** /enterprise/admin/tenants/{tenantId}/logo | Get a tenant&#39;s logo
[**getTenantUsingGET**](AdminTenantsApi.md#getTenantUsingGET) | **GET** /enterprise/admin/tenants/{tenantId} | Get a tenant
[**getTenantsUsingGET**](AdminTenantsApi.md#getTenantsUsingGET) | **GET** /enterprise/admin/tenants | List tenants
[**updateUsingPUT**](AdminTenantsApi.md#updateUsingPUT) | **PUT** /enterprise/admin/tenants/{tenantId} | Update a tenant
[**uploadTenantLogoUsingPOST**](AdminTenantsApi.md#uploadTenantLogoUsingPOST) | **POST** /enterprise/admin/tenants/{tenantId}/logo | Update a tenant&#39;s logo


<a name="createTenantUsingPOST"></a>
# **createTenantUsingPOST**
> LightTenantRepresentation createTenantUsingPOST(createTenantRepresentation)

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
CreateTenantRepresentation createTenantRepresentation = new CreateTenantRepresentation(); // CreateTenantRepresentation | createTenantRepresentation
try {
    LightTenantRepresentation result = apiInstance.createTenantUsingPOST(createTenantRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminTenantsApi#createTenantUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTenantRepresentation** | [**CreateTenantRepresentation**](CreateTenantRepresentation.md)| createTenantRepresentation |

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

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTenantLogoUsingGET"></a>
# **getTenantLogoUsingGET**
> getTenantLogoUsingGET(tenantId)

Get a tenant&#39;s logo

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

 - **Content-Type**: application/json
 - **Accept**: application/json

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

 - **Content-Type**: application/json
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> TenantRepresentation updateUsingPUT(tenantId, createTenantRepresentation)

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
CreateTenantRepresentation createTenantRepresentation = new CreateTenantRepresentation(); // CreateTenantRepresentation | createTenantRepresentation
try {
    TenantRepresentation result = apiInstance.updateUsingPUT(tenantId, createTenantRepresentation);
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
 **createTenantRepresentation** | [**CreateTenantRepresentation**](CreateTenantRepresentation.md)| createTenantRepresentation |

### Return type

[**TenantRepresentation**](TenantRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadTenantLogoUsingPOST"></a>
# **uploadTenantLogoUsingPOST**
> ImageUploadRepresentation uploadTenantLogoUsingPOST(tenantId, file)

Update a tenant&#39;s logo

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
File file = new File("/path/to/file.txt"); // File | file
try {
    ImageUploadRepresentation result = apiInstance.uploadTenantLogoUsingPOST(tenantId, file);
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
 **file** | **File**| file |

### Return type

[**ImageUploadRepresentation**](ImageUploadRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

