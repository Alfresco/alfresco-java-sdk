# ProcessScopesApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRuntimeProcessScopesUsingPOST**](ProcessScopesApi.md#getRuntimeProcessScopesUsingPOST) | **POST** /enterprise/process-scopes | List runtime process scopes


<a name="getRuntimeProcessScopesUsingPOST"></a>
# **getRuntimeProcessScopesUsingPOST**
> List&lt;ProcessScopeRepresentation&gt; getRuntimeProcessScopesUsingPOST(processScopesRequest)

List runtime process scopes

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessScopesApi;








ProcessScopesApi apiInstance = new ProcessScopesApi();
ProcessScopesRequestRepresentation processScopesRequest = new ProcessScopesRequestRepresentation(); // ProcessScopesRequestRepresentation | processScopesRequest
try {
    List<ProcessScopeRepresentation> result = apiInstance.getRuntimeProcessScopesUsingPOST(processScopesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessScopesApi#getRuntimeProcessScopesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processScopesRequest** | [**ProcessScopesRequestRepresentation**](ProcessScopesRequestRepresentation.md)| processScopesRequest |

### Return type

[**List&lt;ProcessScopeRepresentation&gt;**](ProcessScopeRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

