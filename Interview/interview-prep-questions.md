
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
* What is the difference between a checked and unchecked exception?
* What is an enumeration?
* When should enums be used? When shouldn't they be used?
* How does an application layer compare to classes and packages?
* What are the three layers in a minimal three layer architecture?
* What is the repository pattern?
* What problem does a test double solve when writing unit tests?
* What is the MVC pattern?
* What is dependency injection?
* How does dependency injection help you to create loosely coupled classes?

### Module 4 - Spring & Functional Idioms

* Why was it necessary for Java to include the `BigDecimal` type?
* What are the some of the major differences between implementing Spring DI using XML configuration vs using annotations?
* What is a lambda or anonymous method?
* How does using the Streams API to solve a data related problem compare to writing imperative code (loops, conditional statements, etc.)?

## Part 2: Java Database and Web Dev

### Module 6 - Docker and Relational Databases

* What is normalization?
* What are primary and foreign keys, and what are the relationship between them?
* What are the four kinds of relationships tables can have with other tables?
* What are the ACID guaratees?
* What are some common data types in SQL?
* What are joins in SQL?

### Module 7 - Java Database Connectivity and REST with Spring Boot

* What is a JDBC driver?
* What are some of the advantages of Spring's JdbcTemplate?
* What are some common HTTP request methods?
* What does a typical HTTP request and response look like?
* What does the status code 200 mean?
* What are RESTful services?
* What are some differences between PUT and POST methods?
* What are some advantages to using Spring Boot?
* What does an Embedded Server mean in Spring Boot?
* What does the annotation `@SpringBootApplication` do?
* What is CORS and how is it useful?

### Module 8 - Front End Development

* What's the difference between the == and === operators?
* Can you explain what type coercion is in JavaScript?
* What is a closure in JavaScript?
* What are some differences between Java and JavaScript?
* What is the `this` keyword in JavaScript?
* Can you pass a function as an argument to another function?
* In JavaScript, what is the difference between null and undefined?
* What is a promise in JavaScript?
* What are the states of a promise?

### Module 9 - React

* What is JSX?  Can JSX be read by a web browser?
* In React, what is state and how is it used?
* What is Babel used for?
* What are some differences between ES6 syntax from ES5?
* What are React Hooks?
* What is React Router used for?
* What is the purpose of React Context?

### Module 10 - Security

* What are authentication and authorization, and which needs to come first?
* What is JWT?
* What is the structure of a JWT?
* How does a security filter chain work in Spring?
* Why are roles useful in security?
* How should passwords be stored?

[Return to Home](../README.md)