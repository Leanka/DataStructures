package algo;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighestIntProductTest {
    private HighestIntProduct product;

    @Before
    public void setUp(){
        product = new HighestIntProduct();
    }

    @Test
    public void testGettingMaxProductOfPositiveNumbers(){
        int [] numbers = {5, 1, 8, 7, 12};
        long highestProduct = 96;

        assertEquals(highestProduct, product.getMaxProduct(numbers));
    }

    @Test
    public void testGettingMaxProductOfPositiveAndNegativeNumbers(){
        int [] numbers = {1, 6, -9, 4, 8, -5, -8, 7, 4, 3};
        long highestProduct = 72;

        assertEquals(highestProduct, product.getMaxProduct(numbers));
    }

    @Test
    public void testGetMaxProfuctOfThree(){
        int [] numbers = {5, 1, 8, 7, 12, 4, -3, 5};
        long highestProduct = 672;

        assertEquals(highestProduct, product.getMaxProductofThree(numbers));
    }

    @Test
    public void testGetMaxProfuctOfThree3Negative(){
        int [] numbers = {-4, -5, -9};
        long highestProduct = -180;

        assertEquals(highestProduct, product.getMaxProductofThree(numbers));
    }

    @Test
    public void testGetMaxProfuctOfThree3Positive(){
        int [] numbers = {4, 5, 9};
        long highestProduct = 180;

        assertEquals(highestProduct, product.getMaxProductofThree(numbers));
    }

    @Test
    public void testGetMaxProfuctOfThree3Mixed1(){
        int [] numbers = {4, -5, 9};
        long highestProduct = -180;

        assertEquals(highestProduct, product.getMaxProductofThree(numbers));
    }

    @Test
    public void testGetMaxProfuctOfThree3Mixed2(){
        int [] numbers = {-4, -5, 9};
        long highestProduct = 180;

        assertEquals(highestProduct, product.getMaxProductofThree(numbers));
    }

    @Test
    public void testGetMaxProfuctOfThree6Positive(){
        int [] numbers = {9, 4, 2, 3, 6, 1};
        long highestProduct = 216;

        assertEquals(highestProduct, product.getMaxProductofThree(numbers));
    }

    @Ignore
    @Test
    public void testGetMaxProfuctOfThree6Negative(){
        int [] numbers = {-9, -4, -2, -3, -6, -1};
        long highestProduct = -6;

        assertEquals(highestProduct, product.getMaxProductofThree(numbers));
    }

    @Test
    public void testGetMaxProfuctOfThree6PositiveNestedLoops(){
        int [] numbers = {9, 4, 2, 3, 6, 1};
        long highestProduct = 216;

        assertEquals(highestProduct, product.getMaxProductofThreeWithNestedLoop(numbers));
    }

    @Test
    public void testGetMaxProfuctOfThree6NegativeNestedLoops(){
        int [] numbers = {-9, -4, -2, -3, -6, -1};
        long highestProduct = -6;

        assertEquals(highestProduct, product.getMaxProductofThreeWithNestedLoop(numbers));
    }

    @Test
    public void testGetMaxProfuctOfThreeWithMivedValuesAndNestedLoops(){
        int [] numbers = {-9, 4, -2, 3, 6, -1};
        long highestProduct = 108;

        assertEquals(highestProduct, product.getMaxProductofThreeWithNestedLoop(numbers));
    }

}