#FROM eclipse-temurin:17-jdk-alpine
#WORKDIR /app
#COPY target/OrderAPI-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#recommanded version is jdk-17 with LTS.....
# the jdk 25 wont work so always use the jdk-25 inside the pom.xml

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/OrderAPI-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
