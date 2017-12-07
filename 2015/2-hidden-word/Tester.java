
/**
 * Tests a guessing game
 *
 * @Christopher Cameron
 * @version 1
 */
public class Tester
{
    /** Tests the HiddenWord class
     * 
     */
    public static void main(String[] args)
    {
       HiddenWord puzzle = new HiddenWord("HARPS");
       
       System.out.println(puzzle.getHint("AAAAA"));
       System.out.println(puzzle.getHint("HELLO"));
       System.out.println(puzzle.getHint("HEART"));
       System.out.println(puzzle.getHint("HARMS"));
       System.out.println(puzzle.getHint("HARPS"));
       
       
       System.out.println("");
       
       HiddenWord puzzle2 = new HiddenWord("APRIL");
       
       System.out.println(puzzle2.getHint("HELLO"));
       System.out.println(puzzle2.getHint("LATCH"));
       System.out.println(puzzle2.getHint("TAILS"));
       System.out.println(puzzle2.getHint("SNAIL"));
       System.out.println(puzzle2.getHint("ANVIL"));
       System.out.println(puzzle2.getHint("APRIL"));
    }
    
}
