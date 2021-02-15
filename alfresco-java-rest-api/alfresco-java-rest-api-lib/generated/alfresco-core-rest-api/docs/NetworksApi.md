# NetworksApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNetwork**](NetworksApi.md#getNetwork) | **GET** /networks/{networkId} | Get a network
[**getNetworkForPerson**](NetworksApi.md#getNetworkForPerson) | **GET** /people/{personId}/networks/{networkId} | Get network information
[**listNetworksForPerson**](NetworksApi.md#listNetworksForPerson) | **GET** /people/{personId}/networks | List network membership


<a name="getNetwork"></a>
# **getNetwork**
> PersonNetworkEntry getNetwork(networkId, fields)

Get a network

Gets information for a network **networkId**.

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NetworksApi;








NetworksApi apiInstance = new NetworksApi();
String networkId = "networkId_example"; // String | The identifier of a network.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    PersonNetworkEntry result = apiInstance.getNetwork(networkId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworksApi#getNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkId** | **String**| The identifier of a network. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**PersonNetworkEntry**](PersonNetworkEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkForPerson"></a>
# **getNetworkForPerson**
> PersonNetworkEntry getNetworkForPerson(personId, networkId, fields)

Get network information

Gets network information on a single network specified by **networkId** for **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NetworksApi;








NetworksApi apiInstance = new NetworksApi();
String personId = "personId_example"; // String | The identifier of a person.
String networkId = "networkId_example"; // String | The identifier of a network.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    PersonNetworkEntry result = apiInstance.getNetworkForPerson(personId, networkId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworksApi#getNetworkForPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **networkId** | **String**| The identifier of a network. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**PersonNetworkEntry**](PersonNetworkEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNetworksForPerson"></a>
# **listNetworksForPerson**
> PersonNetworkPaging listNetworksForPerson(personId, skipCount, maxItems, fields)

List network membership

Gets a list of network memberships for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.NetworksApi;








NetworksApi apiInstance = new NetworksApi();
String personId = "personId_example"; // String | The identifier of a person.
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list.  If not supplied then the default value is 100. 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    PersonNetworkPaging result = apiInstance.listNetworksForPerson(personId, skipCount, maxItems, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworksApi#listNetworksForPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list.  If not supplied then the default value is 100.  | [optional] [default to 100]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**PersonNetworkPaging**](PersonNetworkPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

