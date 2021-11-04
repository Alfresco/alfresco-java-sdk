# ProcessDefinitionVariable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cachable** | **Boolean** |  |  [optional]
**delegatee** | [**JsonDeserializerOfobject**](JsonDeserializerOfobject.md) |  |  [optional]
**emptyAccessPattern** | [**EmptyAccessPatternEnum**](#EmptyAccessPatternEnum) |  |  [optional]
**emptyValue** | **Object** |  |  [optional]
**knownPropertyNames** | **List&lt;Object&gt;** |  |  [optional]
**nullAccessPattern** | [**NullAccessPatternEnum**](#NullAccessPatternEnum) |  |  [optional]
**nullValue** | [**List&lt;ProcessDefinitionVariable&gt;**](ProcessDefinitionVariable.md) |  |  [optional]
**objectIdReader** | [**ObjectIdReader**](ObjectIdReader.md) |  |  [optional]
**variableName** | **String** |  |  [optional]
**variableType** | **String** |  |  [optional]

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
