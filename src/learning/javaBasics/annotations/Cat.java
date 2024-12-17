package learning.javaBasics.annotations;

@AnimalClass(dangerous = false)
public class Cat{

    @ImportantField
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @RunThisMethod()
    public String getName() {
        return name;
    }

    @RunThisMethod(times = 3)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @RunThisMethod(times = 3)
    private static void IamPrivateStaticMethod(String hi){
        System.out.println("Hey how did you make me write this:\n"+ hi);
    }

    private void IamPrivateMethod(String hi){
        System.out.println("Hey how did you make me write this:\n"+ hi);
    }
}

