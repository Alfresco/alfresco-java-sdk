# ServiceTaskIntegrationContextAdminControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**findByIdUsingGET4**](ServiceTaskIntegrationContextAdminControllerApi.md#findByIdUsingGET4) | **GET** /admin/v1/service-tasks/{serviceTaskId}/integration-context | findById

<a name="findByIdUsingGET4"></a>
# **findByIdUsingGET4**
> EntryResponseContentOfCloudIntegrationContext findByIdUsingGET4(serviceTaskId)

findById

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.ServiceTaskIntegrationContextAdminControllerApi;


ServiceTaskIntegrationContextAdminControllerApi apiInstance = new ServiceTaskIntegrationContextAdminControllerApi();
String serviceTaskId = "serviceTaskId_example"; // String | serviceTaskId
try {
    EntryResponseContentOfCloudIntegrationContext result = apiInstance.findByIdUsingGET4(serviceTaskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceTaskIntegrationContextAdminControllerApi#findByIdUsingGET4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceTaskId** | **String**| serviceTaskId |

### Return type

[**EntryResponseContentOfCloudIntegrationContext**](EntryResponseContentOfCloudIntegrationContext.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

