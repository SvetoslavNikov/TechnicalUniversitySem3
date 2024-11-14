package javaLU.fileIO.SoftUniEx;

import java.io.*;
import java.util.Scanner;

public class PrintWriterScannerFileInputStream {
    public static void main(String[] args) {
        String root = System.getProperty("user.dir");

        String inputPath = root + "\\thirdWrite";
        String outputPath = root + "\\thirdWriteNumbers2";

        try(Scanner scanner = new Scanner(new FileInputStream(inputPath));
            PrintWriter writer = new PrintWriter(outputPath)){

            //save all nums
           while(scanner.hasNext()){
               if(scanner.hasNextInt()){
                   writer.write(scanner.next()+" ");
               }else{
                   scanner.next();
               }

           }


        }catch(IOException e){
            e.getStackTrace();
        }
    }
}
















