# Object-Oriented Programming (OOP)

This project briefly explains Object-Oriented Programming (OOP) and documents the 4 basic principles of OOP with code examples in Java.

**OOP** = a programming paradigm based on the concept of objects (everything is an object)

An object contains:

- **Data** = state *(also called fields, attributes or properties)*
- **Code** = behaviour *(also called methods or functions)*

In a class-based OOP language (such as Java), a **class** is a blueprint for **creating objects** -> an object = an **instance of the class**

## The 4 basic principles of OOP

### Encapsulation

= the bundling of related fields and methods inside a single class [^1]

- Achieve data hiding **data hiding** and **abstraction**
- Can be achieved by declaring all the variables in the class as **private**, and writing **public methods** in the class to **set** and **get** the values of variables

### Inheritance

= inheriting properties and behaviours from a parent class [^2]

- Code reusability
- Can be achieved by creating a **child class** (extend parent class)
- Achieve abstraction
- Achieve runtime polymorphism with method overriding

### Abstraction

= only showing essential attributes & hiding unnecessary details from the user [^3]

- Reducing programming complexity
- Hiding the implementation
- Can be achieved using **abstract classes** or **interfaces** (using inheritance)

### Polymorphism

= perform a single action in different ways (can take many forms) [^4]

- Easier to read and maintain code
- Hide implementation details by interacting with a group of different classes through a common interface
- Achieved in two ways:
  - **method overloading** *(compile time / functional polymorphism)* 
  - **method overriding** using inheritance *(runtime / object polymorphism)*

[^1]: References [Programiz](https://www.programiz.com/java-programming/encapsulation) & [GeeksforGeeks](https://www.geeksforgeeks.org/encapsulation-in-java/)

[^2]: References [Medium](https://medium.com/@andrewkoenigbautista/inheritance-in-object-oriented-programming-d8808bca5021) & [GeeksforGeeks](https://www.geeksforgeeks.org/inheritance-in-java/)

[^3]: References [Guru99](https://www.guru99.com/java-data-abstraction.html) & [TechVidvan](https://techvidvan.com/tutorials/abstraction-in-java/)

[^4]: References [GreatLearning](https://www.mygreatlearning.com/blog/polymorphism-in-java/) & [Medium](https://betterprogramming.pub/everything-you-need-to-know-about-polymorphism-7a7976ca8987)
