
/**
 * Creates a Non-Taxable Item object
 *
 * @Christopher Cameron
 * @v1
 */
public class NonTaxableItem implements Item
{
    /** The cost of the item*/
    private double price;
    
    /**
     * Constructs a NonTaxableItem given its price
     * 
     * @param price the price of the item
     */
    public NonTaxableItem(double price)
    {
        this.price = price;
    }
    
    /**
     * Returns the purchase price of the item
     * 
     * @return price the price of  the item 
     */
    public double purchasePrice()
    {
        return price;
    }
}
