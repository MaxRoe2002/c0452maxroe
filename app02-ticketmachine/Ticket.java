import java.util.Date;

/**
 * Ticket class to create desination, time and price of the ticket.
 *
 * @author (Max Roe)
 * @version (10/10/2020)
 */
public class Ticket
{
      //Attributes
    
    private String destination;
    
    private int price;
    
    private Date issueDateTime;
    
    /**
     * Constructor for objects of class Ticket setting the
     * destination and price. The date will contain the 
     * current system date and time. 
     */
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        this.price = price;
        
        issueDateTime = new Date();
    }

    /** Print out Destination
     * @author Max Roe
     * @version (10/10/2020)
     */
    public void print()
    {
        System.out.println("Ticket " + destination + " Price : " +
            " Price : " + price + 
            " Issued " + issueDateTime);
    }

 }
    
   
