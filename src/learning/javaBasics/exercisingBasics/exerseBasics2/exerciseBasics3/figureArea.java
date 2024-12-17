package learning.javaBasics.exercisingBasics.exerseBasics2.exerciseBasics3;

import java.util.Scanner;

public class figureArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String figureType = scanner.nextLine();
        double area = 0;

        switch (figureType) {
            case "square":
                double side = scanner.nextDouble();
                area = Math.pow(side, 2);
                break;

            case "rectangle":
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                area = length * width;
                break;

            case "circle":
                double radius = scanner.nextDouble();
                area = Math.PI * radius*radius;
                break;

            case "triangle":
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                area = (base * height) / 2;
                break;

            default:
                System.out.println("Invalid type");
                return;
        }


        System.out.printf("%.1f", area);
    }
}


