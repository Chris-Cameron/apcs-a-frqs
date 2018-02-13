/**
 * Creates a NumberCube object
 *
 * @Christopher Cameron
 * @v1
 */
public class NumberCube
{
    private int value;
    
    /** Constructs a NumberCube
     */
    public NumberCube()
    {
        value = 0;
    }
    
    /** Chooses a number between 1 and 6, inclusive
     * @return an integer value between 1 and 6, inclusive
     */
    public int toss()
    {
        value = (int)(Math.random()*6)+1;
        return value;
    }
}
