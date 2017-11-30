
/**
 * Determies whether every digit of a number is its divisor,
 * and finds these numbers
 *
 * @Christopher Cameron
 * @Nov.20, 2017
 */
public class SelfDivisor
{
    
    /** @param number the number to be tested
     *      Precondition: number > 0
     *  @return true if every decimal digit of number is a divisor of number;
     *          false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        int temp = number;
        
        while(temp >= 1)
        {
            if(temp%10==0 || number%(temp%10)!=0)
            {
                return false;
            }
            else
            {
                temp = temp/10;
            }
            
        }
        
        return true;
    }
    
    /** @param start starting point for values to be checked
     *      Precondition: start > 0
     *  @param num the size of the array to be returned
     *      Precondition: num > 0
     *  @return an array contains the first num integers > start that are self-divisors
     */
    public static int[] firstNumSelfDivisors(int start, int num)
    {
        int numDivisors = 0;
        int[] selfDivisors = new int[num];
        int i = start;
        
        while(numDivisors<num)
        {
            if(isSelfDivisor(i))
            {
                selfDivisors[numDivisors]=i;
                numDivisors++;
            }
            
            i++;
        }
        
        return selfDivisors;
    }
    
}

