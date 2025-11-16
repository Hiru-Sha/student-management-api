# 🎓 Student Management System (Spring Boot + H2 Database)

A **Student Management REST API** built using **Spring Boot**, featuring:
- Full CRUD operations
- Pagination and sorting
- Search functionality
- Field validation
- Global exception handling
- H2 in-memory database
- Swagger UI documentation

---

## 🚀 Features

✅ Add Student  
✅ View All Students  
✅ View Student by ID  
✅ Update Student  
✅ Delete Student  
✅ Pagination & Sorting (`GET /api/students?page=&size=&sort=`)  
✅ Search by **name** or **course**  
✅ Field validation (email format, name not empty, age > 18)  
✅ Swagger UI for API testing  
✅ H2 database console for debugging  

---

## 🧩 Technologies Used

| Component     | Technology |
|---------------|------------|
| Backend       | Spring Boot (Java 17) |
| Database      | H2 (In-Memory) |
| Build Tool    | Maven |
| API Docs      | Swagger UI (Springdoc OpenAPI) |
| Validation    | Jakarta Bean Validation |

---

## ⚙️ How to Run the Project

### 1️⃣ Requirements
- Java 17  
- Maven  
- Any IDE (IntelliJ recommended)

---

### 2️⃣ Clone or Download the Project

```bash
git clone <your-repository-url>
cd student-management-api
```

---

### 3️⃣ Run the Project

Run the main class:

```
src/main/java/com/example/studentapi/StudentApiApplication.java
```

Or via terminal:

```bash
mvn spring-boot:run
```

---

## 🧠 Application Properties (H2)

```properties
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
springdoc.swagger-ui.path=/swagger-ui.html
```

---

## 🗄️ Accessing H2 Database Console

Visit:

👉 http://localhost:8080/h2-console  

Use these credentials:

| Property | Value |
|---------|--------|
| JDBC URL | `jdbc:h2:mem:testdb` |
| Username | `sa` |
| Password | *(leave empty)* |

---

## 📘 Swagger API Documentation

Visit:

👉 http://localhost:8080/swagger-ui.html

You can test **all endpoints** through Swagger.

---

## 🔗 API Endpoints

### 🎯 Student Endpoints

| Method     | Endpoint                               | Description                                  |
|------------|-----------------------------------------|----------------------------------------------|
| **GET**    | `/api/students`                        | Get all students (pagination + sorting)      |
| **GET**    | `/api/students/{id}`                   | Get student by ID                            |
| **POST**   | `/api/students`                        | Add a new student                            |
| **PUT**    | `/api/students/{id}`                   | Update existing student                      |
| **DELETE** | `/api/students/{id}`                   | Delete student                               |
| **GET**    | `/api/students/search?name={name}`     | Search by student name                       |
| **GET**    | `/api/students/search?course={course}` | Search by course                             |

---

## 🧪 API Testing (Postman Examples)

### POST Request Body
```json
{
  "name": "Hirusha Rashmika",
  "email": "hirusha@gmail.com",
  "age": 25,
  "course": "Computer Science"
}
```

---

### Example Query Parameters

- `/api/students?page=0&size=5&sort=name,asc`
- `/api/students/search?name=Hirusha`
- `/api/students/search?course=CS`

---

## 🧱 Validation Rules

| Field      | Rule                       |
|------------|-----------------------------|
| **name**   | Cannot be empty             |
| **email**  | Must be valid email format  |
| **age**    | Must be greater than 18     |
| **course** | Cannot be empty             |

---

## 📜 Global Exception Handling

Custom exceptions handled:
- Student Not Found  
- Validation Errors  
- Bad Requests  

Provides clean, readable error messages.

---

## 🧾 License / Notice

This project was developed for academic purposes as part of the **Spring Boot REST API Assignment**.

---

## 👨‍💻 Developer

**🧑‍🎓 Hirusha Rashmika Kuruwita**  
🪪 Student ID: ICT/21/877  
🎓 University of Sri Jayewardenepura – Faculty of Technology  

