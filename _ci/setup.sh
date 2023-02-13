#!/usr/bin/env bash
echo "=========================== Starting XXXXXXXXXXXXXXXXXXXXXXXXXXXX Script ==========================="
PS4="\[\e[35m\]+ \[\e[m\]"
set -vex

export MAVEN_CLI_OPTS=source:jar -B -q -e -fae -V -DinstallAtEnd=true -U -Ddoclint=none \
  -DaltReleaseDeploymentRepository=alfresco-public::default::https://artifacts.alfresco.com/nexus/content/repositories/releases \
  -DaltSnapshotDeploymentRepository=alfresco-public-snapshots::default::https://artifacts.alfresco.com/nexus/content/repositories/snapshots \
  -Denvironment.host=apadev.envalfresco.com \
  -Denvironment.apa.host=apadev-apa.envalfresco.com \
  -Denvironment.application.name=simpleapp \
  -Dags.version=14.9 -Dacs.version=7.1.0.1

set +vex
echo "=========================== Finishing XXXXXXXXXXXXXXXXXXXXXXXXXXXX Script =========================="
