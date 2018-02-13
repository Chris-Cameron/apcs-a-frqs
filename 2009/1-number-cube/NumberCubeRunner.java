
/**
 * Creates a NumberCube object
 *
 * @Christopher Cameron
 * @v1
 */
public class NumberCubeRunner
{
    
    /** Returns an array of the values obtained by tossing a number cube numTosses times
     *  @param cube a NumberCube
     *  @param numTosses the number of tosses to be recorded
     *         Precondition: numTosses > 0
     *  @return an array of numTosses values
     */
    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
        int[]tossArray = new int[numTosses];
        
        for(int i = 0; i<numTosses; i++)
        {
            tossArray[i] = cube.toss();
        }
        
        return tossArray;
    }
    
    /** Prints the values in an array
     *  @param an array of integer values; intended to be a series of tosses
     */
    public static void printTosses(int[] values)
    {
        for(int s: values)
        {
            System.out.print(s + " ");
        }
    }
    
    
    /** Returns the starting index of alongest run of two or more consecutive repeating values
     *  in the array values
     *  @param values an array of integer values represetning a series  of number cube tosses
     *         Precondition: values.length > 0
     *  @return the starting index of a run of maximum size;
     *         -1 if there is no run;
     */ 
    public static int getLongestRun(int[]values)
    {
        int index = -1;
        int runLength = 0;
        int maxLength = 0;
        int prev = -1;
        int startIndex = -1;
        
        for(int i = 0; i<values.length; i++)
        { 
            if(values[i]==prev)
            {
                runLength++;
            }
            else
            {
                runLength = 0;
                startIndex = i; //Checks index at start of run
            }
            
            if(runLength>maxLength && runLength>1)
            {
                maxLength = runLength;
                index = startIndex; //Grabs index from start of this run
            }
            
            prev = values[i];
        }
        
        return index;
    }
}
