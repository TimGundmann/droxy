FROM openjdk:10.0.2-13-jre-sid

COPY target/droxy.jar /app/droxy.jar

CMD ["java", "-jar", "/app/droxy.jar", "--spring.profiles.active=prod"]
