package Java.J_Design_Patterns.Singleton;

//problem: can still break it with reflection and create new instances unless extra safeguards are added.
//serialization break -> fixed by adding readResolve() implementation

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

