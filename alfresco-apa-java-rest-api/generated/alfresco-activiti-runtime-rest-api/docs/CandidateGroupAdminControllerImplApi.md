# CandidateGroupAdminControllerImplApi

All URIs are relative to *https://apadev.envalfresco.comtrue*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCandidateGroupsUsingPOST**](CandidateGroupAdminControllerImplApi.md#addCandidateGroupsUsingPOST) | **POST** /admin/v1/tasks/{taskId}/candidate-groups | addCandidateGroups
[**deleteCandidateGroupsUsingDELETE**](CandidateGroupAdminControllerImplApi.md#deleteCandidateGroupsUsingDELETE) | **DELETE** /admin/v1/tasks/{taskId}/candidate-groups | deleteCandidateGroups
[**getGroupCandidatesUsingGET**](CandidateGroupAdminControllerImplApi.md#getGroupCandidatesUsingGET) | **GET** /admin/v1/tasks/{taskId}/candidate-groups | getGroupCandidates


<a name="addCandidateGroupsUsingPOST"></a>
# **addCandidateGroupsUsingPOST**
> addCandidateGroupsUsingPOST(candidateGroupsPayload, taskId)

addCandidateGroups

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateGroupAdminControllerImplApi;


CandidateGroupAdminControllerImplApi apiInstance = new CandidateGroupAdminControllerImplApi();
CandidateGroupsPayload candidateGroupsPayload = new CandidateGroupsPayload(); // CandidateGroupsPayload | candidateGroupsPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.addCandidateGroupsUsingPOST(candidateGroupsPayload, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupAdminControllerImplApi#addCandidateGroupsUsingPOST");
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

<a name="deleteCandidateGroupsUsingDELETE"></a>
# **deleteCandidateGroupsUsingDELETE**
> deleteCandidateGroupsUsingDELETE(candidateGroupsPayload, taskId)

deleteCandidateGroups

### Example
```java
// Import classes:
//import com.alfresco.activiti.runtime.ApiException;
//import com.alfresco.activiti.runtime.handler.CandidateGroupAdminControllerImplApi;


CandidateGroupAdminControllerImplApi apiInstance = new CandidateGroupAdminControllerImplApi();
CandidateGroupsPayload candidateGroupsPayload = new CandidateGroupsPayload(); // CandidateGroupsPayload | candidateGroupsPayload
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.deleteCandidateGroupsUsingDELETE(candidateGroupsPayload, taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupAdminControllerImplApi#deleteCandidateGroupsUsingDELETE");
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

