# UserActionsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendNamedEventUsingPOST**](UserActionsApi.md#sendNamedEventUsingPOST) | **POST** /v1/user-action/event/{uiName}/{eventName}/send | Send a named event
[**submitFormUsingPOST2**](UserActionsApi.md#submitFormUsingPOST2) | **POST** /v1/user-action/form/{formId}/submit | Submit forms latest version

<a name="sendNamedEventUsingPOST"></a>
# **sendNamedEventUsingPOST**
> ResponseEntity sendNamedEventUsingPOST(uiName, eventName, body)

Send a named event

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiClient;
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.Configuration;
//import org.alfresco.activiti.form.auth.*;
//import org.alfresco.activiti.form.handler.UserActionsApi;



// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

UserActionsApi apiInstance = new UserActionsApi();
String uiName = "uiName_example"; // String | The name of the UI producing the event
String eventName = "eventName_example"; // String | The name of the event to send
NamedEventBody body = new NamedEventBody(); // NamedEventBody | 
try {
    ResponseEntity result = apiInstance.sendNamedEventUsingPOST(uiName, eventName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserActionsApi#sendNamedEventUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uiName** | **String**| The name of the UI producing the event |
 **eventName** | **String**| The name of the event to send |
 **body** | [**NamedEventBody**](NamedEventBody.md)|  | [optional]

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="submitFormUsingPOST2"></a>
# **submitFormUsingPOST2**
> ResponseEntity submitFormUsingPOST2(formId, body)

Submit forms latest version

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiClient;
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.Configuration;
//import org.alfresco.activiti.form.auth.*;
//import org.alfresco.activiti.form.handler.UserActionsApi;



// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

UserActionsApi apiInstance = new UserActionsApi();
String formId = "formId_example"; // String | The id of the form to be submitted
SubmitFormRepresentation body = new SubmitFormRepresentation(); // SubmitFormRepresentation | 
try {
    ResponseEntity result = apiInstance.submitFormUsingPOST2(formId, body);
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
 **body** | [**SubmitFormRepresentation**](SubmitFormRepresentation.md)|  | [optional]

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

