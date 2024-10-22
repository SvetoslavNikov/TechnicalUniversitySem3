package javaLU.LU3.exercise.ex1;

public class Course {
    private String name;

    public Course(String name){
        setName(name);
    }

    public Course(){
        this.name = "undefined course";
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
