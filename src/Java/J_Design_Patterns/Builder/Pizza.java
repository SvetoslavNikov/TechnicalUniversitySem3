package Java.J_Design_Patterns.Builder;

import java.util.ArrayList;
import java.util.List;

// Simple Pizza Builder Example
public class Pizza {
    private String dough;
    private String sauce;
    private List<String> toppings;

    private Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.toppings = builder.toppings;
    }

    public static class PizzaBuilder {
        private String dough;
        private String sauce;
        private List<String> toppings = new ArrayList<>();

        public PizzaBuilder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder topping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}











// Complex Computer Builder Example
class Computer {
    // Essential components
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String motherboard;

    // Private constructor to enforce builder usage
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.motherboard = builder.motherboard;
    }

    // Builder nested class
    public static class ComputerBuilder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private String motherboard;

        public ComputerBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder motherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", motherboard='" + motherboard + '\'' +
                '}';
    }
}

//// Demonstration Class
//class BuilderPatternDemo {
//    public static void main(String[] args) {
//        // Pizza Builder Example
//        Pizza margherita = new Pizza.PizzaBuilder()
//                .dough("thin")
//                .sauce("tomato")
//                .topping("mozzarella")
//                .topping("basil")
//                .build();
//        System.out.println(margherita);
//
//        // Computer Builder Example
//        Computer gamingPC = new Computer.ComputerBuilder()
//                .cpu("Intel i9")
//                .ram("32GB")
//                .storage("1TB SSD")
//                .graphicsCard("NVIDIA RTX 3080")
//                .motherboard("ASUS ROG")
//                .build();
//        System.out.println(gamingPC);
//    }
//}