FROM alfresco/alfresco-base-java:11.0.10-openjdk-centos-8@sha256:343c8f63cf80c7af51785b93d6972b0c00087a1c0b995098cb8285c4d9db74b5

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
