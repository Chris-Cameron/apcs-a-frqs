
/**
 * Finds whether the sums of the rows of an array match
 *
 * @Christopher Cameron
 * @v1
 */
public class DiverseArray
{
    /**
     * Returns the sum of the entries in the one-dimensional array arr
     * 
     * @param arr1 the array  to be summed
     * @return sum the sum of the values in the array
     */
    public static int arraySum(int[]arr1)
    {
        int sum = 0;
        
        for(int i: arr1)
        {
            sum += i;
        }
        
        return sum;
    }
    
    /** 
     * Returns a one-dimensional array in which the entry at index k is the sum of
     * the entries of row k of the two-dimensional array arr2D
     * 
     * @param arr2D the two dimensional array, with the outer array being defined as the "rows"
     * @return sumArr the one  diemnsional array containing the rwo sums of the two dimensional arrays
     */
    public static int[] rowSums (int[][]arr2D)
    {
        int[] sumArr = new int[arr2D.length];
        
        for(int i = 0; i < arr2D.length; i++)
        {
            sumArr[i]= arraySum(arr2D[i]);
        }
        
        return sumArr;
    }
    
    /**
     * Returns true if every row (outer array) in arr2D has a different row sum;
     * false otherwise
     * 
     * @param arr2D the two dimensional array to be analyzed
     * @return whether or not the two dimensional array has a different sum for each row
     */
    public static boolean isDiverse (int[][]arr2D)
    {
        int[]sumArr = rowSums(arr2D);
        
        for(int a = 0; a<sumArr.length-1; a++)
        {
            for(int b = a+1; b<sumArr.length; b++)
            {
                if(sumArr[a]==sumArr[b]) return false;
            }
        }
        
        return true;
    }
}
