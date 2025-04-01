package Java.TestDrivenDevelopment.JunitInActionBook.Part1.Chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestMathUtils {
    private MathUtils mathUtils;

    @Test
    public void testCorrectness(){
        int n = 7;
        assertEquals(7*6*5*4*3*2, mathUtils.factorial(7));
    }


    @Test
    public void testNull(){
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(null));
    }

}
