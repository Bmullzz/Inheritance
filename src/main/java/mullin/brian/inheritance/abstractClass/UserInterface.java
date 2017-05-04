package mullin.brian.inheritance.abstractClass;

import java.util.Scanner;
import java.util.*;

/**
 * Created by brianmullin on 5/4/17.
 */
public class UserInterface {

    Scanner input = new Scanner(System.in);

    public UserInterface();

        Account checking = new Account(true, 1234);

        System.out.println(checking.getDebitCard());

    }


}
