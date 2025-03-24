package Java.F_Multithreading;

public class Test3 {
    public static void main(String[] args) {
        Runnable r1 = new Thread1();
        Thread t1 = new Thread(r1);

        Runnable r2 = new Thread22(t1);
        Thread t2 = new Thread(r2);


        Runnable r3 = new Thread3(t2);
        Thread t3 = new Thread(r3);


        t3.start();






    }
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread 1 started");
        System.out.println("Thread 1 finished");

    }
}



class Thread22 implements Runnable{

    Thread threadToWait;

    public Thread22(Thread threadToWait) {
        this.threadToWait = threadToWait;
    }

    @Override
    public void run() {
        System.out.println("Thread 22 started");
        try {
            threadToWait.start();
            threadToWait.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 2 finished");
    }
}



class Thread3 implements Runnable{


    Thread threadToWait;

    public Thread3(Thread threadToWait) {
        this.threadToWait = threadToWait;
    }

    @Override
    public void run() {
        System.out.println("Thread 3 started");
        try {
            threadToWait.start();
            threadToWait.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 3 finished");
    }
}