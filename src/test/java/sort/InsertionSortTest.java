package sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest extends SortTest{

    @Before
    public void setUp(){
        setSortIntegers(new InsertionSort());
    }

    @Test
    public void testInsertingValue(){
        InsertionSort insertionSort = new InsertionSort();

        int [] numbers = {5, 6, 7, 8, 9, 10, 11, 12, 13};
        int [] numbersAfterInsert = {5, 12, 6, 7, 8, 9, 10, 11, 13};

        insertionSort.insertValueBackwords(numbers, 1, 7);
        assertArrayEquals(numbersAfterInsert, numbers);
    }

    @Test
    public void testInsertingFromLastToFirstPosition(){
        InsertionSort insertionSort = new InsertionSort();

        int [] numbers = {5, 6, 7, 8, 9, 10};
        int [] numbersAfterInsert =  {10, 5, 6, 7, 8, 9};

        insertionSort.insertValueBackwords(numbers, 0, 5);
        assertArrayEquals(numbersAfterInsert, numbers);
    }

}