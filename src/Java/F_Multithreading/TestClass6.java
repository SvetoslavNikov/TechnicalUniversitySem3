package Java.F_Multithreading;

public class TestClass6 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("TestClass6 in F_Multithreading folder");
//
//        String name = Thread.currentThread().getName();
//        Thread.currentThread().setName("MAIN");
//        Thread.currentThread().setPriority(10);//1 lowest 10 highest

        Thread2 t2 = new Thread2("huq");
        //t2.run(); //it runs it and the continues the main thread
//        t2.setDaemon(true);//main thread will end before this finishes so interrupts it
//        System.out.println("Game Start");
//        t2.start();
////        System.out.println(t2.isAlive());
////        System.out.println(t2.isDaemon());
//        t2.join();
//        Thread t3 = new Thread(new MyRunnable("qj"));
//        t3.start();
//
//
//        t3.join();
//        System.out.println("Game Over");


    }
}


class Thread2 extends Thread {
    private String text;

    public Thread2(String text) {
        this.text = text;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(text);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
        System.exit(0);
    }
}

class MyRunnable implements Runnable{

    private final String text;

    public MyRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(text);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }

    }
}

