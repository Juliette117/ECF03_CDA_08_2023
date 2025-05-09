
FROM maven:3.8.5-jdk-17 AS build

ADD ./server/common-data-service /common_data_service

WORKDIR /common_data_service

COPY . .

RUN mvn clean install -DskipTests

FROM openjdk:17-jdk

COPY --from=build /common_data_service/target/common-data-service.jar common-data-service.jar

CMD ["java", "-jar", "authentication-service.jar" ]