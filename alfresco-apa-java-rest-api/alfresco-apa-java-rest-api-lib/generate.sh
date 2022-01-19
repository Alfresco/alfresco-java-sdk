#!/usr/bin/env bash
set -e

GENERATED_SOURCE_DIR=${GENERATED_SOURCE_DIR:-generated}

echo Genereating APA Java rest API using MAVEN_CLI_OPTS="${MAVEN_CLI_OPTS}"
echo "***** GENERATING *****"

mvn -N -P generate clean generate-sources ${MAVEN_CLI_OPTS}

echo "***** ADDING LICENSE HEADER *****"

mvn license:format

echo "***** all done! *****"
