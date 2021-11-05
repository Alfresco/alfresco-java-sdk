# JobControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**allUsingGET**](JobControllerApi.md#allUsingGET) | **GET** /admin/v1/batch/jobs | all
[**getUsingGET**](JobControllerApi.md#getUsingGET) | **GET** /admin/v1/batch/jobs/{jobName} | get

<a name="allUsingGET"></a>
# **allUsingGET**
> ListResponseContentOfJob allUsingGET()

all

### Example
```java
// Import classes:
//import org.alfresco.activiti.query.ApiException;
//import org.alfresco.activiti.query.handler.JobControllerApi;


JobControllerApi apiInstance = new JobControllerApi();
try {
    ListResponseContentOfJob result = apiInstance.allUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobControllerApi#allUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListResponseContentOfJob**](ListResponseContentOfJob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getUsingGET"></a>
# **getUsingGET**
> EntryResponseContentOfJob getUsingGET(jobName)

get

### Example
```java
// Import classes:
//import org.alfresco.activiti.query.ApiException;
//import org.alfresco.activiti.query.handler.JobControllerApi;


JobControllerApi apiInstance = new JobControllerApi();
String jobName = "jobName_example"; // String | jobName
try {
    EntryResponseContentOfJob result = apiInstance.getUsingGET(jobName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobControllerApi#getUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobName** | **String**| jobName |

### Return type

[**EntryResponseContentOfJob**](EntryResponseContentOfJob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

