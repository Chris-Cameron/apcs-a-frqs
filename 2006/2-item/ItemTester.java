
/**
 * Tests the interface item and its subclasses
 *
 * @Christopher Cameron 
 * @v1
 */
public class ItemTester
{
    public static void main(String[] args)
    {
        //Set variables for printing
        NonTaxableItem NT1 = new NonTaxableItem(22222);
        Vehicle V = new Vehicle(20000,2500,0.10);
        
        //Print Stuff
        System.out.println("Non-Taxable Item Price:");
        System.out.println(NT1.purchasePrice());
        
        System.out.println("\nVehicle Prices:");
        System.out.print("List Price: ");
        System.out.println(V.getListPrice());
        System.out.print("Purchase Price: ");
        System.out.println(V.purchasePrice());
        
        V.changeMarkup(1000);
        
        System.out.println("\nVehicle Price After Markup Change:");
        System.out.print("List Price: ");
        System.out.println(V.getListPrice());
        System.out.print("Purchase Price: ");
        System.out.println(V.purchasePrice());
    }
}
