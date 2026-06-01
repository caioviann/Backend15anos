FROM maven:3.9-eclipse-temurin-21

WORKDIR /app

RUN ./mvnw clean package -DskipTests

COPY target/project15years-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
