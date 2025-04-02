package Java.TestDrivenDevelopment.JunitInActionBook.Part1.Chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FibonacciCalculatorTest {
        private final FibonacciCalculator calc = new FibonacciCalculator();

        @Test
        public void test0() { assertEquals(0, calc.fib(0)); }

        @Test
        public void test1() { assertEquals(1, calc.fib(1)); }

        @Test
        public void test2() { assertEquals(1, calc.fib(2)); }

        @Test
        public void test3() { assertEquals(2, calc.fib(3)); }

        @Test
        public void test10() { assertEquals(55, calc.fib(10)); }

        @Test
        public void test20() { assertEquals(6765, calc.fib(20)); }

        @Test
        public void testNeg() {
            Exception e = assertThrows(IllegalArgumentException.class, () -> calc.fib(-1));
            assertEquals("n<0", e.getMessage());
        }
}
