FROM gradle:7.1.0-jdk11 as build
USER root
WORKDIR /dist
ADD . /dist
RUN gradle assemble

FROM openjdk:11-slim
WORKDIR /app
COPY --from=build /dist/build/libs/immoapp-backend.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
