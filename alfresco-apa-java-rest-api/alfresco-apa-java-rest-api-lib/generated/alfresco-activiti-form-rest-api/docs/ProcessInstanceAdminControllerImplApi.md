# ProcessInstanceAdminControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteProcessInstanceUsingDELETE**](ProcessInstanceAdminControllerImplApi.md#deleteProcessInstanceUsingDELETE) | **DELETE** /admin/v1/process-instances/{processInstanceId} | deleteProcessInstance
[**getProcessInstanceByIdUsingGET**](ProcessInstanceAdminControllerImplApi.md#getProcessInstanceByIdUsingGET) | **GET** /admin/v1/process-instances/{processInstanceId} | getProcessInstanceById
[**getProcessInstancesUsingGET**](ProcessInstanceAdminControllerImplApi.md#getProcessInstancesUsingGET) | **GET** /admin/v1/process-instances | getProcessInstances
[**receiveUsingPUT**](ProcessInstanceAdminControllerImplApi.md#receiveUsingPUT) | **PUT** /admin/v1/process-instances/message | receive
[**resumeUsingPOST**](ProcessInstanceAdminControllerImplApi.md#resumeUsingPOST) | **POST** /admin/v1/process-instances/{processInstanceId}/resume | resume
[**startProcessUsingPOST**](ProcessInstanceAdminControllerImplApi.md#startProcessUsingPOST) | **POST** /admin/v1/process-instances | startProcess
[**startUsingPOST**](ProcessInstanceAdminControllerImplApi.md#startUsingPOST) | **POST** /admin/v1/process-instances/message | start
[**subprocessesUsingGET**](ProcessInstanceAdminControllerImplApi.md#subprocessesUsingGET) | **GET** /admin/v1/process-instances/{processInstanceId}/subprocesses | subprocesses
[**suspendUsingPOST**](ProcessInstanceAdminControllerImplApi.md#suspendUsingPOST) | **POST** /admin/v1/process-instances/{processInstanceId}/suspend | suspend
[**updateProcessUsingPUT**](ProcessInstanceAdminControllerImplApi.md#updateProcessUsingPUT) | **PUT** /admin/v1/process-instances/{processInstanceId} | updateProcess

<a name="deleteProcessInstanceUsingDELETE"></a>
# **deleteProcessInstanceUsingDELETE**
> EntryResponseContentOfCloudProcessInstance deleteProcessInstanceUsingDELETE(processInstanceId)

deleteProcessInstance

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentOfCloudProcessInstance result = apiInstance.deleteProcessInstanceUsingDELETE(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#deleteProcessInstanceUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**EntryResponseContentOfCloudProcessInstance**](EntryResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getProcessInstanceByIdUsingGET"></a>
# **getProcessInstanceByIdUsingGET**
> EntryResponseContentOfCloudProcessInstance getProcessInstanceByIdUsingGET(processInstanceId)

getProcessInstanceById

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentOfCloudProcessInstance result = apiInstance.getProcessInstanceByIdUsingGET(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#getProcessInstanceByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**EntryResponseContentOfCloudProcessInstance**](EntryResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getProcessInstancesUsingGET"></a>
# **getProcessInstancesUsingGET**
> ListResponseContentOfCloudProcessInstance getProcessInstancesUsingGET(maxItems, skipCount, sort)

getProcessInstances

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudProcessInstance result = apiInstance.getProcessInstancesUsingGET(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#getProcessInstancesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**ListResponseContentOfCloudProcessInstance**](ListResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="receiveUsingPUT"></a>
# **receiveUsingPUT**
> receiveUsingPUT(body)

receive

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
ReceiveMessagePayload body = new ReceiveMessagePayload(); // ReceiveMessagePayload | 
try {
    apiInstance.receiveUsingPUT(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#receiveUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReceiveMessagePayload**](ReceiveMessagePayload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="resumeUsingPOST"></a>
# **resumeUsingPOST**
> EntryResponseContentOfCloudProcessInstance resumeUsingPOST(processInstanceId)

resume

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentOfCloudProcessInstance result = apiInstance.resumeUsingPOST(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#resumeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**EntryResponseContentOfCloudProcessInstance**](EntryResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="startProcessUsingPOST"></a>
# **startProcessUsingPOST**
> EntryResponseContentOfCloudProcessInstance startProcessUsingPOST(body)

startProcess

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
StartProcessPayload body = new StartProcessPayload(); // StartProcessPayload | 
try {
    EntryResponseContentOfCloudProcessInstance result = apiInstance.startProcessUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#startProcessUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StartProcessPayload**](StartProcessPayload.md)|  | [optional]

### Return type

[**EntryResponseContentOfCloudProcessInstance**](EntryResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

<a name="startUsingPOST"></a>
# **startUsingPOST**
> EntryResponseContentOfCloudProcessInstance startUsingPOST(body)

start

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
StartMessagePayload body = new StartMessagePayload(); // StartMessagePayload | 
try {
    EntryResponseContentOfCloudProcessInstance result = apiInstance.startUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#startUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StartMessagePayload**](StartMessagePayload.md)|  | [optional]

### Return type

[**EntryResponseContentOfCloudProcessInstance**](EntryResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

<a name="subprocessesUsingGET"></a>
# **subprocessesUsingGET**
> ListResponseContentOfCloudProcessInstance subprocessesUsingGET(processInstanceId, maxItems, skipCount, sort)

subprocesses

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentOfCloudProcessInstance result = apiInstance.subprocessesUsingGET(processInstanceId, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#subprocessesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**ListResponseContentOfCloudProcessInstance**](ListResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="suspendUsingPOST"></a>
# **suspendUsingPOST**
> EntryResponseContentOfCloudProcessInstance suspendUsingPOST(processInstanceId)

suspend

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentOfCloudProcessInstance result = apiInstance.suspendUsingPOST(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#suspendUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**EntryResponseContentOfCloudProcessInstance**](EntryResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="updateProcessUsingPUT"></a>
# **updateProcessUsingPUT**
> EntryResponseContentOfCloudProcessInstance updateProcessUsingPUT(processInstanceId, body)

updateProcess

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
UpdateProcessPayload body = new UpdateProcessPayload(); // UpdateProcessPayload | 
try {
    EntryResponseContentOfCloudProcessInstance result = apiInstance.updateProcessUsingPUT(processInstanceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#updateProcessUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **body** | [**UpdateProcessPayload**](UpdateProcessPayload.md)|  | [optional]

### Return type

[**EntryResponseContentOfCloudProcessInstance**](EntryResponseContentOfCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

