package mullin.brian.inheritance.classManager.ProductTest;

import mullin.brian.inheritance.classManager.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by brianmullin on 5/3/17.
 */
public class ProductTest {

    Product product;

    @Before
    public void setUp() {
        product = new Product("Banana", 1.25, 12345, 50);
    }

    @Test
    public void testGetName() {
        //: Given
        String expectedName = "Banana";

        //: When
        String actualName = product.getName();

        //: Then
        Assert.assertEquals("The expected product name is ", expectedName, actualName);


    }

    @Test
    public void testGetPrice() {
        //: Given
        double expectedPrice = 1.25;

        //: When
        double actualPrice = product.getPrice();

        //: Then
        Assert.assertEquals("The expected product price is ", expectedPrice, actualPrice, 0.001);

    }

    @Test
    public void testGetId() {
        //: Given
        int expectedId = 12345;

        //: When
        int actualId = product.getId();

        //: Then
        Assert.assertEquals("The expected Id number is ", expectedId, actualId, 0.001);

    }

    @Test
    public void testGetQuantity() {
        //: Given
        int expectedQuantity = 50;

        //: When
        int actualQuantity = product.getQuantity();

        //: Then
        Assert.assertEquals("The expected product name is ", expectedQuantity, actualQuantity, 0.001);

    }

}

