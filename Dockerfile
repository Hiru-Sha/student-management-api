# Use stable JDK 17 image
FROM eclipse-temurin:17-jdk-alpine

# Add JAR path
ARG JAR_FILE=target/student-api-1.0.0.jar

# Copy application
COPY ${JAR_FILE} app.jar

# Expose port
EXPOSE 8080

# Run Spring Boot app
ENTRYPOINT ["java", "-jar", "/app.jar"]
