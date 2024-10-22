package javaLU.LU3.exercise.myExercises;

/* конструктора не е метод а псевдо метод
препоръчително е променливите на класа да са private
 */

//static - статичните методи могат да се използват без да създаваме инстанция от класа = обект
//Защо е добре да капсолираме стойностите?

class car {

    private String color = "undefined";
    private String model = "undefined";
    private String brand = "undefined";
    private String engine = "undefined";
    private String gearbox = "undefined";
    private int horsepower = 0;
    private int manufactured = 2024;
    public car(String color, String model, String brand, String engine, String gearbox, int horsepower, int manufactured) {
        //this.color = setColor(color);//в сет ще добавим валидатор
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.engine = engine;
        this.gearbox = gearbox;
        this.horsepower = horsepower;
        this.manufactured = manufactured;
    }
    public car(){

    }
        protected String getColor(){
        return color;
    }



    protected String getModel(){
        return model;
    }
    protected void setModel(String model){
        this.model = model;
    }


    protected String getBrand(){
        return brand;
    }
    protected void setBrand(String brand){
        this.brand = brand;
    }


    protected String getEngine(){
        return engine;
    }
    protected void setEngine(String engine){
        this.engine = engine;
    }


    protected String getGearbox(){
        return gearbox;
    }
    protected void setGearbox(String gearbox){
        this.gearbox = gearbox;
    }



    protected int getHorsePower(){
        return horsepower;
    }
    protected void setHorsePower(int horsePower){
        this.horsepower = horsepower;
    }


    protected int getManufacturedYear(){
        return manufactured;
    }
    protected void setManufactured(int manufactured){
        this.manufactured = manufactured;
    }


}
