# 📝 Task Tracker API (Spring Boot)

A simple RESTful API for managing tasks in a productivity application. Built using **Java Spring Boot** with **in-memory storage** (no database). Perfect for quick demos or prototyping.

---

## 🚀 Features

-  Create new tasks
-  View all tasks
-  View task by ID or by status
-  Update tasks
-  Delete tasks
-  Search tasks by title

---

## ⚙️ Technologies

- Java 17+
- Spring Boot
- Maven
- Postman

---

## ▶️ How to Run the Application

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/task-tracker-api.git
cd task-tracker-api

Run the application
``mvn spring-boot:run``

```

## Endpoints
Method	Endpoint	Description
POST	/api/tasks	Create a new task <br>
GET	/api/tasks	Get all tasks <br>
GET	/api/tasks/{id}	Get a task by its ID <br>
GET	/api/tasks/status/{status}	Get all tasks with given status <br>
GET	/api/tasks/search?title=...	Search tasks by title (partial) <br>
PUT	/api/tasks/{id}	Update an existing task <br>
DELETE	/api/tasks/{id}	Delete a task by ID<br>
