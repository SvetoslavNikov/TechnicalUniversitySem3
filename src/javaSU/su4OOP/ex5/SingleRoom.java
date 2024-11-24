package javaSU.su4OOP.ex5;

public class SingleRoom extends Room {
    private String bedType;

    public SingleRoom(int roomNumber, String roomType, double pricePerNight, int availableNights, String bedType) {
        super(roomNumber, roomType, pricePerNight, availableNights);
        this.bedType = bedType;
    }

    public void setBedType(String bedType) {
        if (bedType.equalsIgnoreCase("small") || bedType.equalsIgnoreCase("big")) {
            this.bedType = bedType;
        } else {
            System.out.println("Invalid bed type. Enter small/big");
        }
    }

    public String getBedType() {
        return bedType;
    }
}
