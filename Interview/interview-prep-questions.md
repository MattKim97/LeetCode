
# Interview Prep Questions

## Part 1: Java Fundamentals 

_Assume that all of the questions with this section pertain to Java (unless otherwise specified)._

### Module 1 - Tools, Type, and Statements

* Is Java a compiled or interpreted language?
    * Java is a compiled language
    * A complied language is when the code is compiled once into machine code, and can be executed multiple times without the need for translation. This makes efficient code that runs faster than interpreted programs and apps, however can only run on computers with the same architecture as the computer they were compiled on
    * An interpreted language's code is compiled on the fly each time the program is run, this make errors easier to detect but the program is slower and less efficient

* What is the JDK?
    * The JDK is the java development kit, it is a bundle of software development tools and libraries,combined with the Java Runtime Environment (JRE) and Java Virtual Machine (JVM)
* What primitive types does Java provide?
    * Byte 
    * Integer
    * Boolean
    * Char
* What are some of the ways that a reference type differs from a primitive type?
    * A primitive type stores teh data directly into memory, which makes them more memory-efficient and faster to access, while a reference type stores a memory address, that references the actual data in memory, this allows reference types to reference complex objects.
* When using a debugger, what does it mean to step into a method?
    * To stop or move execution to the first breakpoint of the debug
* What are the parts of a method?
    * Modifiers aka public or private
    * the return type (return data type of the value returned by method)
    * method name
    * parameters
* What does it mean to overload a method?
    * Allowing different methods with the same name to exits by changing the method's parameters, return type, etc.
* Can the size of an array be changed?
    * No you cannot change the size of an array after it has been constructed,
    however you can change the number of elements in an ArrayList whenever you want


### Module 2 - OOP & Testing

* What is the difference between a class and an object?
    * A class is a blueprint for an object a set of rules, and the object is an instance of a class
* What are the parts of a Java class?
    * Class name
    * the Access Modifier
    * Optional Modifiers
    * Fields
    * Constructors
    * Methods
* What is an access modifier?
    * A access modifier specifies the visibility of the class
    * public, private, protected, or if not specified default package-private
* What is an interface?
    * It is a blueprint for classes, and how to implement the class, it specifies what the class must have, but not the how therefore only contained abstract methods
* What are the pillars of OOP?
    * Abstraction - simplifying complex systems by modeling classes and hiding complex implementation details, and only showing the essential features of an object
    * Encapsulation - bundling data and methods to operate on the data into a single class. Also restrict direct access to some of the objet's inner-workings, to prevent modification or unauthorized access
    * Polymorphism - ability of object to take on many forms, allows a single method or object to behavior differently depending on it's context
    * Inheritance - mechanism by which classes can inherit attributes or methods of another class, allowing for class and code reuse, and creation of hierarchical relationship between classes

* How does the Single Responsibility Principle relate to Java classes?
    * states that classes should only have one responsibility or job
    * this is cause it improves code base maintainability
    * cleans up readability of codebase
    * allows for better use of reusability
    * easier use for testing
* What is a package?
    *  a namespace that organizes set of classes and interface, used to group related classes and interface together making to make them easier to manage
    * also can help void naming conflicts by providing unique namespaces for each set of classes
* What are some of the benefits of unit testing?
    * Unit testing is where individual units or components are tested in isolation from the rest of the application
    * a benefit is it is easier to isolate errors, and allows for improved code quality by allow developers to refactor code with greater confidence
    * provides documentation of code
    * facilitates continuous integration and deployment (CI/CD)
    * reduces technical debt
* How does an `ArrayList<E>` collection type compare to an array?
    *  Arrays fixed length, initialized on creation
    * ArrayList dynamically resizes itself
    * Arrays are faster to access and have no overhead more memory efficient
    * ArrayList slightly slower, due to dynamic resizing and have a memory overhead because it requires internal bookkeeping to dynamically resize itself
    * Arrays can store primitive data types
    * ArrayLists can only store objects, need to use the wrapper classes to store primitive types i.ie Integer vs int
    * Arrays required manual handling of certain operations
    * ArrayLists have many useful methods already builtin
