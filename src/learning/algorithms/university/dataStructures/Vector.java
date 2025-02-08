package learning.algorithms.university.dataStructures;

public class Vector {
    private double x, y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }

    public double dotProduct(Vector other) {
        return this.x * other.x + this.y * other.y;
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Vector v1 = new Vector(3, 4);
        Vector v2 = new Vector(1, 2);

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        System.out.println("v1 + v2: " + v1.add(v2));
        System.out.println("v1 - v2: " + v1.subtract(v2));
        System.out.println("Dot product: " + v1.dotProduct(v2));
        System.out.println("Magnitude of v1: " + v1.magnitude());
    }
}
