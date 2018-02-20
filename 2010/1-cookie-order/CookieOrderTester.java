
/**
 * Tests the MasterOrder class
 *
 * @Christopher cameron
 * @v1
 */
public class CookieOrderTester
{
    /** Tests the getTotalBoxes and removeVariety methods
     */
    public static void main(String[] args)
    {
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder ("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder ("Shortbread", 5));
        goodies.addOrder(new CookieOrder ("Macaroon", 2));
        goodies.addOrder(new CookieOrder ("Chocolate Chip", 3));
        
        goodies.print();
         
        System.out.println();
        System.out.println(goodies.getTotalBoxes());
        
        System.out.println(goodies.removeVariety("Brownie"));
        System.out.println(goodies.removeVariety("Chocolate Chip"));
        
        System.out.println();
        goodies.print();
    }
}
