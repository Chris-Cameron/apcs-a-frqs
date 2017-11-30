import java.util.Arrays;
/**
 * Limits the volume of, and removes the beginning silence of a sound.
 *
 * @Christopher Cameron
 * @Nov. 20, 2017
 */
public class Sound
{
    
    /**the array of values in this sound, guaranteed not to be null
     * @param samples the array to be passed in
     */
    private int[] samples;
    
    /** Creates an array of integers representing the amplitudes of sounds
     * 
     */
    public Sound(int[] samples)
    {
        this.samples = samples;
    }
    
    /** Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit
     * Values less than -limit are changed to -limit
     * @param limit the amplitude limit
     *      Precondition: limit >= 0
     * @return the number of values in this sound that this method changed.
     */
    public int limitAmplitude(int limit)
    {
        int numChanged = 0;
        
        for(int i=0;i<samples.length;i++)
        {
            if(samples[i] < -limit)
            {
                samples[i] = -limit;
                numChanged++;
            }
            else if(samples [i] > limit)
            {
                samples [i] = limit;
                numChanged++;
            }            
        }
        
        return numChanged;    
    }
    
    /**Removes all silence from the beginning of this sound.
     * Silence is representedby a value of 0.
     * Precondition: samples contains at least one nonzero value
     * Postcondition: the length of samples reflects the removal of starting silence.
     */
    public void trimSilenceFromBeginning()
    {
        int numZeroes = 0;
        
        for(int i=0;samples[i]==0;i++)
        {
            numZeroes++;
        }
        
        int[] silenceFree = new int[samples.length-numZeroes];
        
        for(int i=0;i<silenceFree.length;i++)
        {
            silenceFree[i] = samples[i+numZeroes];
        }
        
        samples = silenceFree;
    }
    
    /** Prints the array of sound amplitudes
     * 
     */
    public void printArray()
    {
       System.out.println(Arrays.toString(samples)); 
    }

}   

