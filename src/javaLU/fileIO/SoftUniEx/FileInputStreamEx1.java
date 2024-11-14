package javaLU.fileIO.SoftUniEx;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx1 {
    public static void main(String[] args) {
        String root = System.getProperty("user.dir");
        //project path
        //C:\Users\Lenovo\IdeaProjects\TechnicalUniversitySem3
        String path = root + "\\thirdWrite";
        try(FileInputStream fileStream = new FileInputStream((path))){
            int oneByte = fileStream.read();

            while (oneByte >= 0) {
                System.out.print((char)oneByte);
                oneByte = fileStream.read();
                //returns -1 at the end of the file
            }
        }catch(IOException e){
            System.out.println(e);
        }



    }
}
