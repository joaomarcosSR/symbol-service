FROM gradle:7.3.1-jdk17-alpine as cache
RUN mkdir -p /home/gradle/cache_home
ENV GRADLE_USER_HOME /home/gradle/cache_home
COPY build.gradle gradle.properties /home/gradle/java-code/
WORKDIR /home/gradle/java-code
RUN gradle clean build -i --stacktrace

FROM gradle:7.3.1-jdk17-alpine as builder
COPY --from=cache /home/gradle/cache_home /home/gradle/.gradle
COPY . /usr/src/java-code/
WORKDIR /usr/src/java-code
RUN gradle assemble -i --stacktrace

FROM openjdk:17-oracle
EXPOSE 8080
COPY --from=builder /usr/src/java-code/build/libs/*.jar /usr/src/java-app/
WORKDIR /usr/src/java-app
ENTRYPOINT ["java", "-jar", "symbol-service-0.1-all.jar"]