package Java.J_Design_Patterns.Prototype;


abstract class Shape implements Cloneable {
    private String type;

    public Shape() {
        type = "Shape";
    }

    public Shape(String type) {
        this.type = type;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getInfo() {
        return "This is a " + type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}




class Circle extends Shape {
    private int radius;

    public Circle() {
        super("Circle");
    }

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " with radius " + radius;
    }
}


class PrototypeDemo {
    public static void main(String[] args) {
        Circle circlePrototype = new Circle(5);
        System.out.println(circlePrototype.getInfo());

        // Clone the prototype to create a new instance
        Circle clonedCircle = (Circle) circlePrototype.clone();
        clonedCircle.setRadius(10);
        System.out.println(clonedCircle.getInfo());
    }
}