package javaLU.LU5.exceptionsExercises.ex1;

public class ExceptionExample {
    public static void main(String[] args)
    {
        try {
            //System.out.println(1/0);

            division(100, 0);
        } catch (ArithmeticException e) {
            System.out.println("You can’t divide by zero!");
        } catch (myException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void division (int a, int b) throws myException {
        if(b == 0){
            throw new myException();
        }
        int c = a / b;
        System.out.println(c);

    }
}


