package mullin.brian.inheritance.abstractClass;

/**
 * Created by brianmullin on 5/4/17.
 */

    //Initialize ATM
    //Demonstrate calling methods on your ATM with creating, deleting, and managing account data
    //Print all output to screen

public class ATMain {

    public static void main (String[] args) {

        BusinessAccount busy = new BusinessAccount(2453, 1000000);
        CheckingAccount checky = new CheckingAccount(3452345, 800000000);
        SavingsAccount savvy = new SavingsAccount(3, 12);

        BankAccounts banksy = new BankAccounts();

        banksy.listOfAccounts.add(busy);
        banksy.listOfAccounts.add(checky);
        banksy.listOfAccounts.add(savvy);

        banksy.printAccountInfo();
        banksy.printSumOfAccounts();

    }

}
