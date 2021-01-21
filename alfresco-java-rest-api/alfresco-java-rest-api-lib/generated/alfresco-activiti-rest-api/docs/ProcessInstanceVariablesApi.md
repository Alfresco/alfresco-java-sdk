# ProcessInstanceVariablesApi

All URIs are relative to *https://activiti.alfresco.com/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateProcessInstanceVariablesUsingPUT**](ProcessInstanceVariablesApi.md#createOrUpdateProcessInstanceVariablesUsingPUT) | **PUT** /enterprise/process-instances/{processInstanceId}/variables | Create or update variables
[**createProcessInstanceVariablesUsingPOST**](ProcessInstanceVariablesApi.md#createProcessInstanceVariablesUsingPOST) | **POST** /enterprise/process-instances/{processInstanceId}/variables | Create variables
[**deleteProcessInstanceVariableUsingDELETE**](ProcessInstanceVariablesApi.md#deleteProcessInstanceVariableUsingDELETE) | **DELETE** /enterprise/process-instances/{processInstanceId}/variables/{variableName} | Delete a variable
[**getProcessInstanceVariableUsingGET**](ProcessInstanceVariablesApi.md#getProcessInstanceVariableUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/variables/{variableName} | Get a variable
[**getProcessInstanceVariablesUsingGET**](ProcessInstanceVariablesApi.md#getProcessInstanceVariablesUsingGET) | **GET** /enterprise/process-instances/{processInstanceId}/variables | List variables
[**updateProcessInstanceVariableUsingPUT**](ProcessInstanceVariablesApi.md#updateProcessInstanceVariableUsingPUT) | **PUT** /enterprise/process-instances/{processInstanceId}/variables/{variableName} | Update a variable


<a name="createOrUpdateProcessInstanceVariablesUsingPUT"></a>
# **createOrUpdateProcessInstanceVariablesUsingPUT**
> List&lt;RestVariable&gt; createOrUpdateProcessInstanceVariablesUsingPUT(processInstanceId, restVariables)

Create or update variables

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstanceVariablesApi;








ProcessInstanceVariablesApi apiInstance = new ProcessInstanceVariablesApi();
String processInstanceId = "processInstanceId_example"; // String | Process instance ID
List<RestVariable> restVariables = Arrays.asList(new RestVariable()); // List<RestVariable> | restVariables
try {
    List<RestVariable> result = apiInstance.createOrUpdateProcessInstanceVariablesUsingPUT(processInstanceId, restVariables);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariablesApi#createOrUpdateProcessInstanceVariablesUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| Process instance ID |
 **restVariables** | [**List&lt;RestVariable&gt;**](RestVariable.md)| restVariables |

### Return type

[**List&lt;RestVariable&gt;**](RestVariable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProcessInstanceVariablesUsingPOST"></a>
# **createProcessInstanceVariablesUsingPOST**
> List&lt;RestVariable&gt; createProcessInstanceVariablesUsingPOST(processInstanceId, restVariables)

Create variables

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstanceVariablesApi;








ProcessInstanceVariablesApi apiInstance = new ProcessInstanceVariablesApi();
String processInstanceId = "processInstanceId_example"; // String | Process instance ID
List<RestVariable> restVariables = Arrays.asList(new RestVariable()); // List<RestVariable> | restVariables
try {
    List<RestVariable> result = apiInstance.createProcessInstanceVariablesUsingPOST(processInstanceId, restVariables);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariablesApi#createProcessInstanceVariablesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| Process instance ID |
 **restVariables** | [**List&lt;RestVariable&gt;**](RestVariable.md)| restVariables |

### Return type

[**List&lt;RestVariable&gt;**](RestVariable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProcessInstanceVariableUsingDELETE"></a>
# **deleteProcessInstanceVariableUsingDELETE**
> deleteProcessInstanceVariableUsingDELETE(processInstanceId, variableName)

Delete a variable

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstanceVariablesApi;








ProcessInstanceVariablesApi apiInstance = new ProcessInstanceVariablesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
String variableName = "variableName_example"; // String | variableName
try {
    apiInstance.deleteProcessInstanceVariableUsingDELETE(processInstanceId, variableName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariablesApi#deleteProcessInstanceVariableUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **variableName** | **String**| variableName |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessInstanceVariableUsingGET"></a>
# **getProcessInstanceVariableUsingGET**
> RestVariable getProcessInstanceVariableUsingGET(processInstanceId, variableName)

Get a variable

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstanceVariablesApi;








ProcessInstanceVariablesApi apiInstance = new ProcessInstanceVariablesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
String variableName = "variableName_example"; // String | variableName
try {
    RestVariable result = apiInstance.getProcessInstanceVariableUsingGET(processInstanceId, variableName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariablesApi#getProcessInstanceVariableUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **variableName** | **String**| variableName |

### Return type

[**RestVariable**](RestVariable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessInstanceVariablesUsingGET"></a>
# **getProcessInstanceVariablesUsingGET**
> List&lt;RestVariable&gt; getProcessInstanceVariablesUsingGET(processInstanceId)

List variables

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstanceVariablesApi;








ProcessInstanceVariablesApi apiInstance = new ProcessInstanceVariablesApi();
String processInstanceId = "processInstanceId_example"; // String | Process instance ID
try {
    List<RestVariable> result = apiInstance.getProcessInstanceVariablesUsingGET(processInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariablesApi#getProcessInstanceVariablesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| Process instance ID |

### Return type

[**List&lt;RestVariable&gt;**](RestVariable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProcessInstanceVariableUsingPUT"></a>
# **updateProcessInstanceVariableUsingPUT**
> RestVariable updateProcessInstanceVariableUsingPUT(processInstanceId, variableName, restVariable)

Update a variable

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.ProcessInstanceVariablesApi;








ProcessInstanceVariablesApi apiInstance = new ProcessInstanceVariablesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
String variableName = "variableName_example"; // String | variableName
RestVariable restVariable = new RestVariable(); // RestVariable | restVariable
try {
    RestVariable result = apiInstance.updateProcessInstanceVariableUsingPUT(processInstanceId, variableName, restVariable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessInstanceVariablesApi#updateProcessInstanceVariableUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processInstanceId** | **String**| processInstanceId |
 **variableName** | **String**| variableName |
 **restVariable** | [**RestVariable**](RestVariable.md)| restVariable |

### Return type

[**RestVariable**](RestVariable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

