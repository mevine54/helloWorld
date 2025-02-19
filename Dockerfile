FROM openjdk:21

EXPOSE 9000

WORKDIR /app

COPY target/HelloApi-0.0.1-SNAPSHOT.jar /app/HelloApi-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "HelloApi-0.0.1-SNAPSHOT.jar"]