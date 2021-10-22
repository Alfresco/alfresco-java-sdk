# CandidateGroupControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCandidateGroupsUsingPOST1**](CandidateGroupControllerImplApi.md#addCandidateGroupsUsingPOST1) | **POST** /v1/tasks/{taskId}/candidate-groups | addCandidateGroups
[**deleteCandidateGroupsUsingDELETE1**](CandidateGroupControllerImplApi.md#deleteCandidateGroupsUsingDELETE1) | **DELETE** /v1/tasks/{taskId}/candidate-groups | deleteCandidateGroups
[**getGroupCandidatesUsingGET1**](CandidateGroupControllerImplApi.md#getGroupCandidatesUsingGET1) | **GET** /v1/tasks/{taskId}/candidate-groups | getGroupCandidates

<a name="addCandidateGroupsUsingPOST1"></a>
# **addCandidateGroupsUsingPOST1**
> addCandidateGroupsUsingPOST1(body, taskId)

addCandidateGroups

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.CandidateGroupControllerImplApi;


CandidateGroupControllerImplApi apiInstance = new CandidateGroupControllerImplApi();
CandidateGroupsPayload body = new CandidateGroupsPayload(); // CandidateGroupsPayload | candidateGroupsPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.addCandidateGroupsUsingPOST1(body, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupControllerImplApi#addCandidateGroupsUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CandidateGroupsPayload**](CandidateGroupsPayload.md)| candidateGroupsPayload |
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteCandidateGroupsUsingDELETE1"></a>
# **deleteCandidateGroupsUsingDELETE1**
> deleteCandidateGroupsUsingDELETE1(body, taskId)

deleteCandidateGroups

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.CandidateGroupControllerImplApi;


CandidateGroupControllerImplApi apiInstance = new CandidateGroupControllerImplApi();
CandidateGroupsPayload body = new CandidateGroupsPayload(); // CandidateGroupsPayload | candidateGroupsPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.deleteCandidateGroupsUsingDELETE1(body, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupControllerImplApi#deleteCandidateGroupsUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CandidateGroupsPayload**](CandidateGroupsPayload.md)| candidateGroupsPayload |
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="getGroupCandidatesUsingGET1"></a>
# **getGroupCandidatesUsingGET1**
> ListResponseContentCandidateGroup getGroupCandidatesUsingGET1(taskId)

getGroupCandidates

### Example
```java
// Import classes:
//import com.alfresco.activiti.preference.ApiException;
//import com.alfresco.activiti.preference.handler.CandidateGroupControllerImplApi;


CandidateGroupControllerImplApi apiInstance = new CandidateGroupControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    ListResponseContentCandidateGroup result = apiInstance.getGroupCandidatesUsingGET1(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupControllerImplApi#getGroupCandidatesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**ListResponseContentCandidateGroup**](ListResponseContentCandidateGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

