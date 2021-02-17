# ProcessDefinitionsApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIdentityLinkUsingPOST**](ProcessDefinitionsApi.md#createIdentityLinkUsingPOST) | **POST** /enterprise/process-definitions/{processDefinitionId}/identitylinks | Add a user or group involvement to a process definition
[**deleteIdentityLinkUsingDELETE**](ProcessDefinitionsApi.md#deleteIdentityLinkUsingDELETE) | **DELETE** /enterprise/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId} | Remove a user or group involvement from a process definition
[**getIdentityLinkTypeUsingGET**](ProcessDefinitionsApi.md#getIdentityLinkTypeUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId} | Get a user or group involvement with a process definition
[**getIdentityLinksForFamilyUsingGET**](ProcessDefinitionsApi.md#getIdentityLinksForFamilyUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/identitylinks/{family} | List either the users or groups involved with a process definition
[**getIdentityLinksUsingGET**](ProcessDefinitionsApi.md#getIdentityLinksUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/identitylinks | List the users and groups involved with a process definition
[**getProcessDefinitionDecisionTablesUsingGET**](ProcessDefinitionsApi.md#getProcessDefinitionDecisionTablesUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/decision-tables | List the decision tables associated with a process definition
[**getProcessDefinitionFormsUsingGET**](ProcessDefinitionsApi.md#getProcessDefinitionFormsUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/forms | List the forms associated with a process definition
[**getProcessDefinitionStartFormUsingGET**](ProcessDefinitionsApi.md#getProcessDefinitionStartFormUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/start-form | Retrieve the start form for a process definition
[**getProcessDefinitionsUsingGET**](ProcessDefinitionsApi.md#getProcessDefinitionsUsingGET) | **GET** /enterprise/process-definitions | Retrieve a list of process definitions
[**getRestFieldValuesUsingGET**](ProcessDefinitionsApi.md#getRestFieldValuesUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/start-form-values/{field} | Retrieve field values (eg. the typeahead field)
[**getRestTableFieldValuesUsingGET**](ProcessDefinitionsApi.md#getRestTableFieldValuesUsingGET) | **GET** /enterprise/process-definitions/{processDefinitionId}/start-form-values/{field}/{column} | Retrieve field values (eg. the table field)


<a name="createIdentityLinkUsingPOST"></a>
# **createIdentityLinkUsingPOST**
> IdentityLinkRepresentation createIdentityLinkUsingPOST(processDefinitionId, identityLinkRepresentation)

Add a user or group involvement to a process definition

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessDefinitionsApi;








ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi();
String processDefinitionId = "processDefinitionId_example"; // String | processDefinitionId
IdentityLinkRepresentation identityLinkRepresentation = new IdentityLinkRepresentation(); // IdentityLinkRepresentation | identityLinkRepresentation
try {
    IdentityLinkRepresentation result = apiInstance.createIdentityLinkUsingPOST(processDefinitionId, identityLinkRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionsApi#createIdentityLinkUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processDefinitionId** | **String**| processDefinitionId |
 **identityLinkRepresentation** | [**IdentityLinkRepresentation**](IdentityLinkRepresentation.md)| identityLinkRepresentation |

### Return type

[**IdentityLinkRepresentation**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIdentityLinkUsingDELETE"></a>
# **deleteIdentityLinkUsingDELETE**
> deleteIdentityLinkUsingDELETE(processDefinitionId, family, identityId)

Remove a user or group involvement from a process definition

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessDefinitionsApi;








ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi();
String processDefinitionId = "processDefinitionId_example"; // String | Process definition ID
String family = "family_example"; // String | Identity type
String identityId = "identityId_example"; // String | User or group ID
try {
    apiInstance.deleteIdentityLinkUsingDELETE(processDefinitionId, family, identityId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionsApi#deleteIdentityLinkUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processDefinitionId** | **String**| Process definition ID |
 **family** | **String**| Identity type | [enum: users, groups]
 **identityId** | **String**| User or group ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdentityLinkTypeUsingGET"></a>
# **getIdentityLinkTypeUsingGET**
> IdentityLinkRepresentation getIdentityLinkTypeUsingGET(processDefinitionId, family, identityId)

Get a user or group involvement with a process definition

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessDefinitionsApi;








ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi();
String processDefinitionId = "processDefinitionId_example"; // String | Process definition ID
String family = "family_example"; // String | Identity type
String identityId = "identityId_example"; // String | User or group ID
try {
    IdentityLinkRepresentation result = apiInstance.getIdentityLinkTypeUsingGET(processDefinitionId, family, identityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionsApi#getIdentityLinkTypeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processDefinitionId** | **String**| Process definition ID |
 **family** | **String**| Identity type | [enum: users, groups]
 **identityId** | **String**| User or group ID |

### Return type

[**IdentityLinkRepresentation**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdentityLinksForFamilyUsingGET"></a>
# **getIdentityLinksForFamilyUsingGET**
> List&lt;IdentityLinkRepresentation&gt; getIdentityLinksForFamilyUsingGET(processDefinitionId, family)

List either the users or groups involved with a process definition

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessDefinitionsApi;








ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi();
String processDefinitionId = "processDefinitionId_example"; // String | processDefinitionId
String family = "family_example"; // String | Identity type
try {
    List<IdentityLinkRepresentation> result = apiInstance.getIdentityLinksForFamilyUsingGET(processDefinitionId, family);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionsApi#getIdentityLinksForFamilyUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processDefinitionId** | **String**| processDefinitionId |
 **family** | **String**| Identity type | [enum: users, groups]

### Return type

[**List&lt;IdentityLinkRepresentation&gt;**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdentityLinksUsingGET"></a>
# **getIdentityLinksUsingGET**
> List&lt;IdentityLinkRepresentation&gt; getIdentityLinksUsingGET(processDefinitionId)

List the users and groups involved with a process definition

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessDefinitionsApi;








ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi();
String processDefinitionId = "processDefinitionId_example"; // String | processDefinitionId
try {
    List<IdentityLinkRepresentation> result = apiInstance.getIdentityLinksUsingGET(processDefinitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionsApi#getIdentityLinksUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processDefinitionId** | **String**| processDefinitionId |

### Return type

[**List&lt;IdentityLinkRepresentation&gt;**](IdentityLinkRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessDefinitionDecisionTablesUsingGET"></a>
# **getProcessDefinitionDecisionTablesUsingGET**
> ResultListDataRepresentationRuntimeDecisionTableRepresentation getProcessDefinitionDecisionTablesUsingGET(processDefinitionId)

List the decision tables associated with a process definition

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessDefinitionsApi;








ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi();
String processDefinitionId = "processDefinitionId_example"; // String | processDefinitionId
try {
    ResultListDataRepresentationRuntimeDecisionTableRepresentation result = apiInstance.getProcessDefinitionDecisionTablesUsingGET(processDefinitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionsApi#getProcessDefinitionDecisionTablesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processDefinitionId** | **String**| processDefinitionId |

### Return type

[**ResultListDataRepresentationRuntimeDecisionTableRepresentation**](ResultListDataRepresentationRuntimeDecisionTableRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessDefinitionFormsUsingGET"></a>
# **getProcessDefinitionFormsUsingGET**
> ResultListDataRepresentationRuntimeFormRepresentation getProcessDefinitionFormsUsingGET(processDefinitionId)

List the forms associated with a process definition

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessDefinitionsApi;








ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi();
String processDefinitionId = "processDefinitionId_example"; // String | processDefinitionId
try {
    ResultListDataRepresentationRuntimeFormRepresentation result = apiInstance.getProcessDefinitionFormsUsingGET(processDefinitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionsApi#getProcessDefinitionFormsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processDefinitionId** | **String**| processDefinitionId |

### Return type

[**ResultListDataRepresentationRuntimeFormRepresentation**](ResultListDataRepresentationRuntimeFormRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessDefinitionStartFormUsingGET"></a>
# **getProcessDefinitionStartFormUsingGET**
> FormDefinitionRepresentation getProcessDefinitionStartFormUsingGET()

Retrieve the start form for a process definition

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessDefinitionsApi;








ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi();
try {
    FormDefinitionRepresentation result = apiInstance.getProcessDefinitionStartFormUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionsApi#getProcessDefinitionStartFormUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FormDefinitionRepresentation**](FormDefinitionRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessDefinitionsUsingGET"></a>
# **getProcessDefinitionsUsingGET**
> ResultListDataRepresentationProcessDefinitionRepresentation getProcessDefinitionsUsingGET(latest, appDefinitionId, deploymentId)

Retrieve a list of process definitions

Get a list of process definitions (visible within the tenant of the user)

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessDefinitionsApi;








ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi();
Boolean latest = true; // Boolean | latest
Long appDefinitionId = 789L; // Long | appDefinitionId
String deploymentId = "deploymentId_example"; // String | deploymentId
try {
    ResultListDataRepresentationProcessDefinitionRepresentation result = apiInstance.getProcessDefinitionsUsingGET(latest, appDefinitionId, deploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionsApi#getProcessDefinitionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latest** | **Boolean**| latest | [optional]
 **appDefinitionId** | **Long**| appDefinitionId | [optional]
 **deploymentId** | **String**| deploymentId | [optional]

### Return type

[**ResultListDataRepresentationProcessDefinitionRepresentation**](ResultListDataRepresentationProcessDefinitionRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRestFieldValuesUsingGET"></a>
# **getRestFieldValuesUsingGET**
> List&lt;FormValueRepresentation&gt; getRestFieldValuesUsingGET()

Retrieve field values (eg. the typeahead field)

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessDefinitionsApi;








ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi();
try {
    List<FormValueRepresentation> result = apiInstance.getRestFieldValuesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionsApi#getRestFieldValuesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;FormValueRepresentation&gt;**](FormValueRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRestTableFieldValuesUsingGET"></a>
# **getRestTableFieldValuesUsingGET**
> List&lt;FormValueRepresentation&gt; getRestTableFieldValuesUsingGET()

Retrieve field values (eg. the table field)

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessDefinitionsApi;








ProcessDefinitionsApi apiInstance = new ProcessDefinitionsApi();
try {
    List<FormValueRepresentation> result = apiInstance.getRestTableFieldValuesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessDefinitionsApi#getRestTableFieldValuesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;FormValueRepresentation&gt;**](FormValueRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

