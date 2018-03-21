
/**
 * An abstract class for the creation of ticket objects
 *
 * @Christopher Cameron
 * @v1
 */
public abstract class Ticket
{
    /** The unique ticket ID number */
    private int serialNumber;
    
    /**
     * Creates a ticket object with a unique serial number
     */
    public Ticket()
    {
        serialNumber = getNextSerialNumber();
    }
    
    /**
     * Gives hthe price of a ticket
     * 
     * @return the price of the ticket
     */
    public abstract double getPrice();
    
    /**
     * Prints a description of the ticket
     * 
     * @return a string describing the serial number and price of a ticket
     */
    public String toString()
    {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }
    
    /**
     * Creates a random serial number for the ticket
     * 
     * @return a random number between 0 and 999
     */
    private static int getNextSerialNumber()
    {
        return (int)(Math.random() * 1000);
    }
}
