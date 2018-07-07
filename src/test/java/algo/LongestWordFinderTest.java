package algo;

import algo.helper.Tuple;
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
        String text = "What is the average airspeed velocity of an unladen   swallow";
        Tuple longestWordData = new Tuple("airspeed");

        assertEquals(longestWordData, finder.findLongestWord(text));
    }

}