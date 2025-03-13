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

        ServerSocket server = new ServerSocket(1211); // Creates a server socket listening on port 1211

        Socket socket = server.accept(); // Waits for a client connection and accepts it

        Scanner scan = new Scanner(socket.getInputStream()); // Reads data from the client's socket stream

        number = scan.nextInt(); // Reads an integer sent by the client

        PrintStream printout = new PrintStream(socket.getOutputStream()); // Creates a stream to send data back to the client

        if((number % 2) == 0){ // Checks if the number is even
            printout.println("your number is even"); // Sends "even" message to the client
        } else {
            printout.println("your number is odd"); // Sends "odd" message to the client
        }

        server.close(); // Closes the server socket to free up resources
    }
}


class ClientDemo{
    public static void main(String[] args) throws IOException {
        int number;

        Socket s = new Socket("127.0.0.1",1211); // Connects to the server at localhost (127.0.0.1) on port 1211

        Scanner scan = new Scanner(System.in); // Scanner for user input
        Scanner scan2 = new Scanner(s.getInputStream()); // Scanner to read data coming from the server

        PrintStream printout = new PrintStream(s.getOutputStream()); // Stream to send data to the server

        System.out.println("Enter some Value"); // Prompts the user to enter a number

        try {
            number = scan.nextInt(); // Reads an integer from the user
            printout.println(number); // Sends the number to the server

            String input = scan2.nextLine(); // Reads the response from the server
            System.out.println(input); // Prints the server's response (odd/even)
        } catch (InputMismatchException e) { // Catches input errors (if the user enters non-numeric data)
            System.out.println("Enter correct value"); // Displays an error message
        } finally { // Ensures resources are closed properly
            if (s != null) // If the socket is open, close it
                s.close();
            if (scan != null) // If the scanner for user input is open, close it
                scan.close();
            if (scan2 != null) // If the scanner for server response is open, close it
                scan2.close();
        }
    }
}





    }
}