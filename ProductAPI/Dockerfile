#FROM ubuntu:latest
#LABEL authors="Ahimateja"
#
#ENTRYPOINT ["top", "-b"]

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/ProductAPI-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]