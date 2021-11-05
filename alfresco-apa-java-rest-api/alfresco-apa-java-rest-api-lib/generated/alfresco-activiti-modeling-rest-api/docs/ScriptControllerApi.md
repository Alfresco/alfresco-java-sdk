# ScriptControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**runScriptUsingPOST**](ScriptControllerApi.md#runScriptUsingPOST) | **POST** /v1/scripts | runScript

<a name="runScriptUsingPOST"></a>
# **runScriptUsingPOST**
> Object runScriptUsingPOST(body)

runScript

### Example
```java
// Import classes:
//import org.alfresco.activiti.modeling.ApiException;
//import org.alfresco.activiti.modeling.handler.ScriptControllerApi;


ScriptControllerApi apiInstance = new ScriptControllerApi();
Object body = null; // Object | 
try {
    Object result = apiInstance.runScriptUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScriptControllerApi#runScriptUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

