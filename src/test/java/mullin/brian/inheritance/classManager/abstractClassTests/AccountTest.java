//package mullin.brian.inheritance.classManager.abstractClassTests;
//
//import mullin.brian.inheritance.abstractClass.Account;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
///**
// * Created by brianmullin on 5/4/17.
// */
//public class AccountTest {
//
//    Account booleanTrueTest;
//    Account booleanFalseTest;
//    Account validPinTest;
//    Account invalidPinTest;
//
//
//    @Test
//    public void testValidUserDebitCard() {
//        //: Given
//        String expectedResult = "Please enter PIN: ";
//
//        //: When
//        booleanTrueTest = new Account(true, 1234);
//        String actualResult = booleanTrueTest.getDebitCard();
//
//        //: Then
//        Assert.assertEquals("The expected string is ", expectedResult, actualResult);
//
//    }
//
//    @Test
//    public void testInvalidUserDebitCard() {
//        //: Given
//        String expectedResult = "Invalid Card";
//
//        //: When
//        booleanFalseTest = new Account(false, 1234);
//        String actualResult = booleanFalseTest.getDebitCard();
//
//        //: Then
//        Assert.assertEquals("The expected string is ", expectedResult, actualResult);
//
//    }
//    @Test
//    public void testValidUserPin() {
//        //: Given
//        String expectedResult = "Welcome";
//
//        //: When
//        validPinTest = new Account(true, 1234);
//        String actualResult = validPinTest.getPin();
//
//        //: Then
//        Assert.assertEquals("The expected string is ", expectedResult, actualResult);
//
//    }
//    @Test
//    public void testInvalidUserPin() {
//        //: Given
//        String expectedResult = "Invalid PIN";
//
//        //: When
//        invalidPinTest = new Account(true, 12345);
//        String actualResult = invalidPinTest.getPin();
//
//        //: Then
//        Assert.assertEquals("The expected string is ", expectedResult, actualResult);
//
//    }
//
//
//
//}
