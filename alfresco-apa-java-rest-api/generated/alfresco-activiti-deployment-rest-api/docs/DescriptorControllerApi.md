# DescriptorControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDescriptorUsingDELETE**](DescriptorControllerApi.md#deleteDescriptorUsingDELETE) | **DELETE** /deployment-service/v1/descriptors/{descriptorId} | Delete an existing descriptor by id.
[**deployDescriptorUsingPOST**](DescriptorControllerApi.md#deployDescriptorUsingPOST) | **POST** /deployment-service/v1/deploy/{descriptorId} | Deploy an existing descriptor by id.
[**exportDescriptorUsingGET**](DescriptorControllerApi.md#exportDescriptorUsingGET) | **GET** /deployment-service/v1/descriptors/{descriptorId}/export | Export a descriptor by id.
[**getDescriptorUsingGET**](DescriptorControllerApi.md#getDescriptorUsingGET) | **GET** /deployment-service/v1/descriptors/{descriptorId} | Find descriptor by id.
[**getDescriptorsUsingGET**](DescriptorControllerApi.md#getDescriptorsUsingGET) | **GET** /deployment-service/v1/descriptors | Find descriptors. It allows filtering.
[**getReleasedModelContentsUsingGET**](DescriptorControllerApi.md#getReleasedModelContentsUsingGET) | **GET** /deployment-service/v1/descriptors/{descriptorId}/models | getReleasedModelContents
[**importDescriptorUsingPOST**](DescriptorControllerApi.md#importDescriptorUsingPOST) | **POST** /deployment-service/v1/descriptors/import | Import descriptor. Format: zip file, containing at root a descriptor.json and the released project


<a name="deleteDescriptorUsingDELETE"></a>
# **deleteDescriptorUsingDELETE**
> deleteDescriptorUsingDELETE(descriptorId)

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
 - **Accept**: */*

<a name="deployDescriptorUsingPOST"></a>
# **deployDescriptorUsingPOST**
> deployDescriptorUsingPOST(descriptorId, deployDescriptorContent)

Deploy an existing descriptor by id.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorControllerApi;


DescriptorControllerApi apiInstance = new DescriptorControllerApi();
String descriptorId = "descriptorId_example"; // String | ID of application to deploy
DeployDescriptorRequestRepresentation deployDescriptorContent = new DeployDescriptorRequestRepresentation(); // DeployDescriptorRequestRepresentation | deployDescriptorContent
try {
    apiInstance.deployDescriptorUsingPOST(descriptorId, deployDescriptorContent);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorControllerApi#deployDescriptorUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **descriptorId** | **String**| ID of application to deploy |
 **deployDescriptorContent** | [**DeployDescriptorRequestRepresentation**](DeployDescriptorRequestRepresentation.md)| deployDescriptorContent | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="exportDescriptorUsingGET"></a>
# **exportDescriptorUsingGET**
> exportDescriptorUsingGET(descriptorId, type, attachment)

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
 **attachment** | **Boolean**| attachment | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDescriptorUsingGET"></a>
# **getDescriptorUsingGET**
> DescriptorResponseRepresentation getDescriptorUsingGET(descriptorId)

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
> ListResponseContentDescriptorResponseRepresentation getDescriptorsUsingGET(createdDateFrom, createdDateFromStartOfDay, createdDateTo, createdDateToEndOfDay, maxItems, name, skipCount, sort, status)

Find descriptors. It allows filtering.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorControllerApi;


DescriptorControllerApi apiInstance = new DescriptorControllerApi();
LocalDate createdDateFrom = LocalDate.now(); // LocalDate | Date used as start interval in search by creation date. Allowed formats: yyyy-MM-dd or yyyy-MM-ddTHH:mm:ss or yyyy-MM-ddTHH:mm:ss.SSS.
OffsetDateTime createdDateFromStartOfDay = OffsetDateTime.now(); // OffsetDateTime | 
LocalDate createdDateTo = LocalDate.now(); // LocalDate | Date used as end interval in search by creation date. Allowed formats: yyyy-MM-dd or yyyy-MM-ddTHH:mm:ss or yyyy-MM-ddTHH:mm:ss.SSS.
OffsetDateTime createdDateToEndOfDay = OffsetDateTime.now(); // OffsetDateTime | 
Integer maxItems = 56; // Integer | 
String name = "name_example"; // String | Filter on descriptor name, showing all descriptors that contains the search key.
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
String status = "status_example"; // String | Application status
try {
    ListResponseContentDescriptorResponseRepresentation result = apiInstance.getDescriptorsUsingGET(createdDateFrom, createdDateFromStartOfDay, createdDateTo, createdDateToEndOfDay, maxItems, name, skipCount, sort, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorControllerApi#getDescriptorsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdDateFrom** | **LocalDate**| Date used as start interval in search by creation date. Allowed formats: yyyy-MM-dd or yyyy-MM-ddTHH:mm:ss or yyyy-MM-ddTHH:mm:ss.SSS. | [optional]
 **createdDateFromStartOfDay** | **OffsetDateTime**|  | [optional]
 **createdDateTo** | **LocalDate**| Date used as end interval in search by creation date. Allowed formats: yyyy-MM-dd or yyyy-MM-ddTHH:mm:ss or yyyy-MM-ddTHH:mm:ss.SSS. | [optional]
 **createdDateToEndOfDay** | **OffsetDateTime**|  | [optional]
 **maxItems** | **Integer**|  | [optional]
 **name** | **String**| Filter on descriptor name, showing all descriptors that contains the search key. | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]
 **status** | **String**| Application status | [optional] [enum: CREATE_APP, CREATE_DESCRIPTOR, DEPLOY_STARTED, DEPLOY_STARTED_FAILED, DESCRIPTOR_CREATED, IMAGE_BUILD, IMAGE_BUILD_FAILED, IMAGE_PUSH, IMAGE_PUSH_FAILED, NOT_DEPLOYED, PENDING, RUNNING, UNKNOWN, UPDATE_APP, WAITING_FOR_DESCRIPTOR]

### Return type

[**ListResponseContentDescriptorResponseRepresentation**](ListResponseContentDescriptorResponseRepresentation.md)

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
> importDescriptorUsingPOST(file)

Import descriptor. Format: zip file, containing at root a descriptor.json and the released project

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DescriptorControllerApi;


DescriptorControllerApi apiInstance = new DescriptorControllerApi();
byte[] file = BINARY_DATA_HERE; // byte[] | file
try {
    apiInstance.importDescriptorUsingPOST(file);
} catch (ApiException e) {
    System.err.println("Exception when calling DescriptorControllerApi#importDescriptorUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **byte[]**| file |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

