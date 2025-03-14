package Java.Q_Networking;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1211);
        Socket socket = server.accept();
        Scanner scan = new Scanner(socket.getInputStream());
        String message = scan.nextLine();
        message = message.toUpperCase() + " WIRST DU DEINER MUTTI SAGEN!";
        PrintStream sendout = new PrintStream(socket.getOutputStream());
        sendout.println(message);
        sendout.flush();

        scan.close();
        socket.close();
        server.close();

    }
}

class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.3",1211);

        //sending
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        PrintStream sendData = new PrintStream(socket.getOutputStream());
        sendData.println(message);
        sendData.flush();

        //receiving
        Scanner scanReceived = new Scanner(socket.getInputStream());
        String receivedMessage = scanReceived.nextLine();
        System.out.println(receivedMessage);

        scan.close();
        scanReceived.close();
        socket.close();
    }
}