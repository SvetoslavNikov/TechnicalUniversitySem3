package javaLU.NestedClasses;

import java.util.HashMap;

public class Car {
    private int price;

    public class Engine {
        private int power;

        public Engine(int power) {
            this.power = power;
        }
        //inner class
        public static void factorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException();
            }
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println(result);
        }

        public static int recursiveFactorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException();
            }
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * recursiveFactorial(n - 1);
        }
    }

    public static class Tires {
        private int count;

        //static inner class with local class
        public static void calculateCarPlusTiresPrice(Tires tires, Car car) {
            class Bolts {
                //can not be static, public
                private int price;

                public Bolts(int price) {
                    this.price = price;
                }

                public int getPrice() {
                    return price;
                }
            }

            Bolts bolts = new Bolts(20);
            System.out.println("Price: " + (bolts.getPrice() * 6 * tires.count + car.price));
        }

        public int getCount() {
            return count;
        }

        public Tires(int count) {
            this.count = count;
        }
    }

    public Car(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}

interface SaveInHashMap {
    HashMap<Integer, Integer> save(int n, int factorial);
}

class Main {
    public static void main(String[] args) {
        Car.Tires tires = new Car.Tires(4);

        Car car = new Car(2000);
        Car.Engine engine = car.new Engine(255);

        Car.Tires.calculateCarPlusTiresPrice(tires, car);

        Car.Engine.factorial(4);

        SaveInHashMap saver = new SaveInHashMap() {
            @Override
            public HashMap<Integer, Integer> save(int n, int factorial) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(n, factorial);
                return map;
            }
        };

        HashMap<Integer, Integer> map = saver.save(4, Car.Engine.recursiveFactorial(4));
        System.out.println(map);
    }
}


