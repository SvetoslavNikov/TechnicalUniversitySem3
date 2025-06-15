package Java.A_Syntax.Strings;

public class Test {
    public static void main(String[] args) {

        String s = new String("Sve");
        String b = "Sve";
        String c = s.intern();

        if(s == b){
            System.out.println("Try programiz.pro1");
        }

        if(s == c){
            System.out.println("Try programiz.pro2");
        }

        if(b == c){
            System.out.println("Try programiz.pro3");
        }

    }
}
