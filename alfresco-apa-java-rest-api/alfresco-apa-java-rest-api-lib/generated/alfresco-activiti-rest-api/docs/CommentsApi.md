# CommentsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProcessInstanceCommentUsingPOST**](CommentsApi.md#addProcessInstanceCommentUsingPOST) | **POST** /activiti-app/api/enterprise/process-instances/{processInstanceId}/comments | Add a comment to a process instance
[**addTaskCommentUsingPOST**](CommentsApi.md#addTaskCommentUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/comments | Add a comment to a task
[**getProcessInstanceCommentsUsingGET**](CommentsApi.md#getProcessInstanceCommentsUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/comments | Get comments for a process
[**getTaskCommentsUsingGET**](CommentsApi.md#getTaskCommentsUsingGET) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/comments | Get comments for a task

<a name="addProcessInstanceCommentUsingPOST"></a>
# **addProcessInstanceCommentUsingPOST**
> CommentRepresentation addProcessInstanceCommentUsingPOST(processInstanceId, body)

Add a comment to a process instance

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.CommentsApi;







CommentsApi apiInstance = new CommentsApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
CommentRepresentation body = new CommentRepresentation(); // CommentRepresentation | 
try {
    CommentRepresentation result = apiInstance.addProcessInstanceCommentUsingPOST(processInstanceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#addProcessInstanceCommentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **body** | [**CommentRepresentation**](CommentRepresentation.md)|  | [optional]

### Return type

[**CommentRepresentation**](CommentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addTaskCommentUsingPOST"></a>
# **addTaskCommentUsingPOST**
> CommentRepresentation addTaskCommentUsingPOST(taskId, body)

Add a comment to a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.CommentsApi;







CommentsApi apiInstance = new CommentsApi();
String taskId = "taskId_example"; // String | taskId
CommentRepresentation body = new CommentRepresentation(); // CommentRepresentation | 
try {
    CommentRepresentation result = apiInstance.addTaskCommentUsingPOST(taskId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#addTaskCommentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**CommentRepresentation**](CommentRepresentation.md)|  | [optional]

### Return type

[**CommentRepresentation**](CommentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessInstanceCommentsUsingGET"></a>
# **getProcessInstanceCommentsUsingGET**
> ResultListDataRepresentationCommentRepresentation getProcessInstanceCommentsUsingGET(processInstanceId, latestFirst)

Get comments for a process

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.CommentsApi;







CommentsApi apiInstance = new CommentsApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
Boolean latestFirst = true; // Boolean | latestFirst
try {
    ResultListDataRepresentationCommentRepresentation result = apiInstance.getProcessInstanceCommentsUsingGET(processInstanceId, latestFirst);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#getProcessInstanceCommentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **latestFirst** | **Boolean**| latestFirst | [optional]

### Return type

[**ResultListDataRepresentationCommentRepresentation**](ResultListDataRepresentationCommentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskCommentsUsingGET"></a>
# **getTaskCommentsUsingGET**
> ResultListDataRepresentationCommentRepresentation getTaskCommentsUsingGET(taskId, latestFirst)

Get comments for a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.CommentsApi;







CommentsApi apiInstance = new CommentsApi();
String taskId = "taskId_example"; // String | taskId
Boolean latestFirst = true; // Boolean | latestFirst
try {
    ResultListDataRepresentationCommentRepresentation result = apiInstance.getTaskCommentsUsingGET(taskId, latestFirst);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#getTaskCommentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **latestFirst** | **Boolean**| latestFirst | [optional]

### Return type

[**ResultListDataRepresentationCommentRepresentation**](ResultListDataRepresentationCommentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

