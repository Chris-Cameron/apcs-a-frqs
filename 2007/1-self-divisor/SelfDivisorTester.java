import java.util.Arrays;

/**
 * Tests the SelfDivisor class
 *
 * @Christopher Cameron
 * @Nov. 20, 2017
 */
public class SelfDivisorTester
{
    /** Tests the SelfDivisor class using various examples
     * 
     */
    public static void main(String[]args)
    {
        System.out.println(SelfDivisor.isSelfDivisor(128));
        System.out.println(SelfDivisor.isSelfDivisor(26));
        System.out.println(SelfDivisor.isSelfDivisor(10));
        System.out.println(Arrays.toString(SelfDivisor.firstNumSelfDivisors(10, 3)));
        System.out.println(Arrays.toString(SelfDivisor.firstNumSelfDivisors(1,100)));
    }
}
