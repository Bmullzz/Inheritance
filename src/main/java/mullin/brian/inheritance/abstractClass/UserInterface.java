package mullin.brian.inheritance.abstractClass;

import java.util.Scanner;
import java.util.*;

//takes user input, sends to account

/**
 * Created by brianmullin on 5/4/17.
 */
public class UserInterface {

    Scanner input = new Scanner(System.in);

    public UserInterface(){

        Account checking = new Account(boolean userDebitCard, int userPin);

        int input = input.nextBoolean();

        System.out.println("Do you have a Debit Card? Enter 'true' or 'false' : ");

        boolean debitAnswer = input.nextBoolean();

        System.out.println(checking.getDebitCard());



    }


}




