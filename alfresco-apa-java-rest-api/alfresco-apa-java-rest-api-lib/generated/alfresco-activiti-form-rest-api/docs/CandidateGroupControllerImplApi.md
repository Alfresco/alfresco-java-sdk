# CandidateGroupControllerImplApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCandidateGroupsUsingPOST1**](CandidateGroupControllerImplApi.md#addCandidateGroupsUsingPOST1) | **POST** /v1/tasks/{taskId}/candidate-groups | addCandidateGroups
[**deleteCandidateGroupsUsingDELETE1**](CandidateGroupControllerImplApi.md#deleteCandidateGroupsUsingDELETE1) | **DELETE** /v1/tasks/{taskId}/candidate-groups | deleteCandidateGroups
[**getGroupCandidatesUsingGET1**](CandidateGroupControllerImplApi.md#getGroupCandidatesUsingGET1) | **GET** /v1/tasks/{taskId}/candidate-groups | getGroupCandidates

<a name="addCandidateGroupsUsingPOST1"></a>
# **addCandidateGroupsUsingPOST1**
> addCandidateGroupsUsingPOST1(taskId, body)

addCandidateGroups

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.CandidateGroupControllerImplApi;


CandidateGroupControllerImplApi apiInstance = new CandidateGroupControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CandidateGroupsPayload body = new CandidateGroupsPayload(); // CandidateGroupsPayload | 
try {
    apiInstance.addCandidateGroupsUsingPOST1(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupControllerImplApi#addCandidateGroupsUsingPOST1");
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

<a name="deleteCandidateGroupsUsingDELETE1"></a>
# **deleteCandidateGroupsUsingDELETE1**
> deleteCandidateGroupsUsingDELETE1(taskId, body)

deleteCandidateGroups

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.CandidateGroupControllerImplApi;


CandidateGroupControllerImplApi apiInstance = new CandidateGroupControllerImplApi();
String taskId = "taskId_example"; // String | taskId
CandidateGroupsPayload body = new CandidateGroupsPayload(); // CandidateGroupsPayload | 
try {
    apiInstance.deleteCandidateGroupsUsingDELETE1(taskId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CandidateGroupControllerImplApi#deleteCandidateGroupsUsingDELETE1");
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

<a name="getGroupCandidatesUsingGET1"></a>
# **getGroupCandidatesUsingGET1**
> ListResponseContentOfCandidateGroup getGroupCandidatesUsingGET1(taskId)

getGroupCandidates

### Example
```java
// Import classes:
//import org.alfresco.activiti.form.ApiException;
//import org.alfresco.activiti.form.handler.CandidateGroupControllerImplApi;


CandidateGroupControllerImplApi apiInstance = new CandidateGroupControllerImplApi();
String taskId = "taskId_example"; // String | taskId
try {
    ListResponseContentOfCandidateGroup result = apiInstance.getGroupCandidatesUsingGET1(taskId);
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

[**ListResponseContentOfCandidateGroup**](ListResponseContentOfCandidateGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

