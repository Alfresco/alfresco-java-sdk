# Alfresco ACS Java REST API

## What is Out-of-Process?

[Alfresco SDK 4.x](https://github.com/Alfresco/alfresco-sdk) was conceived for creating JAR and AMP
modules that run in the same JVM as Alfresco Repository or Share. This is still the default
extension approach for certain use cases (e.g. Content modelling).

Alfresco Java SDK 5.0.0 is not a continuation of 4.x. Instead, it is an additional SDK that allows
developers to create out-of-process extensions. These applications run separately, consuming public
APIs exposed by Alfresco Repository.

<p align="center">
  <img title="alfresco" alt='alfresco' src='docs/images/simple_integration_diagram.png'></img>
</p>

Existing projects with business logic that could be lifted out and implemented as an external
service can use Alfresco Java SDK 5.0 and start using the public REST API to interact with the
Repository. Any business logic executed as a result of an action in the Repository, such as document
or folder uploaded, updated, deleted, can be reimplemented as an external out-process extension
utilizing the new Event API.

## Build

Run the following command:

```console
mvn clean install
```

You can set versions for API definitions using Maven properties, and exporting them, for example:
```console
MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS} -Dacs.version=6.3.0-SNAPSHOT"
MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS} -Dags.version=3.5.0-A4"
```

In the `generate-sources` phase the script `patch.sh` is executed. This script finds and replaces in the generated code configurations with the correct names and cleans unnecessary files.

TODO: include alfresco-event-gateway-api generation into the automated script generation once `swagger-codegen` plugin is updated to `3.0.x`. See: https://alfresco.atlassian.net/browse/REPO-5667
