# alfresco-activiti-process-storage-rest-api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

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
    <groupId>com.alfresco</groupId>
    <artifactId>alfresco-activiti-process-storage-rest-api</artifactId>
    <version>5.1.2-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.alfresco:alfresco-activiti-process-storage-rest-api:5.1.2-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

mvn package

Then manually install the following JARs:

* target/alfresco-activiti-process-storage-rest-api-5.1.2-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
  import com.alfresco.activiti.process.storage.*;
  import com.alfresco.activiti.process.storage.auth.*;
  import com.alfresco.activiti.process.storage.model.*;
  import com.alfresco.activiti.process.storage.handler.FolderControllerApi;

  import java.io.File;
  import java.util.*;

  public class FolderControllerApiExample {

  public static void main(String[] args) {
  
  FolderControllerApi apiInstance = new FolderControllerApi();
  try {
  Folder result = apiInstance.getApplicationStoreFolderUsingGET();
    System.out.println(result);
  } catch (ApiException e) {
  System.err.println("Exception when calling FolderControllerApi#getApplicationStoreFolderUsingGET");
  e.printStackTrace();
  }
  }
  }
```

## Documentation for API Endpoints

All URIs are relative to the environment set via -Denvironment.host and -Denvironment.application.name

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FolderControllerApi* | [**getApplicationStoreFolderUsingGET**](docs/FolderControllerApi.md#getApplicationStoreFolderUsingGET) | **GET** /v1/folders/ | getApplicationStoreFolder

## Documentation for Models

 - [Folder](docs/Folder.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


