package javaLU.BuilderPattern;

public class BuilderDemo {

        public static void main(String[] args) {

            House house = new House.Builder()
                    .setBathrooms(2)
                    .setRooms(4)
                    .setRoofType("Gable")
                    .build();

            System.out.println(house);


        }
    }


