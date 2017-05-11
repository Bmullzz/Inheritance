package mullin.brian.inheritance.classManager;
import java.util.Scanner;
/**
 * Created by brianmullin on 5/3/17.
 */


public class InventoryMain {

    public static void main (String[] args) {



        Apple apple = new Apple("Apple", 0.50, 12345, 45);
        Avocado avocado = new Avocado("Fre sha vaca doos", 3.50, 57584, 80);
        Product starfruit = new Starfruit("Starfruit", 34.56, 52452, 800);

        Inventory store1 = new Inventory();
        store1.listOfProducts.add(apple);
        store1.listOfProducts.add(avocado);
        store1.listOfProducts.add(starfruit);

        System.out.println(store1.totalInventoryValue());

    }
}
