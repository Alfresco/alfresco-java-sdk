# TaskQueryRepresentation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appDefinitionId** | **Long** |  |  [optional]
**assignment** | **String** |  |  [optional]
**dueAfter** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dueBefore** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**includeProcessInstance** | **Boolean** |  |  [optional]
**includeProcessVariables** | **Boolean** |  |  [optional]
**includeTaskLocalVariables** | **Boolean** |  |  [optional]
**page** | **Integer** |  |  [optional]
**processDefinitionId** | **String** |  |  [optional]
**processInstanceId** | **String** |  |  [optional]
**size** | **Integer** |  |  [optional]
**sort** | [**SortEnum**](#SortEnum) |  |  [optional]
**start** | **Integer** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**taskId** | **String** |  |  [optional]
**text** | **String** |  |  [optional]

<a name="SortEnum"></a>
## Enum: SortEnum
Name | Value
---- | -----
CREATED_ASC | &quot;created-asc&quot;
CREATED_DESC | &quot;created-desc&quot;
DUE_ASC | &quot;due-asc&quot;
DUE_DESC | &quot;due-desc&quot;

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
ALL | &quot;all&quot;
COMPLETED | &quot;completed&quot;
