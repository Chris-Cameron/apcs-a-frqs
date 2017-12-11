
/**
 * Searches for and modifieds various phrases within a string
 *
 * @Christopher Cameron
 * @version 1
 */
public class Phrase
{
    
    private String currentPhrase;
    
    /**
     * Constructs a new Phrase object.
     */
    public Phrase(String p)
    {
        currentPhrase = p;
    }
    
    /** Returns the index of the nth occurence of str in the current phrase;
     * returns -1 if the nth occurrence does not exist.
     * Precondition: str.length() > 0 and n > 0
     * Postcondition: the current phrase is not modified
     */
    public int findNthOccurrence(String str, int n)
    {
        int min = 0;
        int occurrence = -1;
        
        for(int i=0;i<n;i++)
        {
            for(int a=min; a<currentPhrase.length()-str.length()+1;a++)
            {
                if(str.equals(currentPhrase.substring(a,a+str.length())))
                {
                    occurrence = a;
                    min = a + 1;
                    break;
                }
                else
                {
                    occurrence = -1;
                }
            }
        }
        
        return occurrence;
    }
    
    /** Modifies the current phrase by replacing the nth occurence of str with repl.
     * If the nth occurence does not exist, the current phrase is unchanged
     * Precondition: str.length() > 0 and n > 0
     */  
    public void replaceNthOccurrence (String str, int n, String repl)
    {
       int start = findNthOccurrence(str, n);
       
       if(start != -1)
       {
           int end = start + str.length();
           String temp = currentPhrase.substring(0,start) +
           repl +
           currentPhrase.substring(end,currentPhrase.length());
           currentPhrase = temp;
       }
    }
    
    /** Returns the index ofthe last occurence of str in the current phrase;
     * returns -1 if str is not found.
     * Precondition: str.length() > 0
     * Postcondition: the current phrase is not modified
     */
    public int findLastOccurrence(String str)
    {
        int temp = -1;
        
        for(int i=1;i<str.length();i++)
        {
            int occur = findNthOccurrence(str,i);
            
            if(occur == -1)
            {
                return temp;
            }
            else
            {
                temp = occur;
            }
        }
        
        return temp;
    }
    
    /**
     * Returns a string containing the current phrase.
     */
    public String toString()
    {
        return currentPhrase;
    }
    
}
