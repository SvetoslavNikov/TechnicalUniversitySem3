package javaLU.fileIO.SoftUniEx.Serializition;

import java.io.*;
import java.util.Arrays;

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
    }
}
