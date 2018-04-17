
/**
 * Creates a climb object containing the name of a mountain peak and how long it takes to climb it
 *
 * @Christopher Cameron
 * @v1
 */
public class ClimbInfo
{
    
    /** Stores the name of the mountain peak */
    private String peakName;
    
    /** Stores the number mountains taken to complete the climb */
    private int climbTime;
    
    /** Creates a ClimbInfo object with the name peakName and time climbTime.
     * @param peakName the name of the mountain peak
     * @param climbTime the number of minutes taken to complete the climb
     */
    public ClimbInfo(String peakName, int climbTime)
    {
        this.peakName = peakName;
        this.climbTime = climbTime;
    }
    
    /** @return the name of the mountain peak
     */
    public String getName()
    {
        return peakName;
    }
    
    /** @return the number of minutes taken to complete the climb
     */
    public int getTime()
    {
        return climbTime;
    }
}
