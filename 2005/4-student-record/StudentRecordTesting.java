
/**
 * Tests Student Record
 *
 * @Chris Cameron
 * @Nov.14,2017
 */

public class StudentRecordTesting
{
    
  /** Prints the average of each student's scores, unless the scores constantly improve, in which case only the second half is used
  * 
  */
    
      public static void main(String[] args)
      {
          
       int[] scores1 = {50,50,20,80,53};
       int[] scores2 = {20,50,50,53,80};
       int[] scores3 = {20,50,50,80};
       
       StudentRecord r1 = new StudentRecord(scores1);
       StudentRecord r2 = new StudentRecord(scores2);
       StudentRecord r3 = new StudentRecord(scores3);
      
       System.out.println(r1.finalAverage());
       System.out.println(r2.finalAverage());
       System.out.println(r3.finalAverage());
      }
  
}
