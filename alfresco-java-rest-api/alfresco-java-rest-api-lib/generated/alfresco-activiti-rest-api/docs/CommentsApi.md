# CommentsApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProcessInstanceCommentUsingPOST**](CommentsApi.md#addProcessInstanceCommentUsingPOST) | **POST** /enterprise/process-instances/{processInstanceId}/comments | Add a comment to a process instance
[**addTaskCommentUsingPOST**](CommentsApi.md#addTaskCommentUsingPOST) | **POST** /enterprise/tasks/{taskId}/comments | Add a comment to a task
[**getProcessInstanceCommentsUsingGET**](CommentsApi.md#getProcessInstanceCommentsUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/comments | Get comments for a process
[**getTaskCommentsUsingGET**](CommentsApi.md#getTaskCommentsUsingGET) | **GET** /enterprise/tasks/{taskId}/comments | Get comments for a task


<a name="addProcessInstanceCommentUsingPOST"></a>
# **addProcessInstanceCommentUsingPOST**
> CommentRepresentation addProcessInstanceCommentUsingPOST(commentRequest, processInstanceId)

Add a comment to a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.CommentsApi;








CommentsApi apiInstance = new CommentsApi();
CommentRepresentation commentRequest = new CommentRepresentation(); // CommentRepresentation | commentRequest
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    CommentRepresentation result = apiInstance.addProcessInstanceCommentUsingPOST(commentRequest, processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#addProcessInstanceCommentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentRequest** | [**CommentRepresentation**](CommentRepresentation.md)| commentRequest |
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**CommentRepresentation**](CommentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addTaskCommentUsingPOST"></a>
# **addTaskCommentUsingPOST**
> CommentRepresentation addTaskCommentUsingPOST(commentRequest, taskId)

Add a comment to a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.CommentsApi;








CommentsApi apiInstance = new CommentsApi();
CommentRepresentation commentRequest = new CommentRepresentation(); // CommentRepresentation | commentRequest
String taskId = "taskId_example"; // String | taskId
try {
    CommentRepresentation result = apiInstance.addTaskCommentUsingPOST(commentRequest, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#addTaskCommentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentRequest** | [**CommentRepresentation**](CommentRepresentation.md)| commentRequest |
 **taskId** | **String**| taskId |

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
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.CommentsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskCommentsUsingGET"></a>
# **getTaskCommentsUsingGET**
> ResultListDataRepresentationCommentRepresentation getTaskCommentsUsingGET(taskId, latestFirst)

Get comments for a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.CommentsApi;








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

 - **Content-Type**: application/json
 - **Accept**: application/json

