package Java.J_Design_Patterns.Decorator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
Create a Beverage(Pitie) abstract class with methods getDescription() and cost()
Implement concrete components:

Espresso, HouseBlend, DarkRoast

Create an abstract CondimentDecorator(Podpravka) class extending Beverage
Implement concrete decorators:

Milk, Mocha, Whip, Soy

Build a simple ordering system that calculates the cost of beverages with various condiments
 */
public class CoffeeShopOrderingSystem {
    public static void main(String[] args){
//        Class<?> bclass = Bevarage.class;
//        getDetails(bclass);
//
//        Class<?> eclass = Espresso.class;
//        getDetails(eclass);
        Bevarage b = new Espresso();
        CondimentDecorator c = new MilkDecorator2(b);
        System.out.println(c.getDescription());

    }

    public static void getDetails(Class<?> clazz){
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method.getName());
        }
    }


}

abstract class Bevarage{
     abstract String getDescription();
     abstract float cost();
}

class Espresso extends Bevarage{
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public float cost() {
        return 5.0f;
    }
}

class Chocolate extends Bevarage{
    @Override
    public String getDescription() {
        return "Chocolate";
    }

    @Override
    public float cost() {
        return 10.0f;
    }
}

class StrawberryShake extends Bevarage{
    @Override
    public String getDescription() {
        return "StrawberryShake";
    }

    @Override
    public float cost() {
        return 20.0f;
    }
}

abstract class CondimentDecorator extends Bevarage{
    protected Bevarage beverage;
    CondimentDecorator(Bevarage beverage){
        this.beverage = beverage;
    }
}

class MilkDecorator2 extends CondimentDecorator{


    MilkDecorator2(Bevarage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + 100f;
    }
}

class WhipDecorator extends CondimentDecorator{


    WhipDecorator(Bevarage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + 100f;
    }
}
