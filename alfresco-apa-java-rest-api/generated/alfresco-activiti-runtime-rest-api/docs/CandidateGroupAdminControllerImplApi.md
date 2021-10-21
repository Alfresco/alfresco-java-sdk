# CandidateGroupAdminControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCandidateGroupsUsingPOST**](CandidateGroupAdminControllerImplApi.md#addCandidateGroupsUsingPOST) | **POST** /admin/v1/tasks/{taskId}/candidate-groups | addCandidateGroups
[**deleteCandidateGroupsUsingDELETE**](CandidateGroupAdminControllerImplApi.md#deleteCandidateGroupsUsingDELETE) | **DELETE** /admin/v1/tasks/{taskId}/candidate-groups | deleteCandidateGroups
[**getGroupCandidatesUsingGET**](CandidateGroupAdminControllerImplApi.md#getGroupCandidatesUsingGET) | **GET** /admin/v1/tasks/{taskId}/candidate-groups | getGroupCandidates

<a name="addCandidateGroupsUsingPOST"></a>
# **addCandidateGroupsUsingPOST**
> addCandidateGroupsUsingPOST(body, taskId)

addCandidateGroups

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateGroupAdminControllerImplApi;


CandidateGroupAdminControllerImplApi apiInstance = new CandidateGroupAdminControllerImplApi();
CandidateGroupsPayload body = new CandidateGroupsPayload(); // CandidateGroupsPayload | candidateGroupsPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.addCandidateGroupsUsingPOST(body, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupAdminControllerImplApi#addCandidateGroupsUsingPOST");
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

<a name="deleteCandidateGroupsUsingDELETE"></a>
# **deleteCandidateGroupsUsingDELETE**
> deleteCandidateGroupsUsingDELETE(body, taskId)

deleteCandidateGroups

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateGroupAdminControllerImplApi;


CandidateGroupAdminControllerImplApi apiInstance = new CandidateGroupAdminControllerImplApi();
CandidateGroupsPayload body = new CandidateGroupsPayload(); // CandidateGroupsPayload | candidateGroupsPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.deleteCandidateGroupsUsingDELETE(body, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupAdminControllerImplApi#deleteCandidateGroupsUsingDELETE");
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

<a name="getGroupCandidatesUsingGET"></a>
# **getGroupCandidatesUsingGET**
> ListResponseContentCandidateGroup getGroupCandidatesUsingGET(taskId)

getGroupCandidates

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateGroupAdminControllerImplApi;


CandidateGroupAdminControllerImplApi apiInstance = new CandidateGroupAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    ListResponseContentCandidateGroup result = apiInstance.getGroupCandidatesUsingGET(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupAdminControllerImplApi#getGroupCandidatesUsingGET");
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

