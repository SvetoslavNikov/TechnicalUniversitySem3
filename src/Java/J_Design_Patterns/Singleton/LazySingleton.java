package Java.J_Design_Patterns.Singleton;

public class LazySingleton {
    //Problem: what if we have two threads calling getInstance?

    // lazy creation
    // only if method is called
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Instance created");
    }

    public static LazySingleton getInstance() {
        // here we check if the obj is created
        // no matter the number of calls on this method
        // only one instance will be created
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton is doing something");
    }
}

class TestLazySingleton {
    public static void main(String[] args) {
        //Problem with no locking
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                LazySingleton.getInstance();
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
    }
}


