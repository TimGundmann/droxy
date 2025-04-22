FROM eclipse-temurin:23-jdk-alpine
COPY target/droxy.jar /app/droxy.jar
CMD ["java", "-jar", "/app/droxy.jar", "--spring.profiles.active=prod"]
