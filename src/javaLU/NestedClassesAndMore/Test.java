package javaLU.NestedClassesAndMore;

public class Test {
    public static void main(String[] args) {
        OutsideClass outside = new OutsideClass();
        OutsideClass.InsideClass inside = outside.new InsideClass();

        outside.printNums(0,0);
        inside.printNums(0,0);
        System.out.println(outside);
        System.out.println(inside);



    }
}
