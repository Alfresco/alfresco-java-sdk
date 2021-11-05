# ChecklistsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSubtaskUsingPOST**](ChecklistsApi.md#addSubtaskUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/checklist | Create a task checklist
[**getChecklistUsingGET**](ChecklistsApi.md#getChecklistUsingGET) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/checklist | Get checklist for a task
[**orderChecklistUsingPUT**](ChecklistsApi.md#orderChecklistUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/checklist | Change the order of items on a checklist

<a name="addSubtaskUsingPOST"></a>
# **addSubtaskUsingPOST**
> TaskRepresentation addSubtaskUsingPOST(taskId, body)

Create a task checklist

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ChecklistsApi;







ChecklistsApi apiInstance = new ChecklistsApi();
String taskId = "taskId_example"; // String | taskId
TaskRepresentation body = new TaskRepresentation(); // TaskRepresentation | 
try {
    TaskRepresentation result = apiInstance.addSubtaskUsingPOST(taskId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistsApi#addSubtaskUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**TaskRepresentation**](TaskRepresentation.md)|  | [optional]

### Return type

[**TaskRepresentation**](TaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChecklistUsingGET"></a>
# **getChecklistUsingGET**
> ResultListDataRepresentationTaskRepresentation getChecklistUsingGET(taskId)

Get checklist for a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ChecklistsApi;







ChecklistsApi apiInstance = new ChecklistsApi();
String taskId = "taskId_example"; // String | taskId
try {
    ResultListDataRepresentationTaskRepresentation result = apiInstance.getChecklistUsingGET(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistsApi#getChecklistUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**ResultListDataRepresentationTaskRepresentation**](ResultListDataRepresentationTaskRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderChecklistUsingPUT"></a>
# **orderChecklistUsingPUT**
> orderChecklistUsingPUT(taskId, body)

Change the order of items on a checklist

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ChecklistsApi;







ChecklistsApi apiInstance = new ChecklistsApi();
String taskId = "taskId_example"; // String | taskId
ChecklistOrderRepresentation body = new ChecklistOrderRepresentation(); // ChecklistOrderRepresentation | 
try {
    apiInstance.orderChecklistUsingPUT(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ChecklistsApi#orderChecklistUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**ChecklistOrderRepresentation**](ChecklistOrderRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

