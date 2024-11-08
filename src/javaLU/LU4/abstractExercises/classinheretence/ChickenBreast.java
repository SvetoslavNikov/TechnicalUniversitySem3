package javaLU.LU4.abstractExercises.classinheretence;

public class ChickenBreast extends Food{
    String color;

    public ChickenBreast(){
        super();
    }

    public ChickenBreast(int caloriesPer100g, String color){
        super(caloriesPer100g);
        this.color = color;
    }

    public int TotalCaloriesInChiken(int grams){
        int caloriesForDigesting = grams;

        return super.TotalCalories(grams)+caloriesForDigesting;
    }

    @Override
    public int getCaloriesPer100g() {
        return super.getCaloriesPer100g();
    }
}

//in java we use super to call the superclass constructor
//we use super to call superclass methods