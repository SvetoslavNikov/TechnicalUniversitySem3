package javaLU.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ex1 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("12.345");
        BigDecimal b = new BigDecimal("4.567");

        a=a.add(b);
        a=a.subtract(b);
        //a.multiply(b);
        System.out.println(a);
        try {
            a = a.divide(b);
            //try to always set the rounding because if the division is in period
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println(a.divide(b, 2, RoundingMode.HALF_UP));
        //ArithmeticException will occur;
        System.out.println(a);
        //System.out.println(a.setScale(2, RoundingMode.HALF_UP));

    }
}
