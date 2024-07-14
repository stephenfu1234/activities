FROM openjdk:17-jdk-slim

MAINTAINER stephenfu

COPY target/activities-0.0.1-SNAPSHOT.jar activities-microservice.jar

ENTRYPOINT ["java", "-jar", "activities-microservice.jar"]