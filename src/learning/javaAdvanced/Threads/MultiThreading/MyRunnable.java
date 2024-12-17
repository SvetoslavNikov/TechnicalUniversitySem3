package learning.javaAdvanced.Threads.MultiThreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        try{
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }}catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
