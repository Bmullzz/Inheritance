package mullin.brian.inheritance.classManager;
import java.util.*;

/**
 * Created by brianmullin on 5/3/17.
 */
public class Inventory{

    //Track multiple products
    //sum inventory value

    ArrayList<Product> listOfProducts = new ArrayList<Product>();

    public Inventory() {

    }

    public double totalInventoryValue(){
        double sumCounter = 0;

        for (Product p: listOfProducts){
           sumCounter += p.getPrice() * p.getQuantity();

        }
        return sumCounter;
    }

    //public void addAvacadoToInventory

}
