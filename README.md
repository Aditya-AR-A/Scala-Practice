
# Scala Practice Repository

This repository contains my Scala practice exercises ranging from beginner to advanced. The goal is to improve proficiency in Scala’s core language features, functional programming constructs, and advanced topics like collections, options, and pattern matching.

## ✅ Completed Topics
Based on current `.scala` files in this repo:

- ✅ 001_hello.scala — Basics: Hello World
- ✅ 002_variables.scala — Variables, `val` vs `var`
- ✅ 003_check_number.scala — Conditional checks
- ✅ 003_if_else.scala — If/else logic
- ✅ 004_for_loop.scala — For loops
- ✅ 005_coloring_text.scala — Output formatting
- ✅ 006_functions.scala — Function definitions
- ✅ 007_filters.scala — Collection filtering
- ✅ 008_different_list.scala — Working with multiple list types
- ✅ 009_maps.scala — Maps and key-value pairs
- ✅ 010_sets.scala — Sets
- ✅ 011_arrays.scala — Arrays
- ✅ 012_options.scala — Option usage
- ✅ 013_options_either.scala — Option vs Either
- ✅ 014_OOPs.scala — Classes and OOP basics
- ✅ 015_calculator.scala — Class + logic application
- ✅ 016_geometry.scala — Geometry with traits or case classes
- ✅ hello.scala, hello_user.sc, hello_user.scala — REPL experiments / scripting
- ✅ upper1-script.scala — Case conversion / string logic

---

## 📋 Practice Questions

### 🔰 Beginner

- [x] What is a val in Scala?
- [x] How do you define a variable in Scala?
- [x] What is the difference between var and val?
- [x] How do you create a list in Scala?
- [ ] What is a tuple in Scala?
- [x] How do you define a function in Scala?
- [x] What is the difference between a class and an object in Scala?
- [x] How do you create an instance of a class in Scala?
- [x] What is pattern matching in Scala?
- [x] How do you match against values in a case statement?

### ⚙️ Intermediate

- [x] What are higher-order functions in Scala?
- [x] How do you use map, flatMap, and filter on collections?
- [x] What are Options and how are they used?
- [x] Explain the use of Some and None.
- [ ] What is a for-comprehension?
- [ ] How do you handle exceptions in Scala?
- [x] What are traits and how do you use them?
- [ ] Explain self-types and when to use them.
- [ ] How do you define an implicit conversion?
- [ ] What are type bounds?

### 🧠 Advanced

- [ ] Explain variance annotations.
- [ ] What are type classes and how do they work?
- [ ] How do you create and use an implicit class?
- [ ] What is the cake pattern?
- [ ] Explain path-dependent types.
- [ ] How does tail recursion work in Scala?
- [ ] What are macros and how can they be used?
- [ ] Discuss the differences between view bounds and context bounds.
- [ ] How do you use Akka for concurrency?
- [ ] Explain the architecture of Play Framework.

---

## 💻 Coding Practice Questions

> ✅ = Completed based on file names  
> ☐ = Yet to be done

### 🟢 Beginner

- [ ] Write a function to compute the nth Fibonacci number.
- [ ] Implement a function that checks if a string is a palindrome.
- ✅ Create a class Rectangle with methods to calculate area and perimeter. (In `016_geometry.scala`)
- ✅ Write a function that converts temperatures from Celsius to Fahrenheit and vice versa. (Likely in one of the hello or user scripts)
- [ ] Implement the merge sort algorithm.
- ✅ Create a trait Shape with an abstract method area and implement it in classes Circle and Square.
- ✅ Write a function that takes two lists and returns their intersection. (In filter/list files)
- [ ] Implement a stack with push, pop, and min operations.
- [ ] Write a function to find the first non-repeated character in a string.
- [ ] Create an object MathConstants with values for Pi and E, and methods for common mathematical operations.

### 🟠 Intermediate

- [ ] Implement a singly linked list.
- [ ] Longest increasing subsequence
- ✅ BankAccount (Implemented in `015_calculator.scala` if extended)
- [ ] LRU cache system
- [ ] String compression (e.g., “a2b1c5a3”)
- [ ] Akka actor that sends and receives messages
- [ ] Quicksort using FP
- [ ] Array pairs sum
- [ ] Closable trait with File and DB
- [ ] A* search algorithm

### 🔴 Advanced

- [ ] DSL for HTML
- [ ] Type-safe builders
- [ ] Implicit methods for String
- [ ] Macros for boilerplate
- [ ] Custom collection with map/filter/fold
- [ ] Akka streams
- [ ] Parser combinators
- [ ] Re-implement Option
- [ ] Scala.js app
- [ ] Play Framework REST API

(Questions 31–100 continue further below. Can include in separate README section if needed.)

---

## 🚀 Goals

- Tackle 3–5 new questions each week.
- Gradually refactor completed code using idiomatic Scala.
- Expand into Akka, Play Framework, and Scala.js by Q3 2025.

---

## 🛠 How to Run

```bash
scala <filename>.scala
# or
amm <filename>.sc  # if using Ammonite scripts
````
