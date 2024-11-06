package javaLectures.hashcodeTest;

public class test {
    public static void main(String[] args) {
        Person a = new Person("ivan", 25);
        Person b = new Person("ivan",25);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
    }
}
