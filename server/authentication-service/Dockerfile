
FROM maven:3.8.5-jdk-17 AS build

ADD ./server/authentication-service /authentication_service

WORKDIR /authentication_service

COPY . .

RUN mvn clean install -DskipTests

FROM openjdk:17-jdk

COPY --from=build /authentication_service/target/authentication-service.jar authentication-service.jar

CMD ["java", "-jar", "authentication-service.jar" ]