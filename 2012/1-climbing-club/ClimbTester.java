
/**
 * Tests the ClimbingClub and therefore ClimbInfo classes
 *
 * @Christopher Cameron
 * @v1
 */
public class ClimbTester
{
    /**
     * Creates a list of hikes and prints them
     */
    public static void main(String[] args)
    {
        ClimbingClub hikerClub = new ClimbingClub();
        hikerClub.addClimb("Monadnock", 274);
        hikerClub.addClimb("Whiteface", 301);
        hikerClub.addClimb("Algonquin", 225);
        hikerClub.addClimb("Monadnock", 334);
        
        hikerClub.printClimbs();
        System.out.println();
        System.out.println(hikerClub.distinctPeakNames() + " unique peak names");
    }
}
