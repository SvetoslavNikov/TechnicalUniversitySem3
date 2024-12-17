package learning.javaAdvanced.Reflection;

public class Cat{
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private static void IamPrivateStaticMethod(String hi){
        System.out.println("Hey how did you make me write this:\n"+ hi);
    }

    private void IamPrivateMethod(String hi){
        System.out.println("Hey how did you make me write this:\n"+ hi);
    }
}
