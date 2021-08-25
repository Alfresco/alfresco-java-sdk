## Regenerate & Build

Run the following sh script (SOME REALLY IMPORTANT MINOR MANUAL CHANGE ARE NEEDED)

Navigate to `alfresco-java-rest-api-lib` directory, then from there set the following env var and export it:
```console
MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS} -U"
export MAVEN_CLI_OPTS
```

And then run the following command:

```console
./generate.sh
```

You can set versions for API definitions using Maven properties, and exporting them, for example:
```console
MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS} -Dacs.version=6.2.0"
MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS} -Dags.version=3.5.0-A4"
```
This overwrites the `acs.version` to 6.2.0 and `ags.version` to 3.5.0-A4 from here:
https://github.com/Alfresco/alfresco-java-sdk/blob/develop/alfresco-java-rest-api/alfresco-java-rest-api-lib/pom.xml#L23-L24

As part of the script `generate.sh`, the following maven command is executed:

```console
mvn -N -P generate clean generate-sources ${MAVEN_CLI_OPTS}
```

And in the `generate-sources` phase the script `patch.sh` is executed. This script finds and replaces in the generated code configurations with the correct names and cleans unnecessary files.

TODO: include alfresco-event-gateway-api generation into the automated script generation once `swagger-codegen` plugin is updated to `3.0.x`
