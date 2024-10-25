package javaLectures.interfaces;

public class Main{
    public static void main(String[] args) {
        interface1 instance = new interface1(){
            @Override
            public void print() {
                System.out.println("Hi, honey");
            }
        };
        
        instance.print();
    }
}
