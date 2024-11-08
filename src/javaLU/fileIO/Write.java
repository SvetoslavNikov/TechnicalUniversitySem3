package javaLU.fileIO;

import java.io.*;

public class Write {
    public static void main(String[] args) {
        String[] arr = {"ALO ", "ÄLO"};
        char[] arrc = {'a','b'};
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("writable.txt"));)
            {
            /*writer.write(22);
            writer.write("\n Svetoslav Nikov \n");
            writer.write(arrc);*/
                for(String s : arr){
                    writer.write(s + "\n");
                }
        } catch(IOException e){
            System.out.println(e);
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("writable.txt"));) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
