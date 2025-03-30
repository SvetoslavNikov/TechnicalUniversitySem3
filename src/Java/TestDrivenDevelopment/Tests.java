package Java.TestDrivenDevelopment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    private MathUtils utils = new MathUtils();

    @Test
    public void testCalculateAverage(){
        double[] numbers = {12,14,16};
        double result = utils.calculateAverage(numbers);
        assertEquals(14, result, 0.001);
    }

    @Test
    public void testCalculateAverageWithNegativeNums(){
        double[] numbers = {-12,-14,-16};
        double result = utils.calculateAverage(numbers);
        assertEquals(-14, result, 0.001);
    }

    @Test
    public void testCalculateAverageEmptyArray(){
        double[] numbers = {};
        double result = utils.calculateAverage(numbers);
        assertEquals(-14, result, 0.001);
    }

    @Test
    public void testCalculateAverageNull(){
        double[] numbers = null;
        double result = utils.calculateAverage(numbers);
        assertEquals(-14, result, 0.001);
    }

    @Test
    public void testCalculateAverageWithSingleElement() {
        MathUtils utils = new MathUtils();
        double[] numbers = {42.0};
        double result = utils.calculateAverage(numbers);
        assertEquals(42.0, result, 0.001);
    }

}
