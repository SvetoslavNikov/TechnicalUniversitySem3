package learning.javaBasics.LU2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String,String> namePassMap = new HashMap<>();


        System.out.println("Input new name and pass");
        System.out.println("stop/new");
        while(true){
            System.out.println("Command: ");
            String command = scan.nextLine();
            if(command.equalsIgnoreCase("stop")){
                break;
            } else if (command.equalsIgnoreCase("new")) {
                System.out.println("Enter new username: ");
                String name = scan.nextLine();
                System.out.println("Enter new pass: ");
                String pass = scan.nextLine();
                namePassMap.put(name, pass);
            } else{
                System.out.println("Invalid command!");
                continue;
            }
        }

        for (String name: namePassMap.keySet()){
            System.out.println(name + " - " + namePassMap.get(name));
        }

        System.out.println("Thanks for committing");
    }
}
