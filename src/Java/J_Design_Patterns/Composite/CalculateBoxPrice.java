package Java.J_Design_Patterns.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
So usually this pattern is used for tree like structures
cus if we want to invoke some operation of each leaf of the tree
we will have to find all the number of branches, and leaf
 and it will be some pretty complicated logic
 which wont be extensible at all

 here we can add new products we can new methods even easily
 just add to method to the interface
 implement it in all childs
 and add it to box
 or other composite instance
 */
public class CalculateBoxPrice {
    public static void main(String[] args) {
        // Create individual products
        Product shampoo = new Shampoo();
        Product beans = new Beans();


        // Create a box and add products to it
        Box box = new Box();
        box.addProduct(shampoo);//5
        box.addProduct(beans);//15

        // Create another box and nest it
        Box bigBox = new Box();
        bigBox.addProduct(box);
        bigBox.addProduct(new Shampoo());//5

        // Calculate and print total cost
        System.out.println("Total cost: " + bigBox.cost());
    }
}

interface Product {
    int cost();
}

class Shampoo implements Product {
    public Shampoo() {
    }

    @Override
    public int cost() {
        return 5;
    }
}

class Beans implements Product {
    public Beans() {
    }

    @Override
    public int cost() {
        return 15;
    }
}

class Box implements Product {
    private List<Product> products = new ArrayList<>();

    public Box() {
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public int cost() {
        int cost = products.stream().mapToInt(element -> element.cost()).sum();
        return cost;
    }
}

