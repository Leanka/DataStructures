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
    

}