package Java.J_Design_Patterns.Singleton;

public class DoubleCheckedLockingSingleton {

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

    public void doSomething() {
        System.out.println("Singleton is doing something");
    }
}
