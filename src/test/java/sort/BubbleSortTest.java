package sort;

import org.junit.Before;

public class BubbleSortTest extends SortTest{

    @Before
    public void setUp(){
        setSortIntegers(new BubbleSort());
    }
}