package algorithms;

import algorithms.helper.Tuple;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestWordFinderTest {
    private LongestWordFinder finder;

    @Before
    public void setUp(){
        finder = new LongestWordFinder();
    }

    @Test
    public void testFindingLongestWord(){
        String text = "What is the average velocity of an unladen   swallow";
        Tuple longestWordData = new Tuple("velocity");

        assertEquals(longestWordData, finder.findLongestWord(text));
    }

    @Test
    public void testFindingFirstOfTheLongestWords(){
        String text = "What is the average airspeed velocity of an unladenn swalloww";
        Tuple longestWordData = new Tuple("airspeed");

        assertEquals(longestWordData, finder.findLongestWord(text));
    }

    @Test
    public void testFindingTheLongestWordInEmptyText(){
        String text = "";

        try{
            finder.findLongestWord(text);
            fail("Expected IllegalArgumentException, nothing was thrown");
        }catch (Exception exception){
            assertEquals(IllegalArgumentException.class, exception.getClass());
        }
    }

    @Test
    public void testFindingTheLongestWordInOneWordText(){
        String text = "one";
        Tuple longestWordData = new Tuple("one");

        assertEquals(longestWordData, finder.findLongestWord(text));


    }

}