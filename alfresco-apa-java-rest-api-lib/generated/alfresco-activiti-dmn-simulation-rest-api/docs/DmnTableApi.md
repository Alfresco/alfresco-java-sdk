# DmnTableApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeDMNUsingPOST**](DmnTableApi.md#executeDMNUsingPOST) | **POST** /v1/dmn/execute | Execute a DMN

<a name="executeDMNUsingPOST"></a>
# **executeDMNUsingPOST**
> Object executeDMNUsingPOST(body)

Execute a DMN

Execute a DMN table

### Example
```java
// Import classes:
//import com.alfresco.activiti.dmn.simulation.ApiException;
//import com.alfresco.activiti.dmn.simulation.handler.DmnTableApi;


DmnTableApi apiInstance = new DmnTableApi();
DMNTable body = new DMNTable(); // DMNTable | decisionTable
try {
    Object result = apiInstance.executeDMNUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DmnTableApi#executeDMNUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DMNTable**](DMNTable.md)| decisionTable |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
