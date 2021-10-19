# PreferenceApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePreferenceUsingDELETE**](PreferenceApi.md#deletePreferenceUsingDELETE) | **DELETE** /v1/preferences/{preferenceKey} | Delete preference
[**getAllUsingGET**](PreferenceApi.md#getAllUsingGET) | **GET** /v1/preferences | Return all preferences
[**getPreferenceUsingGET**](PreferenceApi.md#getPreferenceUsingGET) | **GET** /v1/preferences/{preferenceKey} | Get preference
[**savePreferenceUsingPUT**](PreferenceApi.md#savePreferenceUsingPUT) | **PUT** /v1/preferences/{preferenceKey} | Create/Save preference


<a name="deletePreferenceUsingDELETE"></a>
# **deletePreferenceUsingDELETE**
> ResponseEntity deletePreferenceUsingDELETE(preferenceKey)

Delete preference

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.PreferenceApi;


PreferenceApi apiInstance = new PreferenceApi();
String preferenceKey = "preferenceKey_example"; // String | The Key of the preference to be deleted
try {
    ResponseEntity result = apiInstance.deletePreferenceUsingDELETE(preferenceKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferenceApi#deletePreferenceUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **preferenceKey** | **String**| The Key of the preference to be deleted |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllUsingGET"></a>
# **getAllUsingGET**
> ListResponseContentPreference getAllUsingGET(maxItems, skipCount, sort)

Return all preferences

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.PreferenceApi;


PreferenceApi apiInstance = new PreferenceApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentPreference result = apiInstance.getAllUsingGET(maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferenceApi#getAllUsingGET");
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

[**ListResponseContentPreference**](ListResponseContentPreference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPreferenceUsingGET"></a>
# **getPreferenceUsingGET**
> ResponseEntity getPreferenceUsingGET(preferenceKey)

Get preference

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.PreferenceApi;


PreferenceApi apiInstance = new PreferenceApi();
String preferenceKey = "preferenceKey_example"; // String | The Key of the preference to be returned
try {
    ResponseEntity result = apiInstance.getPreferenceUsingGET(preferenceKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferenceApi#getPreferenceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **preferenceKey** | **String**| The Key of the preference to be returned |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="savePreferenceUsingPUT"></a>
# **savePreferenceUsingPUT**
> ResponseEntity savePreferenceUsingPUT(preferenceKey, preferenceValue)

Create/Save preference

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.PreferenceApi;


PreferenceApi apiInstance = new PreferenceApi();
String preferenceKey = "preferenceKey_example"; // String | The Key of the preference to be created
String preferenceValue = "preferenceValue_example"; // String | preferenceValue
try {
    ResponseEntity result = apiInstance.savePreferenceUsingPUT(preferenceKey, preferenceValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PreferenceApi#savePreferenceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **preferenceKey** | **String**| The Key of the preference to be created |
 **preferenceValue** | **String**| preferenceValue |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

