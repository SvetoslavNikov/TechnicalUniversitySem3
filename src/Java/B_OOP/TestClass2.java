package Java.B_OOP;

import java.awt.*;

public class TestClass2 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Animal animalDog = new Dog("AnimalDog");
        Dog dog = new Dog("Dog");

        animal.makeSound();
        System.out.println(animal.getName());

        animalDog.makeSound();
        System.out.println(animalDog.getName());

        animalDog.makeSound();
        System.out.println(animalDog.getName());




        Bird bird = new Bird() {
            @Override
            void fly() {
                System.out.println("I am anonymous class?");
            }
        };

        Bird birdSparrow = new Sparrow();
        Sparrow sparrow = new Sparrow();

        System.out.println(bird.age);
        bird.fly();
        System.out.println(birdSparrow.age);
        birdSparrow.fly();

        System.out.println(sparrow.age);
        sparrow.fly();



    }

}
