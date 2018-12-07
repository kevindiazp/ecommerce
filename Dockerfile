FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD /target/ecommerce-0.1.0-SNAPSHOT.jar ecommerce-0.1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","ecommerce-0.1.0-SNAPSHOT.jar"]
