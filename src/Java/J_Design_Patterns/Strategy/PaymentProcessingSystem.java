package Java.J_Design_Patterns.Strategy;
/*
Create a PaymentStrategy interface with a method pay(int amount)
Implement concrete strategies for:

Credit Card payment
PayPal payment
Bitcoin payment

Create a ShoppingCart class (context) that uses these payment strategies
Demonstrate changing strategies at runtime
 */
public class PaymentProcessingSystem {
    public static void main(String[] args){
        ShoppingCart s1 = new ShoppingCart(new Bitcoin());
        ShoppingCart s2 = new ShoppingCart(new PayPal());
        ShoppingCart s3 = new ShoppingCart(new CreditCard());
        s1.pay();
        s2.pay();
        s3.pay();

    }
}

class ShoppingCart{
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    void pay(){
        this.paymentStrategy.pay();
    }
}
interface PaymentStrategy{
    void pay();
}

class CreditCard implements PaymentStrategy{
    @Override
    public void pay(){
        System.out.println("payed with CreditCard");
    }
}

class PayPal implements PaymentStrategy{
    @Override
    public void pay(){
        System.out.println("payed with PayPal");
    }
}

class Bitcoin implements PaymentStrategy{
    @Override
    public void pay(){
        System.out.println("payed with Bitcoin");
    }
}