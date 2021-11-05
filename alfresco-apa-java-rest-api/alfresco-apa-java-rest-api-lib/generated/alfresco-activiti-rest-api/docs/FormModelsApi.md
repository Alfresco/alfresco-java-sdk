# FormModelsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFormEditorJsonUsingGET**](FormModelsApi.md#getFormEditorJsonUsingGET) | **GET** /activiti-app/api/enterprise/forms/{formId}/editorJson | Get form content
[**getFormHistoryUsingGET**](FormModelsApi.md#getFormHistoryUsingGET) | **GET** /activiti-app/api/enterprise/editor/form-models/{formId}/history/{formHistoryId} | Get form history
[**getFormUsingGET**](FormModelsApi.md#getFormUsingGET) | **GET** /activiti-app/api/enterprise/editor/form-models/{formId} | Get a form model
[**getFormUsingGET1**](FormModelsApi.md#getFormUsingGET1) | **GET** /activiti-app/api/enterprise/forms/{formId} | Get a form
[**getFormsUsingGET**](FormModelsApi.md#getFormsUsingGET) | **GET** /activiti-app/api/enterprise/editor/form-models/values | Get forms
[**getFormsUsingGET1**](FormModelsApi.md#getFormsUsingGET1) | **GET** /activiti-app/api/enterprise/editor/form-models | List form models
[**getFormsUsingGET2**](FormModelsApi.md#getFormsUsingGET2) | **GET** /activiti-app/api/enterprise/forms | Query forms
[**saveFormUsingPUT**](FormModelsApi.md#saveFormUsingPUT) | **PUT** /activiti-app/api/enterprise/editor/form-models/{formId} | Update form model content
[**validateModelUsingPUT1**](FormModelsApi.md#validateModelUsingPUT1) | **PUT** /activiti-app/api/enterprise/editor/form-models/{formId}/validate | Validate form model content

<a name="getFormEditorJsonUsingGET"></a>
# **getFormEditorJsonUsingGET**
> FormDefinitionRepresentation getFormEditorJsonUsingGET(formId)

Get form content

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.FormModelsApi;







FormModelsApi apiInstance = new FormModelsApi();
Long formId = 789L; // Long | formId
try {
    FormDefinitionRepresentation result = apiInstance.getFormEditorJsonUsingGET(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormModelsApi#getFormEditorJsonUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **Long**| formId |

### Return type

[**FormDefinitionRepresentation**](FormDefinitionRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFormHistoryUsingGET"></a>
# **getFormHistoryUsingGET**
> FormRepresentationRes getFormHistoryUsingGET(formId, formHistoryId)

Get form history

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.FormModelsApi;







FormModelsApi apiInstance = new FormModelsApi();
Long formId = 789L; // Long | formId
Long formHistoryId = 789L; // Long | formHistoryId
try {
    FormRepresentationRes result = apiInstance.getFormHistoryUsingGET(formId, formHistoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormModelsApi#getFormHistoryUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **Long**| formId |
 **formHistoryId** | **Long**| formHistoryId |

### Return type

[**FormRepresentationRes**](FormRepresentationRes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFormUsingGET"></a>
# **getFormUsingGET**
> FormRepresentation getFormUsingGET(formId)

Get a form model

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.FormModelsApi;







FormModelsApi apiInstance = new FormModelsApi();
Long formId = 789L; // Long | formId
try {
    FormRepresentation result = apiInstance.getFormUsingGET(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormModelsApi#getFormUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **Long**| formId |

### Return type

[**FormRepresentation**](FormRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFormUsingGET1"></a>
# **getFormUsingGET1**
> RuntimeFormRepresentation getFormUsingGET1(formId)

Get a form

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.FormModelsApi;







FormModelsApi apiInstance = new FormModelsApi();
Long formId = 789L; // Long | formId
try {
    RuntimeFormRepresentation result = apiInstance.getFormUsingGET1(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormModelsApi#getFormUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **Long**| formId |

### Return type

[**RuntimeFormRepresentation**](RuntimeFormRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFormsUsingGET"></a>
# **getFormsUsingGET**
> List&lt;FormRepresentationRes&gt; getFormsUsingGET(formId)

Get forms

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.FormModelsApi;







FormModelsApi apiInstance = new FormModelsApi();
String formId = "formId_example"; // String | formId
try {
    List<FormRepresentationRes> result = apiInstance.getFormsUsingGET(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormModelsApi#getFormsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **String**| formId |

### Return type

[**List&lt;FormRepresentationRes&gt;**](FormRepresentationRes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFormsUsingGET1"></a>
# **getFormsUsingGET1**
> ResultListDataRepresentationFormRepresentation getFormsUsingGET1()

List form models

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.FormModelsApi;







FormModelsApi apiInstance = new FormModelsApi();
try {
    ResultListDataRepresentationFormRepresentation result = apiInstance.getFormsUsingGET1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormModelsApi#getFormsUsingGET1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListDataRepresentationFormRepresentation**](ResultListDataRepresentationFormRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFormsUsingGET2"></a>
# **getFormsUsingGET2**
> ResultListDataRepresentationRuntimeFormRepresentation getFormsUsingGET2(nameLike, appId, tenantId, start, sort, order, size)

Query forms

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.FormModelsApi;







FormModelsApi apiInstance = new FormModelsApi();
String nameLike = "nameLike_example"; // String | nameLike
Long appId = 789L; // Long | appId
Long tenantId = 789L; // Long | tenantId
Integer start = 56; // Integer | start
String sort = "sort_example"; // String | sort
String order = "order_example"; // String | order
Integer size = 56; // Integer | size
try {
    ResultListDataRepresentationRuntimeFormRepresentation result = apiInstance.getFormsUsingGET2(nameLike, appId, tenantId, start, sort, order, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormModelsApi#getFormsUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nameLike** | **String**| nameLike | [optional]
 **appId** | **Long**| appId | [optional]
 **tenantId** | **Long**| tenantId | [optional]
 **start** | **Integer**| start | [optional]
 **sort** | **String**| sort | [optional]
 **order** | **String**| order | [optional]
 **size** | **Integer**| size | [optional]

### Return type

[**ResultListDataRepresentationRuntimeFormRepresentation**](ResultListDataRepresentationRuntimeFormRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveFormUsingPUT"></a>
# **saveFormUsingPUT**
> FormRepresentationRes saveFormUsingPUT(idOfTheFormToUpdate, body)

Update form model content

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.FormModelsApi;







FormModelsApi apiInstance = new FormModelsApi();
Long idOfTheFormToUpdate = 789L; // Long | formId
FormSaveRepresentation body = new FormSaveRepresentation(); // FormSaveRepresentation | 
try {
    FormRepresentationRes result = apiInstance.saveFormUsingPUT(idOfTheFormToUpdate, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormModelsApi#saveFormUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOfTheFormToUpdate** | **Long**| formId |
 **body** | [**FormSaveRepresentation**](FormSaveRepresentation.md)|  | [optional]

### Return type

[**FormRepresentationRes**](FormRepresentationRes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateModelUsingPUT1"></a>
# **validateModelUsingPUT1**
> List&lt;ValidationErrorRepresentation&gt; validateModelUsingPUT1(formId, body)

Validate form model content

The model content to be validated must be specified in the POST body

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.FormModelsApi;







FormModelsApi apiInstance = new FormModelsApi();
Long formId = 789L; // Long | formId
FormSaveRepresentation body = new FormSaveRepresentation(); // FormSaveRepresentation | 
try {
    List<ValidationErrorRepresentation> result = apiInstance.validateModelUsingPUT1(formId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormModelsApi#validateModelUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **Long**| formId |
 **body** | [**FormSaveRepresentation**](FormSaveRepresentation.md)|  | [optional]

### Return type

[**List&lt;ValidationErrorRepresentation&gt;**](ValidationErrorRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

