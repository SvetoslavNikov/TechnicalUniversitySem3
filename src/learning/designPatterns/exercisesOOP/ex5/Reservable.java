package learning.designPatterns.exercisesOOP.ex5;

import java.io.IOException;

public interface Reservable {
    public void updateAvailabilityFromFile() throws IOException;
}

/*public class RoomLoader implements Reservable{
    @Override
    public void updateAvailabilityFromFile() throws IOException {
        FileReader reader = new FileReader(new File("gosho.txt"));
    }
}
*/