FROM openjdk:8-jdk-alpine

COPY . .

EXPOSE 8080

ENTRYPOINT ["./gradlew", "clean", "bootRun"]

