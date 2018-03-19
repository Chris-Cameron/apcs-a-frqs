import java.util.ArrayList;
/**
 * Tests the Pet class and the classes that extend it
 *
 * @Christopher Cameron
 * @v1
 */
public class PetTester
{
    /** Tests the pet class*/
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Woofer");
        Cat c1 = new Cat("SmallTiger");
        LoudDog l1 = new LoudDog("SubWoofer");
       
        ArrayList petArr = new ArrayList<Pet>();
        petArr.add(d1);
        petArr.add(c1);
        petArr.add(l1);
        
        Kennel k1 = new Kennel(petArr);
        k1.allSpeak();
    }
}
