package learning.designPatterns.exercisesOOP.ex5;

public class Room {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private int availableNights;


    public Room(int roomNumber, String roomType, double pricePerNight, int availableNights) {
        setRoomNumber(roomNumber);
        setRoomType(roomType);
        setPricePerNight(pricePerNight);
        setAvailableNights(availableNights);
    }

    public Room() {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        if (roomNumber > -1) {
            this.roomNumber = roomNumber;
        } else {
            System.out.println("invalid roomNumber");
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        if (roomType.equals("single")
                || roomType.equals("double")
                || roomType.equals("triple")) {
            this.roomType = roomType;
        } else {
            System.out.println("Please enter valid room type: single/double/triple");
        }
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        if (pricePerNight < 0) {
            System.out.println("invalid price");
        } else {
            this.pricePerNight = pricePerNight;
        }
    }

    public int getAvailableNights() {
        return availableNights;
    }

    public void setAvailableNights(int availableNights) {
        if (availableNights < 0) {
            System.out.println("availableNights can't be negative num");
        } else {
            this.availableNights = availableNights;
        }
    }
}
