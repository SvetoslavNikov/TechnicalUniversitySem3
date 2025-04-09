package Java.J_Design_Patterns.Builder;

public class MealOrder {
    private final String mainCourse;
    private final String sideDish;
    private final String drink;
    private final String dessert;
    private final String specialInstructions;

    private MealOrder(Builder builder) {
        this.mainCourse = builder.mainCourse;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.specialInstructions = builder.specialInstructions;
    }

    public static class Builder {
        private String mainCourse;
        private String sideDish;
        private String drink;
        private String dessert;
        private String specialInstructions;

        public Builder setMainCourse(String mainCourse) {
            this.mainCourse = mainCourse;
            return this;
        }

        public Builder setSideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        public Builder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder setSpecialInstructions(String specialInstructions) {
            this.specialInstructions = specialInstructions;
            return this;
        }

        public MealOrder build() {
            return new MealOrder(this);
        }
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

