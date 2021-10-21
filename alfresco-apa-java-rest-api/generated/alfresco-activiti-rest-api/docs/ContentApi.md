# ContentApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRelatedContentOnProcessInstanceUsingPOST**](ContentApi.md#createRelatedContentOnProcessInstanceUsingPOST) | **POST** /activiti-app/api/enterprise/process-instances/{processInstanceId}/content | Attach existing content to a process instance
[**createRelatedContentOnProcessInstanceUsingPOST1**](ContentApi.md#createRelatedContentOnProcessInstanceUsingPOST1) | **POST** /activiti-app/api/enterprise/process-instances/{processInstanceId}/raw-content | Upload content and attach to a process instance
[**createRelatedContentOnTaskUsingPOST**](ContentApi.md#createRelatedContentOnTaskUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/content | Attach existing content to a task
[**createRelatedContentOnTaskUsingPOST1**](ContentApi.md#createRelatedContentOnTaskUsingPOST1) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/raw-content | Upload content and attach to a task
[**createTemporaryRawRelatedContentUsingPOST**](ContentApi.md#createTemporaryRawRelatedContentUsingPOST) | **POST** /activiti-app/api/enterprise/content/raw | Upload content and create a local representation
[**createTemporaryRelatedContentUsingPOST**](ContentApi.md#createTemporaryRelatedContentUsingPOST) | **POST** /activiti-app/api/enterprise/content | Create a local representation of content from a remote repository
[**deleteContentUsingDELETE**](ContentApi.md#deleteContentUsingDELETE) | **DELETE** /activiti-app/api/enterprise/content/{contentId} | Remove a local content representation
[**getContentUsingGET**](ContentApi.md#getContentUsingGET) | **GET** /activiti-app/api/enterprise/content/{contentId} | Get a local content representation
[**getRawContentUsingGET**](ContentApi.md#getRawContentUsingGET) | **GET** /activiti-app/api/enterprise/content/{contentId}/rendition/{renditionType} | Stream content rendition
[**getRawContentUsingGET1**](ContentApi.md#getRawContentUsingGET1) | **GET** /activiti-app/api/enterprise/content/{contentId}/raw | Stream content from a local content representation
[**getRelatedContentForProcessInstanceUsingGET**](ContentApi.md#getRelatedContentForProcessInstanceUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/content | List content attached to a process instance
[**getRelatedContentForTaskUsingGET**](ContentApi.md#getRelatedContentForTaskUsingGET) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/content | List content attached to a task

<a name="createRelatedContentOnProcessInstanceUsingPOST"></a>
# **createRelatedContentOnProcessInstanceUsingPOST**
> RelatedContentRepresentation createRelatedContentOnProcessInstanceUsingPOST(processInstanceId, body, isRelatedContent)

Attach existing content to a process instance

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ContentApi;







ContentApi apiInstance = new ContentApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
RelatedContentRepresentation body = new RelatedContentRepresentation(); // RelatedContentRepresentation | 
Boolean isRelatedContent = true; // Boolean | isRelatedContent
try {
    RelatedContentRepresentation result = apiInstance.createRelatedContentOnProcessInstanceUsingPOST(processInstanceId, body, isRelatedContent);
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
 **body** | [**RelatedContentRepresentation**](RelatedContentRepresentation.md)|  | [optional]
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
> RelatedContentRepresentation createRelatedContentOnProcessInstanceUsingPOST1(processInstanceId, body, isRelatedContent)

Upload content and attach to a process instance

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ContentApi;







ContentApi apiInstance = new ContentApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
Object body = null; // Object | 
Boolean isRelatedContent = true; // Boolean | isRelatedContent
try {
    RelatedContentRepresentation result = apiInstance.createRelatedContentOnProcessInstanceUsingPOST1(processInstanceId, body, isRelatedContent);
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
 **body** | **Object**|  | [optional]
 **isRelatedContent** | **Boolean**| isRelatedContent | [optional]

### Return type

[**RelatedContentRepresentation**](RelatedContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: application/json

<a name="createRelatedContentOnTaskUsingPOST"></a>
# **createRelatedContentOnTaskUsingPOST**
> RelatedContentRepresentation createRelatedContentOnTaskUsingPOST(taskId, body, isRelatedContent)

Attach existing content to a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ContentApi;







ContentApi apiInstance = new ContentApi();
String taskId = "taskId_example"; // String | taskId
RelatedContentRepresentation body = new RelatedContentRepresentation(); // RelatedContentRepresentation | 
Boolean isRelatedContent = true; // Boolean | isRelatedContent
try {
    RelatedContentRepresentation result = apiInstance.createRelatedContentOnTaskUsingPOST(taskId, body, isRelatedContent);
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
 **body** | [**RelatedContentRepresentation**](RelatedContentRepresentation.md)|  | [optional]
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
> RelatedContentRepresentation createRelatedContentOnTaskUsingPOST1(taskId, body, isRelatedContent)

Upload content and attach to a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ContentApi;







ContentApi apiInstance = new ContentApi();
String taskId = "taskId_example"; // String | taskId
Object body = null; // Object | 
Boolean isRelatedContent = true; // Boolean | isRelatedContent
try {
    RelatedContentRepresentation result = apiInstance.createRelatedContentOnTaskUsingPOST1(taskId, body, isRelatedContent);
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
 **body** | **Object**|  | [optional]
 **isRelatedContent** | **Boolean**| isRelatedContent | [optional]

### Return type

[**RelatedContentRepresentation**](RelatedContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: application/json

<a name="createTemporaryRawRelatedContentUsingPOST"></a>
# **createTemporaryRawRelatedContentUsingPOST**
> RelatedContentRepresentation createTemporaryRawRelatedContentUsingPOST(body)

Upload content and create a local representation

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ContentApi;







ContentApi apiInstance = new ContentApi();
Object body = null; // Object | 
try {
    RelatedContentRepresentation result = apiInstance.createTemporaryRawRelatedContentUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#createTemporaryRawRelatedContentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**|  | [optional]

### Return type

[**RelatedContentRepresentation**](RelatedContentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream
 - **Accept**: application/json

<a name="createTemporaryRelatedContentUsingPOST"></a>
# **createTemporaryRelatedContentUsingPOST**
> RelatedContentRepresentation createTemporaryRelatedContentUsingPOST(body)

Create a local representation of content from a remote repository

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ContentApi;







ContentApi apiInstance = new ContentApi();
RelatedContentRepresentation body = new RelatedContentRepresentation(); // RelatedContentRepresentation | 
try {
    RelatedContentRepresentation result = apiInstance.createTemporaryRelatedContentUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#createTemporaryRelatedContentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RelatedContentRepresentation**](RelatedContentRepresentation.md)|  | [optional]

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
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ContentApi;







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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getContentUsingGET"></a>
# **getContentUsingGET**
> RelatedContentRepresentation getContentUsingGET(contentId)

Get a local content representation

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ContentApi;







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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRawContentUsingGET"></a>
# **getRawContentUsingGET**
> getRawContentUsingGET(contentId, renditionType)

Stream content rendition

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ContentApi;







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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRawContentUsingGET1"></a>
# **getRawContentUsingGET1**
> getRawContentUsingGET1(contentId)

Stream content from a local content representation

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ContentApi;







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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRelatedContentForProcessInstanceUsingGET"></a>
# **getRelatedContentForProcessInstanceUsingGET**
> ResultListDataRepresentationRelatedContentRepresentation getRelatedContentForProcessInstanceUsingGET(processInstanceId, isRelatedContent)

List content attached to a process instance

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ContentApi;







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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRelatedContentForTaskUsingGET"></a>
# **getRelatedContentForTaskUsingGET**
> ResultListDataRepresentationRelatedContentRepresentation getRelatedContentForTaskUsingGET(taskId, isRelatedContent)

List content attached to a task

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ContentApi;







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

 - **Content-Type**: Not defined
 - **Accept**: application/json

