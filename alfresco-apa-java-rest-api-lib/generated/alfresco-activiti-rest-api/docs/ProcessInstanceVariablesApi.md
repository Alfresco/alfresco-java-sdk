# ProcessInstanceVariablesApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateProcessInstanceVariablesUsingPUT**](ProcessInstanceVariablesApi.md#createOrUpdateProcessInstanceVariablesUsingPUT) | **PUT** /activiti-app/api/enterprise/process-instances/{processInstanceId}/variables | Create or update variables
[**createProcessInstanceVariablesUsingPOST**](ProcessInstanceVariablesApi.md#createProcessInstanceVariablesUsingPOST) | **POST** /activiti-app/api/enterprise/process-instances/{processInstanceId}/variables | Create variables
[**deleteProcessInstanceVariableUsingDELETE**](ProcessInstanceVariablesApi.md#deleteProcessInstanceVariableUsingDELETE) | **DELETE** /activiti-app/api/enterprise/process-instances/{processInstanceId}/variables/{variableName} | Delete a variable
[**getProcessInstanceVariableUsingGET**](ProcessInstanceVariablesApi.md#getProcessInstanceVariableUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/variables/{variableName} | Get a variable
[**getProcessInstanceVariablesUsingGET**](ProcessInstanceVariablesApi.md#getProcessInstanceVariablesUsingGET) | **GET** /activiti-app/api/enterprise/process-instances/{processInstanceId}/variables | List variables
[**updateProcessInstanceVariableUsingPUT**](ProcessInstanceVariablesApi.md#updateProcessInstanceVariableUsingPUT) | **PUT** /activiti-app/api/enterprise/process-instances/{processInstanceId}/variables/{variableName} | Update a variable

<a name="createOrUpdateProcessInstanceVariablesUsingPUT"></a>
# **createOrUpdateProcessInstanceVariablesUsingPUT**
> List&lt;RestVariable&gt; createOrUpdateProcessInstanceVariablesUsingPUT(processInstanceId, body)

Create or update variables

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ProcessInstanceVariablesApi;







ProcessInstanceVariablesApi apiInstance = new ProcessInstanceVariablesApi();
String processInstanceId = "processInstanceId_example"; // String | Process instance ID
List<RestVariable> body = Arrays.asList(new RestVariable()); // List<RestVariable> | 
try {
    List<RestVariable> result = apiInstance.createOrUpdateProcessInstanceVariablesUsingPUT(processInstanceId, body);
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
 **body** | [**List&lt;RestVariable&gt;**](RestVariable.md)|  | [optional]

### Return type

[**List&lt;RestVariable&gt;**](RestVariable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProcessInstanceVariablesUsingPOST"></a>
# **createProcessInstanceVariablesUsingPOST**
> List&lt;RestVariable&gt; createProcessInstanceVariablesUsingPOST(processInstanceId, body)

Create variables

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ProcessInstanceVariablesApi;







ProcessInstanceVariablesApi apiInstance = new ProcessInstanceVariablesApi();
String processInstanceId = "processInstanceId_example"; // String | Process instance ID
List<RestVariable> body = Arrays.asList(new RestVariable()); // List<RestVariable> | 
try {
    List<RestVariable> result = apiInstance.createProcessInstanceVariablesUsingPOST(processInstanceId, body);
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
 **body** | [**List&lt;RestVariable&gt;**](RestVariable.md)|  | [optional]

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
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ProcessInstanceVariablesApi;







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

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getProcessInstanceVariableUsingGET"></a>
# **getProcessInstanceVariableUsingGET**
> RestVariable getProcessInstanceVariableUsingGET(processInstanceId, variableName)

Get a variable

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ProcessInstanceVariablesApi;







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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessInstanceVariablesUsingGET"></a>
# **getProcessInstanceVariablesUsingGET**
> List&lt;RestVariable&gt; getProcessInstanceVariablesUsingGET(processInstanceId)

List variables

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ProcessInstanceVariablesApi;







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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProcessInstanceVariableUsingPUT"></a>
# **updateProcessInstanceVariableUsingPUT**
> RestVariable updateProcessInstanceVariableUsingPUT(processInstanceId, variableName, body)

Update a variable

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.ProcessInstanceVariablesApi;







ProcessInstanceVariablesApi apiInstance = new ProcessInstanceVariablesApi();
String processInstanceId = "processInstanceId_example"; // String | processInstanceId
String variableName = "variableName_example"; // String | variableName
RestVariable body = new RestVariable(); // RestVariable | 
try {
    RestVariable result = apiInstance.updateProcessInstanceVariableUsingPUT(processInstanceId, variableName, body);
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
 **body** | [**RestVariable**](RestVariable.md)|  | [optional]

### Return type

[**RestVariable**](RestVariable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

