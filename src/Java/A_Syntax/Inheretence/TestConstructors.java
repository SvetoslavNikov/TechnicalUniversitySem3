package Java.A_Syntax.Inheretence;

public class TestConstructors {
    public static void main(String[] args) {

        System.out.println("\n-- Testing Parent1/Child1 --");
        new Child1();
        System.out.println();
        new Child1("ok");
        System.out.println();
        new Child1(123);
    }
}

class Parent1 {
    public Parent1() {
        System.out.println("Parent1()");
    }

    public Parent1(String s) {
        System.out.println("Parent1(" + s + ")");
    }
}

class Child1 extends Parent1 {
    public Child1() {
        System.out.println("Child1()");
    }

    public Child1(String s) {
        super(s);
        System.out.println("Child1(" + s + ")");
    }

    public Child1(int n) {
        this("" + n);
        System.out.println("Child1(" + n + ")");

    }
}