package Java.Q_Networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo3 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1211);
        Socket socket = server.accept();
        Scanner scan = new Scanner(socket.getInputStream());
        StringBuilder sbuild = new StringBuilder();
        while(scan.hasNextLine() == true){
            sbuild.append(scan.nextLine()).append("\n");
        }
        System.out.println(sbuild);

        server.close();
        socket.close();
        scan.close();
    }
}

class ClientDemo3{
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",1211);
        Scanner scan = new Scanner(System.in);

        StringBuilder sbuild = new StringBuilder();
        while(true){
            String nextLine = scan.nextLine() + "\n";
            if(nextLine.equals("EOF\n")){
                break;
            }
            sbuild.append(nextLine);
        }

        PrintWriter sender = new PrintWriter(socket.getOutputStream());
        sender.print(sbuild.toString());
        sender.flush();
    }
}






















