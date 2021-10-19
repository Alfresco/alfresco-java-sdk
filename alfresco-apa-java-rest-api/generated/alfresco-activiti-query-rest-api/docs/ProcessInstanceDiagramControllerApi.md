# ProcessInstanceDiagramControllerApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProcessDiagramUsingGET1**](ProcessInstanceDiagramControllerApi.md#getProcessDiagramUsingGET1) | **GET** /v1/process-instances/{processInstanceId}/diagram | getProcessDiagram


<a name="getProcessDiagramUsingGET1"></a>
# **getProcessDiagramUsingGET1**
> String getProcessDiagramUsingGET1(processInstanceId)

getProcessDiagram

### Example
```java
// Import classes:
//import com.alfresco.activiti.query.ApiException;
//import com.alfresco.activiti.query.handler.ProcessInstanceDiagramControllerApi;


ProcessInstanceDiagramControllerApi apiInstance = new ProcessInstanceDiagramControllerApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    String result = apiInstance.getProcessDiagramUsingGET1(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceDiagramControllerApi#getProcessDiagramUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/svg+xml

