
# ResultSetContext

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consistency** | [**ResponseConsistency**](ResponseConsistency.md) |  |  [optional]
**request** | [**SearchRequest**](SearchRequest.md) |  |  [optional]
**facetQueries** | [**List&lt;ResultSetContextFacetQueries&gt;**](ResultSetContextFacetQueries.md) | The counts from facet queries |  [optional]
**facetsFields** | [**List&lt;ResultBuckets&gt;**](ResultBuckets.md) | The counts from field facets |  [optional]
**facets** | [**List&lt;GenericFacetResponse&gt;**](GenericFacetResponse.md) | The faceted response |  [optional]
**spellcheck** | [**List&lt;ResultSetContextSpellcheck&gt;**](ResultSetContextSpellcheck.md) | Suggested corrections  If zero results were found for the original query then a single entry of type \&quot;searchInsteadFor\&quot; will be returned. If alternatives were found that return more results than the original query they are returned as \&quot;didYouMean\&quot; options. The highest quality suggestion is first.  |  [optional]



