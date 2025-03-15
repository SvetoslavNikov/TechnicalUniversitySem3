package Java.E_IO.serialization;


import java.io.*;

/*
Serialization is the process of converting an object or data structure
into a format that can be easily stored,
transmitted, or reconstructed later.
The most common formats for serialized data are JSON, XML, YAML, and binary formats
 */

public class SerializableTest{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog = new Dog("Leo",25,Breed.FrenchBulldog);
        Dog dog1 = new Dog("Sharina",12,Breed.GoldenRetriveer);

        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\E_IO\\serialization\\dog.ser");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(dog);
        objOut.writeObject(dog1);

        System.out.println("Dog objects saved");

        //now lets read it
        FileInputStream fileIn = new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\E_IO\\serialization\\dog.ser");
        ObjectInputStream objIn = new ObjectInputStream(fileIn);


        while(true) {
            try {
                Dog deserializedDog = (Dog) objIn.readObject();
                System.out.println(deserializedDog.toString());
            }catch(EOFException e){
                break;
            }
        }

    }
}

class Dog implements Serializable {
    String name;
    int age;
    Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + breed;
    }
}

enum Breed{
    GermanShepherd(0),GoldenRetriveer(1),SiberianHusky(2),FrenchBulldog(3);
    private final int code;
    Breed(int code){
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }
}























