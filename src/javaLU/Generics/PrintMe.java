package javaLU.Generics;

import javaLU.LU4.abstractExercises.pet.Dog;
import javaLU.LU4.abstractExercises.pet.Pet;

public class PrintMe <Thing extends Pet>{
    Thing t;
    public PrintMe(Thing t){
        this.t = t;
    }

    public void printTheThing(){
        System.out.println(this.t);
    }

    public static void main(String[] args) {
        PrintMe<Dog> dog= new PrintMe<>(new Dog());
        dog.printTheThing();
        Integer i = 5;
        //PrintMe<Integer> inty = new PrintMe<>(i);
        System.out.println(i.compareTo(6));

        int a = i;
        byte s = 2;
        Byte ss = 2;

        if(a == i && s == ss){
            System.out.println("That's the unboxing feature of the wrapper class.");
        }



    }
}
