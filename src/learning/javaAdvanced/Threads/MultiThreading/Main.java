package learning.javaAdvanced.Threads.MultiThreading;

public class Main{

    public static void main(String[] args) throws InterruptedException{

        System.out.println("Active count: "
                + Thread.activeCount());//default 2


        // Create a subclass of Thread
        MyThread thread1 = new MyThread();

        //or

        //implement Runnable interface and pass instance as an argument to Thread()
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);


        //thread1.setDaemon(true); if only one is Daemon it waits the other one to stop
        //thread2.setDaemon(true); if both they stop with the main thread

        thread1.start();
        thread1.join(5000); //calling thread (ex.main) waits until the specified
        // thread dies (no num in brackets) or for x milliseconds
        thread2.start();

        System.out.println("Active count: "
                + Thread.activeCount());//4

        System.out.println(1/0);


    }
}
