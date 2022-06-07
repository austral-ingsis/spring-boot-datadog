FROM gradle:7.4.1-jdk11
COPY . /app
WORKDIR /app
RUN gradle build
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/build/libs/demo-data-dog-0.0.1-SNAPSHOT.jar"]