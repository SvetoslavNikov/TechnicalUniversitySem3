package Java.J_Design_Patterns.Singleton;

public class SynchronizedLazySingleton {

    private static SynchronizedLazySingleton instance;

    private SynchronizedLazySingleton() {
        System.out.println("Instance created");
    }
    // Problem:
    // using synchronized on this method means that
    // every time it's called, the method gets locked, even after the instance
    // is already created.
    //
    // this is super slow because it forces each thread to
    // wait its turn to call the method, even though there's no need to lock it
    // once the instance is created.
    public static synchronized SynchronizedLazySingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedLazySingleton();
        }

        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton is doing something");
    }
}
