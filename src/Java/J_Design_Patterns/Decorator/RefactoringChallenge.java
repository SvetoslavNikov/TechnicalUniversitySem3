package Java.J_Design_Patterns.Decorator;

public class RefactoringChallenge {
    public static void main(String[] args){
        Pizza p = new AlfredoPizza();
        Topping t = new Cheese(p);
        Topping t2 = new Peperoni(t);
        System.out.println(t2.getDescription());
        System.out.println(t2.cost());
    }
}

abstract class Pizza{
    abstract public String getDescription();
    abstract public double cost();
}

class AlfredoPizza extends Pizza{

    @Override
    public String getDescription() {
        return "Cheesepizza";
    }

    @Override
    public double cost() {
        return 1000;
    }
}


class TomatoSaucePizza extends Pizza{

    @Override
    public String getDescription() {
        return "Cheesepizza";
    }

    @Override
    public double cost() {
        return 2000;
    }
}

abstract class Topping extends Pizza{
    protected Pizza pizza;

    public Topping(Pizza pizza){
        this.pizza = pizza;
    }
}

class Cheese extends Topping{

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost() + 100;
    }
}

class Peperoni extends Topping {

    public Peperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with Peperoni";
    }

    @Override
    public double cost() {
        return pizza.cost() + 200;
    }
}

