
/**
 * Tests the trio class, and therefore all of the other classes as well
 *
 * @Christopher Cameron
 * @v1
 */
public class TrioTester
{
    
    /** Creates the menu items & tests each method in trio */
    public static void main(String[] args)
    {
        Sandwich bur = new Sandwich("Cheeseburger",2.75);
        Sandwich clu = new Sandwich("Club Sandwich",2.75);
        Salad spi = new Salad("Spinach Salad",1.25);
        Salad col = new Salad("Coleslaw",1.25);
        Drink ora = new Drink("Orange Soda",1.25);
        Drink cap = new Drink("Cappuccino", 3.50);
        
        Trio t1 = new Trio(bur,spi,ora);
        Trio t2 = new Trio(clu,col,cap);
        
        System.out.println(t1.getName());
        System.out.println(t1.getPrice());
        System.out.println();
        System.out.println(t2.getName());
        System.out.println(t2.getPrice());        
    }
}
