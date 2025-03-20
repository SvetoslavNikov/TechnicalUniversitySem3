package Java.Servlets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class WebServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8070);

        while (true) {
            Socket senderSocket = server.accept();
            InputStream inputStream = senderSocket.getInputStream();
            BufferedReader readInput = new BufferedReader
                    (new InputStreamReader(inputStream));
            String line;
            while (!(line = readInput.readLine()).isEmpty()) {
                System.out.println(line);
            }

            OutputStream outputStream = senderSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream);
            writer.println("HTTP/1.1 200 OK");
            writer.println("Content-Type: text/html");
            writer.println();
            writer.println("<h1>Hi there baby. That my ServerSocket</h1>");
            writer.flush();
            senderSocket.close();
        }
    }
}