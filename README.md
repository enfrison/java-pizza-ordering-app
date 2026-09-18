# Java Pizza Ordering Application

An object-oriented Java application that creates customizable pizza orders and calculates pricing based on selected ingredients and delivery options.

## Features

- Create customizable pizza orders
- Add multiple ingredients to an order
- Calculate the total cost based on selected ingredients
- Add an optional delivery charge
- Organize different ingredient types using inheritance
- Store and manage ingredients using Java collections
- Test application functionality using a separate test class

## Technical Concepts Demonstrated

- Java
- Object-Oriented Programming (OOP)
- Classes and Objects
- Inheritance
- Encapsulation
- Java Collections (`ArrayList`)
- Constructors
- Methods
- Conditional Logic
- Iteration
- Package Organization
- Software Testing

## Project Structure

The application separates responsibilities across multiple classes:

- `Pizza` manages pizza information, ingredients, delivery status, and total cost.
- `Ingredient` serves as a reusable base class for ingredients.
- Ingredient subclasses such as `Cheese`, `Pepperoni`, `Ham`, `Mushroom`, and `GreenPepper` represent individual toppings.
- `CalculateCost` calculates the total price based on the pizza's ingredients and delivery selection.
- `PizzaMaker` constructs and configures pizza orders.
- `PizzaMakerTest` provides testing for application functionality.

## Object-Oriented Design

The project uses inheritance to allow individual ingredient classes to share common properties and behavior from the `Ingredient` class. An `ArrayList` is used to manage the collection of ingredients associated with each pizza.

Separating pizza creation, ingredients, and cost calculations into different classes helped reduce duplicated code and organize the application into reusable components.

## Purpose

This project was developed to strengthen my understanding of object-oriented programming and demonstrate how multiple Java classes can work together to create a complete application.

## Development Environment

- Java
- IntelliJ IDEA

## Author

**Erika Frison**

Software Engineering & Information Technology Student
