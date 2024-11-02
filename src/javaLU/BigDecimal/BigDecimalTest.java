package javaLU.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(6.5555555555555);
        BigDecimal b = new BigDecimal("6.56");
        /*
        System.out.println(b.subtract(a));
        System.out.println(b.add(a));
        System.out.println(b.multiply(a));
        System.out.println(b.divide(a));*/
        //System.out.println(a.setScale(2, RoundingMode.HALF_UP));
        //setting two decimal places and HALF_up is the normal rounding 2.5 -> 3
        a = a.setScale(2, RoundingMode.HALF_UP);
        if(a.compareTo(b)==0){
            System.out.println("Equal numbers");
        } else {
            System.out.println("NOt equal numbers");
        }


    }
}
