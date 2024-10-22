package javaLU.LU3.Classes;

class main {
    public static void main(String[] args) {
        Car mercedes = new Car(4,5);
        System.out.println("color - " + mercedes.getColor() + " " + mercedes.getDoors() + " " + mercedes.getWheels());

        mercedes.setDoors(25);
        mercedes.setColor("Blue");
        mercedes.setWheels(3);


        System.out.println(mercedes.getColor() + " " + mercedes.getDoors() + " " + mercedes.getWheels());



    }
}
