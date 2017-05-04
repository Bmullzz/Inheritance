package mullin.brian.inheritance.abstractClass;

/**
 * Created by brianmullin on 5/4/17.
 */

    //Initialize ATM
    //Demonstrate calling methods on your ATM with creating, deleting, and managing account data
    //Print all output to screen

public class ATMain {

    public static void main (String[] args) {

        Account checking = new Account(true, 1234);

        System.out.println(checking.getDebitCard());

    }

}
