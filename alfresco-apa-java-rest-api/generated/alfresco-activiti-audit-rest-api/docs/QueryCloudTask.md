
# QueryCloudTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appName** | **String** |  |  [optional]
**appVersion** | **String** |  |  [optional]
**assignee** | **String** |  |  [optional]
**businessKey** | **String** |  |  [optional]
**candidateGroups** | **List&lt;String&gt;** |  |  [optional]
**candidateUsers** | **List&lt;String&gt;** |  |  [optional]
**claimedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**completedBy** | **String** |  |  [optional]
**completedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**description** | **String** |  |  [optional]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**duration** | **Long** |  |  [optional]
**formKey** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**owner** | **String** |  |  [optional]
**parentTaskId** | **String** |  |  [optional]
**priority** | **Integer** |  |  [optional]
**processDefinitionId** | **String** |  |  [optional]
**processDefinitionName** | **String** |  |  [optional]
**processDefinitionVersion** | **Integer** |  |  [optional]
**processInstanceId** | **String** |  |  [optional]
**serviceFullName** | **String** |  |  [optional]
**serviceName** | **String** |  |  [optional]
**serviceType** | **String** |  |  [optional]
**serviceVersion** | **String** |  |  [optional]
**standalone** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**taskDefinitionKey** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ASSIGNED | &quot;ASSIGNED&quot;
CANCELLED | &quot;CANCELLED&quot;
COMPLETED | &quot;COMPLETED&quot;
CREATED | &quot;CREATED&quot;
DELETED | &quot;DELETED&quot;
SUSPENDED | &quot;SUSPENDED&quot;



