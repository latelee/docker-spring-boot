#FROM frolvlad/alpine-oraclejdk8:slim
#VOLUME /tmp
#ADD docker-spring-boot-1.0.0.jar app.jar
#RUN bash -c 'touch /app.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
FROM latelee/tomcat

COPY docker-spring-boot-1.0.0.war /usr/local/tomcat/webapps
