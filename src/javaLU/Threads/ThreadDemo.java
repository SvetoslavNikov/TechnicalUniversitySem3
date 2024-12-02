package javaLU.Threads;

public class ThreadDemo {
    // Example of thread creation using Thread class extension
    static class WorkerThread extends Thread {
        private String name;

        public WorkerThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            // The code that will run in this thread
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " - Count: " + i);
                try {
                    // Simulate some work by sleeping
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(name + " interrupted");
                }
            }
        }
    }

    // Example of thread creation using Runnable interface
    static class RunnableWorker implements Runnable {
        private String name;

        public RunnableWorker(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " - Count: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(name + " interrupted");
                }
            }
        }
    }

    public static void main(String[] args) {
        // Method 1: Extending Thread class
        WorkerThread thread1 = new WorkerThread("Thread-Extends");
        thread1.start();

        // Method 2: Implementing Runnable interface
        Thread thread2 = new Thread(new RunnableWorker("Thread-Runnable"));
        thread2.start();

        // Demonstrating thread synchronization
        SynchronizedCounter counter = new SynchronizedCounter();
        Thread incrementThread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread incrementThread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        incrementThread1.start();
        incrementThread2.start();

        try {
            incrementThread1.join();
            incrementThread2.join();
            System.out.println("Final Counter Value: " + counter.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Synchronized counter to demonstrate thread safety
    static class SynchronizedCounter {
        private int count = 0;

        // Synchronized method to ensure thread-safe incrementation
        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }
}