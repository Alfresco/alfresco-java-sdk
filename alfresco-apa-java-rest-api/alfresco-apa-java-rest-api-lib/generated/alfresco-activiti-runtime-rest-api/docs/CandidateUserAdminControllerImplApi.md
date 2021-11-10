# CandidateUserAdminControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCandidateUsersUsingPOST**](CandidateUserAdminControllerImplApi.md#addCandidateUsersUsingPOST) | **POST** /admin/v1/tasks/{taskId}/candidate-users | addCandidateUsers
[**deleteCandidateUsersUsingDELETE**](CandidateUserAdminControllerImplApi.md#deleteCandidateUsersUsingDELETE) | **DELETE** /admin/v1/tasks/{taskId}/candidate-users | deleteCandidateUsers
[**getUserCandidatesUsingGET**](CandidateUserAdminControllerImplApi.md#getUserCandidatesUsingGET) | **GET** /admin/v1/tasks/{taskId}/candidate-users | getUserCandidates

<a name="addCandidateUsersUsingPOST"></a>
# **addCandidateUsersUsingPOST**
> addCandidateUsersUsingPOST(taskId, body)

addCandidateUsers

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiClient;
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.Configuration;
//import org.alfresco.activiti.runtime.auth.*;
//import org.alfresco.activiti.runtime.handler.CandidateUserAdminControllerImplApi;



// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

CandidateUserAdminControllerImplApi apiInstance = new CandidateUserAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CandidateUsersPayload body = new CandidateUsersPayload(); // CandidateUsersPayload | 
try {
    apiInstance.addCandidateUsersUsingPOST(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateUserAdminControllerImplApi#addCandidateUsersUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**CandidateUsersPayload**](CandidateUsersPayload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteCandidateUsersUsingDELETE"></a>
# **deleteCandidateUsersUsingDELETE**
> deleteCandidateUsersUsingDELETE(taskId, body)

deleteCandidateUsers

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiClient;
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.Configuration;
//import org.alfresco.activiti.runtime.auth.*;
//import org.alfresco.activiti.runtime.handler.CandidateUserAdminControllerImplApi;



// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

CandidateUserAdminControllerImplApi apiInstance = new CandidateUserAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CandidateUsersPayload body = new CandidateUsersPayload(); // CandidateUsersPayload | 
try {
    apiInstance.deleteCandidateUsersUsingDELETE(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateUserAdminControllerImplApi#deleteCandidateUsersUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**CandidateUsersPayload**](CandidateUsersPayload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getUserCandidatesUsingGET"></a>
# **getUserCandidatesUsingGET**
> ListResponseContentOfCandidateUser getUserCandidatesUsingGET(taskId)

getUserCandidates

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiClient;
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.Configuration;
//import org.alfresco.activiti.runtime.auth.*;
//import org.alfresco.activiti.runtime.handler.CandidateUserAdminControllerImplApi;



// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

CandidateUserAdminControllerImplApi apiInstance = new CandidateUserAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    ListResponseContentOfCandidateUser result = apiInstance.getUserCandidatesUsingGET(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateUserAdminControllerImplApi#getUserCandidatesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**ListResponseContentOfCandidateUser**](ListResponseContentOfCandidateUser.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

