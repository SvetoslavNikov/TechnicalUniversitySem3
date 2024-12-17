package learning.designPatterns.SolidPrinciples.OpenClosed;

public class IncorrectWay {
    public static void main(String[] args) {
        PaymentProcessor2 processor = new PaymentProcessor2();
        processor.processPayment2("CreditCard", 100.0);
        processor.processPayment2("PayPal", 200.0);
    }
}

class PaymentProcessor2 {
    public void processPayment2(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Paid " + amount + " using Credit Card.");
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Paid " + amount + " using PayPal.");
        } else if (paymentType.equals("Crypto")) {
            System.out.println("Paid " + amount + " using Cryptocurrency.");
        }
        // Adding more types increases the complexity and risk of bugs
    }
}

