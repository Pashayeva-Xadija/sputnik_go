FROM maven:3.9.8-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn -q -DskipTests dependency:go-offline
COPY src ./src
RUN mvn -q -DskipTests package

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/*-SNAPSHOT.jar app.jar
EXPOSE 8080
ENV JAVA_TOOL_OPTIONS=""
ENTRYPOINT ["sh","-c","java -XX:MaxRAMPercentage=75 -XX:+ExitOnOutOfMemoryError -Dserver.port=${PORT:-8080} -jar /app/app.jar"]