* When is it appropriate to use a `List` collection type? And a `Map` collection type?
    * List allows duplicate elements, usually used ro ordered collections and if you allow duplicates, they are index accessed and are dynamically sized, and you can iterate through a specific order
    * Map - maps keys to value, each key is unique and each key has one value use them for KV pairs, fast lookups, want uniqueness, and maintaining order

### Module 3 - Layers & File I/O

* What is an exception?
    * an event that occurs during the execution of the app that will disrupt the normal flow of instructions, typically caused by errors or unexpected conditions such as dividing by zero, out of bounds array index, or opening a file that doesn't exists
* What is the difference between a checked and unchecked exception?
    * checked exceptions are exceptions that must be must be caught or declared in the method where they might be thrown such as IOException SQLException etc
    *  a unchecked exception are those that do not need to be declared or caught, typically indicated a programming error such as NullPointerException, ArrayIndexOutOfBoundsException etc.
* What is an enumeration?
    *  A specific type of data that represents a group of unchangeable variables, useful when we need a fixed set of related constants
* When should enums be used? When shouldn't they be used?
    * When you don't need to change the enum when we have a fixed set of related constants, should not use them if the data needs to be changed or updated constantly
* How does an application layer compare to classes and packages?
    * An application layer are the logical separations of concerns within a software application such as UI layer, Service layer, and the Business layer
    *  while classes are blueprints for creating instances or objects, and packages are used to contain related layers or classes together
* What are the three layers in a minimal three layer architecture?
    *  Presentation layer or UI layer, responsible for interacting with the layer
    *  The Business Logic layer, service layer, contains the core functionality and business rules of the application, processes user data received from the presentation layer, and applies the necessary business logic before passing it to the data layer
    *  The Data Access Layer (repository) - responsible for data storage and retrieval, interacts with the database performing CRUd operations and ensures the data's integrity
* What is the repository pattern?
    *  a design pattern used to abstract and encapsulate the data access logic within an app, provides a way to separate the data access logic from the business logic, which allows for a more organized and manageable codebase
    *  Encapsulation - hides the details of data access from the rest of the app, the business logic layer does not need to know how the data is stored or retrieved.
    *  Abstraction - provides a consistent and simple interface for accessing the data, regardless of the underlying data source
    *  Decoupling, decouples business logic and data access logic which allows for easier maintenance and flexibility
* What problem does a test double solve when writing unit tests?
    *  allows you to not touch production data, keeping it safe from unwanted change
* What is the MVC pattern?
   *  A design pattern used to separate the concerns of an application into three interconnected components, this helps organize code, and make it easier to manage and extend, and maintain
   *  Model - represents the applications's data nad business logic, directly manages the data, logic and rules of the applications
   *  View - represents the UI and how the data is presented to the user, renders the model data in a form that the user can interact with
   *  Controllers, acts as an in-between the model and view, processes the user input, and interacts with the model to retrieve or update the data, and returns the appropriate view to the suer 
* What is dependency injection?
    * (DI) is a design pattern that causes Inversion of Control (IoC) involves providing an object with its dependencies rather than have the object create or locate them itself
    * this makes the system more modulate, easier to test, and more maintainable
* How does dependency injection help you to create loosely coupled classes?
    * by providing an object with its dependencies rather than have the object create or locate them itself

### Module 4 - Spring & Functional Idioms

* Why was it necessary for Java to include the `BigDecimal` type?
    *  to represent non-integer numbers, with a precision limited only by the computer's memory. BigDecimal is generally more accurate than the more commonly used primitive double data type, and is able to represent a greater range of values.
* What are the some of the major differences between implementing Spring DI using XML configuration vs using annotations?
     *  XML is done in a XML file, such as applicationContext.xml
     *  need to explicitly define beans using XML tags
     *  all dependencies and properties are wired within the xml file
     *  Using Annotations, configured directly in the Java classes using annotations
     *  such as @Component, @Autowired, @Bean @Configurations
     *  Dependencies are injected directly into fields, methods, or constructors
* What is a lambda or anonymous method?
    * a function or block of code that can be defined without being bound to an identifier, like no name, used to create short concise functions that are passed as arguments, or used within other methods can be used within collections
* How does using the Streams API to solve a data related problem compare to writing imperative code (loops, conditional statements, etc.)?
    * offers a functional programming approach compared to the more traditional imperative style, which uses loops and conditional statements
    * Streams are more concise due to chaining operations like filtering, mapping, and reducing.
    * Declarative, expresses the what rather than the how
    * Readable, streams make code more readable by clearly expressing the transformation of data.

