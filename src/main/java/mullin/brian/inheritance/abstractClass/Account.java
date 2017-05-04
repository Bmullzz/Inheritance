package mullin.brian.inheritance.abstractClass;

/**
 * Created by brianmullin on 5/4/17.
 */

/* -Enter PIN
   -View Account List
   -Select Account
   -Display Account Options (check balance, withdraw, deposit)
*/

public class Account {

    private boolean debitCard;
    //private int pin;

    public Account() {

    }

    public Account(boolean userDebitCard, int userPin) {

        debitCard = userDebitCard;
        pin = userPin;

    }

    public String getDebitCard() {

        if (debitCard != false) {

            return "Please enter 4 digit PIN: ";
        }
        else {

            return "Invalid Card";
        }
    }

    public String getPin() {
        if (pin > 4){

            return "Welcome";
        }
        else{

            return "Invalid PIN";
        }

    }
/*
    public String accountList() {}

    public accountOptions() {}*/

}
