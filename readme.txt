Requirements
For building and running the application you need:

JDK 1.11
Maven 4.0
Running the application locally
There are several ways to run a Spring Boot application on your local machine. 
One way is to execute the main method in the com.codechallenge.cityconnectservice.resource.CityConnectServiceResource class 
from your IDE.

Alternatively you can use the Spring Boot from eclipse as a Spring Boot App

The package contains following classes:
RestController class - com.codechallenge.cityconnectservice.resource.CityConnectServiceResource.java
Spring Boot Application class - com.codechallenge.cityconnectservice.CityConnectorApplication.java
Bean class - com.codechallenge.cityconnectservice.model.CityConnectorBean.java
App Configuration - com.codechallenge.cityconnectservice.util.AppConfig.java
Tests - com.codechallenge.cityconnect.CityConnectorApplicationTests
Util class - com.codechallenge.cityconnectservice.util.Constants.java
text file - city.txt (to store all connecting cities having roads)
application.properties (contains the spring boot app name and server port)

Swagger documentation on this URL:
JSON:
http://localhost:8081/v2/api-docs

UI:
http://localhost:8081/swagger-ui.html
