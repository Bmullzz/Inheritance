package mullin.brian.inheritance.classManager;

/**
 * Created by brianmullin on 5/3/17.
 */
public class Product {

    //create products
    //Price
    //ID
    //Quantity on hand
    private String name;
    private double price;
    private long id;
    private int quantity;

    public Product() {

    }
    public Product(String productName, double productPrice, long productId, int productQuantity) {

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
    public long getId() {
        return id;
    }
    public int 


}
