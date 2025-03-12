package Java.B_OOP;

//Encapsulation
class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println("Some generic animal sound");
    }
}

//Inheritance
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}

abstract class Bird{
    int age;
    abstract void fly();
}

class Sparrow extends Bird{
    @Override
    void fly(){
        System.out.println("Sparrow flies");
    }
    int getAge(){
        return age;
    }
}