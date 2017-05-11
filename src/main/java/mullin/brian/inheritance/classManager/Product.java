package mullin.brian.inheritance.classManager;

/**
 * Created by brianmullin on 5/3/17.
 */
public class Product {

    //create products-check
    //Price-check
    //ID-check
    //Quantity on hand-check

    private String name;
    private double price;
    private int id;
    private int quantity;


    public Product(String productName, double productPrice, int productId, int productQuantity) {

         name = productName;
         price = productPrice;
         id = productId;
         quantity = productQuantity;

    }
    public String getName() {

        return name;
    }
    public double getPrice() {

        return price;
    }
    public int getId() {

        return id;
    }
    public int getQuantity() {

        return quantity;
    }

    @Override
    public String toString() {

        return String.format("Item: %s\nPrice: $%.2f\nID #: %d\nQuantity: %d", name, price, id, quantity);

    }

}
