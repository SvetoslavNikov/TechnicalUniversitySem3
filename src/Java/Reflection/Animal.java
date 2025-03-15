package Java.Reflection;

class Animal1 {
    private final String name;
    private int age;

    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName(){
        return this.name;
    }

    public void makeSound(){
        System.out.println("Some generic animal sound");
    }

    private void PRIVATE_method (){
        System.out.println("I AM PRIVATE METHOD");
    }
    public static void PUBLIC_STATIC_method (){
        System.out.println("I AM PUBLIC STATIC METHOD??");
    }
    private static void PRIVATE_STATIC_method (){
        System.out.println("i am private static method");
    }
}
