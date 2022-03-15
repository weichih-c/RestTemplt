## stage - maven build
FROM maven:3.6-jdk-11 AS builder  
COPY ./src /usr/src/app/src  
COPY ./pom.xml /usr/src/app  
RUN mvn -f /usr/src/app/pom.xml clean package


## stage - copy war to wildfly
FROM quay.io/wildfly/wildfly:latest as runner
COPY --from=builder /usr/src/app/target/rest-templt.war /opt/jboss/wildfly/standalone/deployments/rest-templt.war  
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]