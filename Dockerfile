FROM openjdk:8
ADD target/web-api-rest.jar web-api-rest.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "web-api-rest.jar"]