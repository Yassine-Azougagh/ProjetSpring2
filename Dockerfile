FROM openjdk:17
EXPOSE 8081
ADD target/spring_api.jar spring_api.jar
ENTRYPOINT ["java","-jar","/spring_api.jar"]