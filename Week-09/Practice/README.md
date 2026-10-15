# STEP Semester 3 — Week 09 Practice

This folder contains five Java practice programs and the MCQs and conceptual questions for Week 09.

## Part A: Coding Problems

| File | Problem Name | Concepts Used |
|---|---|---|
| Practice1.java | Garden Plot Area Report | Abstraction, Inheritance, Method Overriding |
| Practice2.java | Weekly Staff Pay | Abstract Classes, Inheritance, Overtime Calculation |
| Practice3.java | Library Late Fine Counter | Abstraction, Inheritance, Fine Calculation |
| Practice4.java | Electricity Connection Billing | Abstract Classes, Method Overriding, Billing |
| Practice5.java | Travel Booking with a Common Fee | Abstraction, Inheritance, Common Fee Calculation |

### Problem 1: Garden Plot Area Report
Calculates the area of circular, rectangular, and triangular plots and displays the total area.

- Circle: π × radius × radius
- Rectangle: length × width
- Triangle: 0.5 × base × height

### Problem 2: Weekly Staff Pay
Calculates weekly pay for full-time staff, hourly staff, and interns. Hourly staff receive 1.5 times their normal rate for hours exceeding 40.

### Problem 3: Library Late Fine Counter
Calculates late fines for books, DVDs, and magazines. DVD fines are capped at 50.

### Problem 4: Electricity Connection Billing
Calculates electricity bills for HOME, SHOP, and FACTORY connections using their respective billing rules.

### Problem 5: Travel Booking with a Common Fee
Calculates bus, train, and flight fares. Every booking includes a common booking fee of 50.

## Part B: Quiz — MCQs with Correct Answers

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

Abstraction hides implementation details and exposes essential functionality. Encapsulation combines data and methods within a class and restricts direct access to data using access modifiers such as `private`.

**Example: Bank Account**

A `BankAccount` class can provide a `withdraw()` method to demonstrate abstraction. The account balance can be declared `private` to demonstrate encapsulation.

Together, these concepts simplify how the account is used while protecting its internal data.

### Q3. An abstract class cannot be instantiated, yet it can define a constructor. Explain why and when this constructor executes.

**Answer:**

An abstract class can have a constructor because it may contain common data and initialization logic required by its subclasses.

Although an abstract class cannot be instantiated directly, its constructor executes when an object of a concrete subclass is created. The subclass constructor invokes the parent constructor using `super()`; when omitted, Java inserts an appropriate no-argument superclass constructor call when possible.

### Q4. Explain why an abstract method cannot be declared with `private`, `static`, or `final`.

**Answer:**

An abstract method declares behavior that must be implemented by a subclass.

- **private:** A private method is not accessible to subclasses for overriding.
- **static:** A static method belongs to the class and is not overridden through instance-based polymorphism.
- **final:** A final method cannot be overridden by subclasses.

Therefore, Java does not allow an abstract method to use these modifiers.

### Q5. What is the diamond problem? Explain how Java's inheritance design addresses it.

**Answer:**

The diamond problem occurs when a class inherits from two parent classes that share a common ancestor. If both parents provide the same method or inherited state, it may be ambiguous which implementation or state the child should use.

Java avoids this ambiguity by allowing a class to extend only one class, rather than multiple classes.

Java still allows a class to implement multiple interfaces. If two interfaces provide conflicting default implementations of the same method, the implementing class must resolve the conflict by overriding the method or following the applicable interface inheritance rules.

## Concepts Practiced

- Abstraction
- Abstract classes and methods
- Inheritance
- Method overriding
- Interfaces
- Constructors in abstract classes
- Encapsulation
- Runtime polymorphism
- The diamond problem
- Conditional logic and calculations

**Language:** Java

**Course:** STEP Semester 3
