package javaLU.Hashfunctions.PersonClass;

public class Test {
    public static void main(String[] args) {
        Person me = new Person();
        System.out.println(me.hashCode());
        Person you = me;
        Person he = new Person("Svetoslav", 123);
        Person she = new Person();//same value as "me" different memory adress

        System.out.println(me.equals(you));
        System.out.println(me.equals(he));

        System.out.println();
        System.out.println(me.getClass());
        System.out.println(he.getClass());
    }
}
