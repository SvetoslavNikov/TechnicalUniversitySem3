package javaLU.LU3.exercise.ex1;

public class Teacher extends Person{
    Course courses = new Course();

    public Teacher(){
        super();
        //това пишем ли го ?
    }

    public Teacher(String firstName, String lastName, String birthDate, String courseName){
        super(firstName, lastName, birthDate);
        courses.setName(courseName);
    }
    public void setName(String name){
        courses.setName(name);
    }

    public String getName(){
        return courses.getName();
    }
}
