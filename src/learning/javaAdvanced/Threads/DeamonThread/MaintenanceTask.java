package learning.javaAdvanced.Threads.DeamonThread;

public class MaintenanceTask extends Thread {
    public void run() {
        while (true) {
            System.out.println("Performing maintenance...");
            try {
                Thread.sleep(5000);  // Wait for 5 seconds before next maintenance
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

