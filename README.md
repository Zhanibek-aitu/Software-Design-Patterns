# Assignment 1: Builder Pattern - RPG Character Creator

## Description
This project demonstrates the implementation of the Creational Design Pattern **Builder** in Java. 
The domain chosen is an RPG Game Character Creator. Game characters often have multiple optional configurations (race, weapon, magic ability). The Builder pattern prevents the "telescoping constructor" anti-pattern and provides a fluent API to construct complex character objects step by step.

## Architecture
This project uses the **Static Inner Class Builder** approach (popularized by Joshua Bloch in *Effective Java*), which is the industry standard for Java.
* **Product:** `Character` class with a private constructor.
* **Builder:** `Character.Builder` static inner class containing the construction logic and method chaining.

## How to Run
1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA (JDK 17 recommended).
3. Open `Main.java` and run the `main` method.
4. The console will display the stats of the generated characters (Mage and Warrior).
