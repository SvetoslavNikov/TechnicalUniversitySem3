package javaLU.LU3.Classes;

 class Car extends Bike {
    int doors = 4;

    protected int getDoors(){
        return doors;
    }
    protected void setDoors(int doors){
        this.doors = doors;
    }

    public Car(int doors, int wheels){
        super(wheels);
        this.doors = doors;

    }

}
