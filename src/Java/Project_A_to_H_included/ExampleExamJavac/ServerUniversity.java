package Java.Project_A_to_H_included.ExampleExamJavac;

import Java.Q_Networking.ServerDemo2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ServerUniversity {
    private static final int PORT = 9999;
    private static final int THREAD_POOL_SIZE = 10;

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("University Server started on port " + PORT);
            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("New client connected: " + clientSocket.getInetAddress());
                    threadPool.execute(new CheckStudentThread(clientSocket));
                } catch (IOException e) {
                    System.err.println("Error accepting client connection: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Could not start server: " + e.getMessage());
        } finally {
            threadPool.shutdown();
        }
    }
}


class CheckStudentThread implements Runnable{
    Socket socket;

    public CheckStudentThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            Student student = (Student) inputStream.readObject();

            int gradeSum = 0;
            int countGrades = 0;
            HashMap<Subject, Integer> grades = student.getSubjectGrades();
            for(Subject subject:grades.keySet()){
                gradeSum += grades.get(subject);
                countGrades ++;
            }
            int avgGrade = (int) Math.round((double)gradeSum/countGrades);
            if(avgGrade > 4){
                System.out.println("You received a scholarship");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}