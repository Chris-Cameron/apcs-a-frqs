
/**
 * Tests the diverse array class
 *
 * @Christopher Cameron
 * @v1
 */
public class DiverseArrayTester
{
    /** 
     * Tests the methods in Diverse Array using sample one-dimensional and two-dimensional arrays
     */
    public static void main(String[] args)
    {
        int[] arr1 = {1,3,2,7,3};
        int[][] mat1 = {{1,3,2,7,3},
                        {10,10,4,6,2},
                        {5,3,5,9,6},
                        {7,6,4,2,1}};
        int[][] mat2 = {{1,1,5,3,4},
                        {12,7,6,1,9},
                        {8,11,10,2,5},
                        {3,2,3,0,6}};
                        
        
        System.out.println(DiverseArray.arraySum(arr1));
        
        System.out.print("{ ");
        for (int i: DiverseArray.rowSums(mat1))
        {
            System.out.print(i + " ");
        }
        System.out.println("}");
        
        System.out.print("{ ");
        for (int i: DiverseArray.rowSums(mat2))
        {
            System.out.print(i + " ");
        }
        System.out.println("}");
        
        if(DiverseArray.isDiverse(mat1)) System.out.println("true");
        else System.out.println("false");
        if(DiverseArray.isDiverse(mat2)) System.out.println("true");
        else System.out.println("false");
        
        
    }
}
