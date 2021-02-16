# ModelsBpmnApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistoricProcessModelBpmn20XmlUsingGET**](ModelsBpmnApi.md#getHistoricProcessModelBpmn20XmlUsingGET) | **GET** /enterprise/models/{processModelId}/history/{processModelHistoryId}/bpmn20 | Export a historic version of a process definition as BPMN 2.0 XML
[**getProcessModelBpmn20XmlUsingGET**](ModelsBpmnApi.md#getProcessModelBpmn20XmlUsingGET) | **GET** /enterprise/models/{processModelId}/bpmn20 | Export a process definition as BPMN 2.0 XML


<a name="getHistoricProcessModelBpmn20XmlUsingGET"></a>
# **getHistoricProcessModelBpmn20XmlUsingGET**
> getHistoricProcessModelBpmn20XmlUsingGET(processModelId, processModelHistoryId)

Export a historic version of a process definition as BPMN 2.0 XML

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsBpmnApi;








ModelsBpmnApi apiInstance = new ModelsBpmnApi();
Long processModelId = 789L; // Long | processModelId
Long processModelHistoryId = 789L; // Long | processModelHistoryId
try {
    apiInstance.getHistoricProcessModelBpmn20XmlUsingGET(processModelId, processModelHistoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsBpmnApi#getHistoricProcessModelBpmn20XmlUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processModelId** | **Long**| processModelId |
 **processModelHistoryId** | **Long**| processModelHistoryId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml

<a name="getProcessModelBpmn20XmlUsingGET"></a>
# **getProcessModelBpmn20XmlUsingGET**
> getProcessModelBpmn20XmlUsingGET(processModelId)

Export a process definition as BPMN 2.0 XML

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ModelsBpmnApi;








ModelsBpmnApi apiInstance = new ModelsBpmnApi();
Long processModelId = 789L; // Long | processModelId
try {
    apiInstance.getProcessModelBpmn20XmlUsingGET(processModelId);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelsBpmnApi#getProcessModelBpmn20XmlUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processModelId** | **Long**| processModelId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml

