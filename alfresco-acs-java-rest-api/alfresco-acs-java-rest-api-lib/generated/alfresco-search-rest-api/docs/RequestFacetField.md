
# RequestFacetField

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | The facet field |  [optional]
**label** | **String** | A label to include in place of the facet field |  [optional]
**prefix** | **String** | Restricts the possible constraints to only indexed values with a specified prefix. |  [optional]
**sort** | [**SortEnum**](#SortEnum) |  |  [optional]
**method** | [**MethodEnum**](#MethodEnum) |  |  [optional]
**missing** | **Boolean** | When true, count results that match the query but which have no facet value for the field (in addition to the Term-based constraints). |  [optional]
**limit** | **Integer** |  |  [optional]
**offset** | **Integer** |  |  [optional]
**mincount** | **Integer** | The minimum count required for a facet field to be included in the response. |  [optional]
**facetEnumCacheMinDf** | **Integer** |  |  [optional]
**excludeFilters** | **List&lt;String&gt;** | Filter Queries with tags listed here will not be included in facet counts. This is used for multi-select facetting.  |  [optional]


<a name="SortEnum"></a>
## Enum: SortEnum
Name | Value
---- | -----
COUNT | &quot;COUNT&quot;
INDEX | &quot;INDEX&quot;


<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
ENUM | &quot;ENUM&quot;
FC | &quot;FC&quot;



