# ProjectsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyProjectUsingPOST**](ProjectsApi.md#copyProjectUsingPOST) | **POST** /v1/projects/{projectId}/copy | Copy an project as a new project with chosen name
[**createProjectFromExampleUsingPOST**](ProjectsApi.md#createProjectFromExampleUsingPOST) | **POST** /v1/projects/example | Create an project from example
[**createProjectUsingPOST**](ProjectsApi.md#createProjectUsingPOST) | **POST** /v1/projects | Create new project
[**deleteProjectUsingDELETE**](ProjectsApi.md#deleteProjectUsingDELETE) | **DELETE** /v1/projects/{projectId} | Delete project
[**exportProjectUsingGET**](ProjectsApi.md#exportProjectUsingGET) | **GET** /v1/projects/{projectId}/export | Export an project as zip file
[**getProjectReleaseUsingGET**](ProjectsApi.md#getProjectReleaseUsingGET) | **GET** /v1/projects/{projectId}/releases | Get releases of a project
[**getProjectUsingGET**](ProjectsApi.md#getProjectUsingGET) | **GET** /v1/projects/{projectId} | Get project
[**getProjectsUsingGET**](ProjectsApi.md#getProjectsUsingGET) | **GET** /v1/projects | List projects
[**importProjectUsingPOST**](ProjectsApi.md#importProjectUsingPOST) | **POST** /v1/projects/import | Import an project as zip file
[**releaseProjectUsingPOST**](ProjectsApi.md#releaseProjectUsingPOST) | **POST** /v1/projects/{projectId}/releases | Create a new release of a project
[**updateProjectUsingPUT**](ProjectsApi.md#updateProjectUsingPUT) | **PUT** /v1/projects/{projectId} | Update project details
[**validateProjectUsingGET**](ProjectsApi.md#validateProjectUsingGET) | **GET** /v1/projects/{projectId}/validate | Validate an project by id

<a name="copyProjectUsingPOST"></a>
# **copyProjectUsingPOST**
> EntryResponseContentOfProject copyProjectUsingPOST(projectId, name)

Copy an project as a new project with chosen name

This will create a new project with chosen name containing the project folder and all related models.&lt;br&gt;

### Example
```java
// Import classes:
//import com.alfresco.activiti.modeling.ApiException;
//import com.alfresco.activiti.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | The id of the project to copy
String name = "name_example"; // String | The name of the project that will replace the original name of the project
try {
    EntryResponseContentOfProject result = apiInstance.copyProjectUsingPOST(projectId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#copyProjectUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project to copy |
 **name** | **String**| The name of the project that will replace the original name of the project |

### Return type

[**EntryResponseContentOfProject**](EntryResponseContentOfProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="createProjectFromExampleUsingPOST"></a>
# **createProjectFromExampleUsingPOST**
> EntryResponseContentOfProject createProjectFromExampleUsingPOST(exampleProjectId, name)

Create an project from example

This will download an example project (zip) and create a new project with chosen name

### Example
```java
// Import classes:
//import com.alfresco.activiti.modeling.ApiException;
//import com.alfresco.activiti.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String exampleProjectId = "exampleProjectId_example"; // String | The example project id of the source example project
String name = "name_example"; // String | The name for the new project created from an example project
try {
    EntryResponseContentOfProject result = apiInstance.createProjectFromExampleUsingPOST(exampleProjectId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#createProjectFromExampleUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exampleProjectId** | **String**| The example project id of the source example project |
 **name** | **String**| The name for the new project created from an example project |

### Return type

[**EntryResponseContentOfProject**](EntryResponseContentOfProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createProjectUsingPOST"></a>
# **createProjectUsingPOST**
> EntryResponseContentOfProject createProjectUsingPOST(body)

Create new project

### Example
```java
// Import classes:
//import com.alfresco.activiti.modeling.ApiException;
//import com.alfresco.activiti.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
Project body = new Project(); // Project | 
try {
    EntryResponseContentOfProject result = apiInstance.createProjectUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#createProjectUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)|  | [optional]

### Return type

[**EntryResponseContentOfProject**](EntryResponseContentOfProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

<a name="deleteProjectUsingDELETE"></a>
# **deleteProjectUsingDELETE**
> deleteProjectUsingDELETE(projectId)

Delete project

### Example
```java
// Import classes:
//import com.alfresco.activiti.modeling.ApiException;
//import com.alfresco.activiti.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | The id of the project to delete
try {
    apiInstance.deleteProjectUsingDELETE(projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#deleteProjectUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="exportProjectUsingGET"></a>
# **exportProjectUsingGET**
> exportProjectUsingGET(projectId, attachment)

Export an project as zip file

This will create and download the zip containing the project folder and all related models.&lt;br&gt;

### Example
```java
// Import classes:
//import com.alfresco.activiti.modeling.ApiException;
//import com.alfresco.activiti.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | The id of the project to export
Boolean attachment = true; // Boolean | <b>true</b> value enables a web browser to download the file as an attachment.<br> <b>false</b> means that a web browser may preview the file in a new tab or window, but not download the file.
try {
    apiInstance.exportProjectUsingGET(projectId, attachment);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#exportProjectUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project to export |
 **attachment** | **Boolean**| &lt;b&gt;true&lt;/b&gt; value enables a web browser to download the file as an attachment.&lt;br&gt; &lt;b&gt;false&lt;/b&gt; means that a web browser may preview the file in a new tab or window, but not download the file. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getProjectReleaseUsingGET"></a>
# **getProjectReleaseUsingGET**
> ListResponseContentOfRelease getProjectReleaseUsingGET(projectId, maxItems, skipCount, sort, version, showAllVersions)

Get releases of a project

Get metadata information for a specific version of a project.

### Example
```java
// Import classes:
//import com.alfresco.activiti.modeling.ApiException;
//import com.alfresco.activiti.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | The id of the project to get the releases
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
String version = "version_example"; // String | The version of the project to get the releases
Boolean showAllVersions = true; // Boolean | Default value is false, and it returns only the latest versions. If it is true, it forces the service to return all versions.
try {
    ListResponseContentOfRelease result = apiInstance.getProjectReleaseUsingGET(projectId, maxItems, skipCount, sort, version, showAllVersions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getProjectReleaseUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project to get the releases |
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]
 **version** | **String**| The version of the project to get the releases | [optional]
 **showAllVersions** | **Boolean**| Default value is false, and it returns only the latest versions. If it is true, it forces the service to return all versions. | [optional]

### Return type

[**ListResponseContentOfRelease**](ListResponseContentOfRelease.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectUsingGET"></a>
# **getProjectUsingGET**
> EntryResponseContentOfProject getProjectUsingGET(projectId)

Get project

### Example
```java
// Import classes:
//import com.alfresco.activiti.modeling.ApiException;
//import com.alfresco.activiti.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | The id of the project to retrieve
try {
    EntryResponseContentOfProject result = apiInstance.getProjectUsingGET(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getProjectUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project to retrieve |

### Return type

[**EntryResponseContentOfProject**](EntryResponseContentOfProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="getProjectsUsingGET"></a>
# **getProjectsUsingGET**
> ListResponseContentOfProject getProjectsUsingGET(maxItems, skipCount, sort, name)

List projects

Get the list of available projects. Minimal information for each project is returned.

### Example
```java
// Import classes:
//import com.alfresco.activiti.modeling.ApiException;
//import com.alfresco.activiti.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
Integer maxItems = 56; // Integer | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
String name = "name_example"; // String | The name or part of the name to filter projects
try {
    ListResponseContentOfProject result = apiInstance.getProjectsUsingGET(maxItems, skipCount, sort, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#getProjectsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxItems** | **Integer**|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]
 **name** | **String**| The name or part of the name to filter projects | [optional]

### Return type

[**ListResponseContentOfProject**](ListResponseContentOfProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json

<a name="importProjectUsingPOST"></a>
# **importProjectUsingPOST**
> EntryResponseContentOfProject importProjectUsingPOST(name)

Import an project as zip file

Allows a zip file to be uploaded containing an project definition and any number of included models.

### Example
```java
// Import classes:
//import com.alfresco.activiti.modeling.ApiException;
//import com.alfresco.activiti.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String name = "name_example"; // String | 
try {
    EntryResponseContentOfProject result = apiInstance.importProjectUsingPOST(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#importProjectUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | [optional]

### Return type

[**EntryResponseContentOfProject**](EntryResponseContentOfProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/hal+json

<a name="releaseProjectUsingPOST"></a>
# **releaseProjectUsingPOST**
> EntryResponseContentOfRelease releaseProjectUsingPOST(projectId)

Create a new release of a project

This will release the project.The new version is based on the version strategy

### Example
```java
// Import classes:
//import com.alfresco.activiti.modeling.ApiException;
//import com.alfresco.activiti.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | The id of the project to release
try {
    EntryResponseContentOfRelease result = apiInstance.releaseProjectUsingPOST(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#releaseProjectUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project to release |

### Return type

[**EntryResponseContentOfRelease**](EntryResponseContentOfRelease.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProjectUsingPUT"></a>
# **updateProjectUsingPUT**
> EntryResponseContentOfProject updateProjectUsingPUT(projectId, body)

Update project details

### Example
```java
// Import classes:
//import com.alfresco.activiti.modeling.ApiException;
//import com.alfresco.activiti.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | The id of the project to update
Project body = new Project(); // Project | 
try {
    EntryResponseContentOfProject result = apiInstance.updateProjectUsingPUT(projectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#updateProjectUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project to update |
 **body** | [**Project**](Project.md)|  | [optional]

### Return type

[**EntryResponseContentOfProject**](EntryResponseContentOfProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/hal+json

<a name="validateProjectUsingGET"></a>
# **validateProjectUsingGET**
> validateProjectUsingGET(projectId)

Validate an project by id

### Example
```java
// Import classes:
//import com.alfresco.activiti.modeling.ApiException;
//import com.alfresco.activiti.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | The id of the project to validate
try {
    apiInstance.validateProjectUsingGET(projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#validateProjectUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**| The id of the project to validate |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

