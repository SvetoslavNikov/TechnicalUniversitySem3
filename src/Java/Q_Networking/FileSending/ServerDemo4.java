package Java.Q_Networking.FileSending;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class ServerDemo4 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1211);
        Socket socket = server.accept();
        Scanner scan = new Scanner(socket.getInputStream());
        Path destination = Paths.get("C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\Q_Networking\\FileSending\\destination.txt");
        Files.writeString(destination,"");//overrides the file to empty
        while (scan.hasNextLine()) {
            String nextLine = scan.nextLine();
            if (nextLine.equals("EOF")) {
                break;
            }
            System.out.println("Received: " + nextLine);
            Files.writeString(destination, nextLine + "\n", StandardOpenOption.APPEND);
        }
        System.out.println(Files.readString(destination));
    }
}

class ClientDemo4 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 1211);
        Path source = Paths.get("C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\Q_Networking\\FileSending\\source.txt");
        PrintWriter sender = new PrintWriter(socket.getOutputStream());
        List<String> text = Files.readAllLines(source);
        for (int i = 0; i < text.size(); i++) {
            sender.println(text.get(i));
        }
        sender.flush();
    }
}