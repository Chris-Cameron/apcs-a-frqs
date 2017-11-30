





/**
 * Tests the Sound class
 *
 * @Christopher Cameron
 * @Nov.20, 2017
 */

import java.util.Arrays;

public class SoundTester
{  
    
    public static void main(String args[])
    {
        
       int[] samples1 = {40,2532,17,-2300,-17,-4000,2000,1048,-420,33,15,-32,2030,3223};
       int[] samples2 = {0,0,0,0,-14,0,-35,-39,0,-7,16,32,37,29,0,0};

       Sound r1 = new Sound(samples1);
       Sound r2 = new Sound(samples2);
       
       r1.limitAmplitude(2000);
       r1.printArray();
       r2.trimSilenceFromBeginning();
       r2.printArray();
       
    }
      
}

