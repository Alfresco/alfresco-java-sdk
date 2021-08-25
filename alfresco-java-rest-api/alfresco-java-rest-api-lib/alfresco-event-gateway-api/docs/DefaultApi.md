# DefaultApi

All URIs are relative to *http://localhost:7070*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscription**](DefaultApi.md#createSubscription) | **POST** /subscriptions | 
[**getSubscription**](DefaultApi.md#getSubscription) | **GET** /subscriptions/{id} | 
[**partiallyUpdateSubscription**](DefaultApi.md#partiallyUpdateSubscription) | **PATCH** /subscriptions/{id} | 

<a name="createSubscription"></a>
# **createSubscription**
> Subscription createSubscription(body)



Create a Subscription

### Example
```java
// Import classes:
//import org.alfresco.gateway.ApiException;
//import org.alfresco.gateway.handler.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Subscription body = new Subscription(); // Subscription | The subscription object to be created
try {
    Subscription result = apiInstance.createSubscription(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createSubscription");
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

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

<a name="getSubscription"></a>
# **getSubscription**
> Subscription getSubscription(id)



Get a Subscription by its id

### Example
```java
// Import classes:
//import org.alfresco.gateway.ApiException;
//import org.alfresco.gateway.handler.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The subscription id
try {
    Subscription result = apiInstance.getSubscription(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSubscription");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="partiallyUpdateSubscription"></a>
# **partiallyUpdateSubscription**
> Subscription partiallyUpdateSubscription(id, body)



Update the status of a Subscription

### Example
```java
// Import classes:
//import org.alfresco.gateway.ApiException;
//import org.alfresco.gateway.handler.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | The subscription id
JsonNode body = new JsonNode(); // JsonNode | The JSON snippet holding the new status of the subscription
try {
    Subscription result = apiInstance.partiallyUpdateSubscription(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#partiallyUpdateSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The subscription id |
 **body** | [**JsonNode**](JsonNode.md)| The JSON snippet holding the new status of the subscription | [optional]

### Return type

[**Subscription**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

