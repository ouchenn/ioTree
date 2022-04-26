FROM openjdk:11
EXPOSE 8080
ADD target/iotree.jar iotree.jar
ENTRYPOINT ["java", "-jar", "/iotree.jar"]