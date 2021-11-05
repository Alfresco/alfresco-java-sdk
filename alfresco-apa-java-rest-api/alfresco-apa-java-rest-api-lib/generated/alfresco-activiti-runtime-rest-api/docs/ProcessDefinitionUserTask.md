# ProcessDefinitionUserTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cachable** | **Boolean** |  |  [optional]
**delegatee** | [**JsonDeserializerOfobject**](JsonDeserializerOfobject.md) |  |  [optional]
**emptyAccessPattern** | [**EmptyAccessPatternEnum**](#EmptyAccessPatternEnum) |  |  [optional]
**emptyValue** | **Object** |  |  [optional]
**knownPropertyNames** | **List&lt;Object&gt;** |  |  [optional]
**nullAccessPattern** | [**NullAccessPatternEnum**](#NullAccessPatternEnum) |  |  [optional]
**nullValue** | [**List&lt;ProcessDefinitionUserTask&gt;**](ProcessDefinitionUserTask.md) |  |  [optional]
**objectIdReader** | [**ObjectIdReader**](ObjectIdReader.md) |  |  [optional]
**taskDocumentation** | **String** |  |  [optional]
**taskName** | **String** |  |  [optional]

<a name="EmptyAccessPatternEnum"></a>
## Enum: EmptyAccessPatternEnum
Name | Value
---- | -----
ALWAYS_NULL | &quot;ALWAYS_NULL&quot;
CONSTANT | &quot;CONSTANT&quot;
DYNAMIC | &quot;DYNAMIC&quot;

<a name="NullAccessPatternEnum"></a>
## Enum: NullAccessPatternEnum
Name | Value
---- | -----
ALWAYS_NULL | &quot;ALWAYS_NULL&quot;
CONSTANT | &quot;CONSTANT&quot;
DYNAMIC | &quot;DYNAMIC&quot;
