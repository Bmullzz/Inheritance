package mullin.brian.inheritance.classManager;

/**
 * Created by brianmullin on 5/3/17.
 */


public class InventoryMain {

    public static void main (String[] args) {

        Product product = new Product("Apple", 0.50, 12345, 45);

        //initialize manager
        //populate inventory
        System.out.println(product);

    }
}
