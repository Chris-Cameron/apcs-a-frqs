/**
 * Performs actions involving cats
 *
 * @Christopher Cameron
 * @v1
 */
public class Cat extends Pet
{
    /** 
     * Constructs a Cat object based on the pet object
     * 
     * @param name the name of the cat
     */
    public Cat(String name)
    {
        super(name);
    }
    
    /**
     * Returns the sound the cat makes
     * 
     * @return the sound the cat makes
     */
    public String speak()
    {
        return "meow";
    }
}
