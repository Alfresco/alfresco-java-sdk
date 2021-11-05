# ProcessScopesApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRuntimeProcessScopesUsingPOST**](ProcessScopesApi.md#getRuntimeProcessScopesUsingPOST) | **POST** /activiti-app/api/enterprise/process-scopes | List runtime process scopes

<a name="getRuntimeProcessScopesUsingPOST"></a>
# **getRuntimeProcessScopesUsingPOST**
> List&lt;ProcessScopeRepresentation&gt; getRuntimeProcessScopesUsingPOST(body)

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
ProcessScopesRequestRepresentation body = new ProcessScopesRequestRepresentation(); // ProcessScopesRequestRepresentation | 
try {
    List<ProcessScopeRepresentation> result = apiInstance.getRuntimeProcessScopesUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessScopesApi#getRuntimeProcessScopesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessScopesRequestRepresentation**](ProcessScopesRequestRepresentation.md)|  | [optional]

### Return type

[**List&lt;ProcessScopeRepresentation&gt;**](ProcessScopeRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

