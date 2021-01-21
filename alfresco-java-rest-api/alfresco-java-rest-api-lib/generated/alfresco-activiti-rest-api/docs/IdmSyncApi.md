# IdmSyncApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLogFileUsingGET**](IdmSyncApi.md#getLogFileUsingGET) | **GET** /enterprise/idm-sync-log-entries/{syncLogEntryId}/logfile | Get log file for a sync log entry
[**getSyncLogEntriesUsingGET**](IdmSyncApi.md#getSyncLogEntriesUsingGET) | **GET** /enterprise/idm-sync-log-entries | List sync log entries


<a name="getLogFileUsingGET"></a>
# **getLogFileUsingGET**
> getLogFileUsingGET(syncLogEntryId)

Get log file for a sync log entry

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IdmSyncApi;








IdmSyncApi apiInstance = new IdmSyncApi();
Long syncLogEntryId = 789L; // Long | syncLogEntryId
try {
    apiInstance.getLogFileUsingGET(syncLogEntryId);
} catch (ApiException e) {
    System.err.println("Exception when calling IdmSyncApi#getLogFileUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncLogEntryId** | **Long**| syncLogEntryId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSyncLogEntriesUsingGET"></a>
# **getSyncLogEntriesUsingGET**
> List&lt;SyncLogEntryRepresentation&gt; getSyncLogEntriesUsingGET(tenantId, page, start, size)

List sync log entries

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.IdmSyncApi;








IdmSyncApi apiInstance = new IdmSyncApi();
Long tenantId = 789L; // Long | tenantId
Integer page = 56; // Integer | page
Integer start = 56; // Integer | start
Integer size = 56; // Integer | size
try {
    List<SyncLogEntryRepresentation> result = apiInstance.getSyncLogEntriesUsingGET(tenantId, page, start, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdmSyncApi#getSyncLogEntriesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Long**| tenantId | [optional]
 **page** | **Integer**| page | [optional]
 **start** | **Integer**| start | [optional]
 **size** | **Integer**| size | [optional]

### Return type

[**List&lt;SyncLogEntryRepresentation&gt;**](SyncLogEntryRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

