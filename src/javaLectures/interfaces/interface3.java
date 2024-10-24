package javaLectures.interfaces;

import java.sql.SQLOutput;

public interface interface3 {
    static int cube(int x){
        return x*x*x;
    }

    private void sayHi(){
        System.out.println("hi" );
    }//this method cannot be access outside the interface so we have to have a default method that runs it.
    default void say(){
        sayHi();
        sayPOLITE();
    }

    private static void sayPOLITE(){//no point in being static cus we cant call a private method outside of it anyway
        System.out.println("HI baby");
    }
}
