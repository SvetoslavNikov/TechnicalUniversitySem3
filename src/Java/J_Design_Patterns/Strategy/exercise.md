# Strategy Design Pattern Learning Challenges in Java

## Introduction to Strategy Pattern
The Strategy Design Pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable within that family.

## Key Components
- **Context**: The class that uses a Strategy
- **Strategy Interface**: Defines the common interface for all concrete strategies
- **Concrete Strategies**: Specific implementations of the Strategy interface

## Learning Challenges

### Challenge 1: Basic Implementation
**Objective**: Create a simple implementation of the Strategy pattern for a payment processing system.

**Requirements**:
1. Create a `PaymentStrategy` interface with a method `pay(int amount)`
2. Implement concrete strategies for:
    - Credit Card payment
    - PayPal payment
    - Bitcoin payment
3. Create a `ShoppingCart` class (context) that uses these payment strategies
4. Demonstrate changing strategies at runtime

**Expected Learning Outcomes**:
- Understanding the basic structure of the Strategy pattern
- Recognizing how to decouple algorithms from their context
- Implementing strategy switching at runtime

### Challenge 2: Sorting Strategies
**Objective**: Implement different sorting algorithms using the Strategy pattern.

**Requirements**:
1. Create a `SortingStrategy` interface with a method `sort(int[] array)`
2. Implement concrete strategies for:
    - Bubble Sort
    - Quick Sort
    - Merge Sort
3. Create a `DataSorter` class that uses these strategies
4. Add functionality to measure and compare the performance of different strategies

**Expected Learning Outcomes**:
- Applying the Strategy pattern to algorithm selection
- Understanding how to benchmark and compare strategies
- Recognizing when to switch strategies based on data characteristics

### Challenge 3: Text Processing Strategies
**Objective**: Create a text formatter using the Strategy pattern.

**Requirements**:
1. Create a `TextFormattingStrategy` interface with a method `format(String text)`
2. Implement concrete strategies for:
    - Upper case conversion
    - Lowercase conversion
    - Capitalization of first letters
    - HTML formatting
3. Create a `TextEditor` class that can apply these strategies
4. Allow chaining of strategies (e.g., capitalize then HTML format)

**Expected Learning Outcomes**:
- Using the Strategy pattern for text processing
- Implementing strategy composition
- Understanding how to extend functionality without modifying existing code

### Challenge 4: Real-world Application
**Objective**: Refactor an existing codebase to use the Strategy pattern.

**Requirements**:
1. Start with this code snippet that calculates different types of taxes:

```java
public class TaxCalculator {
    private static final String US = "US";
    private static final String EU = "EU";
    private static final String ASIA = "ASIA";
    
    public double calculateTax(double amount, String region) {
        if (region.equals(US)) {
            return amount * 0.07; // US sales tax
        } else if (region.equals(EU)) {
            return amount * 0.20; // EU VAT
        } else if (region.equals(ASIA)) {
            return amount * 0.10; // Asia GST
        } else {
            return amount * 0.05; // Default tax
        }
    }
}
```

2. Refactor this code to use the Strategy pattern
3. Make it easy to add new tax calculation methods without modifying existing code
4. Add a new tax calculation for Canada (13% HST)

**Expected Learning Outcomes**:
- Identifying code that would benefit from the Strategy pattern
- Refactoring conditional logic into strategy objects
- Understanding the Open/Closed Principle

## Bonus Challenge: Combining Design Patterns
**Objective**: Combine Strategy with Factory pattern for dynamic strategy creation.

**Requirements**:
1. Create a `StrategyFactory` that can create appropriate strategies based on input
2. Use this factory in a context class to dynamically select strategies
3. Implement caching for frequently used strategies
4. Allow for customization of strategy parameters

**Expected Learning Outcomes**:
- Understanding how Strategy works with other design patterns
- Creating flexible, extensible code using combined patterns
- Implementing performance optimizations for strategy selection

## Example Solution Structure for Challenge 1

```java
// Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete Strategies
class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;
    
    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }
}

class PayPalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;
    
    public PayPalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal");
    }
}

// Context
class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}

// Client demo
public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        // Pay with credit card
        cart.setPaymentStrategy(new CreditCardStrategy("John Doe", "1234567890123456", "786", "12/25"));
        cart.checkout(100);
        
        // Pay with PayPal
        cart.setPaymentStrategy(new PayPalStrategy("johndoe@example.com", "password"));
        cart.checkout(200);
    }
}
```