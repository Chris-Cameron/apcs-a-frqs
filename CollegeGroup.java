
/**
 * Updates the tuition of a college,
 * or gets a list of colleges meeting certain parameters
 *
 * @Christopher Cameron
 * @version 1
 */
public class CollegeGroup
{
    
    private College[] myColleges;
    
    /** Creates an array of Colleges
     * @param myColleges the array of Colleges to be passed in
     */
    public CollegeGroup(College[] myColleges) {
        this.myColleges = myColleges;
    }
    
    
    
    
    /** Updates the tuition of a chosen college
     * @param collegeName the name of the college that
     * will have its tuition changed
     * @param newTuition the updated tuition of the college
     */
    public void updateTuition(String collegeName, int newTuition)
    {
        for(int i=0;i<myColleges.length;i++)
        {
            if(myColleges[i].getName().equals(collegeName))
            {
                myColleges[i].setTuition(newTuition);
            }
        }
    }
    
    
    
    
    private boolean isValid(int index, String region, int low, int high)
    {
            return (myColleges[index].getRegion().equals(region) &&
            myColleges[index].getTuition() >= low &&
            myColleges[index].getTuition() <= high);
    }
    
    private int listLength(String region, int low, int high)
    {
        int count = 0;
        
        for(int i=0;i<myColleges.length;i++)
        {
            if(isValid(i,region,low,high))
            {
                count++;
            }
        }
        
        return count;
    }
    
    /** Creates a list of colleges meeting certain user defined paramters
     * @param region the region the college should be located in
     * @param low the minimum acceptable tuition of the college
     * @param high the maximum acceptable tuition of the college
     * @return list the list of colleges based on the parameter
     */
    public College[] getCollegeList(String region, int low, int high)
    {
        int amount = 0;
        
        College[] list = new College[listLength(region, low, high)];
        
        for(int i=0;i<myColleges.length;i++)
        {
            if(isValid(i,region, low, high))
            {
                list[amount]=myColleges[i];
                amount++;
            }
        }
        
        return list;
    }
    
    
    
    
    /** Prints a given list of colleges, including their name, region, and tuition
     * @param collegeList the array of colleges to be printed
     */
    public void printList(College[] collegeList)
    { 
        for(int i=0;i<collegeList.length;i++)
        {
          System.out.println(collegeList[i].getName()+" "+collegeList[i].getRegion()+" "+collegeList[i].getTuition());
        }
    }
    
}
