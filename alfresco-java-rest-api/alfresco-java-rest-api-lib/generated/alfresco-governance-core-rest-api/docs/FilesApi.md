# FilesApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**declareRecord**](FilesApi.md#declareRecord) | **POST** /files/{fileId}/declare | Declare as record


<a name="declareRecord"></a>
# **declareRecord**
> RecordEntry declareRecord(fileId, hideRecord, parentId, include, fields)

Declare as record

Declares the file **fileId** in the unfiled records container. The original file is moved to the Records Management site and a secondary parent association is created in the file&#39;s original site. Optionally, a destination record folder may be specified, enabling the record to be filed directly into that folder.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.core.handler.FilesApi;








FilesApi apiInstance = new FilesApi();
String fileId = "fileId_example"; // String | The identifier of a non-record file.
Boolean hideRecord = false; // Boolean | Flag to indicate whether the record should be hidden from the current parent folder.
String parentId = "parentId_example"; // String | The identifier of the destination record folder.
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the record. Any optional field from the response model can be requested. For example: * allowableOperations * content * isCompleted * path 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    RecordEntry result = apiInstance.declareRecord(fileId, hideRecord, parentId, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#declareRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The identifier of a non-record file. |
 **hideRecord** | **Boolean**| Flag to indicate whether the record should be hidden from the current parent folder. | [optional] [default to false]
 **parentId** | **String**| The identifier of the destination record folder. | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the record. Any optional field from the response model can be requested. For example: * allowableOperations * content * isCompleted * path  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**RecordEntry**](RecordEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

