# CandidateGroupControllerImplApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCandidateGroupsUsingPOST1**](CandidateGroupControllerImplApi.md#addCandidateGroupsUsingPOST1) | **POST** /v1/tasks/{taskId}/candidate-groups | addCandidateGroups
[**deleteCandidateGroupsUsingDELETE1**](CandidateGroupControllerImplApi.md#deleteCandidateGroupsUsingDELETE1) | **DELETE** /v1/tasks/{taskId}/candidate-groups | deleteCandidateGroups
[**getGroupCandidatesUsingGET1**](CandidateGroupControllerImplApi.md#getGroupCandidatesUsingGET1) | **GET** /v1/tasks/{taskId}/candidate-groups | getGroupCandidates


<a name="addCandidateGroupsUsingPOST1"></a>
# **addCandidateGroupsUsingPOST1**
> addCandidateGroupsUsingPOST1(candidateGroupsPayload, taskId)

addCandidateGroups

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateGroupControllerImplApi;


CandidateGroupControllerImplApi apiInstance = new CandidateGroupControllerImplApi();
CandidateGroupsPayload candidateGroupsPayload = new CandidateGroupsPayload(); // CandidateGroupsPayload | candidateGroupsPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.addCandidateGroupsUsingPOST1(candidateGroupsPayload, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupControllerImplApi#addCandidateGroupsUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **candidateGroupsPayload** | [**CandidateGroupsPayload**](CandidateGroupsPayload.md)| candidateGroupsPayload |
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="deleteCandidateGroupsUsingDELETE1"></a>
# **deleteCandidateGroupsUsingDELETE1**
> deleteCandidateGroupsUsingDELETE1(candidateGroupsPayload, taskId)

deleteCandidateGroups

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateGroupControllerImplApi;


CandidateGroupControllerImplApi apiInstance = new CandidateGroupControllerImplApi();
CandidateGroupsPayload candidateGroupsPayload = new CandidateGroupsPayload(); // CandidateGroupsPayload | candidateGroupsPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.deleteCandidateGroupsUsingDELETE1(candidateGroupsPayload, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupControllerImplApi#deleteCandidateGroupsUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **candidateGroupsPayload** | [**CandidateGroupsPayload**](CandidateGroupsPayload.md)| candidateGroupsPayload |
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="getGroupCandidatesUsingGET1"></a>
# **getGroupCandidatesUsingGET1**
> ListResponseContentCandidateGroup getGroupCandidatesUsingGET1(taskId)

getGroupCandidates

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateGroupControllerImplApi;


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

