
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Max Roe
 * @version 0.1 (29/11/2020)
 */
public class StockApp
{
    // Use to clear the screen
    public static final char CLEAR_CODE= '\u000c';
    // Use to quit the program
    public static final String QUIT = "quit";
    // Add function
    public static final String ADD = "add";
    // Print all function
    public static final String PRINT_ALL = "printall";
    public static final String REMOVE = "remove";
    public static final String DELIVER = "deliver";
    public static final String SELL = "sell";
    public static final String SEARCH = "search";
    public static final String STOCK = "stock";
    // Use to get user input
    private InputReader input = new InputReader();
    // Use to create a stock manager
    private StockManager manager = new StockManager();
    // Use to create a stock demo
    private StockDemo demo = new StockDemo(manager);

    /**
     * Runs the program
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getString().toLowerCase();
            
            if(choice.equals(QUIT))
                finished = true;
            else if (choice.equals(SEARCH))
                finished = true;
            else
                executeMenuChoice(choice);
        }
    }  
   
    private void executeMenuChoice(String choice)
      {
        if(choice.equals(ADD))
        {
            addProduct();
        }
        else if(choice.equals(PRINT_ALL))
        {
            manager.printAllProducts();
            String value = input.getString();
        }
    }
    
    private void addProduct()
    {
        System.out.println("Adding new product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the name of the product");
        String name = input.getString();
        
        Product product = new Product(id, name);
        manager.addProduct(product);
        
        System.out.println("\n You have added " + product);
        System.out.println();
    }
      
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        //System.out.println(CLEAR_CODE);
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Max Roe");
        System.out.println("******************************");
    }
}
