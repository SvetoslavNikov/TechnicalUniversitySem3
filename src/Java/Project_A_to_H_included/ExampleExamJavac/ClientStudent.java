package Java.Project_A_to_H_included.ExampleExamJavac;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ClientStudent {
    public static void main(String[] args) {
        //send
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("New Student wants money? y/n");
            String answer = scan.nextLine();
            if(answer.equalsIgnoreCase("n")){
               break;
            }

            Student student = ClientStudent.generateRandomStudent();
            System.out.println(student);

            //send the object
            ClientStudent.sendStudent(student);
        }


    }

    private static void sendStudent(Student student){
        try(Socket socket = new Socket("127.0.0.1", 9999)){
            ObjectOutputStream outputStream = new ObjectOutputStream
                    (socket.getOutputStream());
            outputStream.writeObject(student);
            outputStream.flush();
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    private static Student generateRandomStudent(){
        Random rand = new Random();

        String name = "StudentsNumber: " + rand.nextInt();

        int grade;
        HashMap<Subject,Integer> grades = new HashMap<>();

        for (Subject subject : Subject.values()){
            grade = rand.nextInt(2,7);
            grades.put(subject, grade);
        }

        int familyIncome = rand.nextInt(100,700);

        return new Student(name,grades, familyIncome);
    }
}
