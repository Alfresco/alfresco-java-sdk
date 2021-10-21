# CandidateUserAdminControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCandidateUsersUsingPOST**](CandidateUserAdminControllerImplApi.md#addCandidateUsersUsingPOST) | **POST** /admin/v1/tasks/{taskId}/candidate-users | addCandidateUsers
[**deleteCandidateUsersUsingDELETE**](CandidateUserAdminControllerImplApi.md#deleteCandidateUsersUsingDELETE) | **DELETE** /admin/v1/tasks/{taskId}/candidate-users | deleteCandidateUsers
[**getUserCandidatesUsingGET**](CandidateUserAdminControllerImplApi.md#getUserCandidatesUsingGET) | **GET** /admin/v1/tasks/{taskId}/candidate-users | getUserCandidates

<a name="addCandidateUsersUsingPOST"></a>
# **addCandidateUsersUsingPOST**
> addCandidateUsersUsingPOST(body, taskId)

addCandidateUsers

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.CandidateUserAdminControllerImplApi;


CandidateUserAdminControllerImplApi apiInstance = new CandidateUserAdminControllerImplApi();
CandidateUsersPayload body = new CandidateUsersPayload(); // CandidateUsersPayload | candidateUsersPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.addCandidateUsersUsingPOST(body, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateUserAdminControllerImplApi#addCandidateUsersUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CandidateUsersPayload**](CandidateUsersPayload.md)| candidateUsersPayload |
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteCandidateUsersUsingDELETE"></a>
# **deleteCandidateUsersUsingDELETE**
> deleteCandidateUsersUsingDELETE(body, taskId)

deleteCandidateUsers

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.CandidateUserAdminControllerImplApi;


CandidateUserAdminControllerImplApi apiInstance = new CandidateUserAdminControllerImplApi();
CandidateUsersPayload body = new CandidateUsersPayload(); // CandidateUsersPayload | candidateUsersPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.deleteCandidateUsersUsingDELETE(body, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateUserAdminControllerImplApi#deleteCandidateUsersUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CandidateUsersPayload**](CandidateUsersPayload.md)| candidateUsersPayload |
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="getUserCandidatesUsingGET"></a>
# **getUserCandidatesUsingGET**
> ListResponseContentCandidateUser getUserCandidatesUsingGET(taskId)

getUserCandidates

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.CandidateUserAdminControllerImplApi;


CandidateUserAdminControllerImplApi apiInstance = new CandidateUserAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    ListResponseContentCandidateUser result = apiInstance.getUserCandidatesUsingGET(taskId);
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

[**ListResponseContentCandidateUser**](ListResponseContentCandidateUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

