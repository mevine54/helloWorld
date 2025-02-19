FROM openjdk:21

EXPOSE 9000

WORKDIR /app

COPY helloworld-0.0.1-SNAPSHOT.jar /app/helloworld-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "helloworld-0.0.1-SNAPSHOT.jar"]