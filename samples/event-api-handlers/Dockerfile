FROM amazoncorretto:17-alpine3.18@sha256:e937a2668732ad0e138180f40e26586b4ba39282271889466ce6693410b77f2c

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
