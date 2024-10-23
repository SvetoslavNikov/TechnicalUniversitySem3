package javaLU.Hashfunctions;

public class Article {
    //Hash function in programming is often used to compare two objects.
    //Hash functions can be customized, override.So it gives the same hash code,
    //when for example an important variable of our object is the same as in others.

    //Collusion is when two different inputs in a complex object result in two identical hashcodes.

    //equal default method returns true only if both objects have same reference
    //public boolean equals(Object obj) {
    //	    return (this == obj);
    //	  }


    /* Hashmap works with key value pairs like dictionary
    Hashmap<Key type, Value type> map = new Hashmap<>();

    Hashmap uses hashcode of the key when we use get() for example
    so if we haven't predefined the hashCode() method we can only access the value by the reference not by entering same key value
    (if the key is a reference data type of course)

    Важно нещо, което трябва да запомните, е че когато добавите елемент чрез метода put(K,V),
    ако подадете един и същи ключ два пъти, то новата стойност ще замени старата и старата ще бъде изгубена.


    -------
    най-голямото предимство на структурата е, че гарантира константно време за достъп до елементите
    подходяща за случаи, при които се налага бърз достъп и често търсене.

     Важно е да се каже, че структурата си има и два много важни параметъра – load factor и initial capacity.
     Load factor 0.75
     initial capacity 100

     When it reaches 75 it will expand the capacity to 200, reaches 150 to 400 and so on.


Тъй като вътрешната организация на HashMap не е толкова проста – колекционира всички двойки като обекти от тип Entry,
то обхождането на тази колекция е малко по-особено. Всъщност Entry е вложен клас в класа Map, затова се достъпва с Map.Entry.
Ще трябва да си декларираме Iterator, който да итерира множеството(Set) от всички Entry-та (това са всички съществуващи двойки).
И така всяко едно Entry си има ключ и стойност, съответно с getKey() и getValue() ще ги достъпваме.


public static void main(String[] args) {
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
					+" "
					+ pair.getValue().getYears());
		}
	}
	
Резултат:
The key is: Ivan Ivanov The value is: Ivan 25
The key is: Georgi Georgiev The value is: Georgi 25
Друг вариант за обхождане на Map е чрез for each. За нашия пример:


for (Map.Entry<Name, Person> me : mapOfPeople.entrySet()) {
	          System.out.println("Key: "+me.getKey().getFirstName() + " & Value: " + me.getValue().getName().getFirstName() + " " + me.getValue().getYears());
	        }
Друга известна имплементация на интерфейса Map е HashTable. Всъщност няма чак толкова разлики между двете, с изключението,
че HashTable представлява синхронизирана имплементация – предотвратява опастността от конкурентен достъп.
Какво означава това? Означава, че HashTable може да бъде достъпвана
само от една нишка в един момент – тоест никоя друга не може да работи с нея, докато при HashMap не е така.
Когато няколко нишки се опитват да променят HashTable, то първата достъпила я, я заключва и другите остават да чакат да бъде освободена.

Също така е добре да знаете, че LinkedHashMap като имплементация на Map, поддържа двойките си по реда на постъпването им в нея.
TreeMap пък поддържа двойките си сортирани по т.нар. “natural order” на ключовете им.
     */


}
