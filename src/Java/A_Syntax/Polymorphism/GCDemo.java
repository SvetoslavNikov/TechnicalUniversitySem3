package Java.A_Syntax.Polymorphism;

public class GCDemo {
    static class MyObject {
        private int id;

        MyObject(int id) {
            this.id = id;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object " + id + " is being garbage collected");
        }
    }

    public static void main(String[] args) {
        createObjects();

        // Suggest GC to run (not guaranteed)
        System.gc();

        // Wait to give GC a chance
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
    }

    static void createObjects() {
        for (int i = 1; i <= 10; i++) {
            MyObject obj = new MyObject(i);
            // obj goes out of scope here (eligible for GC)
        }
    }
}
