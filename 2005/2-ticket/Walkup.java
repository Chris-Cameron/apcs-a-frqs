

/**
 * Creates an object for a ticket purchased on the event day
 *
 * @Christopher Cameron
 * @v1
 */
public class Walkup extends Ticket
{
    /**
     * Constructs a Walkup object
     */
    public Walkup()
    {
        super();
    }
    
    /**
     * Returns the price of a ticket purchased on the event day
     * 
     * @return the price of the ticket
     */
    public double getPrice()
    {
        return 50;
    }
}
