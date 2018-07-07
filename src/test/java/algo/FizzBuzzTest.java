package algo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizzBuzz(){
        int number = 10;
        String expectedOutput = "Fizz Buzz Fizz Bum Fizz Buzz";

        assertEquals(expectedOutput, fizzBuzz.fizBuzzBum(number));
    }

}