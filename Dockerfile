FROM eclipse-temurin:17.0.5_8-jre
WORKDIR /app
COPY target/cliente1-0.0.1-SNAPSHOT.jar .
EXPOSE 8001
ENTRYPOINT ["java", "-jar", "cliente1-0.0.1-SNAPSHOT.jar"]
