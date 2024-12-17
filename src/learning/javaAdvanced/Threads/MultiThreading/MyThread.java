package learning.javaAdvanced.Threads.MultiThreading;

class MyThread extends Thread {
    @Override
    public void run() {
        try{for (int i = 0; i < 10; i++) {

            System.out.println("           " + (10 - i));
            Thread.sleep(1000);
        }}catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
