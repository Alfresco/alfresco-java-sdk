
# RequestDefaults

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**textAttributes** | **List&lt;String&gt;** | A list of query fields/properties used to expand TEXT: queries. The default is cm:content. You could include all content properties using d:content or list all individual content properties or types. As more terms are included the query size, complexity, memory impact and query time will increase.  |  [optional]
**defaultFTSOperator** | [**DefaultFTSOperatorEnum**](#DefaultFTSOperatorEnum) | The default way to combine query parts when AND or OR is not explicitly stated - includes ! - + one two three (one two three)  |  [optional]
**defaultFTSFieldOperator** | [**DefaultFTSFieldOperatorEnum**](#DefaultFTSFieldOperatorEnum) | The default way to combine query parts in field query groups when AND or OR is not explicitly stated - includes ! - + FIELD:(one two three)  |  [optional]
**namespace** | **String** | The default name space to use if one is not provided |  [optional]
**defaultFieldName** | **String** |  |  [optional]


<a name="DefaultFTSOperatorEnum"></a>
## Enum: DefaultFTSOperatorEnum
Name | Value
---- | -----
AND | &quot;AND&quot;
OR | &quot;OR&quot;


<a name="DefaultFTSFieldOperatorEnum"></a>
## Enum: DefaultFTSFieldOperatorEnum
Name | Value
---- | -----
AND | &quot;AND&quot;
OR | &quot;OR&quot;



