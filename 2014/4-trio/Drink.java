
/**
 * Creates a Drink
 *
 * @Christopher Cameron
 * @v1
 */
public class Drink implements MenuItem
{
    /** Stores the name of the drink */
    private String name;
    
    /** Stores the price of the drink */
    private double price;
    
    /**
     * This is the constructor for the Drink object
     * 
     * @param name the name of the drink
     * @param price the price of the drink
     */    
    public Drink(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    
    /** @return the name of the drink */
    public String getName()
    {
        return name;
    }
    
    /** @return the price of the drink */
    public double getPrice()
    {
        return price;
    }
}


