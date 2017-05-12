package mullin.brian.inheritance.classManager;
import java.util.*;

/**
 * Created by brianmullin on 5/3/17.
 */
public class Inventory{

    //Track multiple products
    //sum inventory value

    public ArrayList<Product> listOfProducts = new ArrayList<Product>();

    public Inventory() {

    }

    public String totalInventoryValue(){
        double sumCounter = 0;

        for (Product p: listOfProducts){
           sumCounter += p.getPrice() * p.getQuantity();

        }

        String total = String.format("%.2f", sumCounter);//Double.toString(sumCounter);

        return "Total value of Inventory is: $" + total;
    }

    //public void addAvocadoToInventory

}
