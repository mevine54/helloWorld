FROM openjdk:21

EXPOSE 9000

WORKDIR /app

COPY target/HelloApi-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]