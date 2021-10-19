# UserActionsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendNamedEventUsingPOST**](UserActionsApi.md#sendNamedEventUsingPOST) | **POST** /v1/user-action/event/{uiName}/{eventName}/send | Send a named event
[**submitFormUsingPOST2**](UserActionsApi.md#submitFormUsingPOST2) | **POST** /v1/user-action/form/{formId}/submit | Submit forms latest version


<a name="sendNamedEventUsingPOST"></a>
# **sendNamedEventUsingPOST**
> ResponseEntity sendNamedEventUsingPOST(eventName, uiName, nodes)

Send a named event

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.UserActionsApi;


UserActionsApi apiInstance = new UserActionsApi();
String eventName = "eventName_example"; // String | The name of the event to send
String uiName = "uiName_example"; // String | The name of the UI producing the event
NamedEventBody nodes = new NamedEventBody(); // NamedEventBody | The object containing the nodes associated to the event
try {
    ResponseEntity result = apiInstance.sendNamedEventUsingPOST(eventName, uiName, nodes);
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
 **nodes** | [**NamedEventBody**](NamedEventBody.md)| The object containing the nodes associated to the event | [optional]

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="submitFormUsingPOST2"></a>
# **submitFormUsingPOST2**
> ResponseEntity submitFormUsingPOST2(formId, submitFormRepresentation)

Submit forms latest version

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.UserActionsApi;


UserActionsApi apiInstance = new UserActionsApi();
String formId = "formId_example"; // String | The id of the form to be submitted
SubmitFormRepresentation submitFormRepresentation = new SubmitFormRepresentation(); // SubmitFormRepresentation | submitFormRepresentation
try {
    ResponseEntity result = apiInstance.submitFormUsingPOST2(formId, submitFormRepresentation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserActionsApi#submitFormUsingPOST2");
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
 - **Accept**: */*

