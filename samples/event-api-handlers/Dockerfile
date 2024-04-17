FROM amazoncorretto:17-alpine3.18@sha256:6a3dc573328ced158ae25ffde792accbe8b1ff2e7b505c72d2d5e7b9bfa9ac26

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
