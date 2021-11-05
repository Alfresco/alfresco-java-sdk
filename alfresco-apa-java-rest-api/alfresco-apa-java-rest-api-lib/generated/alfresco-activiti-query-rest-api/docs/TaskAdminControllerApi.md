# TaskAdminControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAllUsingGET9**](TaskAdminControllerApi.md#findAllUsingGET9) | **GET** /admin/v1/tasks | findAll
[**findByIdUsingGET5**](TaskAdminControllerApi.md#findByIdUsingGET5) | **GET** /admin/v1/tasks/{taskId} | findById
[**getTaskCandidateGroupsUsingGET**](TaskAdminControllerApi.md#getTaskCandidateGroupsUsingGET) | **GET** /admin/v1/tasks/{taskId}/candidate-groups | getTaskCandidateGroups
[**getTaskCandidateUsersUsingGET**](TaskAdminControllerApi.md#getTaskCandidateUsersUsingGET) | **GET** /admin/v1/tasks/{taskId}/candidate-users | getTaskCandidateUsers

<a name="findAllUsingGET9"></a>
# **findAllUsingGET9**
> ListResponseContentOfQueryCloudTask findAllUsingGET9(maxItems, rootTasksOnly, skipCount, sort, variablesName, variablesType, variablesValue, standalone)

findAll

### Example
```java
// Import classes:
//import org.alfresco.activiti.query.ApiException;
//import org.alfresco.activiti.query.handler.TaskAdminControllerApi;


TaskAdminControllerApi apiInstance = new TaskAdminControllerApi();
Integer maxItems = 56; // Integer | 
Boolean rootTasksOnly = true; // Boolean | rootTasksOnly
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
String variablesName = "variablesName_example"; // String | 
String variablesType = "variablesType_example"; // String | 
String variablesValue = "variablesValue_example"; // String | 
Boolean standalone = true; // Boolean | standalone
try {
    ListResponseContentOfQueryCloudTask result = apiInstance.findAllUsingGET9(maxItems, rootTasksOnly, skipCount, sort, variablesName, variablesType, variablesValue, standalone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAdminControllerApi#findAllUsingGET9");
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

<a name="findByIdUsingGET5"></a>
# **findByIdUsingGET5**
> EntryResponseContentOfQueryCloudTask findByIdUsingGET5(taskId)

findById

### Example
```java
// Import classes:
//import org.alfresco.activiti.query.ApiException;
//import org.alfresco.activiti.query.handler.TaskAdminControllerApi;


TaskAdminControllerApi apiInstance = new TaskAdminControllerApi();
String taskId = "taskId_example"; // String | taskId
try {
    EntryResponseContentOfQueryCloudTask result = apiInstance.findByIdUsingGET5(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAdminControllerApi#findByIdUsingGET5");
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

<a name="getTaskCandidateGroupsUsingGET"></a>
# **getTaskCandidateGroupsUsingGET**
> List&lt;String&gt; getTaskCandidateGroupsUsingGET(taskId)

getTaskCandidateGroups

### Example
```java
// Import classes:
//import org.alfresco.activiti.query.ApiException;
//import org.alfresco.activiti.query.handler.TaskAdminControllerApi;


TaskAdminControllerApi apiInstance = new TaskAdminControllerApi();
String taskId = "taskId_example"; // String | taskId
try {
    List<String> result = apiInstance.getTaskCandidateGroupsUsingGET(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAdminControllerApi#getTaskCandidateGroupsUsingGET");
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

<a name="getTaskCandidateUsersUsingGET"></a>
# **getTaskCandidateUsersUsingGET**
> List&lt;String&gt; getTaskCandidateUsersUsingGET(taskId)

getTaskCandidateUsers

### Example
```java
// Import classes:
//import org.alfresco.activiti.query.ApiException;
//import org.alfresco.activiti.query.handler.TaskAdminControllerApi;


TaskAdminControllerApi apiInstance = new TaskAdminControllerApi();
String taskId = "taskId_example"; // String | taskId
try {
    List<String> result = apiInstance.getTaskCandidateUsersUsingGET(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskAdminControllerApi#getTaskCandidateUsersUsingGET");
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

