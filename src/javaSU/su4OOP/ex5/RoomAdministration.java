package javaSU.su4OOP.ex5;

public class RoomAdministration {
    boolean reserveRoom(int numNights, Room room) throws NoAvailableNightsException{
        if (room.getAvailableNights() >= numNights) {
            room.setAvailableNights(room.getAvailableNights() - numNights);
            return true;
        } else {
            throw new NoAvailableNightsException();
        }

    }
}


