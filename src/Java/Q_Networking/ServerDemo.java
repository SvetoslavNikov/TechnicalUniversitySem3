package Java.Q_Networking;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        int number;
        ServerSocket server = new ServerSocket(1211);
        Socket socket = server.accept();
        Scanner scan = new Scanner(socket.getInputStream());
        number = scan.nextInt();
        PrintStream printout = new PrintStream(socket.getOutputStream());
        if((number % 2) == 0){
            printout.println("your number is even");
        } else {
            printout.println("your number is odd");
        }
        server.close();

    }
}

class ClientDemo{
    public static void main(String[] args) throws IOException {
        int number;
        Socket s = new Socket("127.0.0.1",1211);
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(s.getInputStream());
        PrintStream printout = new PrintStream(s.getOutputStream());
        System.out.println("Enter some Value");
        try{
            number = scan.nextInt();
            printout.println(number);
            String input = scan2.nextLine();
            System.out.println(input);
        }catch(InputMismatchException e){
            System.out.println("Enter correct value");
        } finally {
            if (s != null)
                s.close();
            if (scan != null)
                scan.close();
            if (scan2 != null)
                scan2.close();
        }









    }
}