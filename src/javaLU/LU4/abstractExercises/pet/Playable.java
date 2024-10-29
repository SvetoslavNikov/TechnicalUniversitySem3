package javaLU.LU4.abstractExercises.pet;

interface Playable {
    void play();

    private static void gosho(){
        System.out.println("Gosho beshe tuk");
    }

    default void start() {
        gosho(); // Using gosho() to share logic
        System.out.println("Starting playback");
    }

}

