# DescriptorControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDescriptorUsingDELETE**](DescriptorControllerApi.md#deleteDescriptorUsingDELETE) | **DELETE** /v1/descriptors/{descriptorId} | deleteDescriptor
[**deployDescriptorUsingPOST**](DescriptorControllerApi.md#deployDescriptorUsingPOST) | **POST** /v1/deploy/{descriptorId} | deployDescriptor
[**exportDescriptorUsingGET**](DescriptorControllerApi.md#exportDescriptorUsingGET) | **GET** /v1/descriptors/{descriptorId}/export | exportDescriptor
[**getDescriptorUsingGET**](DescriptorControllerApi.md#getDescriptorUsingGET) | **GET** /v1/descriptors/{descriptorId} | getDescriptor
[**getDescriptorsUsingGET**](DescriptorControllerApi.md#getDescriptorsUsingGET) | **GET** /v1/descriptors | getDescriptors
[**getReleasedModelContentsUsingGET**](DescriptorControllerApi.md#getReleasedModelContentsUsingGET) | **GET** /v1/descriptors/{descriptorId}/models | getReleasedModelContents
[**importDescriptorUsingPOST**](DescriptorControllerApi.md#importDescriptorUsingPOST) | **POST** /v1/descriptors/import | importDescriptor

<a name="deleteDescriptorUsingDELETE"></a>
# **deleteDescriptorUsingDELETE**
> deleteDescriptorUsingDELETE(descriptorId)

deleteDescriptor

Delete an existing descriptor by id.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorControllerApi;


DescriptorControllerApi apiInstance = new DescriptorControllerApi();
String descriptorId = "descriptorId_example"; // String | ID of application to delete
try {
    apiInstance.deleteDescriptorUsingDELETE(descriptorId);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorControllerApi#deleteDescriptorUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **descriptorId** | **String**| ID of application to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deployDescriptorUsingPOST"></a>
# **deployDescriptorUsingPOST**
> deployDescriptorUsingPOST(descriptorId, body)

deployDescriptor

Deploy an existing descriptor by id.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorControllerApi;


DescriptorControllerApi apiInstance = new DescriptorControllerApi();
String descriptorId = "descriptorId_example"; // String | ID of application to deploy
DeployDescriptorRequestRepresentation body = new DeployDescriptorRequestRepresentation(); // DeployDescriptorRequestRepresentation | 
try {
    apiInstance.deployDescriptorUsingPOST(descriptorId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorControllerApi#deployDescriptorUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **descriptorId** | **String**| ID of application to deploy |
 **body** | [**DeployDescriptorRequestRepresentation**](DeployDescriptorRequestRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="exportDescriptorUsingGET"></a>
# **exportDescriptorUsingGET**
> exportDescriptorUsingGET(descriptorId, type, attachment)

exportDescriptor

Export a descriptor by id.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorControllerApi;


DescriptorControllerApi apiInstance = new DescriptorControllerApi();
String descriptorId = "descriptorId_example"; // String | descriptorId
String type = "type_example"; // String | type
Boolean attachment = true; // Boolean | attachment
try {
    apiInstance.exportDescriptorUsingGET(descriptorId, type, attachment);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorControllerApi#exportDescriptorUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **descriptorId** | **String**| descriptorId |
 **type** | **String**| type | [enum: JSON]
 **attachment** | **Boolean**| attachment | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDescriptorUsingGET"></a>
# **getDescriptorUsingGET**
> DescriptorResponseRepresentation getDescriptorUsingGET(descriptorId)

getDescriptor

Find descriptor by id.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorControllerApi;


DescriptorControllerApi apiInstance = new DescriptorControllerApi();
String descriptorId = "descriptorId_example"; // String | ID of descriptor to return
try {
    DescriptorResponseRepresentation result = apiInstance.getDescriptorUsingGET(descriptorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorControllerApi#getDescriptorUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **descriptorId** | **String**| ID of descriptor to return |

### Return type

[**DescriptorResponseRepresentation**](DescriptorResponseRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDescriptorsUsingGET"></a>
# **getDescriptorsUsingGET**
> ListResponseContentOfDescriptorResponseRepresentation getDescriptorsUsingGET(createdDateFrom, createdDateFromStartOfDay, createdDateTo, createdDateToEndOfDay, maxItems, name, skipCount, sort, status)

getDescriptors

Find descriptors. It allows filtering.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorControllerApi;


DescriptorControllerApi apiInstance = new DescriptorControllerApi();
LocalDate createdDateFrom = new LocalDate(); // LocalDate | 
OffsetDateTime createdDateFromStartOfDay = new OffsetDateTime(); // OffsetDateTime | 
LocalDate createdDateTo = new LocalDate(); // LocalDate | 
OffsetDateTime createdDateToEndOfDay = new OffsetDateTime(); // OffsetDateTime | 
Integer maxItems = 56; // Integer | 
String name = "name_example"; // String | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
String status = "status_example"; // String | 
try {
    ListResponseContentOfDescriptorResponseRepresentation result = apiInstance.getDescriptorsUsingGET(createdDateFrom, createdDateFromStartOfDay, createdDateTo, createdDateToEndOfDay, maxItems, name, skipCount, sort, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorControllerApi#getDescriptorsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdDateFrom** | **LocalDate**|  | [optional]
 **createdDateFromStartOfDay** | **OffsetDateTime**|  | [optional]
 **createdDateTo** | **LocalDate**|  | [optional]
 **createdDateToEndOfDay** | **OffsetDateTime**|  | [optional]
 **maxItems** | **Integer**|  | [optional]
 **name** | **String**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]
 **status** | **String**|  | [optional] [enum: CREATE_APP, CREATE_DESCRIPTOR, DEPLOY_STARTED, DEPLOY_STARTED_FAILED, DESCRIPTOR_CREATED, IMAGE_BUILD, IMAGE_BUILD_FAILED, IMAGE_PUSH, IMAGE_PUSH_FAILED, NOT_DEPLOYED, PENDING, RUNNING, UNKNOWN, UPDATE_APP, WAITING_FOR_DESCRIPTOR]

### Return type

[**ListResponseContentOfDescriptorResponseRepresentation**](ListResponseContentOfDescriptorResponseRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReleasedModelContentsUsingGET"></a>
# **getReleasedModelContentsUsingGET**
> List&lt;ConnectorModel&gt; getReleasedModelContentsUsingGET(descriptorId, type)

getReleasedModelContents

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorControllerApi;


DescriptorControllerApi apiInstance = new DescriptorControllerApi();
String descriptorId = "descriptorId_example"; // String | The id of the descriptor to get the models of the release
String type = "type_example"; // String | The type of the models of the descriptor. Only CONNECTOR type available
try {
    List<ConnectorModel> result = apiInstance.getReleasedModelContentsUsingGET(descriptorId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorControllerApi#getReleasedModelContentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **descriptorId** | **String**| The id of the descriptor to get the models of the release |
 **type** | **String**| The type of the models of the descriptor. Only CONNECTOR type available |

### Return type

[**List&lt;ConnectorModel&gt;**](ConnectorModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="importDescriptorUsingPOST"></a>
# **importDescriptorUsingPOST**
> importDescriptorUsingPOST(body)

importDescriptor

Import descriptor. Format: zip file, containing at root a descriptor.json and the released project

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorControllerApi;


DescriptorControllerApi apiInstance = new DescriptorControllerApi();
Object body = null; // Object | 
try {
    apiInstance.importDescriptorUsingPOST(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorControllerApi#importDescriptorUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Object**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, multipart/form-data
 - **Accept**: Not defined

