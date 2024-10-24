package javaLU.Hashfunctions.PersonClass;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
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
        System.out.println("");


        Map<Name, Person> mapOfPeople = new HashMap<Name, Person>();
        Name name1 = new Name("Ivan", "Ivanov", "Ivanov");
        Person p1 = new Person(name1, 25);
        Name name2 = new Name("Georgi", "Georgiev", "Georgiev");
        Person p2 = new Person(name2, 25);

        mapOfPeople.put(name1, p1);
        mapOfPeople.put(name2, p2);

        Iterator it = mapOfPeople.entrySet().iterator();//Ще итерира около множеството от Entry-та.
        while (it.hasNext()) { //докато все още има Entry
            Map.Entry<Name, Person> pair = (Map.Entry) it.next(); //от итератора чрез next() взимаме текущата двойка.
            System.out.println("The key is: " + pair.getKey().getFirstName() //на текущата двойка може да и вземем ключа или стойността.
                    + " " + pair.getKey().getLastName() + " The value is: "
                    + pair.getValue().getName().getFirstName()
                    + " "
                    + pair.getValue().getYears());
        }
    }
}
}
*/