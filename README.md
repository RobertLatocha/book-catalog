# Book Catalog
## Overview
This application was created for simplify books management

## Reequirements
- Java 1.8.x
- Maven 3.x.x
- MySQL - 5.x.x

## How to use
1. Clone the repository

  ```git@github.com:RobertLatocha/BookCatalog.git```

2. Create MySQL database
  
  ```create database books```

3. Setup MySQL username and password: 

open ```src/main/resources/application.properties```

change ```spring.datasource.username``` and ```spring.datasource.password``` as per your MySQL installation

2. Build and run the app using maven

```
mvn package
java -jar target/book-catalog-1.0.0.jar
```

The app will start running at ```http://localhost:8080```

## Tools and technologies used for this application
* Spring Boot 
* MVC
* JPA 
* Hibernate 
* MySQL   
* Java SE 
* Maven
* Eclipse 

## License

This project is licensed under the  Apache License 2.0 - see the [LICENSE.md](docs/LICENSE.md) file for details    
    
