package Java.J_Design_Patterns.Singleton;

// the basic implementation

public class EagerSingleton {
    // Problem: the obj is created even if not called
    // Eagerly creation
    private static EagerSingleton instance = new EagerSingleton();

    // constructor is private because we don't want other classes to create instances
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton is doing something");
    }
}
