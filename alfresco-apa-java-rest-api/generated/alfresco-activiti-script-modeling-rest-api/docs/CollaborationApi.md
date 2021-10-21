# CollaborationApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCollaboratorUsingPUT**](CollaborationApi.md#addCollaboratorUsingPUT) | **PUT** /v1/projects/{projectId}/collaborators/{username} | Add a collaborator
[**getCollaboratorsUsingGET**](CollaborationApi.md#getCollaboratorsUsingGET) | **GET** /v1/projects/{projectId}/collaborators | List collaborators
[**removeCollaboratorUsingDELETE**](CollaborationApi.md#removeCollaboratorUsingDELETE) | **DELETE** /v1/projects/{projectId}/collaborators/{username} | Remove a collaborator

<a name="addCollaboratorUsingPUT"></a>
# **addCollaboratorUsingPUT**
> EntryResponseContentCollaborator addCollaboratorUsingPUT(projectId, username)

Add a collaborator

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.CollaborationApi;


CollaborationApi apiInstance = new CollaborationApi();
String projectId = "projectId_example"; // String | The Id of the project
String username = "username_example"; // String | The unique username of the collaborator
try {
    EntryResponseContentCollaborator result = apiInstance.addCollaboratorUsingPUT(projectId, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#addCollaboratorUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The Id of the project |
 **username** | **String**| The unique username of the collaborator |

### Return type

[**EntryResponseContentCollaborator**](EntryResponseContentCollaborator.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCollaboratorsUsingGET"></a>
# **getCollaboratorsUsingGET**
> ListResponseContentCollaborator getCollaboratorsUsingGET(projectId, maxItems, skipCount, sort)

List collaborators

Get the list of collaborators on a project.

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.CollaborationApi;


CollaborationApi apiInstance = new CollaborationApi();
String projectId = "projectId_example"; // String | The Id of the project
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentCollaborator result = apiInstance.getCollaboratorsUsingGET(projectId, maxItems, skipCount, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#getCollaboratorsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The Id of the project |
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**ListResponseContentCollaborator**](ListResponseContentCollaborator.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="removeCollaboratorUsingDELETE"></a>
# **removeCollaboratorUsingDELETE**
> removeCollaboratorUsingDELETE(projectId, username)

Remove a collaborator

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.CollaborationApi;


CollaborationApi apiInstance = new CollaborationApi();
String projectId = "projectId_example"; // String | The Id of the project
String username = "username_example"; // String | The unique username of the collaborator
try {
    apiInstance.removeCollaboratorUsingDELETE(projectId, username);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaborationApi#removeCollaboratorUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The Id of the project |
 **username** | **String**| The unique username of the collaborator |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

