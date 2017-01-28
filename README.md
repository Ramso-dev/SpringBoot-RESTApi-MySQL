# SpringBoot-RESTApi-MySQL


###### Java REST API with a MySQL implementation.

Short Description: REST Api for performing CRUD operations with a MySQL database which contains a collection of users.<br />

Setup: SpringBoot+Maven<br />
Code: Java<br />
Data persistance: MySQL (Local)<br />
JUnit Tests: Todo/Not completed<br />

###### Database setup:<br />
Create database customtest;<br />
Create table `users`(<br />
    `id` int(3) NOT NULL AUTO_INCREMENT, <br />
    `name` VARCHAR(100) NOT NULL, <br />
    `credits` int (4), <br />
    primary key (`id`)<br />
);<br />

###### Usage:
- MySQL up and running
- maven clean 
- Run project as SpringBoot App

###### Testing (done with Postman):


> POST  - localhost:8080/api/users<br />
Content-type -> json<br />
Header raw:<br />
{
"name":"test",
"credits":100
}

> GET - localhost:8080/api/users

> GET/DELETE - localhost:8080/api/users/{id}

> PUT - localhost:8080/api/users/{id}<br />
Content-type -> json<br />
Header raw:<br />
{
"id":"{id}",
"name":"test",
"credits":100
}
