FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG EcommerceApplication
ADD ${EcommerceApplication} hello-spring-boot-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT [“java”,”-Djava.security.egd=file:/dev/./urandom”,”-jar”,”/hello-spring-boot-docker-0.0.1-SNAPSHOT.jar”]