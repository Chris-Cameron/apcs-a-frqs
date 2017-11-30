
/**
 * Determines a students average based on whether or not they have "improved"
 *
 * @Chris Cameron
 * @Nov.14, 2017
 */
public class StudentRecord
{
    
    private int[] scores;
    
    /** Constructs a list of the student's grades
     * 
     * @param the array of the student's scores
     */
    
    public StudentRecord(int[] scores)
    {
        this.scores = scores;
    }
    
     /** Returns the arithmetic mean of the values in scores between two specific indexes
     *
     * @param first the starting index for calculating the average
     * @param last the final index for calculating the average
     * Precondition: 0 <= first <= last < scores.length
     * @return the average of the numbers between the indexes
     */
    
    private double average (int first, int last)
    {
        double sum = 0.0;
        
        for(int i = first;i <= last; i++)
        {
            sum += scores [i];
        }
        
        return sum/(last-first+1);
        
    }
    
    /** Returns true if each succesive value in scores is greater than or equal to the previous value, otherwise it returns false
     * 
     * @return whether each succesive value is greater or equal than the previous
     */
    
    private boolean hasImproved()
    {
        
        int prev = scores[0];
        
        for (int i=0; i<scores.length; i++)
        {
            
            if(scores[i] < prev)
            {
                return false;
            }
            
            prev = scores[i];
            
        }
        return true;
    }
    
    /** Returns the average of the values in scores, but only returns the second half if they have improved
     * 
     * @ return the average of the values in scores, unless they have improved in which case the average of the second half is returned.
     */
    
    public double finalAverage()
    {
        
        if(hasImproved())
        {
            
            return average(scores.length/2,scores.length-1);
            
        }
        else
        {
            
            return average(0,scores.length-1);
            
        }
        
    }
    
}
