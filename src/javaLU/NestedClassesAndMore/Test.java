package javaLU.NestedClassesAndMore;

public class Test {
    public static void main(String[] args) {
        OutsideClass outside = new OutsideClass();
        OutsideClass.InsideClass inside = outside.new InsideClass();
        //if InsideClass was static we can create an instance of it without
        // the need to have instance of the outside class first like so:
        // OutsideClass.InsideClass insider = new OutsideClass.InsideClass();

        outside.printNums(0,0);
        inside.printNums(0,0);
        System.out.println(outside);
        System.out.println(inside);



    }
}
