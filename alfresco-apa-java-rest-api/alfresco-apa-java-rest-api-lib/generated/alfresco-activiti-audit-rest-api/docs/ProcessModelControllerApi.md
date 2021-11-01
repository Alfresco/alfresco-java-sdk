# ProcessModelControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProcessModelUsingGET1**](ProcessModelControllerApi.md#getProcessModelUsingGET1) | **GET** /v1/process-definitions/{processDefinitionId}/model | getProcessModel

<a name="getProcessModelUsingGET1"></a>
# **getProcessModelUsingGET1**
> String getProcessModelUsingGET1(processDefinitionId)

getProcessModel

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.ProcessModelControllerApi;


ProcessModelControllerApi apiInstance = new ProcessModelControllerApi();
String processDefinitionId = "processDefinitionId_example"; // String | processDefinitionId
try {
    String result = apiInstance.getProcessModelUsingGET1(processDefinitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessModelControllerApi#getProcessModelUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processDefinitionId** | **String**| processDefinitionId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml
