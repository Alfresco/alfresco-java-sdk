# JobExecutionControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**allUsingGET1**](JobExecutionControllerApi.md#allUsingGET1) | **GET** /admin/v1/batch/jobs/executions | all
[**getUsingGET1**](JobExecutionControllerApi.md#getUsingGET1) | **GET** /admin/v1/batch/jobs/executions/{id} | get
[**logUsingGET**](JobExecutionControllerApi.md#logUsingGET) | **GET** /admin/v1/batch/jobs/executions/{executionId}/log | log
[**postUsingPOST**](JobExecutionControllerApi.md#postUsingPOST) | **POST** /admin/v1/batch/jobs/executions | post

<a name="allUsingGET1"></a>
# **allUsingGET1**
> ListResponseContentOfJobExecution allUsingGET1(maxItems, skipCount, sort)

all

### Example
```java
// Import classes:
//import org.alfresco.activiti.audit.ApiException;
//import org.alfresco.activiti.audit.handler.JobExecutionControllerApi;


JobExecutionControllerApi apiInstance = new JobExecutionControllerApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfJobExecution result = apiInstance.allUsingGET1(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobExecutionControllerApi#allUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**ListResponseContentOfJobExecution**](ListResponseContentOfJobExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getUsingGET1"></a>
# **getUsingGET1**
> EntryResponseContentOfJobExecution getUsingGET1(id)

get

### Example
```java
// Import classes:
//import org.alfresco.activiti.audit.ApiException;
//import org.alfresco.activiti.audit.handler.JobExecutionControllerApi;


JobExecutionControllerApi apiInstance = new JobExecutionControllerApi();
Long id = 789L; // Long | id
try {
    EntryResponseContentOfJobExecution result = apiInstance.getUsingGET1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobExecutionControllerApi#getUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**EntryResponseContentOfJobExecution**](EntryResponseContentOfJobExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="logUsingGET"></a>
# **logUsingGET**
> InputStreamResource logUsingGET(executionId)

log

### Example
```java
// Import classes:
//import org.alfresco.activiti.audit.ApiException;
//import org.alfresco.activiti.audit.handler.JobExecutionControllerApi;


JobExecutionControllerApi apiInstance = new JobExecutionControllerApi();
Long executionId = 789L; // Long | executionId
try {
    InputStreamResource result = apiInstance.logUsingGET(executionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobExecutionControllerApi#logUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionId** | **Long**| executionId |

### Return type

[**InputStreamResource**](InputStreamResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postUsingPOST"></a>
# **postUsingPOST**
> EntryResponseContentOfJobExecution postUsingPOST(body)

post

### Example
```java
// Import classes:
//import org.alfresco.activiti.audit.ApiException;
//import org.alfresco.activiti.audit.handler.JobExecutionControllerApi;


JobExecutionControllerApi apiInstance = new JobExecutionControllerApi();
JobConfig body = new JobConfig(); // JobConfig | 
try {
    EntryResponseContentOfJobExecution result = apiInstance.postUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobExecutionControllerApi#postUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobConfig**](JobConfig.md)|  | [optional]

### Return type

[**EntryResponseContentOfJobExecution**](EntryResponseContentOfJobExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

