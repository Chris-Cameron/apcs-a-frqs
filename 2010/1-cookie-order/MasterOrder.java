import java.util.ArrayList;
/**
 * Maintains a list of cookies to be purchased
 *
 * @Christopher Cameron
 * @v1
 */
public class MasterOrder
{
    /** The list of all cookie orders
     */
    private ArrayList<CookieOrder> orders;
    
    /** Constructs a new MasterOrder object.
     */
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }
    
    /** Adds the order to the master order.
     *  @param theOrder the cookie order to add to the master order
     */
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }
    
    /** @return the sum of the number of boxes of all the cookie orders
     */
    public int getTotalBoxes()
    {
        int boxTotal = 0;
        
        for(CookieOrder c: orders)
        {
            boxTotal += c.getNumBoxes();
        }
        
        return boxTotal;
    }
    
    /** Removes all cookie orders from the master order that have the same variety of
     *  cookie as cookieVar and returns the toal number of boxes that were removed.
     *  @param cookieVar the variety of cookies to remove from the master order
     *  @return the toal number of boxes of cookieVar in the cookie orders removed
     */
    public int removeVariety(String cookieVar)
    {
        String currentVariety = "";
        int boxTotal = 0;
        
        for(int i=orders.size()-1;i>=0;i--)
        {
            currentVariety = orders.get(i).getVariety();
            
            if(currentVariety.equals(cookieVar))
            {
                boxTotal += orders.get(i).getNumBoxes();
                orders.remove(i);
            }
        }
        
        return boxTotal;
    }
}

