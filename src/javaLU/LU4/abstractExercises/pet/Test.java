package javaLU.LU4.abstractExercises.pet;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Dog dogy = new Dog();
        dogy.makeSound();
        dogy.sleep();

        Cat caty = new Cat();
        caty.makeSound();
        caty.sleep();

        Bird birdy = new Bird();
        birdy.makeSound();
        birdy.sleep();

        System.out.println("");

        List<Pet> pets = new ArrayList<>();
        pets.add(dogy);
        pets.add(caty);
        pets.add(birdy);


        for (Pet pet : pets) {
            pet.makeSound();
            pet.sleep();
            if (pet instanceof Playable) {
                ((Playable) pet).play();
            }
            System.out.println("");
        }


    }
}
