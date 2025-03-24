package Java.F_Multithreading;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable incrementRunnable = new IncrementThread(counter);
        Thread t1 = new Thread(incrementRunnable);
        Thread t2 = new Thread(incrementRunnable);
        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println(counter.getCount());
        System.out.println(counter.getCount());
        System.out.println(counter.getCount());
    }
}


class Counter {
    int count;

    public Counter() {
        count = 0;
    }

//    public void increment() {
//        count++;
//    }
    // without synchronized strange results happen

    public synchronized void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}


class IncrementThread implements Runnable {

    Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
        System.out.println(Thread.currentThread().getName() + " - " + counter.getCount());
    }
}