# ProcessModelAdminControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProcessModelUsingGET**](ProcessModelAdminControllerApi.md#getProcessModelUsingGET) | **GET** /admin/v1/process-definitions/{processDefinitionId}/model | getProcessModel


<a name="getProcessModelUsingGET"></a>
# **getProcessModelUsingGET**
> String getProcessModelUsingGET(processDefinitionId)

getProcessModel

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.ProcessModelAdminControllerApi;


ProcessModelAdminControllerApi apiInstance = new ProcessModelAdminControllerApi();
String processDefinitionId = "processDefinitionId_example"; // String | processDefinitionId
try {
    String result = apiInstance.getProcessModelUsingGET(processDefinitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessModelAdminControllerApi#getProcessModelUsingGET");
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

