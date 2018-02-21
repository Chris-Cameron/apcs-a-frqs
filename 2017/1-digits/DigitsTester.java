
/**
 * Tests the digits class
 *
 * @Christopher Cameron
 * @v1
 */
public class DigitsTester
{
    /** Checks if the digits of a number are in increasing order
     */
    public static void main(String[] args)
    {
        if (new Digits(7).isStrictlyIncreasing()) System.out.println("true");
        else System.out.println("false");

        if (new Digits(1356).isStrictlyIncreasing()) System.out.println("true");
        else System.out.println("false");
        
        if (new Digits(1336).isStrictlyIncreasing()) System.out.println("true");
        else System.out.println("false");
        
        if (new Digits(1536).isStrictlyIncreasing()) System.out.println("true");
        else System.out.println("false");
        
        if (new Digits(65310).isStrictlyIncreasing()) System.out.println("true");
        else System.out.println("false");
    }
}
