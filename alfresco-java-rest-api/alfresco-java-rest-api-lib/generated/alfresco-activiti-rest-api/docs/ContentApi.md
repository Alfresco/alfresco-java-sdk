# ContentApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRelatedContentOnProcessInstanceUsingPOST**](ContentApi.md#createRelatedContentOnProcessInstanceUsingPOST) | **POST** /enterprise/process-instances/{processInstanceId}/content | Attach existing content to a process instance
[**createRelatedContentOnProcessInstanceUsingPOST1**](ContentApi.md#createRelatedContentOnProcessInstanceUsingPOST1) | **POST** /enterprise/process-instances/{processInstanceId}/raw-content | Upload content and attach to a process instance
[**createRelatedContentOnTaskUsingPOST**](ContentApi.md#createRelatedContentOnTaskUsingPOST) | **POST** /enterprise/tasks/{taskId}/content | Attach existing content to a task
[**createRelatedContentOnTaskUsingPOST1**](ContentApi.md#createRelatedContentOnTaskUsingPOST1) | **POST** /enterprise/tasks/{taskId}/raw-content | Upload content and attach to a task
[**createTemporaryRawRelatedContentUsingPOST**](ContentApi.md#createTemporaryRawRelatedContentUsingPOST) | **POST** /enterprise/content/raw | Upload content and create a local representation
[**createTemporaryRelatedContentUsingPOST**](ContentApi.md#createTemporaryRelatedContentUsingPOST) | **POST** /enterprise/content | Create a local representation of content from a remote repository
[**deleteContentUsingDELETE**](ContentApi.md#deleteContentUsingDELETE) | **DELETE** /enterprise/content/{contentId} | Remove a local content representation
[**getContentUsingGET**](ContentApi.md#getContentUsingGET) | **GET** /enterprise/content/{contentId} | Get a local content representation
[**getRawContentUsingGET**](ContentApi.md#getRawContentUsingGET) | **GET** /enterprise/content/{contentId}/rendition/{renditionType} | Stream content rendition
[**getRawContentUsingGET1**](ContentApi.md#getRawContentUsingGET1) | **GET** /enterprise/content/{contentId}/raw | Stream content from a local content representation
[**getRelatedContentForProcessInstanceUsingGET**](ContentApi.md#getRelatedContentForProcessInstanceUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/content | List content attached to a process instance
[**getRelatedContentForTaskUsingGET**](ContentApi.md#getRelatedContentForTaskUsingGET) | **GET** /enterprise/tasks/{taskId}/content | List content attached to a task


<a name="createRelatedContentOnProcessInstanceUsingPOST"></a>
# **createRelatedContentOnProcessInstanceUsingPOST**
> RelatedContentRepresentation createRelatedContentOnProcessInstanceUsingPOST(processInstanceId, relatedContent, isRelatedContent)

Attach existing content to a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ContentApi;








ContentApi apiInstance = new ContentApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
RelatedContentRepresentation relatedContent = new RelatedContentRepresentation(); // RelatedContentRepresentation | relatedContent
Boolean isRelatedContent = true; // Boolean | isRelatedContent
try {
    RelatedContentRepresentation result = apiInstance.createRelatedContentOnProcessInstanceUsingPOST(processInstanceId, relatedContent, isRelatedContent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#createRelatedContentOnProcessInstanceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **relatedContent** | [**RelatedContentRepresentation**](RelatedContentRepresentation.md)| relatedContent |
 **isRelatedContent** | **Boolean**| isRelatedContent | [optional]

### Return type

[**RelatedContentRepresentation**](RelatedContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRelatedContentOnProcessInstanceUsingPOST1"></a>
# **createRelatedContentOnProcessInstanceUsingPOST1**
> RelatedContentRepresentation createRelatedContentOnProcessInstanceUsingPOST1(processInstanceId, file, isRelatedContent)

Upload content and attach to a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ContentApi;








ContentApi apiInstance = new ContentApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
File file = new File("/path/to/file.txt"); // File | file
Boolean isRelatedContent = true; // Boolean | isRelatedContent
try {
    RelatedContentRepresentation result = apiInstance.createRelatedContentOnProcessInstanceUsingPOST1(processInstanceId, file, isRelatedContent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#createRelatedContentOnProcessInstanceUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **file** | **File**| file |
 **isRelatedContent** | **Boolean**| isRelatedContent | [optional]

### Return type

[**RelatedContentRepresentation**](RelatedContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createRelatedContentOnTaskUsingPOST"></a>
# **createRelatedContentOnTaskUsingPOST**
> RelatedContentRepresentation createRelatedContentOnTaskUsingPOST(taskId, relatedContent, isRelatedContent)

Attach existing content to a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ContentApi;








ContentApi apiInstance = new ContentApi();
String taskId = "taskId_example"; // String | taskId
RelatedContentRepresentation relatedContent = new RelatedContentRepresentation(); // RelatedContentRepresentation | relatedContent
Boolean isRelatedContent = true; // Boolean | isRelatedContent
try {
    RelatedContentRepresentation result = apiInstance.createRelatedContentOnTaskUsingPOST(taskId, relatedContent, isRelatedContent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#createRelatedContentOnTaskUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **relatedContent** | [**RelatedContentRepresentation**](RelatedContentRepresentation.md)| relatedContent |
 **isRelatedContent** | **Boolean**| isRelatedContent | [optional]

### Return type

[**RelatedContentRepresentation**](RelatedContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRelatedContentOnTaskUsingPOST1"></a>
# **createRelatedContentOnTaskUsingPOST1**
> RelatedContentRepresentation createRelatedContentOnTaskUsingPOST1(taskId, file, isRelatedContent)

Upload content and attach to a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ContentApi;








ContentApi apiInstance = new ContentApi();
String taskId = "taskId_example"; // String | taskId
File file = new File("/path/to/file.txt"); // File | file
Boolean isRelatedContent = true; // Boolean | isRelatedContent
try {
    RelatedContentRepresentation result = apiInstance.createRelatedContentOnTaskUsingPOST1(taskId, file, isRelatedContent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#createRelatedContentOnTaskUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **file** | **File**| file |
 **isRelatedContent** | **Boolean**| isRelatedContent | [optional]

### Return type

[**RelatedContentRepresentation**](RelatedContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createTemporaryRawRelatedContentUsingPOST"></a>
# **createTemporaryRawRelatedContentUsingPOST**
> RelatedContentRepresentation createTemporaryRawRelatedContentUsingPOST(file)

Upload content and create a local representation

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ContentApi;








ContentApi apiInstance = new ContentApi();
File file = new File("/path/to/file.txt"); // File | file
try {
    RelatedContentRepresentation result = apiInstance.createTemporaryRawRelatedContentUsingPOST(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#createTemporaryRawRelatedContentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| file |

### Return type

[**RelatedContentRepresentation**](RelatedContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createTemporaryRelatedContentUsingPOST"></a>
# **createTemporaryRelatedContentUsingPOST**
> RelatedContentRepresentation createTemporaryRelatedContentUsingPOST(relatedContent)

Create a local representation of content from a remote repository

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ContentApi;








ContentApi apiInstance = new ContentApi();
RelatedContentRepresentation relatedContent = new RelatedContentRepresentation(); // RelatedContentRepresentation | relatedContent
try {
    RelatedContentRepresentation result = apiInstance.createTemporaryRelatedContentUsingPOST(relatedContent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#createTemporaryRelatedContentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relatedContent** | [**RelatedContentRepresentation**](RelatedContentRepresentation.md)| relatedContent |

### Return type

[**RelatedContentRepresentation**](RelatedContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContentUsingDELETE"></a>
# **deleteContentUsingDELETE**
> deleteContentUsingDELETE(contentId)

Remove a local content representation

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ContentApi;








ContentApi apiInstance = new ContentApi();
Long contentId = 789L; // Long | contentId
try {
    apiInstance.deleteContentUsingDELETE(contentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#deleteContentUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentId** | **Long**| contentId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContentUsingGET"></a>
# **getContentUsingGET**
> RelatedContentRepresentation getContentUsingGET(contentId)

Get a local content representation

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ContentApi;








ContentApi apiInstance = new ContentApi();
Long contentId = 789L; // Long | contentId
try {
    RelatedContentRepresentation result = apiInstance.getContentUsingGET(contentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#getContentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentId** | **Long**| contentId |

### Return type

[**RelatedContentRepresentation**](RelatedContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRawContentUsingGET"></a>
# **getRawContentUsingGET**
> getRawContentUsingGET(contentId, renditionType)

Stream content rendition

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ContentApi;








ContentApi apiInstance = new ContentApi();
Long contentId = 789L; // Long | contentId
String renditionType = "renditionType_example"; // String | renditionType
try {
    apiInstance.getRawContentUsingGET(contentId, renditionType);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#getRawContentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentId** | **Long**| contentId |
 **renditionType** | **String**| renditionType |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getRawContentUsingGET1"></a>
# **getRawContentUsingGET1**
> getRawContentUsingGET1(contentId)

Stream content from a local content representation

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ContentApi;








ContentApi apiInstance = new ContentApi();
Long contentId = 789L; // Long | contentId
try {
    apiInstance.getRawContentUsingGET1(contentId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#getRawContentUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentId** | **Long**| contentId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

<a name="getRelatedContentForProcessInstanceUsingGET"></a>
# **getRelatedContentForProcessInstanceUsingGET**
> ResultListDataRepresentationRelatedContentRepresentation getRelatedContentForProcessInstanceUsingGET(processInstanceId, isRelatedContent)

List content attached to a process instance

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ContentApi;








ContentApi apiInstance = new ContentApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
Boolean isRelatedContent = true; // Boolean | isRelatedContent
try {
    ResultListDataRepresentationRelatedContentRepresentation result = apiInstance.getRelatedContentForProcessInstanceUsingGET(processInstanceId, isRelatedContent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#getRelatedContentForProcessInstanceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **isRelatedContent** | **Boolean**| isRelatedContent | [optional]

### Return type

[**ResultListDataRepresentationRelatedContentRepresentation**](ResultListDataRepresentationRelatedContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelatedContentForTaskUsingGET"></a>
# **getRelatedContentForTaskUsingGET**
> ResultListDataRepresentationRelatedContentRepresentation getRelatedContentForTaskUsingGET(taskId, isRelatedContent)

List content attached to a task

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ContentApi;








ContentApi apiInstance = new ContentApi();
String taskId = "taskId_example"; // String | taskId
Boolean isRelatedContent = true; // Boolean | isRelatedContent
try {
    ResultListDataRepresentationRelatedContentRepresentation result = apiInstance.getRelatedContentForTaskUsingGET(taskId, isRelatedContent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#getRelatedContentForTaskUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **isRelatedContent** | **Boolean**| isRelatedContent | [optional]

### Return type

[**ResultListDataRepresentationRelatedContentRepresentation**](ResultListDataRepresentationRelatedContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

