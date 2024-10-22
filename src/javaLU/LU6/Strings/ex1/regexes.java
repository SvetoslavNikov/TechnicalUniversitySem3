package javaLU.LU6.Strings.ex1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter correct email pls");
            String email = scan.nextLine();
            if (emailValidator(email)){
                System.out.println("Email is correct");
                break;
            }
        }
    }

    public static boolean emailValidator(String email) {
        final String MAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(MAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
