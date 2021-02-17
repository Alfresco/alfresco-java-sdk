# ProcessInstancesApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateProcessInstanceUsingPUT**](ProcessInstancesApi.md#activateProcessInstanceUsingPUT) | **PUT** /enterprise/process-instances/{processInstanceId}/activate | Activate a process instance
[**createIdentityLinkUsingPOST1**](ProcessInstancesApi.md#createIdentityLinkUsingPOST1) | **POST** /enterprise/process-instances/{processInstanceId}/identitylinks | Add a user or group involvement to a process instance
[**deleteIdentityLinkUsingDELETE1**](ProcessInstancesApi.md#deleteIdentityLinkUsingDELETE1) | **DELETE** /enterprise/process-instances/{processInstanceId}/identitylinks/{family}/{identityId}/{type} | Remove a user or group involvement from a process instance
[**deleteProcessInstanceUsingDELETE**](ProcessInstancesApi.md#deleteProcessInstanceUsingDELETE) | **DELETE** /enterprise/process-instances/{processInstanceId} | Cancel or remove a process instance
[**filterProcessInstancesUsingPOST**](ProcessInstancesApi.md#filterProcessInstancesUsingPOST) | **POST** /enterprise/process-instances/filter | List process instances using a filter
[**getHistoricProcessInstanceDecisionTasksUsingGET**](ProcessInstancesApi.md#getHistoricProcessInstanceDecisionTasksUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/decision-tasks | Get decision tasks in a process instance
[**getHistoricProcessInstanceVariablesUsingGET**](ProcessInstancesApi.md#getHistoricProcessInstanceVariablesUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/historic-variables | Get historic variables for a process instance
[**getHistoricProcessInstancesUsingPOST**](ProcessInstancesApi.md#getHistoricProcessInstancesUsingPOST) | **POST** /enterprise/historic-process-instances/query | Query historic process instances
[**getIdentityLinkTypeUsingGET1**](ProcessInstancesApi.md#getIdentityLinkTypeUsingGET1) | **GET** /enterprise/process-instances/{processInstanceId}/identitylinks/{family}/{identityId}/{type} | Get a user or group involvement with a process instance
[**getIdentityLinksForFamilyUsingGET1**](ProcessInstancesApi.md#getIdentityLinksForFamilyUsingGET1) | **GET** /enterprise/process-instances/{processInstanceId}/identitylinks/{family} | List either the users or groups involved with a process instance
[**getIdentityLinksUsingGET1**](ProcessInstancesApi.md#getIdentityLinksUsingGET1) | **GET** /enterprise/process-instances/{processInstanceId}/identitylinks | List the users and groups involved with a process instance
[**getProcessInstanceContentUsingGET**](ProcessInstancesApi.md#getProcessInstanceContentUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/field-content | List content attached to process instance fields
[**getProcessInstanceDiagramUsingGET**](ProcessInstancesApi.md#getProcessInstanceDiagramUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/diagram | Get the process diagram for the process instance
[**getProcessInstanceStartFormUsingGET**](ProcessInstancesApi.md#getProcessInstanceStartFormUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/start-form | Get a process instance start form
[**getProcessInstanceUsingGET**](ProcessInstancesApi.md#getProcessInstanceUsingGET) | **GET** /enterprise/process-instances/{processInstanceId} | Get a process instance
[**getProcessInstancesUsingPOST**](ProcessInstancesApi.md#getProcessInstancesUsingPOST) | **POST** /enterprise/process-instances/query | Query process instances
[**getTaskAuditLogUsingGET**](ProcessInstancesApi.md#getTaskAuditLogUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/audit-log | Get the audit log for a process instance
[**startNewProcessInstanceUsingPOST**](ProcessInstancesApi.md#startNewProcessInstanceUsingPOST) | **POST** /enterprise/process-instances | Start a process instance
[**suspendProcessInstanceUsingPUT**](ProcessInstancesApi.md#suspendProcessInstanceUsingPUT) | **PUT** /enterprise/process-instances/{processInstanceId}/suspend | Suspend a process instance


<a name="activateProcessInstanceUsingPUT"></a>
# **activateProcessInstanceUsingPUT**
> ProcessInstanceRepresentation activateProcessInstanceUsingPUT(processInstanceId)

Activate a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    ProcessInstanceRepresentation result = apiInstance.activateProcessInstanceUsingPUT(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#activateProcessInstanceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**ProcessInstanceRepresentation**](ProcessInstanceRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIdentityLinkUsingPOST1"></a>
# **createIdentityLinkUsingPOST1**
> IdentityLinkRepresentation createIdentityLinkUsingPOST1(processInstanceId, identityLinkRepresentation)

Add a user or group involvement to a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
IdentityLinkRepresentation identityLinkRepresentation = new IdentityLinkRepresentation(); // IdentityLinkRepresentation | identityLinkRepresentation
try {
    IdentityLinkRepresentation result = apiInstance.createIdentityLinkUsingPOST1(processInstanceId, identityLinkRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#createIdentityLinkUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **identityLinkRepresentation** | [**IdentityLinkRepresentation**](IdentityLinkRepresentation.md)| identityLinkRepresentation |

### Return type

[**IdentityLinkRepresentation**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIdentityLinkUsingDELETE1"></a>
# **deleteIdentityLinkUsingDELETE1**
> deleteIdentityLinkUsingDELETE1(processInstanceId, family, identityId, type)

Remove a user or group involvement from a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
String family = "family_example"; // String | family
String identityId = "identityId_example"; // String | identityId
String type = "type_example"; // String | type
try {
    apiInstance.deleteIdentityLinkUsingDELETE1(processInstanceId, family, identityId, type);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#deleteIdentityLinkUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **family** | **String**| family |
 **identityId** | **String**| identityId |
 **type** | **String**| type |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProcessInstanceUsingDELETE"></a>
# **deleteProcessInstanceUsingDELETE**
> deleteProcessInstanceUsingDELETE(processInstanceId)

Cancel or remove a process instance

If the process instance has not yet been completed, it will be cancelled. If it has already finished or been cancelled then the process instance will be removed and will no longer appear in queries.

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    apiInstance.deleteProcessInstanceUsingDELETE(processInstanceId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#deleteProcessInstanceUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filterProcessInstancesUsingPOST"></a>
# **filterProcessInstancesUsingPOST**
> ResultListDataRepresentationProcessInstanceRepresentation filterProcessInstancesUsingPOST(filterRequest)

List process instances using a filter

The request body provided must define either a valid filterId value or filter object

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
ProcessInstanceFilterRequestRepresentation filterRequest = new ProcessInstanceFilterRequestRepresentation(); // ProcessInstanceFilterRequestRepresentation | filterRequest
try {
    ResultListDataRepresentationProcessInstanceRepresentation result = apiInstance.filterProcessInstancesUsingPOST(filterRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#filterProcessInstancesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterRequest** | [**ProcessInstanceFilterRequestRepresentation**](ProcessInstanceFilterRequestRepresentation.md)| filterRequest |

### Return type

[**ResultListDataRepresentationProcessInstanceRepresentation**](ResultListDataRepresentationProcessInstanceRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHistoricProcessInstanceDecisionTasksUsingGET"></a>
# **getHistoricProcessInstanceDecisionTasksUsingGET**
> ResultListDataRepresentationDecisionTaskRepresentation getHistoricProcessInstanceDecisionTasksUsingGET(processInstanceId)

Get decision tasks in a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    ResultListDataRepresentationDecisionTaskRepresentation result = apiInstance.getHistoricProcessInstanceDecisionTasksUsingGET(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#getHistoricProcessInstanceDecisionTasksUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**ResultListDataRepresentationDecisionTaskRepresentation**](ResultListDataRepresentationDecisionTaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHistoricProcessInstanceVariablesUsingGET"></a>
# **getHistoricProcessInstanceVariablesUsingGET**
> List&lt;ProcessInstanceVariableRepresentation&gt; getHistoricProcessInstanceVariablesUsingGET(processInstanceId)

Get historic variables for a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    List<ProcessInstanceVariableRepresentation> result = apiInstance.getHistoricProcessInstanceVariablesUsingGET(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#getHistoricProcessInstanceVariablesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**List&lt;ProcessInstanceVariableRepresentation&gt;**](ProcessInstanceVariableRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHistoricProcessInstancesUsingPOST"></a>
# **getHistoricProcessInstancesUsingPOST**
> ResultListDataRepresentationProcessInstanceRepresentation getHistoricProcessInstancesUsingPOST(queryRequest)

Query historic process instances

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
HistoricProcessInstanceQueryRepresentation queryRequest = new HistoricProcessInstanceQueryRepresentation(); // HistoricProcessInstanceQueryRepresentation | queryRequest
try {
    ResultListDataRepresentationProcessInstanceRepresentation result = apiInstance.getHistoricProcessInstancesUsingPOST(queryRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#getHistoricProcessInstancesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | [**HistoricProcessInstanceQueryRepresentation**](HistoricProcessInstanceQueryRepresentation.md)| queryRequest |

### Return type

[**ResultListDataRepresentationProcessInstanceRepresentation**](ResultListDataRepresentationProcessInstanceRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdentityLinkTypeUsingGET1"></a>
# **getIdentityLinkTypeUsingGET1**
> IdentityLinkRepresentation getIdentityLinkTypeUsingGET1(processInstanceId, family, identityId, type)

Get a user or group involvement with a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
String family = "family_example"; // String | family
String identityId = "identityId_example"; // String | identityId
String type = "type_example"; // String | type
try {
    IdentityLinkRepresentation result = apiInstance.getIdentityLinkTypeUsingGET1(processInstanceId, family, identityId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#getIdentityLinkTypeUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **family** | **String**| family |
 **identityId** | **String**| identityId |
 **type** | **String**| type |

### Return type

[**IdentityLinkRepresentation**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdentityLinksForFamilyUsingGET1"></a>
# **getIdentityLinksForFamilyUsingGET1**
> List&lt;IdentityLinkRepresentation&gt; getIdentityLinksForFamilyUsingGET1(processInstanceId, family)

List either the users or groups involved with a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
String family = "family_example"; // String | family
try {
    List<IdentityLinkRepresentation> result = apiInstance.getIdentityLinksForFamilyUsingGET1(processInstanceId, family);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#getIdentityLinksForFamilyUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **family** | **String**| family |

### Return type

[**List&lt;IdentityLinkRepresentation&gt;**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdentityLinksUsingGET1"></a>
# **getIdentityLinksUsingGET1**
> List&lt;IdentityLinkRepresentation&gt; getIdentityLinksUsingGET1(processInstanceId)

List the users and groups involved with a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    List<IdentityLinkRepresentation> result = apiInstance.getIdentityLinksUsingGET1(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#getIdentityLinksUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**List&lt;IdentityLinkRepresentation&gt;**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessInstanceContentUsingGET"></a>
# **getProcessInstanceContentUsingGET**
> ResultListDataRepresentationProcessContentRepresentation getProcessInstanceContentUsingGET(processInstanceId)

List content attached to process instance fields

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    ResultListDataRepresentationProcessContentRepresentation result = apiInstance.getProcessInstanceContentUsingGET(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#getProcessInstanceContentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**ResultListDataRepresentationProcessContentRepresentation**](ResultListDataRepresentationProcessContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessInstanceDiagramUsingGET"></a>
# **getProcessInstanceDiagramUsingGET**
> List&lt;byte[]&gt; getProcessInstanceDiagramUsingGET(processInstanceId)

Get the process diagram for the process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    List<byte[]> result = apiInstance.getProcessInstanceDiagramUsingGET(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#getProcessInstanceDiagramUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

**List&lt;byte[]&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: image/png

<a name="getProcessInstanceStartFormUsingGET"></a>
# **getProcessInstanceStartFormUsingGET**
> FormDefinitionRepresentation getProcessInstanceStartFormUsingGET(processInstanceId)

Get a process instance start form

The start form for a process instance can be retrieved when the process definition has a start form defined (hasStartForm &#x3D; true on the process instance)

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    FormDefinitionRepresentation result = apiInstance.getProcessInstanceStartFormUsingGET(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#getProcessInstanceStartFormUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**FormDefinitionRepresentation**](FormDefinitionRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessInstanceUsingGET"></a>
# **getProcessInstanceUsingGET**
> ProcessInstanceRepresentation getProcessInstanceUsingGET(processInstanceId)

Get a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    ProcessInstanceRepresentation result = apiInstance.getProcessInstanceUsingGET(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#getProcessInstanceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**ProcessInstanceRepresentation**](ProcessInstanceRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessInstancesUsingPOST"></a>
# **getProcessInstancesUsingPOST**
> ResultListDataRepresentationProcessInstanceRepresentation getProcessInstancesUsingPOST(processInstancesQuery)

Query process instances

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
ProcessInstanceQueryRepresentation processInstancesQuery = new ProcessInstanceQueryRepresentation(); // ProcessInstanceQueryRepresentation | processInstancesQuery
try {
    ResultListDataRepresentationProcessInstanceRepresentation result = apiInstance.getProcessInstancesUsingPOST(processInstancesQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#getProcessInstancesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstancesQuery** | [**ProcessInstanceQueryRepresentation**](ProcessInstanceQueryRepresentation.md)| processInstancesQuery |

### Return type

[**ResultListDataRepresentationProcessInstanceRepresentation**](ResultListDataRepresentationProcessInstanceRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskAuditLogUsingGET"></a>
# **getTaskAuditLogUsingGET**
> ProcessInstanceAuditInfoRepresentation getTaskAuditLogUsingGET(processInstanceId)

Get the audit log for a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    ProcessInstanceAuditInfoRepresentation result = apiInstance.getTaskAuditLogUsingGET(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#getTaskAuditLogUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**ProcessInstanceAuditInfoRepresentation**](ProcessInstanceAuditInfoRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startNewProcessInstanceUsingPOST"></a>
# **startNewProcessInstanceUsingPOST**
> ProcessInstanceRepresentation startNewProcessInstanceUsingPOST(startRequest)

Start a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
CreateProcessInstanceRepresentation startRequest = new CreateProcessInstanceRepresentation(); // CreateProcessInstanceRepresentation | startRequest
try {
    ProcessInstanceRepresentation result = apiInstance.startNewProcessInstanceUsingPOST(startRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#startNewProcessInstanceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startRequest** | [**CreateProcessInstanceRepresentation**](CreateProcessInstanceRepresentation.md)| startRequest |

### Return type

[**ProcessInstanceRepresentation**](ProcessInstanceRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="suspendProcessInstanceUsingPUT"></a>
# **suspendProcessInstanceUsingPUT**
> ProcessInstanceRepresentation suspendProcessInstanceUsingPUT(processInstanceId)

Suspend a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstancesApi;








ProcessInstancesApi apiInstance = new ProcessInstancesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    ProcessInstanceRepresentation result = apiInstance.suspendProcessInstanceUsingPUT(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstancesApi#suspendProcessInstanceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**ProcessInstanceRepresentation**](ProcessInstanceRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

