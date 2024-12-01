# Course Management System - Java Project

## Clone from GitHub

Repository: [Course Management System](https://github.com/ArbereshaA/Java)

## How to Run

1. **Import Database:**  
   Import the `Course.sql` file into your MySQL database.

2. **Open Project:**  
   Open the project in your preferred IDE.

3. **Navigate to Main Class:**  
   Go to `src/main/java/coursemanagement/main/Main.java`

4. **Run the Application:**  
   Execute the `Main.java` file to start the application.

---

## API Endpoints

### Student Endpoints

1. **Get All Students**

   - URL: `http://localhost:8080/student`
   - Method: **GET**
   - Response:
     ```json
     [
       { "id": 1, "name": "Alisha", "surname": "Shaqiri" },
       { "id": 2, "name": "Arbresha", "surname": "Ajrulla" }
     ]
     ```

2. **Get Student by ID**

   - URL: `http://localhost:8080/student/{id}`
   - Method: **GET**
   - Response:
     ```json
     { "id": 1, "name": "Alisha", "surname": "Shaqiri" }
     ```

3. **Edit Student by ID**

   - URL: `http://localhost:8080/student/{id}`
   - Method: **PUT**
   - Response:
     ```json
     { "id": 1, "name": "Alishaaaa", "surname": "Shaqiri" }
     ```

4. **Add Student**

   - URL: `http://localhost:8080/student`
   - Method: **POST**
   - Response:
     ```json
     { "id": 3, "name": "Arbreshaa", "surname": "Ajrulla" }
     ```

5. **Delete Student by ID**
   - URL: `http://localhost:8080/student/{id}`
   - Method: **DELETE**
   - Response:
     ```json
     true
     ```

---

### Course Endpoints

1. **Get All Courses**

   - URL: `http://localhost:8080/course`
   - Method: **GET**
   - Response:
     ```json
     [
       {
         "id": 2,
         "name": "Java Programming",
         "professor": "Alisha Shaqiri",
         "description": "some description"
       },
       {
         "id": 3,
         "name": "C# Programming",
         "professor": "Alisha Shaqiri",
         "description": "some description"
       },
       {
         "id": 4,
         "name": "Game Programming",
         "professor": "Arbresha Ajrulla",
         "description": "some description"
       },
       {
         "id": 5,
         "name": "PHP Programming",
         "professor": "Arbresha Ajrulla",
         "description": "some description"
       }
     ]
     ```

2. **Get Course by ID**

   - URL: `http://localhost:8080/course/{id}`
   - Method: **GET**
   - Response:
     ```json
     {
       "id": 4,
       "name": "Game Programming",
       "professor": "Arbresha Ajrulla",
       "description": "some description"
     }
     ```

3. **Edit Course by ID**

   - URL: `http://localhost:8080/course/{id}`
   - Method: **PUT**
   - Response:
     ```json
     {
       "id": 3,
       "name": "C# Programming",
       "professor": "Alisha Shaqiri",
       "description": "descriptionnnn"
     }
     ```

4. **Add Course**

   - URL: `http://localhost:8080/course`
   - Method: **POST**
   - Response:
     ```json
     {
       "id": 6,
       "name": "C++ Programming",
       "professor": "Alisha Shaqiri",
       "description": "description"
     }
     ```

5. **Delete Course by ID**
   - URL: `http://localhost:8080/course/{id}`
   - Method: **DELETE**
   - Response:
     ```json
     true
     ```

---

### Professor Endpoints

1. **Get All Professors**

   - URL: `http://localhost:8080/professor`
   - Method: **GET**
   - Response:
     ```json
     [
       {
         "id": 22333,
         "name": "Arbresha",
         "surname": "Ajrulla",
         "courses": "C#,Python"
       },
       {
         "id": 123314,
         "name": "Alisha",
         "surname": "Shaqiri",
         "courses": "Java,C++"
       }
     ]
     ```

2. **Get Professor by ID**

   - URL: `http://localhost:8080/professor/{id}`
   - Method: **GET**
   - Response:
     ```json
     {
       "id": 123314,
       "name": "Alisha",
       "surname": "Shaqiri",
       "courses": "Java,C++"
     }
     ```

3. **Edit Professor by ID**

   - URL: `http://localhost:8080/professor/{id}`
   - Method: **PUT**
   - Response:
     ```json
     {
       "id": 123314,
       "name": "Alishaa",
       "surname": "Shaqiri",
       "courses": "Java,C#"
     }
     ```

4. **Add Professor**

   - URL: `http://localhost:8080/professor`
   - Method: **POST**
   - Response:
     ```json
     { "id": 123, "name": "Arbreshaa", "surname": "Ajrulla", "courses": "C++" }
     ```

5. **Delete Professor by ID**
   - URL: `http://localhost:8080/professor/{id}`
   - Method: **DELETE**
   - Response:
     ```json
     true
     ```

---

### Overview:

The Course Management System is a Java-based application that allows you to manage students, courses, and professors. You can perform CRUD operations on each entity, making it easy to add, modify, or remove records from the system.
