# DeploymentControllerApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApplicationUsingPOST**](DeploymentControllerApi.md#createApplicationUsingPOST) | **POST** /deployment-service/v1/applications | Add a new application.
[**deleteApplicationUsingDELETE**](DeploymentControllerApi.md#deleteApplicationUsingDELETE) | **DELETE** /deployment-service/v1/applications/{id} | Delete an existing application by id.
[**getApplicationRuntimeVersionUsingGET**](DeploymentControllerApi.md#getApplicationRuntimeVersionUsingGET) | **GET** /deployment-service/v1/applications/{id}/runtime-version | Retrieve the application runtime version by id.
[**getApplicationUsingGET**](DeploymentControllerApi.md#getApplicationUsingGET) | **GET** /deployment-service/v1/applications/{id} | Find application by id.
[**getApplicationsUsingGET**](DeploymentControllerApi.md#getApplicationsUsingGET) | **GET** /deployment-service/v1/applications | Find applications. It allows filtering. This service will return all applications if the user has ACTIVITI_DEVOPS role otherwise it returns only applications belonging to the user.
[**getGroupsUsingGET**](DeploymentControllerApi.md#getGroupsUsingGET) | **GET** /deployment-service/v1/applications/{id}/groups | Fetch all groups belonging to an application.
[**getLatestRuntimeVersionUsingGET**](DeploymentControllerApi.md#getLatestRuntimeVersionUsingGET) | **GET** /deployment-service/v1/applications/runtime-versions/latest | Retrieve the latest runtime version available in the deployment service.
[**getRuntimeVersionsUsingGET**](DeploymentControllerApi.md#getRuntimeVersionsUsingGET) | **GET** /deployment-service/v1/applications/runtime-versions | Retrieve a list of runtime versions available in the deployment service.
[**getUsersUsingGET**](DeploymentControllerApi.md#getUsersUsingGET) | **GET** /deployment-service/v1/applications/{id}/users | Fetch all users belonging to an application.
[**retrieveServiceLogsUsingGET**](DeploymentControllerApi.md#retrieveServiceLogsUsingGET) | **GET** /deployment-service/v1/applications/{id}/logs/{serviceName} | retrieveServiceLogs
[**updateApplicationRuntimeVersionUsingPOST**](DeploymentControllerApi.md#updateApplicationRuntimeVersionUsingPOST) | **POST** /deployment-service/v1/applications/{id}/update | Updates the application runtime version to the selected one.
[**upgradeApplicationUsingPUT**](DeploymentControllerApi.md#upgradeApplicationUsingPUT) | **PUT** /deployment-service/v1/applications/{id} | Update an existing application by id.

<a name="createApplicationUsingPOST"></a>
# **createApplicationUsingPOST**
> createApplicationUsingPOST(body)

Add a new application.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
ApplicationRepresentation body = new ApplicationRepresentation(); // ApplicationRepresentation | applicationRepresentation
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
 **body** | [**ApplicationRepresentation**](ApplicationRepresentation.md)| applicationRepresentation |

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
> ListResponseContentApplicationResponseRepresentation getApplicationsUsingGET(createdDateFrom, createdDateTo, maxItems, name, roles, skipCount, sort, status)

Find applications. It allows filtering. This service will return all applications if the user has ACTIVITI_DEVOPS role otherwise it returns only applications belonging to the user.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
LocalDate createdDateFrom = new LocalDate(); // LocalDate | Date used as start interval in search by creation date. Allowed formats: yyyy-MM-dd or yyyy-MM-ddTHH:mm:ss or yyyy-MM-ddTHH:mm:ss.SSS.
LocalDate createdDateTo = new LocalDate(); // LocalDate | Date used as end interval in search by creation date. Allowed formats: yyyy-MM-dd or yyyy-MM-ddTHH:mm:ss or yyyy-MM-ddTHH:mm:ss.SSS.
Integer maxItems = 56; // Integer | 
String name = "name_example"; // String | Filter on application name, showing all applications that contains the search key.
List<String> roles = Arrays.asList("roles_example"); // List<String> | Roles that user must have on the application.
Integer skipCount = 56; // Integer | 
String sort = "sort_example"; // String | 
String status = "status_example"; // String | Application status
try {
    ListResponseContentApplicationResponseRepresentation result = apiInstance.getApplicationsUsingGET(createdDateFrom, createdDateTo, maxItems, name, roles, skipCount, sort, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#getApplicationsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdDateFrom** | **LocalDate**| Date used as start interval in search by creation date. Allowed formats: yyyy-MM-dd or yyyy-MM-ddTHH:mm:ss or yyyy-MM-ddTHH:mm:ss.SSS. | [optional]
 **createdDateTo** | **LocalDate**| Date used as end interval in search by creation date. Allowed formats: yyyy-MM-dd or yyyy-MM-ddTHH:mm:ss or yyyy-MM-ddTHH:mm:ss.SSS. | [optional]
 **maxItems** | **Integer**|  | [optional]
 **name** | **String**| Filter on application name, showing all applications that contains the search key. | [optional]
 **roles** | [**List&lt;String&gt;**](String.md)| Roles that user must have on the application. | [optional]
 **skipCount** | **Integer**|  | [optional]
 **sort** | **String**|  | [optional]
 **status** | **String**| Application status | [optional] [enum: CREATE_APP, CREATE_DESCRIPTOR, DEPLOY_STARTED, DEPLOY_STARTED_FAILED, DESCRIPTOR_CREATED, IMAGE_BUILD, IMAGE_BUILD_FAILED, IMAGE_PUSH, IMAGE_PUSH_FAILED, NOT_DEPLOYED, PENDING, RUNNING, UNKNOWN, UPDATE_APP, WAITING_FOR_DESCRIPTOR]

### Return type

[**ListResponseContentApplicationResponseRepresentation**](ListResponseContentApplicationResponseRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupsUsingGET"></a>
# **getGroupsUsingGET**
> List&lt;String&gt; getGroupsUsingGET(id, name, roles)

Fetch all groups belonging to an application.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
String id = "id_example"; // String | ID of application
String name = "name_example"; // String | Filter on group name, showing all groups that contains the search key
List<String> roles = Arrays.asList("roles_example"); // List<String> | Roles that user must have on the application.
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
 **roles** | [**List&lt;String&gt;**](String.md)| Roles that user must have on the application. | [optional]

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
> List&lt;String&gt; getUsersUsingGET(id, excludeServiceClients, group, name, roles)

Fetch all users belonging to an application.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
String id = "id_example"; // String | ID of application
Boolean excludeServiceClients = false; // Boolean | If the value is 'true' the service will return only users belonging to the application. Otherwise user and service clients belonging to the application will be returned.
Boolean group = false; // Boolean | If the value is 'true' the service will return users belonging to the application, directly or via groups. Otherwise only users directly belonging to the application will be returned.
String name = "name_example"; // String | Filter on username, showing all users that contains the search key
List<String> roles = Arrays.asList("roles_example"); // List<String> | Roles that user must have on the application.
try {
    List<String> result = apiInstance.getUsersUsingGET(id, excludeServiceClients, group, name, roles);
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
 **excludeServiceClients** | **Boolean**| If the value is &#x27;true&#x27; the service will return only users belonging to the application. Otherwise user and service clients belonging to the application will be returned. | [optional] [default to false]
 **group** | **Boolean**| If the value is &#x27;true&#x27; the service will return users belonging to the application, directly or via groups. Otherwise only users directly belonging to the application will be returned. | [optional] [default to false]
 **name** | **String**| Filter on username, showing all users that contains the search key | [optional]
 **roles** | [**List&lt;String&gt;**](String.md)| Roles that user must have on the application. | [optional]

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
> upgradeApplicationUsingPUT(body, id)

Update an existing application by id.

### Example
```java
// Import classes:
//import com.alfresco.activiti.deployment.ApiException;
//import com.alfresco.activiti.deployment.handler.DeploymentControllerApi;


DeploymentControllerApi apiInstance = new DeploymentControllerApi();
ApplicationPutRequestRepresentation body = new ApplicationPutRequestRepresentation(); // ApplicationPutRequestRepresentation | applicationPutRequestRepresentation
String id = "id_example"; // String | ID of application to update
try {
    apiInstance.upgradeApplicationUsingPUT(body, id);
} catch (ApiException e) {
    System.err.println("Exception when calling DeploymentControllerApi#upgradeApplicationUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationPutRequestRepresentation**](ApplicationPutRequestRepresentation.md)| applicationPutRequestRepresentation |
 **id** | **String**| ID of application to update |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

