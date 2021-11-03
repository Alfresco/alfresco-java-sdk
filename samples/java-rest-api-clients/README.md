# Alfresco Process Java SDK - Sample app

Sample application to demonstrate REST API usage within a sample application, 
making use of [Alfresco Process Java REST API Spring Boot Starter](../../alfresco-apa-java-rest-api)
to interact with APA.

The sample app will run ***automatically*** against the set up APA environment, 
executing a simple APA interaction flow and logging its different steps,
as a live example of the minimal configuration needed to achieve it.

By tailing the logs of the sample application container, 
we will be able to see the effect of the API interactions in action, in real time every 10 seconds:

```
INFO 1 --- [   scheduling-1] o.a.j.r.c.s.service.RESTClientService    : Starting new process instance with SingleTaskProcess definition key
INFO 1 --- [   scheduling-1] o.a.j.r.c.s.service.RESTClientService    : Process instance with id: b1c3f312-38ce-11ec-8848-0242ac1f0005 created!
INFO 1 --- [   scheduling-1] o.a.j.r.c.s.service.RESTClientService    : Fetching task of the created process instance
INFO 1 --- [   scheduling-1] o.a.j.r.c.s.service.RESTClientService    : Task of process instance with id: b1c41a25-38ce-11ec-8848-0242ac1f0005 fetched!
INFO 1 --- [   scheduling-1] o.a.j.r.c.s.service.RESTClientService    : Task completed and process finished!!
INFO 1 --- [   scheduling-1] o.a.j.r.c.s.service.RESTClientService    : This a list of the Audit events in chronological order:[PROCESS_CREATED, PROCESS_UPDATED, PROCESS_STARTED, TASK_CREATED, TASK_ASSIGNED, TASK_COMPLETED, PROCESS_COMPLETED]
```

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

Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-04T21:00:29+02:00)
```

* [Docker](https://docs.docker.com/install/) version 1.12 or higher:
```bash
$ docker -v

Docker version 20.10.2, build 2291f61
```

* [Docker compose](https://docs.docker.com/compose/install/):
```bash
$ docker-compose -v

docker-compose version 1.27.4, build 40524192
```

### Build and run

This sample project local development environment is based on Docker, so a ```run.sh``` utility script has been included in order to build, run or stop 
easily. This script will require to change the environment variable ```DOCKER_IP``` to your Docker host IP in the provided ```.env``` file


See [```run.sh```](run.sh)  if you would like to know how each function exactly works.

#### How To Run

Build all and run:

Before running the sample make sure that you build the whole project from the root level 
to make sure the sample app has the latest code from its dependencies above in the project

```bash
$ mvn clean install
```

Then you are ready to spin up the docker compose environment:

```bash
$ ./run.sh build_start
```

Only start the environment (without building it):

```bash
$ ./run.sh start
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
