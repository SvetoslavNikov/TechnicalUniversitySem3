package Java.J_Design_Patterns.Prototype;

// use the prototype pattern when your code should not depend on concrete classes
// of objects that you need to copy or duplicate

public abstract class Vehicle{
    private String brand;
    private String model;
    private String color;

    protected Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public abstract Vehicle clone();
}

class Car extends Vehicle{
    int topspeed;

    public Car(Car car) {
        super(car);
        this.topspeed = car.topspeed;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}

class Bus extends Vehicle{
    int wheels;

    public Bus(Bus bus) {
        super(bus);
        this.wheels = bus.wheels;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}