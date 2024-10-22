package javaLU.LU6.Strings.ex1;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("KOME");
        System.out.println(str.append(" ARE BEE"));
        System.out.println(str.indexOf("E"));
        System.out.println(str.deleteCharAt(3));
        System.out.println(str.replace(0, 2,"LETS GOOO"));
        System.out.println(str.substring(0,5));
        System.out.println(str.hashCode());
        System.out.println(str.capacity());
        System.out.println(str.reverse());
        str.delete(1, str.length()-1);
        System.out.println(str.codePointAt(0));//ASCII of E

        System.out.println(str.capacity());




    }
}
