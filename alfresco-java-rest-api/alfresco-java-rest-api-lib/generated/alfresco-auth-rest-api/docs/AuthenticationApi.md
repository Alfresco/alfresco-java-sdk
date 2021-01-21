# AuthenticationApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/authentication/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTicket**](AuthenticationApi.md#createTicket) | **POST** /tickets | Create ticket (login)
[**deleteTicket**](AuthenticationApi.md#deleteTicket) | **DELETE** /tickets/-me- | Delete ticket (logout)
[**validateTicket**](AuthenticationApi.md#validateTicket) | **GET** /tickets/-me- | Validate ticket


<a name="createTicket"></a>
# **createTicket**
> TicketEntry createTicket(ticketBodyCreate)

Create ticket (login)

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Logs in and returns the new authentication ticket.  The userId and password properties are mandatory in the request body. For example: &#x60;&#x60;&#x60;JSON {     \&quot;userId\&quot;: \&quot;jbloggs\&quot;,     \&quot;password\&quot;: \&quot;password\&quot; } &#x60;&#x60;&#x60; To use the ticket in future requests you should pass it in the request header. For example using Javascript:   &#x60;&#x60;&#x60;Javascript     request.setRequestHeader (\&quot;Authorization\&quot;, \&quot;Basic \&quot; + btoa(ticket));   &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.auth.handler.AuthenticationApi;








AuthenticationApi apiInstance = new AuthenticationApi();
TicketBody ticketBodyCreate = new TicketBody(); // TicketBody | The user credential.
try {
    TicketEntry result = apiInstance.createTicket(ticketBodyCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#createTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketBodyCreate** | [**TicketBody**](TicketBody.md)| The user credential. |

### Return type

[**TicketEntry**](TicketEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTicket"></a>
# **deleteTicket**
> deleteTicket()

Delete ticket (logout)

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Deletes logged in ticket (logout). 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.auth.handler.AuthenticationApi;








AuthenticationApi apiInstance = new AuthenticationApi();
try {
    apiInstance.deleteTicket();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#deleteTicket");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateTicket"></a>
# **validateTicket**
> ValidTicketEntry validateTicket()

Validate ticket

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Validates the specified ticket (derived from Authorization header) is still valid.  For example, you can pass the Authorization request header using Javascript:   &#x60;&#x60;&#x60;Javascript     request.setRequestHeader (\&quot;Authorization\&quot;, \&quot;Basic \&quot; + btoa(ticket));   &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import org.alfresco.ApiClient;
//import org.alfresco.ApiException;
//import org.alfresco.Configuration;
//import org.alfresco.auth.*;
//import org.alfresco.auth.handler.AuthenticationApi;








AuthenticationApi apiInstance = new AuthenticationApi();
try {
    ValidTicketEntry result = apiInstance.validateTicket();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#validateTicket");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ValidTicketEntry**](ValidTicketEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

