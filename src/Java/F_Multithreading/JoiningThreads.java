package Java.F_Multithreading;

public class JoiningThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 finished.");
        });


        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started. " +
                    "\nIt should finish immediately but it waits for t1");
            try {
                t1.join(); // t2 waits for t1 to finish before proceeding
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 finished.");
        });

        t1.start();
        t2.start();

    }
}
