# AdminEndpointsApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBasicAuthConfigurationUsingPOST**](AdminEndpointsApi.md#createBasicAuthConfigurationUsingPOST) | **POST** /enterprise/admin/basic-auths | Add an endpoint authorization
[**createEndpointConfigurationUsingPOST**](AdminEndpointsApi.md#createEndpointConfigurationUsingPOST) | **POST** /enterprise/admin/endpoints | Create an endpoint
[**getBasicAuthConfigurationUsingGET**](AdminEndpointsApi.md#getBasicAuthConfigurationUsingGET) | **GET** /enterprise/admin/basic-auths/{basicAuthId} | Get an endpoint authorization
[**getBasicAuthConfigurationsUsingGET**](AdminEndpointsApi.md#getBasicAuthConfigurationsUsingGET) | **GET** /enterprise/admin/basic-auths | List endpoint authorizations
[**getEndpointConfigurationUsingGET1**](AdminEndpointsApi.md#getEndpointConfigurationUsingGET1) | **GET** /enterprise/admin/endpoints/{endpointConfigurationId} | Get an endpoint
[**getEndpointConfigurationsUsingGET1**](AdminEndpointsApi.md#getEndpointConfigurationsUsingGET1) | **GET** /enterprise/admin/endpoints | List endpoints
[**removeBasicAuthonfigurationUsingDELETE**](AdminEndpointsApi.md#removeBasicAuthonfigurationUsingDELETE) | **DELETE** /enterprise/admin/basic-auths/{basicAuthId} | Delete an endpoint authorization
[**removeEndpointConfigurationUsingDELETE**](AdminEndpointsApi.md#removeEndpointConfigurationUsingDELETE) | **DELETE** /enterprise/admin/endpoints/{endpointConfigurationId} | Delete an endpoint
[**updateBasicAuthConfigurationUsingPUT**](AdminEndpointsApi.md#updateBasicAuthConfigurationUsingPUT) | **PUT** /enterprise/admin/basic-auths/{basicAuthId} | Update an endpoint authorization
[**updateEndpointConfigurationUsingPUT**](AdminEndpointsApi.md#updateEndpointConfigurationUsingPUT) | **PUT** /enterprise/admin/endpoints/{endpointConfigurationId} | Update an endpoint


<a name="createBasicAuthConfigurationUsingPOST"></a>
# **createBasicAuthConfigurationUsingPOST**
> EndpointBasicAuthRepresentation createBasicAuthConfigurationUsingPOST(createRepresentation)

Add an endpoint authorization

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminEndpointsApi;








AdminEndpointsApi apiInstance = new AdminEndpointsApi();
CreateEndpointBasicAuthRepresentation createRepresentation = new CreateEndpointBasicAuthRepresentation(); // CreateEndpointBasicAuthRepresentation | createRepresentation
try {
    EndpointBasicAuthRepresentation result = apiInstance.createBasicAuthConfigurationUsingPOST(createRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminEndpointsApi#createBasicAuthConfigurationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createRepresentation** | [**CreateEndpointBasicAuthRepresentation**](CreateEndpointBasicAuthRepresentation.md)| createRepresentation |

### Return type

[**EndpointBasicAuthRepresentation**](EndpointBasicAuthRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEndpointConfigurationUsingPOST"></a>
# **createEndpointConfigurationUsingPOST**
> EndpointConfigurationRepresentation createEndpointConfigurationUsingPOST(representation)

Create an endpoint

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminEndpointsApi;








AdminEndpointsApi apiInstance = new AdminEndpointsApi();
EndpointConfigurationRepresentation representation = new EndpointConfigurationRepresentation(); // EndpointConfigurationRepresentation | representation
try {
    EndpointConfigurationRepresentation result = apiInstance.createEndpointConfigurationUsingPOST(representation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminEndpointsApi#createEndpointConfigurationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **representation** | [**EndpointConfigurationRepresentation**](EndpointConfigurationRepresentation.md)| representation |

### Return type

[**EndpointConfigurationRepresentation**](EndpointConfigurationRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBasicAuthConfigurationUsingGET"></a>
# **getBasicAuthConfigurationUsingGET**
> EndpointBasicAuthRepresentation getBasicAuthConfigurationUsingGET(basicAuthId, tenantId)

Get an endpoint authorization

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminEndpointsApi;








AdminEndpointsApi apiInstance = new AdminEndpointsApi();
Long basicAuthId = 789L; // Long | basicAuthId
Long tenantId = 789L; // Long | tenantId
try {
    EndpointBasicAuthRepresentation result = apiInstance.getBasicAuthConfigurationUsingGET(basicAuthId, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminEndpointsApi#getBasicAuthConfigurationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **basicAuthId** | **Long**| basicAuthId |
 **tenantId** | **Long**| tenantId |

### Return type

[**EndpointBasicAuthRepresentation**](EndpointBasicAuthRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBasicAuthConfigurationsUsingGET"></a>
# **getBasicAuthConfigurationsUsingGET**
> List&lt;EndpointBasicAuthRepresentation&gt; getBasicAuthConfigurationsUsingGET(tenantId)

List endpoint authorizations

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminEndpointsApi;








AdminEndpointsApi apiInstance = new AdminEndpointsApi();
Long tenantId = 789L; // Long | tenantId
try {
    List<EndpointBasicAuthRepresentation> result = apiInstance.getBasicAuthConfigurationsUsingGET(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminEndpointsApi#getBasicAuthConfigurationsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId |

### Return type

[**List&lt;EndpointBasicAuthRepresentation&gt;**](EndpointBasicAuthRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEndpointConfigurationUsingGET1"></a>
# **getEndpointConfigurationUsingGET1**
> EndpointConfigurationRepresentation getEndpointConfigurationUsingGET1(endpointConfigurationId, tenantId)

Get an endpoint

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminEndpointsApi;








AdminEndpointsApi apiInstance = new AdminEndpointsApi();
Long endpointConfigurationId = 789L; // Long | endpointConfigurationId
Long tenantId = 789L; // Long | tenantId
try {
    EndpointConfigurationRepresentation result = apiInstance.getEndpointConfigurationUsingGET1(endpointConfigurationId, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminEndpointsApi#getEndpointConfigurationUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointConfigurationId** | **Long**| endpointConfigurationId |
 **tenantId** | **Long**| tenantId |

### Return type

[**EndpointConfigurationRepresentation**](EndpointConfigurationRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEndpointConfigurationsUsingGET1"></a>
# **getEndpointConfigurationsUsingGET1**
> List&lt;EndpointConfigurationRepresentation&gt; getEndpointConfigurationsUsingGET1(tenantId)

List endpoints

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminEndpointsApi;








AdminEndpointsApi apiInstance = new AdminEndpointsApi();
Long tenantId = 789L; // Long | tenantId
try {
    List<EndpointConfigurationRepresentation> result = apiInstance.getEndpointConfigurationsUsingGET1(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminEndpointsApi#getEndpointConfigurationsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId |

### Return type

[**List&lt;EndpointConfigurationRepresentation&gt;**](EndpointConfigurationRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeBasicAuthonfigurationUsingDELETE"></a>
# **removeBasicAuthonfigurationUsingDELETE**
> removeBasicAuthonfigurationUsingDELETE(basicAuthId, tenantId)

Delete an endpoint authorization

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminEndpointsApi;








AdminEndpointsApi apiInstance = new AdminEndpointsApi();
Long basicAuthId = 789L; // Long | basicAuthId
Long tenantId = 789L; // Long | tenantId
try {
    apiInstance.removeBasicAuthonfigurationUsingDELETE(basicAuthId, tenantId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminEndpointsApi#removeBasicAuthonfigurationUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **basicAuthId** | **Long**| basicAuthId |
 **tenantId** | **Long**| tenantId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeEndpointConfigurationUsingDELETE"></a>
# **removeEndpointConfigurationUsingDELETE**
> removeEndpointConfigurationUsingDELETE(endpointConfigurationId, tenantId)

Delete an endpoint

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminEndpointsApi;








AdminEndpointsApi apiInstance = new AdminEndpointsApi();
Long endpointConfigurationId = 789L; // Long | endpointConfigurationId
Long tenantId = 789L; // Long | tenantId
try {
    apiInstance.removeEndpointConfigurationUsingDELETE(endpointConfigurationId, tenantId);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminEndpointsApi#removeEndpointConfigurationUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointConfigurationId** | **Long**| endpointConfigurationId |
 **tenantId** | **Long**| tenantId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBasicAuthConfigurationUsingPUT"></a>
# **updateBasicAuthConfigurationUsingPUT**
> EndpointBasicAuthRepresentation updateBasicAuthConfigurationUsingPUT(basicAuthId, createRepresentation)

Update an endpoint authorization

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminEndpointsApi;








AdminEndpointsApi apiInstance = new AdminEndpointsApi();
Long basicAuthId = 789L; // Long | basicAuthId
CreateEndpointBasicAuthRepresentation createRepresentation = new CreateEndpointBasicAuthRepresentation(); // CreateEndpointBasicAuthRepresentation | createRepresentation
try {
    EndpointBasicAuthRepresentation result = apiInstance.updateBasicAuthConfigurationUsingPUT(basicAuthId, createRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminEndpointsApi#updateBasicAuthConfigurationUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **basicAuthId** | **Long**| basicAuthId |
 **createRepresentation** | [**CreateEndpointBasicAuthRepresentation**](CreateEndpointBasicAuthRepresentation.md)| createRepresentation |

### Return type

[**EndpointBasicAuthRepresentation**](EndpointBasicAuthRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEndpointConfigurationUsingPUT"></a>
# **updateEndpointConfigurationUsingPUT**
> EndpointConfigurationRepresentation updateEndpointConfigurationUsingPUT(endpointConfigurationId, representation)

Update an endpoint

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AdminEndpointsApi;








AdminEndpointsApi apiInstance = new AdminEndpointsApi();
Long endpointConfigurationId = 789L; // Long | endpointConfigurationId
EndpointConfigurationRepresentation representation = new EndpointConfigurationRepresentation(); // EndpointConfigurationRepresentation | representation
try {
    EndpointConfigurationRepresentation result = apiInstance.updateEndpointConfigurationUsingPUT(endpointConfigurationId, representation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminEndpointsApi#updateEndpointConfigurationUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointConfigurationId** | **Long**| endpointConfigurationId |
 **representation** | [**EndpointConfigurationRepresentation**](EndpointConfigurationRepresentation.md)| representation |

### Return type

[**EndpointConfigurationRepresentation**](EndpointConfigurationRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

