package javaLU.LU3.exercise.ex2;

import javaLU.LU3.exercise.ex1.Person;

public class Student extends Person {
    private String studentNumber;
    private double pik;
    private double te;
    private double ppe;

    Student(String firstName, String lastName, String birthDate,
            String studentNumber, double pik, double te, double ppe){
        super(firstName, lastName, birthDate);
        setNumber(studentNumber);
    }

    public void setNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    public String getNumber(){
        return this.studentNumber;
    }

    public void setPik(double pik){
        this.pik = pik;
    }

    public double getPik(){
        return this.pik;
    }

    public void setPpe(double ppe){
        this.ppe = ppe;
    }

    public double getPpe(){
        return this.ppe;
    }

    public void setTe(double te){
        this.te = te;
    }

    public double getTe(){
        return this.te;
    }



}
