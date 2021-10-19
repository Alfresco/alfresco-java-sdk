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
> EntryResponseContentCloudProcessInstance deleteProcessInstanceUsingDELETE(processInstanceId)

deleteProcessInstance

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.deleteProcessInstanceUsingDELETE(processInstanceId);
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

[**EntryResponseContentCloudProcessInstance**](EntryResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="getProcessInstanceByIdUsingGET"></a>
# **getProcessInstanceByIdUsingGET**
> EntryResponseContentCloudProcessInstance getProcessInstanceByIdUsingGET(processInstanceId)

getProcessInstanceById

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.getProcessInstanceByIdUsingGET(processInstanceId);
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

[**EntryResponseContentCloudProcessInstance**](EntryResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="getProcessInstancesUsingGET"></a>
# **getProcessInstancesUsingGET**
> ListResponseContentCloudProcessInstance getProcessInstancesUsingGET(maxItems, skipCount, sort)

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
    ListResponseContentCloudProcessInstance result = apiInstance.getProcessInstancesUsingGET(maxItems, skipCount, sort);
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

[**ListResponseContentCloudProcessInstance**](ListResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="receiveUsingPUT"></a>
# **receiveUsingPUT**
> receiveUsingPUT(receiveMessagePayload)

receive

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
ReceiveMessagePayload receiveMessagePayload = new ReceiveMessagePayload(); // ReceiveMessagePayload | receiveMessagePayload
try {
    apiInstance.receiveUsingPUT(receiveMessagePayload);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#receiveUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **receiveMessagePayload** | [**ReceiveMessagePayload**](ReceiveMessagePayload.md)| receiveMessagePayload |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="resumeUsingPOST"></a>
# **resumeUsingPOST**
> EntryResponseContentCloudProcessInstance resumeUsingPOST(processInstanceId)

resume

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.resumeUsingPOST(processInstanceId);
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

[**EntryResponseContentCloudProcessInstance**](EntryResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="startProcessUsingPOST"></a>
# **startProcessUsingPOST**
> EntryResponseContentCloudProcessInstance startProcessUsingPOST(startProcessPayload)

startProcess

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
StartProcessPayload startProcessPayload = new StartProcessPayload(); // StartProcessPayload | startProcessPayload
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.startProcessUsingPOST(startProcessPayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#startProcessUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startProcessPayload** | [**StartProcessPayload**](StartProcessPayload.md)| startProcessPayload |

### Return type

[**EntryResponseContentCloudProcessInstance**](EntryResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="startUsingPOST"></a>
# **startUsingPOST**
> EntryResponseContentCloudProcessInstance startUsingPOST(startMessagePayload)

start

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
StartMessagePayload startMessagePayload = new StartMessagePayload(); // StartMessagePayload | startMessagePayload
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.startUsingPOST(startMessagePayload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#startUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startMessagePayload** | [**StartMessagePayload**](StartMessagePayload.md)| startMessagePayload |

### Return type

[**EntryResponseContentCloudProcessInstance**](EntryResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="subprocessesUsingGET"></a>
# **subprocessesUsingGET**
> ListResponseContentCloudProcessInstance subprocessesUsingGET(processInstanceId, maxItems, skipCount, sort)

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
    ListResponseContentCloudProcessInstance result = apiInstance.subprocessesUsingGET(processInstanceId, maxItems, skipCount, sort);
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

[**ListResponseContentCloudProcessInstance**](ListResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="suspendUsingPOST"></a>
# **suspendUsingPOST**
> EntryResponseContentCloudProcessInstance suspendUsingPOST(processInstanceId)

suspend

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.suspendUsingPOST(processInstanceId);
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

[**EntryResponseContentCloudProcessInstance**](EntryResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="updateProcessUsingPUT"></a>
# **updateProcessUsingPUT**
> EntryResponseContentCloudProcessInstance updateProcessUsingPUT(payload, processInstanceId)

updateProcess

### Example
```java
// Import classes:
//import com.alfresco.activiti.form.ApiException;
//import com.alfresco.activiti.form.handler.ProcessInstanceAdminControllerImplApi;


ProcessInstanceAdminControllerImplApi apiInstance = new ProcessInstanceAdminControllerImplApi();
UpdateProcessPayload payload = new UpdateProcessPayload(); // UpdateProcessPayload | payload
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.updateProcessUsingPUT(payload, processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceAdminControllerImplApi#updateProcessUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**UpdateProcessPayload**](UpdateProcessPayload.md)| payload |
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**EntryResponseContentCloudProcessInstance**](EntryResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

