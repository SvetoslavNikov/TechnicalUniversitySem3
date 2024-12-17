package learning.designPatterns.SolidPrinciples.OpenClosed;

public class CorrectWay {
    public static void main(String[] args) {
        PaymentMethod ivanPayment = new CreditCardPayment();
        PayPalPayment paypal = new PayPalPayment();
        PaymentProcessor.processPayment(ivanPayment, 2.33);
        PaymentProcessor.processPayment(paypal, 5.35);
    }
}

//PaymentProcessor
//CreditCardPayment
//PayPal
//Interface PaymentMethod

interface PaymentMethod{
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid with CreditCard: " + amount);
    }
}

class PayPalPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paid with PayPal: " + amount);
    }
}
//can add crypto payment and so on... without changing ANYTHING OF THE EXISTING LOGIC
class PaymentProcessor{
    public static void processPayment(PaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
}