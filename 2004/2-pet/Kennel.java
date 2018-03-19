import java.util.ArrayList;
/**
 * Performs actions involving all pets
 *
 * @Christopher Cameron
 * @v1
 */
public class Kennel
{
    /** All elements are references to pet objects */
    private ArrayList<Pet> petList; 
    
    /**
     * Constructs a Kennel given a list of pets
     * 
     * @param the list of Pets 
     */
    public Kennel (ArrayList <Pet> petList)
    {
        this.petList = petList;
    }
    
    /** 
     * For each Pet in the kennel,
     * its name followed by the result of a call to its speak method
     * has been printed, one line per Pet
     */
    public void allSpeak()
    {
        for(Pet p: petList)
        {
            System.out.print(p.getName() + " ");
            System.out.println(p.speak());
        }
    }
}
