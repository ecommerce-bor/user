# go to gradle icon
1.click on Tasks it opens options
2.open build icon
3.click on clean once it is success
4.click on build
5.Then go to main application you can search by using @SpringBootApplication
6.Spring Boot always executed from main application


# To execute local host url
http://localhost:8080/swagger-ui/index.html#/

 # API present in the app
=========================

POST http://localhost:8080/user
PUT  http://localhost:8080/update/user

GET  http://localhost:8080/user/{id}
GET  http://localhost:8080/users
GET  http://localhost:8080/user/count

DELETE  http://localhost:8080/user/{id}

1.created springboot application which consist of parent pom and handle all dependencies version without conflict and it eliminates manual of version conflicts.

2.It will provide tomcat server internally.

3.It will provide auto configuraion via application.properties we have provided data base user name and url and password.

4.It internally uses hikari pool we can can change the hikari pool min,max,idle connction settings.

5.Actuator will provide production ready made features like health, metrics application like
a.http://localhost:8080/actuator/metrics
b.http://localhost:8080/actuator/metrics/hikaricp.connections.max
c.http://localhost:8080/actuator/health