## Part 2: Java Database and Web Dev

### Module 6 - Docker and Relational Databases

* What is normalization?
    * Data normalization, is the process of organizing the fields and tables of a relational database to minimize the redundancy and dependency
* What are primary and foreign keys, and what are the relationship between them?
    * a primary key is a unique identifier for each record in a database table
    * a foreign key in one table uniquely identifies a row of another table, this establishes and enforces a link between the data within two tables
* What are the four kinds of relationships tables can have with other tables?
    * One-to-one (1:1) Relationship, a single record in one table is associated with a single record another table , each row in both tables corresponds directly to one and only one row in the other table
    * One-to-Many (1:N) Relationship - in a one-to-many relationship, a single record in one table can be associated with one or more records in another table, however each record in the related table can be associated with only one record in the first table
    * Many-to-One (N:1) Relationship - A many-to-one relationship is the inverse of a one to many relationship, manes many records in one table can be related to a single record in another table
    * Many-to-Many (N:N) Relationship - In a many-to-many relationship, multiple records in one table can be associated with multiple records in another table. This relationship is ofter represented by a join table.
* What are the ACID guarantees?
    * Atomicity - each transaction is treated as a single, indivisible unit, all operations within the transaction are completed successfully or none are applied. If any part of the transaction fails, the entire transaction is rolled back to its original state
* What are some common data types in SQL?
    * Int, SmallInt, BigInt
    * Decimal or Numeric
    * Float
    * Real
    * String Data Type
    * Date and Time Data Type
    * Boolean
    * Binary Data Types
    * Enum
* What are joins in SQL?
    * joins are used to combine rows from two or more tables based on a related column between them, allows us to retrieve data spread across multiple tables in a meaningful way.
    * INNER JOIN - retrieves only the rows that have matching values within both tables, no match, that row is excluded from the row
    * LEFT OUTER JOIN - returns ALL the rows from the left table, if there is not match returns NULL for the right table's results
    * RIGHT OUTER JOIN - returns ALL the rows from the right table, if theres is not a match returns NULL for the left table's results
    * FULL OUTER JOIN - returns ALL rows from both tables, if theres is no match, it returns null for columns where a match is missing for EITHER table

### Module 7 - Java Database Connectivity and REST with Spring Boot

* What is a JDBC driver?
    * A JDBC driver is a software component that enables Java applications to interact with databases using the Java Database Connectivity (JDBC) API. Act's sort of like a bridge between the Java application and the database, and translates Java method calls (SQL queries, updates, etc.) into database-specific commands.
    * Manages the communication between the application and the database
* What are some of the advantages of Spring's JdbcTemplate?
    * JdbcTemplate is a core component of the Spring Frameworks's JDBC abstraction, simplifying database access and reducing boilerplate code
    1. Simplified code, eliminated much of the repetitive boilerplate code
    2. Exception Handling - translates SQL exceptions into Spring's runtime exceptions (checked SQLException -> DataAccessException) - this makes exception handling way more flexible, and allows us to handle errors consistently
    3. Query Parameterization - supports parameterized queries, which prevents SQL injection attacks and ensures that parameters are safely handled -> allows us to use ? placeholders and pass parameter values, which makes queries more readable and secure
    4. RowMapper and ResultSet Extractor - provides flexible APIs for mapping database rows to Java objects
    5. Support for Batch Processing
    6. Callback Mechanism for Custom Logic
    7. Transaction Management
    8. Support for Stored Procedures and Callable Statements
    9. Declarative SQL Execution
* What are some common HTTP request methods?
    * GET - retrieve data from the server
    * POST - send data to the server to create or update a resource
    * PUT - Update or replace an existing resource on the server
    * PATCH - Partially update a resource
    * DELETE - Remove a resource from the server
* What does a typical HTTP request and response look like?
    * usually have a Request Line, Headers, and Body(optional)
    * GET /api/users/123 HTTP/1.1
    * HTTP/1.1 404 Not Found
* What does the status code 200 mean?
    * means OK which indicates that the client's request was successful received, understood, and was processed by the server, this is the most common HTTP status code, and this is used to signal that everything is working as expected
