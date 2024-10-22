package javaLU.LU3.exercise.ex2;

public class Test {
    public static void main(String[] args) {
        Student Nikov = new Student("Svetoslav", "Nikov", "22.06.2002",
                "121223080", 6.00, 5.60, 5.20);
        Nikov.setPik(4.00);
        Nikov.setPpe(6.00);

        System.out.println(

                        Nikov.getFirstName() + " " + Nikov.getLastName()+ "\n"  +
                        Nikov.getBirthDate() + "\n"+
                        Nikov.getPik() + "\n" +
                        Nikov.getBirthDate() + "\n");

    }



}

