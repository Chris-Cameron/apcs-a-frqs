
/**
 * Facilitates a guessing game
 *
 * @Christopher Cameron
 * @version 1
 */
public class HiddenWord
{
    
    private String word;
    
    /** Creates a HiddenWord object (a word used in a guessing game)
     * @param word the word to be guessed
     */
    public HiddenWord(String word)
    {
        this.word = word;
    }
    
    /** Gives a hint based on the word inputted
     * @param guess the word to base the hint of off
     * @return hint the hint determined
     */
    public String getHint(String guess)
    {
        String hint = "";
        
        for(int i=0;i<guess.length();i++)
        {
            if(guess.charAt(i)==word.charAt(i))
            {
                hint += guess.substring(i,i+1);
            }
            else if(word.contains(guess.substring(i,i+1)))
            {
                hint += "+";
            }
            else
            {
                hint += "*";
            }
        }
        
        return hint;
        
    }
    
}
