FROM openjdk:17-alpine
ADD /target/mongo-demo-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]