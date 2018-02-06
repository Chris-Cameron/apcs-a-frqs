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
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("mouse");
        animals.add("frog");
        animals.add("dog");
        animals.add("dog");
        
        WordList w1 = new WordList(animals);
        
        System.out.println(w1.numWordsOfLength(4));
        System.out.println(w1.numWordsOfLength(3));
        System.out.println(w1.numWordsOfLength(2));
        
        w1.removeWordsOfLength(4);
        System.out.println(w1);
        w1.removeWordsOfLength(3);
        System.out.println(w1);
    }
}
