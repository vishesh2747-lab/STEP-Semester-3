# Week-10 Practice

## Part A: Programming Problems

1. **Vowel and Consonant Counter** – Count vowels and consonants in a word.
2. **Word Reverser and Palindrome Checker** – Reverse a word and check whether it is a palindrome.
3. **Even and Odd Counter** – Count even and odd numbers in an array.
4. **Array Reversal** – Reverse an array in place.
5. **Digit Sum and Number Reversal** – Calculate the sum of digits and reverse a number.

## Part B: MCQ Answers

1. D
2. B
3. B
4. D
5. C
6. A
7. B
8. A
9. C
10. B
11. B
12. B
13. A
14. A
15. B
16. A
17. B
18. C
19. C
20. C

## Part C: Conceptual Questions and Answers

### 1. What is String immutability? Why is StringBuilder preferred for repeated modifications?

Strings in Java are immutable, meaning their values cannot be changed after creation. StringBuilder is preferred for repeated modifications because it can modify the same object without creating a new String object each time.

### 2. What is the use of the `this` keyword?

The `this` keyword refers to the current object. It is used to distinguish instance variables from parameters with the same name.

Example:
```java
this.name = name;
```

### 3. What is the difference between an object and a reference?

An object is an instance of a class stored in memory. A reference stores the information needed to access that object. Multiple references can point to the same object.

### 4. What is the difference between static and instance variables?

A static variable belongs to the class and is shared by all objects. An instance variable belongs to an individual object, so each object has its own copy.

### 5. Differentiate between for, while, and do-while loops.

- **for:** Commonly used when the number of iterations is known.
- **while:** Checks the condition before each iteration.
- **do-while:** Executes the body at least once before checking the condition.

### 6. Explain pass-by-value in Java.

Java always uses pass-by-value. For primitive types, a copy of the value is passed. For objects, a copy of the reference is passed, allowing changes to the object's state but not reassignment of the caller's reference.

### 7. Why does integer division remove the fractional part?

When two integers are divided, Java discards the fractional part of the result.

Example:
```java
System.out.println(5 / 2);         // 2
System.out.println((double) 5 / 2); // 2.5
```

Casting before division preserves the fractional part.

### 8. What is encapsulation?

Encapsulation combines data and methods in a class and restricts direct access to data using access modifiers such as `private`. Getters and setters can provide controlled access.

### 9. Differentiate between `==` and `equals()`.

- `==` compares primitive values or checks whether object references point to the same object.
- `equals()` checks logical equality when the class implements an appropriate version of the method.

### 10. Differentiate between method overloading and method overriding.

- **Overloading:** Multiple methods have the same name but different parameter lists. It is resolved at compile time.
- **Overriding:** A subclass provides its own implementation of an inherited method. The selected implementation depends on the object's runtime type.

## Language

Java

## Compile and Run

From the Week-10 folder in PowerShell:

```powershell
javac Practice\Practice1.java
java -cp Practice Practice1
```

Replace `Practice1` with the program name you want to run.
