# SecurityControlSettingsApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/gs/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSecurityControlSetting**](SecurityControlSettingsApi.md#getSecurityControlSetting) | **GET** /security-control-settings/{securityControlSettingKey} | Get security control setting value
[**updateSecurityControlSetting**](SecurityControlSettingsApi.md#updateSecurityControlSetting) | **PUT** /security-control-settings/{securityControlSettingKey} | Update security control setting value


<a name="getSecurityControlSetting"></a>
# **getSecurityControlSetting**
> SecurityControlSettingEntry getSecurityControlSetting(securityControlSettingKey)

Get security control setting value

Gets the value for a selected **securityControlSettingKey**.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.SecurityControlSettingsApi;








SecurityControlSettingsApi apiInstance = new SecurityControlSettingsApi();
String securityControlSettingKey = "securityControlSettingKey_example"; // String | The key for the security control setting. You can use one of the following settings: * -declassificationTimeFrame- for the declassification time frame value set in alfresco-global.properties file 
try {
    SecurityControlSettingEntry result = apiInstance.getSecurityControlSetting(securityControlSettingKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityControlSettingsApi#getSecurityControlSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityControlSettingKey** | **String**| The key for the security control setting. You can use one of the following settings: * -declassificationTimeFrame- for the declassification time frame value set in alfresco-global.properties file  |

### Return type

[**SecurityControlSettingEntry**](SecurityControlSettingEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSecurityControlSetting"></a>
# **updateSecurityControlSetting**
> SecurityControlSettingEntry updateSecurityControlSetting(securityControlSettingKey, securityControlSettingValue)

Update security control setting value

Updates the value of a selected **securityControlSettingKey**.

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.governance.classification.handler.SecurityControlSettingsApi;








SecurityControlSettingsApi apiInstance = new SecurityControlSettingsApi();
String securityControlSettingKey = "securityControlSettingKey_example"; // String | The key for the security control setting. You can use one of the following settings: * -declassificationTimeFrame- for the declassification time frame value set in alfresco-global.properties file 
SecurityControlSettingBody securityControlSettingValue = new SecurityControlSettingBody(); // SecurityControlSettingBody | The new value for the security control setting. This can be a string or number, depending on the setting key.
try {
    SecurityControlSettingEntry result = apiInstance.updateSecurityControlSetting(securityControlSettingKey, securityControlSettingValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityControlSettingsApi#updateSecurityControlSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityControlSettingKey** | **String**| The key for the security control setting. You can use one of the following settings: * -declassificationTimeFrame- for the declassification time frame value set in alfresco-global.properties file  |
 **securityControlSettingValue** | [**SecurityControlSettingBody**](SecurityControlSettingBody.md)| The new value for the security control setting. This can be a string or number, depending on the setting key. |

### Return type

[**SecurityControlSettingEntry**](SecurityControlSettingEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

