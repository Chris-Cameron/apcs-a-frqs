import java.util.ArrayList;
/**
 * Tests the StudentAnswerSheet and TestResults classes
 * 
 * @Christopher Cameron
 * @v1
 */
public class ScoreTester
{
    /** Tests the StudentAnswerSheet and TestResults classes 
     */
    public static void main(String[] args)
    {
        // Key for the test
        ArrayList<String> key = new ArrayList<String>();
        key.add("A");
        key.add("C");
        key.add("D");
        key.add("E");
        key.add("B");
        key.add("C");
        key.add("E");
        key.add("B");
        key.add("B");
        key.add("C");
        
        // Student Responses
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("A");
        s1.add("B");
        s1.add("D");
        s1.add("E");
        s1.add("A");
        s1.add("C");
        s1.add("?");
        s1.add("B");
        s1.add("D");
        s1.add("C");
        StudentAnswerSheet a1 = new StudentAnswerSheet("Alice", s1); 
        
        ArrayList<String> s2 = new ArrayList<String>();
        s2.add("D");
        s2.add("?");
        s2.add("D");
        s2.add("E");
        s2.add("B");
        s2.add("C");
        s2.add("E");
        s2.add("?");
        s2.add("B");
        s2.add("C");
        StudentAnswerSheet a2 = new StudentAnswerSheet("Betty", s2); 
        
        ArrayList<String> s3 = new ArrayList<String>();
        s3.add("A");
        s3.add("C");
        s3.add("D");
        s3.add("E");
        s3.add("B");
        s3.add("C");
        s3.add("E");
        s3.add("B");
        s3.add("B");
        s3.add("C");
        StudentAnswerSheet a3 = new StudentAnswerSheet("Calvin", s3); 
        
        ArrayList<String> s4 = new ArrayList<String>();
        s4.add("A");
        s4.add("B");
        s4.add("C");
        s4.add("D");
        s4.add("A");
        s4.add("B");
        s4.add("C");
        s4.add("D");
        s4.add("?");
        s4.add("?");
        StudentAnswerSheet a4 = new StudentAnswerSheet("David", s4);     
        
        ArrayList<String> s5 = new ArrayList<String>();
        s5.add("B");
        s5.add("B");
        s5.add("B");
        s5.add("B");
        s5.add("B");
        s5.add("B");
        s5.add("B");
        s5.add("B");
        s5.add("B");
        s5.add("B");
        StudentAnswerSheet a5 = new StudentAnswerSheet("Ethan", s5);   
        
        //Prints the test scores
        System.out.println(a1.getScore(key));
        System.out.println(a2.getScore(key));
        System.out.println(a3.getScore(key));
        System.out.println(a4.getScore(key));
        System.out.println(a5.getScore(key));
        System.out.println();
        
        //Testing for Part B below
        
        //Creates a list of tests
        ArrayList<StudentAnswerSheet> as1 = new ArrayList<StudentAnswerSheet>();
        as1.add(a1);
        as1.add(a2);
        as1.add(a3);
        as1.add(a4);
        as1.add(a5);
        TestResults t1 = new TestResults(as1);
        
        //Prints the student with the best score
        System.out.println(t1.highestScoringStudent(key));
    }
}
