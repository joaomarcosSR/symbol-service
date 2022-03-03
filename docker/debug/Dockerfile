FROM openjdk:17-oracle
EXPOSE 8080
COPY ./build/libs/*.jar /usr/src/java-app/
WORKDIR /usr/src/java-app
ENTRYPOINT java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8000 -jar symbol-service-0.1-all.jar