package javaLU.Threads.DeamonThread;

public class MainServer {
    public static void main(String[] args) {
        MaintenanceTask maintenanceTask = new MaintenanceTask();
        maintenanceTask.setDaemon(true);  // Set the thread as a daemon
        maintenanceTask.start();

        System.out.println("Main server running...");

        try {
            Thread.sleep(20000);  // Simulate main server running for 20 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main server shutting down...");
    }
}
