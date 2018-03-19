/**
 * Performs actions involving loud dogs
 *
 * @Christopher Cameron
 * @v1
 */
public class LoudDog extends Dog
{
    /** 
     * Constructs a LoudDog object based on the pet object
     * 
     * @param name the name of the loud dog
     */
    public LoudDog(String name)
    {
        super(name);
    }
    
    /**
     * Returns the sound the loud dog makes
     * 
     * @return the sound the loud dog makes
     */
    public String speak()
    {
        return super.speak() + " " + super.speak();
    }

}
