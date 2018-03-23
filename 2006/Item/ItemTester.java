
/**
 * Write a description of class ItemTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemTester
{
    public static void main(String[] args)
    {
        //Set variables for printing
        NonTaxableItem NT1 = new NonTaxableItem(22222);
        Vehicle V1 = new Vehicle(20000,2500,0.10);
        Vehicle V2 = new Vehicle(20000,1000,0.10);
        
        //Print Stuff
        System.out.println("Non-Taxable Item Price:");
        System.out.println(NT1.purchasePrice());
        System.out.println("\nVehicle 1 Prices:");
        System.out.print("List Price: ");
        System.out.println(V1.getListPrice());
        System.out.print("Purchase Price: ");
        System.out.println(V1.purchasePrice());
        System.out.println("\nVehicle 2 Prices:");
        System.out.print("List Price: ");
        System.out.println(V2.getListPrice());
        System.out.print("Purchase Price: ");
        System.out.println(V2.purchasePrice());
        /** ADD TEST CASE FOR CHANGING RATE */
    }
}
