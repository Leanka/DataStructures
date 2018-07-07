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

    @Test
    public void testFizzBuzzFotNegativeParameter(){
        int number = -1;

        try{
            fizzBuzz.fizBuzzBum(number);
            fail("Expected IllegalArgumentException, nothing was thrown");
        }catch(Exception exception){
            assertEquals(IllegalArgumentException.class, exception.getClass());
        }

    }

    @Test
    public void testFizzBuzzWithNoMatch(){
        int number = 2;
        String expectedOutput = "";

        assertEquals(expectedOutput, fizzBuzz.fizBuzzBum(number));
    }

}