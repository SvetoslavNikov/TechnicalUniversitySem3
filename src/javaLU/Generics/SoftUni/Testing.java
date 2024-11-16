package javaLU.Generics.SoftUni;

public class Testing {
    public static void main(String[] args) {
        GenericClass<Object> n = new GenericClass<>("String");
        n.findMyClass();
        n.printMe();
    }
}
