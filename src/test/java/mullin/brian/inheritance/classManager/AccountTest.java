package mullin.brian.inheritance.abstractClass;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by brianmullin on 5/4/17.
 */
public class AccountTest {

    Account testAccount;
    Account booleanTrueTest;
    Account booleanFalseTest;

    @Before
    public void setUp() {
        testAccount = new Account(true, 1234);
    }


    @Test
    public void testValidUserDebitCard() {
        //: Given
        String expectedResult = "Please enter PIN: ";

        //: When
        booleanTrueTest = new Account(true, 1234);
        String actualResult = booleanTrueTest.getDebitCard();

        //: Then
        Assert.assertEquals("The expected string is ", expectedResult, actualResult);

    }

    @Test
    public void testInvalidUserDebitCard() {
        //: Given
        String expectedResult = "Invalid Card";

        //: When
        booleanFalseTest = new Account(false, 1234);
        String actualResult = booleanFalseTest.getDebitCard();

        //: Then
        Assert.assertEquals("The expected string is ", expectedResult, actualResult);

    }


}
