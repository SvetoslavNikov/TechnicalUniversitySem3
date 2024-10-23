package javaLectures.interfaces;

public class Class1 implements interface1, interface2{



    @Override
    public void print(){
        //interface1.min = 10; Variables in the interface is FINAL cant be change
        System.out.println("Hi bi" + interface2.min);
    }

    public static void main() {
        interface1 d = new Class1();//???????????????????
        d.print();
        System.out.println(interface1.min);
    }
}


