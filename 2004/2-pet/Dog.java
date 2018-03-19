/**
 * Performs actions involving dogs
 *
 * @Christopher Cameron
 * @v1
 */
public class Dog extends Pet
{
    /** 
     * Constructs a Dog object based on the pet object
     * 
     * @param name the name of the dog
     */
    public Dog(String name)
    {
        super(name);
    }
    
    /**
     * Returns the sound the dog makes
     * 
     * @return the sound the dog makes
     */
    public String speak()
    {
        return "bark";
    }
}