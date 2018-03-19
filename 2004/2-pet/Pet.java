/**
 * Abstract class for pet objects
 *
 * @Christopher Cameron
 * @v1
 */
public abstract class Pet
{
    /** Stores the name of a pet */
    private String myName;
    
    /** 
     * Constructor for a Pet object
     * 
     * @param name the name of the pet
     */
    public Pet(String name)
    {
        myName = name;
    }
    
    /**
     * Returns the name of a pet
     * 
     * @return myName the name of the pet
     */
    public String getName()
    {
        return myName;
    }
    
    /** Stores the sound a pet makes */
    public abstract String speak();
}
