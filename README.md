Creating a REST API using Hibernate, Spring Boot, and connecting it to an Android app using Retrofit involves several steps. Here's a comprehensive guide to building this project:
# Project Overview
## 1- Set Up Spring Boot Project
### Step 1: Initialize the Project: Use Spring Initializr to create a new Spring Boot project with the following options:

+ Project: Maven
+ Language: Java
+ Spring Boot: (select the latest stable version)
+ Project Metadata:
  - Group: com.example
  - Artifact: SpringRestAPI
+ Dependencies:
  - Spring Web
  - Spring Data JPA
  - H2 Database
  
### Step 2: Create the Project Structure
Click on "Generate" to download the project and extract it to your workspace.
### Step 3: Configure application.properties
Add the database configuration and Hibernate settings:
For H2 Database: 
```java
server.port=8888
spring.datasource.url=jdbc:mysql://localhost:3305/cemsdb
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL57Dialect
```
### Step 4: Create a Model Class
Create a model class to represent the project description.

### Step 5: Create Repository Interface
Create a repository interface to interact with the database.

### Step 6: Create Service Class
Create a service class to handle business logic.

### Step 7:Create Controller Class
For creating a GET endpoint, we will use @GetMapping annotation. Within the annotation, we will give the URL we would like to have for the endpoint. Similarly, for creating a POST endpoint, we will use @PostMapping annotation. 

|    METHOD    |      URL      |    DESCRIPTION    |
| ------------ | ------------- | ----------------- |
|     GET      |  /cems/event  |  List of events   |
|     POST     |  /cems/event  |   Save of events  |

---
## 2- Setting Up Android Application
### Step 1: Create a New Android Project
Open Android Studio.
Create a new project with an empty activity.
Add Retrofit and Gson dependencies to build.gradle
```android
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
implementation 'com.squareup.okhttp3:logging-interceptor:4.9.0'
 implementation 'androidx.recyclerview:recyclerview:1.2.1'
```
### Step 2: Create Retrofit Instance
Create a singleton class for Retrofit.
### Step 3: Create API Interface
Define the API endpoints.
### Step 4: Create Models
Create a User model class to map the JSON response.

### Step 5: Create Repository Class
Create a repository class to call the API.

### Step 6: Create the Activities
 + Create the main activity as a SPLASH SCREEN
 + Create the Event activity as a form GUI for entering college events details. Once the form is filled and the save button is pressed, the object will be sent to the server via POST 
   request. The server will then accept the POST request and saves the employee into the MySQL database.
+ Create the Event list actitviy, we will fetch all the events data from the Spring Boot Rest API and show it in an Android RecyclerView.
  - If we want to use a Recycler View, we will need to work with RecyclerView.Adapter to handle the data collection and bind it to the view.
  
## 3. Running the Project
1. Run Spring Boot Application:
+ Open the Spring Boot project in your IDE.
+ Run the application by executing the main method in the main application class.
2. Run Android Application:
+ Connect your Android device or start an emulator.
+ Run the Android project from Android Studio.
  
## 4. Conclusion
You now have a Spring Boot application with Hibernate that exposes RESTful endpoints, and an Android application that consumes these endpoints using Retrofit. This setup provides a solid foundation for further development and feature enhancements.
