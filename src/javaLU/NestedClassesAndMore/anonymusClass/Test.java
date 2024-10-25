package javaLU.NestedClassesAndMore.anonymusClass;

public class Test {
    public static void main(String[] args) {
        //we cant create an instance of an interface
        //Обикновено се дефинират като подкласове на дадени класове –
        // просто предефинират определен метод на основния клас,
        // за да се използват в специфична ситуция, или пък за временна имплементация на интерфейс.
        interface1 instanceOfAnonymousClass = new interface1() {
            @Override
            public void sayHi() {
                System.out.println("Hi, i am anonymous class and I implement interface1 and override its method!");
            }
        };

        instanceOfAnonymousClass.sayHi();
    }
}
