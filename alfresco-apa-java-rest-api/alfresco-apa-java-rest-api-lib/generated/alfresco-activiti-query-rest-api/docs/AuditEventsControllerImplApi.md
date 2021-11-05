# AuditEventsControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsingGET3**](AuditEventsControllerImplApi.md#findAllUsingGET3) | **GET** /v1/events | findAll
[**findByIdUsingGET**](AuditEventsControllerImplApi.md#findByIdUsingGET) | **GET** /v1/events/{eventId} | findById

<a name="findAllUsingGET3"></a>
# **findAllUsingGET3**
> ListResponseContentOfCloudRuntimeEventOfobjectAndstring findAllUsingGET3(maxItems, search, skipCount, sort)

findAll

### Example
```java
// Import classes:
//import org.alfresco.activiti.query.ApiException;
//import org.alfresco.activiti.query.handler.AuditEventsControllerImplApi;


AuditEventsControllerImplApi apiInstance = new AuditEventsControllerImplApi();
Integer maxItems = 56; // Integer | 
String search = "search_example"; // String | search
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudRuntimeEventOfobjectAndstring result = apiInstance.findAllUsingGET3(maxItems, search, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditEventsControllerImplApi#findAllUsingGET3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxItems** | **Integer**|  | [optional]
 **search** | **String**| search | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**ListResponseContentOfCloudRuntimeEventOfobjectAndstring**](ListResponseContentOfCloudRuntimeEventOfobjectAndstring.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> EntryResponseContentOfCloudRuntimeEventOfobjectAndstring findByIdUsingGET(eventId)

findById

### Example
```java
// Import classes:
//import org.alfresco.activiti.query.ApiException;
//import org.alfresco.activiti.query.handler.AuditEventsControllerImplApi;


AuditEventsControllerImplApi apiInstance = new AuditEventsControllerImplApi();
String eventId = "eventId_example"; // String | eventId
try {
    EntryResponseContentOfCloudRuntimeEventOfobjectAndstring result = apiInstance.findByIdUsingGET(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditEventsControllerImplApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| eventId |

### Return type

[**EntryResponseContentOfCloudRuntimeEventOfobjectAndstring**](EntryResponseContentOfCloudRuntimeEventOfobjectAndstring.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

