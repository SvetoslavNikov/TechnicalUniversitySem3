package Java.A_Syntax;

import learning.javaAdvanced.Reflection.Cat;
import learning.javaBasics.annotations.AnimalClass;

import java.util.Optional;

public class OptionalsTest {
    //the point of optional is to use it as a return type
    // where null return is possible

    public static void main(String[] args) {
        Optional<Cat> optionalCat = methodReturningCatOrNull();
        //cool way
        Cat cat = optionalCat.orElse(new Cat("UNKNOWN",0));

        //cool function
        int age = optionalCat.map(Cat::getAge).orElse(0);

        //boring verbose way
        if(optionalCat.isPresent()){
            cat = optionalCat.orElseThrow();//=get() returns Cat obj or exception
        } else{
            cat = new Cat("UNKNOWN",0);
        }
    }

    public static Optional<Cat> methodReturningCatOrNull(){
        Cat cat = new Cat("Leo",3);
        return null;
    }
}
