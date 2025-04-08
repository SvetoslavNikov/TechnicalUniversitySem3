package Java.J_Design_Patterns.Builder;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PizzaTest{
    @Test
    public void testPizzaBuilder(){
        Pizza pizza = new Pizza.PizzaBuilder()
                .dough("hubavo testo")
                .sauce("Domaten")
                .topping("chorizo")
                .topping("basil")
                .topping("kashkaval")
                .build();
        
        assertEquals("hubavo testo", pizza.getDough());
        assertEquals("Domaten",pizza.getSauce());
        assertEquals("chorizo", pizza.getToppings().get(0));
        assertEquals("basil", pizza.getToppings().get(1));
        assertEquals("kashkaval", pizza.getToppings().get(2));
    }
}
