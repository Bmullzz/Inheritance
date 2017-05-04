package mullin.brian.inheritance.classManager;
import java.util.Scanner;
/**
 * Created by brianmullin on 5/3/17.
 */


public class InventoryMain {

    public static void main (String[] args) {


        Product apple = new Product("Apple", 0.50, 12345, 45);
        Product avacado = new Product("Fre sha vaca doos", 3.50, 57584, 80);
        //initialize manager


        //populate inventory
        System.out.println(apple);
        System.out.println("~~~~~~~~~~~~");
        System.out.println(avacado);

    }
}
