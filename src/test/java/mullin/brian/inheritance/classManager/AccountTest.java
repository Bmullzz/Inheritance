package mullin.brian.inheritance.classManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by brianmullin on 5/4/17.
 */
public class AccountTest {

    Account testAccount;

    @Before
    public void setUp() {
        testAccount = new Account(true, 1234);
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

}
