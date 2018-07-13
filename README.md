# spring-rest-registration
Contains Assignment solution of creating RestAPI based registration

# How To Run
* Download Project from Github
* Get into project directory `company-rest-assignment` and run command through terminal : 
```mvn clean eclipse:eclipse``` 
This will download all the required jars configured through maven.
* Jetty Server is configured as a dependency inside `pom.xml`. To run project on jetty server, run command : 
```mvn jetty:run```
* Set database related things in properites file located at `company-rest-assignment/src/main/resources`.
By-default database name is configured as `rest_login` and login/password for database is `root/root`.
* Open your default browser and browse link `localhost:8080` to get to the homepage.
* To read project details better, [setup maven](http://www.vogella.com/tutorials/EclipseMaven/article.html) in eclipse and view through the IDE. 

# References
### Code Bases considered while creating this :
* [Spring MVC To Spring Rest Json](https://stackoverflow.com/questions/37320448/convert-spring-mvc-to-spring-fullrest-json-application)
* [CodeJava](http://www.codejava.net/frameworks/spring/14-tips-for-writing-spring-mvc-controller)
* [WebTutor](http://javawebtutor.com/articles/spring/spring-mvc-tutorial.php)
* [JournalDev](https://www.journaldev.com/3358/spring-requestmapping-requestparam-pathvariable-example)

### Documentations and Blog considered : 
* [Youtube Spring Tutorial](https://www.youtube.com/watch?v=JusAo909L6Q&list=PLzS3AYzXBoj-DeU8oR9OTYx4IfEUQbKAm&index=7)
* [Github Project on JPA Annotation](https://github.com/kishanjavatrainer/SpringJPAIntegrationUsingAnnotation)
* [Tutorials Point](https://www.tutorialspoint.com/jpa/jpa_entity_managers.htm)
* [MKyoung Blog](https://www.mkyong.com/hibernate/maven-hibernate-annonation-mysql-example/)
