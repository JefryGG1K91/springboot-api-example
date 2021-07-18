FROM openjdk:8-alpine3.7

MAINTAINER Jefry Gutierrez

COPY ./target/*.jar .

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "./Springboot-example-1.0.jar" ]