# ProcessInstanceDiagramAdminControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProcessDiagramUsingGET**](ProcessInstanceDiagramAdminControllerApi.md#getProcessDiagramUsingGET) | **GET** /admin/v1/process-instances/{processInstanceId}/diagram | getProcessDiagram

<a name="getProcessDiagramUsingGET"></a>
# **getProcessDiagramUsingGET**
> String getProcessDiagramUsingGET(processInstanceId)

getProcessDiagram

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.ProcessInstanceDiagramAdminControllerApi;


ProcessInstanceDiagramAdminControllerApi apiInstance = new ProcessInstanceDiagramAdminControllerApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    String result = apiInstance.getProcessDiagramUsingGET(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceDiagramAdminControllerApi#getProcessDiagramUsingGET");
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

