package javaLectures.interfaces;

public interface interface2 {
    int min = 10;
    default void print(){
        System.out.println(min);
    }
}
