import java.util.ArrayList;

/**
 * Obtains the score of a student's test.
 *
 * @Christopher Cameron
 * @v1
 */
public class StudentAnswerSheet
{
    private String studentName;
    private ArrayList<String> answers;

    /** constructs a StudentAnswerSheet object given the name and the list of answers
     * 
     * @param studentName the name of the student
     * @param answers the list of answers
    */
    public StudentAnswerSheet(String studentName, ArrayList<String> answers)
    {
        this.studentName = studentName;
        this.answers = answers;
    }
   
    /** @param key the list of correct answers, represented as strings of length one
     *      Precondition: key.size() is equal to the number of answers in this answer sheet
     *  @return this students test score
     */
    public double getScore(ArrayList<String> key)
    {
        double score = 0;
        
        for(int i = 0;i<key.size();i++)
        {
            String keyAns = key.get(i);
            String trueAns = answers.get(i);
            
            if(keyAns.equals(trueAns)) score += 1;
            else if(answers.equals("?")) score += 0;
            else score -= 0.25;
        }
        
        return score;
    }
    
    /** @return the name of the student
     */
    public String getName ()
    {
        return studentName;
    }
}
