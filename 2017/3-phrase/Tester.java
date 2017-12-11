
/**
 * Tests the phrase class.
 *
 * @Christopher Cameron
 * @version 1
 */
public class Tester
{
  
    /**
     *  Tests the functions of the phrase class
     */
    public static void main(String[] args)
    {
        Phrase phrase1 = new Phrase("A cat ate late.");
        Phrase phrase2 = new Phrase ("aaaa");
        
        
        
        
        Phrase phrase3 = new Phrase(phrase1.toString());
        phrase3.replaceNthOccurrence ("at", 1, "rane");
        System.out.println(phrase3);
        
        phrase3 = phrase1;
        phrase3.replaceNthOccurrence ("at", 6, "xx");
        System.out.println(phrase3);
        
        phrase3 = phrase1;
        phrase3.replaceNthOccurrence ("bat", 2, "xx");
        System.out.println(phrase3);
        
        phrase3 = phrase2;
        phrase3.replaceNthOccurrence ("aa", 1, "xx");
        System.out.println(phrase3);
        
        phrase3 = phrase1;
        phrase3.replaceNthOccurrence ("at", 3, "oof");
        System.out.println(phrase3);
        
        System.out.println("");
        
        
        System.out.println(phrase1.findLastOccurrence("at"));
        System.out.println(phrase1.findLastOccurrence("cat"));
        System.out.println(phrase1.findLastOccurrence("bat"));
        
    }
    
}
