# SubscriptionsApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscription**](SubscriptionsApi.md#createSubscription) | **POST** /subscriptions | 
[**getSubscription**](SubscriptionsApi.md#getSubscription) | **GET** /subscriptions/{id} | 
[**partiallyUpdateSubscription**](SubscriptionsApi.md#partiallyUpdateSubscription) | **PATCH** /subscriptions/{id} | 

<a name="createSubscription"></a>
# **createSubscription**
> Subscription createSubscription(body)



Create a Subscription

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.SubscriptionsApi;


// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");


SubscriptionsApi apiInstance = new SubscriptionsApi();
Subscription body = new Subscription(); // Subscription | The subscription object to be created
try {
    Subscription result = apiInstance.createSubscription(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#createSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Subscription**](Subscription.md)| The subscription object to be created | [optional]

### Return type

[**Subscription**](Subscription.md)

### Authorization

[basic-auth](../README.md#basic-auth)[bearer-key](../README.md#bearer-key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubscription"></a>
# **getSubscription**
> Subscription getSubscription(id)



Get a Subscription by its id

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.SubscriptionsApi;


// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");


SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = "id_example"; // String | The subscription id
try {
    Subscription result = apiInstance.getSubscription(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#getSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The subscription id |

### Return type

[**Subscription**](Subscription.md)

### Authorization

[basic-auth](../README.md#basic-auth)[bearer-key](../README.md#bearer-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="partiallyUpdateSubscription"></a>
# **partiallyUpdateSubscription**
> Subscription partiallyUpdateSubscription(id, body)



Update the status of a Subscription

### Example
```java
// Import classes:
//import org.alfresco.core.ApiClient;
//import org.alfresco.core.ApiException;
//import org.alfresco.core.Configuration;
//import org.alfresco.core.auth.*;
//import org.alfresco.core.handler.SubscriptionsApi;


// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");


SubscriptionsApi apiInstance = new SubscriptionsApi();
String id = "id_example"; // String | The subscription id
JsonNode body = new JsonNode(); // JsonNode | The JSON snippet holding the new status of the subscription
try {
    Subscription result = apiInstance.partiallyUpdateSubscription(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#partiallyUpdateSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The subscription id |
 **body** | **JsonNode**| The JSON snippet holding the new status of the subscription | [optional]

### Return type

[**Subscription**](Subscription.md)

### Authorization

[basic-auth](../README.md#basic-auth)[bearer-key](../README.md#bearer-key)

### HTTP request headers

 - **Content-Type**: application/merge-patch+json
 - **Accept**: */*, application/json

