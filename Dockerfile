FROM adoptopenjdk/openjdk11:alpine-jre

WORKDIR /opt/app
ARG JAR_FILE=target/horsea-service-1.0.0.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]
