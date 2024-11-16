package javaLU.fileIO.SoftUniEx.Serializition;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializeCartExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(
                Arrays.asList("product123", "product456"),
                2,
                50.75
        );


       /* try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cart.ser"))) {
            oos.writeObject(cart);
            System.out.println("Cart serialized and saved!");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try(ObjectInputStream deserializedobject = new ObjectInputStream
                (new FileInputStream("cart.ser"))){
            ShoppingCart a = (ShoppingCart) deserializedobject.readObject();

            System.out.println(a.getTotalItems());



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        //lambda + generics
        ShoppingCart cart1 = new ShoppingCart(
                Arrays.asList("product123", "product456"),
                4,
                50.75
        );
        ShoppingCart cart2 = new ShoppingCart(
                Arrays.asList("product123", "product456"),
                3,
                50.75
        );

        List<ShoppingCart> ls = new ArrayList<>();
        ls.add(cart1);
        ls.add(cart2);

        SerializableOnly a = e -> {
            for (int i = 0; i < e.size(); i++) {
                System.out.println(e.get(i));
            }
            return e;
        };
        a.printMyAdress(ls);
    }
}
