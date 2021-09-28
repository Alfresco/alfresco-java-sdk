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
import java.util.HashMap;
import java.util.Map;

import org.alfresco.gateway.handler.SubscriptionsApi;
import org.alfresco.gateway.model.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sample {

  private static final Logger LOGGER = LoggerFactory.getLogger(Sample.class);

  public static void main(String[] args) {

    @Inject
    SubscriptionsApi subscriptionsApi;

    Map<String, String> config = new HashMap<>();
    config.put("broker-id", "sample-broker"); // Id of the a broker in alfresco-event-gateway configuration
    config.put("destination", "topic:sample-topic"); // Name of the topic to which the gateway shall publish the events

    Subscription subscriptionRequest = new Subscription();

    subscriptionRequest.setType("jms-activemq");
    subscriptionRequest.setConfig(config);

    Subscription result = subscriptionsApi.createSubscription(subscriptionRequest);
    LOGGER.info("Created subscription with id: {}", result.getId());
  }
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Subscription**](Subscription.md)| The subscription object to be created | [optional]

### Return type

[**Subscription**](Subscription.md)



Get a Subscription by its id

### Example
```java
import java.util.HashMap;
import java.util.Map;

import org.alfresco.gateway.handler.SubscriptionsApi;
import org.alfresco.gateway.model.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sample {

  private static final Logger LOGGER = LoggerFactory.getLogger(Sample.class);


  public static void main(String[] args) {

    @Inject
    SubscriptionsApi subscriptionsApi;

    Subscription result = subscriptionsApi.getSubscription("my-subscription-id");
    LOGGER.info("Retrieved subscription: {}", result);
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The subscription id |

### Return type

[**Subscription**](Subscription.md)


Update the status of a Subscription

### Example
```java
import java.util.HashMap;
import java.util.Map;

import org.alfresco.gateway.handler.SubscriptionsApi;
import org.alfresco.gateway.model.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sample {

  private static final Logger LOGGER = LoggerFactory.getLogger(Sample.class);

  public static void main(String[] args) {

    @Inject
    SubscriptionsApi subscriptionsApi;

    Subscription subscription = subscriptionsApi.getSubscription("my-subscription-id");
    subscription.setStatus(Subscription.StatusEnum.ACTIVE);
    Subscription result = subscriptionsApi.partiallyUpdateSubscription(subscription);

    LOGGER.info("Updated subscription: {}", result);
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The subscription id |
 **body** | **JsonNode**| The JSON snippet holding the new status of the subscription | [optional]

### Return type

[**Subscription**](Subscription.md)
