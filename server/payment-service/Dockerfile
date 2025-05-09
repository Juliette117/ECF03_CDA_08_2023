
FROM maven:3.8.5-jdk-17 AS build

ADD ./server/payment-service /payment_service

WORKDIR /payment_service

COPY . .

RUN mvn clean install -DskipTests

FROM openjdk:17-jdk

COPY --from=build /payment_service/target/payment-service.jar payment-service.jar

ENTRYPOINT ["java", "-jar", "authentication-service.jar" ]