package Java.A_Syntax;

import java.util.Stack;

public class Generics {
    public static void main(String[] args) {
        Item<String, Integer> pen = new Item<>("blue pen", 3);
        Item<String, Double> paperclip = new Item<>("paperclip", 0.3);
        Item<String, Long> myNetworth = new Item<>("networth", 1223456789L);


        // Create a box that can hold Item<String, Integer>
        Box<Item<String, ?>> box = new Box<>();
        box.putItemIn(pen);
        box.putItemIn(paperclip);  // This line won't work, because we have different types inside Box
        box.putItemIn(myNetworth);

        while(box.itemsLeft()!= 0) {
            System.out.println("Item taken out: " + box.takeItemOut().getItem());
        }
    }

    public static Box<String> createBox(){
        return new Box();
        //this will take the type from above;
    }
}

class Box<T> {
    private Stack<T> content;
    public Box() {
        content = new Stack<>();
    }
    public void putItemIn(T item) {
        content.add(item);
    }

    public T takeItemOut() {
        return content.pop();
    }
    public int itemsLeft(){
        return content.size();
    }
}

class Item<T, U> {
    private T item;
    private U price;

    public Item(T item, U price) {
        this.item = item;
        this.price = price;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public U getPrice() {
        return price;
    }

    public void setPrice(U price) {
        this.price = price;
    }
}
