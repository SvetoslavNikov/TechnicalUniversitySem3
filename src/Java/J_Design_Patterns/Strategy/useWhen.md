# Strategy Pattern

### When to Use

The Strategy Pattern is used when a class needs to perform a specific behavior in different ways, and you want to make those variations easy to extend, test, and switch between.

It helps remove complex conditional logic (`if-else`, `switch-case`) and supports the Open/Closed Principle: you can add new behavior without modifying existing code.

---

### Key Concepts

- **Context**: The class that uses a strategy to perform a task.
- **Strategy Interface**: An abstraction that defines a common behavior.
- **Concrete Strategies**: Different implementations of the strategy interface, each representing a specific variation of the behavior.

---

### Why It's Useful

- Makes code easier to read and maintain.
- Encourages separation of concerns: each variation is isolated.
- New behaviors can be added without changing the existing system.
- Reduces the risk of bugs when adding new features.

---

### Typical Use Cases

- Payment methods
- Sorting algorithms
- Compression formats
- Tax or pricing rules
- Game AI behavior

---

### Summary

The Strategy Pattern provides a clean way to define and select among multiple interchangeable behaviors at runtime. It's ideal when a class has multiple ways to accomplish a task, and those ways may change or grow over time.

Would you like a diagram or comparison with other patterns like State or Template?