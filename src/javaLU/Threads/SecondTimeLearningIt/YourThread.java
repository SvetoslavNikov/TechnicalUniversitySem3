package javaLU.Threads.SecondTimeLearningIt;

import javaLU.Threads.MultiThreading.MyRunnable;

//worse method
class YourThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("YourThread is counting: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("I am interrupted");
            }
        }
        System.out.println("YourThread is finished");
    }
}

//better method - doesnt limit inheritance
class YourRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 100; i < 110; i++) {
            System.out.println("Runnable is counting: " + i);
            try {

                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("I am interrupted");
            }
            //System.out.println(1/0); threads are independent
            //one fails other continue
        }
        System.out.println("YourThread is finished");
    }
}

class main {
    public static void main(String[] args) throws InterruptedException {

        //here we use the Thread(Runnable object) constructor
        //Runnable is functional interface so lambda works
        //The lambda () -> { /* code */ } is equivalent to
        // defining an anonymous Runnable class like this:
        // new Runnable() { /* code */}
        Thread deamonThread = new Thread(() -> {
            while (true) {
                System.out.println("Zzz ... daemon thread running");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("User Threads ended. JVM terminate daemon thread");
                }
            }
        });
        deamonThread.setDaemon(true);
        deamonThread.start();
        Thread simpleThread = new YourThread();

        YourRunnable runnable = new YourRunnable();
        Thread runnableThread = new Thread(runnable);

        simpleThread.start();
        simpleThread.join(); //pause the main thread until simple finishes
        //simpleThread.join(5000); //pause the main for 5 sec
        runnableThread.start();

        //user threads - simpleThread, runnableThread
        //daemon threads - gets terminated by jvm when the user threads end

    }
}