# Java OOP Demonstration: Concrete Class, Abstract Class, and Interface

This Java program demonstrates the differences between a **Concrete Class**, an **Abstract Class**, and an **Interface** by implementing a simple vehicle system.

1. **Interface (`Vehicle`)**:
   - Defines a contract for all vehicles with `start()` and `stop()` methods.
   - Any class implementing this interface must provide an implementation for these methods.

2. **Abstract Class (`Car`)**:
   - Provides common properties (`brand`) and behavior (`displayBrand()`).
   - Contains an abstract method `accelerate()` that must be implemented by subclasses.
   - Cannot be instantiated directly.

3. **Concrete Class (`Sedan`)**:
   - Extends `Car` and implements the `Vehicle` interface.
   - Provides implementations for `accelerate()`, `start()`, and `stop()` methods.
   - Can be instantiated and used in the main program.