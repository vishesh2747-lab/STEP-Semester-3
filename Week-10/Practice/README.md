# STEP Semester 3 — Week 10 Practice

This folder contains Java practice solutions and question answers for Week 10.

## Part A — Coding Problems

### Practice 1: Vowel and Consonant Counter
Count the vowels and consonants in a word.

**File:** `Practice1.java`

### Practice 2: Word Reverser and Palindrome Checker
Reverse a word and check whether it is a palindrome.

**File:** `Practice2.java`

### Practice 3: Even and Odd Numbers in a List
Count the even and odd numbers in a list.

**File:** `Practice3.java`

### Practice 4: In-Place Array Reversal
Reverse an array without creating a second array.

**File:** `Practice4.java`

### Practice 5: Digit Sum and Number Reversal
Calculate the sum of the digits and reverse a number.

**File:** `Practice5.java`

## Part B — MCQ Answers

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

## Part C — Conceptual Questions with Answers

### Question 1: String Immutability

String objects cannot be modified after creation. Repeated String modifications can create temporary objects and increase memory usage. `StringBuilder` reduces this overhead because it allows modification of a mutable character sequence.

### Question 2: The `this` Keyword

The `this` keyword refers to the current object and distinguishes an instance variable from a parameter with the same name.

```java
Student(String name) {
    this.name = name;
}
```

Here, `this.name` is the instance variable, while `name` is the constructor parameter.

### Question 3: Objects and Reference Variables

An object is an instance of a class, while a reference variable refers to an object. Assigning one reference variable to another makes both refer to the same object. Changes made through either reference affect that object.

### Question 4: Static and Instance Variables

A static variable belongs to the class and is shared by all objects. An instance variable belongs to an individual object. A shared visitor count is suitable as a static variable, while a student's name is an instance variable.

### Question 5: `for`, `while`, and `do-while` Loops

A `for` loop is useful when the number of iterations is known. A `while` loop is useful when repetition depends on a condition. A `do-while` loop executes at least once because its condition is checked after the body.

### Question 6: Pass-by-Value in Java

Java always passes arguments by value. For primitive types, a copy of the value is passed. For object references, a copy of the reference is passed, allowing the method to modify the referenced object's state but not reassign the caller's reference.

### Question 7: Integer Division and Type Casting

Integer division discards the fractional part. For example, `5 / 2` produces `2`. Using `(double) 5 / 2` produces `2.5`. Casting after integer division does not restore the discarded fraction.

### Question 8: Encapsulation

Encapsulation protects data by restricting direct access to an object's internal fields. Private fields and public getters and setters provide controlled access. Setters can validate values before updating data.

### Question 9: `==` Versus `equals()`

For object references, `==` checks whether two references point to the same object. `equals()` checks logical equality according to its implementation. Two different String objects containing `"Java"` can be unequal using `==` but equal using `equals()`.

### Question 10: Method Overloading and Overriding

Method overloading defines methods with the same name but different parameter lists and is resolved at compile time. Method overriding provides a subclass-specific implementation of an inherited method and uses runtime polymorphism to select the implementation based on the actual object.

## Language
Java

## How to Compile and Run

Run commands from the `Week-10` parent folder in PowerShell.

Example:

```powershell
javac Practice\Practice1.java
java -cp Practice Practice1
```

Replace `Practice1` with `Practice2`, `Practice3`, `Practice4`, or `Practice5` to run another solution.
