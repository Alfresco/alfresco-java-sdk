# CleanupQueryProcessInstancesJobExecutionControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**launchUsingPOST**](CleanupQueryProcessInstancesJobExecutionControllerApi.md#launchUsingPOST) | **POST** /admin/v1/batch/jobs/executions/cleanup-query-process-instance-history-job | launch

<a name="launchUsingPOST"></a>
# **launchUsingPOST**
> EntryResponseContentOfJobExecution launchUsingPOST(body)

launch

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.CleanupQueryProcessInstancesJobExecutionControllerApi;


CleanupQueryProcessInstancesJobExecutionControllerApi apiInstance = new CleanupQueryProcessInstancesJobExecutionControllerApi();
CleanupQueryProcessInstancesJobRequest body = new CleanupQueryProcessInstancesJobRequest(); // CleanupQueryProcessInstancesJobRequest | launchRequest
try {
    EntryResponseContentOfJobExecution result = apiInstance.launchUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CleanupQueryProcessInstancesJobExecutionControllerApi#launchUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CleanupQueryProcessInstancesJobRequest**](CleanupQueryProcessInstancesJobRequest.md)| launchRequest |

### Return type

[**EntryResponseContentOfJobExecution**](EntryResponseContentOfJobExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

