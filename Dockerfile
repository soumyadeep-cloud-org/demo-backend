FROM maven:3.9-eclipse-temurin-21 AS builder
WORKDIR /build
COPY / ./
RUN mvn clean package -Dmaven.test.skip=true

FROM eclipse-temurin:21-jre-alpine AS runner
WORKDIR /run
COPY --from=builder /build/target/*.jar app.jar

EXPOSE 8080
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=75.0"
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]



