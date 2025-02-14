FROM openjdk:17
WORKDIR /app

COPY sample-batch/build/libs/sample-batch-0.0.1-SNAPSHOT.jar batch.jar

ENTRYPOINT ["java", "-jar", "batch.jar"]