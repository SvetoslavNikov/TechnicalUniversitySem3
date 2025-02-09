package learning.randomTopics;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        // Private constructor prevents instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (Singleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

