import java.util.ArrayList;

/**
 * Tests WordList
 *
 * @Christopher Cameron
 * @v1
 */
public class WordListTester
{
    
    /**
     * Tests the WordList class
     */
    public static void main(String[]args)
    {
        ArrayList<String> organisms = new ArrayList<String>();
        organisms.add("cat");
        organisms.add("mouse");
        organisms.add("frog");
        organisms.add("dog");
        organisms.add("dog");
        
        WordList animals = new WordList(organisms);
        
        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));
        
        animals.removeWordsOfLength(4);
        System.out.println(animals);
        animals.removeWordsOfLength(3);
        System.out.println(animals);
    }
}
