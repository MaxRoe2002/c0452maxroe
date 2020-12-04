import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Max Roe
 * @version 04/12/2020
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
        //this method adds the products 
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
     * Program to run the demo.
     */
    public void runDemo()
    {
        manager.printAllProducts();
        
        demoDelivery();
        demoSell();
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDelivery()
    {
        printHeading("Delivery");
        
        int amount = 0;
        
        for(int id = 101; id<=110; id++)
        {
            amount = generator.nextInt(7) + 1;
            manager.deliverProduct(id,amount);
            amount++;
        }
    }

    /**
     * Program to run a heading on the print.
     */
    public void printHeading(String verb)
    {
        System.out.println();
        System.out.println("Demonstrating Product" + verb);
        System.out.println();
    }
    
    /**
     * A program to sell a product
     */
    private void demoSell()
    {
        printHeading("Sell");
        
        int amount = 0;
        
        for(int id = 101; id<=130; id++)
        {
            amount = generator.nextInt(7) + 1;
            manager.sellProduct(id, amount);
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        // this method finds the product ID for each product
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
