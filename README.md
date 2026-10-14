# SmartStock AI – Backend

## Project Overview
SmartStock AI is an inventory management system backend developed using Java and Spring Boot. It provides REST APIs for user authentication, product management, and sales management.

## Features
- User Authentication
- JWT-based Authentication Support
- Product Management APIs
- Sales Management APIs
- Dashboard Data APIs
- RESTful API Architecture

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- REST APIs
- JWT Authentication

## Project Structure
```text
backend/
├── pom.xml
└── src/
    └── main/
        ├── java/com/smartstock/
        │   ├── SmartStockApplication.java
        │   ├── dashboard/
        │   ├── product/
        │   ├── sale/
        │   └── security/
        └── resources/
            └── application.properties
```

## Prerequisites
- Java 17 or compatible JDK
- Apache Maven
- Configured database, if required by the application

## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/ayeshaayshu2101-boop/SmartStockAI-Backend.git
   ```

2. Navigate to the project directory:

   ```bash
   cd SmartStockAI-Backend
   ```

3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

4. The backend will start on the port configured in `application.properties`.

## API Modules
- **Security:** Authentication endpoints
- **Product:** Product management endpoints
- **Sales:** Sales management endpoints
- **Dashboard:** Dashboard information endpoints

## Author
Ayesha
