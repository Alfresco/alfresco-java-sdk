# alfresco-discovery-rest-api

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
    <artifactId>alfresco-discovery-rest-api</artifactId>
    <version>5.0.5-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.alfresco:alfresco-discovery-rest-api:5.0.5-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-discovery-rest-api-5.0.5-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

  import org.alfresco.*;
  import org.alfresco.auth.*;
  import org.alfresco.discovery.model.*;
  import org.alfresco.discovery.handler.DiscoveryApi;

  import java.io.File;
  import java.util.*;

  public class DiscoveryApiExample {

  public static void main(String[] args) {

  





  DiscoveryApi apiInstance = new DiscoveryApi();
  try {
  DiscoveryEntry result = apiInstance.getRepositoryInformation();
    System.out.println(result);
  } catch (ApiException e) {
  System.err.println("Exception when calling DiscoveryApi#getRepositoryInformation");
  e.printStackTrace();
  }
  }
  }

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/alfresco/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DiscoveryApi* | [**getRepositoryInformation**](docs/DiscoveryApi.md#getRepositoryInformation) | **GET** /discovery | Get repository information


## Documentation for Models

 - [DiscoveryEntry](docs/DiscoveryEntry.md)
 - [EntitlementsInfo](docs/EntitlementsInfo.md)
 - [Error](docs/Error.md)
 - [ErrorError](docs/ErrorError.md)
 - [LicenseInfo](docs/LicenseInfo.md)
 - [ModuleInfo](docs/ModuleInfo.md)
 - [RepositoryEntry](docs/RepositoryEntry.md)
 - [RepositoryInfo](docs/RepositoryInfo.md)
 - [StatusInfo](docs/StatusInfo.md)
 - [VersionInfo](docs/VersionInfo.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



