FROM tomcat:9.0.27-jdk11-openjdk
RUN rm -rf /usr/local/tomcat/webapp/*
ADD ./build/libs/devops-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh", "run"]