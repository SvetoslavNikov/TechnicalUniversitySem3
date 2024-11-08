package javaLU.LU4.abstractExercises.classinheretence;

class Food {
    private int caloriesPer100g;

    // Default constructor for Food
    public Food() {
    }

    // Constructor for Food with caloriesPer100g parameter
    public Food(int caloriesPer100g) {

        this.caloriesPer100g = caloriesPer100g;
    }

    public int TotalCalories(int grams){
        return (int) caloriesPer100g*grams;
    }
    public int getCaloriesPer100g() {
        return caloriesPer100g;
    }
}
