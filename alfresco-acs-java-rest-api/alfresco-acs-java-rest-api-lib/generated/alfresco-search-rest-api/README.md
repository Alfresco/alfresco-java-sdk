# alfresco-search-rest-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.alfresco</groupId>
    <artifactId>alfresco-search-rest-api</artifactId>
    <version>5.1.2</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-search-rest-api:5.1.2"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-search-rest-api-5.1.2.jar
* target/lib/*.jar

## Documentation for API Endpoints

All URIs are relative to *https://localhost/alfresco/api/-default-/public/search/versions/1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SearchApi* | [**search**](docs/SearchApi.md#search) | **POST** /search | Searches Alfresco


## Documentation for Models

 - [ContentInfo](docs/ContentInfo.md)
 - [Error](docs/Error.md)
 - [ErrorError](docs/ErrorError.md)
 - [GenericBucket](docs/GenericBucket.md)
 - [GenericBucketBucketInfo](docs/GenericBucketBucketInfo.md)
 - [GenericFacetResponse](docs/GenericFacetResponse.md)
 - [GenericMetric](docs/GenericMetric.md)
 - [Node](docs/Node.md)
 - [Pagination](docs/Pagination.md)
 - [PathElement](docs/PathElement.md)
 - [PathInfo](docs/PathInfo.md)
 - [RequestDefaults](docs/RequestDefaults.md)
 - [RequestFacetField](docs/RequestFacetField.md)
 - [RequestFacetFields](docs/RequestFacetFields.md)
 - [RequestFacetIntervals](docs/RequestFacetIntervals.md)
 - [RequestFacetIntervalsIntervals](docs/RequestFacetIntervalsIntervals.md)
 - [RequestFacetQueries](docs/RequestFacetQueries.md)
 - [RequestFacetQueriesInner](docs/RequestFacetQueriesInner.md)
 - [RequestFacetSet](docs/RequestFacetSet.md)
 - [RequestFields](docs/RequestFields.md)
 - [RequestFilterQueries](docs/RequestFilterQueries.md)
 - [RequestFilterQueriesInner](docs/RequestFilterQueriesInner.md)
 - [RequestHighlight](docs/RequestHighlight.md)
 - [RequestHighlightFields](docs/RequestHighlightFields.md)
 - [RequestInclude](docs/RequestInclude.md)
 - [RequestLimits](docs/RequestLimits.md)
 - [RequestLocalization](docs/RequestLocalization.md)
 - [RequestPagination](docs/RequestPagination.md)
 - [RequestPivot](docs/RequestPivot.md)
 - [RequestQuery](docs/RequestQuery.md)
 - [RequestRange](docs/RequestRange.md)
 - [RequestScope](docs/RequestScope.md)
 - [RequestSortDefinition](docs/RequestSortDefinition.md)
 - [RequestSortDefinitionInner](docs/RequestSortDefinitionInner.md)
 - [RequestSpellcheck](docs/RequestSpellcheck.md)
 - [RequestStats](docs/RequestStats.md)
 - [RequestTemplates](docs/RequestTemplates.md)
 - [RequestTemplatesInner](docs/RequestTemplatesInner.md)
 - [ResponseConsistency](docs/ResponseConsistency.md)
 - [ResultBuckets](docs/ResultBuckets.md)
 - [ResultBucketsBuckets](docs/ResultBucketsBuckets.md)
 - [ResultSetContext](docs/ResultSetContext.md)
 - [ResultSetContextFacetQueries](docs/ResultSetContextFacetQueries.md)
 - [ResultSetContextSpellcheck](docs/ResultSetContextSpellcheck.md)
 - [ResultSetPaging](docs/ResultSetPaging.md)
 - [ResultSetPagingList](docs/ResultSetPagingList.md)
 - [ResultSetRowEntry](docs/ResultSetRowEntry.md)
 - [SearchEntry](docs/SearchEntry.md)
 - [SearchEntryHighlight](docs/SearchEntryHighlight.md)
 - [SearchRequest](docs/SearchRequest.md)
 - [UserInfo](docs/UserInfo.md)
 - [ResultNode](docs/ResultNode.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Author



