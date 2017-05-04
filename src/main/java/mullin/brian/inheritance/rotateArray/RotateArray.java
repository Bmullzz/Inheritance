package mullin.brian.inheritance.rotateArray;

import java.util.Scanner;
import java.util.*;

/**
 * Created by brianmullin on 5/1/17.
 */
public class RotateArray extends ArrayList {

    Scanner input = new Scanner(System.in);

    int rotateBy = input.nextInt();

    //System.out.println("Enter the number of spaces you would like to rotate the Array by: ");

   public void rotate(RotateArray list, int rotateBy) {

       for (int i = 0; i < rotateBy + 1; i++) {

           list.add(list.get(0));

           list.remove(list.get(0));
       }

       System.out.println("The Array rotates by " + rotateBy + "spaces to " + list);
   }
}
