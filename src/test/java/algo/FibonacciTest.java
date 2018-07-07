package algo;

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
        Map<Integer, Long> inMemory = new HashMap<>(number);

        assertEquals(fibonacciNumber, fibonacci.calculateWithLoop(number));
    }

}