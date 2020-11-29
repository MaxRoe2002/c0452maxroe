
import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * @edited by Max Roe
 * @version 2020.11.7
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    private Random generator;    

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {        
        generator = new Random();
        
        this.manager = manager;
        
        manager.addProduct(new Product(101, "Samsung Galaxy S20"));
        manager.addProduct(new Product(102, "Apple iPhone 12"));
        manager.addProduct(new Product(103, "Google Pixel 4A"));
        manager.addProduct(new Product(104, "Apple iPhone 11"));
        manager.addProduct(new Product(105, "Samsung Galaxy A51"));
        manager.addProduct(new Product(106, "Huawei P40 Pro"));
        manager.addProduct(new Product(107, "Apple iPhone X"));
        manager.addProduct(new Product(108, "Google Pixel 5"));
        manager.addProduct(new Product(109, "Sony Xperia 5"));
        manager.addProduct(new Product(110, "Samsung Galaxy S10"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void runDemo()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        
        demoDelivery();
        demoSell();
    }
    
    private void demoDelivery()
    {

        printHeading("Delivery");
        
        int amount = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            amount = generator.nextInt(7) + 1;
            manager.deliverProduct(id,amount);
            amount++;
        }
    }
    
    private void demoSell()
    {
        printHeading("Sell");
        int amount = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            amount = generator.nextInt(7) + 1;
            manager.sellProduct(id, amount);
        }
    }
    
    public void printHeading(String verb)
    {
        System.out.println();
        System.out.println("Showing Product " + verb);
        System.out.println();
    }
}
