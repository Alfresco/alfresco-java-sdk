# ApsModelControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**importProcessModelUsingPOST**](ApsModelControllerApi.md#importProcessModelUsingPOST) | **POST** /v1/aps/models/import/{projectId}/process | Import an APS Process Model

<a name="importProcessModelUsingPOST"></a>
# **importProcessModelUsingPOST**
> EntryResponseContentOfImportResult importProcessModelUsingPOST(projectId, body)

Import an APS Process Model

### Example
```java
// Import classes:
//import org.alfresco.activiti.script.modeling.ApiException;
//import org.alfresco.activiti.script.modeling.handler.ApsModelControllerApi;


ApsModelControllerApi apiInstance = new ApsModelControllerApi();
String projectId = "projectId_example"; // String | projectId
Object body = null; // Object | 
try {
    EntryResponseContentOfImportResult result = apiInstance.importProcessModelUsingPOST(projectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApsModelControllerApi#importProcessModelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| projectId |
 **body** | **Object**|  | [optional]

### Return type

[**EntryResponseContentOfImportResult**](EntryResponseContentOfImportResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, multipart/form-data
 - **Accept**: */*

