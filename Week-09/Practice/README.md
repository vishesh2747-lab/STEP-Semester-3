# Week 09 — Practice

## Part A: Coding Problems

This folder contains five Java programs demonstrating abstraction, abstract classes, inheritance, and method overriding.

| File | Problem |
|---|---|
| Practice1.java | Garden Plot Area Report |
| Practice2.java | Weekly Staff Pay |
| Practice3.java | Library Late Fine Counter |
| Practice4.java | Electricity Connection Billing |
| Practice5.java | Travel Booking with a Common Fee |

## Part B: Quiz — MCQs with Answers

### Q1. Which of the following best describes abstraction in object-oriented programming?

A. Showing all internal details of an object to the user  
B. Protecting data inside an object from unauthorized access  
**C. Hiding how an object performs its operations and showing only what it does. (Correct)**  
D. Allowing a class to inherit from multiple parent classes  

### Q2. Which statement about an abstract class in Java is true?

A. It must contain at least one abstract method  
B. It can be instantiated if it has no abstract methods  
**C. It cannot be instantiated directly. (Correct)**  
D. It can extend multiple other classes  

### Q3. If a concrete class extends an abstract class but fails to implement an inherited abstract method, what is the consequence?

A. Java automatically provides an empty implementation for the method  
**B. The class must be declared abstract, or the code will not compile. (Correct)**  
C. A runtime error will occur only when the unimplemented method is called  
D. The compiler will issue a warning but still allow compilation  

### Q4. Which modifier is NOT allowed for an abstract method in Java?

A. protected  
B. public  
**C. private (Correct)**  
D. default (package-private)  

### Q5. Fields declared within a Java interface are implicitly:

A. private and static  
B. protected and final  
**C. public, static, and final. (Correct)**  
D. public and instance-specific  

### Q6. How many interfaces can a single Java class implement?

A. Only one interface at a time  
B. At most two interfaces  
**C. Any number of interfaces. (Correct)**  
D. None, if the class already extends another class  

### Q7. If a class implements an interface, what access modifier must it use for the implemented methods?

A. default (package-private)  
B. private  
C. protected  
**D. public (Correct)**  

### Q8. Why does Java allow a class to implement multiple interfaces but only extend a single class?

A. Implementing interfaces makes the code run faster  
B. Classes are unable to contain any methods  
**C. Interfaces carry no instance state, avoiding the diamond problem ambiguity with conflicting data inheritance. (Correct)**  
D. Interfaces are compiled independently from classes  

### Q9. What happens if a class implements two interfaces that both provide a default method with the same signature, and the class does not override this method?

A. The method from the first interface listed in the implements clause is used  
B. The method from the last interface listed in the implements clause is used  
C. A runtime exception occurs when the method is called  
**D. A compile-time error occurs until the class overrides this method. (Correct)**  

### Q10. Which statement is true regarding constructors in Java?

A. Concrete classes cannot have constructors  
**B. Abstract classes can have constructors that run when a subclass object is created. (Correct)**  
C. Interfaces must have at least one constructor  
D. Constructors in abstract classes are used to create objects of the abstract class directly  

## Part C: Conceptual Questions and Answers

### Q1. Explain abstraction in your own words. Provide a real-life example, detailing what is shown to the user and what details are hidden.

**Answer:**

Abstraction is an OOP concept that hides implementation details and shows only the essential functionality to the user. It reduces complexity and makes programs easier to use.

**Example: Online Food Ordering App**

- **Shown to the user:** Selecting food, placing an order, making payment, and tracking delivery.
- **Hidden details:** Database operations, payment verification, restaurant order management, and delivery assignment.

The user can order food without knowing how these internal operations work.

In Java, abstraction can be achieved using abstract classes and interfaces.

### Q2. Describe the primary difference between abstraction and encapsulation. Explain how they work together within a single class.

**Answer:**

Abstraction and encapsulation are two important OOP concepts, but they serve different purposes.

- **Abstraction** hides implementation details and exposes essential functionality.
- **Encapsulation** combines data and methods within a class and restricts direct access to data using access modifiers such as `private`.

**Example: Bank Account**

A `BankAccount` class can provide a `withdraw()` method to demonstrate abstraction. The account balance can be declared `private` to demonstrate encapsulation.

Together, they simplify how the account is used while protecting its internal data.

### Q3. An abstract class cannot be instantiated, yet it can define a constructor. Explain why and when this constructor executes.

**Answer:**

An abstract class can have a constructor because it may contain common data and initialization logic required by its subclasses.

Although an abstract class cannot be instantiated directly, its constructor executes when an object of a concrete subclass is created. The subclass constructor invokes the parent constructor using `super()`; if omitted, Java inserts an appropriate no-argument superclass constructor call when possible.

**Example:**

```java
abstract class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor");
    }
}
```

When `new Dog()` is executed, the output is:

```text
Animal constructor
Dog constructor
```

### Q4. Explain why an abstract method cannot be declared with `private`, `static`, or `final`.

**Answer:**

An abstract method declares behavior that must be implemented by a subclass. The following modifiers conflict with this purpose:

- **private:** A private method is not accessible to subclasses for overriding.
- **static:** A static method belongs to the class and is not overridden through instance-based polymorphism.
- **final:** A final method cannot be overridden by subclasses.

Therefore, Java does not allow an abstract method to use these modifiers.

### Q5. What is the diamond problem? Explain how Java's inheritance design addresses it.

**Answer:**

The **diamond problem** occurs when a class inherits from two parent classes that share a common ancestor. If both parents provide the same method or inherited state, it may be ambiguous which implementation or state the child should use.

Java avoids this ambiguity by allowing a class to extend only one class, rather than multiple classes.

Java still allows a class to implement multiple interfaces. If two interfaces provide conflicting default implementations of the same method, the implementing class must resolve the conflict by overriding the method or following the applicable interface inheritance rules.

---

## Concepts Covered

- Abstraction
- Abstract classes and methods
- Interfaces
- Constructors in abstract classes
- Method overriding
- Encapsulation
- Multiple interface implementation
- The diamond problem