* What are RESTful services?
    * web-services that adhere to the principles of Representational State Transfer(REST), this is a software architectural style which is designed for scalable and flexible web applications.
    * allows systems to communicate over HTTP by making use of standard HTTP methods like GET,POST,PUT,DELETE, and others
    * Statelessness
    * Client-Server Architecture
    * Resources and URIs (Uniform Resource Identifiers)
    * HTTP Methods
* What are some differences between PUT and POST methods?
    * PUT is Idempotent, used to update or replace an existing resource, or create a new resource at a specific URI if it doesn't exist, same PUT request is sent multiple times, the result remains the same, location specific, specifies the exact location URI and where the resource should be created or updated
    * POST - Non-idempotent, used to create new resources, same POST request is sent multiple times, can result in the creation of multiple resources (non-idempotent behavior) - and is server controlled, server will decide the location (URI) where the resource is created, the client won't specify it directly
* What are some advantages to using Spring Boot?
    * Spring Boot is an extension of the Spring framework that simplifies the development of Java applications, especially when building microservices and web-based applications
    1. Rapid Application development
        * Auto-Configuration - automatically configures Spring and third-part libraries base on the dependencies included in your project
        * Embedded Servers - Tomcat, Jetty, Undertow, run as a standalone executable JAR
        * Minimal Configuration - defaults nad auto config
    2. Microservices-Friendly
    3. Reduced Boilerplate Code
    4. Starter Dependencies
    5. Production-Ready-Features
    6. Easy Testing
* What does an Embedded Server mean in Spring Boot?
    * Embedded Servers: Spring Boot comes with embedded servers like Tomcat, Jetty, and Undertow, allowing you to run the application as a standalone executable JAR without needing an external application server.
* What does the annotation `@SpringBootApplication` do?
    * a key feature in Spring Boot, serves as a convenient shortcut that combines three important annotations to simplify the configuration of Spring applications, typically placed on the main class that bootstraps the Spring Boot application.
    * Configuration - designates class as a source of bean definitions
    * EnableAutoConfiguration - auto-configuration, automatically configures Spring and Third-party libraries based on the dependencies present within the class-path
    * ComponentScan - allowing Spring to automatically detect and register beans that are annotated with @Component, @Service, @Repository, @Controller
    * It ensures that Spring picks up all the components in your application and wires them into the application context.
* What is CORS and how is it useful?
    * CORS(Cross-Origin Reroute Sharing) is a security mechanism that allows web applications running on one domain(or origin) to request resources from a server on a different domain. It is enforced by web browseres to prevent security risks, such as malicious scripts on one site accessing sensitive data from another site without permission
    * CORS is essential for ensuring secure and controlled cross-origin communication in web applications. It allows servers to specify which domains can access their resources, enabling safe resource sharing across different origins while protecting against security risks like cross-site request forgery (CSRF).

### Module 8 - Front End Development

* What's the difference between the == and === operators?
    * == means soft equality, so type of data doesn't matter just value, while === is strict equality, meaning data type and value must match for it to be true.
* Can you explain what type coercion is in JavaScript?
    * this is what happens when JavaScript automatically converts the values from one data type to another, implicit coercion is when JS automatically converts a value to another type without explicit instruction from the developer such as adding a integer and string number together, Explicit coercion is when u manually convert a value form one type to another using built-in JS functions such as Number() and String()
* What is a closure in JavaScript?
    * a closure is a feature where a inner function has access to the variables from its outer(enclosing) functions, even after the outer function has finished executing, this is to allow the inner function to remember the environment in which it wa created.
    * A closure has access to:
    * Variables defined within its own scope.
    * Variables defined in its outer function’s scope.
    * Global variables.
* What are some differences between Java and JavaScript?
    * Java is a compiled language while JavaScript is a interpreted language
    * oop language, allows developers to write code that can run on multiple platforms (write once run anywhere) mostly used for backend development
    * JavaScript is mainly used for adding interactivity to webpages, mostly used in web development for both client-side and server-side with Node.js
