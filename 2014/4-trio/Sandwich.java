
/**
 * Creates a Sandwhich
 *
 * @Christopher Cameron
 * @v1
 */
public class Sandwich implements MenuItem
{
    /** Stores the name of the sandwich */
    private String name;
    
    /** Stores the price of the sandwich */
    private double price;
    
    /**
     * This is the constructor for the Sandwich object
     * 
     * @param name the name of the sandwich
     * @param price the price of the sandwich
     */
    public Sandwich(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    
    /** @return the name of the sandwich*/
    public String getName()
    {
        return name;
    }
    
    /** @return the price of the sandwich*/
    public double getPrice()
    {
        return price;
    }
}
