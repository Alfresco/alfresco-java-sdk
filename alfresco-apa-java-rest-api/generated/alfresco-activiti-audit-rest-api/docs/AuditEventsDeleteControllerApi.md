# AuditEventsDeleteControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEventsUsingDELETE**](AuditEventsDeleteControllerApi.md#deleteEventsUsingDELETE) | **DELETE** /admin/v1/events | deleteEvents


<a name="deleteEventsUsingDELETE"></a>
# **deleteEventsUsingDELETE**
> ListResponseContentOfCloudRuntimeEventOfobjectAndstring deleteEventsUsingDELETE()

deleteEvents

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.AuditEventsDeleteControllerApi;


AuditEventsDeleteControllerApi apiInstance = new AuditEventsDeleteControllerApi();
try {
    ListResponseContentOfCloudRuntimeEventOfobjectAndstring result = apiInstance.deleteEventsUsingDELETE();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditEventsDeleteControllerApi#deleteEventsUsingDELETE");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListResponseContentOfCloudRuntimeEventOfobjectAndstring**](ListResponseContentOfCloudRuntimeEventOfobjectAndstring.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

