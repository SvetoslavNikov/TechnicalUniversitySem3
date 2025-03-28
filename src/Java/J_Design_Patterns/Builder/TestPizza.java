package Java.J_Design_Patterns.Builder;


public class TestPizza {
    public static void main(String[] args) {

        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder();
        Pizza pizza = pizzaBuilder
                .dough("hubavo testo")
                .sauce("Domaten")
                .topping("chorizo")
                .topping("hubavo chorizo")
                .topping("kashkaval")
                .build();
        //!Ne Pizza pizza = new Pizza(pizzaBuilder);

        Computer gamingPC = new Computer.ComputerBuilder()
                .ram("32GB")
                .storage("1TB SSD")
                .graphicsCard("NVIDIA RTX 3080")
                .build();
        System.out.println(gamingPC);
    }
}
