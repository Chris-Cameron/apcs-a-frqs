
/**
 * Tests the BatteryCharger class
 *
 * @Christopher Cameron
 * @v1
 */
public class BatteryChargerTester
{
    /** Demonstrates the BatteryCharger class
     */
    public static void main(String[] args)
    {
        int[] costList = {50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180,180,140,100,80,60};
            
        BatteryCharger charger = new BatteryCharger(costList);
        
        System.out.println(charger.getChargeStartTime(1));
        System.out.println(charger.getChargeStartTime(2));
        System.out.println(charger.getChargeStartTime(3));
        System.out.println(charger.getChargeStartTime(4));
        System.out.println(charger.getChargeStartTime(5));
        System.out.println(charger.getChargeStartTime(6));
        System.out.println(charger.getChargeStartTime(7));
        System.out.println(charger.getChargeStartTime(8));
        System.out.println(charger.getChargeStartTime(9));
        System.out.println(charger.getChargeStartTime(10));
    }
}
