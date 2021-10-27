# ApsModelControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**importProcessModelUsingPOST**](ApsModelControllerApi.md#importProcessModelUsingPOST) | **POST** /v1/aps/models/import/{projectId}/process | Import an APS Process Model

<a name="importProcessModelUsingPOST"></a>
# **importProcessModelUsingPOST**
> EntryResponseContentImportResult importProcessModelUsingPOST(projectId)

Import an APS Process Model

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ApsModelControllerApi;


ApsModelControllerApi apiInstance = new ApsModelControllerApi();
String projectId = "projectId_example"; // String | projectId
try {
    EntryResponseContentImportResult result = apiInstance.importProcessModelUsingPOST(projectId);
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

### Return type

[**EntryResponseContentImportResult**](EntryResponseContentImportResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

