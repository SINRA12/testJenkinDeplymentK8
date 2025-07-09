# Use an official OpenJDK 17 base image
FROM openjdk:17-jdk-slim

# Define build arguments
ARG jar
ARG port

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR file from the target directory to the container's working directory
COPY target/${jar} app.jar

# Expose the application port
EXPOSE ${port}

# Define the command to run the JAR file using Java
ENTRYPOINT ["java", "-jar", "app.jar"]
