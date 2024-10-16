# Interview Questions
## Fundamentals 
1. What is Java, and how does it differ from other programming languages?
    - Java is a compiled vs interpreted language, and Java is type-defined
2. What is the difference between a primitive data type and an object in Java?
    - A primitive data type is stored directly in memory 
    - while an object holds a reference to data and can have behaviors (methods")
3. Can you explain the concept of a Java class, and how it relates to object-oriented programming?
    - A Java class is a blueprint or template that defines the structure and behavior of objects in OOP, classes encapsulate data and methods.
4. How do you declare and use variables in Java, and what is the difference between local and global variables?
    - You can declare variable by specifying the data type followed by the variable name
    - Local variables are declared inside a method, constructor, block of code etc. Can only be accessible within that scope
    - Global variables are are declared within the class but outside the method, they are accessible throughout the entire class
5. What is the difference between an abstract class and an interface in Java, and when would you use each one?
    - Abstract class is a class that cannot be instantiated on its own and may contain abstract methods, (no body) mainly intended to be subclassed, allowing other classes to inherit its methods and variables
    - an interface is a completely abstract type that is used to define a contract, (a set of methods that a class MUST implement) can only contain abstract methods, just saying the what not the how.
6. How do you handle exceptions in Java, and what is the purpose of try-catch blocks?
    - handle exceptions by adding the exception to the method, purpose of try-catch blocks are to reduce errors
7. What is the difference between static and non-static methods in Java, and when would you use each one?
    - static is for to be used within the class, while non-static is to be used outside.
8. How do you create and use arrays in Java, and what is the difference between a one-dimensional and multi-dimensional array?
    - int[] numbers; is how you declare an array,
    - a one dimensional array  is a list of elements arranged in a single row
    - int[][] matrix; declaration of a multi-dimensional array
    - a multi-dimensional array can be seen as a array of arrays, most common type is a 2D array,
9. Can you explain the concept of polymorphism in Java, and how it relates to object-oriented programming?
    - Polymorphism is a key principe of OOP. 
    - In Java, polymorphism allows a single method or operator to perform different tasks based on the object that it acts upon.
    - Polymorphism promotes key OOP principles, like inheritance and abstraction, and facilitates dynamic method dispatch.
10. What are the four pillars of Java, and why are they important?
    1. Encapsulation
        - Encapsulation refers to bundling the data (variables) and the methods (functions) that manipulate that data into a single unit, usually a class. It also means restricting access to certain details of an object and exposing only the necessary parts. This is often achieved through access modifiers like private, protected, and public.
    2. Abstraction
        - Abstraction involves hiding the implementation details and showing only the functionality to the user. In Java, this is achieved through abstract classes and interfaces. Abstraction focuses on what an object can do, not how it does it.
    3. Inheritance
        - Inheritance allows a new class (subclass or child class) to inherit the properties and methods of an existing class (superclass or parent class). This enables code reuse and the creation of hierarchical relationships between classes.
    4. Polymorphism
        - Polymorphism allows objects of different types to be treated as objects of a common superclass. It means "many forms," and it allows a single interface or method to represent different forms of behavior depending on the object that it interacts with.
11. What is polymorphism, and how is it implemented in Java?
    - Compile-time polymorphism (Method Overloading)
    - Run-time polymorphism (Method Overriding)
    - Compile-time polymorphism, also known as method overloading, occurs when multiple methods in the same class have the same name but different parameter lists
    - Run-time polymorphism, also known as method overriding, occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.
    - Polymorphism allows us to use a single method or class in many forms, reducing code duplication.
    -  Since methods can be overridden, changes made in a subclass do not affect the parent class. This makes the code more flexible and easier to maintain.
    - It allows the addition of new classes with minimal changes to the existing code. For example, you can create new subclasses and override existing methods without modifying the parent class.
12. Can you explain how inheritance works in Java and show me an example? 
    - Inheritance in Java is a mechanism where one class (the subclass or child class) inherits the properties and behaviors (fields and methods) of another class (the superclass or parent class). This allows the subclass to reuse the code in the superclass, and also to add new fields or methods, or override existing methods from the superclass.
    - A subclass inherits all non-private fields and methods from the superclass.
    - It can add new methods and fields.
    - It can override methods in the superclass to provide its own implementation.

## Interfaces 
1. What is an interface in Java, and how does it differ from a class?
    - an interface is a reference type similar to a class, it defines a contract for what  class can do, rather how it does it
2. How do you declare an interface in Java, and what is the syntax for doing so?
    - by using the interface modifier, and then the Interface name, as well as the abstract methods and constants
3. Can you give an example of a real-world scenario where interfaces might be useful in Java?
    - an interface is particularly useful when you need to define a common behavior across different classes
    - this will allow them to follow the same contract without specifying how the behavior is implemented
    - can be very useful for payment processing and dealing with different types of payment
4. What is the purpose of implementing an interface in Java, and how is it related to inheritance?
    - The purpose of implementing an interface in Java is to define a contract that a class must adhere to, ensuring that the class provides specific behavior or functionality without dictating how it should be done. It allows you to achieve abstraction and polymorphism while promoting loose coupling between components.
    - Interfaces provide a form of inheritance by specifying a set of methods that must be implemented by the class. This is known as interface inheritance or specification inheritance.
    - Unlike class inheritance, where a subclass can inherit behavior, interfaces only provide the method signatures, leaving implementation up to the class.
    - Interfaces enable multiple inheritance (through method contracts) while avoiding the complexities of class-based multiple inheritance, which Java doesn’t support.
5. How do you declare and use methods in an interface in Java, and what is the difference between default and static methods?
    - in Java, when you declare a method within the interface, it must be implemented by classes that implement the interface.
    - interfaces can have default and static methods
    - default methods
        1. can be overridden by the implementing class
        2. provide a default implementation that classes can use or override
        3. invoked on instances of the implementing class
    - static methods
        1. cannot be overridden
        2. are not associated with any class instance, and are called on the interface itself
        3. useful for utility methods, that are related to the interface, and do not need instance-specific behavior
6. How do you create a class that implements an interface in Java, and what is the syntax for doing so?
    1. declare the class using the implements keyword, followed by the name of the interface.
        - public interface MyInterface 
    2. provide the implementations for all the abstract methods defined in the interface
        - unless the class is abstract in which it doesn't need to be implemented immediately
7. Can you explain the concept of multiple inheritance in Java, and how interfaces can be used to achieve it?
    - it is the concept of when a class inherits from more than one parent class
    - usually this concept is not allowed with classes in JAva in-order to avoid the Diamond Problem, where a class could inherit conflicting behavior from two or more parent classes
    - HOWEVER it is supported with interfaces, since interfaces only define abstract methods, there is no risk of conflicting method implementations
        - public class MyClass implements InterfaceA, InterfaceB (syntax)
8. What is the purpose of the "implements" keyword in Java, and how is it used to indicate that a class implements an interface?
    - the implements keyword is used to indicate that the class is implementing an interface
    - the purpose of implements is that it defines a contract between the interface and the complementing class
    - supports multiple inheritance
        - Java doesn't support multiple inheritance of classes, but allows inheritance from multiple interfaces using the implements keyword
    - polymorphism, by using the implements keyword, an object of the implementing class can be treated as an instance of the interface type, which allows for polymorphism
9. Can you create an example of a Java program that uses interfaces to model a real-world relationship between objects?
    - a vehicle and a car
10. What is the difference between an abstract class and an interface?
    - Abstract
        * Can have both abstract methods(w/o a body) and concrete methods(with a body)
        * allows default behavior to be shared among subclasses through non-abstract methods
        * Can have fields (instance variables) and can define constructors to initialize them.
        * A class can inherit from only one abstract class (single inheritance).
        * Methods and fields can have various access levels (private, protected, public).
        * Used when classes share a common base with some shared implementation and you want to enforce a "is-a" relationship. It allows common logic to be reused.
        * Can have constructors to initialize state.
    - Interface
        * interface should only declare abstract methods, in Java 8 can allow default and static methods
        * no instance fields or constructors, so behavior is mainly declared, not implemented
        * Cannot have instance fields. Fields in interfaces are implicitly public, static, and final (i.e., constants).
        * A class can implement multiple interfaces (multiple inheritance of type).
        * Methods are implicitly public (default, static, and abstract methods). Fields are public static final.
        * Used to define a contract or behavior that classes should follow, without enforcing how it is done. It allows for different types of objects to implement the same behavior.
        * Cannot have constructors, as interfaces do not maintain state.
## Inheritance 
1. What is inheritance in Java, and how does it relate to object-oriented programming?
    - a core concept of object-oriented programming (OOP) which allows one class to inherit the properties and behaviors from another class
    - this mechanism promotes code reuse, and establishes a hierarchical relationship between classes
    - Inheritance in Java aligns with the OOP principle of Abstraction and Code Reusability
    - It forms a class hierarchy, which also supports polymorphism, allowing objects of different subclasses to be treated as objects of their superclass, enhancing the flexibility of the code.
2. Can you give an example of a real-world scenario where inheritance might be useful in Java?
    - by having a super/parent class, and then have the more defined sub-classes inherit methods and fields from the super class
3. How do you define a superclass and a subclass in Java, and what is the relationship between the two?
4. What is the difference between inheritance and composition in Java, and when would you choose one over the other?
5. How do you use the "extends" keyword to create a subclass in Java, and what is the syntax for doing so?
6. What is the purpose of the "super" keyword in Java, and when would you use it?
7. Can you explain the concept of method overriding in Java, and how it is related to inheritance?
8. How do you prevent a subclass from inheriting a method or variable from its superclass in Java?
9. What is the diamond problem in Java, and how can it be resolved using interfaces?
10. Can you give an example of a Java class hierarchy that uses inheritance to model a real-world relationship between objects?


## Java Collections
1. What are Java collections, and how are they useful in programming?
2. Can you give an example of a collection in Java, such as an ArrayList or HashMap?
3. What is the difference between a List and a Set in Java, and when would you use each one?
4. How do you add and remove elements from a collection in Java, and what is the syntax for doing so?
5. What is the difference between an Iterator and a ListIterator in Java, and how do they relate to collections?
6. Can you explain the concept of sorting a collection in Java, and what is the difference between natural ordering and a custom comparator?
7. How do you handle duplicates in a collection in Java, and what is the purpose of the "equals" and "hashCode" methods?
8. What is the difference between a shallow copy and a deep copy of a collection in Java, and when would you use each one?
9. How do you serialize and deserialize a collection in Java, and what is the purpose of doing so?
10. Can you give an example of a Java program that uses collections to solve a real-world problem, such as processing data from a file or database?
11. What are the benefits of using Java collections?

## Exceptions
1. What is an exception in Java, and how does it differ from a regular error?
2. How do you handle exceptions in Java, and what is the purpose of try-catch blocks?
3. Can you explain the concept of the "throws" keyword in Java, and how it is used to indicate that a 4. method might throw an exception?
4. What is the difference between a checked and an unchecked exception in Java, and when would you use each one?
5. How do you create your own custom exceptions in Java, and what is the syntax for doing so?
6. Can you explain the concept of exception propagation in Java, and how it can be used to handle errors at different levels of a program?
7. What is the purpose of the finally block in Java, and how is it used to ensure that certain actions are taken even if an exception is thrown?
8. How do you use multiple catch blocks in Java to handle different types of exceptions, and what is the order of execution?
9. What is the difference between the printStackTrace() and getMessage() methods in Java, and how are they used to diagnose and debug errors?

## Testing 
1. What is unit testing in Java, and how does it differ from other forms of testing?
2. What is the purpose of a JUnit test case in Java, and how do you create and run one?
3. Can you explain the concept of a test fixture in Java, and how it is used to set up test data and conditions?
4. What is the difference between a test method and a test suite in Java, and how do you create and use each one?
5. How do you use assertions in Java to verify the behavior of your code during testing, and what is the syntax for doing so?
6. What is the difference between a white-box test and a black-box test in Java, and when would you use each one?
7. How do you use mock objects in Java to simulate behavior that is not yet implemented or is difficult to test?
8. Can you explain the concept of code coverage in Java, and how it is used to measure the effectiveness of your tests?
9. How do you integrate unit testing into a larger development process in Java, such as continuous integration and continuous delivery?
10. Can you give an example of a Java program that uses unit testing to ensure correct behavior, and how the tests were designed and implemented?
11. What are the 3A's of unit testing, and why are they important?

## Spring Boot / JDBC 
1. What is Spring Boot, and how does it simplify the process of building Java web applications?
2. How do you integrate Spring Boot with JDBC, and what are some common configuration options for the JDBC connection?
3. How do you use Spring Boot to execute SQL queries against a database, and what are some best practices for writing efficient queries?
4. How does Spring Boot support data persistence, and what are some popular data storage options that can be used with Spring Boot?
5. How do you implement data access layer using Spring Boot, and what are some best practices for structuring the code?
6. What is the role of JPA (Java Persistence API) in Spring Boot, and how do you use it to map Java objects to relational database tables?
7. How do you handle database transactions in Spring Boot, and what are some common pitfalls to avoid?
8. How do you secure your Spring Boot application, and what are some common security vulnerabilities to be aware of?
9. How do you write unit tests for Spring Boot applications that use JDBC, and what are some best practices for testing data access layer?
10. How do you optimize the performance of Spring Boot applications that use JDBC, and what are some techniques for profiling and tuning the database queries?

## Agile Workflow 
1. What is Agile workflow, and how does it relate to Java development?
2. What is agile methodology, and how does it differ from traditional project management approaches?
3. Can you explain the concept of sprints in agile development, and how they are used to manage work and deliverables?
4. How do you use user stories in agile development to identify requirements and prioritize work?
5. What is the purpose of a product backlog in agile development, and how is it used to manage work and priorities?
6. Can you explain the concept of a retrospective in agile development, and how it is used to reflect on past work and improve future work?
7. How do you use agile development to manage dependencies and coordinate work across multiple teams?
8. What is the difference between a product owner and a scrum master in agile development, and how do their roles differ?
9. Can you explain the concept of continuous integration in agile development, and how it is used to ensure code quality and improve development speed?
10. What is the difference between a kanban board and a scrum board in agile development, and how are they used to manage work and progress?
11. Can you give an example of a Java project that uses agile development, and how the project was designed and implemented to follow agile principles and practices?
