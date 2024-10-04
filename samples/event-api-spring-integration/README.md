# Alfresco Java Event API - Spring Integration Sample Application

Sample application to demonstrate the pure Spring Integration approach to use the Alfresco Java Event API.

It is a Spring Boot application that makes use of the [Alfresco Java Event API Spring Boot Starter](../../alfresco-java-event-api/README.md#spring-boot-custom-starter)
to define sample Spring Integration flows that log information about specific handled events.

## Usage

### Pre-Requisites

To properly build and run the project in a local environment it is required to have installed some tools.

* Java 21:
```bash
$ java -version

openjdk version "21.0.3" 2024-04-16 LTS
OpenJDK Runtime Environment (build 21.0.3+7-LTS-152)
OpenJDK 64-Bit Server VM (build 21.0.3+7-LTS-152, mixed mode, sharing)

```

* [Maven](https://maven.apache.org/install.html) version 3.3 or higher:
```bash
$ mvn -version

Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-04T21:00:29+02:00)
```

* [Docker](https://docs.docker.com/install/) version 1.12 or higher:
```bash
$ docker -v

Docker version 20.10.2, build 2291f61
```

* [Docker compose](https://docs.docker.com/compose/install/):
```bash
$ docker compose version

Docker Compose version v2.28.1-desktop.1
```

### Build and run

This sample project local development environment is based on Docker, so a ```run.sh/run.bat``` utility script has been included in order to build, run or stop 
easily. This script will require execution permissions, so add it if it hasn't.

```bash
$ chmod +x run.sh
```

See [```run.sh```](run.sh) or [```run.bat```](run.bat) if you would like to know how each function exactly works.

#### How To Run

Build all and run:

```bash
$ ./run.sh build_start
```

Only start the environment (without building it):

```bash
$ ./run.sh build_start
```

#### How To Stop

Stop all the containers of the environment:

```bash
$ ./run.sh stop
```

#### How To Reload the Sample App

If you want to rebuild and redeploy *only* the sample app:

```bash
$ ./run.sh reload_sample
```
