package javaLU.LU4.abstractExercises.pet;

public class Dog extends Pet implements Playable{

    @Override
    public void play(){
        System.out.println("LOL the dog is playing");
    }
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }

    @Override
    public void sleep(){
        System.out.println("Dogy is sleeping");
    }

}
