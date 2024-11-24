package javaSU.su4OOP.ex5;

public class SuiteRoom extends Room {
    int roomCount;

    public SuiteRoom(int roomNumber, String roomType, double pricePerNight, int availableNights, int roomCount) {
        super(roomNumber, roomType, pricePerNight, availableNights);
        setRoomCount(roomCount);
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        if (roomCount > 0) {
            this.roomCount = roomCount;
        } else {
            System.out.println("invalid room count");
        }
    }
}
