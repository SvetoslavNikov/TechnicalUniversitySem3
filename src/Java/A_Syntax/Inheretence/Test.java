package Java.A_Syntax.Inheretence;

public class Test {
    public static void main(String[] args){
        Child c = new Child(50);
        System.out.println(c.getAge());

    }
}

class Parent{
    public int age;

    Parent(int age){
        this.age = age;
        System.out.println("parent constructor called wtf");
    }
    void sayHello() {
        System.out.println("Hello");
    }

    int getAge(){
        System.out.println("Parent get age called wtf");
        return this.age;
    }
}

class Child extends Parent{

    public int age;

    Child(int age) {
        super(age);
    }

    @Override
    int getAge(){
        System.out.println("Child get age called wtf");
        return super.age;
//        return age;
    }
}
