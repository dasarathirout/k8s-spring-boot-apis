FROM openjdk:17-alpine
MAINTAINER dasarathi.rout@live.com
RUN mkdir -p /app/spring/
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
WORKDIR /app/spring/
RUN export LOGGING_FILE_PATH=./
RUN export LOGGING_FILE_NAME=application.log
ARG BOOT_JAR=./build/libs/service-zero-*.jar
COPY ${BOOT_JAR} /app/spring/service-zero-boot.jar
EXPOSE 8180
ENTRYPOINT ["java","-jar","/app/spring/service-zero-boot.jar"]