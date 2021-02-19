
# RequestSortDefinitionInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | How to order - using a field, when position of the document in the index, score/relevence. |  [optional]
**field** | **String** | The name of the field |  [optional]
**ascending** | **Boolean** | The sort order. (The ordering of nulls is determined by the SOLR configuration) |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FIELD | &quot;FIELD&quot;
DOCUMENT | &quot;DOCUMENT&quot;
SCORE | &quot;SCORE&quot;