* What is the `this` keyword in JavaScript?
    * the this keyword refers to the object it belongs to, and the value is determined based on the context in which it is used. the behavior of this changed depending on where and how it is called
    * global context, this refers to the global object, window in browsers, and global in Node
    * inside a function in non-strict mode, when a regular function is called, this refers to the global object. In strict mode ('use strict'), this is undefined.
    * Inside a method, this refers to the object the method belongs to.
    * Arrow functions do not have their own this value. Instead, they inherit this from the enclosing lexical context.
    * When used in event handlers, this refers to the element that triggered the event.
    * You can explicitly set the value of this using call(), apply(), or bind().
* Can you pass a function as an argument to another function?
    * yes in JS and many other programming languages, you can pass a function as an argument to another function, functions in JS are first-class objects, meaning they are treated like any other value, passed as arguments, returned from other functions, and can be stored in variables, commonly used in callbacks
* In JavaScript, what is the difference between null and undefined?\
    * undefined is a primitive type, represents a variables that has been declared but not yet assigned a value
    * null is also a primitive type, but denotes nothing or empty, represents itself as a special value of nothingness
* What is a promise in JavaScript?
    * A Promise is an object that represents the eventual completion or failure or an asynchronous operation and its resulting value, it is a way to handle async operations more efficiently rather than using callbacks, which provide a cleaner and more structured approach
* What are the states of a promise?
    * Pending: The initial state, meaning the operation has not yet completed, and its result is not yet available.
    * Fulfilled: The operation completed successfully, and the promise has a resolved value.
    * Rejected: The operation failed, and the promise has a reason for the failure (an error).

### Module 9 - React

* What is JSX?  Can JSX be read by a web browser?
    * JSX (JavaScript XML) - is a syntax extension, commonly used with React, in-order to describe what the UI should look like
    * web browsers can, not directly read or understand JSX, browsers can only interpret plain JS, HTML and CSS, it needs to be transformed into regular JavaScript before it can run in the browsers
    * This transformation is typically done by tools like Babel, which is a JS compiler that converts JSX into JS
* In React, what is state and how is it used?
    * State is an object that holds data that can change over time and influences how a component renders, 
    * one of the core features in React, for managing dynamic data within a component
    * Stateful Components: Components that manage their own internal state. When the state changes, the component re-renders to reflect the updated data.
    * Updating State: React provides the setState function (or useState in function components) to update the state. When state is updated, React automatically re-renders the component with the new data.
    * Local to the Component: Each component can manage its own state, which means state is local to the component where it’s defined.
* What is Babel used for?
    * Babel is a JS compiler that is used to convert modern JS (such as newer ECMAScript and JSX) into a form that can be understood by older browsers and environments.
    * Babel boiled down basically ensures that your JS code works across multiple different browsers, even if they do not support the newest version of JS.
* What are some differences between ES6 syntax from ES5?
    * Let and Const vs Var
    * Arrow functions - const add = (a, b) => a + b;
    * Template literals - const greeting = `Hello ${name}!`;
    * Classes
    * Default parameters
    * Rest and Spread operators
    * Promises
* What are React Hooks?
    * React hooks are functions that allow you to use state and other React features in functional components, without having to use class components.
    * Allows us to "hook into" React's life cycle and state management within functional components, which improves power and flexibility of our app.
* What is React Router used for?
    * Allows navigation between different views or pages within a React applications
    * Mainly used for building single-page applications(SPAs) and allowing dynamic navigation and URL management
* What is the purpose of React Context?
    * A feature within React that provides a way to share values or a "global" state across components without having to prop-drill manually to each level.
    * It is designed to manage data that needs to be accessible by multiple components, such as user information, theme settings, or app-wide configurations, without the need for "prop drilling.
### Module 10 - Security

* What are authentication and authorization, and which needs to come first?
    * Authentication is the process above verifying the identify of a user
    * Authorization determines what the authenticated user is allowed to do
* Authentication needs to come first because the system must know who the user is before determining what they are allowed to do.
* What is JWT?
    * a JSON Web Token, used tor securely transmitting information between parties as a JSON object.
* What is the structure of a JWT?
    * Consists of three parts separated by dots
    * Header, containing the metadata about the token, including type of token and the signing algorithm
    * Payload, contains the claims which are statements above the user or any other data - common claims includes userID, expiration time and roles
    * Signature, created by signing the header and payload using a secret key or private key, which ensures the token's integrity
* How does a security filter chain work in Spring?
* Why are roles useful in security?
* How should passwords be stored?

[Return to Home](../README.md)
