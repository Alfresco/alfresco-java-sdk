# UserActionsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendNamedEventUsingPOST**](UserActionsApi.md#sendNamedEventUsingPOST) | **POST** /v1/user-action/event/{uiName}/{eventName}/send | Send a named event
[**submitFormUsingPOST2**](UserActionsApi.md#submitFormUsingPOST2) | **POST** /v1/user-action/form/{formId}/submit | Submit forms latest version

<a name="sendNamedEventUsingPOST"></a>
# **sendNamedEventUsingPOST**
> ResponseEntity sendNamedEventUsingPOST(eventName, uiName, body)

Send a named event

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.UserActionsApi;


UserActionsApi apiInstance = new UserActionsApi();
String eventName = "eventName_example"; // String | The name of the event to send
String uiName = "uiName_example"; // String | The name of the UI producing the event
NamedEventBody body = new NamedEventBody(); // NamedEventBody | The object containing the nodes associated to the event
try {
    ResponseEntity result = apiInstance.sendNamedEventUsingPOST(eventName, uiName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserActionsApi#sendNamedEventUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventName** | **String**| The name of the event to send |
 **uiName** | **String**| The name of the UI producing the event |
 **body** | [**NamedEventBody**](NamedEventBody.md)| The object containing the nodes associated to the event | [optional]

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="submitFormUsingPOST2"></a>
# **submitFormUsingPOST2**
> ResponseEntity submitFormUsingPOST2(body, formId)

Submit forms latest version

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.UserActionsApi;


UserActionsApi apiInstance = new UserActionsApi();
SubmitFormRepresentation body = new SubmitFormRepresentation(); // SubmitFormRepresentation | submitFormRepresentation
String formId = "formId_example"; // String | The id of the form to be submitted
try {
    ResponseEntity result = apiInstance.submitFormUsingPOST2(body, formId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserActionsApi#submitFormUsingPOST2");
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
 - **Accept**: */*

