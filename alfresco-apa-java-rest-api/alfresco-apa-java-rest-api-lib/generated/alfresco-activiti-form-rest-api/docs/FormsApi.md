# FormsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

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
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.FormsApi;


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
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.FormsApi;


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
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.FormsApi;


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
> saveFormUsingPOST(body, formId)

Save runtime forms

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.FormsApi;


FormsApi apiInstance = new FormsApi();
SaveFormRepresentation body = new SaveFormRepresentation(); // SaveFormRepresentation | saveFormRepresentation
String formId = "formId_example"; // String | The id of the form instance to be saved
try {
    apiInstance.saveFormUsingPOST(body, formId);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#saveFormUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SaveFormRepresentation**](SaveFormRepresentation.md)| saveFormRepresentation |
 **formId** | **String**| The id of the form instance to be saved |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="submitFormUsingPOST"></a>
# **submitFormUsingPOST**
> ResponseEntity submitFormUsingPOST(body, formId, version)

Submit forms specific version

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.FormsApi;


FormsApi apiInstance = new FormsApi();
SubmitFormRepresentation body = new SubmitFormRepresentation(); // SubmitFormRepresentation | submitFormRepresentation
String formId = "formId_example"; // String | The id of the form to be submitted
Integer version = 56; // Integer | version
try {
    ResponseEntity result = apiInstance.submitFormUsingPOST(body, formId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#submitFormUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitFormRepresentation**](SubmitFormRepresentation.md)| submitFormRepresentation |
 **formId** | **String**| The id of the form to be submitted |
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
> ResponseEntity submitFormUsingPOST1(body, formId)

Submit forms latest version

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.FormsApi;


FormsApi apiInstance = new FormsApi();
SubmitFormRepresentation body = new SubmitFormRepresentation(); // SubmitFormRepresentation | submitFormRepresentation
String formId = "formId_example"; // String | The id of the form to be submitted
try {
    ResponseEntity result = apiInstance.submitFormUsingPOST1(body, formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FormsApi#submitFormUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitFormRepresentation**](SubmitFormRepresentation.md)| submitFormRepresentation |
 **formId** | **String**| The id of the form to be submitted |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

