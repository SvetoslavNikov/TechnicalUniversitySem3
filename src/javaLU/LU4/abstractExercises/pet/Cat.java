package javaLU.LU4.abstractExercises.pet;

public class Cat extends Pet implements Playable{

    @Override
    public void play(){
        System.out.println("Cat is playing");
    }
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}
