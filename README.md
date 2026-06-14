# Java Method Overloading Calculator

## Overview

This project demonstrates **Method Overloading** in Java, one of the key concepts of **Compile-Time Polymorphism**.

The Calculator class contains multiple versions of the `add()` method with different parameter lists. Java automatically selects the appropriate method based on the number and type of arguments passed.

---

## Concepts Covered

* Object-Oriented Programming (OOP)
* Polymorphism
* Compile-Time Polymorphism
* Method Overloading
* Function Reusability
* Java Classes and Objects

---

## What is Method Overloading?

Method Overloading allows multiple methods to have the same name but different parameter lists.

The methods may differ by:

* Number of parameters
* Data types of parameters
* Order of parameters

Java determines which method to execute during compilation.

---

## Project Structure

```text
MethodCalc.java
README.md
```

---

## Class Diagram

```text
calculator
│
├── add(int, int)
├── add(double, double, double)
├── add(float, float)
└── add(int, double)

MethodCalc
│
└── main()
```

---

## Overloaded Methods

### Add Two Integers

```java
int add(int a, int b)
```

### Add Three Doubles

```java
double add(double a, double b, double c)
```

### Add Two Floats

```java
float add(float a, float b)
```

### Add Integer and Double

```java
double add(int a, double b)
```

---

## Sample Output

```text
Sum of two integers: 15
Sum of three doubles: 13.5
Sum of two floats: 6.0
Sum of an integer and a double: 11.5
```

---

## How It Works

### Example 1

```java
c.add(5, 10);
```

Java calls:

```java
add(int, int)
```

### Example 2

```java
c.add(3.5, 4.5, 5.5);
```

Java calls:

```java
add(double, double, double)
```

### Example 3

```java
c.add(2.5f, 3.5f);
```

Java calls:

```java
add(float, float)
```

### Example 4

```java
c.add(4, 7.5);
```

Java calls:

```java
add(int, double)
```

---

## Advantages of Method Overloading

* Improves code readability
* Reduces method naming complexity
* Increases reusability
* Supports compile-time polymorphism
* Makes programs easier to maintain

---

## Method Overloading Rules

✔ Same method name

✔ Different parameter list

✔ Different number of parameters

✔ Different data types

❌ Cannot overload only by changing return type

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)

---

## Learning Outcomes

After completing this project, you will understand:

* Method Overloading
* Compile-Time Polymorphism
* Java Method Resolution
* Classes and Objects
* Function Reusability
* OOP Fundamentals

---

## How to Run

### Compile

```bash
javac MethodCalc.java
```

### Execute

```bash
java MethodCalc
```

---

## Real-World Applications

Method overloading is commonly used in:

* Calculator Applications
* Banking Systems
* Utility Libraries
* APIs and Frameworks
* Mathematical Operations
* Data Processing Tools

---

## Author

Supraja Shetty

---

## License

This project is open-source and intended for educational and learning purposes.
