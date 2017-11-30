
/**
 * Creates college objects and returns and/or changes information about said objects
 *
 * @Christopher Cameron
 * @version 1
 */
public class College
{
    
    private String name;
    private String region;
    private int tuition;
    
    /** Constructs a college object given its name, region, and tution
     * @param name the name of the college
     * @param region the region the college is located in
     * @param tuition the yearly tuition of the college
     */
    public College(String name, String region, int tuition)
    {
        this.name = name;
        this.region = region;
        this.tuition = tuition;
    }
    
    /** Gets the name of a college
     * @return the name of the college
     */
    public String getName() 
    {
        return name;
    }
    
    /** Gets the region of a college
     * @return the region of a college
     */
    public String getRegion()
    {
        return region;
    }
    
    /** Gets the tuition of a college
     * @return the tuition of a college
     */
    public int getTuition()
    {
        return tuition;
    }
    
    /** Changes the tuition of a college
     * @param newTuition the new value of the tuition
     */
    public void setTuition (int newTuition)
    {
        tuition = newTuition;
    }
    
}
