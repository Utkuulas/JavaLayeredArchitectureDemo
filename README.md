## Java Layered Architecture Demo

This project was developed for the purpose of experiencing that implementation OOP principles. 

The project includes a console app in capable of that simulating a layered architecture, and it consists of following layers:

- *Entities*
- *Business*
- *Data Access*

Also, there is a logging package for simulating logging processes in the core folder. 

### *1. Entities*

This layer contains concrete classes that corresponding with table relations in the database.

### *2. Business*

This layer contains concrete and abstract classes that provide managing validation and other business processes.

### *3. Data Access*

This layer contains concrete and abstract classes that provide managing data transmission between database and app.

*Note: There is no database connection in the project. In this case was used Arrays for keeping data.*

### Scenario

We are asked to develop a backend project for an online education website. 
The following features must be simulated by the app.

- Entities: Course, Category, and Instructor
- Data access methods: Jdbc, Hibernate
- Course and category names must be unique
- Course price must be equals or greater than 0
