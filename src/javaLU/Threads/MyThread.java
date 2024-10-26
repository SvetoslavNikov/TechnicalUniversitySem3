package javaLU.Threads;

public class MyThread extends Thread {

    public MyThread(){
        super();
    }
    public MyThread(String name){
        super(name);
    }

    public MyThread(Runnable target){
        super(target);
    }

    public MyThread(Runnable target, String name){
        super(target, name);
    }

    @Override
    public void run() {


        if (this.isDaemon()) {
            System.out.println("This is a daemon thread that is running");
        } else {
            System.out.println("This is a user thread that is running");
        }
        try {
        for (int i = 5; i > 0; i--) {
            System.out.println("Threads ends in: " + i);

                Thread.sleep(1000);

        }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("END");

    }

    // public void start(){
    //     System.out.println("Thread has started!");
    // }
}
