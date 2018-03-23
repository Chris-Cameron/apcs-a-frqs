
/**
 * Creates a Taxable Item object
 *
 * @Christopher Cameron
 * @v1
 */
public abstract class TaxableItem implements Item
{
    /** The decimal taxRate applied to the item */
    private double taxRate;
    
    /** Requires subclasses to have a function that returns the list price */
    public abstract double getListPrice();
    
    /**
     * Creates a TaxableItem object given the tax rate
     * 
     * @param rate the tax rate
     */
    public TaxableItem(double rate)
    {
        taxRate = rate;
    }
    
    /** 
     * Returns the purchase price of an object
     * 
     * @return the purchase price of the object
     */
    public double purchasePrice()
    {
        return getListPrice()*(1+taxRate);
    }
}
