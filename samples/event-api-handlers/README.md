# Alfresco Java Event API - Plain Event Handlers Sample Application

Sample application to demonstrate the Java plain handlers approach to use the Alfresco Java Event API.

It is a Spring Boot application that makes use of the [Alfresco Java Event API Spring Boot Starter](../../alfresco-java-event-api/README.md#spring-boot-custom-starter)
to define sample [```EventHandler```](../../alfresco-java-event-api/alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/handler/EventHandler.java)'s
that log information about the handled events.

## Usage

### Pre-Requisites

To properly build and run the project in a local environment it is required to have installed some tools.

* Java 11:
```bash
$ java -version

openjdk version "11.0.1" 2018-10-16
OpenJDK Runtime Environment 18.9 (build 11.0.1+13)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.1+13, mixed mode)
```

* [Maven](https://maven.apache.org/install.html) version 3.3 or higher:
```bash
$ mvn -version

Apache Maven 3.3.3 (7994120775791599e205a5524ec3e0dfe41d4a06; 2015-04-22T07:57:37-04:00)
```

* [Docker](https://docs.docker.com/install/) version 1.12 or higher:
```bash
$ docker -v

Docker version 18.09.2, build 6247962
```

* [Docker compose](https://docs.docker.com/compose/install/):
```bash
$ docker-compose -v

docker-compose version 1.27.4, build 40524192
```

### Build and run

This sample project local development environment is based on Docker, so a ```run.sh/run.bat``` utility script has been included in order to build, run or stop 
easily. This script will require execution permissions, so add it if it hasn't.

```bash
$ chmod +x docker-run.sh
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
