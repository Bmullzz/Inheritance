package mullin.brian.inheritance.classManager.ProductTest;

import mullin.brian.inheritance.classManager.Avocado;
import mullin.brian.inheritance.classManager.Inventory;
import mullin.brian.inheritance.classManager.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by brianmullin on 5/12/17.
 */
public class InventoryTest {
    /*
    Product product;
    Inventory store = new Inventory();
    @Before
    public void setUp() {
        product = new Product("Banana", 1.25, 12345, 50);

        store = new Inventory();
    }*/

    @Test
    public void totalInventoryValue() {
        //: Given
        Inventory store = new Inventory();
        Avocado avocado = new Avocado("Fre sha vaca doos",
                3.50, 57584, 80);
        String expectedSum = "Total value of Inventory is: $280.00";

        //: When
        store.listOfProducts.add(avocado);
        String actualSum = store.totalInventoryValue();

        //: Then
        Assert.assertEquals("The expected String is: ", expectedSum, actualSum);


    }

}
