
/**
 * Creates an object for a ticket purchased by a student before the event day
 *
 * @Christopher Cameron
 * @v1
 */
public class StudentAdvance extends Advance
{
    /**
     * Constructs an Advance object representing a ticket purchased by a student in advance
     * 
     * @param daysInAdvance the amount of days in Advance the ticket is purchased
     */
    public StudentAdvance(int daysInAdvance)
    {
        super(daysInAdvance);
    }
    
    /**
     * Determines the price of a ticket purchased by a student in advance
     * 
     * @return the price given the amount of days in advance the ticket is purchased
     */
    public double getPrice()
    {
        return super.getPrice() / 2;
    }
    
    /**
     * Prints a description of the ticket and informs the user that a student ID is required
     * 
     * @return a string describing the serial number and price of a ticket
     */
    public String toString()
    {
        return super.toString() + "\n(Student ID required)";
    }
}
