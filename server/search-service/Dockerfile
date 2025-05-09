
FROM maven:3.8.5-jdk-17 AS build

ADD ./server/search-service /search_service

WORKDIR /search_service

RUN mvn clean install -DskipTests

FROM openjdk:17-jdk

VOLUME /tmp

COPY --from=build /search_service/target/search-service.jar search-service.jar

ENTRYPOINT ["java", "-jar", "authentication-service.jar" ]