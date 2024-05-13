FROM openjdk:17
EXPOSE 8080
ADD target/simple-spring-boot.jar simple-spring-boot.jar
ENTRYPOINT ["java", "-jar", "/simple-spring-boot.jar"]
