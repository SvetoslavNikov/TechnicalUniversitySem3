package javaLU.Threads;

public class mainy {//*******************************************************************


    public static void main(String[] args) throws InterruptedException {

    	/*
    	thread =	A thread of execution in a program (kind of like a virtual CPU)
    				The JVM allows an application to have multiple threads running concurrently
    				Each thread can execute parts of you code in parallel with the main thread
    				Each thread has a priority.
    				Threads with higher priority are executed in preference compared to threads with a lower priority

    			    The Java Virtual Machine continues to execute threads until either of the following occurs
    					1. The exit method of class Runtime has been called
    					2. All user threads have died

    				When a JVM starts up, there is a thread which calls the main method
    				This thread is called “main”

    				Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
				JVM terminates itself when all user threads (non-daemon threads) finish their execution
    	 */


       System.out.println("Active count: "
               + Thread.activeCount());

        Thread.currentThread().setName("MAIN");
        System.out.println("Current Thread name: "
                + Thread.currentThread().getName());

        Thread.currentThread().setPriority(10);
        System.out.println("Priority: "
                + Thread.currentThread().getPriority());

        System.out.println("Current thread is alive: "
                + Thread.currentThread().isAlive());



    	System.out.println("Current Thread methods checked!");



    }
}

