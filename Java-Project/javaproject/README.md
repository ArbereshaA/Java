# Java Project

Course Management System

#Clone from github:  
https://github.com/ArbereshaA/Java

#How to Run
1.Import database from Course.sql
2.Open Project
3.Go to src\main\java\coursemanagement\main\Main.java
4.Run Main

Student:

1.URL: http://localhost:8080/student Get all Student - METHOD = GET
{ "id": 1, "name": "Alisha", "surname": "Shaqiri" }, { "id": 2, "name": "Arbresha", "surname": "Ajrulla" }

2.URL: http://localhost:8080/student/ Get Student by id - METHOD = GET

Response: {"id": 1,"name": "Alisha","surname": "Shaqiri"}

3.URL: http://localhost:8080/student/ Edit Student by id - METHOD = PUT

Response: {"id": 1,"name": "Alishaaaa","surname": "Shaqiri"},

4.URL: http://localhost:8080/student/ Add Student- METHOD = POST

Response: { "id": 3, "name": "Arbreshaa", "surname": "Ajrulla" }

5.URL: http://localhost:8080/student/ Delete Student by id- METHOD = DELETE

Response : true

#Course Endpoint

1.URL: http://localhost:8080/course Get all Course - METHOD = GET

Response: { "id": 2, "name": "Java Programming", "professor": "Alisha Shaqiri", "description": "some description" }, { "id": 3, "name": "C# Programming", "professor": "Alisha Shaqiri", "description": "some description" }, { "id": 4, "name": "Game Programming", "professor": "Arbresha Ajrulla", "description": "some description" }, { "id": 5, "name": "PHP Programming", "professor": "Arbresha Ajrulla", "description": "some description" }


2.URL: http://localhost:8080/course/ Get Course by id - METHOD = GET
Response: { "id": 4, "name": "Game Programming", "professor": "Arbresha Ajrulla", "description": "some description" }

3.URL: http://localhost:8080/course/ Edit Course by id - METHOD = PUT
Response: { "id": 3, "name": "C# Programming", "professor": "Alisha Shaqiri", "description": "descriptionnnn" }

4.URL: http://localhost:8080/course/ Add Course- METHOD = POST

Response: {"id": 6, "name": "C++ Programming", "professor": "Alisha Shaqiri", "description": "description" }

5.URL: http://localhost:8080/course/ Delete Course by id- METHOD = DELETE

Response: true

#Professor endpoint

1.URL: http://localhost:8080/professor Get all Professor - METHOD = GET

Response:
{ "id": 22333, "name": "Arbresha", "surname": "Ajrulla", "courses": "C#,Python" }, { "id": 123314, "name": "Alisha", "surname": "Shaqiri", "courses": "Java,C++" }

2.URL: http://localhost:8080/professor/ Get Professor by id - METHOD = GET

Response: { "id": 123314, "name": "Alisha", "surname": "Shaqiri", "courses": "Java,C++" }

3.URL: http://localhost:8080/professor/ Edit Professor by id - METHOD = PUT

Response: Response: { "id": 123314, "name": "Alishaa", "surname": "Shaqiri", "courses": "Java,C#" }

4.URL: http://localhost:8080/professor/ Add Professor- METHOD = POST

Response: { "id": 123, "name": "Arbreshaa", "surname": "Ajrulla", "courses": "C++" }

5.URL: http://localhost:8080/professor/ Delete Professor by id- METHOD = DELETE

Response : true
