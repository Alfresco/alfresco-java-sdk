# CloudProcessInstance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appName** | **String** |  |  [optional]
**appVersion** | **String** |  |  [optional]
**businessKey** | **String** |  |  [optional]
**completedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **String** |  |  [optional]
**initiator** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**parentId** | **String** |  |  [optional]
**processDefinitionId** | **String** |  |  [optional]
**processDefinitionKey** | **String** |  |  [optional]
**processDefinitionName** | **String** |  |  [optional]
**processDefinitionVersion** | **Integer** |  |  [optional]
**serviceFullName** | **String** |  |  [optional]
**serviceName** | **String** |  |  [optional]
**serviceType** | **String** |  |  [optional]
**serviceVersion** | **String** |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CANCELLED | &quot;CANCELLED&quot;
COMPLETED | &quot;COMPLETED&quot;
CREATED | &quot;CREATED&quot;
RUNNING | &quot;RUNNING&quot;
SUSPENDED | &quot;SUSPENDED&quot;
