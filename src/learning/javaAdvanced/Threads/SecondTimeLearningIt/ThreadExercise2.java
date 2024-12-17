package learning.javaAdvanced.Threads.SecondTimeLearningIt;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadExercise2 {
    static int shared = 0;
    private static final ReentrantLock lock = new ReentrantLock();

    static class AddThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    shared += 500;
                    System.out.println("AddThread: Added 500. Shared value: " + shared);
                } finally {
                    lock.unlock();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("AddThread interrupted.");
                }
            }
            System.out.println("AddThread finished.");
        }
    }


    static class SubtractRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                lock.lock();
                try {
                    shared -= 500;
                    System.out.println("SubtractRunnable: Subtracted 500. Shared value: " + shared);
                } finally {
                    lock.unlock();
                }
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    System.out.println("SubtractRunnable interrupted.");
                }
            }
            System.out.println("SubtractRunnable finished.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread addThread = new AddThread();
        Thread subtractThread = new Thread(new SubtractRunnable());

        addThread.start();
        subtractThread.start();

        addThread.join();
        subtractThread.join();

        System.out.println("Final shared value: " + shared);
    }
}
