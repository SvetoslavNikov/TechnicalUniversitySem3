package learning.javaBasics.LU2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Map<User,String> userPassMap = new LinkedHashMap<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Input new user and pass");
        System.out.println("stop/new");
        while(true){
            System.out.println("Command: ");
            String command = scan.nextLine();
            if(command.equalsIgnoreCase("stop")){
                break;
            } else if (command.equalsIgnoreCase("new")) {
                User user = new User();
                System.out.println("Enter new username: ");
                user.setUsername(scan.nextLine());
                System.out.println("Enter your email: ");
                user.setEmail(scan.nextLine());
                System.out.println("Enter your age: ");
                user.setAge(scan.nextInt());
                System.out.println("Enter new pass: ");
                String pass = scan.nextLine();
                userPassMap.put(user, pass);
            } else{
                System.out.println("Invalid command!");
                continue;
            }
        }

        for (User user: userPassMap.keySet()){
            System.out.println(user + " - " + userPassMap.get(user));
        }

        System.out.println("Thanks for committing");
    }
}