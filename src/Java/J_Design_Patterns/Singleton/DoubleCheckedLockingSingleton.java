package Java.J_Design_Patterns.Singleton;

//Problem: can still break it with reflection and create new instances unless extra safeguards are added.
//Serialization break -> fixed buy adding readResolve() implementation

import java.io.*;

public class DoubleCheckedLockingSingleton implements Serializable {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
        System.out.println("Instance created");
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                // lock not just the instance the whole class,
                // so only one thread can go inside the block
                // that creates the instance.
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }


    //Java looks for this special method during deserialization.
    //If it finds it,
    //it uses the object returned from that method instead
    //of the newly created one,
    //so it fixes ser issues
    protected Object readResolve(){
        return getInstance();
    }

    public void doSomething() {
        System.out.println("Singleton is doing something");
    }


}

class SingletonSerializationTest {
    public static void main(String[] args) throws Exception {
        DoubleCheckedLockingSingleton instance1 = DoubleCheckedLockingSingleton.getInstance();
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("src/Java/J_Design_Patterns/Singleton/serializedSingleton.obj"));
        out.writeObject(instance1);
        out.flush();
        out.close();

        ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("src/Java/J_Design_Patterns/Singleton/serializedSingleton.obj"));
        DoubleCheckedLockingSingleton instance2 = (DoubleCheckedLockingSingleton) input.readObject();
        input.close();

        if (instance1 != instance2) {
            System.out.println("Singleton Broken Congrats");
        } else {
            System.out.println("not broken");
        }


    }
}