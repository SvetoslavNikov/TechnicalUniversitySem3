package javaLU.Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(){
            @Override
            public void run() {
                System.out.println("hi there");
            }
        };

        System.out.println(a.getName());
        System.out.println(a.getPriority());
        System.out.println(Thread.activeCount());
        a.start();

        //start() Method:
        //Creates a new thread.
        //
        //Executes the run() method in that new thread.
        //run() Method:
        //Contains the code that defines the thread's task.
        //It’s called automatically by start().

        a.run();
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread());

        MyThread b = new MyThread();
        // b.setDaemon(true);//if we uncomment this the  main program will end
        // and since its daemon threat b will be interrupted
        b.start();
        // b.run(); no need start calls it


        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println
                        ("I am anonymous class implementing the runnable interface. " +
                                "I dont have the methods of a Thread!");
            }
        };

        r.run();



    }
}

