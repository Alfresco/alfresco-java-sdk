# JsonDeserializerobject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cachable** | **Boolean** |  |  [optional]
**delegatee** | [**JsonDeserializerobject**](JsonDeserializerobject.md) |  |  [optional]
**emptyAccessPattern** | [**EmptyAccessPatternEnum**](#EmptyAccessPatternEnum) |  |  [optional]
**emptyValue** | **Object** |  |  [optional]
**knownPropertyNames** | **List&lt;Object&gt;** |  |  [optional]
**nullAccessPattern** | [**NullAccessPatternEnum**](#NullAccessPatternEnum) |  |  [optional]
**nullValue** | **Object** |  |  [optional]
**objectIdReader** | [**ObjectIdReader**](ObjectIdReader.md) |  |  [optional]

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
