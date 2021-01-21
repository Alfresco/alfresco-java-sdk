# AccountIntegrationApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountsUsingGET**](AccountIntegrationApi.md#getAccountsUsingGET) | **GET** /enterprise/account/integration | Retrieve external account information


<a name="getAccountsUsingGET"></a>
# **getAccountsUsingGET**
> ResultListDataRepresentationAccountRepresentation getAccountsUsingGET()

Retrieve external account information

Accounts are used to integrate with third party apps and clients

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.AccountIntegrationApi;








AccountIntegrationApi apiInstance = new AccountIntegrationApi();
try {
    ResultListDataRepresentationAccountRepresentation result = apiInstance.getAccountsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountIntegrationApi#getAccountsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResultListDataRepresentationAccountRepresentation**](ResultListDataRepresentationAccountRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

