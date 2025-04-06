package Java.J_Design_Patterns.Factory;

import Java.J_Design_Patterns.Builder.Pizza;

//Problem it solves: Factory pattern solves the problem of creating objects without exposing
// the instantiation logic to the client. It promotes loose coupling by eliminating
// the need for client code to know which concrete class to instantiate.

class Test {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizzas cheesePizza = pizzaFactory.createPizza("cheese");
        CheesePizza cheesePizza2 = (CheesePizza) pizzaFactory.createPizza("cheese");
        //ClassCasting Exception
//        CheesePizza cheesePizza3 = (CheesePizza) pizzaFactory.createPizza("pepperoni");

        cheesePizza.prepare();
        cheesePizza2.prepare();

    }

}
public class PizzaFactory {
    public Pizzas createPizza(String type){
        Pizzas pizzas = null;
        if(type.equals("pepperoni")){
            return pizzas = new PepperoniPizza();
        }
        if(type.equals("cheese")){
            return pizzas = new CheesePizza();
        }
        return pizzas;
    }
}

interface Pizzas{
    void prepare();
}
class PepperoniPizza implements Pizzas {

    @Override
    public void prepare() {
        System.out.println("I am preparing PepperoniPizza");
    }
}


class CheesePizza implements Pizzas {
    @Override
    public void prepare() {
        System.out.println("I am preparing Cheese Pizza");
    }
}
