import java.util.ArrayList;

/**
 * Determines the highest scoring student in a class
 *
 * @Christopher Cameron
 * @v1
 */
public class TestResults
{
    private ArrayList<StudentAnswerSheet> sheets;
    
    /** constructs a TestResults object given a list of answer sheets
     * 
     * @param sheets the list of student answer sheets
     */
    public TestResults(ArrayList<StudentAnswerSheet> sheets)
    {
        this.sheets = sheets;
    }
    
    /** Precondition: sheets.size() > 0;
     *                all answer sheets in sheets have the same number of answers
     *  @param key the list of correct answers represented as strings of length one
     *         Precondition: key.size() is equal to the number of answers
     *                       in each of the answer sheets in sheets
     *  @return the name of the student with the highest sccore
     */
    public String highestScoringStudent (ArrayList<String> key)
    {
        double highScore = sheets.get(0).getScore(key);
        String studentName = "";

        for(StudentAnswerSheet s: sheets)
        {
            if(s.getScore(key) > highScore)
            {
                highScore = s.getScore(key);
                studentName = s.getName();
            }
        }

        return studentName;
    }
}    
