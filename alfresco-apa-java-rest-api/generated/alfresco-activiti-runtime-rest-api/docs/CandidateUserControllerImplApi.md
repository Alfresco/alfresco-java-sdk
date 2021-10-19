# CandidateUserControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCandidateUsersUsingPOST1**](CandidateUserControllerImplApi.md#addCandidateUsersUsingPOST1) | **POST** /v1/tasks/{taskId}/candidate-users | addCandidateUsers
[**deleteCandidateUsersUsingDELETE1**](CandidateUserControllerImplApi.md#deleteCandidateUsersUsingDELETE1) | **DELETE** /v1/tasks/{taskId}/candidate-users | deleteCandidateUsers
[**getUserCandidatesUsingGET1**](CandidateUserControllerImplApi.md#getUserCandidatesUsingGET1) | **GET** /v1/tasks/{taskId}/candidate-users | getUserCandidates


<a name="addCandidateUsersUsingPOST1"></a>
# **addCandidateUsersUsingPOST1**
> addCandidateUsersUsingPOST1(candidateUsersPayload, taskId)

addCandidateUsers

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateUserControllerImplApi;


CandidateUserControllerImplApi apiInstance = new CandidateUserControllerImplApi();
CandidateUsersPayload candidateUsersPayload = new CandidateUsersPayload(); // CandidateUsersPayload | candidateUsersPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.addCandidateUsersUsingPOST1(candidateUsersPayload, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateUserControllerImplApi#addCandidateUsersUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **candidateUsersPayload** | [**CandidateUsersPayload**](CandidateUsersPayload.md)| candidateUsersPayload |
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="deleteCandidateUsersUsingDELETE1"></a>
# **deleteCandidateUsersUsingDELETE1**
> deleteCandidateUsersUsingDELETE1(candidateUsersPayload, taskId)

deleteCandidateUsers

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateUserControllerImplApi;


CandidateUserControllerImplApi apiInstance = new CandidateUserControllerImplApi();
CandidateUsersPayload candidateUsersPayload = new CandidateUsersPayload(); // CandidateUsersPayload | candidateUsersPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.deleteCandidateUsersUsingDELETE1(candidateUsersPayload, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateUserControllerImplApi#deleteCandidateUsersUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **candidateUsersPayload** | [**CandidateUsersPayload**](CandidateUsersPayload.md)| candidateUsersPayload |
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="getUserCandidatesUsingGET1"></a>
# **getUserCandidatesUsingGET1**
> ListResponseContentCandidateUser getUserCandidatesUsingGET1(taskId)

getUserCandidates

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateUserControllerImplApi;


CandidateUserControllerImplApi apiInstance = new CandidateUserControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    ListResponseContentCandidateUser result = apiInstance.getUserCandidatesUsingGET1(taskId);
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

[**ListResponseContentCandidateUser**](ListResponseContentCandidateUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

