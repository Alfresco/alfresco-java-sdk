# ApsModelControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**importProcessModelUsingPOST**](ApsModelControllerApi.md#importProcessModelUsingPOST) | **POST** /v1/aps/models/import/{projectId}/process | Import an APS Process Model

<a name="importProcessModelUsingPOST"></a>
# **importProcessModelUsingPOST**
> EntryResponseContentOfImportResult importProcessModelUsingPOST(projectId, file)

Import an APS Process Model

### Example
```java
// Import classes:
//import org.alfresco.activiti.dmn.simulation.ApiException;
//import org.alfresco.activiti.dmn.simulation.handler.ApsModelControllerApi;


ApsModelControllerApi apiInstance = new ApsModelControllerApi();
String projectId = "projectId_example"; // String | projectId
File file = new File("file_example"); // File | 
try {
    EntryResponseContentOfImportResult result = apiInstance.importProcessModelUsingPOST(projectId, file);
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
 **file** | **File**|  | [optional]

### Return type

[**EntryResponseContentOfImportResult**](EntryResponseContentOfImportResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

