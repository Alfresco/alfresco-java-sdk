
# CloudIntegrationContext

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appName** | **String** |  |  [optional]
**appVersion** | **String** |  |  [optional]
**businessKey** | **String** |  |  [optional]
**clientId** | **String** |  |  [optional]
**clientName** | **String** |  |  [optional]
**clientType** | **String** |  |  [optional]
**connectorType** | **String** |  |  [optional]
**errorClassName** | **String** |  |  [optional]
**errorCode** | **String** |  |  [optional]
**errorDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**errorMessage** | **String** |  |  [optional]
**executionId** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**inBoundVariables** | **Object** |  |  [optional]
**outBoundVariables** | **Object** |  |  [optional]
**parentProcessInstanceId** | **String** |  |  [optional]
**processDefinitionId** | **String** |  |  [optional]
**processDefinitionKey** | **String** |  |  [optional]
**processDefinitionVersion** | **Integer** |  |  [optional]
**processInstanceId** | **String** |  |  [optional]
**requestDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**resultDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**rootProcessInstanceId** | **String** |  |  [optional]
**serviceFullName** | **String** |  |  [optional]
**serviceName** | **String** |  |  [optional]
**serviceType** | **String** |  |  [optional]
**serviceVersion** | **String** |  |  [optional]
**stackTraceElements** | [**List&lt;StackTraceElement&gt;**](StackTraceElement.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ERROR_RECEIVED | &quot;INTEGRATION_ERROR_RECEIVED&quot;
REQUESTED | &quot;INTEGRATION_REQUESTED&quot;
RESULT_RECEIVED | &quot;INTEGRATION_RESULT_RECEIVED&quot;



