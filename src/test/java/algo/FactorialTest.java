package algo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    private Factorial factorial;

    @Before
    public void setUp(){
        factorial = new Factorial();
    }

    @Test
    public void testNumberFactorial(){
        int number = 5;
        long numbersFactorial = 120;

        assertEquals(numbersFactorial, factorial.calculateFactorial(number));
    }

    @Test
    public void testLargeNumberFactorial(){
        int number = 10;
        long numbersFactorial = 3628800;

        assertEquals(numbersFactorial, factorial.calculateFactorial(number));
    }


}