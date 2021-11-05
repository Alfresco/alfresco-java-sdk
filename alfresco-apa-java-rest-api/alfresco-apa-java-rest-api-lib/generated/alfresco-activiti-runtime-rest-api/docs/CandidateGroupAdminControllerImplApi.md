# CandidateGroupAdminControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCandidateGroupsUsingPOST**](CandidateGroupAdminControllerImplApi.md#addCandidateGroupsUsingPOST) | **POST** /admin/v1/tasks/{taskId}/candidate-groups | addCandidateGroups
[**deleteCandidateGroupsUsingDELETE**](CandidateGroupAdminControllerImplApi.md#deleteCandidateGroupsUsingDELETE) | **DELETE** /admin/v1/tasks/{taskId}/candidate-groups | deleteCandidateGroups
[**getGroupCandidatesUsingGET**](CandidateGroupAdminControllerImplApi.md#getGroupCandidatesUsingGET) | **GET** /admin/v1/tasks/{taskId}/candidate-groups | getGroupCandidates

<a name="addCandidateGroupsUsingPOST"></a>
# **addCandidateGroupsUsingPOST**
> addCandidateGroupsUsingPOST(taskId, body)

addCandidateGroups

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.handler.CandidateGroupAdminControllerImplApi;


CandidateGroupAdminControllerImplApi apiInstance = new CandidateGroupAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CandidateGroupsPayload body = new CandidateGroupsPayload(); // CandidateGroupsPayload | 
try {
    apiInstance.addCandidateGroupsUsingPOST(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupAdminControllerImplApi#addCandidateGroupsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**CandidateGroupsPayload**](CandidateGroupsPayload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteCandidateGroupsUsingDELETE"></a>
# **deleteCandidateGroupsUsingDELETE**
> deleteCandidateGroupsUsingDELETE(taskId, body)

deleteCandidateGroups

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.handler.CandidateGroupAdminControllerImplApi;


CandidateGroupAdminControllerImplApi apiInstance = new CandidateGroupAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CandidateGroupsPayload body = new CandidateGroupsPayload(); // CandidateGroupsPayload | 
try {
    apiInstance.deleteCandidateGroupsUsingDELETE(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupAdminControllerImplApi#deleteCandidateGroupsUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **body** | [**CandidateGroupsPayload**](CandidateGroupsPayload.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getGroupCandidatesUsingGET"></a>
# **getGroupCandidatesUsingGET**
> ListResponseContentOfCandidateGroup getGroupCandidatesUsingGET(taskId)

getGroupCandidates

### Example
```java
// Import classes:
//import org.alfresco.activiti.runtime.ApiException;
//import org.alfresco.activiti.runtime.handler.CandidateGroupAdminControllerImplApi;


CandidateGroupAdminControllerImplApi apiInstance = new CandidateGroupAdminControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    ListResponseContentOfCandidateGroup result = apiInstance.getGroupCandidatesUsingGET(taskId);
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

[**ListResponseContentOfCandidateGroup**](ListResponseContentOfCandidateGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

