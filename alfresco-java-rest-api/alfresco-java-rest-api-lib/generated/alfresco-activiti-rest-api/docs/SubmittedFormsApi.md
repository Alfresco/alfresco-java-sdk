# SubmittedFormsApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFormSubmittedFromsUsingGET**](SubmittedFormsApi.md#getFormSubmittedFromsUsingGET) | **GET** /enterprise/form-submitted-forms/{formId} | List submissions for a form
[**getProcessSubmittedFromsUsingGET**](SubmittedFormsApi.md#getProcessSubmittedFromsUsingGET) | **GET** /enterprise/process-submitted-forms/{processId} | List submissions for a process instance
[**getSubmittedFromUsingGET**](SubmittedFormsApi.md#getSubmittedFromUsingGET) | **GET** /enterprise/submitted-forms/{submittedFormId} | Get a form submission
[**getTaskSubmittedFromsUsingGET**](SubmittedFormsApi.md#getTaskSubmittedFromsUsingGET) | **GET** /enterprise/task-submitted-form/{taskId} | Get the submitted form for a task


<a name="getFormSubmittedFromsUsingGET"></a>
# **getFormSubmittedFromsUsingGET**
> ResultListDataRepresentationSubmittedFormRepresentation getFormSubmittedFromsUsingGET(formId, submittedBy, start, size)

List submissions for a form

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.SubmittedFormsApi;








SubmittedFormsApi apiInstance = new SubmittedFormsApi();
Long formId = 789L; // Long | formId
Long submittedBy = 789L; // Long | submittedBy
Integer start = 56; // Integer | start
Integer size = 56; // Integer | size
try {
    ResultListDataRepresentationSubmittedFormRepresentation result = apiInstance.getFormSubmittedFromsUsingGET(formId, submittedBy, start, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmittedFormsApi#getFormSubmittedFromsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formId** | **Long**| formId |
 **submittedBy** | **Long**| submittedBy | [optional]
 **start** | **Integer**| start | [optional]
 **size** | **Integer**| size | [optional]

### Return type

[**ResultListDataRepresentationSubmittedFormRepresentation**](ResultListDataRepresentationSubmittedFormRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessSubmittedFromsUsingGET"></a>
# **getProcessSubmittedFromsUsingGET**
> ResultListDataRepresentationSubmittedFormRepresentation getProcessSubmittedFromsUsingGET(processId)

List submissions for a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.SubmittedFormsApi;








SubmittedFormsApi apiInstance = new SubmittedFormsApi();
String processId = "processId_example"; // String | processId
try {
    ResultListDataRepresentationSubmittedFormRepresentation result = apiInstance.getProcessSubmittedFromsUsingGET(processId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmittedFormsApi#getProcessSubmittedFromsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | **String**| processId |

### Return type

[**ResultListDataRepresentationSubmittedFormRepresentation**](ResultListDataRepresentationSubmittedFormRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubmittedFromUsingGET"></a>
# **getSubmittedFromUsingGET**
> SubmittedFormRepresentation getSubmittedFromUsingGET(submittedFormId)

Get a form submission

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.SubmittedFormsApi;








SubmittedFormsApi apiInstance = new SubmittedFormsApi();
Long submittedFormId = 789L; // Long | submittedFormId
try {
    SubmittedFormRepresentation result = apiInstance.getSubmittedFromUsingGET(submittedFormId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmittedFormsApi#getSubmittedFromUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submittedFormId** | **Long**| submittedFormId |

### Return type

[**SubmittedFormRepresentation**](SubmittedFormRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskSubmittedFromsUsingGET"></a>
# **getTaskSubmittedFromsUsingGET**
> SubmittedFormRepresentation getTaskSubmittedFromsUsingGET(taskId)

Get the submitted form for a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.SubmittedFormsApi;








SubmittedFormsApi apiInstance = new SubmittedFormsApi();
String taskId = "taskId_example"; // String | taskId
try {
    SubmittedFormRepresentation result = apiInstance.getTaskSubmittedFromsUsingGET(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubmittedFormsApi#getTaskSubmittedFromsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**SubmittedFormRepresentation**](SubmittedFormRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

