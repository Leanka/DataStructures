package sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public abstract class SortTest {
    private Sort sortIntegers;

    protected void setSortIntegers(Sort sortIntegers) {

        this.sortIntegers = sortIntegers;
    }

    @Test
    public void testSortingRandomElements(){
        int [] numbers = {2, 4, 6, 8, 10, 1, 9, 3, 7, 5};
        int [] sortedNumbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = sortIntegers.intSort(numbers);

        assertArrayEquals(sortedNumbers, numbers);
    }

}
