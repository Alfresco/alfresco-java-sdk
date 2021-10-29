# TaskControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsingGET10**](TaskControllerApi.md#findAllUsingGET10) | **GET** /v1/tasks | findAll
[**findByIdUsingGET6**](TaskControllerApi.md#findByIdUsingGET6) | **GET** /v1/tasks/{taskId} | findById
[**getTaskCandidateGroupsUsingGET1**](TaskControllerApi.md#getTaskCandidateGroupsUsingGET1) | **GET** /v1/tasks/{taskId}/candidate-groups | getTaskCandidateGroups
[**getTaskCandidateUsersUsingGET1**](TaskControllerApi.md#getTaskCandidateUsersUsingGET1) | **GET** /v1/tasks/{taskId}/candidate-users | getTaskCandidateUsers

<a name="findAllUsingGET10"></a>
# **findAllUsingGET10**
> ListResponseContentOfQueryCloudTask findAllUsingGET10(maxItems, rootTasksOnly, skipCount, sort, variablesName, variablesType, variablesValue, standalone)

findAll

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.TaskControllerApi;


TaskControllerApi apiInstance = new TaskControllerApi();
Integer maxItems = 56; // Integer | 
Boolean rootTasksOnly = true; // Boolean | rootTasksOnly
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
String variablesName = "variablesName_example"; // String | 
String variablesType = "variablesType_example"; // String | 
String variablesValue = "variablesValue_example"; // String | 
Boolean standalone = true; // Boolean | standalone
try {
    ListResponseContentOfQueryCloudTask result = apiInstance.findAllUsingGET10(maxItems, rootTasksOnly, skipCount, sort, variablesName, variablesType, variablesValue, standalone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerApi#findAllUsingGET10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxItems** | **Integer**|  | [optional]
 **rootTasksOnly** | **Boolean**| rootTasksOnly | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]
 **variablesName** | **String**|  | [optional]
 **variablesType** | **String**|  | [optional]
 **variablesValue** | **String**|  | [optional]
 **standalone** | **Boolean**| standalone | [optional]

### Return type

[**ListResponseContentOfQueryCloudTask**](ListResponseContentOfQueryCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="findByIdUsingGET6"></a>
# **findByIdUsingGET6**
> EntryResponseContentOfQueryCloudTask findByIdUsingGET6(taskId)

findById

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.TaskControllerApi;


TaskControllerApi apiInstance = new TaskControllerApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentOfQueryCloudTask result = apiInstance.findByIdUsingGET6(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerApi#findByIdUsingGET6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**EntryResponseContentOfQueryCloudTask**](EntryResponseContentOfQueryCloudTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getTaskCandidateGroupsUsingGET1"></a>
# **getTaskCandidateGroupsUsingGET1**
> List&lt;String&gt; getTaskCandidateGroupsUsingGET1(taskId)

getTaskCandidateGroups

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.TaskControllerApi;


TaskControllerApi apiInstance = new TaskControllerApi();
String taskId = "taskId_example"; // String | taskId
try {
    List<String> result = apiInstance.getTaskCandidateGroupsUsingGET1(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerApi#getTaskCandidateGroupsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getTaskCandidateUsersUsingGET1"></a>
# **getTaskCandidateUsersUsingGET1**
> List&lt;String&gt; getTaskCandidateUsersUsingGET1(taskId)

getTaskCandidateUsers

### Example
```java
// Import classes:
//import com.alfresco.activiti.audit.ApiException;
//import com.alfresco.activiti.audit.handler.TaskControllerApi;


TaskControllerApi apiInstance = new TaskControllerApi();
String taskId = "taskId_example"; // String | taskId
try {
    List<String> result = apiInstance.getTaskCandidateUsersUsingGET1(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskControllerApi#getTaskCandidateUsersUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

