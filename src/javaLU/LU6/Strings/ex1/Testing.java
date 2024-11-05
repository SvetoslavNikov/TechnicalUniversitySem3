package javaLU.LU6.Strings.ex1;

public class Testing {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer();
        System.out.println("Capacity: " + a.capacity());

        a.append(3);
        a.append(true);
        char[] arr = {'a','b','c'};
        a.append(arr);
        StringBuffer b = new StringBuffer("STRINGBUFFER B");
        a.append(b);
        System.out.println(a.compareTo(b));
        System.out.println(a.);
    }
}
