SET OTEL_LOG_LEVEL=debug
SET OTEL_METRICS_EXPORTER=none
SET OTEL_SERVICE_NAME="dasarathi-api-service-database"
SET OTEL_EXPORTER_JAEGER_ENDPOINT=http://localhost:14250
SET JAVA_TOOL_OPTIONS="-javaagent:tools/open-telemetry-java-agent.jar"
java -jar build/libs/service-database-0.0.1-SNAPSHOT.jar