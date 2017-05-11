package mullin.brian.inheritance.abstractClass;

/**
 * Created by brianmullin on 5/4/17.
 */

/* -Enter PIN
   -View Account List
   -Select Account
   -Display Account Options (check balance, withdraw, deposit)
*/

public abstract class Account {

    private int accountNum;
    private double balance;

    public Account(int accountNum, double balance){

        this.accountNum = accountNum;
        this.balance = balance;
    }

    public double getBalance(){

        return balance;
    }

    public double deposit(double amount){

        balance += amount;

        return balance;
    }

    public double withdraw(double amount){

        balance -= amount;

        return balance;
    }

    public int getAccountNum() {

        return accountNum;
    }



}


