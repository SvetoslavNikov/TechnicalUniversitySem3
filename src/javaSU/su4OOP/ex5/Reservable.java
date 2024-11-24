package javaSU.su4OOP.ex5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public interface Reservable {
    public void updateAvailabilityFromFile() throws IOException;
}

public class RoomLoader implements Reservable{
    @Override
    public void updateAvailabilityFromFile() throws IOException {
        FileReader reader = new FileReader(new File("gosho.txt"));
    }
}
