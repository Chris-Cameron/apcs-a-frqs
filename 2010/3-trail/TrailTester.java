
/**
 * Tests the Trail Class
 *
 * @Christopher Cameron
 * @Nov.20, 2017
 */

import java.util.Arrays;

public class TrailTester
{
    
    /** Tests the trail class using various arrays.
     */
    public static void main(String args[])
    {
       int[] markers1 = {100,150,105,120,90,80,50,75,75,70,80,90,100};
       int[] markers2 = {33,44,99,88,77,66,55};

       Trail t1 = new Trail(markers1);
       Trail t2 = new Trail(markers2);
       
       System.out.println(t1.isLevelTrailSegment(7,9));
       System.out.println(t2.isLevelTrailSegment(2,4));
       System.out.println(t1.isDifficult());
       System.out.println(t2.isDifficult());
    }
    
}


