import java.util.ArrayList;

/**
 * Stores and manipulates lists of words
 *
 * @Christopher Cameron
 * @v1
 */
public class WordList
{
    
    private ArrayList<String> myList; //Contains Strings made up of letters
    
    /**
    * Constructs a WordList given an ArrayList of Strings
    * 
    * @param myList an ArrayList of Strings
    */
    public WordList(ArrayList<String> myList)
    {
        this.myList = myList;
    }
    
    /**
     * Returns the amount of words of a certain length
     * 
     * @param len the word length that is to be searched for
     * 
     * @return the amount of words that are len letters lonng
     */
    public int numWordsOfLength(int len)
    {
        int numWords = 0;
        
        for(String s: myList)
        {
            if(s.length()==len) numWords++;
        }
        
        return numWords;
    }
    
    /**
     * Removes all words of a certain length without altering the ArrayList's order
     * 
     * @param len the length of the words to be removed
     */
    public void removeWordsOfLength(int len)
    {
        for(int i = myList.size()-1; i>=0; i--)
        {
            if(myList.get(i).length()==len) myList.remove(i);
        }
    }
    
    /**
     * Converts myList into a string
     * 
     * @return myList as a string
     */
    public String toString()
    {
        String list = "";
        
        for(String s: myList)
        {
            list += s;
            list += " ";
        } 
        
        return list;
    }
}
