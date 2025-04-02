package Java.TestDrivenDevelopment.JunitInActionBook.Part1.Chapter2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {



    //version1
    public static List<Integer> getEvenNumbers(int[] numbers){
        if(numbers == null){
            throw new IllegalArgumentException("Don't pass null as an argument pls");
        }
        List<Integer> evenNums = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNums.add(num);
            }
        }
        return evenNums;
    }
}


