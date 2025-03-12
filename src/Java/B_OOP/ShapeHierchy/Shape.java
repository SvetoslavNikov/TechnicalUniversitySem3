package Java.B_OOP.ShapeHierchy;

public interface Shape {
    public int calculateArea();
    public default void print(Triangle triangle){
        System.out.println("thats shape");
        System.out.println("Its area is "+ calculateAreaBigTime(triangle));
    }
    public default void print2(){
        System.out.println("second method?");
    }

    private int calculateAreaBigTime(Triangle triangle){
     return triangle.calculateArea();
    }
}
class Triangle implements Shape {

    private int ha;
    private int a;

    public Triangle(int ha,int a) {
        this.ha = ha;
        this.a = a;
    }

    @Override
    public int calculateArea() {
        System.out.println(a*ha/2);
        return a*ha/2;
    }
}

class ShapeDemo1 {
    public static void main(String[] args) {
        Shape triangle = new Triangle(1,2);
        triangle.calculateArea();
        triangle.print((Triangle) triangle);

    }
}
