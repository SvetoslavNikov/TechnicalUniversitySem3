package learning.designPatterns.BuilderPattern.BuilderPattern;

// The main class to build


public class House {
    private final int bathrooms;
    private final int rooms;
    private final String roofType;

    // Private constructor to enforce use of Builder
    private House(Builder builder) {
        this.bathrooms = builder.bathrooms;
        this.rooms = builder.rooms;
        this.roofType = builder.roofType;
    }

    // Getters for immutability
    public int getBathrooms() {
        return bathrooms;
    }

    public int getRooms() {
        return rooms;
    }

    public String getRoofType() {
        return roofType;
    }

    @Override
    public String toString() {
        return "House [bathrooms=" + bathrooms + ", rooms=" + rooms + ", roofType=" + roofType + "]";
    }

    // Static Builder class
    public static class Builder {
        private int bathrooms;
        private int rooms;
        private String roofType;

        public Builder() {
        }

        public Builder setBathrooms(int bathrooms) {
            this.bathrooms = bathrooms;
            return this; // Enables chaining
        }

        public Builder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder setRoofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}


