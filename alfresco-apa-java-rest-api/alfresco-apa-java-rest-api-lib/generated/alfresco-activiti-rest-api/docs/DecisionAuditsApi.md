# DecisionAuditsApi

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuditTrailUsingGET**](DecisionAuditsApi.md#getAuditTrailUsingGET) | **GET** /activiti-app/api/enterprise/decisions/audits/{auditTrailId} | Get an audit trail
[**getAuditTrailsUsingGET**](DecisionAuditsApi.md#getAuditTrailsUsingGET) | **GET** /activiti-app/api/enterprise/decisions/audits | Query decision table audit trails

<a name="getAuditTrailUsingGET"></a>
# **getAuditTrailUsingGET**
> DecisionAuditRepresentation getAuditTrailUsingGET(auditTrailId)

Get an audit trail

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DecisionAuditsApi;







DecisionAuditsApi apiInstance = new DecisionAuditsApi();
Long auditTrailId = 789L; // Long | auditTrailId
try {
    DecisionAuditRepresentation result = apiInstance.getAuditTrailUsingGET(auditTrailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionAuditsApi#getAuditTrailUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditTrailId** | **Long**| auditTrailId |

### Return type

[**DecisionAuditRepresentation**](DecisionAuditRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAuditTrailsUsingGET"></a>
# **getAuditTrailsUsingGET**
> ResultListDataRepresentationDecisionAuditRepresentation getAuditTrailsUsingGET(decisionKey, dmnDeploymentId)

Query decision table audit trails

### Example
```java
// Import classes:
//import org.alfresco.activiti.ApiClient;
//import org.alfresco.activiti.ApiException;
//import org.alfresco.activiti.Configuration;
//import org.alfresco.activiti.auth.*;
//import org.alfresco.activiti.handler.DecisionAuditsApi;







DecisionAuditsApi apiInstance = new DecisionAuditsApi();
String decisionKey = "decisionKey_example"; // String | decisionKey
Long dmnDeploymentId = 789L; // Long | dmnDeploymentId
try {
    ResultListDataRepresentationDecisionAuditRepresentation result = apiInstance.getAuditTrailsUsingGET(decisionKey, dmnDeploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DecisionAuditsApi#getAuditTrailsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **decisionKey** | **String**| decisionKey |
 **dmnDeploymentId** | **Long**| dmnDeploymentId |

### Return type

[**ResultListDataRepresentationDecisionAuditRepresentation**](ResultListDataRepresentationDecisionAuditRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

