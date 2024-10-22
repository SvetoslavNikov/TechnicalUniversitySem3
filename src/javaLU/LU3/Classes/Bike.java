package javaLU.LU3.Classes;
class Bike {
    int wheels = 4;
    String color = "";
    public Bike(int wheels){
        this.wheels = wheels;
    }


    protected int getWheels(){
        return wheels;
    }
    protected void setWheels(int wheels){
        this.wheels = wheels;
    }

    protected String getColor(){
        return color;
    }
    protected void setColor(String color){
        this.color = color;
    }
}
