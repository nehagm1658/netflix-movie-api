Movie Backend Application

This is a simple Java Spring Boot backend application created as a sample task.

The application provides REST APIs to add a movie and get a movie by ID.
It uses in-memory storage and does not use any database.

How to run the project:

1. Open the project folder
2. Run the following command:

   .\mvnw.cmd spring-boot:run

3. The application will start on port 8081

Available APIs:

POST /api/movies  
Used to add a new movie.

GET /api/movies/{id}  
Used to get a movie by its ID.

Note:  
This project is created only for evaluation purposes.
