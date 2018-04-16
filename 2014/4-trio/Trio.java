
/**
 * Creates an Trio consisting of a Sandwich, Drink, and Salad
 *
 * @Christopher Cameron
 * @v1
 */
public class Trio implements MenuItem
{
    /** Stores a sandwich object */
    private Sandwich sandwich;
    
    /** Stores a salad object */
    private Salad salad;
    
    /** Stores a drink object */
    private Drink drink;
    
    /**
     * This is the constructor for a trio object 
     * 
     * @param sandwich the sandwich in the trio
     * @param salad the salad in the trio
     * @param drink the drink in the trio
     */
    public Trio(Sandwich sandwich, Salad salad, Drink drink)
    {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    
    /** 
     * Concatenates the names of each component of the trio, divided by slashes, and ended with the word "trio"
     * @return the name of the trio
     */
    public String getName()
    {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }
    
    /**
     * Determines the price of the trio, which is the price of the two highest priced items in the trio combined
     * @return the price of the trio
     */
    public double getPrice()
    {
        double price = 0;
        double[] prices = {sandwich.getPrice(),salad.getPrice(),drink.getPrice()};
        for (double d: prices) price += d;
        price -= Math.min(prices[0],Math.min(prices[1],prices[2]));
        return price;
    }
}
