package javaLU.Hashfunctions.PersonClass;
/*So, the key points are:
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
Objects.equals() will use the custom equals() implementation
only if both objects are of the same class and that class has overridden
the equals() method.

If the classes are not the same,
or if the class has not overridden equals(),
Objects.equals() will use the default implementation,
which compares object references.

*/
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Svetoslav", "Nikov");
        Person p2 = new Person("Svetoslav", "Nikov");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));

        System.out.println(p1 == p2);
        MyClass c1 = new MyClass(1,p1);
        MyClass c2 = new MyClass(1,p2);
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        System.out.println(c1 == c2);

    }
}
