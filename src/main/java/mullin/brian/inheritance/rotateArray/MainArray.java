package mullin.brian.inheritance.rotateArray;

/**
 * Created by brianmullin on 5/4/17.
 */
public class MainArray {

    public static void main(String[] args) {

        RotateArray myList = new RotateArray();

        //creates array
        for (int i = 0; i < 7; i++) {

            myList.add(i);
        }

        System.out.println("The first Array is " + myList);

    }

}
