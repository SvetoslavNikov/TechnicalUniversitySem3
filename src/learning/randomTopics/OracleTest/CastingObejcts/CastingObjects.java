package learning.randomTopics.OracleTest.CastingObejcts;

class CastingObjects {
    static class Animal{
        void makesond(){
            System.out.println("Making Sound");
        }
    }

    static class Dog extends Animal{
        @Override
        void makesond() {
            System.out.println("Bark Bark");
        }

        void drinkingWater(){
            System.out.println("Slurp Slurp");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        //Dog dog = (Dog) animal; //ClassCastException

        //DOWN CASTING
        Animal animal1 = new Dog();
        Dog dog1 = (Dog) animal1;
        dog1.drinkingWater();

        //UP CASTING
        Dog dog2 = new Dog();
        Animal animal2 = dog2;
        animal2.makesond();//BARK BARK
        //animal2.drinkingWater();//does not compile
    }


}























































































//s