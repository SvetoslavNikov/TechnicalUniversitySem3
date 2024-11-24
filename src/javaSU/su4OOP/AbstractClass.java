package javaSU.su4OOP;

public class AbstractClass {

}

abstract class PaymentMethod{
    abstract void processPayment();
}

class CreditCard extends PaymentMethod{
    @Override
    void processPayment() {
        System.out.println("CreditCard processed");
    }
}

class PayPal extends PaymentMethod{
    @Override
    void processPayment() {
        System.out.println("Paid by PayPal");
    }
}