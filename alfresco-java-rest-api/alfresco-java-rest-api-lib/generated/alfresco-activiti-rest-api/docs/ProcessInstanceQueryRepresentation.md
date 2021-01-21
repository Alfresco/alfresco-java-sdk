
# ProcessInstanceQueryRepresentation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appDefinitionId** | **Long** |  |  [optional]
**page** | **Integer** |  |  [optional]
**processDefinitionId** | **String** |  |  [optional]
**processInstanceId** | **String** |  |  [optional]
**size** | **Integer** |  |  [optional]
**sort** | [**SortEnum**](#SortEnum) |  |  [optional]
**start** | **Integer** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]


<a name="SortEnum"></a>
## Enum: SortEnum
Name | Value
---- | -----
CREATED_DESC | &quot;created-desc&quot;
CREATED_ASC | &quot;created-asc&quot;
ENDED_DESC | &quot;ended-desc&quot;
ENDED_ASC | &quot;ended-asc&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RUNNING | &quot;running&quot;
COMPLETED | &quot;completed&quot;
ALL | &quot;all&quot;



