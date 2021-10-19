# FormsApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFormDefinitionUsingGET**](FormsApi.md#getFormDefinitionUsingGET) | **GET** /v1/forms/{formId}/versions/{version} | Get form definition by version
[**getFormDefinitionUsingGET1**](FormsApi.md#getFormDefinitionUsingGET1) | **GET** /v1/forms/{formId} | Get form definition latest version
[**getFormDefinitionsUsingGET**](FormsApi.md#getFormDefinitionsUsingGET) | **GET** /v1/forms | Get form definitions summary
[**saveFormUsingPOST**](FormsApi.md#saveFormUsingPOST) | **POST** /v1/forms/{formId}/save | Save runtime forms
[**submitFormUsingPOST**](FormsApi.md#submitFormUsingPOST) | **POST** /v1/forms/{formId}/submit/versions/{version} | Submit forms specific version
[**submitFormUsingPOST1**](FormsApi.md#submitFormUsingPOST1) | **POST** /v1/forms/{formId}/submit | Submit forms latest version


<a name="getFormDefinitionUsingGET"></a>
# **getFormDefinitionUsingGET**
> ResponseEntity getFormDefinitionUsingGET(formId, version)

Get form definition by version

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.FormsApi;


FormsApi apiInstance = new FormsApi();
String formId = "formId_example"; // String | The id of the form definition
Integer version = 56; // Integer | version
try {
    ResponseEntity result = apiInstance.getFormDefinitionUsingGET(formId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#getFormDefinitionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **String**| The id of the form definition |
 **version** | **Integer**| version |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFormDefinitionUsingGET1"></a>
# **getFormDefinitionUsingGET1**
> ResponseEntity getFormDefinitionUsingGET1(formId)

Get form definition latest version

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.FormsApi;


FormsApi apiInstance = new FormsApi();
String formId = "formId_example"; // String | The id of the form definition
try {
    ResponseEntity result = apiInstance.getFormDefinitionUsingGET1(formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#getFormDefinitionUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **String**| The id of the form definition |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFormDefinitionsUsingGET"></a>
# **getFormDefinitionsUsingGET**
> ResponseEntityFormSummaryView getFormDefinitionsUsingGET()

Get form definitions summary

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.FormsApi;


FormsApi apiInstance = new FormsApi();
try {
    ResponseEntityFormSummaryView result = apiInstance.getFormDefinitionsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#getFormDefinitionsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseEntityFormSummaryView**](ResponseEntityFormSummaryView.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveFormUsingPOST"></a>
# **saveFormUsingPOST**
> saveFormUsingPOST(formId, saveFormRepresentation)

Save runtime forms

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.FormsApi;


FormsApi apiInstance = new FormsApi();
String formId = "formId_example"; // String | The id of the form instance to be saved
SaveFormRepresentation saveFormRepresentation = new SaveFormRepresentation(); // SaveFormRepresentation | saveFormRepresentation
try {
    apiInstance.saveFormUsingPOST(formId, saveFormRepresentation);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#saveFormUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **String**| The id of the form instance to be saved |
 **saveFormRepresentation** | [**SaveFormRepresentation**](SaveFormRepresentation.md)| saveFormRepresentation |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitFormUsingPOST"></a>
# **submitFormUsingPOST**
> ResponseEntity submitFormUsingPOST(formId, submitFormRepresentation, version)

Submit forms specific version

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.FormsApi;


FormsApi apiInstance = new FormsApi();
String formId = "formId_example"; // String | The id of the form to be submitted
SubmitFormRepresentation submitFormRepresentation = new SubmitFormRepresentation(); // SubmitFormRepresentation | submitFormRepresentation
Integer version = 56; // Integer | version
try {
    ResponseEntity result = apiInstance.submitFormUsingPOST(formId, submitFormRepresentation, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#submitFormUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **String**| The id of the form to be submitted |
 **submitFormRepresentation** | [**SubmitFormRepresentation**](SubmitFormRepresentation.md)| submitFormRepresentation |
 **version** | **Integer**| version |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitFormUsingPOST1"></a>
# **submitFormUsingPOST1**
> ResponseEntity submitFormUsingPOST1(formId, submitFormRepresentation)

Submit forms latest version

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.FormsApi;


FormsApi apiInstance = new FormsApi();
String formId = "formId_example"; // String | The id of the form to be submitted
SubmitFormRepresentation submitFormRepresentation = new SubmitFormRepresentation(); // SubmitFormRepresentation | submitFormRepresentation
try {
    ResponseEntity result = apiInstance.submitFormUsingPOST1(formId, submitFormRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#submitFormUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **String**| The id of the form to be submitted |
 **submitFormRepresentation** | [**SubmitFormRepresentation**](SubmitFormRepresentation.md)| submitFormRepresentation |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

