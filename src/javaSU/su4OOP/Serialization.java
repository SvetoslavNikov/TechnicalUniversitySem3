package javaSU.su4OOP;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialization {
    public static void main(String[] args) {
        List<Book> ls = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ls.add(new Book("Svetoslav", "Garmelio"));
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cart.ser"))) {
            for (Book book: ls){
            oos.writeObject(book);}
            System.out.println("serialized and saved!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(ObjectInputStream deserializedobject = new ObjectInputStream
                (new FileInputStream("cart.ser"))){
            List<Book> booksLs = new ArrayList<>();
            while (true) {
                try {
                    booksLs.add((Book) deserializedobject.readObject());
                } catch (EOFException e) {
                    break;
                }
            }

            for (Book book : booksLs) {
                System.out.println(book);
            }





        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class Book implements Serializable{
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return getAuthor() + " " + getTitle();
    };
}