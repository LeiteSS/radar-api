FROM eclipse-temurin:11
MAINTAINER fateczl.gov.sp.br
COPY build/libs/radar-0.0.1-SNAPSHOT.jar radar-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/radar-0.0.1-SNAPSHOT.jar"]
