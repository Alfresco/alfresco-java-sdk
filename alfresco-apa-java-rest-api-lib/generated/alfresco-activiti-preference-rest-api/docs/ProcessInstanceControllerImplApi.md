# ProcessInstanceControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcessInstanceUsingPOST**](ProcessInstanceControllerImplApi.md#createProcessInstanceUsingPOST) | **POST** /v1/process-instances/create | createProcessInstance
[**deleteProcessInstanceUsingDELETE1**](ProcessInstanceControllerImplApi.md#deleteProcessInstanceUsingDELETE1) | **DELETE** /v1/process-instances/{processInstanceId} | deleteProcessInstance
[**getProcessDiagramUsingGET**](ProcessInstanceControllerImplApi.md#getProcessDiagramUsingGET) | **GET** /v1/process-instances/{processInstanceId}/model | getProcessDiagram
[**getProcessInstanceByIdUsingGET1**](ProcessInstanceControllerImplApi.md#getProcessInstanceByIdUsingGET1) | **GET** /v1/process-instances/{processInstanceId} | getProcessInstanceById
[**getProcessInstancesUsingGET1**](ProcessInstanceControllerImplApi.md#getProcessInstancesUsingGET1) | **GET** /v1/process-instances | getProcessInstances
[**receiveUsingPUT1**](ProcessInstanceControllerImplApi.md#receiveUsingPUT1) | **PUT** /v1/process-instances/message | receive
[**resumeUsingPOST1**](ProcessInstanceControllerImplApi.md#resumeUsingPOST1) | **POST** /v1/process-instances/{processInstanceId}/resume | resume
[**sendSignalUsingPOST**](ProcessInstanceControllerImplApi.md#sendSignalUsingPOST) | **POST** /v1/process-instances/signal | sendSignal
[**sendStartMessageUsingPOST**](ProcessInstanceControllerImplApi.md#sendStartMessageUsingPOST) | **POST** /v1/process-instances/message | sendStartMessage
[**startCreatedProcessUsingPOST**](ProcessInstanceControllerImplApi.md#startCreatedProcessUsingPOST) | **POST** /v1/process-instances/{processInstanceId}/start | startCreatedProcess
[**startProcessUsingPOST1**](ProcessInstanceControllerImplApi.md#startProcessUsingPOST1) | **POST** /v1/process-instances | startProcess
[**subprocessesUsingGET1**](ProcessInstanceControllerImplApi.md#subprocessesUsingGET1) | **GET** /v1/process-instances/{processInstanceId}/subprocesses | subprocesses
[**suspendUsingPOST1**](ProcessInstanceControllerImplApi.md#suspendUsingPOST1) | **POST** /v1/process-instances/{processInstanceId}/suspend | suspend
[**updateProcessUsingPUT1**](ProcessInstanceControllerImplApi.md#updateProcessUsingPUT1) | **PUT** /v1/process-instances/{processInstanceId} | updateProcess

<a name="createProcessInstanceUsingPOST"></a>
# **createProcessInstanceUsingPOST**
> EntryResponseContentCloudProcessInstance createProcessInstanceUsingPOST(body)

createProcessInstance

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
CreateProcessInstancePayload body = new CreateProcessInstancePayload(); // CreateProcessInstancePayload | createProcessInstancePayload
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.createProcessInstanceUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#createProcessInstanceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateProcessInstancePayload**](CreateProcessInstancePayload.md)| createProcessInstancePayload |

### Return type

[**EntryResponseContentCloudProcessInstance**](EntryResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="deleteProcessInstanceUsingDELETE1"></a>
# **deleteProcessInstanceUsingDELETE1**
> EntryResponseContentCloudProcessInstance deleteProcessInstanceUsingDELETE1(processInstanceId)

deleteProcessInstance

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.deleteProcessInstanceUsingDELETE1(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#deleteProcessInstanceUsingDELETE1");
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

<a name="getProcessDiagramUsingGET"></a>
# **getProcessDiagramUsingGET**
> String getProcessDiagramUsingGET(processInstanceId)

getProcessDiagram

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    String result = apiInstance.getProcessDiagramUsingGET(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#getProcessDiagramUsingGET");
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

<a name="getProcessInstanceByIdUsingGET1"></a>
# **getProcessInstanceByIdUsingGET1**
> EntryResponseContentCloudProcessInstance getProcessInstanceByIdUsingGET1(processInstanceId)

getProcessInstanceById

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.getProcessInstanceByIdUsingGET1(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#getProcessInstanceByIdUsingGET1");
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

<a name="getProcessInstancesUsingGET1"></a>
# **getProcessInstancesUsingGET1**
> ListResponseContentCloudProcessInstance getProcessInstancesUsingGET1(maxItems, skipCount, sort)

getProcessInstances

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentCloudProcessInstance result = apiInstance.getProcessInstancesUsingGET1(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#getProcessInstancesUsingGET1");
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

<a name="receiveUsingPUT1"></a>
# **receiveUsingPUT1**
> receiveUsingPUT1(body)

receive

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
ReceiveMessagePayload body = new ReceiveMessagePayload(); // ReceiveMessagePayload | receiveMessagePayload
try {
    apiInstance.receiveUsingPUT1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#receiveUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReceiveMessagePayload**](ReceiveMessagePayload.md)| receiveMessagePayload |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="resumeUsingPOST1"></a>
# **resumeUsingPOST1**
> EntryResponseContentCloudProcessInstance resumeUsingPOST1(processInstanceId)

resume

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.resumeUsingPOST1(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#resumeUsingPOST1");
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

<a name="sendSignalUsingPOST"></a>
# **sendSignalUsingPOST**
> sendSignalUsingPOST(body)

sendSignal

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
SignalPayload body = new SignalPayload(); // SignalPayload | cmd
try {
    apiInstance.sendSignalUsingPOST(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#sendSignalUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SignalPayload**](SignalPayload.md)| cmd |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="sendStartMessageUsingPOST"></a>
# **sendStartMessageUsingPOST**
> EntryResponseContentCloudProcessInstance sendStartMessageUsingPOST(body)

sendStartMessage

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
StartMessagePayload body = new StartMessagePayload(); // StartMessagePayload | startMessagePayload
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.sendStartMessageUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#sendStartMessageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StartMessagePayload**](StartMessagePayload.md)| startMessagePayload |

### Return type

[**EntryResponseContentCloudProcessInstance**](EntryResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="startCreatedProcessUsingPOST"></a>
# **startCreatedProcessUsingPOST**
> EntryResponseContentCloudProcessInstance startCreatedProcessUsingPOST(processInstanceId, body)

startCreatedProcess

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
StartProcessPayload body = new StartProcessPayload(); // StartProcessPayload | startProcessPayload
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.startCreatedProcessUsingPOST(processInstanceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#startCreatedProcessUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **body** | [**StartProcessPayload**](StartProcessPayload.md)| startProcessPayload | [optional]

### Return type

[**EntryResponseContentCloudProcessInstance**](EntryResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="startProcessUsingPOST1"></a>
# **startProcessUsingPOST1**
> EntryResponseContentCloudProcessInstance startProcessUsingPOST1(body)

startProcess

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
StartProcessPayload body = new StartProcessPayload(); // StartProcessPayload | startProcessPayload
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.startProcessUsingPOST1(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#startProcessUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StartProcessPayload**](StartProcessPayload.md)| startProcessPayload |

### Return type

[**EntryResponseContentCloudProcessInstance**](EntryResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="subprocessesUsingGET1"></a>
# **subprocessesUsingGET1**
> ListResponseContentCloudProcessInstance subprocessesUsingGET1(processInstanceId, maxItems, skipCount, sort)

subprocesses

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentCloudProcessInstance result = apiInstance.subprocessesUsingGET1(processInstanceId, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#subprocessesUsingGET1");
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

<a name="suspendUsingPOST1"></a>
# **suspendUsingPOST1**
> EntryResponseContentCloudProcessInstance suspendUsingPOST1(processInstanceId)

suspend

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.suspendUsingPOST1(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#suspendUsingPOST1");
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

<a name="updateProcessUsingPUT1"></a>
# **updateProcessUsingPUT1**
> EntryResponseContentCloudProcessInstance updateProcessUsingPUT1(body, processInstanceId)

updateProcess

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.ProcessInstanceControllerImplApi;


ProcessInstanceControllerImplApi apiInstance = new ProcessInstanceControllerImplApi();
UpdateProcessPayload body = new UpdateProcessPayload(); // UpdateProcessPayload | payload
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
try {
    EntryResponseContentCloudProcessInstance result = apiInstance.updateProcessUsingPUT1(body, processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceControllerImplApi#updateProcessUsingPUT1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateProcessPayload**](UpdateProcessPayload.md)| payload |
 **processInstanceId** | **String**| processInstanceId |

### Return type

[**EntryResponseContentCloudProcessInstance**](EntryResponseContentCloudProcessInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json
