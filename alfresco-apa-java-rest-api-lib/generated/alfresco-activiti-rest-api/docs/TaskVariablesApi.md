# TaskVariablesApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaskVariableUsingPOST**](TaskVariablesApi.md#createTaskVariableUsingPOST) | **POST** /activiti-app/api/enterprise/tasks/{taskId}/variables | Create variables
[**deleteAllLocalTaskVariablesUsingDELETE**](TaskVariablesApi.md#deleteAllLocalTaskVariablesUsingDELETE) | **DELETE** /activiti-app/api/enterprise/tasks/{taskId}/variables | Create or update variables
[**deleteVariableUsingDELETE**](TaskVariablesApi.md#deleteVariableUsingDELETE) | **DELETE** /activiti-app/api/enterprise/tasks/{taskId}/variables/{variableName} | Delete a variable
[**getVariableUsingGET**](TaskVariablesApi.md#getVariableUsingGET) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/variables/{variableName} | Get a variable
[**getVariablesUsingGET**](TaskVariablesApi.md#getVariablesUsingGET) | **GET** /activiti-app/api/enterprise/tasks/{taskId}/variables | List variables
[**updateVariableUsingPUT**](TaskVariablesApi.md#updateVariableUsingPUT) | **PUT** /activiti-app/api/enterprise/tasks/{taskId}/variables/{variableName} | Update a variable

<a name="createTaskVariableUsingPOST"></a>
# **createTaskVariableUsingPOST**
> List&lt;RestVariable&gt; createTaskVariableUsingPOST(taskId, body)

Create variables

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskVariablesApi;







TaskVariablesApi apiInstance = new TaskVariablesApi();
String taskId = "taskId_example"; // String | taskId
List<RestVariable> body = Arrays.asList(new RestVariable()); // List<RestVariable> | 
try {
    List<RestVariable> result = apiInstance.createTaskVariableUsingPOST(taskId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariablesApi#createTaskVariableUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**List&lt;RestVariable&gt;**](RestVariable.md)|  | [optional]

### Return type

[**List&lt;RestVariable&gt;**](RestVariable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAllLocalTaskVariablesUsingDELETE"></a>
# **deleteAllLocalTaskVariablesUsingDELETE**
> deleteAllLocalTaskVariablesUsingDELETE(taskId)

Create or update variables

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskVariablesApi;







TaskVariablesApi apiInstance = new TaskVariablesApi();
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.deleteAllLocalTaskVariablesUsingDELETE(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariablesApi#deleteAllLocalTaskVariablesUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteVariableUsingDELETE"></a>
# **deleteVariableUsingDELETE**
> deleteVariableUsingDELETE(taskId, variableName, scope)

Delete a variable

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskVariablesApi;







TaskVariablesApi apiInstance = new TaskVariablesApi();
String taskId = "taskId_example"; // String | taskId
String variableName = "variableName_example"; // String | variableName
String scope = "scope_example"; // String | scope
try {
    apiInstance.deleteVariableUsingDELETE(taskId, variableName, scope);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariablesApi#deleteVariableUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **variableName** | **String**| variableName |
 **scope** | **String**| scope | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getVariableUsingGET"></a>
# **getVariableUsingGET**
> RestVariable getVariableUsingGET(taskId, variableName, scope)

Get a variable

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskVariablesApi;







TaskVariablesApi apiInstance = new TaskVariablesApi();
String taskId = "taskId_example"; // String | taskId
String variableName = "variableName_example"; // String | variableName
String scope = "scope_example"; // String | scope
try {
    RestVariable result = apiInstance.getVariableUsingGET(taskId, variableName, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariablesApi#getVariableUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **variableName** | **String**| variableName |
 **scope** | **String**| scope | [optional]

### Return type

[**RestVariable**](RestVariable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVariablesUsingGET"></a>
# **getVariablesUsingGET**
> List&lt;RestVariable&gt; getVariablesUsingGET(taskId, scope)

List variables

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskVariablesApi;







TaskVariablesApi apiInstance = new TaskVariablesApi();
String taskId = "taskId_example"; // String | taskId
String scope = "scope_example"; // String | scope
try {
    List<RestVariable> result = apiInstance.getVariablesUsingGET(taskId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariablesApi#getVariablesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **scope** | **String**| scope | [optional]

### Return type

[**List&lt;RestVariable&gt;**](RestVariable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVariableUsingPUT"></a>
# **updateVariableUsingPUT**
> RestVariable updateVariableUsingPUT(taskId, variableName, body)

Update a variable

### Example
```java
// Import classes:
//import com.alfresco.activiti.ApiClient;
//import com.alfresco.activiti.ApiException;
//import com.alfresco.activiti.Configuration;
//import com.alfresco.activiti.auth.*;
//import com.alfresco.activiti.handler.TaskVariablesApi;







TaskVariablesApi apiInstance = new TaskVariablesApi();
String taskId = "taskId_example"; // String | taskId
String variableName = "variableName_example"; // String | variableName
RestVariable body = new RestVariable(); // RestVariable | 
try {
    RestVariable result = apiInstance.updateVariableUsingPUT(taskId, variableName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskVariablesApi#updateVariableUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **variableName** | **String**| variableName |
 **body** | [**RestVariable**](RestVariable.md)|  | [optional]

### Return type

[**RestVariable**](RestVariable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

