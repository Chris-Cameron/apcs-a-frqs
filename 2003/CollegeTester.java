
/**
 * Tests the college and collegegroup classes
 *
 * @Christopher Cameron
 * @version 1
 */
public class CollegeTester
{
    
    public static void main(String[] args)
    {
        College[] collegeList = new College[7];
        
        collegeList[0] = new College("Colgate University","Northeast",27025);
        collegeList[1] = new College("Duke University","Southeast",26000);
        collegeList[2] = new College("Kalamazoo College","Midwest",19764);
        collegeList[3] = new College("Stanford University","West",25917);
        collegeList[4] = new College("Florida International University","Southeast",10800);
        collegeList[5] = new College("Dartmouth College","Northeast",27764);
        collegeList[6] = new College("Spellman College","Southeast",11455);
        
        CollegeGroup group = new CollegeGroup(collegeList);
        
        group.updateTuition("Duke University",49241);
        group.printList(collegeList);
        
        System.out.println("");
        
        group.printList(group.getCollegeList("Southeast",10000,20000));
    }
    
}
