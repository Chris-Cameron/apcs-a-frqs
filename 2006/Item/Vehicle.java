
/**
 * Creates a Vehicle object
 *
 * @Christopher Cameron
 * @v1
 */
public class Vehicle extends TaxableItem
{
    /** The cost of the vehicle to the dealer */
    private double dealerCost;
    
    /** The amount that a vehicle is marked up */
    private double dealerMarkup;
    
    /**
     *  Creates a vehicle object given its cost to the dealer, markup, and the tax rate
     *  
     *  @param dealerCost the cost of the vehicle to the dealer
     *  @param dealerMarkup the amount the vehicle is makred up
     *  @param taxRate the tax rate
     */
    public Vehicle(double dealerCost, double dealerMarkup, double taxRate)
    {
        super(taxRate);
        this.dealerCost = dealerCost;
        this.dealerMarkup = dealerMarkup;
    }
    
    /**
     * Obtains the list price of a vehicle given the dealer cost and markup
     * 
     * @return the list price of the vehicle
     */
    public double getListPrice()
    {
        return (dealerCost+dealerMarkup);
    }
    
    /**
     * Changes a vehicle's markup to a specified value
     * 
     * @param newMarkup the new markup
     */
    public void changeMarkup(double newMarkup)
    {
        dealerMarkup = newMarkup;
    }
}
