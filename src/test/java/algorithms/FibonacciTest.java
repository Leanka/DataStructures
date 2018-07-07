package algorithms;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void setUp(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void testFibonnaciFor8(){
        int number = 8;
        long fibonacciNumber = 21;

        assertEquals(fibonacciNumber, fibonacci.calculateRecursiveSequence(number));
    }

    @Test
    public void testFibonnqaciWithInMemoryStorageFor8(){
        int number = 8;
        long fibonacciNumber = 21;
        Map<Integer, Long> inMemory = new HashMap<>(number);

        assertEquals(fibonacciNumber, fibonacci.calculateWithMap(number, inMemory));
    }

    @Test
    public void testFibonnqaciWithLoopStorageFor8(){
        int number = 8;
        long fibonacciNumber = 21;

        assertEquals(fibonacciNumber, fibonacci.calculateWithLoop(number));
    }

    @Test
    public void testNegativeNumbersInRecursiveCalculation(){
        try{
            fibonacci.calculateRecursiveSequence(-1);
            fail("Expected NumberFormatException, nothing was thrown");
        }catch(Exception exception){
            assertEquals(NumberFormatException.class, exception.getClass());
        }
    }

    @Test
    public void testNegativeNumbersInMemoizedCalculation(){
        try{
            fibonacci.calculateWithMap(-1, new HashMap<>());
            fail("Expected NumberFormatException, nothing was thrown");
        }catch(Exception exception){
            assertEquals(NumberFormatException.class, exception.getClass());
        }
    }

    @Test
    public void testNegativeNumbersInLoopCalculation(){
        try{
            fibonacci.calculateWithLoop(-1);
            fail("Expected NumberFormatException, nothing was thrown");
        }catch(Exception exception){
            assertEquals(NumberFormatException.class, exception.getClass());
        }
    }

}