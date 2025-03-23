package Java.Project_A_to_H_included.ExampleExamJavac;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;

public class Student implements Serializable {
    private String name;
    private HashMap<Subject, Integer> subjectGrades;
    private int familyIncome;

    private int standardScholarships;
    private int specialScholarships;

    public Student(String name, HashMap<Subject, Integer> subjectGrades, int familyIncome) {
        this.name = name;
        this.subjectGrades = subjectGrades;
        this.familyIncome = familyIncome;
        this.standardScholarships = 0;
        this.specialScholarships = 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\nname='" + name + '\'' +
                "\nsubjectGrades=" + subjectGrades +
                "\nfamilyIncome=" + familyIncome +
                "\nstandardScholarships=" + standardScholarships +
                "\nspecialScholarships=" + specialScholarships +
                "\n}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Subject, Integer> getSubjectGrades() {
        return subjectGrades;
    }

    public void setSubjectGrades(HashMap<Subject, Integer> subjectGrades) {
        this.subjectGrades = subjectGrades;
    }

    public int getFamilyIncome() {
        return familyIncome;
    }

    public void setFamilyIncome(int familyIncome) {
        this.familyIncome = familyIncome;
    }
    public int getStandardScholarships() {
        return standardScholarships;
    }

    public void setStandardScholarships(int standardScholarships) {
        this.standardScholarships = standardScholarships;
    }

    public int getSpecialScholarships() {
        return specialScholarships;
    }

    public void setSpecialScholarships(int specialScholarships) {
        this.specialScholarships = specialScholarships;
    }
}
