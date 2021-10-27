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
> EntryResponseContentProject copyProjectUsingPOST(name, projectId)

Copy an project as a new project with chosen name

This will create a new project with chosen name containing the project folder and all related models.&lt;br&gt;

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String name = "name_example"; // String | The name of the project that will replace the original name of the project
String projectId = "projectId_example"; // String | The id of the project to copy
try {
    EntryResponseContentProject result = apiInstance.copyProjectUsingPOST(name, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#copyProjectUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the project that will replace the original name of the project |
 **projectId** | **String**| The id of the project to copy |

### Return type

[**EntryResponseContentProject**](EntryResponseContentProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="createProjectFromExampleUsingPOST"></a>
# **createProjectFromExampleUsingPOST**
> EntryResponseContentProject createProjectFromExampleUsingPOST(exampleProjectId, name)

Create an project from example

This will download an example project (zip) and create a new project with chosen name

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String exampleProjectId = "exampleProjectId_example"; // String | The example project id of the source example project
String name = "name_example"; // String | The name for the new project created from an example project
try {
    EntryResponseContentProject result = apiInstance.createProjectFromExampleUsingPOST(exampleProjectId, name);
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

[**EntryResponseContentProject**](EntryResponseContentProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="createProjectUsingPOST"></a>
# **createProjectUsingPOST**
> EntryResponseContentProject createProjectUsingPOST(body)

Create new project

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
Project body = new Project(); // Project | The details of the project to create
try {
    EntryResponseContentProject result = apiInstance.createProjectUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#createProjectUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)| The details of the project to create |

### Return type

[**EntryResponseContentProject**](EntryResponseContentProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="deleteProjectUsingDELETE"></a>
# **deleteProjectUsingDELETE**
> deleteProjectUsingDELETE(projectId)

Delete project

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ProjectsApi;


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
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ProjectsApi;


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
 **attachment** | **Boolean**| &lt;b&gt;true&lt;/b&gt; value enables a web browser to download the file as an attachment.&lt;br&gt; &lt;b&gt;false&lt;/b&gt; means that a web browser may preview the file in a new tab or window, but not download the file. | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getProjectReleaseUsingGET"></a>
# **getProjectReleaseUsingGET**
> ListResponseContentRelease getProjectReleaseUsingGET(projectId, maxItems, showAllVersions, skipCount, sort, version)

Get releases of a project

Get metadata information for a specific version of a project.

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | The id of the project to get the releases
Integer maxItems = 56; // Integer | 
Boolean showAllVersions = true; // Boolean | Default value is false, and it returns only the latest versions. If it is true, it forces the service to return all versions.
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
String version = "version_example"; // String | The version of the project to get the releases
try {
    ListResponseContentRelease result = apiInstance.getProjectReleaseUsingGET(projectId, maxItems, showAllVersions, skipCount, sort, version);
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
 **showAllVersions** | **Boolean**| Default value is false, and it returns only the latest versions. If it is true, it forces the service to return all versions. | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]
 **version** | **String**| The version of the project to get the releases | [optional]

### Return type

[**ListResponseContentRelease**](ListResponseContentRelease.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjectUsingGET"></a>
# **getProjectUsingGET**
> EntryResponseContentProject getProjectUsingGET(projectId)

Get project

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | The id of the project to retrieve
try {
    EntryResponseContentProject result = apiInstance.getProjectUsingGET(projectId);
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

[**EntryResponseContentProject**](EntryResponseContentProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="getProjectsUsingGET"></a>
# **getProjectsUsingGET**
> ListResponseContentProject getProjectsUsingGET(maxItems, name, skipCount, sort)

List projects

Get the list of available projects. Minimal information for each project is returned.

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
Integer maxItems = 56; // Integer | 
String name = "name_example"; // String | The name or part of the name to filter projects
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
try {
    ListResponseContentProject result = apiInstance.getProjectsUsingGET(maxItems, name, skipCount, sort);
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
 **name** | **String**| The name or part of the name to filter projects | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]

### Return type

[**ListResponseContentProject**](ListResponseContentProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json

<a name="importProjectUsingPOST"></a>
# **importProjectUsingPOST**
> EntryResponseContentProject importProjectUsingPOST(name)

Import an project as zip file

Allows a zip file to be uploaded containing an project definition and any number of included models.

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String name = "name_example"; // String | 
try {
    EntryResponseContentProject result = apiInstance.importProjectUsingPOST(name);
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

[**EntryResponseContentProject**](EntryResponseContentProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/hal+json, application/json

<a name="releaseProjectUsingPOST"></a>
# **releaseProjectUsingPOST**
> EntryResponseContentRelease releaseProjectUsingPOST(projectId)

Create a new release of a project

This will release the project.The new version is based on the version strategy

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
String projectId = "projectId_example"; // String | The id of the project to release
try {
    EntryResponseContentRelease result = apiInstance.releaseProjectUsingPOST(projectId);
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

[**EntryResponseContentRelease**](EntryResponseContentRelease.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProjectUsingPUT"></a>
# **updateProjectUsingPUT**
> EntryResponseContentProject updateProjectUsingPUT(body, projectId)

Update project details

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ProjectsApi;


ProjectsApi apiInstance = new ProjectsApi();
Project body = new Project(); // Project | The new values to update
String projectId = "projectId_example"; // String | The id of the project to update
try {
    EntryResponseContentProject result = apiInstance.updateProjectUsingPUT(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectsApi#updateProjectUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)| The new values to update |
 **projectId** | **String**| The id of the project to update |

### Return type

[**EntryResponseContentProject**](EntryResponseContentProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json

<a name="validateProjectUsingGET"></a>
# **validateProjectUsingGET**
> validateProjectUsingGET(projectId)

Validate an project by id

### Example
```java
// Import classes:
//import com.alfresco.activiti.script.modeling.ApiException;
//import com.alfresco.activiti.script.modeling.handler.ProjectsApi;


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

