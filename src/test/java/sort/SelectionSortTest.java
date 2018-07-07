package sort;

import org.junit.Before;

public class SelectionSortTest extends SortTest{

    @Before
    public void setUp(){
        setSortIntegers(new SelectionSort());
    }

}