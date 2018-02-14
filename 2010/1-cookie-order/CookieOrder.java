
/**
 * Creates orders containing the number and variety of cookie
 *
 * @Christopher Cameron
 * @v1
 */
public class CookieOrder
{
    String variety;// The type of cookie
    int numBoxes;// The amount of boxes in an order
    
    /** Constructs a new CookieOrder object
     */
    public CookieOrder (String variety, int numBoxes)
    {
        this.variety = variety;
        this.numBoxes = numBoxes;
    }
    
    /** @return the variety of cookie being ordered
     */
    public String getVariety()
    {
        return variety;
    }
    
    /** @return the number of boxes being ordered
     */
    public int getNumBoxes()
    {
        return numBoxes;
    }
}
