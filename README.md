# Bank Management System

## Overview

The Bank Management System is a RESTful web application developed using Java, Spring Boot, Spring Data JPA, and MySQL. The application allows managing customer banking information through a set of REST APIs.

The system supports creating, retrieving, updating, and deleting customer records while ensuring data integrity using validation rules.

---

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Lombok
* Maven
* Postman

---

## Customer Entity

The Customer entity contains the following attributes:

| Field         | Type    |
| ------------- | ------- |
| customerId    | Integer |
| customerName  | String  |
| accountNumber | String  |
| balance       | Double  |
| email         | String  |
| phoneNumber   | String  |

---

## Project Architecture

### Repository Layer

Handles database operations using Spring Data JPA.

### Service Layer

Contains business logic and customer management operations.

### Controller Layer

Provides REST APIs for client requests.

---

## API Endpoints

### Add Customer

**POST**

`/customers/add`

Example Request Body:

```json
{
  "customerName": "Ahmed",
  "accountNumber": "12345",
  "balance": 500,
  "email": "ahmed@gmail.com",
  "phoneNumber": "99999999"
}
```

---

### Get All Customers

**GET**

`/customers/getAll`

---

### Get Customer By ID

**GET**

`/customers/getById?id=1`

---

### Get Customer By Name

**GET**

`/customers/getByName?customerName=Ahmed`

---

### Update Customer

**PUT**

`/customers/update?id=1`

Example Request Body:

```json
{
  "customerName": "Ahmed Ali",
  "accountNumber": "12345",
  "balance": 1000,
  "email": "ahmedali@gmail.com",
  "phoneNumber": "77777777"
}
```

---

### Delete Customer

**DELETE**

`/customers/deleteById?id=1`

---

## Validation Rules

The following validation rules were implemented:

* Customer name cannot be empty.
* Email must be in a valid format.
* Balance cannot be negative.
* Account number must be unique.

---

## Database

The application uses MySQL as the database management system and Spring Data JPA for data persistence.

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/banking
spring.datasource.username=root
spring.datasource.password=*****
spring.jpa.hibernate.ddl-auto=update
```

---

## API Testing

All REST APIs were tested successfully using Postman.

The following operations were verified:

* Add Customer
* Get All Customers
* Get Customer By ID
* Get Customer By Name
* Update Customer
* Delete Customer
* Validation Testing

Testing screenshots and results are provided in the attached PDF documentation:

**BankManagementSystem_Testing.pdf**

