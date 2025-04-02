package Java.TestDrivenDevelopment.JunitInActionBook.Part1.Chapter2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestIt{
    //deterministic
    @Test
    public void testCorrectness(){
        int[] arr = {11,22,33,44,55,66,77};
        List<Integer> resultLs = EvenNumbers.getEvenNumbers(arr);
        assertEquals(resultLs,new ArrayList<>(List.of(22,44,66)));
    }

    //randomized
    @Test
    public void testAreAllNumsAreEven(){
        int[] arr = new int[30];

        for (int i = 0; i < 30; i++) {
            arr[i] = (int) (Math.random()*100);
        }

        List<Integer> resultLs = EvenNumbers.getEvenNumbers(arr);
        for (int num: resultLs){
            assertTrue(num%2 == 0);
        }
    }

    @Test
    public void testExceptionThrowing(){
        assertThrows(IllegalArgumentException.class,() -> EvenNumbers.getEvenNumbers(null));
    }
}
