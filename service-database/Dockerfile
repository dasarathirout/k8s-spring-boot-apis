FROM openjdk:17-alpine
MAINTAINER dasarathi.rout@live.com
RUN mkdir -p /app/spring/
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
WORKDIR /app/spring/
RUN export LOGGING_FILE_PATH=./
RUN export LOGGING_FILE_NAME=application.log
RUN export JAVA_TOOL_OPTIONS="-javaagent:./tools/open-telemetry-java-agent.jar"
RUN export OTEL_SERVICE_NAME="dasarathi-api-service-database"

ARG OPEN_TELEMETRY_JAR=./tools/open-telemetry-java-agent.jar
ARG BOOT_JAR=./build/libs/service-database-*.jar

COPY ${BOOT_JAR} /app/spring/service-database-boot.jar
COPY ${OPEN_TELEMETRY_JAR} /app/spring/open-telemetry-java-agent.jar
EXPOSE 8180
ENTRYPOINT ["java","-jar","/app/spring/service-database-boot.jar"]