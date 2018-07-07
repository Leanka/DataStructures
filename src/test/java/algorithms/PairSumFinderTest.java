package algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PairSumFinderTest {
    private PairSumFinder checker;

    @Before
    public void setUp(){
        checker = new PairSumFinder();
    }

    @Test
    public void testSumFinding(){
        int [] numbers = {8, 2, 15, 1};
        int sum = 17;

        assertTrue(checker.findPairWithGivenSum(numbers, sum));
    }

    @Test
    public void testSumFindingWithNegatives(){
        int [] numbers = {8, 2, 15, 1, -4, 6, -21, 0, 7};
        int sum = -20;

        assertTrue(checker.findPairWithGivenSum(numbers, sum));
    }

    @Test
    public void testSumFindingOnlyPositives(){
        int [] numbers = {8, 2, 15, 1, 4, 6, 21, 0, 7};
        int sum = 8;

        assertTrue(checker.findPairWithGivenSum(numbers, sum));
    }

}