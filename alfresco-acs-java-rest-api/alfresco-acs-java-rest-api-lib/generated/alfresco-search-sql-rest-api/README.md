# alfresco-search-sql-rest-api

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
    <artifactId>alfresco-search-sql-rest-api</artifactId>
    <version>5.1.2-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-search-sql-rest-api:5.1.1"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-search-sql-rest-api-5.1.1.jar
* target/lib/*.jar

## Documentation for API Endpoints

All URIs are relative to *https://localhost/alfresco/api/-default-/public/search/versions/1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SqlApi* | [**search**](docs/SqlApi.md#search) | **POST** /sql | Alfresco Insight Engine SQL Passthrough


## Documentation for Models

 - [Docs](docs/Docs.md)
 - [DocsInner](docs/DocsInner.md)
 - [Error](docs/Error.md)
 - [ErrorError](docs/ErrorError.md)
 - [Pagination](docs/Pagination.md)
 - [SQLResultSetPaging](docs/SQLResultSetPaging.md)
 - [SQLResultSetPagingList](docs/SQLResultSetPagingList.md)
 - [SQLResultSetRowEntry](docs/SQLResultSetRowEntry.md)
 - [SQLSearchRequest](docs/SQLSearchRequest.md)
 - [SolrResultSet](docs/SolrResultSet.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Author



