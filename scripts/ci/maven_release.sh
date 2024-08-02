#!/usr/bin/env bash
echo "=========================== Starting Release Script ==========================="
PS4="\[\e[35m\]+ \[\e[m\]"
set -vex
pushd "$(dirname "${BASH_SOURCE[0]}")/../../"

source "$(dirname "${BASH_SOURCE[0]}")/build_functions.sh"

JAVA_SDK_REPO="github.com/Alfresco/alfresco-java-sdk.git"

cloneRepo "${JAVA_SDK_REPO}" "${BRANCH_NAME}"

echo "${BRANCH_NAME}"
echo "${ls -a}"

# Use full history for release
git checkout -B "${BRANCH_NAME}"

# Run the release plugin - with "[skip ci]" in the release commit message
mvn -B \
  "-Darguments=-DskipTests -Dbuild-number=${BUILD_NUMBER}" \
  release:clean release:prepare release:perform \
  -DscmCommentPrefix="[maven-release-plugin][skip ci] " \
  -Dusername="${GIT_USERNAME}" \
  -Dpassword="${GIT_PASSWORD}" \
  -Prelease

popd
set +vex
echo "=========================== Finishing Release Script =========================="

