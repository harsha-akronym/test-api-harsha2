FROM amazoncorretto:11

COPY ./target/testApi-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch testApi-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","testApi-0.0.1-SNAPSHOT.jar"]  

EXPOSE 9090