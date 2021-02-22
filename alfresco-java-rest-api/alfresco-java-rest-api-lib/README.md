## Regenerate & Build

Run the following sh script (SOME REALLY IMPORTANT MINOR MANUAL CHANGE ARE NEEDED)

```console
./generate.sh
```

You can set versions for API definitions using Maven properties, for example:
```console
MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS} -Dacs.version=6.2.0"
MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS} -Dags.version=3.5.0-A4"
MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS} -U"
export MAVEN_CLI_OPTS
./generate.sh
```
