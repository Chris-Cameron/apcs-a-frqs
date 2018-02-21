import java.util.ArrayList;
/**
 * Determines if the digits of a number are inincreasing order
 *
 * @Christopher Cameron
 * @v1
 */
public class Digits
{
    /** The list of digits from the number used to construct this object.
     *  The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;
    
    /** Constructs a Digits object that represents nums
     *  Precondition: num >= 0
     */
    public Digits (int num)
    {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        
        if(num == 0)
        {
            tempList.add(0);
        }
        else
        {
            while(num > 0)
            {
                int remainder = num % 10;
                tempList.add(0,remainder);
                num /= 10;
            }
        }
        
        digitList = tempList;
    }
    
    /** Returns true if the digits in this Digits object are in strictly increasing order;
     *          false otherwise.
     */
    public boolean isStrictlyIncreasing()
    {
        int prev = -1;
        
        for(int i: digitList)
        {
            if(i <= prev) return false;
            prev = i;
        }
        
        return true;
    }
}
