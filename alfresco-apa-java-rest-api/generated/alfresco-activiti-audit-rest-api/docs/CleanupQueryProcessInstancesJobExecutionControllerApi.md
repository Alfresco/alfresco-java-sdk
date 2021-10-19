# CleanupQueryProcessInstancesJobExecutionControllerApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**launchUsingPOST**](CleanupQueryProcessInstancesJobExecutionControllerApi.md#launchUsingPOST) | **POST** /admin/v1/batch/jobs/executions/cleanup-query-process-instance-history-job | launch


<a name="launchUsingPOST"></a>
# **launchUsingPOST**
> EntryResponseContentOfJobExecution launchUsingPOST(launchRequest)

launch

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.CleanupQueryProcessInstancesJobExecutionControllerApi;


CleanupQueryProcessInstancesJobExecutionControllerApi apiInstance = new CleanupQueryProcessInstancesJobExecutionControllerApi();
CleanupQueryProcessInstancesJobRequest launchRequest = new CleanupQueryProcessInstancesJobRequest(); // CleanupQueryProcessInstancesJobRequest | launchRequest
try {
    EntryResponseContentOfJobExecution result = apiInstance.launchUsingPOST(launchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CleanupQueryProcessInstancesJobExecutionControllerApi#launchUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **launchRequest** | [**CleanupQueryProcessInstancesJobRequest**](CleanupQueryProcessInstancesJobRequest.md)| launchRequest |

### Return type

[**EntryResponseContentOfJobExecution**](EntryResponseContentOfJobExecution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

