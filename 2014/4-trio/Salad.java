
/**
 * Creates a Salad
 *
 * @Christopher Cameron
 * @v1
 */
public class Salad implements MenuItem
{
    /** Stores the name of the salad */
    private String name;
    
    /** Stores the price of the salad */
    private double price;
    
    /**
    * This is the constructor for the Salad object
    * 
    * @param name the name of the salad
    * @param price the price of the salad
    */
    public Salad(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    
    /** @return the name of the salad */
    public String getName()
    {
        return name;
    }
    
    /** @return the price of the salad */
    public double getPrice()
    {
        return price;
    }
}
