package javaLU.LU3.exercise.ex3;

public class Test {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(230.0, "Model A", "turned on", 16, 1024);
        Laptop laptop2 = new Laptop(230.0, "Model B", "turned off", 8, 512);

        System.out.println(laptop1.toString());
        System.out.println(laptop2.toString());



        System.out.println("Laptop 1 is better than Laptop 2: "
                    + laptop1.isBetter(laptop2));

    }
}
