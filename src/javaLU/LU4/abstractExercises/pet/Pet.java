package javaLU.LU4.abstractExercises.pet;

public abstract class Pet {
    int a = 5;
    public abstract void makeSound();
    public void sleep(){
        System.out.println("Pet is sleeping");
    }

    public void sell(){
        System.out.printf("I sell pet for %d lv", 5);
    }
}
