package javaLU.lambda.simpleExamples;

public class Main {
    public static void main(String[] args) {
        /*MyInterface a = new MyInterface() {
            @Override
            public void sayHi() {
                System.out.println("Hi there");
            }
        };*/

        MyInterface a = (name, age) -> {
            System.out.printf("Hi there %s. You are %d years old\n", name, age);
            for (int i = 0; i < 5; i++) {
                System.out.println(123);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted: " + e.getMessage());
                }
            }
        };

        a.sayHi("Svetoslav", 25);
    }
}