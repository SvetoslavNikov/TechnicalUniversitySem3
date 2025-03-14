package Java.Q_Networking.FileListSending;

import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServerDemo5 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1211);
        Socket socket = server.accept();
        Scanner scan = new Scanner(socket.getInputStream());
        String folder = "C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\Q_Networking" +
                "\\FileListSending\\Destination\\";
        List<Path> destinationPaths = new ArrayList<>();

        while (true) {
            String nextfile = scan.nextLine();
            if (nextfile.equals("That were all file names")) {
                break;
            }
            Path pathNextFile = Paths.get(folder+nextfile);
            Files.createFile(pathNextFile);
            destinationPaths.add(pathNextFile);
            System.out.printf("File %s created", nextfile);
        }


        for (int i = 0; i < destinationPaths.size(); i++) {
            while (true) {
                String nextLine = scan.nextLine();
                if (nextLine.equals("EOF")) {
                    break;
                }
                System.out.printf("File %d - line received: %s%n", i, nextLine);
                Files.writeString(destinationPaths.get(i), nextLine + "\n", StandardOpenOption.APPEND);
            }
        }

        server.close();
        socket.close();
        scan.close();
    }
}

class ClientDemo5 {
    public static void main(String[] args) throws IOException {


        Socket socket = new Socket("127.0.0.1", 1211);
        PrintWriter sender = new PrintWriter(socket.getOutputStream());

        String folderPath = "C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\Q_Networking\\FileListSending\\Source";
        List<Path> paths = ClientDemo5.getFilePathsFromFolder(folderPath);
        List<String> fileNames = ClientDemo5.getFileNames(paths);

        //send the file names
        for (String filename : fileNames) {
            sender.println(filename);
        }
        sender.println("That were all file names");
        sender.flush();


        for (int i = 0; i < paths.size(); i++) {
            Path path = paths.get(i);
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                sender.println(line);
            }
            sender.flush();
        }
    }

    private static List<Path> getFilePathsFromFolder(String folderPath) {
        List<Path> paths = new ArrayList<>();
        try (DirectoryStream<Path> streamOfPaths = Files.newDirectoryStream(Paths.get(folderPath))) {
            for (Path file : streamOfPaths) {
                System.out.println("Path found: " + file.getFileName());
                paths.add(file);
            }
        } catch (IOException | DirectoryIteratorException e) {
            e.printStackTrace();
        }
        return paths;
    }

    private static List<String> getFileNames(List<Path> files) {
        List<String> fileNames = new ArrayList<>();
        for (Path file : files) {
            fileNames.add(String.valueOf(file.getFileName()));
        }
        return fileNames;
    }
}