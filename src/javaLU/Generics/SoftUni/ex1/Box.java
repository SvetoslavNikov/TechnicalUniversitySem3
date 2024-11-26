package javaLU.Generics.SoftUni.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;//basic generic
import java.util.Random;

class Box <T> {
    private T iteml;

    public void setIteml(T item){
        this.iteml = item;
    }

    public T getIteml(){
        return this.iteml;
    }
}

//generic method
class GenericMethodExample{
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }
}

//bounded generic
class NumberBox<T extends Number>{
    private T number;
    public NumberBox(T number){
        this.number = number;
    }

    public double doubleValue(){
        return number.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>(5);
        System.out.println(intBox.doubleValue());
    }
}


class WildCardDemo {
    //wildcards unbounded
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    //wildcard bounded
    public static double sumList(List<? extends Number> list){
        double sum = 0;
        for (Number number : list){
            sum += number.doubleValue();
        }
        System.out.println(sum);
        return sum;
    }

    //type and supertype
    //? can be Integer can be Number can be Object
    public static void addNumbers(List<? super Integer> list){
        Random random = new Random();
        list.add(random.nextInt());
        list.add(random.nextInt());
    }

    public static void main(String[] args) {
        List<Number> numberLs = new ArrayList<>();
        WildCardDemo.addNumbers(numberLs);
        WildCardDemo.printList(numberLs);
        WildCardDemo.sumList(numberLs);
    }
}
