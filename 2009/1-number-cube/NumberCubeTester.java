
/**
 * Test the NumberCube and NumberCubeRunner
 *
 * @Christopher Cameron
 * @v1
 */
public class NumberCubeTester
{
    public static void main(String[]args)
    {
        NumberCube n1 = new NumberCube();
        
        int[] tosses = NumberCubeRunner.getCubeTosses(n1, 10);
        NumberCubeRunner.printTosses(tosses);
        System.out.println();
        int[] tosses2 = NumberCubeRunner.getCubeTosses(n1,10);
        NumberCubeRunner.printTosses(tosses2);
        System.out.println();
        
        int[]runSample = {1,5,5,4,3,1,2,2,2,2,6,1,3,3,5,5,5,5};
        int longestRun = NumberCubeRunner.getLongestRun(runSample);
        System.out.println(longestRun);

        int[]runSample2 = {6,3,4,2,1,1,1,1,5,4,3,3,3,3,3,3,2,6,1,4,4};
        int longestRun2 = NumberCubeRunner.getLongestRun(runSample2);
        System.out.println(longestRun2);
        
        int[]runSample3 = {2,2,2,2,2,6,1};
        int longestRun3 = NumberCubeRunner.getLongestRun(runSample3);
        System.out.println(longestRun3);
        
        int[]runSample4 = {1,2,3,4,5,6};
        int longestRun4 = NumberCubeRunner.getLongestRun(runSample4);
        System.out.println(longestRun4);        
    }
}
