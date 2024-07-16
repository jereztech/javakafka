FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/java-spring-kafka.jar /app/java-spring-kafka.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "java-spring-kafka.jar"]
