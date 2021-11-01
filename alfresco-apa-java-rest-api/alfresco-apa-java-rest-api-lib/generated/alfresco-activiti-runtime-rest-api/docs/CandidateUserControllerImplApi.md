# CandidateUserControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCandidateUsersUsingPOST1**](CandidateUserControllerImplApi.md#addCandidateUsersUsingPOST1) | **POST** /v1/tasks/{taskId}/candidate-users | addCandidateUsers
[**deleteCandidateUsersUsingDELETE1**](CandidateUserControllerImplApi.md#deleteCandidateUsersUsingDELETE1) | **DELETE** /v1/tasks/{taskId}/candidate-users | deleteCandidateUsers
[**getUserCandidatesUsingGET1**](CandidateUserControllerImplApi.md#getUserCandidatesUsingGET1) | **GET** /v1/tasks/{taskId}/candidate-users | getUserCandidates

<a name="addCandidateUsersUsingPOST1"></a>
# **addCandidateUsersUsingPOST1**
> addCandidateUsersUsingPOST1(taskId, body)

addCandidateUsers

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateUserControllerImplApi;


CandidateUserControllerImplApi apiInstance = new CandidateUserControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CandidateUsersPayload body = new CandidateUsersPayload(); // CandidateUsersPayload | 
try {
    apiInstance.addCandidateUsersUsingPOST1(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateUserControllerImplApi#addCandidateUsersUsingPOST1");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteCandidateUsersUsingDELETE1"></a>
# **deleteCandidateUsersUsingDELETE1**
> deleteCandidateUsersUsingDELETE1(taskId, body)

deleteCandidateUsers

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateUserControllerImplApi;


CandidateUserControllerImplApi apiInstance = new CandidateUserControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CandidateUsersPayload body = new CandidateUsersPayload(); // CandidateUsersPayload | 
try {
    apiInstance.deleteCandidateUsersUsingDELETE1(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateUserControllerImplApi#deleteCandidateUsersUsingDELETE1");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getUserCandidatesUsingGET1"></a>
# **getUserCandidatesUsingGET1**
> ListResponseContentOfCandidateUser getUserCandidatesUsingGET1(taskId)

getUserCandidates

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateUserControllerImplApi;


CandidateUserControllerImplApi apiInstance = new CandidateUserControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    ListResponseContentOfCandidateUser result = apiInstance.getUserCandidatesUsingGET1(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateUserControllerImplApi#getUserCandidatesUsingGET1");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json
