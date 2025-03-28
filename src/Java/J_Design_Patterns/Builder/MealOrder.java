package Java.J_Design_Patterns.Builder;



public class MealOrder {
    private String mainCourse;
    private String sideDish;
    private String drink;
    private String dessert;
    private String specialInstructions;
    
    public MealOrder(MealOrderBuilder builder){
        this.mainCourse = builder.getMainCourse() ;
        this.sideDish = builder.getSideDish() ;
        this.drink = builder.getDrink() ;
        this.dessert = builder.getDessert() ;
        this.specialInstructions = builder.getSpecialInstructions() ;
    }
}


class MealOrderBuilder {
    private String mainCourse;
    private String sideDish;
    private String drink;
    private String dessert;
    private String specialInstructions;

    public MealOrderBuilder setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
        return this;
    }

    public MealOrderBuilder setSideDish(String sideDish) {
        this.sideDish = sideDish;
        return this;
    }

    public MealOrderBuilder setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public MealOrderBuilder setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public MealOrderBuilder setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
        return this;
    }
    
    public MealOrder build(){
        return new MealOrder(this);
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getDrink() {
        return drink;
    }

    public String getDessert() {
        return dessert;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }
}

//A Meal can have multiple components:
//
//Main Course (required)
//Side Dish (optional)
//Drink (optional)
//Dessert (optional)
//Special Instructions (optional)
//
//
//Implement validation rules:
//
//Main Course must be set
//Drink size can only be "Small", "Medium", or "Large"
//Special instructions cannot exceed 100 characters