FROM openjdk:8
ADD target/docker-domrf-test.jar docker-domrf-test.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-domrf-test.jar"]