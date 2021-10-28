# DeploymentControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApplicationUsingPOST**](DeploymentControllerApi.md#createApplicationUsingPOST) | **POST** /v1/applications | createApplication
[**deleteApplicationUsingDELETE**](DeploymentControllerApi.md#deleteApplicationUsingDELETE) | **DELETE** /v1/applications/{id} | deleteApplication
[**getApplicationRuntimeVersionUsingGET**](DeploymentControllerApi.md#getApplicationRuntimeVersionUsingGET) | **GET** /v1/applications/{id}/runtime-version | getApplicationRuntimeVersion
[**getApplicationUsingGET**](DeploymentControllerApi.md#getApplicationUsingGET) | **GET** /v1/applications/{id} | getApplication
[**getApplicationsUsingGET**](DeploymentControllerApi.md#getApplicationsUsingGET) | **GET** /v1/applications | getApplications
[**getGroupsUsingGET**](DeploymentControllerApi.md#getGroupsUsingGET) | **GET** /v1/applications/{id}/groups | getGroups
[**getLatestRuntimeVersionUsingGET**](DeploymentControllerApi.md#getLatestRuntimeVersionUsingGET) | **GET** /v1/applications/runtime-versions/latest | getLatestRuntimeVersion
[**getRuntimeVersionsUsingGET**](DeploymentControllerApi.md#getRuntimeVersionsUsingGET) | **GET** /v1/applications/runtime-versions | getRuntimeVersions
[**getUsersUsingGET**](DeploymentControllerApi.md#getUsersUsingGET) | **GET** /v1/applications/{id}/users | getUsers
[**retrieveServiceLogsUsingGET**](DeploymentControllerApi.md#retrieveServiceLogsUsingGET) | **GET** /v1/applications/{id}/logs/{serviceName} | retrieveServiceLogs
[**updateApplicationRuntimeVersionUsingPOST**](DeploymentControllerApi.md#updateApplicationRuntimeVersionUsingPOST) | **POST** /v1/applications/{id}/update | updateApplicationRuntimeVersion
[**upgradeApplicationUsingPUT**](DeploymentControllerApi.md#upgradeApplicationUsingPUT) | **PUT** /v1/applications/{id} | upgradeApplication

<a name="createApplicationUsingPOST"></a>
# **createApplicationUsingPOST**
> createApplicationUsingPOST(body)

createApplication

Add a new application.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
ApplicationRepresentation body = new ApplicationRepresentation(); // ApplicationRepresentation | 
try {
    apiInstance.createApplicationUsingPOST(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#createApplicationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationRepresentation**](ApplicationRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteApplicationUsingDELETE"></a>
# **deleteApplicationUsingDELETE**
> deleteApplicationUsingDELETE(id)

deleteApplication

Delete an existing application by id.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
String id = "id_example"; // String | ID of application to delete
try {
    apiInstance.deleteApplicationUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#deleteApplicationUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of application to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getApplicationRuntimeVersionUsingGET"></a>
# **getApplicationRuntimeVersionUsingGET**
> RuntimeVersionRepresentation getApplicationRuntimeVersionUsingGET(id)

getApplicationRuntimeVersion

Retrieve the application runtime version by id.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
String id = "id_example"; // String | ID of application which runtime version is queried
try {
    RuntimeVersionRepresentation result = apiInstance.getApplicationRuntimeVersionUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#getApplicationRuntimeVersionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of application which runtime version is queried |

### Return type

[**RuntimeVersionRepresentation**](RuntimeVersionRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApplicationUsingGET"></a>
# **getApplicationUsingGET**
> ApplicationResponseRepresentation getApplicationUsingGET(id)

getApplication

Find application by id.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
String id = "id_example"; // String | ID of application to return
try {
    ApplicationResponseRepresentation result = apiInstance.getApplicationUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#getApplicationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of application to return |

### Return type

[**ApplicationResponseRepresentation**](ApplicationResponseRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApplicationsUsingGET"></a>
# **getApplicationsUsingGET**
> ListResponseContentOfApplicationResponseRepresentation getApplicationsUsingGET(authorization, createdDateFrom, createdDateTo, maxItems, name, roles, skipCount, sort, status)

getApplications

Find applications. It allows filtering. This service will return all applications if the user has ACTIVITI_DEVOPS role otherwise it returns only applications belonging to the user.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
String authorization = "authorization_example"; // String | Authorization
LocalDate createdDateFrom = new LocalDate(); // LocalDate | 
LocalDate createdDateTo = new LocalDate(); // LocalDate | 
Integer maxItems = 56; // Integer | 
String name = "name_example"; // String | 
List<String> roles = Arrays.asList("roles_example"); // List<String> | 
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
String status = "status_example"; // String | 
try {
    ListResponseContentOfApplicationResponseRepresentation result = apiInstance.getApplicationsUsingGET(authorization, createdDateFrom, createdDateTo, maxItems, name, roles, skipCount, sort, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#getApplicationsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization |
 **createdDateFrom** | **LocalDate**|  | [optional]
 **createdDateTo** | **LocalDate**|  | [optional]
 **maxItems** | **Integer**|  | [optional]
 **name** | **String**|  | [optional]
 **roles** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]
 **status** | **String**|  | [optional] [enum: CREATE_APP, CREATE_DESCRIPTOR, DEPLOY_STARTED, DEPLOY_STARTED_FAILED, DESCRIPTOR_CREATED, IMAGE_BUILD, IMAGE_BUILD_FAILED, IMAGE_PUSH, IMAGE_PUSH_FAILED, NOT_DEPLOYED, PENDING, RUNNING, UNKNOWN, UPDATE_APP, WAITING_FOR_DESCRIPTOR]

### Return type

[**ListResponseContentOfApplicationResponseRepresentation**](ListResponseContentOfApplicationResponseRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupsUsingGET"></a>
# **getGroupsUsingGET**
> List&lt;String&gt; getGroupsUsingGET(id, name, roles)

getGroups

Fetch all groups belonging to an application.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
String id = "id_example"; // String | ID of application
String name = "name_example"; // String | Filter on group name, showing all groups that contains the search key
String roles = "roles_example"; // String | Roles that user must have on the application.
try {
    List<String> result = apiInstance.getGroupsUsingGET(id, name, roles);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#getGroupsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of application |
 **name** | **String**| Filter on group name, showing all groups that contains the search key | [optional]
 **roles** | **String**| Roles that user must have on the application. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLatestRuntimeVersionUsingGET"></a>
# **getLatestRuntimeVersionUsingGET**
> RuntimeVersionRepresentation getLatestRuntimeVersionUsingGET()

getLatestRuntimeVersion

Retrieve the latest runtime version available in the deployment service.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
try {
    RuntimeVersionRepresentation result = apiInstance.getLatestRuntimeVersionUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#getLatestRuntimeVersionUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RuntimeVersionRepresentation**](RuntimeVersionRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRuntimeVersionsUsingGET"></a>
# **getRuntimeVersionsUsingGET**
> List&lt;RuntimeVersionRepresentation&gt; getRuntimeVersionsUsingGET(versionEqualOrLater)

getRuntimeVersions

Retrieve a list of runtime versions available in the deployment service.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
String versionEqualOrLater = "versionEqualOrLater_example"; // String | versionEqualOrLater
try {
    List<RuntimeVersionRepresentation> result = apiInstance.getRuntimeVersionsUsingGET(versionEqualOrLater);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#getRuntimeVersionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **versionEqualOrLater** | **String**| versionEqualOrLater | [optional]

### Return type

[**List&lt;RuntimeVersionRepresentation&gt;**](RuntimeVersionRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsersUsingGET"></a>
# **getUsersUsingGET**
> List&lt;String&gt; getUsersUsingGET(id, name, group, roles, excludeServiceClients)

getUsers

Fetch all users belonging to an application.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
String id = "id_example"; // String | ID of application
String name = "name_example"; // String | Filter on username, showing all users that contains the search key
Boolean group = true; // Boolean | If the value is 'true' the service will return users belonging to the application, directly or via groups. Otherwise only users directly belonging to the application will be returned.
String roles = "roles_example"; // String | Roles that user must have on the application.
Boolean excludeServiceClients = true; // Boolean | If the value is 'true' the service will return only users belonging to the application. Otherwise user and service clients belonging to the application will be returned.
try {
    List<String> result = apiInstance.getUsersUsingGET(id, name, group, roles, excludeServiceClients);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#getUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of application |
 **name** | **String**| Filter on username, showing all users that contains the search key | [optional]
 **group** | **Boolean**| If the value is &#x27;true&#x27; the service will return users belonging to the application, directly or via groups. Otherwise only users directly belonging to the application will be returned. | [optional]
 **roles** | **String**| Roles that user must have on the application. | [optional]
 **excludeServiceClients** | **Boolean**| If the value is &#x27;true&#x27; the service will return only users belonging to the application. Otherwise user and service clients belonging to the application will be returned. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="retrieveServiceLogsUsingGET"></a>
# **retrieveServiceLogsUsingGET**
> ApplicationLog retrieveServiceLogsUsingGET(id, serviceName)

retrieveServiceLogs

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
String id = "id_example"; // String | ID of application to get logs from
String serviceName = "serviceName_example"; // String | Name of the service to get logs from
try {
    ApplicationLog result = apiInstance.retrieveServiceLogsUsingGET(id, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#retrieveServiceLogsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of application to get logs from |
 **serviceName** | **String**| Name of the service to get logs from |

### Return type

[**ApplicationLog**](ApplicationLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateApplicationRuntimeVersionUsingPOST"></a>
# **updateApplicationRuntimeVersionUsingPOST**
> ApplicationResponseRepresentation updateApplicationRuntimeVersionUsingPOST(id, runtimeVersion)

updateApplicationRuntimeVersion

Updates the application runtime version to the selected one.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
String id = "id_example"; // String | ID of application which runtime version is updated
String runtimeVersion = "runtimeVersion_example"; // String | runtimeVersion
try {
    ApplicationResponseRepresentation result = apiInstance.updateApplicationRuntimeVersionUsingPOST(id, runtimeVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#updateApplicationRuntimeVersionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of application which runtime version is updated |
 **runtimeVersion** | **String**| runtimeVersion | [optional]

### Return type

[**ApplicationResponseRepresentation**](ApplicationResponseRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="upgradeApplicationUsingPUT"></a>
# **upgradeApplicationUsingPUT**
> upgradeApplicationUsingPUT(id, body)

upgradeApplication

Update an existing application by id.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
String id = "id_example"; // String | ID of application to update
ApplicationPutRequestRepresentation body = new ApplicationPutRequestRepresentation(); // ApplicationPutRequestRepresentation | 
try {
    apiInstance.upgradeApplicationUsingPUT(id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#upgradeApplicationUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of application to update |
 **body** | [**ApplicationPutRequestRepresentation**](ApplicationPutRequestRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

