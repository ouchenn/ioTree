FROM openjdk:11
EXPOSE 8080
ADD target/ioTree.jar ioTree.jar
ENTRYPOINT ["java", "-jar", "/ioTree.jar"]