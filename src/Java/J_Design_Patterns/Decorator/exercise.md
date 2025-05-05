# Decorator Design Pattern Learning Challenges in Java

## Introduction to Decorator Pattern
The Decorator Design Pattern is a structural pattern that allows behavior to be added to individual objects dynamically without affecting the behavior of other objects from the same class. It's an alternative to subclassing for extending functionality.

## Key Components
- **Component Interface**: Defines the interface for objects that can have responsibilities added to them
- **Concrete Component**: The basic object that implements the Component interface
- **Decorator**: Abstract class that implements the Component interface and contains a reference to a Component
- **Concrete Decorators**: Add responsibilities to the component

## Learning Challenges

### Challenge 1: Basic Implementation
**Objective**: Create a simple text formatting system using the Decorator pattern.

**Requirements**:
1. Create a `TextComponent` interface with a method `getText()`
2. Implement a `PlainText` class as the concrete component
3. Create an abstract `TextDecorator` class
4. Implement concrete decorators:
    - `BoldDecorator`: Wraps text with `<b>` tags
    - `ItalicDecorator`: Wraps text with `<i>` tags
    - `UnderlineDecorator`: Wraps text with `<u>` tags
5. Demonstrate how decorators can be stacked

**Expected Learning Outcomes**:
- Understanding the basic structure of the Decorator pattern
- Learning how to stack decorators
- Recognizing the difference between inheritance and decoration

### Challenge 2: Coffee Shop Ordering System
**Objective**: Implement a coffee ordering system using the Decorator pattern.

**Requirements**:
1. Create a `Beverage` abstract class with methods `getDescription()` and `cost()`
2. Implement concrete components:
    - `Espresso`
    - `HouseBlend`
    - `DarkRoast`
3. Create an abstract `CondimentDecorator` class extending `Beverage`
4. Implement concrete decorators:
    - `Milk`
    - `Mocha`
    - `Whip`
    - `Soy`
5. Build a simple ordering system that calculates the cost of beverages with various condiments

**Expected Learning Outcomes**:
- Applying decorators in a real-world scenario
- Understanding how to manage state across multiple decorators
- Managing cost calculation through decorator chains

### Challenge 3: Input/Output Stream Decorators
**Objective**: Create custom I/O stream decorators similar to Java's own I/O classes.

**Requirements**:
1. Create a simplified `InputStream` interface with methods like `read()`
2. Implement a basic `FileInputStream` concrete component
3. Create an abstract `InputStreamDecorator` class
4. Implement concrete decorators:
    - `BufferedInputStream`: Adds buffering capability
    - `DataInputStream`: Adds methods to read primitive data types
    - `EncryptionInputStream`: Adds decryption of the data being read
5. Demonstrate how these decorators work together

**Expected Learning Outcomes**:
- Understanding how Java's I/O streams use the Decorator pattern
- Learning to work with functional decorators
- Handling resource management with decorators

### Challenge 4: UI Component Decorator
**Objective**: Create a UI component system that uses decorators to add visual effects and behaviors.

**Requirements**:
1. Create a `UIComponent` interface with methods like `render()` and `handleEvent()`
2. Implement concrete components like `Button`, `TextField`, and `Panel`
3. Create an abstract `UIDecorator` class
4. Implement concrete decorators:
    - `BorderDecorator`: Adds a border to components
    - `ScrollableDecorator`: Makes components scrollable
    - `TooltipDecorator`: Adds tooltip functionality
    - `AnimationDecorator`: Adds animation effects
5. Build a small demo that showcases the decorated components

**Expected Learning Outcomes**:
- Applying decorators to UI components
- Understanding how decorators can modify both appearance and behavior
- Managing the rendering order of decorators

### Challenge 5: Refactoring Challenge
**Objective**: Refactor an existing inheritance hierarchy to use the Decorator pattern.

**Requirements**:
1. Start with this code that uses inheritance:

```java
abstract class Pizza {
    String description = "Unknown Pizza";
    
    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
}

class CheesePizza extends Pizza {
    public CheesePizza() {
        description = "Cheese Pizza";
    }
    
    public double cost() {
        return 10.99;
    }
}

class CheesePizzaWithMushrooms extends CheesePizza {
    public CheesePizzaWithMushrooms() {
        description = "Cheese Pizza with Mushrooms";
    }
    
    public double cost() {
        return super.cost() + 1.50;
    }
}

class CheesePizzaWithMushroomsAndPepperoni extends CheesePizzaWithMushrooms {
    public CheesePizzaWithMushroomsAndPepperoni() {
        description = "Cheese Pizza with Mushrooms and Pepperoni";
    }
    
    public double cost() {
        return super.cost() + 2.00;
    }
}
```

2. Refactor this code to use the Decorator pattern instead of inheritance
3. Make it easy to create any combination of toppings
4. Add more pizza types (Margherita, Veggie) and toppings (Olives, Peppers)

**Expected Learning Outcomes**:
- Identifying the "inheritance explosion" problem
- Converting a hierarchy to a decorator structure
- Understanding the flexibility benefits of decorators

## Bonus Challenge: Dynamic Decoration at Runtime
**Objective**: Create a system that can apply decorators dynamically based on user input or configuration.

**Requirements**:
1. Create a `DecoratorFactory` that can generate appropriate decorators
2. Implement a configuration system that determines which decorators to apply
3. Allow for conditional decoration based on runtime conditions
4. Create a demo that showcases dynamic decoration

**Expected Learning Outcomes**:
- Understanding how to create decorators dynamically
- Learning to manage decorator composition at runtime
- Implementing factory methods with decorators

## Example Solution Structure for Challenge 1

```java
// Component Interface
interface TextComponent {
    String getText();
}

// Concrete Component
class PlainText implements TextComponent {
    private String text;
    
    public PlainText(String text) {
        this.text = text;
    }
    
    @Override
    public String getText() {
        return text;
    }
}

// Abstract Decorator
abstract class TextDecorator implements TextComponent {
    protected TextComponent textComponent;
    
    public TextDecorator(TextComponent textComponent) {
        this.textComponent = textComponent;
    }
}

// Concrete Decorators
class BoldDecorator extends TextDecorator {
    public BoldDecorator(TextComponent textComponent) {
        super(textComponent);
    }
    
    @Override
    public String getText() {
        return "<b>" + textComponent.getText() + "</b>";
    }
}

class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(TextComponent textComponent) {
        super(textComponent);
    }
    
    @Override
    public String getText() {
        return "<i>" + textComponent.getText() + "</i>";
    }
}

class UnderlineDecorator extends TextDecorator {
    public UnderlineDecorator(TextComponent textComponent) {
        super(textComponent);
    }
    
    @Override
    public String getText() {
        return "<u>" + textComponent.getText() + "</u>";
    }
}

// Client demo
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        TextComponent text = new PlainText("Hello, Decorator Pattern!");
        
        // Decorate with bold
        text = new BoldDecorator(text);
        System.out.println(text.getText());
        // Output: <b>Hello, Decorator Pattern!</b>
        
        // Decorate with italic and bold
        TextComponent text2 = new PlainText("Multiple Decorators");
        text2 = new BoldDecorator(new ItalicDecorator(text2));
        System.out.println(text2.getText());
        // Output: <b><i>Multiple Decorators</i></b>
        
        // Add all decorators
        TextComponent text3 = new PlainText("Fully Decorated");
        text3 = new BoldDecorator(new ItalicDecorator(new UnderlineDecorator(text3)));
        System.out.println(text3.getText());
        // Output: <b><i><u>Fully Decorated</u></i></b>
    }
}
```