package javaLU.LU3.exercise.ex1;

public class Test {
    public static void main(String[] args) {
        Teacher Petrova = new Teacher("Petq", "Petrova","02.06.2002", "German Philosophy");
        System.out.println(
                Petrova.getName() + "\n" +
                Petrova.getFirstName() + " " + Petrova.getLastName()+ "\n"  +
                Petrova.getBirthDate() + "\n"+
                Petrova.courses.getName());

    }
}
