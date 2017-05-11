package mullin.brian.inheritance.abstractClass;

import java.util.ArrayList;

/**
 * Created by brianmullin on 5/11/17.
 */
public class BankAccounts {

    ArrayList<Account> listOfAccounts = new ArrayList<Account>();

    public void printSumOfAccounts (){
        double sum = 0;

        for (Account a: listOfAccounts){

            sum += a.getBalance();
        }

        System.out.println(sum);

    }

    public void printAccountInfo(){

        for (Account a: listOfAccounts){

            System.out.println("Account Number: " + a.getAccountNum() + "\n" +
            "Account Balance: " + a.getBalance());
        }
    }
}
