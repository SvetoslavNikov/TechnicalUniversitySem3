package Java.B_OOP.ShapeHierchy;

abstract class ShapeClass {
    abstract void calculateArea();
    void print(){
        System.out.println("that's a shape!");
    }
}

class Rectangle extends ShapeClass{

    int a;

    public Rectangle(int a) {
        this.a = a;
    }

    @Override
    void calculateArea() {
        System.out.println(a*a);
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        ShapeClass rect = new Rectangle(5);
        rect.calculateArea();
        rect.print();

    }
}
