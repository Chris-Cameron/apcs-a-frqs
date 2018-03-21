
/**
 * Creates an object for a ticket purchased before the event day
 *
 * @Christopher Cameron
 * @v1
 */
public class Advance extends Ticket
{
    /** The amount of daysInAdvance the ticket is purchased */
    private int daysInAdvance;
    
    /**
     * Constructs an Advance object representing a ticket purchased in advance
     * 
     * @param daysInAdvance the amount of days in Advance the ticket is purchased
     */
    public Advance(int daysInAdvance)
    {
        super();
        this.daysInAdvance = daysInAdvance;
    }
    
    /**
     * Determines the price of a ticket purchased in advance
     * 
     * @return the price given the amount of days in advance the ticket is purchased
     */
    public double getPrice()
    {
        if(daysInAdvance < 10) return 40;
        else return 30;
    }
}
