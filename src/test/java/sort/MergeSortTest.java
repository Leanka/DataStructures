package sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest extends SortTest{

    @Before
    public void setUp(){
        setSortIntegers(new MergeSort());
    }

    @Test
    public void testSortingArraysWithDiffLength(){
        MergeSort mergeSort = new MergeSort();

        //arrays must be sorted
        //arrays differ in length, contain doubles
        int [] left = {0, 2, 4, 6, 8};
        int [] right = {1, 3, 5, 7, 9, 10};

        int [] mergedNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(mergedNumbers, mergeSort.mergeSortedArrays(left, right));
    }

    @Test
    public void testSortWithDoubles(){
        MergeSort mergeSort = new MergeSort();

        //arrays must be sorted
        //arrays differ in length, contain doubles
        int [] left = {0, 2, 4, 7, 8};
        int [] right = {1, 2, 3, 5, 7};

        int [] mergedNumbers = {0, 1, 2, 2, 3, 4, 5, 7, 7, 8};
        assertArrayEquals(mergedNumbers, mergeSort.mergeSortedArrays(left, right));
    }

}