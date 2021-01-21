#!/usr/bin/env bash
set -e

GENERATED_SOURCE_DIR=${GENERATED_SOURCE_DIR:-generated}

echo using MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS}"
echo "***** GENERATING *****"

mvn -N -P generate clean generate-sources ${MAVEN_CLI_OPTS}

echo "***** BUILDING *****"

mvn clean install ${MAVEN_CLI_OPTS}

echo "***** all done! *****"
